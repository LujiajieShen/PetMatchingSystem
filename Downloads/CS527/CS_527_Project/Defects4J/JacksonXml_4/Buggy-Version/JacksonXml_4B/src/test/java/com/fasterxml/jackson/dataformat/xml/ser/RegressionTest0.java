package com.fasterxml.jackson.dataformat.xml.ser;

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
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature8 = null;
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray9 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] { feature8 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = xmlMapper5.enable(featureArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray9);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        byte[] byteArray6 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode7 = xmlMapper5.readTree(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: com.ctc.wstx.exc.WstxEOFException: Unexpected EOF in prolog? at [row,col {unknown-source}]: [1,0]");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        java.io.File file8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.TreeCodec treeCodec10 = xmlMapper5.readValue(file8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.core.type.TypeReference typeReference11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.Flushable flushable12 = objectMapper9.readValue("", typeReference11);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: com.ctc.wstx.exc.WstxEOFException: Unexpected EOF in prolog? at [row,col {unknown-source}]: [1,0]");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.setNodeFactory(jsonNodeFactory8);
        byte[] byteArray10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode11 = xmlMapper5.readTree(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(objectMapper9);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 10 };
        com.fasterxml.jackson.core.type.TypeReference typeReference11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory12 = xmlMapper5.readValue(byteArray10, typeReference11);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: com.ctc.wstx.exc.WstxUnexpectedCharException: Illegal character ((CTRL-CHAR, code 1))? at [row,col {unknown-source}]: [1,1]");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 1, 100, 10]");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper11 = objectMapper9.enable(deserializationFeature10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter11 = objectMapper9.writerFor(javaType10);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper14 = objectMapper9.configure(feature12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectWriter11);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.setNodeFactory(jsonNodeFactory8);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider10 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper11 = xmlMapper5.setFilterProvider(filterProvider10);
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 0, (byte) -1 };
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.Version version19 = xmlMapper5.readValue(byteArray15, (int) '#', (int) '4', javaType18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper11);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10, 0, -1]");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.setNodeFactory(jsonNodeFactory8);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider10 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper11 = xmlMapper5.setFilterProvider(filterProvider10);
        com.fasterxml.jackson.core.JsonParser jsonParser12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair> pairItor14 = xmlMapper5.readValues(jsonParser12, javaType13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper11);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.setNodeFactory(jsonNodeFactory8);
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory11 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory12 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory13 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec10, xMLInputFactory11, xMLOutputFactory12);
        com.fasterxml.jackson.core.JsonFactory jsonFactory15 = xmlFactory13.setRootValueSeparator("");
        java.io.DataOutput dataOutput16 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator17 = jsonFactory15.createGenerator(dataOutput16);
        com.fasterxml.jackson.core.TreeNode treeNode18 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlMapper5.writeTree(jsonGenerator17, treeNode18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(jsonFactory15);
        org.junit.Assert.assertNotNull(jsonGenerator17);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper9.disableDefaultTyping();
        com.fasterxml.jackson.core.JsonParser.Feature feature11 = null;
        com.fasterxml.jackson.core.JsonParser.Feature[] featureArray12 = new com.fasterxml.jackson.core.JsonParser.Feature[] { feature11 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper13 = objectMapper10.enable(featureArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(featureArray12);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.setNodeFactory(jsonNodeFactory8);
        java.io.Writer writer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            objectMapper9.writeValue(writer10, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null Writer is not a valid argument");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(objectMapper9);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper9.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig11 = objectMapper9.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializationFeature serializationFeature12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectWriter objectWriter13 = objectMapper9.writer(serializationFeature12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(serializationConfig11);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.SerializationFeature serializationFeature10 = null;
        com.fasterxml.jackson.databind.SerializationFeature[] serializationFeatureArray11 = new com.fasterxml.jackson.databind.SerializationFeature[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectWriter objectWriter12 = xmlMapper5.writer(serializationFeature10, serializationFeatureArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(serializationFeatureArray11);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature10 = null;
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray11 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] { feature10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper12 = xmlMapper5.enable(featureArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(featureArray11);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = xmlMapper5.isEnabled(deserializationFeature8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        java.util.TimeZone timeZone10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper11 = objectMapper9.setTimeZone(timeZone10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper9.disableDefaultTyping();
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter12 = objectMapper10.writerWithType(javaType11);
        com.fasterxml.jackson.core.JsonParser jsonParser13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.DatabindContext databindContext15 = objectMapper10.readValue(jsonParser13, javaType14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(objectWriter12);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter8 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.setDefaultPrettyPrinter(prettyPrinter8);
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory11 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory12 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory13 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec10, xMLInputFactory11, xMLOutputFactory12);
        com.fasterxml.jackson.core.JsonFactory jsonFactory15 = xmlFactory13.setRootValueSeparator("");
        java.io.DataOutput dataOutput16 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator17 = jsonFactory15.createGenerator(dataOutput16);
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = null;
        // The following exception was thrown during execution in test generation
        try {
            objectMapper9.writeTree(jsonGenerator17, jsonNode18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(jsonFactory15);
        org.junit.Assert.assertNotNull(jsonGenerator17);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = xmlMapper5.getDeserializationContext();
        com.fasterxml.jackson.core.Version version11 = xmlMapper5.version();
        java.io.InputStream inputStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode13 = xmlMapper5.readTree(inputStream12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null InputStream is not a valid argument");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(deserializationContext10);
        org.junit.Assert.assertNotNull(version11);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.fasterxml.jackson.dataformat.xml.ser.XmlBeanSerializerBase xmlBeanSerializerBase0 = null;
        com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter objectIdWriter1 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory3 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory4 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec2, xMLInputFactory3, xMLOutputFactory4);
        com.fasterxml.jackson.core.Version version6 = xmlFactory5.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper7 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory5);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes8 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter9 = xmlMapper7.writer(characterEscapes8);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray10 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper11 = xmlMapper7.disable(featureArray10);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper12 = objectMapper11.disableDefaultTyping();
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter14 = objectMapper12.writerWithType(javaType13);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.XmlBeanSerializer xmlBeanSerializer15 = new com.fasterxml.jackson.dataformat.xml.ser.XmlBeanSerializer(xmlBeanSerializerBase0, objectIdWriter1, (java.lang.Object) objectMapper12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNotNull(objectWriter9);
        org.junit.Assert.assertNotNull(featureArray10);
        org.junit.Assert.assertNotNull(objectMapper11);
        org.junit.Assert.assertNotNull(objectMapper12);
        org.junit.Assert.assertNotNull(objectWriter14);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = xmlMapper5.getDeserializationContext();
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory12 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory13 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory14 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec11, xMLInputFactory12, xMLOutputFactory13);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature15 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory16 = xmlFactory14.disable(feature15);
        com.fasterxml.jackson.core.Version version17 = xmlFactory16.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass18 = xmlFactory16.getFormatReadFeatureType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType19 = deserializationContext10.constructType((java.lang.reflect.Type) featureClass18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(deserializationContext10);
        org.junit.Assert.assertTrue("'" + feature15 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature15.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory16);
        org.junit.Assert.assertNotNull(version17);
        org.junit.Assert.assertNotNull(featureClass18);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = xmlMapper5.getDeserializationContext();
        com.fasterxml.jackson.dataformat.xml.util.AnnotationUtil annotationUtil11 = new com.fasterxml.jackson.dataformat.xml.util.AnnotationUtil();
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory13 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory14 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory15 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec12, xMLInputFactory13, xMLOutputFactory14);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature16 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory17 = xmlFactory15.disable(feature16);
        com.fasterxml.jackson.core.Version version18 = xmlFactory17.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass19 = xmlFactory17.getFormatReadFeatureType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature feature20 = xmlMapper5.convertValue((java.lang.Object) annotationUtil11, featureClass19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No serializer found for class com.fasterxml.jackson.dataformat.xml.util.AnnotationUtil and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(deserializationContext10);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature16.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory17);
        org.junit.Assert.assertNotNull(version18);
        org.junit.Assert.assertNotNull(featureClass19);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping6 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper8 = xmlMapper5.enableDefaultTypingAsProperty(defaultTyping6, "XML");
        java.io.Writer writer9 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector10 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector11 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair12 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector10, annotationIntrospector11);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector13 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector14 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair15 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector13, annotationIntrospector14);
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair16 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair((com.fasterxml.jackson.databind.AnnotationIntrospector) pair12, (com.fasterxml.jackson.databind.AnnotationIntrospector) pair15);
        // The following exception was thrown during execution in test generation
        try {
            xmlMapper5.writeValue(writer9, (java.lang.Object) pair16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null Writer is not a valid argument");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectMapper8);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.setNodeFactory(jsonNodeFactory8);
        com.fasterxml.jackson.core.type.TypeReference typeReference11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature12 = objectMapper9.readValue("xmlInfo", typeReference11);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: com.ctc.wstx.exc.WstxUnexpectedCharException: Unexpected character 'x' (code 120) in prolog; expected '<'? at [row,col {unknown-source}]: [1,1]");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(objectMapper9);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory4 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory5 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory6 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec3, xMLInputFactory4, xMLOutputFactory5);
        com.fasterxml.jackson.core.Version version7 = xmlFactory6.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper8 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory6);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes9 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter10 = xmlMapper8.writer(characterEscapes9);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray11 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper12 = xmlMapper8.disable(featureArray11);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper13 = objectMapper12.disableDefaultTyping();
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter15 = objectMapper13.writerWithType(javaType14);
        javax.xml.stream.XMLStreamReader xMLStreamReader16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser17 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) -1, 1, (com.fasterxml.jackson.core.ObjectCodec) objectMapper13, xMLStreamReader16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version7);
        org.junit.Assert.assertNotNull(objectWriter10);
        org.junit.Assert.assertNotNull(featureArray11);
        org.junit.Assert.assertNotNull(objectMapper12);
        org.junit.Assert.assertNotNull(objectMapper13);
        org.junit.Assert.assertNotNull(objectWriter15);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        javax.xml.stream.XMLInputFactory xMLInputFactory0 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory1 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper2 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory0, xMLOutputFactory1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory4 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory5 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory6 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec3, xMLInputFactory4, xMLOutputFactory5);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader7 = xmlMapper2.readerForUpdating((java.lang.Object) xMLOutputFactory5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory4 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory5 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory6 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec3, xMLInputFactory4, xMLOutputFactory5);
        com.fasterxml.jackson.core.Version version7 = xmlFactory6.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper8 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory6);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes9 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter10 = xmlMapper8.writer(characterEscapes9);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray11 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper12 = xmlMapper8.disable(featureArray11);
        javax.xml.stream.XMLStreamReader xMLStreamReader13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser14 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 0, (int) 'a', (com.fasterxml.jackson.core.ObjectCodec) xmlMapper8, xMLStreamReader13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version7);
        org.junit.Assert.assertNotNull(objectWriter10);
        org.junit.Assert.assertNotNull(featureArray11);
        org.junit.Assert.assertNotNull(objectMapper12);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.setNodeFactory(jsonNodeFactory8);
        com.fasterxml.jackson.databind.Module[] moduleArray10 = new com.fasterxml.jackson.databind.Module[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper11 = objectMapper9.registerModules(moduleArray10);
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> throwableAtomicReference13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = objectMapper11.canDeserialize(javaType12, throwableAtomicReference13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(moduleArray10);
        org.junit.Assert.assertNotNull(objectMapper11);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider8 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter9 = xmlMapper5.writer(filterProvider8);
        com.fasterxml.jackson.databind.cfg.ContextAttributes contextAttributes10 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter11 = xmlMapper5.writer(contextAttributes10);
        java.io.DataInput dataInput12 = null;
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature feature14 = xmlMapper5.readValue(dataInput12, featureClass13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: InputData source not (yet?) support for this format (XML)");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(objectWriter9);
        org.junit.Assert.assertNotNull(objectWriter11);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = xmlFactory3.setRootValueSeparator("");
        java.io.DataOutput dataOutput6 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator7 = jsonFactory5.createGenerator(dataOutput6);
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory9 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory10 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory11 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec8, xMLInputFactory9, xMLOutputFactory10);
        com.fasterxml.jackson.core.Version version12 = xmlFactory11.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper13 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory11);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes14 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter15 = xmlMapper13.writer(characterEscapes14);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory16 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper17 = xmlMapper13.setNodeFactory(jsonNodeFactory16);
        java.lang.String str19 = objectMapper17.writeValueAsString((java.lang.Object) "XML");
        // The following exception was thrown during execution in test generation
        try {
            jsonGenerator7.writeObjectRef((java.lang.Object) objectMapper17);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonGenerationException; message: No native support for writing Object Ids");
        } catch (com.fasterxml.jackson.core.JsonGenerationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(jsonGenerator7);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNotNull(objectWriter15);
        org.junit.Assert.assertNotNull(objectMapper17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<String>XML</String>" + "'", str19, "<String>XML</String>");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.setNodeFactory(jsonNodeFactory8);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider10 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper11 = xmlMapper5.setFilterProvider(filterProvider10);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = xmlMapper5.getDeserializationContext();
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper11);
        org.junit.Assert.assertNotNull(deserializationContext12);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper9.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig11 = objectMapper9.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = objectMapper9.getSerializerProviderInstance();
        java.util.Date date13 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory15 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory16 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory17 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec14, xMLInputFactory15, xMLOutputFactory16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = xmlFactory17.setRootValueSeparator("");
        java.io.DataOutput dataOutput20 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator21 = jsonFactory19.createGenerator(dataOutput20);
        // The following exception was thrown during execution in test generation
        try {
            serializerProvider12.defaultSerializeDateKey(date13, jsonGenerator21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(serializationConfig11);
        org.junit.Assert.assertNotNull(serializerProvider12);
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertNotNull(jsonGenerator21);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper10 = xmlMapper5.copy();
        com.fasterxml.jackson.core.JsonParser.Feature feature11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = xmlMapper5.isEnabled(feature11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(xmlMapper10);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider8 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter9 = xmlMapper5.writer(filterProvider8);
        com.fasterxml.jackson.databind.cfg.ContextAttributes contextAttributes10 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter11 = xmlMapper5.writer(contextAttributes10);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode13 = xmlMapper5.readTree("xmlInfo");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: com.ctc.wstx.exc.WstxUnexpectedCharException: Unexpected character 'x' (code 120) in prolog; expected '<'? at [row,col {unknown-source}]: [1,1]");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(objectWriter9);
        org.junit.Assert.assertNotNull(objectWriter11);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup xmlRootNameLookup0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory3 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory4 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec2, xMLInputFactory3, xMLOutputFactory4);
        com.fasterxml.jackson.core.Version version6 = xmlFactory5.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper7 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory5);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes8 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter9 = xmlMapper7.writer(characterEscapes8);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray10 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper11 = xmlMapper7.disable(featureArray10);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper12 = objectMapper11.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig13 = objectMapper11.getSerializationConfig();
        // The following exception was thrown during execution in test generation
        try {
            javax.xml.namespace.QName qName14 = xmlRootNameLookup0.findRootName(javaType1, (com.fasterxml.jackson.databind.cfg.MapperConfig<com.fasterxml.jackson.databind.SerializationConfig>) serializationConfig13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNotNull(objectWriter9);
        org.junit.Assert.assertNotNull(featureArray10);
        org.junit.Assert.assertNotNull(objectMapper11);
        org.junit.Assert.assertNotNull(objectMapper12);
        org.junit.Assert.assertNotNull(serializationConfig13);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper9.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig11 = objectMapper9.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = objectMapper9.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory14 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory15 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory16 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec13, xMLInputFactory14, xMLOutputFactory15);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature17 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory18 = xmlFactory16.disable(feature17);
        com.fasterxml.jackson.core.Version version19 = xmlFactory18.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass20 = xmlFactory18.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer21 = serializerProvider12.getUnknownTypeSerializer(featureClass20);
        java.util.TimeZone timeZone22 = serializerProvider12.getTimeZone();
        com.fasterxml.jackson.databind.MapperFeature mapperFeature23 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = serializerProvider12.isEnabled(mapperFeature23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(serializationConfig11);
        org.junit.Assert.assertNotNull(serializerProvider12);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature17.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory18);
        org.junit.Assert.assertNotNull(version19);
        org.junit.Assert.assertNotNull(featureClass20);
        org.junit.Assert.assertNotNull(objJsonSerializer21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        javax.xml.stream.XMLInputFactory xMLInputFactory0 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory1 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper2 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory0, xMLOutputFactory1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = xmlMapper2.getDeserializationContext();
        org.junit.Assert.assertNotNull(deserializationContext3);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping6 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper8 = xmlMapper5.enableDefaultTypingAsProperty(defaultTyping6, "XML");
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.core.type.ResolvedType resolvedType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.AutoCloseable autoCloseable11 = objectMapper8.readValue(jsonParser9, resolvedType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectMapper8);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.setNodeFactory(jsonNodeFactory8);
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory10 = new com.fasterxml.jackson.dataformat.xml.XmlFactory();
        com.fasterxml.jackson.databind.ObjectReader objectReader11 = xmlMapper5.readerForUpdating((java.lang.Object) xmlFactory10);
        com.fasterxml.jackson.core.type.TypeReference typeReference13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver mixInResolver14 = xmlMapper5.readValue("XML", typeReference13);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: com.ctc.wstx.exc.WstxUnexpectedCharException: Unexpected character 'X' (code 88) in prolog; expected '<'? at [row,col {unknown-source}]: [1,1]");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectReader11);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        int int10 = xmlMapper5.mixInCount();
        com.fasterxml.jackson.databind.InjectableValues injectableValues11 = xmlMapper5.getInjectableValues();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature12 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean14 = feature12.enabledIn((int) (byte) 10);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper15 = xmlMapper5.disable(feature12);
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter17 = objectMapper15.writerWithType(javaType16);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(injectableValues11);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature12.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objectMapper15);
        org.junit.Assert.assertNotNull(objectWriter17);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = xmlMapper5.getDeserializationContext();
        com.fasterxml.jackson.core.Version version11 = xmlMapper5.version();
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode19 = xmlMapper5.readTree(byteArray18);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: java.io.CharConversionException: Invalid UTF-8 start byte 0xff (at char #5, byte #-1)");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(deserializationContext10);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 0, 0, 100, -1, 100]");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper9.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig11 = objectMapper9.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = objectMapper9.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory14 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory15 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory16 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec13, xMLInputFactory14, xMLOutputFactory15);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature17 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory18 = xmlFactory16.disable(feature17);
        com.fasterxml.jackson.core.Version version19 = xmlFactory18.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass20 = xmlFactory18.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer21 = serializerProvider12.getUnknownTypeSerializer(featureClass20);
        java.util.TimeZone timeZone22 = serializerProvider12.getTimeZone();
        com.fasterxml.jackson.core.ObjectCodec objectCodec24 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory25 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory26 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory27 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec24, xMLInputFactory25, xMLOutputFactory26);
        com.fasterxml.jackson.core.Version version28 = xmlFactory27.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper29 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory27);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes30 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter31 = xmlMapper29.writer(characterEscapes30);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray32 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper33 = xmlMapper29.disable(featureArray32);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter34 = xmlMapper29.writer();
        com.fasterxml.jackson.core.ObjectCodec objectCodec35 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory36 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory37 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory38 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec35, xMLInputFactory36, xMLOutputFactory37);
        com.fasterxml.jackson.core.JsonFactory jsonFactory40 = xmlFactory38.setRootValueSeparator("");
        java.io.DataOutput dataOutput41 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator42 = jsonFactory40.createGenerator(dataOutput41);
        boolean boolean43 = jsonGenerator42.canWriteTypeId();
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes44 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator45 = jsonGenerator42.setCharacterEscapes(characterEscapes44);
        // The following exception was thrown during execution in test generation
        try {
            serializerProvider12.defaultSerializeField(" ", (java.lang.Object) objectWriter34, jsonGenerator42);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonGenerationException; message: Can not write a field name, expecting a value");
        } catch (com.fasterxml.jackson.core.JsonGenerationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(serializationConfig11);
        org.junit.Assert.assertNotNull(serializerProvider12);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature17.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory18);
        org.junit.Assert.assertNotNull(version19);
        org.junit.Assert.assertNotNull(featureClass20);
        org.junit.Assert.assertNotNull(objJsonSerializer21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(version28);
        org.junit.Assert.assertNotNull(objectWriter31);
        org.junit.Assert.assertNotNull(featureArray32);
        org.junit.Assert.assertNotNull(objectMapper33);
        org.junit.Assert.assertNotNull(objectWriter34);
        org.junit.Assert.assertNotNull(jsonFactory40);
        org.junit.Assert.assertNotNull(jsonGenerator42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jsonGenerator45);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        java.io.File file10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup xmlRootNameLookup12 = objectMapper9.readValue(file10, javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        javax.xml.stream.XMLInputFactory xMLInputFactory0 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory1 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper2 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory0, xMLOutputFactory1);
        com.fasterxml.jackson.annotation.JsonInclude.Value value3 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = xmlMapper2.setPropertyInclusion(value3);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.type.TypeReference typeReference6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup xmlRootNameLookup7 = objectMapper4.readValue(inputStream5, typeReference6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null InputStream is not a valid argument");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper4);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper9.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig11 = objectMapper9.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = objectMapper9.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory14 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory15 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory16 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec13, xMLInputFactory14, xMLOutputFactory15);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature17 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory18 = xmlFactory16.disable(feature17);
        com.fasterxml.jackson.core.Version version19 = xmlFactory18.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass20 = xmlFactory18.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer21 = serializerProvider12.getUnknownTypeSerializer(featureClass20);
        java.util.TimeZone timeZone22 = serializerProvider12.getTimeZone();
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory24 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory25 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory26 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec23, xMLInputFactory24, xMLOutputFactory25);
        com.fasterxml.jackson.core.Version version27 = xmlFactory26.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper28 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory26);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes29 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter30 = xmlMapper28.writer(characterEscapes29);
        com.fasterxml.jackson.core.ObjectCodec objectCodec31 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory32 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory33 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory34 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec31, xMLInputFactory32, xMLOutputFactory33);
        com.fasterxml.jackson.core.Version version35 = xmlFactory34.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper36 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory34);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes37 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter38 = xmlMapper36.writer(characterEscapes37);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory39 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper40 = xmlMapper36.setNodeFactory(jsonNodeFactory39);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider41 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper42 = xmlMapper36.setFilterProvider(filterProvider41);
        com.fasterxml.jackson.core.JsonParser jsonParser43 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec44 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory45 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory46 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory47 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec44, xMLInputFactory45, xMLOutputFactory46);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature48 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory49 = xmlFactory47.disable(feature48);
        com.fasterxml.jackson.core.Version version50 = xmlFactory49.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass51 = xmlFactory49.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor52 = objectMapper42.readValues(jsonParser43, featureClass51);
        boolean boolean53 = xmlMapper28.canSerialize(featureClass51);
        com.fasterxml.jackson.databind.BeanProperty beanProperty54 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer55 = serializerProvider12.findKeySerializer(featureClass51, beanProperty54);
        com.fasterxml.jackson.databind.JavaType javaType56 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer57 = serializerProvider12.findValueSerializer(javaType56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(serializationConfig11);
        org.junit.Assert.assertNotNull(serializerProvider12);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature17.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory18);
        org.junit.Assert.assertNotNull(version19);
        org.junit.Assert.assertNotNull(featureClass20);
        org.junit.Assert.assertNotNull(objJsonSerializer21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(version27);
        org.junit.Assert.assertNotNull(objectWriter30);
        org.junit.Assert.assertNotNull(version35);
        org.junit.Assert.assertNotNull(objectWriter38);
        org.junit.Assert.assertNotNull(objectMapper40);
        org.junit.Assert.assertNotNull(objectMapper42);
        org.junit.Assert.assertTrue("'" + feature48 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature48.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory49);
        org.junit.Assert.assertNotNull(version50);
        org.junit.Assert.assertNotNull(featureClass51);
        org.junit.Assert.assertNotNull(featureItor52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(objJsonSerializer55);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        int int10 = xmlMapper5.mixInCount();
        com.fasterxml.jackson.databind.InjectableValues injectableValues11 = xmlMapper5.getInjectableValues();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature12 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean14 = feature12.enabledIn((int) (byte) 10);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper15 = xmlMapper5.disable(feature12);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = objectMapper15.isEnabled(feature16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(injectableValues11);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature12.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objectMapper15);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.disable(feature4);
        com.fasterxml.jackson.core.Version version6 = xmlFactory5.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper7 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory5);
        boolean boolean8 = xmlFactory5.requiresCustomCodec();
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper9.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig11 = objectMapper9.getSerializationConfig();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory12 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper13 = objectMapper9.setNodeFactory(jsonNodeFactory12);
        com.fasterxml.jackson.core.JsonFactory.Feature feature14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = objectMapper13.isEnabled(feature14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(serializationConfig11);
        org.junit.Assert.assertNotNull(objectMapper13);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory10 = null;
        com.fasterxml.jackson.databind.ObjectReader objectReader11 = xmlMapper5.reader(jsonNodeFactory10);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper12 = xmlMapper5.copy();
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectReader11);
        org.junit.Assert.assertNotNull(xmlMapper12);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        java.io.Reader reader8 = null;
        com.fasterxml.jackson.core.type.TypeReference typeReference9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonGenerator jsonGenerator10 = xmlMapper5.readValue(reader8, typeReference9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = xmlMapper5.getDeserializationContext();
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory13 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory14 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory15 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec12, xMLInputFactory13, xMLOutputFactory14);
        com.fasterxml.jackson.core.Version version16 = xmlFactory15.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper17 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory15);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes18 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter19 = xmlMapper17.writer(characterEscapes18);
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory21 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory22 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory23 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec20, xMLInputFactory21, xMLOutputFactory22);
        com.fasterxml.jackson.core.Version version24 = xmlFactory23.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper25 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory23);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes26 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter27 = xmlMapper25.writer(characterEscapes26);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory28 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper29 = xmlMapper25.setNodeFactory(jsonNodeFactory28);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider30 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper31 = xmlMapper25.setFilterProvider(filterProvider30);
        com.fasterxml.jackson.core.JsonParser jsonParser32 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec33 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory34 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory35 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory36 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec33, xMLInputFactory34, xMLOutputFactory35);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature37 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory38 = xmlFactory36.disable(feature37);
        com.fasterxml.jackson.core.Version version39 = xmlFactory38.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass40 = xmlFactory38.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor41 = objectMapper31.readValues(jsonParser32, featureClass40);
        boolean boolean42 = xmlMapper17.canSerialize(featureClass40);
        boolean boolean43 = com.fasterxml.jackson.dataformat.xml.util.TypeUtil.isIndexedType(featureClass40);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature feature44 = xmlMapper5.readValue(jsonParser11, featureClass40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(deserializationContext10);
        org.junit.Assert.assertNotNull(version16);
        org.junit.Assert.assertNotNull(objectWriter19);
        org.junit.Assert.assertNotNull(version24);
        org.junit.Assert.assertNotNull(objectWriter27);
        org.junit.Assert.assertNotNull(objectMapper29);
        org.junit.Assert.assertNotNull(objectMapper31);
        org.junit.Assert.assertTrue("'" + feature37 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature37.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory38);
        org.junit.Assert.assertNotNull(version39);
        org.junit.Assert.assertNotNull(featureClass40);
        org.junit.Assert.assertNotNull(featureItor41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair2 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector0, annotationIntrospector1);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector3 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector4 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair5 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector3, annotationIntrospector4);
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair6 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair((com.fasterxml.jackson.databind.AnnotationIntrospector) pair2, (com.fasterxml.jackson.databind.AnnotationIntrospector) pair5);
        pair6.setDefaultUseWrapper(true);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector9 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector10 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair11 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector9, annotationIntrospector10);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector12 = com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.create((com.fasterxml.jackson.databind.AnnotationIntrospector) pair6, annotationIntrospector10);
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory14 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory15 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory16 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec13, xMLInputFactory14, xMLOutputFactory15);
        com.fasterxml.jackson.core.Version version17 = xmlFactory16.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper18 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory16);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes19 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter20 = xmlMapper18.writer(characterEscapes19);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray21 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper22 = xmlMapper18.disable(featureArray21);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper23 = objectMapper22.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig24 = objectMapper22.getSerializationConfig();
        com.fasterxml.jackson.databind.introspect.Annotated annotated25 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec26 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory27 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory28 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory29 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec26, xMLInputFactory27, xMLOutputFactory28);
        com.fasterxml.jackson.core.Version version30 = xmlFactory29.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper31 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory29);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes32 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter33 = xmlMapper31.writer(characterEscapes32);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray34 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper35 = xmlMapper31.disable(featureArray34);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper36 = objectMapper35.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig37 = objectMapper35.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider38 = objectMapper35.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec39 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory40 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory41 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory42 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec39, xMLInputFactory40, xMLOutputFactory41);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature43 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory44 = xmlFactory42.disable(feature43);
        com.fasterxml.jackson.core.Version version45 = xmlFactory44.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass46 = xmlFactory44.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer47 = serializerProvider38.getUnknownTypeSerializer(featureClass46);
        java.util.TimeZone timeZone48 = serializerProvider38.getTimeZone();
        com.fasterxml.jackson.core.ObjectCodec objectCodec49 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory50 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory51 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory52 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec49, xMLInputFactory50, xMLOutputFactory51);
        com.fasterxml.jackson.core.Version version53 = xmlFactory52.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper54 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory52);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes55 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter56 = xmlMapper54.writer(characterEscapes55);
        com.fasterxml.jackson.core.ObjectCodec objectCodec57 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory58 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory59 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory60 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec57, xMLInputFactory58, xMLOutputFactory59);
        com.fasterxml.jackson.core.Version version61 = xmlFactory60.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper62 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory60);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes63 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter64 = xmlMapper62.writer(characterEscapes63);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory65 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper66 = xmlMapper62.setNodeFactory(jsonNodeFactory65);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider67 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper68 = xmlMapper62.setFilterProvider(filterProvider67);
        com.fasterxml.jackson.core.JsonParser jsonParser69 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec70 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory71 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory72 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory73 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec70, xMLInputFactory71, xMLOutputFactory72);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature74 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory75 = xmlFactory73.disable(feature74);
        com.fasterxml.jackson.core.Version version76 = xmlFactory75.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass77 = xmlFactory75.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor78 = objectMapper68.readValues(jsonParser69, featureClass77);
        boolean boolean79 = xmlMapper54.canSerialize(featureClass77);
        com.fasterxml.jackson.databind.JavaType javaType80 = serializerProvider38.constructType((java.lang.reflect.Type) featureClass77);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType81 = pair6.refineSerializationType((com.fasterxml.jackson.databind.cfg.MapperConfig<com.fasterxml.jackson.databind.SerializationConfig>) serializationConfig24, annotated25, javaType80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector12);
        org.junit.Assert.assertNotNull(version17);
        org.junit.Assert.assertNotNull(objectWriter20);
        org.junit.Assert.assertNotNull(featureArray21);
        org.junit.Assert.assertNotNull(objectMapper22);
        org.junit.Assert.assertNotNull(objectMapper23);
        org.junit.Assert.assertNotNull(serializationConfig24);
        org.junit.Assert.assertNotNull(version30);
        org.junit.Assert.assertNotNull(objectWriter33);
        org.junit.Assert.assertNotNull(featureArray34);
        org.junit.Assert.assertNotNull(objectMapper35);
        org.junit.Assert.assertNotNull(objectMapper36);
        org.junit.Assert.assertNotNull(serializationConfig37);
        org.junit.Assert.assertNotNull(serializerProvider38);
        org.junit.Assert.assertTrue("'" + feature43 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature43.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory44);
        org.junit.Assert.assertNotNull(version45);
        org.junit.Assert.assertNotNull(featureClass46);
        org.junit.Assert.assertNotNull(objJsonSerializer47);
        org.junit.Assert.assertNotNull(timeZone48);
        org.junit.Assert.assertEquals(timeZone48.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(version53);
        org.junit.Assert.assertNotNull(objectWriter56);
        org.junit.Assert.assertNotNull(version61);
        org.junit.Assert.assertNotNull(objectWriter64);
        org.junit.Assert.assertNotNull(objectMapper66);
        org.junit.Assert.assertNotNull(objectMapper68);
        org.junit.Assert.assertTrue("'" + feature74 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature74.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory75);
        org.junit.Assert.assertNotNull(version76);
        org.junit.Assert.assertNotNull(featureClass77);
        org.junit.Assert.assertNotNull(featureItor78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(javaType80);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        int int10 = xmlMapper5.mixInCount();
        com.fasterxml.jackson.databind.InjectableValues injectableValues11 = xmlMapper5.getInjectableValues();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature12 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean14 = feature12.enabledIn((int) (byte) 10);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper15 = xmlMapper5.disable(feature12);
        java.net.URL uRL16 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec17 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory18 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory19 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory20 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec17, xMLInputFactory18, xMLOutputFactory19);
        com.fasterxml.jackson.core.Version version21 = xmlFactory20.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper22 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory20);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes23 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter24 = xmlMapper22.writer(characterEscapes23);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory25 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper26 = xmlMapper22.setNodeFactory(jsonNodeFactory25);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider27 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper28 = xmlMapper22.setFilterProvider(filterProvider27);
        com.fasterxml.jackson.core.JsonParser jsonParser29 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory31 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory32 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory33 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec30, xMLInputFactory31, xMLOutputFactory32);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature34 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory35 = xmlFactory33.disable(feature34);
        com.fasterxml.jackson.core.Version version36 = xmlFactory35.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass37 = xmlFactory35.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor38 = objectMapper28.readValues(jsonParser29, featureClass37);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature feature39 = objectMapper15.readValue(uRL16, featureClass37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(injectableValues11);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature12.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objectMapper15);
        org.junit.Assert.assertNotNull(version21);
        org.junit.Assert.assertNotNull(objectWriter24);
        org.junit.Assert.assertNotNull(objectMapper26);
        org.junit.Assert.assertNotNull(objectMapper28);
        org.junit.Assert.assertTrue("'" + feature34 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature34.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory35);
        org.junit.Assert.assertNotNull(version36);
        org.junit.Assert.assertNotNull(featureClass37);
        org.junit.Assert.assertNotNull(featureItor38);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper9.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig11 = objectMapper9.getSerializationConfig();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory12 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper13 = objectMapper9.setNodeFactory(jsonNodeFactory12);
        com.fasterxml.jackson.databind.SerializationFeature serializationFeature14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = objectMapper9.isEnabled(serializationFeature14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(serializationConfig11);
        org.junit.Assert.assertNotNull(objectMapper13);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping10 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper12 = objectMapper9.enableDefaultTypingAsProperty(defaultTyping10, "XML");
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader14 = objectMapper9.reader(deserializationFeature13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper12);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair2 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector0, annotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        java.lang.Boolean boolean4 = pair2.isOutputAsCData(annotated3);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector5 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector6 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair7 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector5, annotationIntrospector6);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector8 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector9 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair10 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector8, annotationIntrospector9);
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair11 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair((com.fasterxml.jackson.databind.AnnotationIntrospector) pair7, (com.fasterxml.jackson.databind.AnnotationIntrospector) pair10);
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair12 = com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair.instance((com.fasterxml.jackson.databind.AnnotationIntrospector) pair2, (com.fasterxml.jackson.databind.AnnotationIntrospector) pair10);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector13 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair14 = com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair.instance((com.fasterxml.jackson.databind.AnnotationIntrospector) pair12, annotationIntrospector13);
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory16 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory17 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory18 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec15, xMLInputFactory16, xMLOutputFactory17);
        com.fasterxml.jackson.core.Version version19 = xmlFactory18.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper20 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory18);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes21 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter22 = xmlMapper20.writer(characterEscapes21);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray23 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper24 = xmlMapper20.disable(featureArray23);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper25 = objectMapper24.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig26 = objectMapper24.getSerializationConfig();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass27 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec28 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory29 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory30 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory31 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec28, xMLInputFactory29, xMLOutputFactory30);
        com.fasterxml.jackson.core.Version version32 = xmlFactory31.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper33 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory31);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes34 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter35 = xmlMapper33.writer(characterEscapes34);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray36 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper37 = xmlMapper33.disable(featureArray36);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper38 = objectMapper37.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig39 = objectMapper37.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider40 = objectMapper37.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec41 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory42 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory43 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory44 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec41, xMLInputFactory42, xMLOutputFactory43);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature45 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory46 = xmlFactory44.disable(feature45);
        com.fasterxml.jackson.core.Version version47 = xmlFactory46.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass48 = xmlFactory46.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer49 = serializerProvider40.getUnknownTypeSerializer(featureClass48);
        java.util.TimeZone timeZone50 = serializerProvider40.getTimeZone();
        com.fasterxml.jackson.core.ObjectCodec objectCodec51 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory52 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory53 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory54 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec51, xMLInputFactory52, xMLOutputFactory53);
        com.fasterxml.jackson.core.Version version55 = xmlFactory54.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper56 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory54);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes57 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter58 = xmlMapper56.writer(characterEscapes57);
        com.fasterxml.jackson.core.ObjectCodec objectCodec59 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory60 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory61 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory62 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec59, xMLInputFactory60, xMLOutputFactory61);
        com.fasterxml.jackson.core.Version version63 = xmlFactory62.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper64 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory62);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes65 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter66 = xmlMapper64.writer(characterEscapes65);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory67 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper68 = xmlMapper64.setNodeFactory(jsonNodeFactory67);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider69 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper70 = xmlMapper64.setFilterProvider(filterProvider69);
        com.fasterxml.jackson.core.JsonParser jsonParser71 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec72 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory73 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory74 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory75 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec72, xMLInputFactory73, xMLOutputFactory74);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature76 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory77 = xmlFactory75.disable(feature76);
        com.fasterxml.jackson.core.Version version78 = xmlFactory77.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass79 = xmlFactory77.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor80 = objectMapper70.readValues(jsonParser71, featureClass79);
        boolean boolean81 = xmlMapper56.canSerialize(featureClass79);
        com.fasterxml.jackson.databind.JavaType javaType82 = serializerProvider40.constructType((java.lang.reflect.Type) featureClass79);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder<?> wildcardTypeResolverBuilder83 = pair14.findTypeResolver((com.fasterxml.jackson.databind.cfg.MapperConfig<com.fasterxml.jackson.databind.SerializationConfig>) serializationConfig26, annotatedClass27, javaType82);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNotNull(pair12);
        org.junit.Assert.assertNotNull(pair14);
        org.junit.Assert.assertNotNull(version19);
        org.junit.Assert.assertNotNull(objectWriter22);
        org.junit.Assert.assertNotNull(featureArray23);
        org.junit.Assert.assertNotNull(objectMapper24);
        org.junit.Assert.assertNotNull(objectMapper25);
        org.junit.Assert.assertNotNull(serializationConfig26);
        org.junit.Assert.assertNotNull(version32);
        org.junit.Assert.assertNotNull(objectWriter35);
        org.junit.Assert.assertNotNull(featureArray36);
        org.junit.Assert.assertNotNull(objectMapper37);
        org.junit.Assert.assertNotNull(objectMapper38);
        org.junit.Assert.assertNotNull(serializationConfig39);
        org.junit.Assert.assertNotNull(serializerProvider40);
        org.junit.Assert.assertTrue("'" + feature45 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature45.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory46);
        org.junit.Assert.assertNotNull(version47);
        org.junit.Assert.assertNotNull(featureClass48);
        org.junit.Assert.assertNotNull(objJsonSerializer49);
        org.junit.Assert.assertNotNull(timeZone50);
        org.junit.Assert.assertEquals(timeZone50.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(version55);
        org.junit.Assert.assertNotNull(objectWriter58);
        org.junit.Assert.assertNotNull(version63);
        org.junit.Assert.assertNotNull(objectWriter66);
        org.junit.Assert.assertNotNull(objectMapper68);
        org.junit.Assert.assertNotNull(objectMapper70);
        org.junit.Assert.assertTrue("'" + feature76 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature76.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory77);
        org.junit.Assert.assertNotNull(version78);
        org.junit.Assert.assertNotNull(featureClass79);
        org.junit.Assert.assertNotNull(featureItor80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(javaType82);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.setNodeFactory(jsonNodeFactory8);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider10 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper11 = xmlMapper5.setFilterProvider(filterProvider10);
        com.fasterxml.jackson.databind.InjectableValues injectableValues12 = objectMapper11.getInjectableValues();
        com.fasterxml.jackson.databind.SerializationFeature serializationFeature13 = null;
        com.fasterxml.jackson.databind.SerializationFeature[] serializationFeatureArray14 = new com.fasterxml.jackson.databind.SerializationFeature[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper15 = objectMapper11.enable(serializationFeature13, serializationFeatureArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper11);
        org.junit.Assert.assertNull(injectableValues12);
        org.junit.Assert.assertNotNull(serializationFeatureArray14);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter10 = xmlMapper5.writer();
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider11 = null;
        xmlMapper5.setFilters(filterProvider11);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper13 = xmlMapper5.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationFeature serializationFeature14 = null;
        com.fasterxml.jackson.databind.SerializationFeature[] serializationFeatureArray15 = new com.fasterxml.jackson.databind.SerializationFeature[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper16 = xmlMapper5.enable(serializationFeature14, serializationFeatureArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectWriter10);
        org.junit.Assert.assertNotNull(objectMapper13);
        org.junit.Assert.assertNotNull(serializationFeatureArray15);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = xmlMapper5.getDeserializationContext();
        com.fasterxml.jackson.core.Version version11 = xmlMapper5.version();
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0 };
        com.fasterxml.jackson.core.ObjectCodec objectCodec19 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory20 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory21 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory22 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec19, xMLInputFactory20, xMLOutputFactory21);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature23 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory24 = xmlFactory22.disable(feature23);
        com.fasterxml.jackson.core.Version version25 = xmlFactory24.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass26 = xmlFactory24.getFormatReadFeatureType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature feature27 = xmlMapper5.readValue(byteArray16, 10, (int) (short) 10, featureClass26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(deserializationContext10);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-1, -1, 100, 0]");
        org.junit.Assert.assertTrue("'" + feature23 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature23.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory24);
        org.junit.Assert.assertNotNull(version25);
        org.junit.Assert.assertNotNull(featureClass26);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.setNodeFactory(jsonNodeFactory8);
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory10 = new com.fasterxml.jackson.dataformat.xml.XmlFactory();
        com.fasterxml.jackson.databind.ObjectReader objectReader11 = xmlMapper5.readerForUpdating((java.lang.Object) xmlFactory10);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature> featureClass12 = xmlFactory10.getFormatWriteFeatureType();
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser14 = xmlFactory10.createJsonParser(uRL13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectReader11);
        org.junit.Assert.assertNotNull(featureClass12);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader7 = xmlMapper5.reader(deserializationFeature6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        javax.xml.stream.XMLInputFactory xMLInputFactory0 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory1 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper2 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory0, xMLOutputFactory1);
        com.fasterxml.jackson.annotation.JsonInclude.Value value3 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = xmlMapper2.setPropertyInclusion(value3);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = objectMapper4.canSerialize(featureClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper4);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory11 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory12 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory13 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec10, xMLInputFactory11, xMLOutputFactory12);
        com.fasterxml.jackson.core.JsonFactory jsonFactory15 = xmlFactory13.setRootValueSeparator("");
        java.io.DataOutput dataOutput16 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator17 = jsonFactory15.createGenerator(dataOutput16);
        boolean boolean18 = jsonGenerator17.canWriteTypeId();
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes19 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator20 = jsonGenerator17.setCharacterEscapes(characterEscapes19);
        boolean boolean21 = jsonGenerator17.canWriteBinaryNatively();
        jsonGenerator17.writeOmittedField("hi!");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector24 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector25 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair26 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector24, annotationIntrospector25);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector27 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector28 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair29 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector27, annotationIntrospector28);
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair30 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair((com.fasterxml.jackson.databind.AnnotationIntrospector) pair26, (com.fasterxml.jackson.databind.AnnotationIntrospector) pair29);
        pair30.setDefaultUseWrapper(true);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector33 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector34 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair35 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector33, annotationIntrospector34);
        com.fasterxml.jackson.databind.introspect.Annotated annotated36 = null;
        java.lang.Boolean boolean37 = pair35.isOutputAsCData(annotated36);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector38 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector39 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair40 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector38, annotationIntrospector39);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector41 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector42 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair43 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector41, annotationIntrospector42);
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair44 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair((com.fasterxml.jackson.databind.AnnotationIntrospector) pair40, (com.fasterxml.jackson.databind.AnnotationIntrospector) pair43);
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair45 = com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair.instance((com.fasterxml.jackson.databind.AnnotationIntrospector) pair35, (com.fasterxml.jackson.databind.AnnotationIntrospector) pair43);
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair46 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair((com.fasterxml.jackson.databind.AnnotationIntrospector) pair30, (com.fasterxml.jackson.databind.AnnotationIntrospector) pair35);
        // The following exception was thrown during execution in test generation
        try {
            xmlMapper5.writeValue(jsonGenerator17, (java.lang.Object) pair30);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.JsonMappingException; message: No serializer found for class com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector$Pair and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS)");
        } catch (com.fasterxml.jackson.databind.JsonMappingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(jsonFactory15);
        org.junit.Assert.assertNotNull(jsonGenerator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jsonGenerator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(boolean37);
        org.junit.Assert.assertNotNull(pair45);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper9.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig11 = objectMapper9.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = objectMapper9.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory14 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory15 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory16 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec13, xMLInputFactory14, xMLOutputFactory15);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature17 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory18 = xmlFactory16.disable(feature17);
        com.fasterxml.jackson.core.Version version19 = xmlFactory18.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass20 = xmlFactory18.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer21 = serializerProvider12.getUnknownTypeSerializer(featureClass20);
        java.util.TimeZone timeZone22 = serializerProvider12.getTimeZone();
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory24 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory25 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory26 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec23, xMLInputFactory24, xMLOutputFactory25);
        com.fasterxml.jackson.core.Version version27 = xmlFactory26.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper28 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory26);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes29 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter30 = xmlMapper28.writer(characterEscapes29);
        com.fasterxml.jackson.core.ObjectCodec objectCodec31 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory32 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory33 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory34 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec31, xMLInputFactory32, xMLOutputFactory33);
        com.fasterxml.jackson.core.Version version35 = xmlFactory34.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper36 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory34);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes37 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter38 = xmlMapper36.writer(characterEscapes37);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory39 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper40 = xmlMapper36.setNodeFactory(jsonNodeFactory39);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider41 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper42 = xmlMapper36.setFilterProvider(filterProvider41);
        com.fasterxml.jackson.core.JsonParser jsonParser43 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec44 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory45 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory46 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory47 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec44, xMLInputFactory45, xMLOutputFactory46);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature48 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory49 = xmlFactory47.disable(feature48);
        com.fasterxml.jackson.core.Version version50 = xmlFactory49.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass51 = xmlFactory49.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor52 = objectMapper42.readValues(jsonParser43, featureClass51);
        boolean boolean53 = xmlMapper28.canSerialize(featureClass51);
        com.fasterxml.jackson.databind.JavaType javaType54 = serializerProvider12.constructType((java.lang.reflect.Type) featureClass51);
        com.fasterxml.jackson.core.ObjectCodec objectCodec56 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory57 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory58 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory59 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec56, xMLInputFactory57, xMLOutputFactory58);
        com.fasterxml.jackson.core.JsonFactory jsonFactory61 = xmlFactory59.setRootValueSeparator("");
        java.io.DataOutput dataOutput62 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator63 = jsonFactory61.createGenerator(dataOutput62);
        boolean boolean64 = jsonGenerator63.canWriteTypeId();
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes65 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator66 = jsonGenerator63.setCharacterEscapes(characterEscapes65);
        boolean boolean67 = jsonGenerator63.canWriteBinaryNatively();
        jsonGenerator63.writeOmittedField("hi!");
        // The following exception was thrown during execution in test generation
        try {
            serializerProvider12.defaultSerializeDateValue(0L, jsonGenerator63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No element/attribute name specified when trying to output element");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(serializationConfig11);
        org.junit.Assert.assertNotNull(serializerProvider12);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature17.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory18);
        org.junit.Assert.assertNotNull(version19);
        org.junit.Assert.assertNotNull(featureClass20);
        org.junit.Assert.assertNotNull(objJsonSerializer21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(version27);
        org.junit.Assert.assertNotNull(objectWriter30);
        org.junit.Assert.assertNotNull(version35);
        org.junit.Assert.assertNotNull(objectWriter38);
        org.junit.Assert.assertNotNull(objectMapper40);
        org.junit.Assert.assertNotNull(objectMapper42);
        org.junit.Assert.assertTrue("'" + feature48 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature48.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory49);
        org.junit.Assert.assertNotNull(version50);
        org.junit.Assert.assertNotNull(featureClass51);
        org.junit.Assert.assertNotNull(featureItor52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(javaType54);
        org.junit.Assert.assertNotNull(jsonFactory61);
        org.junit.Assert.assertNotNull(jsonGenerator63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(jsonGenerator66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper9.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig11 = objectMapper9.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = objectMapper9.getSerializerProviderInstance();
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer15 = serializerProvider12.findKeySerializer(javaType13, beanProperty14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(serializationConfig11);
        org.junit.Assert.assertNotNull(serializerProvider12);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper9.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig11 = objectMapper9.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = objectMapper9.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory14 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory15 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory16 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec13, xMLInputFactory14, xMLOutputFactory15);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature17 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory18 = xmlFactory16.disable(feature17);
        com.fasterxml.jackson.core.Version version19 = xmlFactory18.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass20 = xmlFactory18.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer21 = serializerProvider12.getUnknownTypeSerializer(featureClass20);
        java.util.TimeZone timeZone22 = serializerProvider12.getTimeZone();
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory24 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory25 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory26 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec23, xMLInputFactory24, xMLOutputFactory25);
        com.fasterxml.jackson.core.Version version27 = xmlFactory26.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper28 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory26);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes29 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter30 = xmlMapper28.writer(characterEscapes29);
        com.fasterxml.jackson.core.ObjectCodec objectCodec31 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory32 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory33 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory34 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec31, xMLInputFactory32, xMLOutputFactory33);
        com.fasterxml.jackson.core.Version version35 = xmlFactory34.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper36 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory34);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes37 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter38 = xmlMapper36.writer(characterEscapes37);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory39 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper40 = xmlMapper36.setNodeFactory(jsonNodeFactory39);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider41 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper42 = xmlMapper36.setFilterProvider(filterProvider41);
        com.fasterxml.jackson.core.JsonParser jsonParser43 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec44 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory45 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory46 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory47 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec44, xMLInputFactory45, xMLOutputFactory46);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature48 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory49 = xmlFactory47.disable(feature48);
        com.fasterxml.jackson.core.Version version50 = xmlFactory49.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass51 = xmlFactory49.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor52 = objectMapper42.readValues(jsonParser43, featureClass51);
        boolean boolean53 = xmlMapper28.canSerialize(featureClass51);
        com.fasterxml.jackson.databind.BeanProperty beanProperty54 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer55 = serializerProvider12.findKeySerializer(featureClass51, beanProperty54);
        com.fasterxml.jackson.databind.JavaType javaType56 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty57 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer58 = serializerProvider12.findPrimaryPropertySerializer(javaType56, beanProperty57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(serializationConfig11);
        org.junit.Assert.assertNotNull(serializerProvider12);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature17.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory18);
        org.junit.Assert.assertNotNull(version19);
        org.junit.Assert.assertNotNull(featureClass20);
        org.junit.Assert.assertNotNull(objJsonSerializer21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(version27);
        org.junit.Assert.assertNotNull(objectWriter30);
        org.junit.Assert.assertNotNull(version35);
        org.junit.Assert.assertNotNull(objectWriter38);
        org.junit.Assert.assertNotNull(objectMapper40);
        org.junit.Assert.assertNotNull(objectMapper42);
        org.junit.Assert.assertTrue("'" + feature48 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature48.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory49);
        org.junit.Assert.assertNotNull(version50);
        org.junit.Assert.assertNotNull(featureClass51);
        org.junit.Assert.assertNotNull(featureItor52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(objJsonSerializer55);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = xmlMapper5.getDeserializationContext();
        com.fasterxml.jackson.core.Version version11 = xmlMapper5.version();
        com.fasterxml.jackson.core.FormatSchema formatSchema12 = null;
        com.fasterxml.jackson.databind.ObjectReader objectReader13 = xmlMapper5.reader(formatSchema12);
        com.fasterxml.jackson.databind.cfg.HandlerInstantiator handlerInstantiator14 = null;
        java.lang.Object obj15 = xmlMapper5.setHandlerInstantiator(handlerInstantiator14);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(deserializationContext10);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertNotNull(objectReader13);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper10 = xmlMapper5.copy();
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature11 = null;
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature12 = null;
        com.fasterxml.jackson.databind.DeserializationFeature[] deserializationFeatureArray13 = new com.fasterxml.jackson.databind.DeserializationFeature[] { deserializationFeature12 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper14 = xmlMapper5.enable(deserializationFeature11, deserializationFeatureArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(xmlMapper10);
        org.junit.Assert.assertNotNull(deserializationFeatureArray13);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper10 = xmlMapper5.copy();
        com.fasterxml.jackson.annotation.JsonInclude.Include include11 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper12 = xmlMapper5.setSerializationInclusion(include11);
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper14 = xmlMapper5.enable(deserializationFeature13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(xmlMapper10);
        org.junit.Assert.assertNotNull(objectMapper12);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.setNodeFactory(jsonNodeFactory8);
        com.fasterxml.jackson.databind.Module[] moduleArray10 = new com.fasterxml.jackson.databind.Module[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper11 = objectMapper9.registerModules(moduleArray10);
        java.text.DateFormat dateFormat12 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper13 = objectMapper9.setDateFormat(dateFormat12);
        com.fasterxml.jackson.databind.jsontype.SubtypeResolver subtypeResolver14 = objectMapper9.getSubtypeResolver();
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider15 = null;
        objectMapper9.setFilters(filterProvider15);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(moduleArray10);
        org.junit.Assert.assertNotNull(objectMapper11);
        org.junit.Assert.assertNotNull(objectMapper13);
        org.junit.Assert.assertNotNull(subtypeResolver14);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector0 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory2 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory3 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory4 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec1, xMLInputFactory2, xMLOutputFactory3);
        com.fasterxml.jackson.core.Version version5 = xmlFactory4.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper6 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory4);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes7 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter8 = xmlMapper6.writer(characterEscapes7);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray9 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = xmlMapper6.disable(featureArray9);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper11 = objectMapper10.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig12 = objectMapper10.getSerializationConfig();
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod13 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod15 = jacksonXmlAnnotationIntrospector0.resolveSetterConflict((com.fasterxml.jackson.databind.cfg.MapperConfig<com.fasterxml.jackson.databind.SerializationConfig>) serializationConfig12, annotatedMethod13, annotatedMethod14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version5);
        org.junit.Assert.assertNotNull(objectWriter8);
        org.junit.Assert.assertNotNull(featureArray9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(objectMapper11);
        org.junit.Assert.assertNotNull(serializationConfig12);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper9.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig11 = objectMapper9.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = objectMapper9.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory14 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory15 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory16 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec13, xMLInputFactory14, xMLOutputFactory15);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature17 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory18 = xmlFactory16.disable(feature17);
        com.fasterxml.jackson.core.Version version19 = xmlFactory18.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass20 = xmlFactory18.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer21 = serializerProvider12.getUnknownTypeSerializer(featureClass20);
        java.util.TimeZone timeZone22 = serializerProvider12.getTimeZone();
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory24 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory25 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory26 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec23, xMLInputFactory24, xMLOutputFactory25);
        com.fasterxml.jackson.core.Version version27 = xmlFactory26.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper28 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory26);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes29 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter30 = xmlMapper28.writer(characterEscapes29);
        com.fasterxml.jackson.core.ObjectCodec objectCodec31 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory32 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory33 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory34 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec31, xMLInputFactory32, xMLOutputFactory33);
        com.fasterxml.jackson.core.Version version35 = xmlFactory34.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper36 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory34);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes37 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter38 = xmlMapper36.writer(characterEscapes37);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory39 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper40 = xmlMapper36.setNodeFactory(jsonNodeFactory39);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider41 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper42 = xmlMapper36.setFilterProvider(filterProvider41);
        com.fasterxml.jackson.core.JsonParser jsonParser43 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec44 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory45 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory46 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory47 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec44, xMLInputFactory45, xMLOutputFactory46);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature48 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory49 = xmlFactory47.disable(feature48);
        com.fasterxml.jackson.core.Version version50 = xmlFactory49.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass51 = xmlFactory49.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor52 = objectMapper42.readValues(jsonParser43, featureClass51);
        boolean boolean53 = xmlMapper28.canSerialize(featureClass51);
        com.fasterxml.jackson.databind.BeanProperty beanProperty54 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer55 = serializerProvider12.findKeySerializer(featureClass51, beanProperty54);
        com.fasterxml.jackson.core.ObjectCodec objectCodec56 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory57 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory58 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory59 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec56, xMLInputFactory57, xMLOutputFactory58);
        com.fasterxml.jackson.core.Version version60 = xmlFactory59.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper61 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory59);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes62 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter63 = xmlMapper61.writer(characterEscapes62);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray64 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper65 = xmlMapper61.disable(featureArray64);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper66 = objectMapper65.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig67 = objectMapper65.getSerializationConfig();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator68 = null;
        // The following exception was thrown during execution in test generation
        try {
            serializerProvider12.defaultSerializeValue((java.lang.Object) objectMapper65, jsonGenerator68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(serializationConfig11);
        org.junit.Assert.assertNotNull(serializerProvider12);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature17.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory18);
        org.junit.Assert.assertNotNull(version19);
        org.junit.Assert.assertNotNull(featureClass20);
        org.junit.Assert.assertNotNull(objJsonSerializer21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(version27);
        org.junit.Assert.assertNotNull(objectWriter30);
        org.junit.Assert.assertNotNull(version35);
        org.junit.Assert.assertNotNull(objectWriter38);
        org.junit.Assert.assertNotNull(objectMapper40);
        org.junit.Assert.assertNotNull(objectMapper42);
        org.junit.Assert.assertTrue("'" + feature48 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature48.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory49);
        org.junit.Assert.assertNotNull(version50);
        org.junit.Assert.assertNotNull(featureClass51);
        org.junit.Assert.assertNotNull(featureItor52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(objJsonSerializer55);
        org.junit.Assert.assertNotNull(version60);
        org.junit.Assert.assertNotNull(objectWriter63);
        org.junit.Assert.assertNotNull(featureArray64);
        org.junit.Assert.assertNotNull(objectMapper65);
        org.junit.Assert.assertNotNull(objectMapper66);
        org.junit.Assert.assertNotNull(serializationConfig67);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory7 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory8 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory9 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec6, xMLInputFactory7, xMLOutputFactory8);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature10 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean11 = xmlFactory9.isEnabled(feature10);
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory12 = xmlFactory3.enable(feature10);
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory14 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory15 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory16 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec13, xMLInputFactory14, xMLOutputFactory15);
        com.fasterxml.jackson.core.Version version17 = xmlFactory16.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper18 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory16);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes19 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter20 = xmlMapper18.writer(characterEscapes19);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray21 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper22 = xmlMapper18.disable(featureArray21);
        int int23 = xmlMapper18.mixInCount();
        com.fasterxml.jackson.databind.InjectableValues injectableValues24 = xmlMapper18.getInjectableValues();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature25 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean27 = feature25.enabledIn((int) (byte) 10);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper28 = xmlMapper18.disable(feature25);
        boolean boolean29 = xmlFactory12.isEnabled(feature25);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertTrue("'" + feature10 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature10.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(xmlFactory12);
        org.junit.Assert.assertNotNull(version17);
        org.junit.Assert.assertNotNull(objectWriter20);
        org.junit.Assert.assertNotNull(featureArray21);
        org.junit.Assert.assertNotNull(objectMapper22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(injectableValues24);
        org.junit.Assert.assertTrue("'" + feature25 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature25.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objectMapper28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping10 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper12 = objectMapper9.enableDefaultTypingAsProperty(defaultTyping10, "XML");
        java.io.DataInput dataInput13 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory15 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory16 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory17 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec14, xMLInputFactory15, xMLOutputFactory16);
        com.fasterxml.jackson.core.Version version18 = xmlFactory17.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper19 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory17);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes20 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter21 = xmlMapper19.writer(characterEscapes20);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory22 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper23 = xmlMapper19.setNodeFactory(jsonNodeFactory22);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider24 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper25 = xmlMapper19.setFilterProvider(filterProvider24);
        com.fasterxml.jackson.core.JsonParser jsonParser26 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec27 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory28 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory29 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory30 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec27, xMLInputFactory28, xMLOutputFactory29);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature31 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory32 = xmlFactory30.disable(feature31);
        com.fasterxml.jackson.core.Version version33 = xmlFactory32.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass34 = xmlFactory32.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor35 = objectMapper25.readValues(jsonParser26, featureClass34);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature feature36 = objectMapper9.readValue(dataInput13, featureClass34);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: InputData source not (yet?) support for this format (XML)");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper12);
        org.junit.Assert.assertNotNull(version18);
        org.junit.Assert.assertNotNull(objectWriter21);
        org.junit.Assert.assertNotNull(objectMapper23);
        org.junit.Assert.assertNotNull(objectMapper25);
        org.junit.Assert.assertTrue("'" + feature31 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature31.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory32);
        org.junit.Assert.assertNotNull(version33);
        org.junit.Assert.assertNotNull(featureClass34);
        org.junit.Assert.assertNotNull(featureItor35);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.setNodeFactory(jsonNodeFactory8);
        java.lang.String str11 = objectMapper9.writeValueAsString((java.lang.Object) "XML");
        com.fasterxml.jackson.databind.InjectableValues injectableValues12 = null;
        com.fasterxml.jackson.databind.ObjectReader objectReader13 = objectMapper9.reader(injectableValues12);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<String>XML</String>" + "'", str11, "<String>XML</String>");
        org.junit.Assert.assertNotNull(objectReader13);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper9.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig11 = objectMapper9.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = objectMapper9.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory14 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory15 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory16 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec13, xMLInputFactory14, xMLOutputFactory15);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature17 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory18 = xmlFactory16.disable(feature17);
        com.fasterxml.jackson.core.Version version19 = xmlFactory18.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass20 = xmlFactory18.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer21 = serializerProvider12.getUnknownTypeSerializer(featureClass20);
        com.fasterxml.jackson.databind.introspect.Annotated annotated22 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory24 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory25 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory26 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec23, xMLInputFactory24, xMLOutputFactory25);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature27 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory28 = xmlFactory26.disable(feature27);
        com.fasterxml.jackson.core.Version version29 = xmlFactory28.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper30 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory28);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter31 = serializerProvider12.converterInstance(annotated22, (java.lang.Object) xmlFactory28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: AnnotationIntrospector returned Converter definition of type com.fasterxml.jackson.dataformat.xml.XmlFactory; expected type Converter or Class<Converter> instead");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(serializationConfig11);
        org.junit.Assert.assertNotNull(serializerProvider12);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature17.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory18);
        org.junit.Assert.assertNotNull(version19);
        org.junit.Assert.assertNotNull(featureClass20);
        org.junit.Assert.assertNotNull(objJsonSerializer21);
        org.junit.Assert.assertTrue("'" + feature27 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature27.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory28);
        org.junit.Assert.assertNotNull(version29);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider8 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter9 = xmlMapper5.writer(filterProvider8);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass10 = null;
        com.fasterxml.jackson.databind.cfg.MutableConfigOverride mutableConfigOverride11 = xmlMapper5.configOverride(featureClass10);
        com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature feature12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper13 = xmlMapper5.disable(feature12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(objectWriter9);
        org.junit.Assert.assertNotNull(mutableConfigOverride11);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper9.disableDefaultTyping();
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter12 = objectMapper10.writerWithType(javaType11);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper13 = objectMapper10.clearProblemHandlers();
        com.fasterxml.jackson.core.TreeNode treeNode14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser15 = objectMapper13.treeAsTokens(treeNode14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(objectWriter12);
        org.junit.Assert.assertNotNull(objectMapper13);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = xmlMapper5.getDeserializationContext();
        com.fasterxml.jackson.core.Version version11 = xmlMapper5.version();
        com.fasterxml.jackson.databind.ObjectWriter objectWriter12 = xmlMapper5.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory14 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory15 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory16 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec13, xMLInputFactory14, xMLOutputFactory15);
        com.fasterxml.jackson.core.Version version17 = xmlFactory16.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper18 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory16);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes19 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter20 = xmlMapper18.writer(characterEscapes19);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray21 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper22 = xmlMapper18.disable(featureArray21);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper23 = xmlMapper18.copy();
        com.fasterxml.jackson.core.ObjectCodec objectCodec24 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory25 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory26 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory27 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec24, xMLInputFactory25, xMLOutputFactory26);
        com.fasterxml.jackson.core.Version version28 = xmlFactory27.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper29 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory27);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes30 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter31 = xmlMapper29.writer(characterEscapes30);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray32 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper33 = xmlMapper29.disable(featureArray32);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper34 = objectMapper33.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig35 = objectMapper33.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider36 = objectMapper33.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec37 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory38 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory39 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory40 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec37, xMLInputFactory38, xMLOutputFactory39);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature41 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory42 = xmlFactory40.disable(feature41);
        com.fasterxml.jackson.core.Version version43 = xmlFactory42.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass44 = xmlFactory42.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer45 = serializerProvider36.getUnknownTypeSerializer(featureClass44);
        java.util.TimeZone timeZone46 = serializerProvider36.getTimeZone();
        com.fasterxml.jackson.core.ObjectCodec objectCodec47 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory48 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory49 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory50 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec47, xMLInputFactory48, xMLOutputFactory49);
        com.fasterxml.jackson.core.Version version51 = xmlFactory50.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper52 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory50);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes53 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter54 = xmlMapper52.writer(characterEscapes53);
        com.fasterxml.jackson.core.ObjectCodec objectCodec55 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory56 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory57 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory58 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec55, xMLInputFactory56, xMLOutputFactory57);
        com.fasterxml.jackson.core.Version version59 = xmlFactory58.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper60 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory58);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes61 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter62 = xmlMapper60.writer(characterEscapes61);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory63 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper64 = xmlMapper60.setNodeFactory(jsonNodeFactory63);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider65 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper66 = xmlMapper60.setFilterProvider(filterProvider65);
        com.fasterxml.jackson.core.JsonParser jsonParser67 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec68 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory69 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory70 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory71 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec68, xMLInputFactory69, xMLOutputFactory70);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature72 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory73 = xmlFactory71.disable(feature72);
        com.fasterxml.jackson.core.Version version74 = xmlFactory73.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass75 = xmlFactory73.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor76 = objectMapper66.readValues(jsonParser67, featureClass75);
        boolean boolean77 = xmlMapper52.canSerialize(featureClass75);
        com.fasterxml.jackson.databind.JavaType javaType78 = serializerProvider36.constructType((java.lang.reflect.Type) featureClass75);
        com.fasterxml.jackson.databind.ObjectReader objectReader79 = xmlMapper23.readerFor(javaType78);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper80 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlMapper5.acceptJsonFormatVisitor(javaType78, jsonFormatVisitorWrapper80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(deserializationContext10);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertNotNull(objectWriter12);
        org.junit.Assert.assertNotNull(version17);
        org.junit.Assert.assertNotNull(objectWriter20);
        org.junit.Assert.assertNotNull(featureArray21);
        org.junit.Assert.assertNotNull(objectMapper22);
        org.junit.Assert.assertNotNull(xmlMapper23);
        org.junit.Assert.assertNotNull(version28);
        org.junit.Assert.assertNotNull(objectWriter31);
        org.junit.Assert.assertNotNull(featureArray32);
        org.junit.Assert.assertNotNull(objectMapper33);
        org.junit.Assert.assertNotNull(objectMapper34);
        org.junit.Assert.assertNotNull(serializationConfig35);
        org.junit.Assert.assertNotNull(serializerProvider36);
        org.junit.Assert.assertTrue("'" + feature41 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature41.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory42);
        org.junit.Assert.assertNotNull(version43);
        org.junit.Assert.assertNotNull(featureClass44);
        org.junit.Assert.assertNotNull(objJsonSerializer45);
        org.junit.Assert.assertNotNull(timeZone46);
        org.junit.Assert.assertEquals(timeZone46.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(version51);
        org.junit.Assert.assertNotNull(objectWriter54);
        org.junit.Assert.assertNotNull(version59);
        org.junit.Assert.assertNotNull(objectWriter62);
        org.junit.Assert.assertNotNull(objectMapper64);
        org.junit.Assert.assertNotNull(objectMapper66);
        org.junit.Assert.assertTrue("'" + feature72 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature72.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory73);
        org.junit.Assert.assertNotNull(version74);
        org.junit.Assert.assertNotNull(featureClass75);
        org.junit.Assert.assertNotNull(featureItor76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(javaType78);
        org.junit.Assert.assertNotNull(objectReader79);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonGenerator jsonGenerator7 = xmlFactory3.createJsonGenerator(writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null Writer is not a valid argument");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper9.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig11 = objectMapper9.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = objectMapper9.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory14 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory15 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory16 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec13, xMLInputFactory14, xMLOutputFactory15);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature17 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory18 = xmlFactory16.disable(feature17);
        com.fasterxml.jackson.core.Version version19 = xmlFactory18.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass20 = xmlFactory18.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer21 = serializerProvider12.getUnknownTypeSerializer(featureClass20);
        java.util.TimeZone timeZone22 = serializerProvider12.getTimeZone();
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory24 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory25 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory26 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec23, xMLInputFactory24, xMLOutputFactory25);
        com.fasterxml.jackson.core.Version version27 = xmlFactory26.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper28 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory26);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes29 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter30 = xmlMapper28.writer(characterEscapes29);
        com.fasterxml.jackson.core.ObjectCodec objectCodec31 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory32 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory33 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory34 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec31, xMLInputFactory32, xMLOutputFactory33);
        com.fasterxml.jackson.core.Version version35 = xmlFactory34.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper36 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory34);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes37 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter38 = xmlMapper36.writer(characterEscapes37);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory39 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper40 = xmlMapper36.setNodeFactory(jsonNodeFactory39);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider41 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper42 = xmlMapper36.setFilterProvider(filterProvider41);
        com.fasterxml.jackson.core.JsonParser jsonParser43 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec44 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory45 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory46 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory47 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec44, xMLInputFactory45, xMLOutputFactory46);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature48 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory49 = xmlFactory47.disable(feature48);
        com.fasterxml.jackson.core.Version version50 = xmlFactory49.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass51 = xmlFactory49.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor52 = objectMapper42.readValues(jsonParser43, featureClass51);
        boolean boolean53 = xmlMapper28.canSerialize(featureClass51);
        com.fasterxml.jackson.databind.BeanProperty beanProperty54 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer55 = serializerProvider12.findKeySerializer(featureClass51, beanProperty54);
        com.fasterxml.jackson.databind.introspect.Annotated annotated56 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter58 = serializerProvider12.converterInstance(annotated56, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: AnnotationIntrospector returned Converter definition of type java.lang.Short; expected type Converter or Class<Converter> instead");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(serializationConfig11);
        org.junit.Assert.assertNotNull(serializerProvider12);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature17.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory18);
        org.junit.Assert.assertNotNull(version19);
        org.junit.Assert.assertNotNull(featureClass20);
        org.junit.Assert.assertNotNull(objJsonSerializer21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(version27);
        org.junit.Assert.assertNotNull(objectWriter30);
        org.junit.Assert.assertNotNull(version35);
        org.junit.Assert.assertNotNull(objectWriter38);
        org.junit.Assert.assertNotNull(objectMapper40);
        org.junit.Assert.assertNotNull(objectMapper42);
        org.junit.Assert.assertTrue("'" + feature48 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature48.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory49);
        org.junit.Assert.assertNotNull(version50);
        org.junit.Assert.assertNotNull(featureClass51);
        org.junit.Assert.assertNotNull(featureItor52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(objJsonSerializer55);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper9.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig11 = objectMapper9.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = objectMapper9.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory14 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory15 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory16 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec13, xMLInputFactory14, xMLOutputFactory15);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature17 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory18 = xmlFactory16.disable(feature17);
        com.fasterxml.jackson.core.Version version19 = xmlFactory18.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass20 = xmlFactory18.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer21 = serializerProvider12.getUnknownTypeSerializer(featureClass20);
        java.util.TimeZone timeZone22 = serializerProvider12.getTimeZone();
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory24 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory25 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory26 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec23, xMLInputFactory24, xMLOutputFactory25);
        com.fasterxml.jackson.core.Version version27 = xmlFactory26.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper28 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory26);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes29 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter30 = xmlMapper28.writer(characterEscapes29);
        com.fasterxml.jackson.core.ObjectCodec objectCodec31 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory32 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory33 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory34 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec31, xMLInputFactory32, xMLOutputFactory33);
        com.fasterxml.jackson.core.Version version35 = xmlFactory34.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper36 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory34);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes37 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter38 = xmlMapper36.writer(characterEscapes37);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory39 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper40 = xmlMapper36.setNodeFactory(jsonNodeFactory39);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider41 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper42 = xmlMapper36.setFilterProvider(filterProvider41);
        com.fasterxml.jackson.core.JsonParser jsonParser43 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec44 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory45 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory46 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory47 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec44, xMLInputFactory45, xMLOutputFactory46);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature48 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory49 = xmlFactory47.disable(feature48);
        com.fasterxml.jackson.core.Version version50 = xmlFactory49.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass51 = xmlFactory49.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor52 = objectMapper42.readValues(jsonParser43, featureClass51);
        boolean boolean53 = xmlMapper28.canSerialize(featureClass51);
        com.fasterxml.jackson.databind.BeanProperty beanProperty54 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer55 = serializerProvider12.findKeySerializer(featureClass51, beanProperty54);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider56 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] beanPropertyWriterArray57 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] {};
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] beanPropertyWriterArray58 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] {};
        int int59 = com.fasterxml.jackson.dataformat.xml.ser.XmlBeanSerializerBase._orderAttributesFirst(beanPropertyWriterArray57, beanPropertyWriterArray58);
        boolean boolean60 = objJsonSerializer55.isEmpty(serializerProvider56, (java.lang.Object) beanPropertyWriterArray57);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] beanPropertyWriterArray61 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] {};
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] beanPropertyWriterArray62 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] {};
        int int63 = com.fasterxml.jackson.dataformat.xml.ser.XmlBeanSerializerBase._orderAttributesFirst(beanPropertyWriterArray61, beanPropertyWriterArray62);
        int int64 = com.fasterxml.jackson.dataformat.xml.ser.XmlBeanSerializerBase._orderAttributesFirst(beanPropertyWriterArray57, beanPropertyWriterArray61);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(serializationConfig11);
        org.junit.Assert.assertNotNull(serializerProvider12);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature17.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory18);
        org.junit.Assert.assertNotNull(version19);
        org.junit.Assert.assertNotNull(featureClass20);
        org.junit.Assert.assertNotNull(objJsonSerializer21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(version27);
        org.junit.Assert.assertNotNull(objectWriter30);
        org.junit.Assert.assertNotNull(version35);
        org.junit.Assert.assertNotNull(objectWriter38);
        org.junit.Assert.assertNotNull(objectMapper40);
        org.junit.Assert.assertNotNull(objectMapper42);
        org.junit.Assert.assertTrue("'" + feature48 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature48.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory49);
        org.junit.Assert.assertNotNull(version50);
        org.junit.Assert.assertNotNull(featureClass51);
        org.junit.Assert.assertNotNull(featureItor52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(objJsonSerializer55);
        org.junit.Assert.assertNotNull(beanPropertyWriterArray57);
        org.junit.Assert.assertNotNull(beanPropertyWriterArray58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(beanPropertyWriterArray61);
        org.junit.Assert.assertNotNull(beanPropertyWriterArray62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = xmlMapper5.getDeserializationContext();
        com.fasterxml.jackson.core.Version version11 = xmlMapper5.version();
        com.fasterxml.jackson.databind.ObjectWriter objectWriter12 = xmlMapper5.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper13 = xmlMapper5.enableDefaultTyping();
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory15 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory16 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory17 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec14, xMLInputFactory15, xMLOutputFactory16);
        com.fasterxml.jackson.core.Version version18 = xmlFactory17.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper19 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory17);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes20 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter21 = xmlMapper19.writer(characterEscapes20);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray22 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper23 = xmlMapper19.disable(featureArray22);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper24 = objectMapper23.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig25 = objectMapper23.getSerializationConfig();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper26 = xmlMapper5.setMixInResolver((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver) serializationConfig25);
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature27 = null;
        com.fasterxml.jackson.databind.DeserializationFeature[] deserializationFeatureArray28 = new com.fasterxml.jackson.databind.DeserializationFeature[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader29 = objectMapper26.reader(deserializationFeature27, deserializationFeatureArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(deserializationContext10);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertNotNull(objectWriter12);
        org.junit.Assert.assertNotNull(objectMapper13);
        org.junit.Assert.assertNotNull(version18);
        org.junit.Assert.assertNotNull(objectWriter21);
        org.junit.Assert.assertNotNull(featureArray22);
        org.junit.Assert.assertNotNull(objectMapper23);
        org.junit.Assert.assertNotNull(objectMapper24);
        org.junit.Assert.assertNotNull(serializationConfig25);
        org.junit.Assert.assertNotNull(objectMapper26);
        org.junit.Assert.assertNotNull(deserializationFeatureArray28);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper9.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig11 = objectMapper9.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = objectMapper9.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory14 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory15 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory16 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec13, xMLInputFactory14, xMLOutputFactory15);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature17 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory18 = xmlFactory16.disable(feature17);
        com.fasterxml.jackson.core.Version version19 = xmlFactory18.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass20 = xmlFactory18.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer21 = serializerProvider12.getUnknownTypeSerializer(featureClass20);
        java.util.TimeZone timeZone22 = serializerProvider12.getTimeZone();
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory24 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory25 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory26 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec23, xMLInputFactory24, xMLOutputFactory25);
        com.fasterxml.jackson.core.JsonFactory jsonFactory28 = xmlFactory26.setRootValueSeparator("");
        java.io.DataOutput dataOutput29 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator30 = jsonFactory28.createGenerator(dataOutput29);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider32 = serializerProvider12.setAttribute((java.lang.Object) jsonFactory28, (java.lang.Object) ' ');
        com.fasterxml.jackson.core.ObjectCodec objectCodec33 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory34 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory35 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory36 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec33, xMLInputFactory34, xMLOutputFactory35);
        com.fasterxml.jackson.core.Version version37 = xmlFactory36.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper38 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory36);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes39 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter40 = xmlMapper38.writer(characterEscapes39);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray41 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper42 = xmlMapper38.disable(featureArray41);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper43 = objectMapper42.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig44 = objectMapper42.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider45 = objectMapper42.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec46 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory47 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory48 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory49 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec46, xMLInputFactory47, xMLOutputFactory48);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature50 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory51 = xmlFactory49.disable(feature50);
        com.fasterxml.jackson.core.Version version52 = xmlFactory51.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass53 = xmlFactory51.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer54 = serializerProvider45.getUnknownTypeSerializer(featureClass53);
        java.util.TimeZone timeZone55 = serializerProvider45.getTimeZone();
        com.fasterxml.jackson.core.ObjectCodec objectCodec56 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory57 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory58 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory59 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec56, xMLInputFactory57, xMLOutputFactory58);
        com.fasterxml.jackson.core.Version version60 = xmlFactory59.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper61 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory59);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes62 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter63 = xmlMapper61.writer(characterEscapes62);
        com.fasterxml.jackson.core.ObjectCodec objectCodec64 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory65 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory66 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory67 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec64, xMLInputFactory65, xMLOutputFactory66);
        com.fasterxml.jackson.core.Version version68 = xmlFactory67.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper69 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory67);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes70 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter71 = xmlMapper69.writer(characterEscapes70);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory72 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper73 = xmlMapper69.setNodeFactory(jsonNodeFactory72);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider74 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper75 = xmlMapper69.setFilterProvider(filterProvider74);
        com.fasterxml.jackson.core.JsonParser jsonParser76 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec77 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory78 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory79 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory80 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec77, xMLInputFactory78, xMLOutputFactory79);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature81 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory82 = xmlFactory80.disable(feature81);
        com.fasterxml.jackson.core.Version version83 = xmlFactory82.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass84 = xmlFactory82.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor85 = objectMapper75.readValues(jsonParser76, featureClass84);
        boolean boolean86 = xmlMapper61.canSerialize(featureClass84);
        com.fasterxml.jackson.databind.JavaType javaType87 = serializerProvider45.constructType((java.lang.reflect.Type) featureClass84);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass88 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType89 = serializerProvider12.constructSpecializedType(javaType87, featureClass88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(serializationConfig11);
        org.junit.Assert.assertNotNull(serializerProvider12);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature17.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory18);
        org.junit.Assert.assertNotNull(version19);
        org.junit.Assert.assertNotNull(featureClass20);
        org.junit.Assert.assertNotNull(objJsonSerializer21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(jsonFactory28);
        org.junit.Assert.assertNotNull(jsonGenerator30);
        org.junit.Assert.assertNotNull(serializerProvider32);
        org.junit.Assert.assertNotNull(version37);
        org.junit.Assert.assertNotNull(objectWriter40);
        org.junit.Assert.assertNotNull(featureArray41);
        org.junit.Assert.assertNotNull(objectMapper42);
        org.junit.Assert.assertNotNull(objectMapper43);
        org.junit.Assert.assertNotNull(serializationConfig44);
        org.junit.Assert.assertNotNull(serializerProvider45);
        org.junit.Assert.assertTrue("'" + feature50 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature50.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory51);
        org.junit.Assert.assertNotNull(version52);
        org.junit.Assert.assertNotNull(featureClass53);
        org.junit.Assert.assertNotNull(objJsonSerializer54);
        org.junit.Assert.assertNotNull(timeZone55);
        org.junit.Assert.assertEquals(timeZone55.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(version60);
        org.junit.Assert.assertNotNull(objectWriter63);
        org.junit.Assert.assertNotNull(version68);
        org.junit.Assert.assertNotNull(objectWriter71);
        org.junit.Assert.assertNotNull(objectMapper73);
        org.junit.Assert.assertNotNull(objectMapper75);
        org.junit.Assert.assertTrue("'" + feature81 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature81.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory82);
        org.junit.Assert.assertNotNull(version83);
        org.junit.Assert.assertNotNull(featureClass84);
        org.junit.Assert.assertNotNull(featureItor85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(javaType87);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.setNodeFactory(jsonNodeFactory8);
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory10 = new com.fasterxml.jackson.dataformat.xml.XmlFactory();
        com.fasterxml.jackson.databind.ObjectReader objectReader11 = xmlMapper5.readerForUpdating((java.lang.Object) xmlFactory10);
        java.io.File file12 = null;
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator14 = xmlFactory10.createGenerator(file12, jsonEncoding13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectReader11);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.disable(feature4);
        com.fasterxml.jackson.core.Version version6 = xmlFactory5.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper7 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory5);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass8 = xmlFactory5.getFormatReadFeatureType();
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNotNull(featureClass8);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper9.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig11 = objectMapper9.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = objectMapper9.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory14 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory15 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory16 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec13, xMLInputFactory14, xMLOutputFactory15);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature17 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory18 = xmlFactory16.disable(feature17);
        com.fasterxml.jackson.core.Version version19 = xmlFactory18.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass20 = xmlFactory18.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer21 = serializerProvider12.getUnknownTypeSerializer(featureClass20);
        boolean boolean22 = objJsonSerializer21.isUnwrappingSerializer();
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(serializationConfig11);
        org.junit.Assert.assertNotNull(serializerProvider12);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature17.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory18);
        org.junit.Assert.assertNotNull(version19);
        org.junit.Assert.assertNotNull(featureClass20);
        org.junit.Assert.assertNotNull(objJsonSerializer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        javax.xml.stream.XMLInputFactory xMLInputFactory0 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper1 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory0);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider2 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper3 = xmlMapper1.setSerializerProvider(defaultSerializerProvider2);
        org.junit.Assert.assertNotNull(objectMapper3);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.setNodeFactory(jsonNodeFactory8);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider10 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper11 = xmlMapper5.setFilterProvider(filterProvider10);
        com.fasterxml.jackson.core.JsonParser jsonParser12 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory14 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory15 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory16 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec13, xMLInputFactory14, xMLOutputFactory15);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature17 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory18 = xmlFactory16.disable(feature17);
        com.fasterxml.jackson.core.Version version19 = xmlFactory18.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass20 = xmlFactory18.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor21 = objectMapper11.readValues(jsonParser12, featureClass20);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector22 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector23 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair24 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector22, annotationIntrospector23);
        com.fasterxml.jackson.databind.introspect.Annotated annotated25 = null;
        java.lang.Boolean boolean26 = pair24.isOutputAsCData(annotated25);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector27 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector28 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair29 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector27, annotationIntrospector28);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector30 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector31 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair32 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector30, annotationIntrospector31);
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair33 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair((com.fasterxml.jackson.databind.AnnotationIntrospector) pair29, (com.fasterxml.jackson.databind.AnnotationIntrospector) pair32);
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair34 = com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair.instance((com.fasterxml.jackson.databind.AnnotationIntrospector) pair24, (com.fasterxml.jackson.databind.AnnotationIntrospector) pair33);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper35 = objectMapper11.setAnnotationIntrospector((com.fasterxml.jackson.databind.AnnotationIntrospector) pair33);
        com.fasterxml.jackson.databind.introspect.Annotated annotated36 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = pair33.findKeyDeserializer(annotated36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper11);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature17.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory18);
        org.junit.Assert.assertNotNull(version19);
        org.junit.Assert.assertNotNull(featureClass20);
        org.junit.Assert.assertNotNull(featureItor21);
        org.junit.Assert.assertNull(boolean26);
        org.junit.Assert.assertNotNull(pair34);
        org.junit.Assert.assertNotNull(objectMapper35);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.setNodeFactory(jsonNodeFactory8);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper12 = objectMapper9.configure(feature10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(objectMapper9);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper9.disableDefaultTyping();
        java.lang.reflect.Type type11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType12 = objectMapper9.constructType(type11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unrecognized Type: [null]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.setNodeFactory(jsonNodeFactory8);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider10 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper11 = xmlMapper5.setFilterProvider(filterProvider10);
        com.fasterxml.jackson.databind.InjectableValues injectableValues12 = objectMapper11.getInjectableValues();
        java.io.File file13 = null;
        // The following exception was thrown during execution in test generation
        try {
            objectMapper11.writeValue(file13, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper11);
        org.junit.Assert.assertNull(injectableValues12);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter10 = xmlMapper5.writer();
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider11 = null;
        xmlMapper5.setFilters(filterProvider11);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper13 = xmlMapper5.disableDefaultTyping();
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature14 = null;
        com.fasterxml.jackson.databind.DeserializationFeature[] deserializationFeatureArray15 = new com.fasterxml.jackson.databind.DeserializationFeature[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader16 = xmlMapper5.reader(deserializationFeature14, deserializationFeatureArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectWriter10);
        org.junit.Assert.assertNotNull(objectMapper13);
        org.junit.Assert.assertNotNull(deserializationFeatureArray15);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory7 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory8 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory9 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec6, xMLInputFactory7, xMLOutputFactory8);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature10 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean11 = xmlFactory9.isEnabled(feature10);
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory12 = xmlFactory3.enable(feature10);
        java.io.Reader reader13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser14 = xmlFactory12.createParser(reader13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertTrue("'" + feature10 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature10.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(xmlFactory12);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = xmlMapper5.getDeserializationContext();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory11 = new com.fasterxml.jackson.dataformat.xml.XmlFactory((com.fasterxml.jackson.core.ObjectCodec) xmlMapper5);
        char[] charArray15 = new char[] { ' ', '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser16 = xmlFactory11.createParser(charArray15);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: com.ctc.wstx.exc.WstxUnexpectedCharException: Unexpected character '4' (code 52) in prolog; expected '<'? at [row,col {unknown-source}]: [1,2]");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(deserializationContext10);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), " 4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), " 4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[ , 4, a]");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.disable(feature4);
        com.fasterxml.jackson.core.Version version6 = xmlFactory5.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper7 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory5);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature8 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper7.disable(feature8);
        boolean boolean10 = feature8.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertTrue("'" + feature8 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature8.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper10 = xmlMapper5.copy();
        java.text.DateFormat dateFormat11 = xmlMapper5.getDateFormat();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper12 = xmlMapper5.disableDefaultTyping();
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(xmlMapper10);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(objectMapper12);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        java.io.File file10 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory12 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory13 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory14 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec11, xMLInputFactory12, xMLOutputFactory13);
        com.fasterxml.jackson.core.Version version15 = xmlFactory14.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper16 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory14);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes17 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter18 = xmlMapper16.writer(characterEscapes17);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray19 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper20 = xmlMapper16.disable(featureArray19);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper21 = objectMapper20.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig22 = objectMapper20.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider23 = objectMapper20.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec24 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory25 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory26 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory27 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec24, xMLInputFactory25, xMLOutputFactory26);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature28 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory29 = xmlFactory27.disable(feature28);
        com.fasterxml.jackson.core.Version version30 = xmlFactory29.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass31 = xmlFactory29.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer32 = serializerProvider23.getUnknownTypeSerializer(featureClass31);
        java.util.TimeZone timeZone33 = serializerProvider23.getTimeZone();
        com.fasterxml.jackson.core.ObjectCodec objectCodec34 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory35 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory36 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory37 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec34, xMLInputFactory35, xMLOutputFactory36);
        com.fasterxml.jackson.core.Version version38 = xmlFactory37.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper39 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory37);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes40 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter41 = xmlMapper39.writer(characterEscapes40);
        com.fasterxml.jackson.core.ObjectCodec objectCodec42 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory43 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory44 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory45 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec42, xMLInputFactory43, xMLOutputFactory44);
        com.fasterxml.jackson.core.Version version46 = xmlFactory45.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper47 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory45);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes48 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter49 = xmlMapper47.writer(characterEscapes48);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory50 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper51 = xmlMapper47.setNodeFactory(jsonNodeFactory50);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider52 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper53 = xmlMapper47.setFilterProvider(filterProvider52);
        com.fasterxml.jackson.core.JsonParser jsonParser54 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec55 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory56 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory57 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory58 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec55, xMLInputFactory56, xMLOutputFactory57);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature59 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory60 = xmlFactory58.disable(feature59);
        com.fasterxml.jackson.core.Version version61 = xmlFactory60.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass62 = xmlFactory60.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor63 = objectMapper53.readValues(jsonParser54, featureClass62);
        boolean boolean64 = xmlMapper39.canSerialize(featureClass62);
        com.fasterxml.jackson.databind.JavaType javaType65 = serializerProvider23.constructType((java.lang.reflect.Type) featureClass62);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] beanPropertyWriterArray66 = xmlMapper5.readValue(file10, javaType65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(version15);
        org.junit.Assert.assertNotNull(objectWriter18);
        org.junit.Assert.assertNotNull(featureArray19);
        org.junit.Assert.assertNotNull(objectMapper20);
        org.junit.Assert.assertNotNull(objectMapper21);
        org.junit.Assert.assertNotNull(serializationConfig22);
        org.junit.Assert.assertNotNull(serializerProvider23);
        org.junit.Assert.assertTrue("'" + feature28 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature28.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory29);
        org.junit.Assert.assertNotNull(version30);
        org.junit.Assert.assertNotNull(featureClass31);
        org.junit.Assert.assertNotNull(objJsonSerializer32);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(version38);
        org.junit.Assert.assertNotNull(objectWriter41);
        org.junit.Assert.assertNotNull(version46);
        org.junit.Assert.assertNotNull(objectWriter49);
        org.junit.Assert.assertNotNull(objectMapper51);
        org.junit.Assert.assertNotNull(objectMapper53);
        org.junit.Assert.assertTrue("'" + feature59 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature59.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory60);
        org.junit.Assert.assertNotNull(version61);
        org.junit.Assert.assertNotNull(featureClass62);
        org.junit.Assert.assertNotNull(featureItor63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(javaType65);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping10 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper12 = objectMapper9.enableDefaultTypingAsProperty(defaultTyping10, "XML");
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy13 = objectMapper9.getPropertyNamingStrategy();
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider14 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter15 = objectMapper9.writer(filterProvider14);
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy16 = objectMapper9.getPropertyNamingStrategy();
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper12);
        org.junit.Assert.assertNull(propertyNamingStrategy13);
        org.junit.Assert.assertNotNull(objectWriter15);
        org.junit.Assert.assertNull(propertyNamingStrategy16);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = xmlMapper5.getDeserializationContext();
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping11 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper13 = xmlMapper5.enableDefaultTypingAsProperty(defaultTyping11, "");
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider14 = null;
        objectMapper13.setFilters(filterProvider14);
        com.fasterxml.jackson.core.JsonParser jsonParser16 = null;
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature feature18 = objectMapper13.readValue(jsonParser16, featureClass17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unrecognized Type: [null]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(deserializationContext10);
        org.junit.Assert.assertNotNull(objectMapper13);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = xmlMapper5.getDeserializationContext();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory11 = new com.fasterxml.jackson.dataformat.xml.XmlFactory((com.fasterxml.jackson.core.ObjectCodec) xmlMapper5);
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory13 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory14 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory15 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec12, xMLInputFactory13, xMLOutputFactory14);
        com.fasterxml.jackson.core.Version version16 = xmlFactory15.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper17 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory15);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes18 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter19 = xmlMapper17.writer(characterEscapes18);
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory21 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory22 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory23 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec20, xMLInputFactory21, xMLOutputFactory22);
        com.fasterxml.jackson.core.Version version24 = xmlFactory23.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper25 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory23);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes26 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter27 = xmlMapper25.writer(characterEscapes26);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory28 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper29 = xmlMapper25.setNodeFactory(jsonNodeFactory28);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider30 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper31 = xmlMapper25.setFilterProvider(filterProvider30);
        com.fasterxml.jackson.core.JsonParser jsonParser32 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec33 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory34 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory35 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory36 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec33, xMLInputFactory34, xMLOutputFactory35);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature37 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory38 = xmlFactory36.disable(feature37);
        com.fasterxml.jackson.core.Version version39 = xmlFactory38.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass40 = xmlFactory38.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor41 = objectMapper31.readValues(jsonParser32, featureClass40);
        boolean boolean42 = xmlMapper17.canSerialize(featureClass40);
        java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> throwableAtomicReference43 = null;
        boolean boolean44 = xmlMapper5.canSerialize(featureClass40, throwableAtomicReference43);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(deserializationContext10);
        org.junit.Assert.assertNotNull(version16);
        org.junit.Assert.assertNotNull(objectWriter19);
        org.junit.Assert.assertNotNull(version24);
        org.junit.Assert.assertNotNull(objectWriter27);
        org.junit.Assert.assertNotNull(objectMapper29);
        org.junit.Assert.assertNotNull(objectMapper31);
        org.junit.Assert.assertTrue("'" + feature37 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature37.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory38);
        org.junit.Assert.assertNotNull(version39);
        org.junit.Assert.assertNotNull(featureClass40);
        org.junit.Assert.assertNotNull(featureItor41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.setNodeFactory(jsonNodeFactory8);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider10 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper11 = xmlMapper5.setFilterProvider(filterProvider10);
        com.fasterxml.jackson.core.JsonParser jsonParser12 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory14 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory15 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory16 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec13, xMLInputFactory14, xMLOutputFactory15);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature17 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory18 = xmlFactory16.disable(feature17);
        com.fasterxml.jackson.core.Version version19 = xmlFactory18.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass20 = xmlFactory18.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor21 = objectMapper11.readValues(jsonParser12, featureClass20);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector22 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector23 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair24 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector22, annotationIntrospector23);
        com.fasterxml.jackson.databind.introspect.Annotated annotated25 = null;
        java.lang.Boolean boolean26 = pair24.isOutputAsCData(annotated25);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector27 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector28 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair29 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector27, annotationIntrospector28);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector30 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector31 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair32 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector30, annotationIntrospector31);
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair33 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair((com.fasterxml.jackson.databind.AnnotationIntrospector) pair29, (com.fasterxml.jackson.databind.AnnotationIntrospector) pair32);
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair34 = com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair.instance((com.fasterxml.jackson.databind.AnnotationIntrospector) pair24, (com.fasterxml.jackson.databind.AnnotationIntrospector) pair33);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper35 = objectMapper11.setAnnotationIntrospector((com.fasterxml.jackson.databind.AnnotationIntrospector) pair33);
        com.fasterxml.jackson.databind.SerializationFeature serializationFeature36 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper38 = objectMapper11.configure(serializationFeature36, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper11);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature17.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory18);
        org.junit.Assert.assertNotNull(version19);
        org.junit.Assert.assertNotNull(featureClass20);
        org.junit.Assert.assertNotNull(featureItor21);
        org.junit.Assert.assertNull(boolean26);
        org.junit.Assert.assertNotNull(pair34);
        org.junit.Assert.assertNotNull(objectMapper35);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.setNodeFactory(jsonNodeFactory8);
        com.fasterxml.jackson.databind.Module[] moduleArray10 = new com.fasterxml.jackson.databind.Module[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper11 = objectMapper9.registerModules(moduleArray10);
        com.fasterxml.jackson.core.JsonParser jsonParser12 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory14 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory15 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory16 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec13, xMLInputFactory14, xMLOutputFactory15);
        com.fasterxml.jackson.core.Version version17 = xmlFactory16.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper18 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory16);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes19 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter20 = xmlMapper18.writer(characterEscapes19);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray21 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper22 = xmlMapper18.disable(featureArray21);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper23 = objectMapper22.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig24 = objectMapper22.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider25 = objectMapper22.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec26 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory27 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory28 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory29 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec26, xMLInputFactory27, xMLOutputFactory28);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature30 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory31 = xmlFactory29.disable(feature30);
        com.fasterxml.jackson.core.Version version32 = xmlFactory31.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass33 = xmlFactory31.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer34 = serializerProvider25.getUnknownTypeSerializer(featureClass33);
        java.util.TimeZone timeZone35 = serializerProvider25.getTimeZone();
        com.fasterxml.jackson.core.ObjectCodec objectCodec36 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory37 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory38 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory39 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec36, xMLInputFactory37, xMLOutputFactory38);
        com.fasterxml.jackson.core.Version version40 = xmlFactory39.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper41 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory39);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes42 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter43 = xmlMapper41.writer(characterEscapes42);
        com.fasterxml.jackson.core.ObjectCodec objectCodec44 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory45 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory46 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory47 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec44, xMLInputFactory45, xMLOutputFactory46);
        com.fasterxml.jackson.core.Version version48 = xmlFactory47.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper49 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory47);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes50 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter51 = xmlMapper49.writer(characterEscapes50);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory52 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper53 = xmlMapper49.setNodeFactory(jsonNodeFactory52);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider54 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper55 = xmlMapper49.setFilterProvider(filterProvider54);
        com.fasterxml.jackson.core.JsonParser jsonParser56 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec57 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory58 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory59 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory60 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec57, xMLInputFactory58, xMLOutputFactory59);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature61 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory62 = xmlFactory60.disable(feature61);
        com.fasterxml.jackson.core.Version version63 = xmlFactory62.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass64 = xmlFactory62.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor65 = objectMapper55.readValues(jsonParser56, featureClass64);
        boolean boolean66 = xmlMapper41.canSerialize(featureClass64);
        com.fasterxml.jackson.databind.JavaType javaType67 = serializerProvider25.constructType((java.lang.reflect.Type) featureClass64);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ser.BeanSerializerModifier beanSerializerModifier68 = objectMapper9.readValue(jsonParser12, javaType67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(moduleArray10);
        org.junit.Assert.assertNotNull(objectMapper11);
        org.junit.Assert.assertNotNull(version17);
        org.junit.Assert.assertNotNull(objectWriter20);
        org.junit.Assert.assertNotNull(featureArray21);
        org.junit.Assert.assertNotNull(objectMapper22);
        org.junit.Assert.assertNotNull(objectMapper23);
        org.junit.Assert.assertNotNull(serializationConfig24);
        org.junit.Assert.assertNotNull(serializerProvider25);
        org.junit.Assert.assertTrue("'" + feature30 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature30.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory31);
        org.junit.Assert.assertNotNull(version32);
        org.junit.Assert.assertNotNull(featureClass33);
        org.junit.Assert.assertNotNull(objJsonSerializer34);
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(version40);
        org.junit.Assert.assertNotNull(objectWriter43);
        org.junit.Assert.assertNotNull(version48);
        org.junit.Assert.assertNotNull(objectWriter51);
        org.junit.Assert.assertNotNull(objectMapper53);
        org.junit.Assert.assertNotNull(objectMapper55);
        org.junit.Assert.assertTrue("'" + feature61 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature61.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory62);
        org.junit.Assert.assertNotNull(version63);
        org.junit.Assert.assertNotNull(featureClass64);
        org.junit.Assert.assertNotNull(featureItor65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(javaType67);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        int int10 = xmlMapper5.mixInCount();
        java.net.URL uRL11 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory13 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory14 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory15 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec12, xMLInputFactory13, xMLOutputFactory14);
        com.fasterxml.jackson.core.Version version16 = xmlFactory15.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper17 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory15);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes18 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter19 = xmlMapper17.writer(characterEscapes18);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray20 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper21 = xmlMapper17.disable(featureArray20);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper22 = xmlMapper17.copy();
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory24 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory25 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory26 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec23, xMLInputFactory24, xMLOutputFactory25);
        com.fasterxml.jackson.core.Version version27 = xmlFactory26.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper28 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory26);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes29 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter30 = xmlMapper28.writer(characterEscapes29);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray31 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper32 = xmlMapper28.disable(featureArray31);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper33 = objectMapper32.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig34 = objectMapper32.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider35 = objectMapper32.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec36 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory37 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory38 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory39 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec36, xMLInputFactory37, xMLOutputFactory38);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature40 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory41 = xmlFactory39.disable(feature40);
        com.fasterxml.jackson.core.Version version42 = xmlFactory41.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass43 = xmlFactory41.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer44 = serializerProvider35.getUnknownTypeSerializer(featureClass43);
        java.util.TimeZone timeZone45 = serializerProvider35.getTimeZone();
        com.fasterxml.jackson.core.ObjectCodec objectCodec46 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory47 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory48 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory49 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec46, xMLInputFactory47, xMLOutputFactory48);
        com.fasterxml.jackson.core.Version version50 = xmlFactory49.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper51 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory49);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes52 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter53 = xmlMapper51.writer(characterEscapes52);
        com.fasterxml.jackson.core.ObjectCodec objectCodec54 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory55 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory56 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory57 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec54, xMLInputFactory55, xMLOutputFactory56);
        com.fasterxml.jackson.core.Version version58 = xmlFactory57.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper59 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory57);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes60 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter61 = xmlMapper59.writer(characterEscapes60);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory62 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper63 = xmlMapper59.setNodeFactory(jsonNodeFactory62);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider64 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper65 = xmlMapper59.setFilterProvider(filterProvider64);
        com.fasterxml.jackson.core.JsonParser jsonParser66 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec67 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory68 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory69 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory70 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec67, xMLInputFactory68, xMLOutputFactory69);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature71 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory72 = xmlFactory70.disable(feature71);
        com.fasterxml.jackson.core.Version version73 = xmlFactory72.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass74 = xmlFactory72.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor75 = objectMapper65.readValues(jsonParser66, featureClass74);
        boolean boolean76 = xmlMapper51.canSerialize(featureClass74);
        com.fasterxml.jackson.databind.JavaType javaType77 = serializerProvider35.constructType((java.lang.reflect.Type) featureClass74);
        com.fasterxml.jackson.databind.ObjectReader objectReader78 = xmlMapper22.readerFor(javaType77);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Enum<com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature> featureEnum79 = xmlMapper5.readValue(uRL11, javaType77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(version16);
        org.junit.Assert.assertNotNull(objectWriter19);
        org.junit.Assert.assertNotNull(featureArray20);
        org.junit.Assert.assertNotNull(objectMapper21);
        org.junit.Assert.assertNotNull(xmlMapper22);
        org.junit.Assert.assertNotNull(version27);
        org.junit.Assert.assertNotNull(objectWriter30);
        org.junit.Assert.assertNotNull(featureArray31);
        org.junit.Assert.assertNotNull(objectMapper32);
        org.junit.Assert.assertNotNull(objectMapper33);
        org.junit.Assert.assertNotNull(serializationConfig34);
        org.junit.Assert.assertNotNull(serializerProvider35);
        org.junit.Assert.assertTrue("'" + feature40 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature40.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory41);
        org.junit.Assert.assertNotNull(version42);
        org.junit.Assert.assertNotNull(featureClass43);
        org.junit.Assert.assertNotNull(objJsonSerializer44);
        org.junit.Assert.assertNotNull(timeZone45);
        org.junit.Assert.assertEquals(timeZone45.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(version50);
        org.junit.Assert.assertNotNull(objectWriter53);
        org.junit.Assert.assertNotNull(version58);
        org.junit.Assert.assertNotNull(objectWriter61);
        org.junit.Assert.assertNotNull(objectMapper63);
        org.junit.Assert.assertNotNull(objectMapper65);
        org.junit.Assert.assertTrue("'" + feature71 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature71.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory72);
        org.junit.Assert.assertNotNull(version73);
        org.junit.Assert.assertNotNull(featureClass74);
        org.junit.Assert.assertNotNull(featureItor75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(javaType77);
        org.junit.Assert.assertNotNull(objectReader78);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter11 = objectMapper9.writerFor(javaType10);
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper13 = objectMapper9.disable(deserializationFeature12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectWriter11);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter10 = xmlMapper5.writer();
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider11 = null;
        xmlMapper5.setFilters(filterProvider11);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper13 = xmlMapper5.disableDefaultTyping();
        com.fasterxml.jackson.databind.ser.SerializerFactory serializerFactory14 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper15 = xmlMapper5.setSerializerFactory(serializerFactory14);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter16 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper17 = xmlMapper5.setDefaultPrettyPrinter(prettyPrinter16);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectWriter10);
        org.junit.Assert.assertNotNull(objectMapper13);
        org.junit.Assert.assertNotNull(objectMapper15);
        org.junit.Assert.assertNotNull(objectMapper17);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory9 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory10 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory11 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec8, xMLInputFactory9, xMLOutputFactory10);
        com.fasterxml.jackson.core.Version version12 = xmlFactory11.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper13 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory11);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes14 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter15 = xmlMapper13.writer(characterEscapes14);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray16 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper17 = xmlMapper13.disable(featureArray16);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper18 = objectMapper17.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig19 = objectMapper17.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider20 = objectMapper17.getSerializerProviderInstance();
        com.fasterxml.jackson.core.JsonParser.Feature[] featureArray21 = new com.fasterxml.jackson.core.JsonParser.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper22 = objectMapper17.enable(featureArray21);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper23 = xmlMapper5.disable(featureArray21);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNotNull(objectWriter15);
        org.junit.Assert.assertNotNull(featureArray16);
        org.junit.Assert.assertNotNull(objectMapper17);
        org.junit.Assert.assertNotNull(objectMapper18);
        org.junit.Assert.assertNotNull(serializationConfig19);
        org.junit.Assert.assertNotNull(serializerProvider20);
        org.junit.Assert.assertNotNull(featureArray21);
        org.junit.Assert.assertNotNull(objectMapper22);
        org.junit.Assert.assertNotNull(objectMapper23);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider8 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter9 = xmlMapper5.writer(filterProvider8);
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory11 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory12 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory13 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec10, xMLInputFactory11, xMLOutputFactory12);
        com.fasterxml.jackson.core.Version version14 = xmlFactory13.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper15 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory13);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes16 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter17 = xmlMapper15.writer(characterEscapes16);
        com.fasterxml.jackson.core.ObjectCodec objectCodec18 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory19 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory20 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory21 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec18, xMLInputFactory19, xMLOutputFactory20);
        com.fasterxml.jackson.core.Version version22 = xmlFactory21.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper23 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory21);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes24 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter25 = xmlMapper23.writer(characterEscapes24);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory26 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper27 = xmlMapper23.setNodeFactory(jsonNodeFactory26);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider28 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper29 = xmlMapper23.setFilterProvider(filterProvider28);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec31 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory32 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory33 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory34 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec31, xMLInputFactory32, xMLOutputFactory33);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature35 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory36 = xmlFactory34.disable(feature35);
        com.fasterxml.jackson.core.Version version37 = xmlFactory36.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass38 = xmlFactory36.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor39 = objectMapper29.readValues(jsonParser30, featureClass38);
        boolean boolean40 = xmlMapper15.canSerialize(featureClass38);
        boolean boolean41 = com.fasterxml.jackson.dataformat.xml.util.TypeUtil.isIndexedType(featureClass38);
        com.fasterxml.jackson.databind.JavaType javaType42 = xmlMapper5.constructType((java.lang.reflect.Type) featureClass38);
        boolean boolean43 = com.fasterxml.jackson.dataformat.xml.util.TypeUtil.isIndexedType(javaType42);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(objectWriter9);
        org.junit.Assert.assertNotNull(version14);
        org.junit.Assert.assertNotNull(objectWriter17);
        org.junit.Assert.assertNotNull(version22);
        org.junit.Assert.assertNotNull(objectWriter25);
        org.junit.Assert.assertNotNull(objectMapper27);
        org.junit.Assert.assertNotNull(objectMapper29);
        org.junit.Assert.assertTrue("'" + feature35 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature35.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory36);
        org.junit.Assert.assertNotNull(version37);
        org.junit.Assert.assertNotNull(featureClass38);
        org.junit.Assert.assertNotNull(featureItor39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(javaType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector0 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector2 = jacksonXmlAnnotationIntrospector0.setConstructorPropertiesImpliesCreator(false);
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory4 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory5 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory6 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec3, xMLInputFactory4, xMLOutputFactory5);
        com.fasterxml.jackson.core.Version version7 = xmlFactory6.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper8 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory6);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes9 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter10 = xmlMapper8.writer(characterEscapes9);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray11 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper12 = xmlMapper8.disable(featureArray11);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = xmlMapper8.getDeserializationContext();
        com.fasterxml.jackson.core.Version version14 = xmlMapper8.version();
        com.fasterxml.jackson.databind.ObjectWriter objectWriter15 = xmlMapper8.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper16 = xmlMapper8.enableDefaultTyping();
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider17 = null;
        xmlMapper8.setFilters(filterProvider17);
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig19 = xmlMapper8.getSerializationConfig();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass20 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec21 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory22 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory23 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory24 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec21, xMLInputFactory22, xMLOutputFactory23);
        com.fasterxml.jackson.core.Version version25 = xmlFactory24.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper26 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory24);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes27 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter28 = xmlMapper26.writer(characterEscapes27);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider29 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter30 = xmlMapper26.writer(filterProvider29);
        com.fasterxml.jackson.core.ObjectCodec objectCodec31 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory32 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory33 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory34 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec31, xMLInputFactory32, xMLOutputFactory33);
        com.fasterxml.jackson.core.Version version35 = xmlFactory34.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper36 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory34);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes37 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter38 = xmlMapper36.writer(characterEscapes37);
        com.fasterxml.jackson.core.ObjectCodec objectCodec39 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory40 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory41 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory42 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec39, xMLInputFactory40, xMLOutputFactory41);
        com.fasterxml.jackson.core.Version version43 = xmlFactory42.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper44 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory42);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes45 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter46 = xmlMapper44.writer(characterEscapes45);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory47 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper48 = xmlMapper44.setNodeFactory(jsonNodeFactory47);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider49 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper50 = xmlMapper44.setFilterProvider(filterProvider49);
        com.fasterxml.jackson.core.JsonParser jsonParser51 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec52 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory53 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory54 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory55 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec52, xMLInputFactory53, xMLOutputFactory54);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature56 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory57 = xmlFactory55.disable(feature56);
        com.fasterxml.jackson.core.Version version58 = xmlFactory57.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass59 = xmlFactory57.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor60 = objectMapper50.readValues(jsonParser51, featureClass59);
        boolean boolean61 = xmlMapper36.canSerialize(featureClass59);
        boolean boolean62 = com.fasterxml.jackson.dataformat.xml.util.TypeUtil.isIndexedType(featureClass59);
        com.fasterxml.jackson.databind.JavaType javaType63 = xmlMapper26.constructType((java.lang.reflect.Type) featureClass59);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder<?> wildcardTypeResolverBuilder64 = jacksonAnnotationIntrospector2.findTypeResolver((com.fasterxml.jackson.databind.cfg.MapperConfig<com.fasterxml.jackson.databind.SerializationConfig>) serializationConfig19, annotatedClass20, javaType63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector2);
        org.junit.Assert.assertNotNull(version7);
        org.junit.Assert.assertNotNull(objectWriter10);
        org.junit.Assert.assertNotNull(featureArray11);
        org.junit.Assert.assertNotNull(objectMapper12);
        org.junit.Assert.assertNotNull(deserializationContext13);
        org.junit.Assert.assertNotNull(version14);
        org.junit.Assert.assertNotNull(objectWriter15);
        org.junit.Assert.assertNotNull(objectMapper16);
        org.junit.Assert.assertNotNull(serializationConfig19);
        org.junit.Assert.assertNotNull(version25);
        org.junit.Assert.assertNotNull(objectWriter28);
        org.junit.Assert.assertNotNull(objectWriter30);
        org.junit.Assert.assertNotNull(version35);
        org.junit.Assert.assertNotNull(objectWriter38);
        org.junit.Assert.assertNotNull(version43);
        org.junit.Assert.assertNotNull(objectWriter46);
        org.junit.Assert.assertNotNull(objectMapper48);
        org.junit.Assert.assertNotNull(objectMapper50);
        org.junit.Assert.assertTrue("'" + feature56 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature56.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory57);
        org.junit.Assert.assertNotNull(version58);
        org.junit.Assert.assertNotNull(featureClass59);
        org.junit.Assert.assertNotNull(featureItor60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(javaType63);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper10 = xmlMapper5.copy();
        com.fasterxml.jackson.databind.ser.SerializerFactory serializerFactory11 = xmlMapper5.getSerializerFactory();
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(xmlMapper10);
        org.junit.Assert.assertNotNull(serializerFactory11);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode10 = objectMapper9.createArrayNode();
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(arrayNode10);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory4 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory5 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory6 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec3, xMLInputFactory4, xMLOutputFactory5);
        com.fasterxml.jackson.core.Version version7 = xmlFactory6.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper8 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory6);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes9 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter10 = xmlMapper8.writer(characterEscapes9);
        javax.xml.stream.XMLStreamReader xMLStreamReader11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser12 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 0, 1, (com.fasterxml.jackson.core.ObjectCodec) xmlMapper8, xMLStreamReader11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version7);
        org.junit.Assert.assertNotNull(objectWriter10);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair2 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector0, annotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        java.lang.Boolean boolean4 = pair2.isOutputAsCData(annotated3);
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory7 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory8 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory9 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec6, xMLInputFactory7, xMLOutputFactory8);
        com.fasterxml.jackson.core.Version version10 = xmlFactory9.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper11 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory9);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes12 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter13 = xmlMapper11.writer(characterEscapes12);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray14 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper15 = xmlMapper11.disable(featureArray14);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper16 = xmlMapper11.copy();
        com.fasterxml.jackson.core.ObjectCodec objectCodec17 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory18 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory19 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory20 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec17, xMLInputFactory18, xMLOutputFactory19);
        com.fasterxml.jackson.core.Version version21 = xmlFactory20.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper22 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory20);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes23 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter24 = xmlMapper22.writer(characterEscapes23);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray25 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper26 = xmlMapper22.disable(featureArray25);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper27 = objectMapper26.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig28 = objectMapper26.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider29 = objectMapper26.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory31 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory32 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory33 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec30, xMLInputFactory31, xMLOutputFactory32);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature34 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory35 = xmlFactory33.disable(feature34);
        com.fasterxml.jackson.core.Version version36 = xmlFactory35.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass37 = xmlFactory35.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer38 = serializerProvider29.getUnknownTypeSerializer(featureClass37);
        java.util.TimeZone timeZone39 = serializerProvider29.getTimeZone();
        com.fasterxml.jackson.core.ObjectCodec objectCodec40 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory41 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory42 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory43 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec40, xMLInputFactory41, xMLOutputFactory42);
        com.fasterxml.jackson.core.Version version44 = xmlFactory43.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper45 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory43);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes46 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter47 = xmlMapper45.writer(characterEscapes46);
        com.fasterxml.jackson.core.ObjectCodec objectCodec48 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory49 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory50 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory51 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec48, xMLInputFactory49, xMLOutputFactory50);
        com.fasterxml.jackson.core.Version version52 = xmlFactory51.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper53 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory51);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes54 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter55 = xmlMapper53.writer(characterEscapes54);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory56 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper57 = xmlMapper53.setNodeFactory(jsonNodeFactory56);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider58 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper59 = xmlMapper53.setFilterProvider(filterProvider58);
        com.fasterxml.jackson.core.JsonParser jsonParser60 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec61 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory62 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory63 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory64 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec61, xMLInputFactory62, xMLOutputFactory63);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature65 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory66 = xmlFactory64.disable(feature65);
        com.fasterxml.jackson.core.Version version67 = xmlFactory66.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass68 = xmlFactory66.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor69 = objectMapper59.readValues(jsonParser60, featureClass68);
        boolean boolean70 = xmlMapper45.canSerialize(featureClass68);
        com.fasterxml.jackson.databind.JavaType javaType71 = serializerProvider29.constructType((java.lang.reflect.Type) featureClass68);
        com.fasterxml.jackson.databind.ObjectReader objectReader72 = xmlMapper16.readerFor(javaType71);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass73 = pair2.findSerializationKeyType(annotated5, javaType71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNotNull(version10);
        org.junit.Assert.assertNotNull(objectWriter13);
        org.junit.Assert.assertNotNull(featureArray14);
        org.junit.Assert.assertNotNull(objectMapper15);
        org.junit.Assert.assertNotNull(xmlMapper16);
        org.junit.Assert.assertNotNull(version21);
        org.junit.Assert.assertNotNull(objectWriter24);
        org.junit.Assert.assertNotNull(featureArray25);
        org.junit.Assert.assertNotNull(objectMapper26);
        org.junit.Assert.assertNotNull(objectMapper27);
        org.junit.Assert.assertNotNull(serializationConfig28);
        org.junit.Assert.assertNotNull(serializerProvider29);
        org.junit.Assert.assertTrue("'" + feature34 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature34.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory35);
        org.junit.Assert.assertNotNull(version36);
        org.junit.Assert.assertNotNull(featureClass37);
        org.junit.Assert.assertNotNull(objJsonSerializer38);
        org.junit.Assert.assertNotNull(timeZone39);
        org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(version44);
        org.junit.Assert.assertNotNull(objectWriter47);
        org.junit.Assert.assertNotNull(version52);
        org.junit.Assert.assertNotNull(objectWriter55);
        org.junit.Assert.assertNotNull(objectMapper57);
        org.junit.Assert.assertNotNull(objectMapper59);
        org.junit.Assert.assertTrue("'" + feature65 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature65.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory66);
        org.junit.Assert.assertNotNull(version67);
        org.junit.Assert.assertNotNull(featureClass68);
        org.junit.Assert.assertNotNull(featureItor69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(javaType71);
        org.junit.Assert.assertNotNull(objectReader72);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.disable(feature4);
        com.fasterxml.jackson.core.Version version6 = xmlFactory5.version();
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = xmlFactory5.getCodec();
        com.fasterxml.jackson.dataformat.xml.JacksonXmlModule jacksonXmlModule8 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper9 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory5, jacksonXmlModule8);
        com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature feature10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = xmlFactory5.isEnabled(feature10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNull(objectCodec7);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper9.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig11 = objectMapper9.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = objectMapper9.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory14 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory15 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory16 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec13, xMLInputFactory14, xMLOutputFactory15);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature17 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory18 = xmlFactory16.disable(feature17);
        com.fasterxml.jackson.core.Version version19 = xmlFactory18.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass20 = xmlFactory18.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer21 = serializerProvider12.getUnknownTypeSerializer(featureClass20);
        java.util.TimeZone timeZone22 = serializerProvider12.getTimeZone();
        com.fasterxml.jackson.databind.BeanDescription beanDescription23 = null;
        com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition beanPropertyDefinition24 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] beanPropertyWriterArray26 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] {};
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] beanPropertyWriterArray27 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] {};
        int int28 = com.fasterxml.jackson.dataformat.xml.ser.XmlBeanSerializerBase._orderAttributesFirst(beanPropertyWriterArray26, beanPropertyWriterArray27);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence29 = serializerProvider12.reportBadPropertyDefinition(beanDescription23, beanPropertyDefinition24, "XML", (java.lang.Object[]) beanPropertyWriterArray27);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.JsonMappingException; message: Invalid definition for property N/A (of type N/A): XML");
        } catch (com.fasterxml.jackson.databind.JsonMappingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(serializationConfig11);
        org.junit.Assert.assertNotNull(serializerProvider12);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature17.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory18);
        org.junit.Assert.assertNotNull(version19);
        org.junit.Assert.assertNotNull(featureClass20);
        org.junit.Assert.assertNotNull(objJsonSerializer21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(beanPropertyWriterArray26);
        org.junit.Assert.assertNotNull(beanPropertyWriterArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        javax.xml.stream.XMLInputFactory xMLInputFactory0 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory1 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper2 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory0, xMLOutputFactory1);
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory5 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory6 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory7 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec4, xMLInputFactory5, xMLOutputFactory6);
        com.fasterxml.jackson.core.Version version8 = xmlFactory7.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper9 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory7);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes10 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter11 = xmlMapper9.writer(characterEscapes10);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray12 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper13 = xmlMapper9.disable(featureArray12);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper14 = xmlMapper9.copy();
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory16 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory17 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory18 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec15, xMLInputFactory16, xMLOutputFactory17);
        com.fasterxml.jackson.core.Version version19 = xmlFactory18.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper20 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory18);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes21 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter22 = xmlMapper20.writer(characterEscapes21);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray23 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper24 = xmlMapper20.disable(featureArray23);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper25 = objectMapper24.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig26 = objectMapper24.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider27 = objectMapper24.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec28 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory29 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory30 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory31 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec28, xMLInputFactory29, xMLOutputFactory30);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature32 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory33 = xmlFactory31.disable(feature32);
        com.fasterxml.jackson.core.Version version34 = xmlFactory33.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass35 = xmlFactory33.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer36 = serializerProvider27.getUnknownTypeSerializer(featureClass35);
        java.util.TimeZone timeZone37 = serializerProvider27.getTimeZone();
        com.fasterxml.jackson.core.ObjectCodec objectCodec38 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory39 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory40 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory41 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec38, xMLInputFactory39, xMLOutputFactory40);
        com.fasterxml.jackson.core.Version version42 = xmlFactory41.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper43 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory41);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes44 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter45 = xmlMapper43.writer(characterEscapes44);
        com.fasterxml.jackson.core.ObjectCodec objectCodec46 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory47 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory48 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory49 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec46, xMLInputFactory47, xMLOutputFactory48);
        com.fasterxml.jackson.core.Version version50 = xmlFactory49.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper51 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory49);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes52 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter53 = xmlMapper51.writer(characterEscapes52);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory54 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper55 = xmlMapper51.setNodeFactory(jsonNodeFactory54);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider56 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper57 = xmlMapper51.setFilterProvider(filterProvider56);
        com.fasterxml.jackson.core.JsonParser jsonParser58 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec59 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory60 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory61 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory62 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec59, xMLInputFactory60, xMLOutputFactory61);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature63 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory64 = xmlFactory62.disable(feature63);
        com.fasterxml.jackson.core.Version version65 = xmlFactory64.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass66 = xmlFactory64.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor67 = objectMapper57.readValues(jsonParser58, featureClass66);
        boolean boolean68 = xmlMapper43.canSerialize(featureClass66);
        com.fasterxml.jackson.databind.JavaType javaType69 = serializerProvider27.constructType((java.lang.reflect.Type) featureClass66);
        com.fasterxml.jackson.databind.ObjectReader objectReader70 = xmlMapper14.readerFor(javaType69);
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.databind.cfg.MapperConfigBase<com.fasterxml.jackson.databind.SerializationFeature, com.fasterxml.jackson.databind.SerializationConfig>> serializationFeatureMapperConfigBaseItor71 = xmlMapper2.readValues(jsonParser3, javaType69);
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertNotNull(objectWriter11);
        org.junit.Assert.assertNotNull(featureArray12);
        org.junit.Assert.assertNotNull(objectMapper13);
        org.junit.Assert.assertNotNull(xmlMapper14);
        org.junit.Assert.assertNotNull(version19);
        org.junit.Assert.assertNotNull(objectWriter22);
        org.junit.Assert.assertNotNull(featureArray23);
        org.junit.Assert.assertNotNull(objectMapper24);
        org.junit.Assert.assertNotNull(objectMapper25);
        org.junit.Assert.assertNotNull(serializationConfig26);
        org.junit.Assert.assertNotNull(serializerProvider27);
        org.junit.Assert.assertTrue("'" + feature32 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature32.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory33);
        org.junit.Assert.assertNotNull(version34);
        org.junit.Assert.assertNotNull(featureClass35);
        org.junit.Assert.assertNotNull(objJsonSerializer36);
        org.junit.Assert.assertNotNull(timeZone37);
        org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(version42);
        org.junit.Assert.assertNotNull(objectWriter45);
        org.junit.Assert.assertNotNull(version50);
        org.junit.Assert.assertNotNull(objectWriter53);
        org.junit.Assert.assertNotNull(objectMapper55);
        org.junit.Assert.assertNotNull(objectMapper57);
        org.junit.Assert.assertTrue("'" + feature63 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature63.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory64);
        org.junit.Assert.assertNotNull(version65);
        org.junit.Assert.assertNotNull(featureClass66);
        org.junit.Assert.assertNotNull(featureItor67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(javaType69);
        org.junit.Assert.assertNotNull(objectReader70);
        org.junit.Assert.assertNotNull(serializationFeatureMapperConfigBaseItor71);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair2 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector0, annotationIntrospector1);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector3 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector4 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair5 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector3, annotationIntrospector4);
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair6 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair((com.fasterxml.jackson.databind.AnnotationIntrospector) pair2, (com.fasterxml.jackson.databind.AnnotationIntrospector) pair5);
        pair6.setDefaultUseWrapper(true);
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory11 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory12 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory13 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec10, xMLInputFactory11, xMLOutputFactory12);
        com.fasterxml.jackson.core.Version version14 = xmlFactory13.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper15 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory13);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes16 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter17 = xmlMapper15.writer(characterEscapes16);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray18 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper19 = xmlMapper15.disable(featureArray18);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper20 = objectMapper19.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig21 = objectMapper19.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider22 = objectMapper19.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory24 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory25 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory26 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec23, xMLInputFactory24, xMLOutputFactory25);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature27 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory28 = xmlFactory26.disable(feature27);
        com.fasterxml.jackson.core.Version version29 = xmlFactory28.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass30 = xmlFactory28.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer31 = serializerProvider22.getUnknownTypeSerializer(featureClass30);
        com.fasterxml.jackson.core.ObjectCodec objectCodec32 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory33 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory34 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory35 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec32, xMLInputFactory33, xMLOutputFactory34);
        com.fasterxml.jackson.core.Version version36 = xmlFactory35.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper37 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory35);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes38 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter39 = xmlMapper37.writer(characterEscapes38);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory40 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper41 = xmlMapper37.setNodeFactory(jsonNodeFactory40);
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory42 = new com.fasterxml.jackson.dataformat.xml.XmlFactory();
        com.fasterxml.jackson.databind.ObjectReader objectReader43 = xmlMapper37.readerForUpdating((java.lang.Object) xmlFactory42);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature> featureClass44 = xmlFactory42.getFormatWriteFeatureType();
        com.fasterxml.jackson.databind.JavaType javaType45 = serializerProvider22.constructType((java.lang.reflect.Type) featureClass44);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass46 = pair6.findDeserializationType(annotated9, javaType45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version14);
        org.junit.Assert.assertNotNull(objectWriter17);
        org.junit.Assert.assertNotNull(featureArray18);
        org.junit.Assert.assertNotNull(objectMapper19);
        org.junit.Assert.assertNotNull(objectMapper20);
        org.junit.Assert.assertNotNull(serializationConfig21);
        org.junit.Assert.assertNotNull(serializerProvider22);
        org.junit.Assert.assertTrue("'" + feature27 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature27.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory28);
        org.junit.Assert.assertNotNull(version29);
        org.junit.Assert.assertNotNull(featureClass30);
        org.junit.Assert.assertNotNull(objJsonSerializer31);
        org.junit.Assert.assertNotNull(version36);
        org.junit.Assert.assertNotNull(objectWriter39);
        org.junit.Assert.assertNotNull(objectMapper41);
        org.junit.Assert.assertNotNull(objectReader43);
        org.junit.Assert.assertNotNull(featureClass44);
        org.junit.Assert.assertNotNull(javaType45);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper10 = xmlMapper5.copy();
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping11 = null;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper13 = xmlMapper10.enableDefaultTyping(defaultTyping11, as12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: includeAs can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(xmlMapper10);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper9.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig11 = objectMapper9.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = objectMapper9.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory14 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory15 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory16 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec13, xMLInputFactory14, xMLOutputFactory15);
        com.fasterxml.jackson.core.Version version17 = xmlFactory16.version();
        com.fasterxml.jackson.core.ObjectCodec objectCodec18 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory19 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory20 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory21 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec18, xMLInputFactory19, xMLOutputFactory20);
        com.fasterxml.jackson.core.JsonFactory jsonFactory23 = xmlFactory21.setRootValueSeparator("");
        java.io.DataOutput dataOutput24 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator25 = jsonFactory23.createGenerator(dataOutput24);
        boolean boolean26 = jsonGenerator25.canWriteTypeId();
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes27 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator28 = jsonGenerator25.setCharacterEscapes(characterEscapes27);
        boolean boolean29 = jsonGenerator25.canWriteBinaryNatively();
        com.fasterxml.jackson.core.FormatSchema formatSchema30 = jsonGenerator25.getSchema();
        // The following exception was thrown during execution in test generation
        try {
            serializerProvider12.defaultSerializeValue((java.lang.Object) xmlFactory16, jsonGenerator25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No element/attribute name specified when trying to output element");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(serializationConfig11);
        org.junit.Assert.assertNotNull(serializerProvider12);
        org.junit.Assert.assertNotNull(version17);
        org.junit.Assert.assertNotNull(jsonFactory23);
        org.junit.Assert.assertNotNull(jsonGenerator25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jsonGenerator28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(formatSchema30);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory10 = null;
        com.fasterxml.jackson.databind.ObjectReader objectReader11 = xmlMapper5.reader(jsonNodeFactory10);
        javax.xml.stream.XMLInputFactory xMLInputFactory12 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper13 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = xmlMapper13.getTypeFactory();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper15 = xmlMapper5.setTypeFactory(typeFactory14);
        com.fasterxml.jackson.core.JsonParser jsonParser16 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec17 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory18 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory19 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory20 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec17, xMLInputFactory18, xMLOutputFactory19);
        com.fasterxml.jackson.core.Version version21 = xmlFactory20.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper22 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory20);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes23 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter24 = xmlMapper22.writer(characterEscapes23);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider25 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter26 = xmlMapper22.writer(filterProvider25);
        com.fasterxml.jackson.core.ObjectCodec objectCodec27 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory28 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory29 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory30 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec27, xMLInputFactory28, xMLOutputFactory29);
        com.fasterxml.jackson.core.Version version31 = xmlFactory30.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper32 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory30);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes33 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter34 = xmlMapper32.writer(characterEscapes33);
        com.fasterxml.jackson.core.ObjectCodec objectCodec35 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory36 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory37 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory38 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec35, xMLInputFactory36, xMLOutputFactory37);
        com.fasterxml.jackson.core.Version version39 = xmlFactory38.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper40 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory38);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes41 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter42 = xmlMapper40.writer(characterEscapes41);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory43 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper44 = xmlMapper40.setNodeFactory(jsonNodeFactory43);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider45 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper46 = xmlMapper40.setFilterProvider(filterProvider45);
        com.fasterxml.jackson.core.JsonParser jsonParser47 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec48 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory49 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory50 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory51 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec48, xMLInputFactory49, xMLOutputFactory50);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature52 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory53 = xmlFactory51.disable(feature52);
        com.fasterxml.jackson.core.Version version54 = xmlFactory53.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass55 = xmlFactory53.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor56 = objectMapper46.readValues(jsonParser47, featureClass55);
        boolean boolean57 = xmlMapper32.canSerialize(featureClass55);
        boolean boolean58 = com.fasterxml.jackson.dataformat.xml.util.TypeUtil.isIndexedType(featureClass55);
        com.fasterxml.jackson.databind.JavaType javaType59 = xmlMapper22.constructType((java.lang.reflect.Type) featureClass55);
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.core.TreeCodec> treeCodecItor60 = xmlMapper5.readValues(jsonParser16, javaType59);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectReader11);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNotNull(objectMapper15);
        org.junit.Assert.assertNotNull(version21);
        org.junit.Assert.assertNotNull(objectWriter24);
        org.junit.Assert.assertNotNull(objectWriter26);
        org.junit.Assert.assertNotNull(version31);
        org.junit.Assert.assertNotNull(objectWriter34);
        org.junit.Assert.assertNotNull(version39);
        org.junit.Assert.assertNotNull(objectWriter42);
        org.junit.Assert.assertNotNull(objectMapper44);
        org.junit.Assert.assertNotNull(objectMapper46);
        org.junit.Assert.assertTrue("'" + feature52 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature52.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory53);
        org.junit.Assert.assertNotNull(version54);
        org.junit.Assert.assertNotNull(featureClass55);
        org.junit.Assert.assertNotNull(featureItor56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(javaType59);
        org.junit.Assert.assertNotNull(treeCodecItor60);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory7 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory8 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory9 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec6, xMLInputFactory7, xMLOutputFactory8);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature10 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean11 = xmlFactory9.isEnabled(feature10);
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory12 = xmlFactory3.enable(feature10);
        boolean boolean13 = feature10.enabledByDefault();
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertTrue("'" + feature10 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature10.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(xmlFactory12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter8 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.setDefaultPrettyPrinter(prettyPrinter8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper9.enableDefaultTyping();
        java.io.InputStream inputStream11 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory13 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory14 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory15 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec12, xMLInputFactory13, xMLOutputFactory14);
        com.fasterxml.jackson.core.Version version16 = xmlFactory15.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper17 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory15);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes18 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter19 = xmlMapper17.writer(characterEscapes18);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray20 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper21 = xmlMapper17.disable(featureArray20);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper22 = objectMapper21.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig23 = objectMapper21.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider24 = objectMapper21.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec25 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory26 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory27 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory28 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec25, xMLInputFactory26, xMLOutputFactory27);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature29 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory30 = xmlFactory28.disable(feature29);
        com.fasterxml.jackson.core.Version version31 = xmlFactory30.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass32 = xmlFactory30.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer33 = serializerProvider24.getUnknownTypeSerializer(featureClass32);
        java.util.TimeZone timeZone34 = serializerProvider24.getTimeZone();
        com.fasterxml.jackson.core.ObjectCodec objectCodec35 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory36 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory37 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory38 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec35, xMLInputFactory36, xMLOutputFactory37);
        com.fasterxml.jackson.core.Version version39 = xmlFactory38.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper40 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory38);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes41 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter42 = xmlMapper40.writer(characterEscapes41);
        com.fasterxml.jackson.core.ObjectCodec objectCodec43 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory44 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory45 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory46 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec43, xMLInputFactory44, xMLOutputFactory45);
        com.fasterxml.jackson.core.Version version47 = xmlFactory46.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper48 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory46);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes49 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter50 = xmlMapper48.writer(characterEscapes49);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory51 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper52 = xmlMapper48.setNodeFactory(jsonNodeFactory51);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider53 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper54 = xmlMapper48.setFilterProvider(filterProvider53);
        com.fasterxml.jackson.core.JsonParser jsonParser55 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec56 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory57 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory58 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory59 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec56, xMLInputFactory57, xMLOutputFactory58);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature60 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory61 = xmlFactory59.disable(feature60);
        com.fasterxml.jackson.core.Version version62 = xmlFactory61.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass63 = xmlFactory61.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor64 = objectMapper54.readValues(jsonParser55, featureClass63);
        boolean boolean65 = xmlMapper40.canSerialize(featureClass63);
        com.fasterxml.jackson.databind.BeanProperty beanProperty66 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer67 = serializerProvider24.findKeySerializer(featureClass63, beanProperty66);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature feature68 = objectMapper9.readValue(inputStream11, featureClass63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null InputStream is not a valid argument");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(version16);
        org.junit.Assert.assertNotNull(objectWriter19);
        org.junit.Assert.assertNotNull(featureArray20);
        org.junit.Assert.assertNotNull(objectMapper21);
        org.junit.Assert.assertNotNull(objectMapper22);
        org.junit.Assert.assertNotNull(serializationConfig23);
        org.junit.Assert.assertNotNull(serializerProvider24);
        org.junit.Assert.assertTrue("'" + feature29 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature29.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory30);
        org.junit.Assert.assertNotNull(version31);
        org.junit.Assert.assertNotNull(featureClass32);
        org.junit.Assert.assertNotNull(objJsonSerializer33);
        org.junit.Assert.assertNotNull(timeZone34);
        org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(version39);
        org.junit.Assert.assertNotNull(objectWriter42);
        org.junit.Assert.assertNotNull(version47);
        org.junit.Assert.assertNotNull(objectWriter50);
        org.junit.Assert.assertNotNull(objectMapper52);
        org.junit.Assert.assertNotNull(objectMapper54);
        org.junit.Assert.assertTrue("'" + feature60 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature60.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory61);
        org.junit.Assert.assertNotNull(version62);
        org.junit.Assert.assertNotNull(featureClass63);
        org.junit.Assert.assertNotNull(featureItor64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(objJsonSerializer67);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = xmlMapper5.getDeserializationContext();
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping11 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper13 = xmlMapper5.enableDefaultTypingAsProperty(defaultTyping11, "");
        java.io.InputStream inputStream14 = null;
        com.fasterxml.jackson.core.type.TypeReference typeReference15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] beanPropertyWriterArray16 = objectMapper13.readValue(inputStream14, typeReference15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null InputStream is not a valid argument");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(deserializationContext10);
        org.junit.Assert.assertNotNull(objectMapper13);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter10 = xmlMapper5.writer();
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider11 = null;
        xmlMapper5.setFilters(filterProvider11);
        java.io.InputStream inputStream13 = null;
        com.fasterxml.jackson.core.type.TypeReference typeReference14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode15 = xmlMapper5.readValue(inputStream13, typeReference14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null InputStream is not a valid argument");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectWriter10);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter8 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.setDefaultPrettyPrinter(prettyPrinter8);
        byte[] byteArray10 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory12 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory13 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory14 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec11, xMLInputFactory12, xMLOutputFactory13);
        com.fasterxml.jackson.core.Version version15 = xmlFactory14.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper16 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory14);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes17 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter18 = xmlMapper16.writer(characterEscapes17);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray19 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper20 = xmlMapper16.disable(featureArray19);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper21 = objectMapper20.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig22 = objectMapper20.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider23 = objectMapper20.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec24 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory25 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory26 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory27 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec24, xMLInputFactory25, xMLOutputFactory26);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature28 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory29 = xmlFactory27.disable(feature28);
        com.fasterxml.jackson.core.Version version30 = xmlFactory29.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass31 = xmlFactory29.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer32 = serializerProvider23.getUnknownTypeSerializer(featureClass31);
        java.util.TimeZone timeZone33 = serializerProvider23.getTimeZone();
        com.fasterxml.jackson.core.ObjectCodec objectCodec34 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory35 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory36 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory37 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec34, xMLInputFactory35, xMLOutputFactory36);
        com.fasterxml.jackson.core.Version version38 = xmlFactory37.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper39 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory37);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes40 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter41 = xmlMapper39.writer(characterEscapes40);
        com.fasterxml.jackson.core.ObjectCodec objectCodec42 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory43 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory44 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory45 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec42, xMLInputFactory43, xMLOutputFactory44);
        com.fasterxml.jackson.core.Version version46 = xmlFactory45.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper47 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory45);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes48 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter49 = xmlMapper47.writer(characterEscapes48);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory50 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper51 = xmlMapper47.setNodeFactory(jsonNodeFactory50);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider52 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper53 = xmlMapper47.setFilterProvider(filterProvider52);
        com.fasterxml.jackson.core.JsonParser jsonParser54 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec55 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory56 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory57 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory58 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec55, xMLInputFactory56, xMLOutputFactory57);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature59 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory60 = xmlFactory58.disable(feature59);
        com.fasterxml.jackson.core.Version version61 = xmlFactory60.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass62 = xmlFactory60.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor63 = objectMapper53.readValues(jsonParser54, featureClass62);
        boolean boolean64 = xmlMapper39.canSerialize(featureClass62);
        com.fasterxml.jackson.databind.BeanProperty beanProperty65 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer66 = serializerProvider23.findKeySerializer(featureClass62, beanProperty65);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature feature67 = xmlMapper5.readValue(byteArray10, featureClass62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(version15);
        org.junit.Assert.assertNotNull(objectWriter18);
        org.junit.Assert.assertNotNull(featureArray19);
        org.junit.Assert.assertNotNull(objectMapper20);
        org.junit.Assert.assertNotNull(objectMapper21);
        org.junit.Assert.assertNotNull(serializationConfig22);
        org.junit.Assert.assertNotNull(serializerProvider23);
        org.junit.Assert.assertTrue("'" + feature28 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature28.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory29);
        org.junit.Assert.assertNotNull(version30);
        org.junit.Assert.assertNotNull(featureClass31);
        org.junit.Assert.assertNotNull(objJsonSerializer32);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(version38);
        org.junit.Assert.assertNotNull(objectWriter41);
        org.junit.Assert.assertNotNull(version46);
        org.junit.Assert.assertNotNull(objectWriter49);
        org.junit.Assert.assertNotNull(objectMapper51);
        org.junit.Assert.assertNotNull(objectMapper53);
        org.junit.Assert.assertTrue("'" + feature59 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature59.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory60);
        org.junit.Assert.assertNotNull(version61);
        org.junit.Assert.assertNotNull(featureClass62);
        org.junit.Assert.assertNotNull(featureItor63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(objJsonSerializer66);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector0 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector2 = jacksonXmlAnnotationIntrospector0.setConstructorPropertiesImpliesCreator(false);
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory4 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory5 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory6 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec3, xMLInputFactory4, xMLOutputFactory5);
        com.fasterxml.jackson.core.Version version7 = xmlFactory6.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper8 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory6);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes9 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter10 = xmlMapper8.writer(characterEscapes9);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray11 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper12 = xmlMapper8.disable(featureArray11);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = xmlMapper8.getDeserializationContext();
        com.fasterxml.jackson.core.Version version14 = xmlMapper8.version();
        com.fasterxml.jackson.databind.ObjectWriter objectWriter15 = xmlMapper8.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper16 = xmlMapper8.enableDefaultTyping();
        com.fasterxml.jackson.core.ObjectCodec objectCodec17 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory18 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory19 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory20 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec17, xMLInputFactory18, xMLOutputFactory19);
        com.fasterxml.jackson.core.Version version21 = xmlFactory20.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper22 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory20);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes23 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter24 = xmlMapper22.writer(characterEscapes23);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray25 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper26 = xmlMapper22.disable(featureArray25);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper27 = objectMapper26.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig28 = objectMapper26.getSerializationConfig();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper29 = xmlMapper8.setMixInResolver((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver) serializationConfig28);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember30 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec31 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory32 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory33 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory34 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec31, xMLInputFactory32, xMLOutputFactory33);
        com.fasterxml.jackson.core.Version version35 = xmlFactory34.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper36 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory34);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes37 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter38 = xmlMapper36.writer(characterEscapes37);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider39 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter40 = xmlMapper36.writer(filterProvider39);
        com.fasterxml.jackson.core.ObjectCodec objectCodec41 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory42 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory43 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory44 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec41, xMLInputFactory42, xMLOutputFactory43);
        com.fasterxml.jackson.core.Version version45 = xmlFactory44.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper46 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory44);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes47 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter48 = xmlMapper46.writer(characterEscapes47);
        com.fasterxml.jackson.core.ObjectCodec objectCodec49 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory50 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory51 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory52 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec49, xMLInputFactory50, xMLOutputFactory51);
        com.fasterxml.jackson.core.Version version53 = xmlFactory52.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper54 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory52);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes55 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter56 = xmlMapper54.writer(characterEscapes55);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory57 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper58 = xmlMapper54.setNodeFactory(jsonNodeFactory57);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider59 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper60 = xmlMapper54.setFilterProvider(filterProvider59);
        com.fasterxml.jackson.core.JsonParser jsonParser61 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec62 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory63 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory64 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory65 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec62, xMLInputFactory63, xMLOutputFactory64);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature66 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory67 = xmlFactory65.disable(feature66);
        com.fasterxml.jackson.core.Version version68 = xmlFactory67.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass69 = xmlFactory67.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor70 = objectMapper60.readValues(jsonParser61, featureClass69);
        boolean boolean71 = xmlMapper46.canSerialize(featureClass69);
        boolean boolean72 = com.fasterxml.jackson.dataformat.xml.util.TypeUtil.isIndexedType(featureClass69);
        com.fasterxml.jackson.databind.JavaType javaType73 = xmlMapper36.constructType((java.lang.reflect.Type) featureClass69);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder<?> wildcardTypeResolverBuilder74 = jacksonXmlAnnotationIntrospector0.findPropertyContentTypeResolver((com.fasterxml.jackson.databind.cfg.MapperConfig<com.fasterxml.jackson.databind.SerializationConfig>) serializationConfig28, annotatedMember30, javaType73);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must call method with a container or reference type (got [simple type, class com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser$Feature])");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector2);
        org.junit.Assert.assertNotNull(version7);
        org.junit.Assert.assertNotNull(objectWriter10);
        org.junit.Assert.assertNotNull(featureArray11);
        org.junit.Assert.assertNotNull(objectMapper12);
        org.junit.Assert.assertNotNull(deserializationContext13);
        org.junit.Assert.assertNotNull(version14);
        org.junit.Assert.assertNotNull(objectWriter15);
        org.junit.Assert.assertNotNull(objectMapper16);
        org.junit.Assert.assertNotNull(version21);
        org.junit.Assert.assertNotNull(objectWriter24);
        org.junit.Assert.assertNotNull(featureArray25);
        org.junit.Assert.assertNotNull(objectMapper26);
        org.junit.Assert.assertNotNull(objectMapper27);
        org.junit.Assert.assertNotNull(serializationConfig28);
        org.junit.Assert.assertNotNull(objectMapper29);
        org.junit.Assert.assertNotNull(version35);
        org.junit.Assert.assertNotNull(objectWriter38);
        org.junit.Assert.assertNotNull(objectWriter40);
        org.junit.Assert.assertNotNull(version45);
        org.junit.Assert.assertNotNull(objectWriter48);
        org.junit.Assert.assertNotNull(version53);
        org.junit.Assert.assertNotNull(objectWriter56);
        org.junit.Assert.assertNotNull(objectMapper58);
        org.junit.Assert.assertNotNull(objectMapper60);
        org.junit.Assert.assertTrue("'" + feature66 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature66.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory67);
        org.junit.Assert.assertNotNull(version68);
        org.junit.Assert.assertNotNull(featureClass69);
        org.junit.Assert.assertNotNull(featureItor70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(javaType73);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.setNodeFactory(jsonNodeFactory8);
        com.fasterxml.jackson.databind.Module[] moduleArray10 = new com.fasterxml.jackson.databind.Module[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper11 = objectMapper9.registerModules(moduleArray10);
        java.text.DateFormat dateFormat12 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper13 = objectMapper9.setDateFormat(dateFormat12);
        com.fasterxml.jackson.databind.ObjectReader objectReader14 = objectMapper13.reader();
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory16 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory17 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory18 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec15, xMLInputFactory16, xMLOutputFactory17);
        com.fasterxml.jackson.core.Version version19 = xmlFactory18.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper20 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory18);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes21 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter22 = xmlMapper20.writer(characterEscapes21);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray23 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper24 = xmlMapper20.disable(featureArray23);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper25 = objectMapper24.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig26 = objectMapper24.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider27 = objectMapper24.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec28 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory29 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory30 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory31 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec28, xMLInputFactory29, xMLOutputFactory30);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature32 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory33 = xmlFactory31.disable(feature32);
        com.fasterxml.jackson.core.Version version34 = xmlFactory33.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass35 = xmlFactory33.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer36 = serializerProvider27.getUnknownTypeSerializer(featureClass35);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper37 = null;
        // The following exception was thrown during execution in test generation
        try {
            objectMapper13.acceptJsonFormatVisitor(featureClass35, jsonFormatVisitorWrapper37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(moduleArray10);
        org.junit.Assert.assertNotNull(objectMapper11);
        org.junit.Assert.assertNotNull(objectMapper13);
        org.junit.Assert.assertNotNull(objectReader14);
        org.junit.Assert.assertNotNull(version19);
        org.junit.Assert.assertNotNull(objectWriter22);
        org.junit.Assert.assertNotNull(featureArray23);
        org.junit.Assert.assertNotNull(objectMapper24);
        org.junit.Assert.assertNotNull(objectMapper25);
        org.junit.Assert.assertNotNull(serializationConfig26);
        org.junit.Assert.assertNotNull(serializerProvider27);
        org.junit.Assert.assertTrue("'" + feature32 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature32.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory33);
        org.junit.Assert.assertNotNull(version34);
        org.junit.Assert.assertNotNull(featureClass35);
        org.junit.Assert.assertNotNull(objJsonSerializer36);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.fasterxml.jackson.dataformat.xml.ser.XmlBeanSerializerModifier xmlBeanSerializerModifier0 = new com.fasterxml.jackson.dataformat.xml.ser.XmlBeanSerializerModifier();
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory2 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory3 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory4 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec1, xMLInputFactory2, xMLOutputFactory3);
        com.fasterxml.jackson.core.Version version5 = xmlFactory4.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper6 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory4);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes7 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter8 = xmlMapper6.writer(characterEscapes7);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray9 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = xmlMapper6.disable(featureArray9);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper11 = objectMapper10.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig12 = objectMapper10.getSerializationConfig();
        com.fasterxml.jackson.databind.BeanDescription beanDescription13 = null;
        com.fasterxml.jackson.databind.ser.BeanSerializerBuilder beanSerializerBuilder14 = null;
        com.fasterxml.jackson.databind.ser.BeanSerializerBuilder beanSerializerBuilder15 = xmlBeanSerializerModifier0.updateBuilder(serializationConfig12, beanDescription13, beanSerializerBuilder14);
        org.junit.Assert.assertNotNull(version5);
        org.junit.Assert.assertNotNull(objectWriter8);
        org.junit.Assert.assertNotNull(featureArray9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(objectMapper11);
        org.junit.Assert.assertNotNull(serializationConfig12);
        org.junit.Assert.assertNull(beanSerializerBuilder15);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = xmlMapper5.getDeserializationContext();
        com.fasterxml.jackson.core.Version version11 = xmlMapper5.version();
        com.fasterxml.jackson.databind.ObjectWriter objectWriter12 = xmlMapper5.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper13 = xmlMapper5.enableDefaultTyping();
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping14 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper16 = objectMapper13.enableDefaultTypingAsProperty(defaultTyping14, " ");
        com.fasterxml.jackson.core.JsonGenerator.Feature feature17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = objectMapper13.isEnabled(feature17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(deserializationContext10);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertNotNull(objectWriter12);
        org.junit.Assert.assertNotNull(objectMapper13);
        org.junit.Assert.assertNotNull(objectMapper16);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper9.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig11 = objectMapper9.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = objectMapper9.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory14 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory15 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory16 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec13, xMLInputFactory14, xMLOutputFactory15);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature17 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory18 = xmlFactory16.disable(feature17);
        com.fasterxml.jackson.core.Version version19 = xmlFactory18.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass20 = xmlFactory18.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer21 = serializerProvider12.getUnknownTypeSerializer(featureClass20);
        com.fasterxml.jackson.databind.BeanDescription beanDescription22 = null;
        com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition beanPropertyDefinition23 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec25 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory26 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory27 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory28 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec25, xMLInputFactory26, xMLOutputFactory27);
        com.fasterxml.jackson.core.Version version29 = xmlFactory28.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper30 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory28);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes31 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter32 = xmlMapper30.writer(characterEscapes31);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray33 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper34 = xmlMapper30.disable(featureArray33);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper35 = objectMapper34.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig36 = objectMapper34.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider37 = objectMapper34.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec38 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory39 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory40 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory41 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec38, xMLInputFactory39, xMLOutputFactory40);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature42 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory43 = xmlFactory41.disable(feature42);
        com.fasterxml.jackson.core.Version version44 = xmlFactory43.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass45 = xmlFactory43.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer46 = serializerProvider37.getUnknownTypeSerializer(featureClass45);
        java.util.TimeZone timeZone47 = serializerProvider37.getTimeZone();
        com.fasterxml.jackson.core.ObjectCodec objectCodec48 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory49 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory50 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory51 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec48, xMLInputFactory49, xMLOutputFactory50);
        com.fasterxml.jackson.core.Version version52 = xmlFactory51.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper53 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory51);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes54 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter55 = xmlMapper53.writer(characterEscapes54);
        com.fasterxml.jackson.core.ObjectCodec objectCodec56 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory57 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory58 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory59 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec56, xMLInputFactory57, xMLOutputFactory58);
        com.fasterxml.jackson.core.Version version60 = xmlFactory59.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper61 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory59);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes62 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter63 = xmlMapper61.writer(characterEscapes62);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory64 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper65 = xmlMapper61.setNodeFactory(jsonNodeFactory64);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider66 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper67 = xmlMapper61.setFilterProvider(filterProvider66);
        com.fasterxml.jackson.core.JsonParser jsonParser68 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec69 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory70 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory71 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory72 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec69, xMLInputFactory70, xMLOutputFactory71);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature73 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory74 = xmlFactory72.disable(feature73);
        com.fasterxml.jackson.core.Version version75 = xmlFactory74.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass76 = xmlFactory74.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor77 = objectMapper67.readValues(jsonParser68, featureClass76);
        boolean boolean78 = xmlMapper53.canSerialize(featureClass76);
        com.fasterxml.jackson.databind.BeanProperty beanProperty79 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer80 = serializerProvider37.findKeySerializer(featureClass76, beanProperty79);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider81 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] beanPropertyWriterArray82 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] {};
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] beanPropertyWriterArray83 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] {};
        int int84 = com.fasterxml.jackson.dataformat.xml.ser.XmlBeanSerializerBase._orderAttributesFirst(beanPropertyWriterArray82, beanPropertyWriterArray83);
        boolean boolean85 = objJsonSerializer80.isEmpty(serializerProvider81, (java.lang.Object) beanPropertyWriterArray82);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<com.fasterxml.jackson.databind.Module> moduleCollection86 = serializerProvider12.reportBadPropertyDefinition(beanDescription22, beanPropertyDefinition23, "unknown", (java.lang.Object[]) beanPropertyWriterArray82);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.JsonMappingException; message: Invalid definition for property N/A (of type N/A): unknown");
        } catch (com.fasterxml.jackson.databind.JsonMappingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(serializationConfig11);
        org.junit.Assert.assertNotNull(serializerProvider12);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature17.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory18);
        org.junit.Assert.assertNotNull(version19);
        org.junit.Assert.assertNotNull(featureClass20);
        org.junit.Assert.assertNotNull(objJsonSerializer21);
        org.junit.Assert.assertNotNull(version29);
        org.junit.Assert.assertNotNull(objectWriter32);
        org.junit.Assert.assertNotNull(featureArray33);
        org.junit.Assert.assertNotNull(objectMapper34);
        org.junit.Assert.assertNotNull(objectMapper35);
        org.junit.Assert.assertNotNull(serializationConfig36);
        org.junit.Assert.assertNotNull(serializerProvider37);
        org.junit.Assert.assertTrue("'" + feature42 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature42.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory43);
        org.junit.Assert.assertNotNull(version44);
        org.junit.Assert.assertNotNull(featureClass45);
        org.junit.Assert.assertNotNull(objJsonSerializer46);
        org.junit.Assert.assertNotNull(timeZone47);
        org.junit.Assert.assertEquals(timeZone47.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(version52);
        org.junit.Assert.assertNotNull(objectWriter55);
        org.junit.Assert.assertNotNull(version60);
        org.junit.Assert.assertNotNull(objectWriter63);
        org.junit.Assert.assertNotNull(objectMapper65);
        org.junit.Assert.assertNotNull(objectMapper67);
        org.junit.Assert.assertTrue("'" + feature73 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature73.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory74);
        org.junit.Assert.assertNotNull(version75);
        org.junit.Assert.assertNotNull(featureClass76);
        org.junit.Assert.assertNotNull(featureItor77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(objJsonSerializer80);
        org.junit.Assert.assertNotNull(beanPropertyWriterArray82);
        org.junit.Assert.assertNotNull(beanPropertyWriterArray83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        int int10 = xmlMapper5.mixInCount();
        com.fasterxml.jackson.databind.InjectableValues injectableValues11 = xmlMapper5.getInjectableValues();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature12 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean14 = feature12.enabledIn((int) (byte) 10);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper15 = xmlMapper5.disable(feature12);
        com.fasterxml.jackson.databind.cfg.ContextAttributes contextAttributes16 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter17 = xmlMapper5.writer(contextAttributes16);
        com.fasterxml.jackson.core.ObjectCodec objectCodec18 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory19 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory20 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory21 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec18, xMLInputFactory19, xMLOutputFactory20);
        com.fasterxml.jackson.core.Version version22 = xmlFactory21.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper23 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory21);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes24 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter25 = xmlMapper23.writer(characterEscapes24);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray26 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper27 = xmlMapper23.disable(featureArray26);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper28 = xmlMapper23.copy();
        com.fasterxml.jackson.core.ObjectCodec objectCodec29 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory30 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory31 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory32 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec29, xMLInputFactory30, xMLOutputFactory31);
        com.fasterxml.jackson.core.Version version33 = xmlFactory32.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper34 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory32);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes35 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter36 = xmlMapper34.writer(characterEscapes35);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray37 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper38 = xmlMapper34.disable(featureArray37);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper39 = objectMapper38.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig40 = objectMapper38.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider41 = objectMapper38.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec42 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory43 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory44 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory45 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec42, xMLInputFactory43, xMLOutputFactory44);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature46 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory47 = xmlFactory45.disable(feature46);
        com.fasterxml.jackson.core.Version version48 = xmlFactory47.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass49 = xmlFactory47.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer50 = serializerProvider41.getUnknownTypeSerializer(featureClass49);
        java.util.TimeZone timeZone51 = serializerProvider41.getTimeZone();
        com.fasterxml.jackson.core.ObjectCodec objectCodec52 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory53 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory54 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory55 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec52, xMLInputFactory53, xMLOutputFactory54);
        com.fasterxml.jackson.core.Version version56 = xmlFactory55.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper57 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory55);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes58 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter59 = xmlMapper57.writer(characterEscapes58);
        com.fasterxml.jackson.core.ObjectCodec objectCodec60 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory61 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory62 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory63 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec60, xMLInputFactory61, xMLOutputFactory62);
        com.fasterxml.jackson.core.Version version64 = xmlFactory63.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper65 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory63);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes66 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter67 = xmlMapper65.writer(characterEscapes66);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory68 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper69 = xmlMapper65.setNodeFactory(jsonNodeFactory68);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider70 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper71 = xmlMapper65.setFilterProvider(filterProvider70);
        com.fasterxml.jackson.core.JsonParser jsonParser72 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec73 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory74 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory75 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory76 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec73, xMLInputFactory74, xMLOutputFactory75);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature77 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory78 = xmlFactory76.disable(feature77);
        com.fasterxml.jackson.core.Version version79 = xmlFactory78.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass80 = xmlFactory78.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor81 = objectMapper71.readValues(jsonParser72, featureClass80);
        boolean boolean82 = xmlMapper57.canSerialize(featureClass80);
        com.fasterxml.jackson.databind.JavaType javaType83 = serializerProvider41.constructType((java.lang.reflect.Type) featureClass80);
        com.fasterxml.jackson.databind.ObjectReader objectReader84 = xmlMapper28.readerFor(javaType83);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper85 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlMapper5.acceptJsonFormatVisitor(javaType83, jsonFormatVisitorWrapper85);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(injectableValues11);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature12.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objectMapper15);
        org.junit.Assert.assertNotNull(objectWriter17);
        org.junit.Assert.assertNotNull(version22);
        org.junit.Assert.assertNotNull(objectWriter25);
        org.junit.Assert.assertNotNull(featureArray26);
        org.junit.Assert.assertNotNull(objectMapper27);
        org.junit.Assert.assertNotNull(xmlMapper28);
        org.junit.Assert.assertNotNull(version33);
        org.junit.Assert.assertNotNull(objectWriter36);
        org.junit.Assert.assertNotNull(featureArray37);
        org.junit.Assert.assertNotNull(objectMapper38);
        org.junit.Assert.assertNotNull(objectMapper39);
        org.junit.Assert.assertNotNull(serializationConfig40);
        org.junit.Assert.assertNotNull(serializerProvider41);
        org.junit.Assert.assertTrue("'" + feature46 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature46.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory47);
        org.junit.Assert.assertNotNull(version48);
        org.junit.Assert.assertNotNull(featureClass49);
        org.junit.Assert.assertNotNull(objJsonSerializer50);
        org.junit.Assert.assertNotNull(timeZone51);
        org.junit.Assert.assertEquals(timeZone51.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(version56);
        org.junit.Assert.assertNotNull(objectWriter59);
        org.junit.Assert.assertNotNull(version64);
        org.junit.Assert.assertNotNull(objectWriter67);
        org.junit.Assert.assertNotNull(objectMapper69);
        org.junit.Assert.assertNotNull(objectMapper71);
        org.junit.Assert.assertTrue("'" + feature77 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature77.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory78);
        org.junit.Assert.assertNotNull(version79);
        org.junit.Assert.assertNotNull(featureClass80);
        org.junit.Assert.assertNotNull(featureItor81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(javaType83);
        org.junit.Assert.assertNotNull(objectReader84);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper9.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig11 = objectMapper9.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = objectMapper9.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory14 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory15 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory16 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec13, xMLInputFactory14, xMLOutputFactory15);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature17 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory18 = xmlFactory16.disable(feature17);
        com.fasterxml.jackson.core.Version version19 = xmlFactory18.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass20 = xmlFactory18.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer21 = serializerProvider12.getUnknownTypeSerializer(featureClass20);
        java.util.TimeZone timeZone22 = serializerProvider12.getTimeZone();
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory24 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory25 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory26 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec23, xMLInputFactory24, xMLOutputFactory25);
        com.fasterxml.jackson.core.JsonFactory jsonFactory28 = xmlFactory26.setRootValueSeparator("");
        java.io.DataOutput dataOutput29 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator30 = jsonFactory28.createGenerator(dataOutput29);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider32 = serializerProvider12.setAttribute((java.lang.Object) jsonFactory28, (java.lang.Object) ' ');
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass33 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty34 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer35 = serializerProvider12.findValueSerializer(featureClass33, beanProperty34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(serializationConfig11);
        org.junit.Assert.assertNotNull(serializerProvider12);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature17.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory18);
        org.junit.Assert.assertNotNull(version19);
        org.junit.Assert.assertNotNull(featureClass20);
        org.junit.Assert.assertNotNull(objJsonSerializer21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(jsonFactory28);
        org.junit.Assert.assertNotNull(jsonGenerator30);
        org.junit.Assert.assertNotNull(serializerProvider32);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper9.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig11 = objectMapper9.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = objectMapper9.getSerializerProviderInstance();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = serializerProvider12.getTypeFactory();
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(serializationConfig11);
        org.junit.Assert.assertNotNull(serializerProvider12);
        org.junit.Assert.assertNotNull(typeFactory13);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper9.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig11 = objectMapper9.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = objectMapper9.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory14 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory15 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory16 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec13, xMLInputFactory14, xMLOutputFactory15);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature17 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory18 = xmlFactory16.disable(feature17);
        com.fasterxml.jackson.core.Version version19 = xmlFactory18.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass20 = xmlFactory18.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer21 = serializerProvider12.getUnknownTypeSerializer(featureClass20);
        com.fasterxml.jackson.core.ObjectCodec objectCodec22 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory23 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory24 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory25 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec22, xMLInputFactory23, xMLOutputFactory24);
        com.fasterxml.jackson.core.Version version26 = xmlFactory25.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper27 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory25);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes28 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter29 = xmlMapper27.writer(characterEscapes28);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray30 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper31 = xmlMapper27.disable(featureArray30);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper32 = objectMapper31.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig33 = objectMapper31.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider34 = objectMapper31.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec35 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory36 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory37 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory38 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec35, xMLInputFactory36, xMLOutputFactory37);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature39 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory40 = xmlFactory38.disable(feature39);
        com.fasterxml.jackson.core.Version version41 = xmlFactory40.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass42 = xmlFactory40.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer43 = serializerProvider34.getUnknownTypeSerializer(featureClass42);
        java.util.TimeZone timeZone44 = serializerProvider34.getTimeZone();
        com.fasterxml.jackson.core.ObjectCodec objectCodec45 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory46 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory47 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory48 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec45, xMLInputFactory46, xMLOutputFactory47);
        com.fasterxml.jackson.core.Version version49 = xmlFactory48.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper50 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory48);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes51 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter52 = xmlMapper50.writer(characterEscapes51);
        com.fasterxml.jackson.core.ObjectCodec objectCodec53 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory54 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory55 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory56 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec53, xMLInputFactory54, xMLOutputFactory55);
        com.fasterxml.jackson.core.Version version57 = xmlFactory56.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper58 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory56);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes59 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter60 = xmlMapper58.writer(characterEscapes59);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory61 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper62 = xmlMapper58.setNodeFactory(jsonNodeFactory61);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider63 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper64 = xmlMapper58.setFilterProvider(filterProvider63);
        com.fasterxml.jackson.core.JsonParser jsonParser65 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec66 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory67 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory68 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory69 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec66, xMLInputFactory67, xMLOutputFactory68);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature70 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory71 = xmlFactory69.disable(feature70);
        com.fasterxml.jackson.core.Version version72 = xmlFactory71.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass73 = xmlFactory71.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor74 = objectMapper64.readValues(jsonParser65, featureClass73);
        boolean boolean75 = xmlMapper50.canSerialize(featureClass73);
        com.fasterxml.jackson.databind.BeanProperty beanProperty76 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer77 = serializerProvider34.findKeySerializer(featureClass73, beanProperty76);
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory79 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory80 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory81 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec78, xMLInputFactory79, xMLOutputFactory80);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature82 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory83 = xmlFactory81.disable(feature82);
        com.fasterxml.jackson.core.Version version84 = xmlFactory83.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper85 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory83);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature86 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper87 = xmlMapper85.disable(feature86);
        java.lang.Object obj88 = serializerProvider34.getAttribute((java.lang.Object) objectMapper87);
        boolean boolean90 = objJsonSerializer21.isEmpty(serializerProvider34, (java.lang.Object) (short) 100);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(serializationConfig11);
        org.junit.Assert.assertNotNull(serializerProvider12);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature17.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory18);
        org.junit.Assert.assertNotNull(version19);
        org.junit.Assert.assertNotNull(featureClass20);
        org.junit.Assert.assertNotNull(objJsonSerializer21);
        org.junit.Assert.assertNotNull(version26);
        org.junit.Assert.assertNotNull(objectWriter29);
        org.junit.Assert.assertNotNull(featureArray30);
        org.junit.Assert.assertNotNull(objectMapper31);
        org.junit.Assert.assertNotNull(objectMapper32);
        org.junit.Assert.assertNotNull(serializationConfig33);
        org.junit.Assert.assertNotNull(serializerProvider34);
        org.junit.Assert.assertTrue("'" + feature39 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature39.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory40);
        org.junit.Assert.assertNotNull(version41);
        org.junit.Assert.assertNotNull(featureClass42);
        org.junit.Assert.assertNotNull(objJsonSerializer43);
        org.junit.Assert.assertNotNull(timeZone44);
        org.junit.Assert.assertEquals(timeZone44.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(version49);
        org.junit.Assert.assertNotNull(objectWriter52);
        org.junit.Assert.assertNotNull(version57);
        org.junit.Assert.assertNotNull(objectWriter60);
        org.junit.Assert.assertNotNull(objectMapper62);
        org.junit.Assert.assertNotNull(objectMapper64);
        org.junit.Assert.assertTrue("'" + feature70 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature70.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory71);
        org.junit.Assert.assertNotNull(version72);
        org.junit.Assert.assertNotNull(featureClass73);
        org.junit.Assert.assertNotNull(featureItor74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(objJsonSerializer77);
        org.junit.Assert.assertTrue("'" + feature82 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature82.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory83);
        org.junit.Assert.assertNotNull(version84);
        org.junit.Assert.assertTrue("'" + feature86 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature86.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(objectMapper87);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.setNodeFactory(jsonNodeFactory8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = xmlMapper5.findAndRegisterModules();
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = xmlMapper5.getJsonFactory();
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory13 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory14 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory15 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec12, xMLInputFactory13, xMLOutputFactory14);
        com.fasterxml.jackson.core.Version version16 = xmlFactory15.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper17 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory15);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes18 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter19 = xmlMapper17.writer(characterEscapes18);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray20 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper21 = xmlMapper17.disable(featureArray20);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper22 = objectMapper21.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig23 = objectMapper21.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider24 = objectMapper21.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec25 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory26 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory27 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory28 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec25, xMLInputFactory26, xMLOutputFactory27);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature29 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory30 = xmlFactory28.disable(feature29);
        com.fasterxml.jackson.core.Version version31 = xmlFactory30.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass32 = xmlFactory30.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer33 = serializerProvider24.getUnknownTypeSerializer(featureClass32);
        java.util.TimeZone timeZone34 = serializerProvider24.getTimeZone();
        com.fasterxml.jackson.core.ObjectCodec objectCodec35 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory36 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory37 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory38 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec35, xMLInputFactory36, xMLOutputFactory37);
        com.fasterxml.jackson.core.Version version39 = xmlFactory38.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper40 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory38);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes41 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter42 = xmlMapper40.writer(characterEscapes41);
        com.fasterxml.jackson.core.ObjectCodec objectCodec43 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory44 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory45 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory46 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec43, xMLInputFactory44, xMLOutputFactory45);
        com.fasterxml.jackson.core.Version version47 = xmlFactory46.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper48 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory46);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes49 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter50 = xmlMapper48.writer(characterEscapes49);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory51 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper52 = xmlMapper48.setNodeFactory(jsonNodeFactory51);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider53 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper54 = xmlMapper48.setFilterProvider(filterProvider53);
        com.fasterxml.jackson.core.JsonParser jsonParser55 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec56 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory57 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory58 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory59 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec56, xMLInputFactory57, xMLOutputFactory58);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature60 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory61 = xmlFactory59.disable(feature60);
        com.fasterxml.jackson.core.Version version62 = xmlFactory61.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass63 = xmlFactory61.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor64 = objectMapper54.readValues(jsonParser55, featureClass63);
        boolean boolean65 = xmlMapper40.canSerialize(featureClass63);
        com.fasterxml.jackson.databind.BeanProperty beanProperty66 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer67 = serializerProvider24.findKeySerializer(featureClass63, beanProperty66);
        com.fasterxml.jackson.databind.ObjectReader objectReader68 = xmlMapper5.readerWithView(featureClass63);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(jsonFactory11);
        org.junit.Assert.assertNotNull(version16);
        org.junit.Assert.assertNotNull(objectWriter19);
        org.junit.Assert.assertNotNull(featureArray20);
        org.junit.Assert.assertNotNull(objectMapper21);
        org.junit.Assert.assertNotNull(objectMapper22);
        org.junit.Assert.assertNotNull(serializationConfig23);
        org.junit.Assert.assertNotNull(serializerProvider24);
        org.junit.Assert.assertTrue("'" + feature29 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature29.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory30);
        org.junit.Assert.assertNotNull(version31);
        org.junit.Assert.assertNotNull(featureClass32);
        org.junit.Assert.assertNotNull(objJsonSerializer33);
        org.junit.Assert.assertNotNull(timeZone34);
        org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(version39);
        org.junit.Assert.assertNotNull(objectWriter42);
        org.junit.Assert.assertNotNull(version47);
        org.junit.Assert.assertNotNull(objectWriter50);
        org.junit.Assert.assertNotNull(objectMapper52);
        org.junit.Assert.assertNotNull(objectMapper54);
        org.junit.Assert.assertTrue("'" + feature60 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature60.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory61);
        org.junit.Assert.assertNotNull(version62);
        org.junit.Assert.assertNotNull(featureClass63);
        org.junit.Assert.assertNotNull(featureItor64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(objJsonSerializer67);
        org.junit.Assert.assertNotNull(objectReader68);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper9.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig11 = objectMapper9.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = objectMapper9.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory14 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory15 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory16 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec13, xMLInputFactory14, xMLOutputFactory15);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature17 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory18 = xmlFactory16.disable(feature17);
        com.fasterxml.jackson.core.Version version19 = xmlFactory18.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass20 = xmlFactory18.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer21 = serializerProvider12.getUnknownTypeSerializer(featureClass20);
        java.util.TimeZone timeZone22 = serializerProvider12.getTimeZone();
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory24 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory25 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory26 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec23, xMLInputFactory24, xMLOutputFactory25);
        com.fasterxml.jackson.core.Version version27 = xmlFactory26.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper28 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory26);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes29 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter30 = xmlMapper28.writer(characterEscapes29);
        com.fasterxml.jackson.core.ObjectCodec objectCodec31 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory32 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory33 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory34 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec31, xMLInputFactory32, xMLOutputFactory33);
        com.fasterxml.jackson.core.Version version35 = xmlFactory34.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper36 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory34);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes37 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter38 = xmlMapper36.writer(characterEscapes37);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory39 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper40 = xmlMapper36.setNodeFactory(jsonNodeFactory39);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider41 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper42 = xmlMapper36.setFilterProvider(filterProvider41);
        com.fasterxml.jackson.core.JsonParser jsonParser43 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec44 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory45 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory46 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory47 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec44, xMLInputFactory45, xMLOutputFactory46);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature48 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory49 = xmlFactory47.disable(feature48);
        com.fasterxml.jackson.core.Version version50 = xmlFactory49.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass51 = xmlFactory49.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor52 = objectMapper42.readValues(jsonParser43, featureClass51);
        boolean boolean53 = xmlMapper28.canSerialize(featureClass51);
        com.fasterxml.jackson.databind.BeanProperty beanProperty54 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer55 = serializerProvider12.findKeySerializer(featureClass51, beanProperty54);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider56 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] beanPropertyWriterArray57 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] {};
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] beanPropertyWriterArray58 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] {};
        int int59 = com.fasterxml.jackson.dataformat.xml.ser.XmlBeanSerializerBase._orderAttributesFirst(beanPropertyWriterArray57, beanPropertyWriterArray58);
        boolean boolean60 = objJsonSerializer55.isEmpty(serializerProvider56, (java.lang.Object) beanPropertyWriterArray57);
        com.fasterxml.jackson.core.ObjectCodec objectCodec61 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory62 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory63 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory64 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec61, xMLInputFactory62, xMLOutputFactory63);
        com.fasterxml.jackson.core.Version version65 = xmlFactory64.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper66 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory64);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes67 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter68 = xmlMapper66.writer(characterEscapes67);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray69 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper70 = xmlMapper66.disable(featureArray69);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper71 = objectMapper70.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig72 = objectMapper70.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider73 = objectMapper70.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec74 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory75 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory76 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory77 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec74, xMLInputFactory75, xMLOutputFactory76);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature78 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory79 = xmlFactory77.disable(feature78);
        com.fasterxml.jackson.core.Version version80 = xmlFactory79.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass81 = xmlFactory79.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer82 = serializerProvider73.getUnknownTypeSerializer(featureClass81);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer83 = objJsonSerializer55.replaceDelegatee(objJsonSerializer82);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(serializationConfig11);
        org.junit.Assert.assertNotNull(serializerProvider12);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature17.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory18);
        org.junit.Assert.assertNotNull(version19);
        org.junit.Assert.assertNotNull(featureClass20);
        org.junit.Assert.assertNotNull(objJsonSerializer21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(version27);
        org.junit.Assert.assertNotNull(objectWriter30);
        org.junit.Assert.assertNotNull(version35);
        org.junit.Assert.assertNotNull(objectWriter38);
        org.junit.Assert.assertNotNull(objectMapper40);
        org.junit.Assert.assertNotNull(objectMapper42);
        org.junit.Assert.assertTrue("'" + feature48 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature48.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory49);
        org.junit.Assert.assertNotNull(version50);
        org.junit.Assert.assertNotNull(featureClass51);
        org.junit.Assert.assertNotNull(featureItor52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(objJsonSerializer55);
        org.junit.Assert.assertNotNull(beanPropertyWriterArray57);
        org.junit.Assert.assertNotNull(beanPropertyWriterArray58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(version65);
        org.junit.Assert.assertNotNull(objectWriter68);
        org.junit.Assert.assertNotNull(featureArray69);
        org.junit.Assert.assertNotNull(objectMapper70);
        org.junit.Assert.assertNotNull(objectMapper71);
        org.junit.Assert.assertNotNull(serializationConfig72);
        org.junit.Assert.assertNotNull(serializerProvider73);
        org.junit.Assert.assertTrue("'" + feature78 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature78.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory79);
        org.junit.Assert.assertNotNull(version80);
        org.junit.Assert.assertNotNull(featureClass81);
        org.junit.Assert.assertNotNull(objJsonSerializer82);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory10 = null;
        com.fasterxml.jackson.databind.ObjectReader objectReader11 = xmlMapper5.reader(jsonNodeFactory10);
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory13 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory14 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory15 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec12, xMLInputFactory13, xMLOutputFactory14);
        com.fasterxml.jackson.core.Version version16 = xmlFactory15.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper17 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory15);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes18 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter19 = xmlMapper17.writer(characterEscapes18);
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory21 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory22 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory23 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec20, xMLInputFactory21, xMLOutputFactory22);
        com.fasterxml.jackson.core.Version version24 = xmlFactory23.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper25 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory23);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes26 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter27 = xmlMapper25.writer(characterEscapes26);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory28 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper29 = xmlMapper25.setNodeFactory(jsonNodeFactory28);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider30 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper31 = xmlMapper25.setFilterProvider(filterProvider30);
        com.fasterxml.jackson.core.JsonParser jsonParser32 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec33 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory34 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory35 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory36 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec33, xMLInputFactory34, xMLOutputFactory35);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature37 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory38 = xmlFactory36.disable(feature37);
        com.fasterxml.jackson.core.Version version39 = xmlFactory38.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass40 = xmlFactory38.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor41 = objectMapper31.readValues(jsonParser32, featureClass40);
        boolean boolean42 = xmlMapper17.canSerialize(featureClass40);
        boolean boolean43 = com.fasterxml.jackson.dataformat.xml.util.TypeUtil.isIndexedType(featureClass40);
        com.fasterxml.jackson.databind.jsonschema.JsonSchema jsonSchema44 = xmlMapper5.generateJsonSchema(featureClass40);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper45 = xmlMapper5.findAndRegisterModules();
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectReader11);
        org.junit.Assert.assertNotNull(version16);
        org.junit.Assert.assertNotNull(objectWriter19);
        org.junit.Assert.assertNotNull(version24);
        org.junit.Assert.assertNotNull(objectWriter27);
        org.junit.Assert.assertNotNull(objectMapper29);
        org.junit.Assert.assertNotNull(objectMapper31);
        org.junit.Assert.assertTrue("'" + feature37 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature37.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory38);
        org.junit.Assert.assertNotNull(version39);
        org.junit.Assert.assertNotNull(featureClass40);
        org.junit.Assert.assertNotNull(featureItor41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jsonSchema44);
        org.junit.Assert.assertNotNull(objectMapper45);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory7 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory8 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory9 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec6, xMLInputFactory7, xMLOutputFactory8);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature10 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean11 = xmlFactory9.isEnabled(feature10);
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory12 = xmlFactory3.enable(feature10);
        boolean boolean13 = xmlFactory12.requiresPropertyOrdering();
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertTrue("'" + feature10 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature10.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(xmlFactory12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = xmlMapper5.getDeserializationContext();
        com.fasterxml.jackson.databind.ObjectWriter objectWriter11 = xmlMapper5.writer();
        com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature feature12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper14 = xmlMapper5.configure(feature12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(deserializationContext10);
        org.junit.Assert.assertNotNull(objectWriter11);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = xmlMapper5.getDeserializationContext();
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping11 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper13 = xmlMapper5.enableDefaultTypingAsProperty(defaultTyping11, "");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory14 = objectMapper13.getNodeFactory();
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory16 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory17 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory18 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec15, xMLInputFactory16, xMLOutputFactory17);
        com.fasterxml.jackson.core.Version version19 = xmlFactory18.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper20 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory18);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes21 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter22 = xmlMapper20.writer(characterEscapes21);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray23 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper24 = xmlMapper20.disable(featureArray23);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper25 = objectMapper24.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig26 = objectMapper24.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider27 = objectMapper24.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec28 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory29 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory30 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory31 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec28, xMLInputFactory29, xMLOutputFactory30);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature32 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory33 = xmlFactory31.disable(feature32);
        com.fasterxml.jackson.core.Version version34 = xmlFactory33.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass35 = xmlFactory33.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer36 = serializerProvider27.getUnknownTypeSerializer(featureClass35);
        java.util.TimeZone timeZone37 = serializerProvider27.getTimeZone();
        com.fasterxml.jackson.core.ObjectCodec objectCodec38 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory39 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory40 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory41 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec38, xMLInputFactory39, xMLOutputFactory40);
        com.fasterxml.jackson.core.Version version42 = xmlFactory41.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper43 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory41);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes44 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter45 = xmlMapper43.writer(characterEscapes44);
        com.fasterxml.jackson.core.ObjectCodec objectCodec46 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory47 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory48 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory49 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec46, xMLInputFactory47, xMLOutputFactory48);
        com.fasterxml.jackson.core.Version version50 = xmlFactory49.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper51 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory49);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes52 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter53 = xmlMapper51.writer(characterEscapes52);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory54 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper55 = xmlMapper51.setNodeFactory(jsonNodeFactory54);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider56 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper57 = xmlMapper51.setFilterProvider(filterProvider56);
        com.fasterxml.jackson.core.JsonParser jsonParser58 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec59 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory60 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory61 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory62 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec59, xMLInputFactory60, xMLOutputFactory61);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature63 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory64 = xmlFactory62.disable(feature63);
        com.fasterxml.jackson.core.Version version65 = xmlFactory64.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass66 = xmlFactory64.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor67 = objectMapper57.readValues(jsonParser58, featureClass66);
        boolean boolean68 = xmlMapper43.canSerialize(featureClass66);
        com.fasterxml.jackson.databind.JavaType javaType69 = serializerProvider27.constructType((java.lang.reflect.Type) featureClass66);
        boolean boolean70 = objectMapper13.canDeserialize(javaType69);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(deserializationContext10);
        org.junit.Assert.assertNotNull(objectMapper13);
        org.junit.Assert.assertNotNull(jsonNodeFactory14);
        org.junit.Assert.assertNotNull(version19);
        org.junit.Assert.assertNotNull(objectWriter22);
        org.junit.Assert.assertNotNull(featureArray23);
        org.junit.Assert.assertNotNull(objectMapper24);
        org.junit.Assert.assertNotNull(objectMapper25);
        org.junit.Assert.assertNotNull(serializationConfig26);
        org.junit.Assert.assertNotNull(serializerProvider27);
        org.junit.Assert.assertTrue("'" + feature32 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature32.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory33);
        org.junit.Assert.assertNotNull(version34);
        org.junit.Assert.assertNotNull(featureClass35);
        org.junit.Assert.assertNotNull(objJsonSerializer36);
        org.junit.Assert.assertNotNull(timeZone37);
        org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(version42);
        org.junit.Assert.assertNotNull(objectWriter45);
        org.junit.Assert.assertNotNull(version50);
        org.junit.Assert.assertNotNull(objectWriter53);
        org.junit.Assert.assertNotNull(objectMapper55);
        org.junit.Assert.assertNotNull(objectMapper57);
        org.junit.Assert.assertTrue("'" + feature63 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature63.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory64);
        org.junit.Assert.assertNotNull(version65);
        org.junit.Assert.assertNotNull(featureClass66);
        org.junit.Assert.assertNotNull(featureItor67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(javaType69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }
}


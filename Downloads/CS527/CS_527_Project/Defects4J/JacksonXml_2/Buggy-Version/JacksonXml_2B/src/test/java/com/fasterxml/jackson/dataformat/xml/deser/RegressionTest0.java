package com.fasterxml.jackson.dataformat.xml.deser;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        javax.xml.stream.XMLInputFactory xMLInputFactory0 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper1 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory0);
        com.fasterxml.jackson.core.FormatSchema formatSchema2 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter3 = xmlMapper1.writer(formatSchema2);
        com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter defaultXmlPrettyPrinter4 = new com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = xmlMapper1.setDefaultPrettyPrinter((com.fasterxml.jackson.core.PrettyPrinter) defaultXmlPrettyPrinter4);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature6 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean7 = feature6.enabledByDefault();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper8 = xmlMapper1.enable(feature6);
        com.fasterxml.jackson.databind.cfg.HandlerInstantiator handlerInstantiator9 = null;
        java.lang.Object obj10 = xmlMapper1.setHandlerInstantiator(handlerInstantiator9);
        javax.xml.stream.XMLInputFactory xMLInputFactory11 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper12 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory11);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector13 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version14 = jacksonXmlAnnotationIntrospector13.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember15 = null;
        java.lang.String str16 = jacksonXmlAnnotationIntrospector13.findImplicitPropertyName(annotatedMember15);
        byte[] byteArray17 = xmlMapper12.writeValueAsBytes((java.lang.Object) str16);
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass19 = xmlMapper1.readValue(byteArray17, javaType18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectWriter3);
        org.junit.Assert.assertNotNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + feature6 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature6.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objectMapper8);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(version14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[60, 110, 117, 108, 108, 47, 62]");
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        javax.xml.stream.XMLInputFactory xMLInputFactory0 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper1 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory0);
        com.fasterxml.jackson.core.FormatSchema formatSchema2 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter3 = xmlMapper1.writer(formatSchema2);
        com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter defaultXmlPrettyPrinter4 = new com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = xmlMapper1.setDefaultPrettyPrinter((com.fasterxml.jackson.core.PrettyPrinter) defaultXmlPrettyPrinter4);
        com.fasterxml.jackson.core.FormatSchema formatSchema6 = null;
        com.fasterxml.jackson.databind.ObjectReader objectReader7 = objectMapper5.reader(formatSchema6);
        javax.xml.stream.XMLInputFactory xMLInputFactory8 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper9 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory8);
        com.fasterxml.jackson.core.FormatSchema formatSchema10 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter11 = xmlMapper9.writer(formatSchema10);
        com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter defaultXmlPrettyPrinter12 = new com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper13 = xmlMapper9.setDefaultPrettyPrinter((com.fasterxml.jackson.core.PrettyPrinter) defaultXmlPrettyPrinter12);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature14 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean15 = feature14.enabledByDefault();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper16 = xmlMapper9.enable(feature14);
        javax.xml.stream.XMLInputFactory xMLInputFactory17 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper18 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory17);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter19 = xmlMapper18.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory20 = xmlMapper18.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature21 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory22 = xmlFactory20.enable(feature21);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass23 = xmlFactory20.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.ObjectReader objectReader24 = objectMapper16.readerWithView(featureClass23);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter25 = objectMapper5.writerWithView(featureClass23);
        javax.xml.stream.XMLInputFactory xMLInputFactory26 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper27 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory26);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector28 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version29 = jacksonXmlAnnotationIntrospector28.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember30 = null;
        java.lang.String str31 = jacksonXmlAnnotationIntrospector28.findImplicitPropertyName(annotatedMember30);
        byte[] byteArray32 = xmlMapper27.writeValueAsBytes((java.lang.Object) str31);
        com.fasterxml.jackson.core.type.TypeReference typeReference33 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.JaxbWrapper jaxbWrapper34 = objectMapper5.readValue(byteArray32, typeReference33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectWriter3);
        org.junit.Assert.assertNotNull(objectMapper5);
        org.junit.Assert.assertNotNull(objectReader7);
        org.junit.Assert.assertNotNull(objectWriter11);
        org.junit.Assert.assertNotNull(objectMapper13);
        org.junit.Assert.assertTrue("'" + feature14 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature14.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objectMapper16);
        org.junit.Assert.assertNotNull(objectWriter19);
        org.junit.Assert.assertNotNull(xmlFactory20);
        org.junit.Assert.assertTrue("'" + feature21 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature21.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory22);
        org.junit.Assert.assertNotNull(featureClass23);
        org.junit.Assert.assertNotNull(objectReader24);
        org.junit.Assert.assertNotNull(objectWriter25);
        org.junit.Assert.assertNotNull(version29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[60, 110, 117, 108, 108, 47, 62]");
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        javax.xml.stream.XMLStreamReader xMLStreamReader0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper2 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory1);
        com.fasterxml.jackson.core.FormatSchema formatSchema3 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter4 = xmlMapper2.writer(formatSchema3);
        com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter defaultXmlPrettyPrinter5 = new com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper6 = xmlMapper2.setDefaultPrettyPrinter((com.fasterxml.jackson.core.PrettyPrinter) defaultXmlPrettyPrinter5);
        com.fasterxml.jackson.databind.deser.DeserializationProblemHandler deserializationProblemHandler7 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper8 = objectMapper6.addHandler(deserializationProblemHandler7);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector9 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version10 = jacksonXmlAnnotationIntrospector9.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        java.lang.String[] strArray12 = jacksonXmlAnnotationIntrospector9.findPropertiesToIgnore(annotated11);
        javax.xml.stream.XMLInputFactory xMLInputFactory13 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper14 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory13);
        com.fasterxml.jackson.core.FormatSchema formatSchema15 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter16 = xmlMapper14.writer(formatSchema15);
        com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter defaultXmlPrettyPrinter17 = new com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper18 = xmlMapper14.setDefaultPrettyPrinter((com.fasterxml.jackson.core.PrettyPrinter) defaultXmlPrettyPrinter17);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature19 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean20 = feature19.enabledByDefault();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper21 = xmlMapper14.enable(feature19);
        javax.xml.stream.XMLInputFactory xMLInputFactory22 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper23 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory22);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter24 = xmlMapper23.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory25 = xmlMapper23.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature26 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory27 = xmlFactory25.enable(feature26);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass28 = xmlFactory25.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.ObjectReader objectReader29 = objectMapper21.readerWithView(featureClass28);
        java.lang.Enum[] enumArray31 = new java.lang.Enum[0];
        @SuppressWarnings("unchecked")
        java.lang.Enum<?>[] wildcardEnumArray32 = (java.lang.Enum<?>[]) enumArray31;
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray36 = jacksonXmlAnnotationIntrospector9.findEnumValues(featureClass28, wildcardEnumArray32, strArray35);
        com.fasterxml.jackson.databind.jsonschema.JsonSchema jsonSchema37 = objectMapper8.generateJsonSchema(featureClass28);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream xmlTokenStream38 = new com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream(xMLStreamReader0, (java.lang.Object) jsonSchema37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectWriter4);
        org.junit.Assert.assertNotNull(objectMapper6);
        org.junit.Assert.assertNotNull(objectMapper8);
        org.junit.Assert.assertNotNull(version10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(objectWriter16);
        org.junit.Assert.assertNotNull(objectMapper18);
        org.junit.Assert.assertTrue("'" + feature19 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature19.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objectMapper21);
        org.junit.Assert.assertNotNull(objectWriter24);
        org.junit.Assert.assertNotNull(xmlFactory25);
        org.junit.Assert.assertTrue("'" + feature26 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature26.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory27);
        org.junit.Assert.assertNotNull(featureClass28);
        org.junit.Assert.assertNotNull(objectReader29);
        org.junit.Assert.assertNotNull(enumArray31);
        org.junit.Assert.assertNotNull(wildcardEnumArray32);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(jsonSchema37);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        javax.xml.stream.XMLStreamReader xMLStreamReader0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper2 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory1);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter3 = xmlMapper2.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory4 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = xmlMapper2.setNodeFactory(jsonNodeFactory4);
        com.fasterxml.jackson.databind.ser.SerializerFactory serializerFactory6 = xmlMapper2.getSerializerFactory();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper7 = xmlMapper2.copy();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream xmlTokenStream8 = new com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream(xMLStreamReader0, (java.lang.Object) xmlMapper7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectWriter3);
        org.junit.Assert.assertNotNull(objectMapper5);
        org.junit.Assert.assertNotNull(serializerFactory6);
        org.junit.Assert.assertNotNull(xmlMapper7);
    }
}


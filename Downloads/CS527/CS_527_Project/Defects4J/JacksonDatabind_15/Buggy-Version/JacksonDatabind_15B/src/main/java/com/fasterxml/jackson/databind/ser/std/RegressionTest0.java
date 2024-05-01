package com.fasterxml.jackson.databind.ser.std;

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
        int int0 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.TYPE_DOUBLE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.fasterxml.jackson.databind.ser.std.MapSerializer mapSerializer0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ser.std.MapSerializer mapSerializer3 = new com.fasterxml.jackson.databind.ser.std.MapSerializer(mapSerializer0, typeSerializer1, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer0 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ser.PropertyFilter propertyFilter4 = toStringSerializer0.findPropertyFilter(serializerProvider1, (java.lang.Object) 0, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringSerializer0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.fasterxml.jackson.databind.ser.std.DateSerializer dateSerializer0 = new com.fasterxml.jackson.databind.ser.std.DateSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateSerializer0._acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer0 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        java.lang.reflect.Type type2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = toStringSerializer0.getSchema(serializerProvider1, type2);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer4 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer0);
        com.fasterxml.jackson.databind.node.BooleanNode booleanNode5 = com.fasterxml.jackson.databind.node.BooleanNode.getTrue();
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser7 = booleanNode5.traverse(objectCodec6);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringSerializer0.serialize((java.lang.Object) booleanNode5, jsonGenerator8, serializerProvider9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringSerializer0);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNotNull(booleanNode5);
        org.junit.Assert.assertNotNull(jsonParser7);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.fasterxml.jackson.databind.ser.std.SerializableSerializer serializableSerializer0 = new com.fasterxml.jackson.databind.ser.std.SerializableSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            serializableSerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.fasterxml.jackson.databind.ser.std.DateSerializer dateSerializer0 = new com.fasterxml.jackson.databind.ser.std.DateSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.deser.UnresolvedForwardReference unresolvedForwardReference3 = new com.fasterxml.jackson.databind.deser.UnresolvedForwardReference("hi!");
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference4 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException5 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) unresolvedForwardReference3, reference4);
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer6 = com.fasterxml.jackson.databind.ser.std.CalendarSerializer.instance;
        // The following exception was thrown during execution in test generation
        try {
            dateSerializer0.wrapAndThrow(serializerProvider1, (java.lang.Throwable) unresolvedForwardReference3, (java.lang.Object) calendarSerializer6, "");
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.deser.UnresolvedForwardReference whose getMessage() throws an exception");
        } catch (com.fasterxml.jackson.databind.deser.UnresolvedForwardReference e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonMappingException5);
        org.junit.Assert.assertNotNull(calendarSerializer6);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer0 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        java.lang.reflect.Type type2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = toStringSerializer0.getSchema(serializerProvider1, type2);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer4 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer0);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator6 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringSerializer0.serialize((java.lang.Object) (short) 10, jsonGenerator6, serializerProvider7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringSerializer0);
        org.junit.Assert.assertNotNull(jsonNode3);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer0 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        java.lang.reflect.Type type2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = toStringSerializer0.getSchema(serializerProvider1, type2);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer4 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer0);
        java.lang.Class<java.util.List<java.lang.String>> strListClass5 = indexedStringListSerializer4.handledType();
        boolean boolean6 = com.fasterxml.jackson.databind.util.ClassUtil.isConcrete(strListClass5);
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.type.CollectionType collectionType8 = com.fasterxml.jackson.databind.type.CollectionType.construct(strListClass5, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringSerializer0);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNotNull(strListClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.fasterxml.jackson.databind.ser.std.SerializableSerializer serializableSerializer0 = new com.fasterxml.jackson.databind.ser.std.SerializableSerializer();
        com.fasterxml.jackson.databind.node.BooleanNode booleanNode1 = com.fasterxml.jackson.databind.node.BooleanNode.TRUE;
        com.fasterxml.jackson.core.JsonToken jsonToken2 = booleanNode1.asToken();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator3 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        // The following exception was thrown during execution in test generation
        try {
            serializableSerializer0.serialize((com.fasterxml.jackson.databind.JsonSerializable) booleanNode1, jsonGenerator3, serializerProvider4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanNode1);
        org.junit.Assert.assertTrue("'" + jsonToken2 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken2.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        int int0 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.TYPE_CLASS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 15 + "'", int0 == 15);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer2 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName5 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations6 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        com.fasterxml.jackson.databind.BeanProperty.Std std9 = new com.fasterxml.jackson.databind.BeanProperty.Std("", javaType4, propertyName5, annotations6, annotatedMember7, true);
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer10 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.CollectionSerializer collectionSerializer11 = new com.fasterxml.jackson.databind.ser.std.CollectionSerializer(javaType0, true, typeSerializer2, (com.fasterxml.jackson.databind.BeanProperty) std9, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer10);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator17 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider18 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            collectionSerializer11.serializeWithType((java.util.Collection<java.lang.String>) strList15, jsonGenerator17, serializerProvider18, typeSerializer19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringSerializer10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.fasterxml.jackson.databind.ser.std.UUIDSerializer uUIDSerializer0 = new com.fasterxml.jackson.databind.ser.std.UUIDSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        uUIDSerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        com.fasterxml.jackson.databind.node.BooleanNode booleanNode5 = com.fasterxml.jackson.databind.node.BooleanNode.TRUE;
        com.fasterxml.jackson.core.JsonToken jsonToken6 = booleanNode5.asToken();
        com.fasterxml.jackson.databind.deser.UnresolvedForwardReference unresolvedForwardReference8 = new com.fasterxml.jackson.databind.deser.UnresolvedForwardReference("hi!");
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference9 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException10 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) unresolvedForwardReference8, reference9);
        boolean boolean11 = booleanNode5.equals((java.lang.Object) jsonMappingException10);
        com.fasterxml.jackson.databind.util.EnumValues enumValues12 = null;
        com.fasterxml.jackson.databind.ser.std.EnumSerializer enumSerializer13 = new com.fasterxml.jackson.databind.ser.std.EnumSerializer(enumValues12);
        // The following exception was thrown during execution in test generation
        try {
            uUIDSerializer0.wrapAndThrow(serializerProvider4, (java.lang.Throwable) jsonMappingException10, (java.lang.Object) enumValues12, "hi!");
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.deser.UnresolvedForwardReference whose getMessage() throws an exception");
        } catch (com.fasterxml.jackson.databind.deser.UnresolvedForwardReference e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanNode5);
        org.junit.Assert.assertTrue("'" + jsonToken6 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken6.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertNotNull(jsonMappingException10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer2 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName5 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations6 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        com.fasterxml.jackson.databind.BeanProperty.Std std9 = new com.fasterxml.jackson.databind.BeanProperty.Std("", javaType4, propertyName5, annotations6, annotatedMember7, true);
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer10 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.CollectionSerializer collectionSerializer11 = new com.fasterxml.jackson.databind.ser.std.CollectionSerializer(javaType0, true, typeSerializer2, (com.fasterxml.jackson.databind.BeanProperty) std9, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer10);
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer12 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider13 = null;
        java.lang.reflect.Type type14 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = toStringSerializer12.getSchema(serializerProvider13, type14);
        boolean boolean16 = toStringSerializer10.isDefaultSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer12);
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer17 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        boolean boolean18 = toStringSerializer17.isUnwrappingSerializer();
        boolean boolean19 = toStringSerializer10.isEmpty((java.lang.Object) boolean18);
        org.junit.Assert.assertNotNull(toStringSerializer10);
        org.junit.Assert.assertNotNull(toStringSerializer12);
        org.junit.Assert.assertNotNull(jsonNode15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(toStringSerializer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer2 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName5 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations6 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        com.fasterxml.jackson.databind.BeanProperty.Std std9 = new com.fasterxml.jackson.databind.BeanProperty.Std("", javaType4, propertyName5, annotations6, annotatedMember7, true);
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer10 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.CollectionSerializer collectionSerializer11 = new com.fasterxml.jackson.databind.ser.std.CollectionSerializer(javaType0, true, typeSerializer2, (com.fasterxml.jackson.databind.BeanProperty) std9, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        com.fasterxml.jackson.databind.deser.UnresolvedForwardReference unresolvedForwardReference14 = new com.fasterxml.jackson.databind.deser.UnresolvedForwardReference("hi!");
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference15 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException16 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) unresolvedForwardReference14, reference15);
        // The following exception was thrown during execution in test generation
        try {
            toStringSerializer10.wrapAndThrow(serializerProvider12, (java.lang.Throwable) unresolvedForwardReference14, (java.lang.Object) 0.0d, "");
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.deser.UnresolvedForwardReference whose getMessage() throws an exception");
        } catch (com.fasterxml.jackson.databind.deser.UnresolvedForwardReference e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringSerializer10);
        org.junit.Assert.assertNotNull(jsonMappingException16);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.fasterxml.jackson.databind.ser.std.DateSerializer dateSerializer0 = new com.fasterxml.jackson.databind.ser.std.DateSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        java.lang.reflect.Type type2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode4 = dateSerializer0.getSchema(serializerProvider1, type2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'provider' passed for java.util.Date");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer1 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        java.lang.reflect.Type type3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = toStringSerializer1.getSchema(serializerProvider2, type3);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer5 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer1);
        java.lang.Class<java.util.List<java.lang.String>> strListClass6 = indexedStringListSerializer5.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = typeFactory0.constructRawCollectionLikeType(strListClass6);
        java.lang.Class<?> wildcardClass8 = collectionLikeType7.getParameterSource();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer9 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        java.lang.reflect.Type type11 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = toStringSerializer9.getSchema(serializerProvider10, type11);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer13 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer9);
        java.lang.Class<java.util.List<java.lang.String>> strListClass14 = indexedStringListSerializer13.handledType();
        boolean boolean15 = com.fasterxml.jackson.databind.util.ClassUtil.isConcrete(strListClass14);
        com.fasterxml.jackson.databind.JavaType javaType16 = collectionLikeType7.narrowBy(strListClass14);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator17 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider18 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            collectionLikeType7.serializeWithType(jsonGenerator17, serializerProvider18, typeSerializer19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(toStringSerializer1);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strListClass6);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNotNull(toStringSerializer9);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNotNull(strListClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(javaType16);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.fasterxml.jackson.databind.JavaType javaType0 = com.fasterxml.jackson.databind.ser.std.MapSerializer.UNSPECIFIED_TYPE;
        boolean boolean1 = javaType0.isEnumType();
        java.lang.String str2 = javaType0.toString();
        org.junit.Assert.assertNotNull(javaType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[simple type, class java.lang.Object]" + "'", str2, "[simple type, class java.lang.Object]");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer1 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        java.lang.reflect.Type type3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = toStringSerializer1.getSchema(serializerProvider2, type3);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer5 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer1);
        java.lang.Class<java.util.List<java.lang.String>> strListClass6 = indexedStringListSerializer5.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = typeFactory0.constructRawCollectionLikeType(strListClass6);
        java.lang.Class<?> wildcardClass8 = collectionLikeType7.getParameterSource();
        java.lang.StringBuilder stringBuilder9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder10 = collectionLikeType7.getGenericSignature(stringBuilder9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(toStringSerializer1);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strListClass6);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertNull(wildcardClass8);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.fasterxml.jackson.databind.node.BooleanNode booleanNode0 = com.fasterxml.jackson.databind.node.BooleanNode.getTrue();
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser2 = booleanNode0.traverse(objectCodec1);
        com.fasterxml.jackson.core.JsonParser jsonParser4 = jsonParser2.setFeatureMask((int) 'a');
        long long5 = jsonParser4.getValueAsLong();
        org.junit.Assert.assertNotNull(booleanNode0);
        org.junit.Assert.assertNotNull(jsonParser2);
        org.junit.Assert.assertNotNull(jsonParser4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.fasterxml.jackson.databind.ser.std.FileSerializer fileSerializer0 = new com.fasterxml.jackson.databind.ser.std.FileSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = fileSerializer0.getDelegatee();
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator2 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        // The following exception was thrown during execution in test generation
        try {
            floatSerializer0.serialize((java.lang.Float) 1.0f, jsonGenerator2, serializerProvider3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer0 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        java.lang.reflect.Type type2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = toStringSerializer0.getSchema(serializerProvider1, type2);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType4 = jsonNode3.numberType();
        org.junit.Assert.assertNotNull(toStringSerializer0);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(numberType4);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer2 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName5 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations6 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        com.fasterxml.jackson.databind.BeanProperty.Std std9 = new com.fasterxml.jackson.databind.BeanProperty.Std("", javaType4, propertyName5, annotations6, annotatedMember7, true);
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer10 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.CollectionSerializer collectionSerializer11 = new com.fasterxml.jackson.databind.ser.std.CollectionSerializer(javaType0, true, typeSerializer2, (com.fasterxml.jackson.databind.BeanProperty) std9, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer10);
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer12 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider13 = null;
        java.lang.reflect.Type type14 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = toStringSerializer12.getSchema(serializerProvider13, type14);
        boolean boolean16 = toStringSerializer10.isDefaultSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer12);
        java.lang.Class<java.lang.Object> objClass17 = toStringSerializer10.handledType();
        org.junit.Assert.assertNotNull(toStringSerializer10);
        org.junit.Assert.assertNotNull(toStringSerializer12);
        org.junit.Assert.assertNotNull(jsonNode15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objClass17);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer.instance;
        boolean boolean1 = shortSerializer0.isUnwrappingSerializer();
        org.junit.Assert.assertNotNull(shortSerializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer1 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        java.lang.reflect.Type type3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = toStringSerializer1.getSchema(serializerProvider2, type3);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer5 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer1);
        java.lang.Class<java.util.List<java.lang.String>> strListClass6 = indexedStringListSerializer5.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = typeFactory0.constructRawCollectionLikeType(strListClass6);
        java.lang.Class<?> wildcardClass8 = collectionLikeType7.getParameterSource();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer9 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        java.lang.reflect.Type type11 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = toStringSerializer9.getSchema(serializerProvider10, type11);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer13 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer9);
        java.lang.Class<java.util.List<java.lang.String>> strListClass14 = indexedStringListSerializer13.handledType();
        boolean boolean15 = com.fasterxml.jackson.databind.util.ClassUtil.isConcrete(strListClass14);
        com.fasterxml.jackson.databind.JavaType javaType16 = collectionLikeType7.narrowBy(strListClass14);
        com.fasterxml.jackson.databind.node.NullNode nullNode17 = collectionLikeType7.getValueHandler();
        boolean boolean18 = collectionLikeType7.isConcrete();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(toStringSerializer1);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strListClass6);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNotNull(toStringSerializer9);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNotNull(strListClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(javaType16);
        org.junit.Assert.assertNull(nullNode17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer1 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        java.lang.reflect.Type type3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = toStringSerializer1.getSchema(serializerProvider2, type3);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer5 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer1);
        java.lang.Class<java.util.List<java.lang.String>> strListClass6 = indexedStringListSerializer5.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = typeFactory0.constructRawCollectionLikeType(strListClass6);
        java.lang.Class<?> wildcardClass8 = collectionLikeType7.getParameterSource();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer9 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        java.lang.reflect.Type type11 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = toStringSerializer9.getSchema(serializerProvider10, type11);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer13 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer9);
        java.lang.Class<java.util.List<java.lang.String>> strListClass14 = indexedStringListSerializer13.handledType();
        boolean boolean15 = com.fasterxml.jackson.databind.util.ClassUtil.isConcrete(strListClass14);
        com.fasterxml.jackson.databind.JavaType javaType16 = collectionLikeType7.narrowBy(strListClass14);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer18 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider19 = null;
        java.lang.reflect.Type type20 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode21 = toStringSerializer18.getSchema(serializerProvider19, type20);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer22 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer18);
        java.lang.Class<java.util.List<java.lang.String>> strListClass23 = indexedStringListSerializer22.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType24 = typeFactory17.constructRawCollectionLikeType(strListClass23);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer26 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider27 = null;
        java.lang.reflect.Type type28 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode29 = toStringSerializer26.getSchema(serializerProvider27, type28);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer30 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer26);
        java.lang.Class<java.util.List<java.lang.String>> strListClass31 = indexedStringListSerializer30.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType32 = typeFactory25.constructRawCollectionLikeType(strListClass31);
        java.lang.Class<?> wildcardClass33 = collectionLikeType32.getParameterSource();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer34 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider35 = null;
        java.lang.reflect.Type type36 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode37 = toStringSerializer34.getSchema(serializerProvider35, type36);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer38 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer34);
        java.lang.Class<java.util.List<java.lang.String>> strListClass39 = indexedStringListSerializer38.handledType();
        boolean boolean40 = com.fasterxml.jackson.databind.util.ClassUtil.isConcrete(strListClass39);
        com.fasterxml.jackson.databind.JavaType javaType41 = collectionLikeType32.narrowBy(strListClass39);
        com.fasterxml.jackson.databind.type.MapType mapType42 = com.fasterxml.jackson.databind.type.MapType.construct(strListClass14, (com.fasterxml.jackson.databind.JavaType) collectionLikeType24, (com.fasterxml.jackson.databind.JavaType) collectionLikeType32);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory43 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer44 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider45 = null;
        java.lang.reflect.Type type46 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode47 = toStringSerializer44.getSchema(serializerProvider45, type46);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer48 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer44);
        java.lang.Class<java.util.List<java.lang.String>> strListClass49 = indexedStringListSerializer48.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType50 = typeFactory43.constructRawCollectionLikeType(strListClass49);
        com.fasterxml.jackson.databind.JavaType javaType51 = mapType42.widenContentsBy(strListClass49);
        java.lang.String str52 = mapType42.toCanonical();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(toStringSerializer1);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strListClass6);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNotNull(toStringSerializer9);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNotNull(strListClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(javaType16);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNotNull(toStringSerializer18);
        org.junit.Assert.assertNotNull(jsonNode21);
        org.junit.Assert.assertNotNull(strListClass23);
        org.junit.Assert.assertNotNull(collectionLikeType24);
        org.junit.Assert.assertNotNull(typeFactory25);
        org.junit.Assert.assertNotNull(toStringSerializer26);
        org.junit.Assert.assertNotNull(jsonNode29);
        org.junit.Assert.assertNotNull(strListClass31);
        org.junit.Assert.assertNotNull(collectionLikeType32);
        org.junit.Assert.assertNull(wildcardClass33);
        org.junit.Assert.assertNotNull(toStringSerializer34);
        org.junit.Assert.assertNotNull(jsonNode37);
        org.junit.Assert.assertNotNull(strListClass39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(javaType41);
        org.junit.Assert.assertNotNull(mapType42);
        org.junit.Assert.assertNotNull(typeFactory43);
        org.junit.Assert.assertNotNull(toStringSerializer44);
        org.junit.Assert.assertNotNull(jsonNode47);
        org.junit.Assert.assertNotNull(strListClass49);
        org.junit.Assert.assertNotNull(collectionLikeType50);
        org.junit.Assert.assertNotNull(javaType51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "java.util.List<java.util.List<java.lang.Object>,java.util.List<java.lang.Object>>" + "'", str52, "java.util.List<java.util.List<java.lang.Object>,java.util.List<java.lang.Object>>");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.fasterxml.jackson.databind.type.ArrayType arrayType0 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = null;
        com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer arrayBlockingQueueDeserializer7 = new com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer(javaType2, objJsonDeserializer3, typeDeserializer4, valueInstantiator5, objJsonDeserializer6);
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer11 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = null;
        com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer arrayBlockingQueueDeserializer14 = new com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer(javaType9, objJsonDeserializer10, typeDeserializer11, valueInstantiator12, objJsonDeserializer13);
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer17 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator18 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer19 = null;
        com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer arrayBlockingQueueDeserializer20 = new com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer(javaType15, objJsonDeserializer16, typeDeserializer17, valueInstantiator18, objJsonDeserializer19);
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer21 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(untypedObjectDeserializer1, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) arrayBlockingQueueDeserializer7, objCollectionJsonDeserializer8, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) arrayBlockingQueueDeserializer14, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) arrayBlockingQueueDeserializer20);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer objectArrayDeserializer23 = new com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer(arrayType0, (com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>) untypedObjectDeserializer21, typeDeserializer22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = null;
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider1 = null;
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext2 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper3 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory0, defaultSerializerProvider1, defaultDeserializationContext2);
        com.fasterxml.jackson.databind.node.BooleanNode booleanNode4 = com.fasterxml.jackson.databind.node.BooleanNode.TRUE;
        com.fasterxml.jackson.core.JsonToken jsonToken5 = booleanNode4.asToken();
        com.fasterxml.jackson.databind.node.TreeTraversingParser treeTraversingParser6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser((com.fasterxml.jackson.databind.JsonNode) booleanNode4);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer8 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider9 = null;
        java.lang.reflect.Type type10 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = toStringSerializer8.getSchema(serializerProvider9, type10);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer12 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer8);
        java.lang.Class<java.util.List<java.lang.String>> strListClass13 = indexedStringListSerializer12.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType14 = typeFactory7.constructRawCollectionLikeType(strListClass13);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = typeFactory7.withModifier(typeModifier15);
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer17 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider18 = null;
        java.lang.reflect.Type type19 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode20 = toStringSerializer17.getSchema(serializerProvider18, type19);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer21 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer17);
        java.lang.Class<java.util.List<java.lang.String>> strListClass22 = indexedStringListSerializer21.handledType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer24 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider25 = null;
        java.lang.reflect.Type type26 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode27 = toStringSerializer24.getSchema(serializerProvider25, type26);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer28 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer24);
        java.lang.Class<java.util.List<java.lang.String>> strListClass29 = indexedStringListSerializer28.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType30 = typeFactory23.constructRawCollectionLikeType(strListClass29);
        boolean boolean31 = com.fasterxml.jackson.databind.util.ClassUtil.isNonStaticInnerClass(strListClass29);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings32 = null;
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray33 = typeFactory7.findTypeParameters(strListClass22, strListClass29, typeBindings32);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList34 = objectMapper3.treeToValue((com.fasterxml.jackson.core.TreeNode) booleanNode4, strListClass22);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.JsonMappingException; message: Can not deserialize instance of java.util.ArrayList out of VALUE_TRUE token? at [Source: N/A; line: -1, column: -1]");
        } catch (com.fasterxml.jackson.databind.JsonMappingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanNode4);
        org.junit.Assert.assertTrue("'" + jsonToken5 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken5.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(toStringSerializer8);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertNotNull(strListClass13);
        org.junit.Assert.assertNotNull(collectionLikeType14);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(toStringSerializer17);
        org.junit.Assert.assertNotNull(jsonNode20);
        org.junit.Assert.assertNotNull(strListClass22);
        org.junit.Assert.assertNotNull(typeFactory23);
        org.junit.Assert.assertNotNull(toStringSerializer24);
        org.junit.Assert.assertNotNull(jsonNode27);
        org.junit.Assert.assertNotNull(strListClass29);
        org.junit.Assert.assertNotNull(collectionLikeType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(javaTypeArray33);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations3 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        com.fasterxml.jackson.databind.BeanProperty.Std std6 = new com.fasterxml.jackson.databind.BeanProperty.Std("", javaType1, propertyName2, annotations3, annotatedMember4, true);
        com.fasterxml.jackson.databind.PropertyName propertyName7 = std6.getWrapperName();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer9 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        java.lang.reflect.Type type11 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = toStringSerializer9.getSchema(serializerProvider10, type11);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer13 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer9);
        java.lang.Class<java.util.List<java.lang.String>> strListClass14 = indexedStringListSerializer13.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType15 = typeFactory8.constructRawCollectionLikeType(strListClass14);
        com.fasterxml.jackson.databind.BeanProperty.Std std16 = std6.withType((com.fasterxml.jackson.databind.JavaType) collectionLikeType15);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType18 = collectionLikeType15.withValueHandler((java.lang.Object) "[simple type, class java.lang.Object]");
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(toStringSerializer9);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNotNull(strListClass14);
        org.junit.Assert.assertNotNull(collectionLikeType15);
        org.junit.Assert.assertNotNull(std16);
        org.junit.Assert.assertNotNull(collectionLikeType18);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.deser.UnresolvedForwardReference unresolvedForwardReference3 = new com.fasterxml.jackson.databind.deser.UnresolvedForwardReference("hi!");
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference4 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException5 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) unresolvedForwardReference3, reference4);
        com.fasterxml.jackson.databind.node.NullNode nullNode6 = com.fasterxml.jackson.databind.node.NullNode.instance;
        // The following exception was thrown during execution in test generation
        try {
            floatSerializer0.wrapAndThrow(serializerProvider1, (java.lang.Throwable) jsonMappingException5, (java.lang.Object) nullNode6, "[simple type, class java.lang.Object]");
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.deser.UnresolvedForwardReference whose getMessage() throws an exception");
        } catch (com.fasterxml.jackson.databind.deser.UnresolvedForwardReference e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonMappingException5);
        org.junit.Assert.assertNotNull(nullNode6);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer2 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName5 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations6 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        com.fasterxml.jackson.databind.BeanProperty.Std std9 = new com.fasterxml.jackson.databind.BeanProperty.Std("", javaType4, propertyName5, annotations6, annotatedMember7, true);
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer10 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.CollectionSerializer collectionSerializer11 = new com.fasterxml.jackson.databind.ser.std.CollectionSerializer(javaType0, true, typeSerializer2, (com.fasterxml.jackson.databind.BeanProperty) std9, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer10);
        java.lang.String[] strArray14 = new java.lang.String[] { "java.util.List<java.util.List<java.lang.Object>,java.util.List<java.lang.Object>>", "[simple type, class java.lang.Object]" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator17 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider18 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            collectionSerializer11.serializeWithType((java.util.Collection<java.lang.String>) strList15, jsonGenerator17, serializerProvider18, typeSerializer19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringSerializer10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.math.BigDecimal bigDecimal0 = null;
        com.fasterxml.jackson.databind.node.DecimalNode decimalNode1 = new com.fasterxml.jackson.databind.node.DecimalNode(bigDecimal0);
        // The following exception was thrown during execution in test generation
        try {
            double double2 = decimalNode1.doubleValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.fasterxml.jackson.databind.ser.std.BeanSerializerBase beanSerializerBase0 = null;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer unwrappingBeanSerializer2 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(beanSerializerBase0, nameTransformer1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.fasterxml.jackson.databind.BeanDescription beanDescription0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.AbstractDeserializer abstractDeserializer1 = com.fasterxml.jackson.databind.deser.AbstractDeserializer.constructForNonPOJO(beanDescription0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.fasterxml.jackson.databind.ser.std.DateSerializer dateSerializer0 = new com.fasterxml.jackson.databind.ser.std.DateSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = dateSerializer0._asTimestamp(serializerProvider1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'provider' passed for java.util.Date");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer1 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        java.lang.reflect.Type type3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = toStringSerializer1.getSchema(serializerProvider2, type3);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer5 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer1);
        java.lang.Class<java.util.List<java.lang.String>> strListClass6 = indexedStringListSerializer5.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = typeFactory0.constructRawCollectionLikeType(strListClass6);
        java.lang.Class<?> wildcardClass8 = collectionLikeType7.getParameterSource();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer9 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        java.lang.reflect.Type type11 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = toStringSerializer9.getSchema(serializerProvider10, type11);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer13 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer9);
        java.lang.Class<java.util.List<java.lang.String>> strListClass14 = indexedStringListSerializer13.handledType();
        boolean boolean15 = com.fasterxml.jackson.databind.util.ClassUtil.isConcrete(strListClass14);
        com.fasterxml.jackson.databind.JavaType javaType16 = collectionLikeType7.narrowBy(strListClass14);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer18 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider19 = null;
        java.lang.reflect.Type type20 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode21 = toStringSerializer18.getSchema(serializerProvider19, type20);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer22 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer18);
        java.lang.Class<java.util.List<java.lang.String>> strListClass23 = indexedStringListSerializer22.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType24 = typeFactory17.constructRawCollectionLikeType(strListClass23);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer26 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider27 = null;
        java.lang.reflect.Type type28 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode29 = toStringSerializer26.getSchema(serializerProvider27, type28);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer30 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer26);
        java.lang.Class<java.util.List<java.lang.String>> strListClass31 = indexedStringListSerializer30.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType32 = typeFactory25.constructRawCollectionLikeType(strListClass31);
        java.lang.Class<?> wildcardClass33 = collectionLikeType32.getParameterSource();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer34 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider35 = null;
        java.lang.reflect.Type type36 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode37 = toStringSerializer34.getSchema(serializerProvider35, type36);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer38 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer34);
        java.lang.Class<java.util.List<java.lang.String>> strListClass39 = indexedStringListSerializer38.handledType();
        boolean boolean40 = com.fasterxml.jackson.databind.util.ClassUtil.isConcrete(strListClass39);
        com.fasterxml.jackson.databind.JavaType javaType41 = collectionLikeType32.narrowBy(strListClass39);
        com.fasterxml.jackson.databind.type.MapType mapType42 = com.fasterxml.jackson.databind.type.MapType.construct(strListClass14, (com.fasterxml.jackson.databind.JavaType) collectionLikeType24, (com.fasterxml.jackson.databind.JavaType) collectionLikeType32);
        boolean boolean43 = mapType42.isTrueMapType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(toStringSerializer1);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strListClass6);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNotNull(toStringSerializer9);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNotNull(strListClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(javaType16);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNotNull(toStringSerializer18);
        org.junit.Assert.assertNotNull(jsonNode21);
        org.junit.Assert.assertNotNull(strListClass23);
        org.junit.Assert.assertNotNull(collectionLikeType24);
        org.junit.Assert.assertNotNull(typeFactory25);
        org.junit.Assert.assertNotNull(toStringSerializer26);
        org.junit.Assert.assertNotNull(jsonNode29);
        org.junit.Assert.assertNotNull(strListClass31);
        org.junit.Assert.assertNotNull(collectionLikeType32);
        org.junit.Assert.assertNull(wildcardClass33);
        org.junit.Assert.assertNotNull(toStringSerializer34);
        org.junit.Assert.assertNotNull(jsonNode37);
        org.junit.Assert.assertNotNull(strListClass39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(javaType41);
        org.junit.Assert.assertNotNull(mapType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer0 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations5 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember6 = null;
        com.fasterxml.jackson.databind.BeanProperty.Std std8 = new com.fasterxml.jackson.databind.BeanProperty.Std("", javaType3, propertyName4, annotations5, annotatedMember6, true);
        com.fasterxml.jackson.databind.PropertyName propertyName9 = std8.getWrapperName();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer11 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        java.lang.reflect.Type type13 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = toStringSerializer11.getSchema(serializerProvider12, type13);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer15 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer11);
        java.lang.Class<java.util.List<java.lang.String>> strListClass16 = indexedStringListSerializer15.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType17 = typeFactory10.constructRawCollectionLikeType(strListClass16);
        com.fasterxml.jackson.databind.BeanProperty.Std std18 = std8.withType((com.fasterxml.jackson.databind.JavaType) collectionLikeType17);
        com.fasterxml.jackson.databind.PropertyName propertyName19 = std18.getWrapperName();
        com.fasterxml.jackson.databind.JavaType javaType20 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer22 = null;
        com.fasterxml.jackson.databind.JavaType javaType24 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName25 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations26 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember27 = null;
        com.fasterxml.jackson.databind.BeanProperty.Std std29 = new com.fasterxml.jackson.databind.BeanProperty.Std("", javaType24, propertyName25, annotations26, annotatedMember27, true);
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer30 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.CollectionSerializer collectionSerializer31 = new com.fasterxml.jackson.databind.ser.std.CollectionSerializer(javaType20, true, typeSerializer22, (com.fasterxml.jackson.databind.BeanProperty) std29, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer30);
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer32 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider33 = null;
        java.lang.reflect.Type type34 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode35 = toStringSerializer32.getSchema(serializerProvider33, type34);
        boolean boolean36 = toStringSerializer30.isDefaultSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer32);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer37 = toStringSerializer0.findConvertingContentSerializer(serializerProvider1, (com.fasterxml.jackson.databind.BeanProperty) std18, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringSerializer0);
        org.junit.Assert.assertNull(propertyName9);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(toStringSerializer11);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNotNull(strListClass16);
        org.junit.Assert.assertNotNull(collectionLikeType17);
        org.junit.Assert.assertNotNull(std18);
        org.junit.Assert.assertNull(propertyName19);
        org.junit.Assert.assertNotNull(toStringSerializer30);
        org.junit.Assert.assertNotNull(toStringSerializer32);
        org.junit.Assert.assertNotNull(jsonNode35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer2 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName5 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations6 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        com.fasterxml.jackson.databind.BeanProperty.Std std9 = new com.fasterxml.jackson.databind.BeanProperty.Std("", javaType4, propertyName5, annotations6, annotatedMember7, true);
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer10 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.CollectionSerializer collectionSerializer11 = new com.fasterxml.jackson.databind.ser.std.CollectionSerializer(javaType0, true, typeSerializer2, (com.fasterxml.jackson.databind.BeanProperty) std9, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer10);
        com.fasterxml.jackson.databind.JavaType javaType12 = collectionSerializer11.getContentType();
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "java.util.List<java.util.List<java.lang.Object>,java.util.List<java.lang.Object>>" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator19 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider20 = null;
        // The following exception was thrown during execution in test generation
        try {
            collectionSerializer11.serialize((java.util.Collection<java.lang.String>) strList17, jsonGenerator19, serializerProvider20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringSerializer10);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer2 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName5 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations6 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        com.fasterxml.jackson.databind.BeanProperty.Std std9 = new com.fasterxml.jackson.databind.BeanProperty.Std("", javaType4, propertyName5, annotations6, annotatedMember7, true);
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer10 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.CollectionSerializer collectionSerializer11 = new com.fasterxml.jackson.databind.ser.std.CollectionSerializer(javaType0, true, typeSerializer2, (com.fasterxml.jackson.databind.BeanProperty) std9, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer10);
        com.fasterxml.jackson.databind.JavaType javaType12 = collectionSerializer11.getContentType();
        java.lang.String[] strArray15 = new java.lang.String[] { "java.util.List<java.util.List<java.lang.Object>,java.util.List<java.lang.Object>>", "[simple type, class java.lang.Object]" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator18 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider19 = null;
        // The following exception was thrown during execution in test generation
        try {
            collectionSerializer11.serializeContents((java.util.Collection<java.lang.String>) strList16, jsonGenerator18, serializerProvider19);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.JsonMappingException; message: (was java.lang.NullPointerException) (through reference chain: java.util.ArrayList[0])");
        } catch (com.fasterxml.jackson.databind.JsonMappingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringSerializer10);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        boolean boolean3 = floatSerializer0.isEmpty(serializerProvider1, (java.lang.Float) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.math.BigDecimal bigDecimal0 = null;
        com.fasterxml.jackson.databind.node.DecimalNode decimalNode1 = new com.fasterxml.jackson.databind.node.DecimalNode(bigDecimal0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = decimalNode1.canConvertToInt();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.fasterxml.jackson.databind.ser.std.SqlDateSerializer sqlDateSerializer0 = new com.fasterxml.jackson.databind.ser.std.SqlDateSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.node.BooleanNode booleanNode2 = com.fasterxml.jackson.databind.node.BooleanNode.TRUE;
        com.fasterxml.jackson.core.JsonToken jsonToken3 = booleanNode2.asToken();
        com.fasterxml.jackson.databind.deser.UnresolvedForwardReference unresolvedForwardReference5 = new com.fasterxml.jackson.databind.deser.UnresolvedForwardReference("hi!");
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference6 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException7 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) unresolvedForwardReference5, reference6);
        boolean boolean8 = booleanNode2.equals((java.lang.Object) jsonMappingException7);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer10 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        java.lang.reflect.Type type12 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = toStringSerializer10.getSchema(serializerProvider11, type12);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer14 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer10);
        java.lang.Class<java.util.List<java.lang.String>> strListClass15 = indexedStringListSerializer14.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType16 = typeFactory9.constructRawCollectionLikeType(strListClass15);
        java.lang.Class<?> wildcardClass17 = collectionLikeType16.getParameterSource();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer18 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider19 = null;
        java.lang.reflect.Type type20 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode21 = toStringSerializer18.getSchema(serializerProvider19, type20);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer22 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer18);
        java.lang.Class<java.util.List<java.lang.String>> strListClass23 = indexedStringListSerializer22.handledType();
        boolean boolean24 = com.fasterxml.jackson.databind.util.ClassUtil.isConcrete(strListClass23);
        com.fasterxml.jackson.databind.JavaType javaType25 = collectionLikeType16.narrowBy(strListClass23);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer27 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider28 = null;
        java.lang.reflect.Type type29 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode30 = toStringSerializer27.getSchema(serializerProvider28, type29);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer31 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer27);
        java.lang.Class<java.util.List<java.lang.String>> strListClass32 = indexedStringListSerializer31.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType33 = typeFactory26.constructRawCollectionLikeType(strListClass32);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory34 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer35 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider36 = null;
        java.lang.reflect.Type type37 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode38 = toStringSerializer35.getSchema(serializerProvider36, type37);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer39 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer35);
        java.lang.Class<java.util.List<java.lang.String>> strListClass40 = indexedStringListSerializer39.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType41 = typeFactory34.constructRawCollectionLikeType(strListClass40);
        java.lang.Class<?> wildcardClass42 = collectionLikeType41.getParameterSource();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer43 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider44 = null;
        java.lang.reflect.Type type45 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode46 = toStringSerializer43.getSchema(serializerProvider44, type45);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer47 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer43);
        java.lang.Class<java.util.List<java.lang.String>> strListClass48 = indexedStringListSerializer47.handledType();
        boolean boolean49 = com.fasterxml.jackson.databind.util.ClassUtil.isConcrete(strListClass48);
        com.fasterxml.jackson.databind.JavaType javaType50 = collectionLikeType41.narrowBy(strListClass48);
        com.fasterxml.jackson.databind.type.MapType mapType51 = com.fasterxml.jackson.databind.type.MapType.construct(strListClass23, (com.fasterxml.jackson.databind.JavaType) collectionLikeType33, (com.fasterxml.jackson.databind.JavaType) collectionLikeType41);
        // The following exception was thrown during execution in test generation
        try {
            sqlDateSerializer0.wrapAndThrow(serializerProvider1, (java.lang.Throwable) jsonMappingException7, (java.lang.Object) collectionLikeType33, 9);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.deser.UnresolvedForwardReference whose getMessage() throws an exception");
        } catch (com.fasterxml.jackson.databind.deser.UnresolvedForwardReference e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanNode2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertNotNull(jsonMappingException7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(toStringSerializer10);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertNotNull(strListClass15);
        org.junit.Assert.assertNotNull(collectionLikeType16);
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertNotNull(toStringSerializer18);
        org.junit.Assert.assertNotNull(jsonNode21);
        org.junit.Assert.assertNotNull(strListClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(javaType25);
        org.junit.Assert.assertNotNull(typeFactory26);
        org.junit.Assert.assertNotNull(toStringSerializer27);
        org.junit.Assert.assertNotNull(jsonNode30);
        org.junit.Assert.assertNotNull(strListClass32);
        org.junit.Assert.assertNotNull(collectionLikeType33);
        org.junit.Assert.assertNotNull(typeFactory34);
        org.junit.Assert.assertNotNull(toStringSerializer35);
        org.junit.Assert.assertNotNull(jsonNode38);
        org.junit.Assert.assertNotNull(strListClass40);
        org.junit.Assert.assertNotNull(collectionLikeType41);
        org.junit.Assert.assertNull(wildcardClass42);
        org.junit.Assert.assertNotNull(toStringSerializer43);
        org.junit.Assert.assertNotNull(jsonNode46);
        org.junit.Assert.assertNotNull(strListClass48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(javaType50);
        org.junit.Assert.assertNotNull(mapType51);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer1 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        java.lang.reflect.Type type3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = toStringSerializer1.getSchema(serializerProvider2, type3);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer5 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer1);
        java.lang.Class<java.util.List<java.lang.String>> strListClass6 = indexedStringListSerializer5.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = typeFactory0.constructRawCollectionLikeType(strListClass6);
        com.fasterxml.jackson.databind.PropertyName propertyName8 = collectionLikeType7.getTypeHandler();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer13 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName16 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations17 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember18 = null;
        com.fasterxml.jackson.databind.BeanProperty.Std std20 = new com.fasterxml.jackson.databind.BeanProperty.Std("", javaType15, propertyName16, annotations17, annotatedMember18, true);
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer21 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.CollectionSerializer collectionSerializer22 = new com.fasterxml.jackson.databind.ser.std.CollectionSerializer(javaType11, true, typeSerializer13, (com.fasterxml.jackson.databind.BeanProperty) std20, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer21);
        com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer objectArraySerializer23 = new com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, false, typeSerializer10, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer21);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper24 = null;
        com.fasterxml.jackson.databind.JavaType javaType25 = null;
        toStringSerializer21.acceptJsonFormatVisitor(jsonFormatVisitorWrapper24, javaType25);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(toStringSerializer1);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strListClass6);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertNull(propertyName8);
        org.junit.Assert.assertNotNull(toStringSerializer21);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer2 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName5 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations6 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        com.fasterxml.jackson.databind.BeanProperty.Std std9 = new com.fasterxml.jackson.databind.BeanProperty.Std("", javaType4, propertyName5, annotations6, annotatedMember7, true);
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer10 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.CollectionSerializer collectionSerializer11 = new com.fasterxml.jackson.databind.ser.std.CollectionSerializer(javaType0, true, typeSerializer2, (com.fasterxml.jackson.databind.BeanProperty) std9, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer10);
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer14 = null;
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName17 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations18 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember19 = null;
        com.fasterxml.jackson.databind.BeanProperty.Std std21 = new com.fasterxml.jackson.databind.BeanProperty.Std("", javaType16, propertyName17, annotations18, annotatedMember19, true);
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer22 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.CollectionSerializer collectionSerializer23 = new com.fasterxml.jackson.databind.ser.std.CollectionSerializer(javaType12, true, typeSerializer14, (com.fasterxml.jackson.databind.BeanProperty) std21, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer22);
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer24 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider25 = null;
        java.lang.reflect.Type type26 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode27 = toStringSerializer24.getSchema(serializerProvider25, type26);
        boolean boolean28 = toStringSerializer22.isDefaultSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer24);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer29 = toStringSerializer10.replaceDelegatee((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer22);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringSerializer10);
        org.junit.Assert.assertNotNull(toStringSerializer22);
        org.junit.Assert.assertNotNull(toStringSerializer24);
        org.junit.Assert.assertNotNull(jsonNode27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature0 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS;
        org.junit.Assert.assertTrue("'" + deserializationFeature0 + "' != '" + com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS + "'", deserializationFeature0.equals(com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer1 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        java.lang.reflect.Type type3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = toStringSerializer1.getSchema(serializerProvider2, type3);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer5 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer1);
        java.lang.Class<java.util.List<java.lang.String>> strListClass6 = indexedStringListSerializer5.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = typeFactory0.constructRawCollectionLikeType(strListClass6);
        com.fasterxml.jackson.databind.PropertyName propertyName8 = collectionLikeType7.getTypeHandler();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer13 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName16 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations17 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember18 = null;
        com.fasterxml.jackson.databind.BeanProperty.Std std20 = new com.fasterxml.jackson.databind.BeanProperty.Std("", javaType15, propertyName16, annotations17, annotatedMember18, true);
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer21 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.CollectionSerializer collectionSerializer22 = new com.fasterxml.jackson.databind.ser.std.CollectionSerializer(javaType11, true, typeSerializer13, (com.fasterxml.jackson.databind.BeanProperty) std20, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer21);
        com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer objectArraySerializer23 = new com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, false, typeSerializer10, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer21);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider24 = null;
        com.fasterxml.jackson.databind.JavaType javaType26 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName27 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations28 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember29 = null;
        com.fasterxml.jackson.databind.BeanProperty.Std std31 = new com.fasterxml.jackson.databind.BeanProperty.Std("", javaType26, propertyName27, annotations28, annotatedMember29, true);
        com.fasterxml.jackson.databind.PropertyName propertyName32 = std31.getWrapperName();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer34 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider35 = null;
        java.lang.reflect.Type type36 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode37 = toStringSerializer34.getSchema(serializerProvider35, type36);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer38 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer34);
        java.lang.Class<java.util.List<java.lang.String>> strListClass39 = indexedStringListSerializer38.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType40 = typeFactory33.constructRawCollectionLikeType(strListClass39);
        com.fasterxml.jackson.databind.BeanProperty.Std std41 = std31.withType((com.fasterxml.jackson.databind.JavaType) collectionLikeType40);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode43 = objectArraySerializer23.getSchema(serializerProvider24, (java.lang.reflect.Type) collectionLikeType40, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(toStringSerializer1);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strListClass6);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertNull(propertyName8);
        org.junit.Assert.assertNotNull(toStringSerializer21);
        org.junit.Assert.assertNull(propertyName32);
        org.junit.Assert.assertNotNull(typeFactory33);
        org.junit.Assert.assertNotNull(toStringSerializer34);
        org.junit.Assert.assertNotNull(jsonNode37);
        org.junit.Assert.assertNotNull(strListClass39);
        org.junit.Assert.assertNotNull(collectionLikeType40);
        org.junit.Assert.assertNotNull(std41);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.fasterxml.jackson.databind.deser.UnresolvedForwardReference unresolvedForwardReference1 = new com.fasterxml.jackson.databind.deser.UnresolvedForwardReference("hi!");
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference2 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException3 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) unresolvedForwardReference1, reference2);
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference4 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException5 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) unresolvedForwardReference1, reference4);
        org.junit.Assert.assertNotNull(jsonMappingException3);
        org.junit.Assert.assertNotNull(jsonMappingException5);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer1 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        java.lang.reflect.Type type3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = toStringSerializer1.getSchema(serializerProvider2, type3);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer5 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer1);
        java.lang.Class<java.util.List<java.lang.String>> strListClass6 = indexedStringListSerializer5.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = typeFactory0.constructRawCollectionLikeType(strListClass6);
        com.fasterxml.jackson.databind.PropertyName propertyName8 = collectionLikeType7.getTypeHandler();
        com.fasterxml.jackson.databind.JavaType javaType9 = collectionLikeType7.getKeyType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(toStringSerializer1);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strListClass6);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertNull(propertyName8);
        org.junit.Assert.assertNull(javaType9);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer1 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        java.lang.reflect.Type type3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = toStringSerializer1.getSchema(serializerProvider2, type3);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer5 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer1);
        java.lang.Class<java.util.List<java.lang.String>> strListClass6 = indexedStringListSerializer5.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = typeFactory0.constructRawCollectionLikeType(strListClass6);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory0.withModifier(typeModifier8);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer11 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        java.lang.reflect.Type type13 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = toStringSerializer11.getSchema(serializerProvider12, type13);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer15 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer11);
        java.lang.Class<java.util.List<java.lang.String>> strListClass16 = indexedStringListSerializer15.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType17 = typeFactory10.constructRawCollectionLikeType(strListClass16);
        java.lang.Class<?> wildcardClass18 = collectionLikeType17.getParameterSource();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer19 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider20 = null;
        java.lang.reflect.Type type21 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode22 = toStringSerializer19.getSchema(serializerProvider20, type21);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer23 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer19);
        java.lang.Class<java.util.List<java.lang.String>> strListClass24 = indexedStringListSerializer23.handledType();
        boolean boolean25 = com.fasterxml.jackson.databind.util.ClassUtil.isConcrete(strListClass24);
        com.fasterxml.jackson.databind.JavaType javaType26 = collectionLikeType17.narrowBy(strListClass24);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer28 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider29 = null;
        java.lang.reflect.Type type30 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode31 = toStringSerializer28.getSchema(serializerProvider29, type30);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer32 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer28);
        java.lang.Class<java.util.List<java.lang.String>> strListClass33 = indexedStringListSerializer32.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType34 = typeFactory27.constructRawCollectionLikeType(strListClass33);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory35 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer36 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider37 = null;
        java.lang.reflect.Type type38 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode39 = toStringSerializer36.getSchema(serializerProvider37, type38);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer40 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer36);
        java.lang.Class<java.util.List<java.lang.String>> strListClass41 = indexedStringListSerializer40.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType42 = typeFactory35.constructRawCollectionLikeType(strListClass41);
        java.lang.Class<?> wildcardClass43 = collectionLikeType42.getParameterSource();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer44 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider45 = null;
        java.lang.reflect.Type type46 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode47 = toStringSerializer44.getSchema(serializerProvider45, type46);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer48 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer44);
        java.lang.Class<java.util.List<java.lang.String>> strListClass49 = indexedStringListSerializer48.handledType();
        boolean boolean50 = com.fasterxml.jackson.databind.util.ClassUtil.isConcrete(strListClass49);
        com.fasterxml.jackson.databind.JavaType javaType51 = collectionLikeType42.narrowBy(strListClass49);
        com.fasterxml.jackson.databind.type.MapType mapType52 = com.fasterxml.jackson.databind.type.MapType.construct(strListClass24, (com.fasterxml.jackson.databind.JavaType) collectionLikeType34, (com.fasterxml.jackson.databind.JavaType) collectionLikeType42);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory53 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer54 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider55 = null;
        java.lang.reflect.Type type56 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode57 = toStringSerializer54.getSchema(serializerProvider55, type56);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer58 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer54);
        java.lang.Class<java.util.List<java.lang.String>> strListClass59 = indexedStringListSerializer58.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType60 = typeFactory53.constructRawCollectionLikeType(strListClass59);
        com.fasterxml.jackson.databind.JavaType javaType61 = mapType52.widenContentsBy(strListClass59);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType62 = typeFactory9.constructRawMapLikeType(strListClass59);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(toStringSerializer1);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strListClass6);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(toStringSerializer11);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNotNull(strListClass16);
        org.junit.Assert.assertNotNull(collectionLikeType17);
        org.junit.Assert.assertNull(wildcardClass18);
        org.junit.Assert.assertNotNull(toStringSerializer19);
        org.junit.Assert.assertNotNull(jsonNode22);
        org.junit.Assert.assertNotNull(strListClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(javaType26);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(toStringSerializer28);
        org.junit.Assert.assertNotNull(jsonNode31);
        org.junit.Assert.assertNotNull(strListClass33);
        org.junit.Assert.assertNotNull(collectionLikeType34);
        org.junit.Assert.assertNotNull(typeFactory35);
        org.junit.Assert.assertNotNull(toStringSerializer36);
        org.junit.Assert.assertNotNull(jsonNode39);
        org.junit.Assert.assertNotNull(strListClass41);
        org.junit.Assert.assertNotNull(collectionLikeType42);
        org.junit.Assert.assertNull(wildcardClass43);
        org.junit.Assert.assertNotNull(toStringSerializer44);
        org.junit.Assert.assertNotNull(jsonNode47);
        org.junit.Assert.assertNotNull(strListClass49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(javaType51);
        org.junit.Assert.assertNotNull(mapType52);
        org.junit.Assert.assertNotNull(typeFactory53);
        org.junit.Assert.assertNotNull(toStringSerializer54);
        org.junit.Assert.assertNotNull(jsonNode57);
        org.junit.Assert.assertNotNull(strListClass59);
        org.junit.Assert.assertNotNull(collectionLikeType60);
        org.junit.Assert.assertNotNull(javaType61);
        org.junit.Assert.assertNotNull(mapLikeType62);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = null;
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider1 = null;
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext2 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper3 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory0, defaultSerializerProvider1, defaultDeserializationContext2);
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature4 = null;
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature5 = com.fasterxml.jackson.databind.DeserializationFeature.READ_ENUMS_USING_TO_STRING;
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature6 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_INVALID_SUBTYPE;
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature7 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature8 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_INVALID_SUBTYPE;
        com.fasterxml.jackson.databind.DeserializationFeature[] deserializationFeatureArray9 = new com.fasterxml.jackson.databind.DeserializationFeature[] { deserializationFeature5, deserializationFeature6, deserializationFeature7, deserializationFeature8 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper3.disable(deserializationFeature4, deserializationFeatureArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + deserializationFeature5 + "' != '" + com.fasterxml.jackson.databind.DeserializationFeature.READ_ENUMS_USING_TO_STRING + "'", deserializationFeature5.equals(com.fasterxml.jackson.databind.DeserializationFeature.READ_ENUMS_USING_TO_STRING));
        org.junit.Assert.assertTrue("'" + deserializationFeature6 + "' != '" + com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_INVALID_SUBTYPE + "'", deserializationFeature6.equals(com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_INVALID_SUBTYPE));
        org.junit.Assert.assertTrue("'" + deserializationFeature7 + "' != '" + com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES + "'", deserializationFeature7.equals(com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        org.junit.Assert.assertTrue("'" + deserializationFeature8 + "' != '" + com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_INVALID_SUBTYPE + "'", deserializationFeature8.equals(com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_INVALID_SUBTYPE));
        org.junit.Assert.assertNotNull(deserializationFeatureArray9);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.fasterxml.jackson.databind.ser.std.EnumSetSerializer enumSetSerializer0 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations4 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        com.fasterxml.jackson.databind.BeanProperty.Std std7 = new com.fasterxml.jackson.databind.BeanProperty.Std("", javaType2, propertyName3, annotations4, annotatedMember5, true);
        com.fasterxml.jackson.databind.PropertyName propertyName8 = std7.getWrapperName();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer10 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        java.lang.reflect.Type type12 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = toStringSerializer10.getSchema(serializerProvider11, type12);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer14 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer10);
        java.lang.Class<java.util.List<java.lang.String>> strListClass15 = indexedStringListSerializer14.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType16 = typeFactory9.constructRawCollectionLikeType(strListClass15);
        com.fasterxml.jackson.databind.BeanProperty.Std std17 = std7.withType((com.fasterxml.jackson.databind.JavaType) collectionLikeType16);
        java.lang.String str18 = std7.getName();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer19 = null;
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer20 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider21 = null;
        java.lang.reflect.Type type22 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode23 = toStringSerializer20.getSchema(serializerProvider21, type22);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ser.std.EnumSetSerializer enumSetSerializer24 = new com.fasterxml.jackson.databind.ser.std.EnumSetSerializer(enumSetSerializer0, (com.fasterxml.jackson.databind.BeanProperty) std7, typeSerializer19, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName8);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(toStringSerializer10);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertNotNull(strListClass15);
        org.junit.Assert.assertNotNull(collectionLikeType16);
        org.junit.Assert.assertNotNull(std17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(toStringSerializer20);
        org.junit.Assert.assertNotNull(jsonNode23);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance;
        com.fasterxml.jackson.databind.node.ValueNode valueNode2 = jsonNodeFactory0.booleanNode(true);
        com.fasterxml.jackson.databind.node.ValueNode valueNode4 = jsonNodeFactory0.numberNode((java.lang.Integer) 2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec5 = null;
        com.fasterxml.jackson.databind.node.TreeTraversingParser treeTraversingParser6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser((com.fasterxml.jackson.databind.JsonNode) valueNode4, objectCodec5);
        boolean boolean8 = treeTraversingParser6.hasTokenId(9);
        com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap annotatedMethodMap10 = new com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap();
        java.util.Spliterator<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> annotatedMethodSpliterator11 = annotatedMethodMap10.spliterator();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory13 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals(false);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer15 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider16 = null;
        java.lang.reflect.Type type17 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = toStringSerializer15.getSchema(serializerProvider16, type17);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer19 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer15);
        java.lang.Class<java.util.List<java.lang.String>> strListClass20 = indexedStringListSerializer19.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType21 = typeFactory14.constructRawCollectionLikeType(strListClass20);
        java.lang.Class<?> wildcardClass22 = collectionLikeType21.getParameterSource();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer23 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider24 = null;
        java.lang.reflect.Type type25 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode26 = toStringSerializer23.getSchema(serializerProvider24, type25);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer27 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer23);
        java.lang.Class<java.util.List<java.lang.String>> strListClass28 = indexedStringListSerializer27.handledType();
        boolean boolean29 = com.fasterxml.jackson.databind.util.ClassUtil.isConcrete(strListClass28);
        com.fasterxml.jackson.databind.JavaType javaType30 = collectionLikeType21.narrowBy(strListClass28);
        com.fasterxml.jackson.databind.node.ValueNode valueNode31 = jsonNodeFactory13.pojoNode((java.lang.Object) strListClass28);
        com.fasterxml.jackson.databind.exc.InvalidFormatException invalidFormatException32 = com.fasterxml.jackson.databind.exc.InvalidFormatException.from((com.fasterxml.jackson.core.JsonParser) treeTraversingParser6, "java.util.List<java.util.List<java.lang.Object>,java.util.List<java.lang.Object>>", (java.lang.Object) annotatedMethodMap10, strListClass28);
        double double33 = treeTraversingParser6.getDoubleValue();
        org.junit.Assert.assertNotNull(jsonNodeFactory0);
        org.junit.Assert.assertNotNull(valueNode2);
        org.junit.Assert.assertNotNull(valueNode4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(annotatedMethodSpliterator11);
        org.junit.Assert.assertNotNull(jsonNodeFactory13);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNotNull(toStringSerializer15);
        org.junit.Assert.assertNotNull(jsonNode18);
        org.junit.Assert.assertNotNull(strListClass20);
        org.junit.Assert.assertNotNull(collectionLikeType21);
        org.junit.Assert.assertNull(wildcardClass22);
        org.junit.Assert.assertNotNull(toStringSerializer23);
        org.junit.Assert.assertNotNull(jsonNode26);
        org.junit.Assert.assertNotNull(strListClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(javaType30);
        org.junit.Assert.assertNotNull(valueNode31);
        org.junit.Assert.assertNotNull(invalidFormatException32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 2.0d + "'", double33 == 2.0d);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.fasterxml.jackson.databind.ser.std.SqlDateSerializer sqlDateSerializer1 = new com.fasterxml.jackson.databind.ser.std.SqlDateSerializer((java.lang.Boolean) true);
        java.text.DateFormat dateFormat3 = null;
        com.fasterxml.jackson.databind.ser.std.SqlDateSerializer sqlDateSerializer4 = sqlDateSerializer1.withFormat((java.lang.Boolean) true, dateFormat3);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = sqlDateSerializer1.getDelegatee();
        org.junit.Assert.assertNotNull(sqlDateSerializer4);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer2 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer3 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = null;
        com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer arrayBlockingQueueDeserializer6 = new com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer(javaType1, objJsonDeserializer2, typeDeserializer3, valueInstantiator4, objJsonDeserializer5);
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = null;
        com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer arrayBlockingQueueDeserializer13 = new com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer(javaType8, objJsonDeserializer9, typeDeserializer10, valueInstantiator11, objJsonDeserializer12);
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer16 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator17 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer18 = null;
        com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer arrayBlockingQueueDeserializer19 = new com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer(javaType14, objJsonDeserializer15, typeDeserializer16, valueInstantiator17, objJsonDeserializer18);
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer20 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(untypedObjectDeserializer0, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) arrayBlockingQueueDeserializer6, objCollectionJsonDeserializer7, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) arrayBlockingQueueDeserializer13, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) arrayBlockingQueueDeserializer19);
        java.lang.Class<?> wildcardClass21 = arrayBlockingQueueDeserializer6.handledType();
        java.util.Collection<java.lang.Object> objCollection22 = arrayBlockingQueueDeserializer6.getEmptyValue();
        org.junit.Assert.assertNull(wildcardClass21);
        org.junit.Assert.assertNull(objCollection22);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer2 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName5 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations6 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        com.fasterxml.jackson.databind.BeanProperty.Std std9 = new com.fasterxml.jackson.databind.BeanProperty.Std("", javaType4, propertyName5, annotations6, annotatedMember7, true);
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer10 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.CollectionSerializer collectionSerializer11 = new com.fasterxml.jackson.databind.ser.std.CollectionSerializer(javaType0, true, typeSerializer2, (com.fasterxml.jackson.databind.BeanProperty) std9, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer10);
        com.fasterxml.jackson.databind.JavaType javaType12 = collectionSerializer11.getContentType();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "com.fasterxml.jackson.databind.deser.UnresolvedForwardReference: hi!." };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator18 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider19 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            collectionSerializer11.serializeContentsUsing((java.util.Collection<java.lang.String>) strList16, jsonGenerator18, serializerProvider19, objJsonSerializer20);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.JsonMappingException; message: (was java.lang.NullPointerException) (through reference chain: java.util.ArrayList[0])");
        } catch (com.fasterxml.jackson.databind.JsonMappingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringSerializer10);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer indexedListSerializer0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer3 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName6 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations7 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember8 = null;
        com.fasterxml.jackson.databind.BeanProperty.Std std10 = new com.fasterxml.jackson.databind.BeanProperty.Std("", javaType5, propertyName6, annotations7, annotatedMember8, true);
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer11 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.CollectionSerializer collectionSerializer12 = new com.fasterxml.jackson.databind.ser.std.CollectionSerializer(javaType1, true, typeSerializer3, (com.fasterxml.jackson.databind.BeanProperty) std10, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer11);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer13 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer15 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider16 = null;
        java.lang.reflect.Type type17 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = toStringSerializer15.getSchema(serializerProvider16, type17);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer19 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer15);
        java.lang.Class<java.util.List<java.lang.String>> strListClass20 = indexedStringListSerializer19.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType21 = typeFactory14.constructRawCollectionLikeType(strListClass20);
        com.fasterxml.jackson.databind.PropertyName propertyName22 = collectionLikeType21.getTypeHandler();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer24 = null;
        com.fasterxml.jackson.databind.JavaType javaType25 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer27 = null;
        com.fasterxml.jackson.databind.JavaType javaType29 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName30 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations31 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember32 = null;
        com.fasterxml.jackson.databind.BeanProperty.Std std34 = new com.fasterxml.jackson.databind.BeanProperty.Std("", javaType29, propertyName30, annotations31, annotatedMember32, true);
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer35 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.CollectionSerializer collectionSerializer36 = new com.fasterxml.jackson.databind.ser.std.CollectionSerializer(javaType25, true, typeSerializer27, (com.fasterxml.jackson.databind.BeanProperty) std34, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer35);
        com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer objectArraySerializer37 = new com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer((com.fasterxml.jackson.databind.JavaType) collectionLikeType21, false, typeSerializer24, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer35);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer38 = null;
        com.fasterxml.jackson.databind.ser.ContainerSerializer<?> wildcardContainerSerializer39 = objectArraySerializer37.withValueTypeSerializer(typeSerializer38);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer indexedListSerializer40 = new com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer(indexedListSerializer0, (com.fasterxml.jackson.databind.BeanProperty) std10, typeSerializer13, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) wildcardContainerSerializer39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringSerializer11);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNotNull(toStringSerializer15);
        org.junit.Assert.assertNotNull(jsonNode18);
        org.junit.Assert.assertNotNull(strListClass20);
        org.junit.Assert.assertNotNull(collectionLikeType21);
        org.junit.Assert.assertNull(propertyName22);
        org.junit.Assert.assertNotNull(toStringSerializer35);
        org.junit.Assert.assertNotNull(wildcardContainerSerializer39);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer1 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        java.lang.reflect.Type type3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = toStringSerializer1.getSchema(serializerProvider2, type3);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer5 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer1);
        java.lang.Class<java.util.List<java.lang.String>> strListClass6 = indexedStringListSerializer5.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = typeFactory0.constructRawCollectionLikeType(strListClass6);
        com.fasterxml.jackson.databind.PropertyName propertyName8 = collectionLikeType7.getTypeHandler();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer13 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName16 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations17 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember18 = null;
        com.fasterxml.jackson.databind.BeanProperty.Std std20 = new com.fasterxml.jackson.databind.BeanProperty.Std("", javaType15, propertyName16, annotations17, annotatedMember18, true);
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer21 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.CollectionSerializer collectionSerializer22 = new com.fasterxml.jackson.databind.ser.std.CollectionSerializer(javaType11, true, typeSerializer13, (com.fasterxml.jackson.databind.BeanProperty) std20, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer21);
        com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer objectArraySerializer23 = new com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, false, typeSerializer10, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer21);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer24 = null;
        com.fasterxml.jackson.databind.ser.ContainerSerializer<?> wildcardContainerSerializer25 = objectArraySerializer23.withValueTypeSerializer(typeSerializer24);
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer26 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object[]> objArrayJsonSerializer27 = objectArraySerializer23.replaceDelegatee((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer26);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(toStringSerializer1);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strListClass6);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertNull(propertyName8);
        org.junit.Assert.assertNotNull(toStringSerializer21);
        org.junit.Assert.assertNotNull(wildcardContainerSerializer25);
        org.junit.Assert.assertNotNull(toStringSerializer26);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.fasterxml.jackson.databind.ser.std.UUIDSerializer uUIDSerializer0 = new com.fasterxml.jackson.databind.ser.std.UUIDSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        java.util.UUID uUID2 = null;
        boolean boolean3 = uUIDSerializer0.isEmpty(serializerProvider1, uUID2);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        java.util.UUID uUID5 = null;
        boolean boolean6 = uUIDSerializer0.isEmpty(serializerProvider4, uUID5);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer indexedListSerializer0 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName1 = com.fasterxml.jackson.databind.PropertyName.USE_DEFAULT;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer3 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        java.lang.reflect.Type type5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = toStringSerializer3.getSchema(serializerProvider4, type5);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer7 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer3);
        java.lang.Class<java.util.List<java.lang.String>> strListClass8 = indexedStringListSerializer7.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType9 = typeFactory2.constructRawCollectionLikeType(strListClass8);
        com.fasterxml.jackson.databind.PropertyName propertyName10 = collectionLikeType9.getTypeHandler();
        com.fasterxml.jackson.databind.PropertyName propertyName13 = com.fasterxml.jackson.databind.PropertyName.construct("hi!", "hi!");
        com.fasterxml.jackson.databind.util.Annotations annotations14 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass15 = null;
        java.lang.reflect.Field field16 = null;
        com.fasterxml.jackson.databind.introspect.AnnotationMap annotationMap17 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedField annotatedField18 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(annotatedClass15, field16, annotationMap17);
        com.fasterxml.jackson.databind.JavaType javaType20 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName21 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations22 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember23 = null;
        com.fasterxml.jackson.databind.BeanProperty.Std std25 = new com.fasterxml.jackson.databind.BeanProperty.Std("", javaType20, propertyName21, annotations22, annotatedMember23, true);
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata26 = std25.getMetadata();
        com.fasterxml.jackson.databind.BeanProperty.Std std27 = new com.fasterxml.jackson.databind.BeanProperty.Std(propertyName1, (com.fasterxml.jackson.databind.JavaType) collectionLikeType9, propertyName13, annotations14, (com.fasterxml.jackson.databind.introspect.AnnotatedMember) annotatedField18, propertyMetadata26);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer28 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer30 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider31 = null;
        java.lang.reflect.Type type32 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode33 = toStringSerializer30.getSchema(serializerProvider31, type32);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer34 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer30);
        java.lang.Class<java.util.List<java.lang.String>> strListClass35 = indexedStringListSerializer34.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType36 = typeFactory29.constructRawCollectionLikeType(strListClass35);
        com.fasterxml.jackson.databind.PropertyName propertyName37 = collectionLikeType36.getTypeHandler();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer39 = null;
        com.fasterxml.jackson.databind.JavaType javaType40 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer42 = null;
        com.fasterxml.jackson.databind.JavaType javaType44 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName45 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations46 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember47 = null;
        com.fasterxml.jackson.databind.BeanProperty.Std std49 = new com.fasterxml.jackson.databind.BeanProperty.Std("", javaType44, propertyName45, annotations46, annotatedMember47, true);
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer50 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.CollectionSerializer collectionSerializer51 = new com.fasterxml.jackson.databind.ser.std.CollectionSerializer(javaType40, true, typeSerializer42, (com.fasterxml.jackson.databind.BeanProperty) std49, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer50);
        com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer objectArraySerializer52 = new com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer((com.fasterxml.jackson.databind.JavaType) collectionLikeType36, false, typeSerializer39, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer50);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer indexedListSerializer53 = new com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer(indexedListSerializer0, (com.fasterxml.jackson.databind.BeanProperty) std27, typeSerializer28, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyName1);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(toStringSerializer3);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(strListClass8);
        org.junit.Assert.assertNotNull(collectionLikeType9);
        org.junit.Assert.assertNull(propertyName10);
        org.junit.Assert.assertNotNull(propertyName13);
        org.junit.Assert.assertNotNull(propertyMetadata26);
        org.junit.Assert.assertNotNull(typeFactory29);
        org.junit.Assert.assertNotNull(toStringSerializer30);
        org.junit.Assert.assertNotNull(jsonNode33);
        org.junit.Assert.assertNotNull(strListClass35);
        org.junit.Assert.assertNotNull(collectionLikeType36);
        org.junit.Assert.assertNull(propertyName37);
        org.junit.Assert.assertNotNull(toStringSerializer50);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer1 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        java.lang.reflect.Type type3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = toStringSerializer1.getSchema(serializerProvider2, type3);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer5 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer1);
        java.lang.Class<java.util.List<java.lang.String>> strListClass6 = indexedStringListSerializer5.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = typeFactory0.constructRawCollectionLikeType(strListClass6);
        com.fasterxml.jackson.databind.PropertyName propertyName8 = collectionLikeType7.getTypeHandler();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer13 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName16 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations17 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember18 = null;
        com.fasterxml.jackson.databind.BeanProperty.Std std20 = new com.fasterxml.jackson.databind.BeanProperty.Std("", javaType15, propertyName16, annotations17, annotatedMember18, true);
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer21 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.CollectionSerializer collectionSerializer22 = new com.fasterxml.jackson.databind.ser.std.CollectionSerializer(javaType11, true, typeSerializer13, (com.fasterxml.jackson.databind.BeanProperty) std20, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer21);
        com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer objectArraySerializer23 = new com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, false, typeSerializer10, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer21);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory24 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer25 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider26 = null;
        java.lang.reflect.Type type27 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode28 = toStringSerializer25.getSchema(serializerProvider26, type27);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer29 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer25);
        java.lang.Class<java.util.List<java.lang.String>> strListClass30 = indexedStringListSerializer29.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType31 = typeFactory24.constructRawCollectionLikeType(strListClass30);
        java.lang.Class<?> wildcardClass32 = collectionLikeType31.getParameterSource();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer33 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider34 = null;
        java.lang.reflect.Type type35 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode36 = toStringSerializer33.getSchema(serializerProvider34, type35);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer37 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer33);
        java.lang.Class<java.util.List<java.lang.String>> strListClass38 = indexedStringListSerializer37.handledType();
        boolean boolean39 = com.fasterxml.jackson.databind.util.ClassUtil.isConcrete(strListClass38);
        com.fasterxml.jackson.databind.JavaType javaType40 = collectionLikeType31.narrowBy(strListClass38);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory41 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer42 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider43 = null;
        java.lang.reflect.Type type44 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode45 = toStringSerializer42.getSchema(serializerProvider43, type44);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer46 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer42);
        java.lang.Class<java.util.List<java.lang.String>> strListClass47 = indexedStringListSerializer46.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType48 = typeFactory41.constructRawCollectionLikeType(strListClass47);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory49 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer50 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider51 = null;
        java.lang.reflect.Type type52 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode53 = toStringSerializer50.getSchema(serializerProvider51, type52);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer54 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer50);
        java.lang.Class<java.util.List<java.lang.String>> strListClass55 = indexedStringListSerializer54.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType56 = typeFactory49.constructRawCollectionLikeType(strListClass55);
        java.lang.Class<?> wildcardClass57 = collectionLikeType56.getParameterSource();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer58 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider59 = null;
        java.lang.reflect.Type type60 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode61 = toStringSerializer58.getSchema(serializerProvider59, type60);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer62 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer58);
        java.lang.Class<java.util.List<java.lang.String>> strListClass63 = indexedStringListSerializer62.handledType();
        boolean boolean64 = com.fasterxml.jackson.databind.util.ClassUtil.isConcrete(strListClass63);
        com.fasterxml.jackson.databind.JavaType javaType65 = collectionLikeType56.narrowBy(strListClass63);
        com.fasterxml.jackson.databind.type.MapType mapType66 = com.fasterxml.jackson.databind.type.MapType.construct(strListClass38, (com.fasterxml.jackson.databind.JavaType) collectionLikeType48, (com.fasterxml.jackson.databind.JavaType) collectionLikeType56);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory67 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer68 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider69 = null;
        java.lang.reflect.Type type70 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode71 = toStringSerializer68.getSchema(serializerProvider69, type70);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer72 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer68);
        java.lang.Class<java.util.List<java.lang.String>> strListClass73 = indexedStringListSerializer72.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType74 = typeFactory67.constructRawCollectionLikeType(strListClass73);
        com.fasterxml.jackson.databind.JavaType javaType75 = mapType66.widenContentsBy(strListClass73);
        com.fasterxml.jackson.databind.type.MapType mapType76 = mapType66.withStaticTyping();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator77 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider78 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer79 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringSerializer21.serializeWithType((java.lang.Object) mapType66, jsonGenerator77, serializerProvider78, typeSerializer79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(toStringSerializer1);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strListClass6);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertNull(propertyName8);
        org.junit.Assert.assertNotNull(toStringSerializer21);
        org.junit.Assert.assertNotNull(typeFactory24);
        org.junit.Assert.assertNotNull(toStringSerializer25);
        org.junit.Assert.assertNotNull(jsonNode28);
        org.junit.Assert.assertNotNull(strListClass30);
        org.junit.Assert.assertNotNull(collectionLikeType31);
        org.junit.Assert.assertNull(wildcardClass32);
        org.junit.Assert.assertNotNull(toStringSerializer33);
        org.junit.Assert.assertNotNull(jsonNode36);
        org.junit.Assert.assertNotNull(strListClass38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(javaType40);
        org.junit.Assert.assertNotNull(typeFactory41);
        org.junit.Assert.assertNotNull(toStringSerializer42);
        org.junit.Assert.assertNotNull(jsonNode45);
        org.junit.Assert.assertNotNull(strListClass47);
        org.junit.Assert.assertNotNull(collectionLikeType48);
        org.junit.Assert.assertNotNull(typeFactory49);
        org.junit.Assert.assertNotNull(toStringSerializer50);
        org.junit.Assert.assertNotNull(jsonNode53);
        org.junit.Assert.assertNotNull(strListClass55);
        org.junit.Assert.assertNotNull(collectionLikeType56);
        org.junit.Assert.assertNull(wildcardClass57);
        org.junit.Assert.assertNotNull(toStringSerializer58);
        org.junit.Assert.assertNotNull(jsonNode61);
        org.junit.Assert.assertNotNull(strListClass63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(javaType65);
        org.junit.Assert.assertNotNull(mapType66);
        org.junit.Assert.assertNotNull(typeFactory67);
        org.junit.Assert.assertNotNull(toStringSerializer68);
        org.junit.Assert.assertNotNull(jsonNode71);
        org.junit.Assert.assertNotNull(strListClass73);
        org.junit.Assert.assertNotNull(collectionLikeType74);
        org.junit.Assert.assertNotNull(javaType75);
        org.junit.Assert.assertNotNull(mapType76);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance;
        com.fasterxml.jackson.databind.node.ValueNode valueNode2 = jsonNodeFactory0.booleanNode(true);
        com.fasterxml.jackson.databind.node.ValueNode valueNode4 = jsonNodeFactory0.numberNode((java.lang.Integer) 2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec5 = null;
        com.fasterxml.jackson.databind.node.TreeTraversingParser treeTraversingParser6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser((com.fasterxml.jackson.databind.JsonNode) valueNode4, objectCodec5);
        boolean boolean8 = treeTraversingParser6.hasTokenId(9);
        com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap annotatedMethodMap10 = new com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap();
        java.util.Spliterator<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> annotatedMethodSpliterator11 = annotatedMethodMap10.spliterator();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory13 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals(false);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer15 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider16 = null;
        java.lang.reflect.Type type17 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = toStringSerializer15.getSchema(serializerProvider16, type17);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer19 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer15);
        java.lang.Class<java.util.List<java.lang.String>> strListClass20 = indexedStringListSerializer19.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType21 = typeFactory14.constructRawCollectionLikeType(strListClass20);
        java.lang.Class<?> wildcardClass22 = collectionLikeType21.getParameterSource();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer23 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider24 = null;
        java.lang.reflect.Type type25 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode26 = toStringSerializer23.getSchema(serializerProvider24, type25);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer27 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer23);
        java.lang.Class<java.util.List<java.lang.String>> strListClass28 = indexedStringListSerializer27.handledType();
        boolean boolean29 = com.fasterxml.jackson.databind.util.ClassUtil.isConcrete(strListClass28);
        com.fasterxml.jackson.databind.JavaType javaType30 = collectionLikeType21.narrowBy(strListClass28);
        com.fasterxml.jackson.databind.node.ValueNode valueNode31 = jsonNodeFactory13.pojoNode((java.lang.Object) strListClass28);
        com.fasterxml.jackson.databind.exc.InvalidFormatException invalidFormatException32 = com.fasterxml.jackson.databind.exc.InvalidFormatException.from((com.fasterxml.jackson.core.JsonParser) treeTraversingParser6, "java.util.List<java.util.List<java.lang.Object>,java.util.List<java.lang.Object>>", (java.lang.Object) annotatedMethodMap10, strListClass28);
        float float33 = treeTraversingParser6.getFloatValue();
        boolean boolean35 = treeTraversingParser6.hasTokenId(15);
        org.junit.Assert.assertNotNull(jsonNodeFactory0);
        org.junit.Assert.assertNotNull(valueNode2);
        org.junit.Assert.assertNotNull(valueNode4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(annotatedMethodSpliterator11);
        org.junit.Assert.assertNotNull(jsonNodeFactory13);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNotNull(toStringSerializer15);
        org.junit.Assert.assertNotNull(jsonNode18);
        org.junit.Assert.assertNotNull(strListClass20);
        org.junit.Assert.assertNotNull(collectionLikeType21);
        org.junit.Assert.assertNull(wildcardClass22);
        org.junit.Assert.assertNotNull(toStringSerializer23);
        org.junit.Assert.assertNotNull(jsonNode26);
        org.junit.Assert.assertNotNull(strListClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(javaType30);
        org.junit.Assert.assertNotNull(valueNode31);
        org.junit.Assert.assertNotNull(invalidFormatException32);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 2.0f + "'", float33 == 2.0f);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory(true);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode2 = jsonNodeFactory1.arrayNode();
        org.junit.Assert.assertNotNull(arrayNode2);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer.instance;
        boolean boolean1 = shortSerializer0.isUnwrappingSerializer();
        boolean boolean3 = shortSerializer0.isEmpty((java.lang.Short) (short) 100);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        // The following exception was thrown during execution in test generation
        try {
            shortSerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper4, javaType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortSerializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(javaType5);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.fasterxml.jackson.databind.ser.std.InetAddressSerializer inetAddressSerializer0 = new com.fasterxml.jackson.databind.ser.std.InetAddressSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        java.net.InetAddress inetAddress2 = null;
        boolean boolean3 = inetAddressSerializer0.isEmpty(serializerProvider1, inetAddress2);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.net.InetAddress> inetAddressJsonSerializer5 = inetAddressSerializer0.unwrappingSerializer(nameTransformer4);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(inetAddressJsonSerializer5);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer stringCollectionSerializer0 = com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer.instance;
        org.junit.Assert.assertNotNull(stringCollectionSerializer0);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer2 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName5 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations6 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        com.fasterxml.jackson.databind.BeanProperty.Std std9 = new com.fasterxml.jackson.databind.BeanProperty.Std("", javaType4, propertyName5, annotations6, annotatedMember7, true);
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer10 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.CollectionSerializer collectionSerializer11 = new com.fasterxml.jackson.databind.ser.std.CollectionSerializer(javaType0, true, typeSerializer2, (com.fasterxml.jackson.databind.BeanProperty) std9, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer10);
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer12 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider13 = null;
        java.lang.reflect.Type type14 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = toStringSerializer12.getSchema(serializerProvider13, type14);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer16 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer12);
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        boolean boolean22 = indexedStringListSerializer16.isEmpty((java.util.List<java.lang.String>) strList20);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator23 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider24 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer25 = null;
        // The following exception was thrown during execution in test generation
        try {
            collectionSerializer11.serializeWithType((java.util.Collection<java.lang.String>) strList20, jsonGenerator23, serializerProvider24, typeSerializer25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringSerializer10);
        org.junit.Assert.assertNotNull(toStringSerializer12);
        org.junit.Assert.assertNotNull(jsonNode15);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer1 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        java.lang.reflect.Type type3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = toStringSerializer1.getSchema(serializerProvider2, type3);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer5 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer1);
        java.lang.Class<java.util.List<java.lang.String>> strListClass6 = indexedStringListSerializer5.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = typeFactory0.constructRawCollectionLikeType(strListClass6);
        com.fasterxml.jackson.databind.PropertyName propertyName8 = collectionLikeType7.getTypeHandler();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer13 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName16 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations17 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember18 = null;
        com.fasterxml.jackson.databind.BeanProperty.Std std20 = new com.fasterxml.jackson.databind.BeanProperty.Std("", javaType15, propertyName16, annotations17, annotatedMember18, true);
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer21 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.CollectionSerializer collectionSerializer22 = new com.fasterxml.jackson.databind.ser.std.CollectionSerializer(javaType11, true, typeSerializer13, (com.fasterxml.jackson.databind.BeanProperty) std20, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer21);
        com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer objectArraySerializer23 = new com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, false, typeSerializer10, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer21);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode24 = toStringSerializer21.createObjectNode();
        com.fasterxml.jackson.databind.JsonNode jsonNode26 = objectNode24.get("com.fasterxml.jackson.databind.deser.UnresolvedForwardReference: hi!.");
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(toStringSerializer1);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strListClass6);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertNull(propertyName8);
        org.junit.Assert.assertNotNull(toStringSerializer21);
        org.junit.Assert.assertNotNull(objectNode24);
        org.junit.Assert.assertNull(jsonNode26);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer1 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        java.lang.reflect.Type type3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = toStringSerializer1.getSchema(serializerProvider2, type3);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer5 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer1);
        java.lang.Class<java.util.List<java.lang.String>> strListClass6 = indexedStringListSerializer5.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = typeFactory0.constructRawCollectionLikeType(strListClass6);
        java.lang.Class<?> wildcardClass8 = collectionLikeType7.getParameterSource();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer9 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        java.lang.reflect.Type type11 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = toStringSerializer9.getSchema(serializerProvider10, type11);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer13 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer9);
        java.lang.Class<java.util.List<java.lang.String>> strListClass14 = indexedStringListSerializer13.handledType();
        boolean boolean15 = com.fasterxml.jackson.databind.util.ClassUtil.isConcrete(strListClass14);
        com.fasterxml.jackson.databind.JavaType javaType16 = collectionLikeType7.narrowBy(strListClass14);
        com.fasterxml.jackson.databind.node.NullNode nullNode17 = collectionLikeType7.getValueHandler();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer19 = null;
        com.fasterxml.jackson.databind.JavaType javaType21 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName22 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations23 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember24 = null;
        com.fasterxml.jackson.databind.BeanProperty.Std std26 = new com.fasterxml.jackson.databind.BeanProperty.Std("", javaType21, propertyName22, annotations23, annotatedMember24, true);
        com.fasterxml.jackson.databind.PropertyName propertyName27 = std26.getWrapperName();
        com.fasterxml.jackson.databind.ser.impl.IteratorSerializer iteratorSerializer28 = new com.fasterxml.jackson.databind.ser.impl.IteratorSerializer((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, false, typeSerializer19, (com.fasterxml.jackson.databind.BeanProperty) std26);
        com.fasterxml.jackson.databind.node.BooleanNode booleanNode29 = com.fasterxml.jackson.databind.node.BooleanNode.getTrue();
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser31 = booleanNode29.traverse(objectCodec30);
        boolean boolean32 = booleanNode29.isPojo();
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor33 = booleanNode29.fields();
        boolean boolean34 = iteratorSerializer28.hasSingleElement(strEntryItor33);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(toStringSerializer1);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strListClass6);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNotNull(toStringSerializer9);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNotNull(strListClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(javaType16);
        org.junit.Assert.assertNull(nullNode17);
        org.junit.Assert.assertNull(propertyName27);
        org.junit.Assert.assertNotNull(booleanNode29);
        org.junit.Assert.assertNotNull(jsonParser31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strEntryItor33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.fasterxml.jackson.databind.node.DoubleNode doubleNode1 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((double) 1);
        org.junit.Assert.assertNotNull(doubleNode1);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer0 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        java.lang.reflect.Type type2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = toStringSerializer0.getSchema(serializerProvider1, type2);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer4 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer0);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        boolean boolean7 = toStringSerializer0.isEmpty(serializerProvider5, (java.lang.Object) (byte) 1);
        org.junit.Assert.assertNotNull(toStringSerializer0);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.fasterxml.jackson.databind.ser.std.FileSerializer fileSerializer0 = new com.fasterxml.jackson.databind.ser.std.FileSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.io.File> fileJsonSerializer2 = fileSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer5 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        java.lang.reflect.Type type7 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = toStringSerializer5.getSchema(serializerProvider6, type7);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer9 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer5);
        java.lang.Class<java.util.List<java.lang.String>> strListClass10 = indexedStringListSerializer9.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType11 = typeFactory4.constructRawCollectionLikeType(strListClass10);
        java.lang.Class<?> wildcardClass12 = collectionLikeType11.getParameterSource();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer13 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider14 = null;
        java.lang.reflect.Type type15 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = toStringSerializer13.getSchema(serializerProvider14, type15);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer17 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer13);
        java.lang.Class<java.util.List<java.lang.String>> strListClass18 = indexedStringListSerializer17.handledType();
        boolean boolean19 = com.fasterxml.jackson.databind.util.ClassUtil.isConcrete(strListClass18);
        com.fasterxml.jackson.databind.JavaType javaType20 = collectionLikeType11.narrowBy(strListClass18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer22 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider23 = null;
        java.lang.reflect.Type type24 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode25 = toStringSerializer22.getSchema(serializerProvider23, type24);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer26 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer22);
        java.lang.Class<java.util.List<java.lang.String>> strListClass27 = indexedStringListSerializer26.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType28 = typeFactory21.constructRawCollectionLikeType(strListClass27);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer30 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider31 = null;
        java.lang.reflect.Type type32 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode33 = toStringSerializer30.getSchema(serializerProvider31, type32);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer34 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer30);
        java.lang.Class<java.util.List<java.lang.String>> strListClass35 = indexedStringListSerializer34.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType36 = typeFactory29.constructRawCollectionLikeType(strListClass35);
        java.lang.Class<?> wildcardClass37 = collectionLikeType36.getParameterSource();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer38 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider39 = null;
        java.lang.reflect.Type type40 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode41 = toStringSerializer38.getSchema(serializerProvider39, type40);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer42 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer38);
        java.lang.Class<java.util.List<java.lang.String>> strListClass43 = indexedStringListSerializer42.handledType();
        boolean boolean44 = com.fasterxml.jackson.databind.util.ClassUtil.isConcrete(strListClass43);
        com.fasterxml.jackson.databind.JavaType javaType45 = collectionLikeType36.narrowBy(strListClass43);
        com.fasterxml.jackson.databind.type.MapType mapType46 = com.fasterxml.jackson.databind.type.MapType.construct(strListClass18, (com.fasterxml.jackson.databind.JavaType) collectionLikeType28, (com.fasterxml.jackson.databind.JavaType) collectionLikeType36);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory47 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer48 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider49 = null;
        java.lang.reflect.Type type50 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode51 = toStringSerializer48.getSchema(serializerProvider49, type50);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer52 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer48);
        java.lang.Class<java.util.List<java.lang.String>> strListClass53 = indexedStringListSerializer52.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType54 = typeFactory47.constructRawCollectionLikeType(strListClass53);
        com.fasterxml.jackson.databind.JavaType javaType55 = mapType46.widenContentsBy(strListClass53);
        com.fasterxml.jackson.databind.JsonNode jsonNode57 = fileSerializer0.getSchema(serializerProvider3, (java.lang.reflect.Type) strListClass53, true);
        org.junit.Assert.assertNotNull(fileJsonSerializer2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(toStringSerializer5);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(strListClass10);
        org.junit.Assert.assertNotNull(collectionLikeType11);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertNotNull(toStringSerializer13);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertNotNull(strListClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(javaType20);
        org.junit.Assert.assertNotNull(typeFactory21);
        org.junit.Assert.assertNotNull(toStringSerializer22);
        org.junit.Assert.assertNotNull(jsonNode25);
        org.junit.Assert.assertNotNull(strListClass27);
        org.junit.Assert.assertNotNull(collectionLikeType28);
        org.junit.Assert.assertNotNull(typeFactory29);
        org.junit.Assert.assertNotNull(toStringSerializer30);
        org.junit.Assert.assertNotNull(jsonNode33);
        org.junit.Assert.assertNotNull(strListClass35);
        org.junit.Assert.assertNotNull(collectionLikeType36);
        org.junit.Assert.assertNull(wildcardClass37);
        org.junit.Assert.assertNotNull(toStringSerializer38);
        org.junit.Assert.assertNotNull(jsonNode41);
        org.junit.Assert.assertNotNull(strListClass43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(javaType45);
        org.junit.Assert.assertNotNull(mapType46);
        org.junit.Assert.assertNotNull(typeFactory47);
        org.junit.Assert.assertNotNull(toStringSerializer48);
        org.junit.Assert.assertNotNull(jsonNode51);
        org.junit.Assert.assertNotNull(strListClass53);
        org.junit.Assert.assertNotNull(collectionLikeType54);
        org.junit.Assert.assertNotNull(javaType55);
        org.junit.Assert.assertNotNull(jsonNode57);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer0 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        java.lang.reflect.Type type2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = toStringSerializer0.getSchema(serializerProvider1, type2);
        com.fasterxml.jackson.databind.ser.std.UUIDSerializer uUIDSerializer4 = new com.fasterxml.jackson.databind.ser.std.UUIDSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        java.util.UUID uUID6 = null;
        boolean boolean7 = uUIDSerializer4.isEmpty(serializerProvider5, uUID6);
        java.util.UUID uUID8 = null;
        boolean boolean9 = uUIDSerializer4.isEmpty(uUID8);
        boolean boolean10 = toStringSerializer0.isEmpty((java.lang.Object) boolean9);
        org.junit.Assert.assertNotNull(toStringSerializer0);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.fasterxml.jackson.databind.ser.std.UUIDSerializer uUIDSerializer0 = new com.fasterxml.jackson.databind.ser.std.UUIDSerializer();
        java.util.UUID uUID1 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator2 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            uUIDSerializer0.serializeWithType(uUID1, jsonGenerator2, serializerProvider3, typeSerializer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer2 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName5 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations6 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        com.fasterxml.jackson.databind.BeanProperty.Std std9 = new com.fasterxml.jackson.databind.BeanProperty.Std("", javaType4, propertyName5, annotations6, annotatedMember7, true);
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer10 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.CollectionSerializer collectionSerializer11 = new com.fasterxml.jackson.databind.ser.std.CollectionSerializer(javaType0, true, typeSerializer2, (com.fasterxml.jackson.databind.BeanProperty) std9, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        com.fasterxml.jackson.databind.ser.std.InetAddressSerializer inetAddressSerializer13 = new com.fasterxml.jackson.databind.ser.std.InetAddressSerializer();
        java.lang.Class<java.net.InetAddress> inetAddressClass14 = inetAddressSerializer13.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = collectionSerializer11.getSchema(serializerProvider12, (java.lang.reflect.Type) inetAddressClass14);
        com.fasterxml.jackson.databind.JavaType javaType16 = collectionSerializer11.getContentType();
        org.junit.Assert.assertNotNull(toStringSerializer10);
        org.junit.Assert.assertNotNull(inetAddressClass14);
        org.junit.Assert.assertNotNull(jsonNode15);
        org.junit.Assert.assertNull(javaType16);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = null;
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider1 = null;
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext2 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper3 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory0, defaultSerializerProvider1, defaultDeserializationContext2);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper3.enableDefaultTyping();
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature5 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_INVALID_SUBTYPE;
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature6 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_INVALID_SUBTYPE;
        com.fasterxml.jackson.databind.DeserializationFeature[] deserializationFeatureArray7 = new com.fasterxml.jackson.databind.DeserializationFeature[] { deserializationFeature6 };
        com.fasterxml.jackson.databind.ObjectMapper objectMapper8 = objectMapper4.enable(deserializationFeature5, deserializationFeatureArray7);
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + deserializationFeature5 + "' != '" + com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_INVALID_SUBTYPE + "'", deserializationFeature5.equals(com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_INVALID_SUBTYPE));
        org.junit.Assert.assertTrue("'" + deserializationFeature6 + "' != '" + com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_INVALID_SUBTYPE + "'", deserializationFeature6.equals(com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_INVALID_SUBTYPE));
        org.junit.Assert.assertNotNull(deserializationFeatureArray7);
        org.junit.Assert.assertNotNull(objectMapper8);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer2 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName5 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations6 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        com.fasterxml.jackson.databind.BeanProperty.Std std9 = new com.fasterxml.jackson.databind.BeanProperty.Std("", javaType4, propertyName5, annotations6, annotatedMember7, true);
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer10 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.CollectionSerializer collectionSerializer11 = new com.fasterxml.jackson.databind.ser.std.CollectionSerializer(javaType0, true, typeSerializer2, (com.fasterxml.jackson.databind.BeanProperty) std9, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        com.fasterxml.jackson.databind.ser.std.InetAddressSerializer inetAddressSerializer13 = new com.fasterxml.jackson.databind.ser.std.InetAddressSerializer();
        java.lang.Class<java.net.InetAddress> inetAddressClass14 = inetAddressSerializer13.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = collectionSerializer11.getSchema(serializerProvider12, (java.lang.reflect.Type) inetAddressClass14);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer19 = null;
        com.fasterxml.jackson.databind.JavaType javaType21 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName22 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations23 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember24 = null;
        com.fasterxml.jackson.databind.BeanProperty.Std std26 = new com.fasterxml.jackson.databind.BeanProperty.Std("", javaType21, propertyName22, annotations23, annotatedMember24, true);
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer27 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.CollectionSerializer collectionSerializer28 = new com.fasterxml.jackson.databind.ser.std.CollectionSerializer(javaType17, true, typeSerializer19, (com.fasterxml.jackson.databind.BeanProperty) std26, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer27);
        com.fasterxml.jackson.databind.PropertyName propertyName29 = std26.getWrapperName();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer30 = collectionSerializer11.createContextual(serializerProvider16, (com.fasterxml.jackson.databind.BeanProperty) std26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringSerializer10);
        org.junit.Assert.assertNotNull(inetAddressClass14);
        org.junit.Assert.assertNotNull(jsonNode15);
        org.junit.Assert.assertNotNull(toStringSerializer27);
        org.junit.Assert.assertNull(propertyName29);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance;
        com.fasterxml.jackson.databind.node.ValueNode valueNode2 = jsonNodeFactory0.booleanNode(true);
        com.fasterxml.jackson.databind.node.NumericNode numericNode4 = jsonNodeFactory0.numberNode((int) (byte) 100);
        com.fasterxml.jackson.databind.node.ValueNode valueNode6 = jsonNodeFactory0.numberNode((java.lang.Long) 0L);
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = valueNode6.path("com.fasterxml.jackson.databind.deser.UnresolvedForwardReference: hi!.");
        org.junit.Assert.assertNotNull(jsonNodeFactory0);
        org.junit.Assert.assertNotNull(valueNode2);
        org.junit.Assert.assertNotNull(numericNode4);
        org.junit.Assert.assertNotNull(valueNode6);
        org.junit.Assert.assertNotNull(jsonNode8);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = null;
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider1 = null;
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext2 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper3 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory0, defaultSerializerProvider1, defaultDeserializationContext2);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper3.enableDefaultTyping();
        int int5 = objectMapper3.mixInCount();
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer0 = com.fasterxml.jackson.databind.ser.std.CalendarSerializer.instance;
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer3 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        java.lang.reflect.Type type5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = toStringSerializer3.getSchema(serializerProvider4, type5);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer7 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer3);
        java.lang.Class<java.util.List<java.lang.String>> strListClass8 = indexedStringListSerializer7.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType9 = typeFactory2.constructRawCollectionLikeType(strListClass8);
        java.lang.Class<?> wildcardClass10 = collectionLikeType9.getParameterSource();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer11 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        java.lang.reflect.Type type13 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = toStringSerializer11.getSchema(serializerProvider12, type13);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer15 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer11);
        java.lang.Class<java.util.List<java.lang.String>> strListClass16 = indexedStringListSerializer15.handledType();
        boolean boolean17 = com.fasterxml.jackson.databind.util.ClassUtil.isConcrete(strListClass16);
        com.fasterxml.jackson.databind.JavaType javaType18 = collectionLikeType9.narrowBy(strListClass16);
        // The following exception was thrown during execution in test generation
        try {
            calendarSerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, (com.fasterxml.jackson.databind.JavaType) collectionLikeType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendarSerializer0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(toStringSerializer3);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(strListClass8);
        org.junit.Assert.assertNotNull(collectionLikeType9);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNotNull(toStringSerializer11);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNotNull(strListClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(javaType18);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.fasterxml.jackson.databind.ser.std.DateSerializer dateSerializer0 = new com.fasterxml.jackson.databind.ser.std.DateSerializer();
        java.util.Date date1 = null;
        boolean boolean2 = dateSerializer0.isEmpty(date1);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper3 = null;
        com.fasterxml.jackson.databind.deser.Deserializers.Base base4 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer6 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        java.lang.reflect.Type type8 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = toStringSerializer6.getSchema(serializerProvider7, type8);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer10 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer6);
        java.lang.Class<java.util.List<java.lang.String>> strListClass11 = indexedStringListSerializer10.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType12 = typeFactory5.constructRawCollectionLikeType(strListClass11);
        java.lang.Class<?> wildcardClass13 = collectionLikeType12.getParameterSource();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer14 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider15 = null;
        java.lang.reflect.Type type16 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = toStringSerializer14.getSchema(serializerProvider15, type16);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer18 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer14);
        java.lang.Class<java.util.List<java.lang.String>> strListClass19 = indexedStringListSerializer18.handledType();
        boolean boolean20 = com.fasterxml.jackson.databind.util.ClassUtil.isConcrete(strListClass19);
        com.fasterxml.jackson.databind.JavaType javaType21 = collectionLikeType12.narrowBy(strListClass19);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer23 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider24 = null;
        java.lang.reflect.Type type25 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode26 = toStringSerializer23.getSchema(serializerProvider24, type25);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer27 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer23);
        java.lang.Class<java.util.List<java.lang.String>> strListClass28 = indexedStringListSerializer27.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType29 = typeFactory22.constructRawCollectionLikeType(strListClass28);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer31 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider32 = null;
        java.lang.reflect.Type type33 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode34 = toStringSerializer31.getSchema(serializerProvider32, type33);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer35 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer31);
        java.lang.Class<java.util.List<java.lang.String>> strListClass36 = indexedStringListSerializer35.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType37 = typeFactory30.constructRawCollectionLikeType(strListClass36);
        java.lang.Class<?> wildcardClass38 = collectionLikeType37.getParameterSource();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer39 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider40 = null;
        java.lang.reflect.Type type41 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode42 = toStringSerializer39.getSchema(serializerProvider40, type41);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer43 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer39);
        java.lang.Class<java.util.List<java.lang.String>> strListClass44 = indexedStringListSerializer43.handledType();
        boolean boolean45 = com.fasterxml.jackson.databind.util.ClassUtil.isConcrete(strListClass44);
        com.fasterxml.jackson.databind.JavaType javaType46 = collectionLikeType37.narrowBy(strListClass44);
        com.fasterxml.jackson.databind.type.MapType mapType47 = com.fasterxml.jackson.databind.type.MapType.construct(strListClass19, (com.fasterxml.jackson.databind.JavaType) collectionLikeType29, (com.fasterxml.jackson.databind.JavaType) collectionLikeType37);
        com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion inclusion48 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.NON_DEFAULT;
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType49 = mapType47.withKeyTypeHandler((java.lang.Object) inclusion48);
        com.fasterxml.jackson.databind.ser.std.UUIDSerializer uUIDSerializer50 = new com.fasterxml.jackson.databind.ser.std.UUIDSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper51 = null;
        com.fasterxml.jackson.databind.JavaType javaType52 = null;
        uUIDSerializer50.acceptJsonFormatVisitor(jsonFormatVisitorWrapper51, javaType52);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType54 = mapType47.withContentTypeHandler((java.lang.Object) javaType52);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig55 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription56 = null;
        com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer57 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer58 = null;
        com.fasterxml.jackson.databind.JavaType javaType59 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer60 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer61 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator62 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer63 = null;
        com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer arrayBlockingQueueDeserializer64 = new com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer(javaType59, objJsonDeserializer60, typeDeserializer61, valueInstantiator62, objJsonDeserializer63);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer65 = arrayBlockingQueueDeserializer64.getContentDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer66 = base4.findMapLikeDeserializer(mapLikeType54, deserializationConfig55, beanDescription56, keyDeserializer57, typeDeserializer58, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) arrayBlockingQueueDeserializer64);
        // The following exception was thrown during execution in test generation
        try {
            dateSerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper3, (com.fasterxml.jackson.databind.JavaType) mapLikeType54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(toStringSerializer6);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertNotNull(strListClass11);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertNotNull(toStringSerializer14);
        org.junit.Assert.assertNotNull(jsonNode17);
        org.junit.Assert.assertNotNull(strListClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(javaType21);
        org.junit.Assert.assertNotNull(typeFactory22);
        org.junit.Assert.assertNotNull(toStringSerializer23);
        org.junit.Assert.assertNotNull(jsonNode26);
        org.junit.Assert.assertNotNull(strListClass28);
        org.junit.Assert.assertNotNull(collectionLikeType29);
        org.junit.Assert.assertNotNull(typeFactory30);
        org.junit.Assert.assertNotNull(toStringSerializer31);
        org.junit.Assert.assertNotNull(jsonNode34);
        org.junit.Assert.assertNotNull(strListClass36);
        org.junit.Assert.assertNotNull(collectionLikeType37);
        org.junit.Assert.assertNull(wildcardClass38);
        org.junit.Assert.assertNotNull(toStringSerializer39);
        org.junit.Assert.assertNotNull(jsonNode42);
        org.junit.Assert.assertNotNull(strListClass44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(javaType46);
        org.junit.Assert.assertNotNull(mapType47);
        org.junit.Assert.assertTrue("'" + inclusion48 + "' != '" + com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.NON_DEFAULT + "'", inclusion48.equals(com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.NON_DEFAULT));
        org.junit.Assert.assertNotNull(mapLikeType49);
        org.junit.Assert.assertNotNull(mapLikeType54);
        org.junit.Assert.assertNull(objJsonDeserializer65);
        org.junit.Assert.assertNull(wildcardJsonDeserializer66);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.fasterxml.jackson.databind.deser.Deserializers.Base base0 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
        com.fasterxml.jackson.databind.type.ArrayType arrayType1 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig2 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription3 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = null;
        com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer arrayBlockingQueueDeserializer10 = new com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer(javaType5, objJsonDeserializer6, typeDeserializer7, valueInstantiator8, objJsonDeserializer9);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = arrayBlockingQueueDeserializer10.getContentDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = base0.findArrayDeserializer(arrayType1, deserializationConfig2, beanDescription3, typeDeserializer4, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) arrayBlockingQueueDeserializer10);
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer15 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName18 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations19 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember20 = null;
        com.fasterxml.jackson.databind.BeanProperty.Std std22 = new com.fasterxml.jackson.databind.BeanProperty.Std("", javaType17, propertyName18, annotations19, annotatedMember20, true);
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer23 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.CollectionSerializer collectionSerializer24 = new com.fasterxml.jackson.databind.ser.std.CollectionSerializer(javaType13, true, typeSerializer15, (com.fasterxml.jackson.databind.BeanProperty) std22, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer23);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider25 = null;
        com.fasterxml.jackson.databind.JavaType javaType27 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName28 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations29 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember30 = null;
        com.fasterxml.jackson.databind.BeanProperty.Std std32 = new com.fasterxml.jackson.databind.BeanProperty.Std("", javaType27, propertyName28, annotations29, annotatedMember30, true);
        com.fasterxml.jackson.databind.PropertyName propertyName33 = std32.getWrapperName();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory34 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer35 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider36 = null;
        java.lang.reflect.Type type37 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode38 = toStringSerializer35.getSchema(serializerProvider36, type37);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer39 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer35);
        java.lang.Class<java.util.List<java.lang.String>> strListClass40 = indexedStringListSerializer39.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType41 = typeFactory34.constructRawCollectionLikeType(strListClass40);
        com.fasterxml.jackson.databind.BeanProperty.Std std42 = std32.withType((com.fasterxml.jackson.databind.JavaType) collectionLikeType41);
        com.fasterxml.jackson.databind.JsonNode jsonNode44 = toStringSerializer23.getSchema(serializerProvider25, (java.lang.reflect.Type) collectionLikeType41, true);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig45 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription46 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer47 = null;
        com.fasterxml.jackson.databind.JavaType javaType48 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer49 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer50 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator51 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer52 = null;
        com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer arrayBlockingQueueDeserializer53 = new com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer(javaType48, objJsonDeserializer49, typeDeserializer50, valueInstantiator51, objJsonDeserializer52);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer54 = arrayBlockingQueueDeserializer53.getContentDeserializer();
        java.util.Collection<java.lang.Object> objCollection55 = arrayBlockingQueueDeserializer53.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer56 = base0.findCollectionLikeDeserializer(collectionLikeType41, deserializationConfig45, beanDescription46, typeDeserializer47, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) arrayBlockingQueueDeserializer53);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty58 = arrayBlockingQueueDeserializer53.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: container deserializer of type com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer returned null for 'getContentDeserializer()'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objJsonDeserializer11);
        org.junit.Assert.assertNull(wildcardJsonDeserializer12);
        org.junit.Assert.assertNotNull(toStringSerializer23);
        org.junit.Assert.assertNull(propertyName33);
        org.junit.Assert.assertNotNull(typeFactory34);
        org.junit.Assert.assertNotNull(toStringSerializer35);
        org.junit.Assert.assertNotNull(jsonNode38);
        org.junit.Assert.assertNotNull(strListClass40);
        org.junit.Assert.assertNotNull(collectionLikeType41);
        org.junit.Assert.assertNotNull(std42);
        org.junit.Assert.assertNotNull(jsonNode44);
        org.junit.Assert.assertNull(objJsonDeserializer54);
        org.junit.Assert.assertNull(objCollection55);
        org.junit.Assert.assertNull(wildcardJsonDeserializer56);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla vanilla0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer2 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName5 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations6 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        com.fasterxml.jackson.databind.BeanProperty.Std std9 = new com.fasterxml.jackson.databind.BeanProperty.Std("", javaType4, propertyName5, annotations6, annotatedMember7, true);
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer10 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.CollectionSerializer collectionSerializer11 = new com.fasterxml.jackson.databind.ser.std.CollectionSerializer(javaType0, true, typeSerializer2, (com.fasterxml.jackson.databind.BeanProperty) std9, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer10);
        com.fasterxml.jackson.databind.JavaType javaType12 = collectionSerializer11.getContentType();
        com.fasterxml.jackson.databind.JavaType javaType13 = collectionSerializer11.getContentType();
        org.junit.Assert.assertNotNull(toStringSerializer10);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNull(javaType13);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = null;
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider1 = null;
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext2 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper3 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory0, defaultSerializerProvider1, defaultDeserializationContext2);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer5 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        java.lang.reflect.Type type7 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = toStringSerializer5.getSchema(serializerProvider6, type7);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer9 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer5);
        java.lang.Class<java.util.List<java.lang.String>> strListClass10 = indexedStringListSerializer9.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType11 = typeFactory4.constructRawCollectionLikeType(strListClass10);
        com.fasterxml.jackson.databind.PropertyName propertyName12 = collectionLikeType11.getTypeHandler();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer17 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName20 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations21 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember22 = null;
        com.fasterxml.jackson.databind.BeanProperty.Std std24 = new com.fasterxml.jackson.databind.BeanProperty.Std("", javaType19, propertyName20, annotations21, annotatedMember22, true);
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer25 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.CollectionSerializer collectionSerializer26 = new com.fasterxml.jackson.databind.ser.std.CollectionSerializer(javaType15, true, typeSerializer17, (com.fasterxml.jackson.databind.BeanProperty) std24, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer25);
        com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer objectArraySerializer27 = new com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer((com.fasterxml.jackson.databind.JavaType) collectionLikeType11, false, typeSerializer14, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer25);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer28 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object[]> objArrayJsonSerializer29 = objectArraySerializer27.unwrappingSerializer(nameTransformer28);
        com.fasterxml.jackson.databind.JavaType javaType31 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName32 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations33 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember34 = null;
        com.fasterxml.jackson.databind.BeanProperty.Std std36 = new com.fasterxml.jackson.databind.BeanProperty.Std("", javaType31, propertyName32, annotations33, annotatedMember34, true);
        com.fasterxml.jackson.databind.PropertyName propertyName37 = std36.getWrapperName();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory38 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer39 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider40 = null;
        java.lang.reflect.Type type41 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode42 = toStringSerializer39.getSchema(serializerProvider40, type41);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer43 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer39);
        java.lang.Class<java.util.List<java.lang.String>> strListClass44 = indexedStringListSerializer43.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType45 = typeFactory38.constructRawCollectionLikeType(strListClass44);
        com.fasterxml.jackson.databind.BeanProperty.Std std46 = std36.withType((com.fasterxml.jackson.databind.JavaType) collectionLikeType45);
        com.fasterxml.jackson.databind.PropertyName propertyName47 = std46.getWrapperName();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer48 = null;
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer49 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        boolean boolean50 = toStringSerializer49.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer objectArraySerializer51 = new com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer(objectArraySerializer27, (com.fasterxml.jackson.databind.BeanProperty) std46, typeSerializer48, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer49);
        byte[] byteArray52 = objectMapper3.writeValueAsBytes((java.lang.Object) objectArraySerializer51);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(toStringSerializer5);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(strListClass10);
        org.junit.Assert.assertNotNull(collectionLikeType11);
        org.junit.Assert.assertNull(propertyName12);
        org.junit.Assert.assertNotNull(toStringSerializer25);
        org.junit.Assert.assertNotNull(objArrayJsonSerializer29);
        org.junit.Assert.assertNull(propertyName37);
        org.junit.Assert.assertNotNull(typeFactory38);
        org.junit.Assert.assertNotNull(toStringSerializer39);
        org.junit.Assert.assertNotNull(jsonNode42);
        org.junit.Assert.assertNotNull(strListClass44);
        org.junit.Assert.assertNotNull(collectionLikeType45);
        org.junit.Assert.assertNotNull(std46);
        org.junit.Assert.assertNull(propertyName47);
        org.junit.Assert.assertNotNull(toStringSerializer49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(byteArray52);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[123, 34, 99, 111, 110, 116, 101, 110, 116, 84, 121, 112, 101, 34, 58, 34, 106, 97, 118, 97, 46, 117, 116, 105, 108, 46, 76, 105, 115, 116, 60, 106, 97, 118, 97, 46, 108, 97, 110, 103, 46, 79, 98, 106, 101, 99, 116, 62, 34, 44, 34, 99, 111, 110, 116, 101, 110, 116, 83, 101, 114, 105, 97, 108, 105, 122, 101, 114, 34, 58, 123, 34, 100, 101, 108, 101, 103, 97, 116, 101, 101, 34, 58, 110, 117, 108, 108, 44, 34, 117, 110, 119, 114, 97, 112, 112, 105, 110, 103, 83, 101, 114, 105, 97, 108, 105, 122, 101, 114, 34, 58, 102, 97, 108, 115, 101, 125, 44, 34, 100, 101, 108, 101, 103, 97, 116, 101, 101, 34, 58, 110, 117, 108, 108, 44, 34, 117, 110, 119, 114, 97, 112, 112, 105, 110, 103, 83, 101, 114, 105, 97, 108, 105, 122, 101, 114, 34, 58, 102, 97, 108, 115, 101, 125]");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer1 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        java.lang.reflect.Type type3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = toStringSerializer1.getSchema(serializerProvider2, type3);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer5 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer1);
        java.lang.Class<java.util.List<java.lang.String>> strListClass6 = indexedStringListSerializer5.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = typeFactory0.constructRawCollectionLikeType(strListClass6);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory0.withModifier(typeModifier8);
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer10 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        java.lang.reflect.Type type12 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = toStringSerializer10.getSchema(serializerProvider11, type12);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer14 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer10);
        java.lang.Class<java.util.List<java.lang.String>> strListClass15 = indexedStringListSerializer14.handledType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer17 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider18 = null;
        java.lang.reflect.Type type19 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode20 = toStringSerializer17.getSchema(serializerProvider18, type19);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer21 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer17);
        java.lang.Class<java.util.List<java.lang.String>> strListClass22 = indexedStringListSerializer21.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType23 = typeFactory16.constructRawCollectionLikeType(strListClass22);
        boolean boolean24 = com.fasterxml.jackson.databind.util.ClassUtil.isNonStaticInnerClass(strListClass22);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings25 = null;
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray26 = typeFactory0.findTypeParameters(strListClass15, strListClass22, typeBindings25);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector27 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory28 = null;
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider29 = null;
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext30 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper31 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory28, defaultSerializerProvider29, defaultDeserializationContext30);
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature32 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper33 = objectMapper31.enable(deserializationFeature32);
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig34 = objectMapper31.getSerializationConfig();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass35 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(strListClass15, annotationIntrospector27, (com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver) serializationConfig34);
        boolean boolean37 = serializationConfig34.hasMapperFeatures(0);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(toStringSerializer1);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strListClass6);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(toStringSerializer10);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertNotNull(strListClass15);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(toStringSerializer17);
        org.junit.Assert.assertNotNull(jsonNode20);
        org.junit.Assert.assertNotNull(strListClass22);
        org.junit.Assert.assertNotNull(collectionLikeType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(javaTypeArray26);
        org.junit.Assert.assertTrue("'" + deserializationFeature32 + "' != '" + com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES + "'", deserializationFeature32.equals(com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        org.junit.Assert.assertNotNull(objectMapper33);
        org.junit.Assert.assertNotNull(serializationConfig34);
        org.junit.Assert.assertNotNull(annotatedClass35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.lang.reflect.Member member0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = com.fasterxml.jackson.databind.util.ClassUtil.isConcrete(member0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer1 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        java.lang.reflect.Type type3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = toStringSerializer1.getSchema(serializerProvider2, type3);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer5 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer1);
        java.lang.Class<java.util.List<java.lang.String>> strListClass6 = indexedStringListSerializer5.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = typeFactory0.constructRawCollectionLikeType(strListClass6);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory0.withModifier(typeModifier8);
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer10 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        java.lang.reflect.Type type12 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = toStringSerializer10.getSchema(serializerProvider11, type12);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer14 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer10);
        java.lang.Class<java.util.List<java.lang.String>> strListClass15 = indexedStringListSerializer14.handledType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer17 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider18 = null;
        java.lang.reflect.Type type19 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode20 = toStringSerializer17.getSchema(serializerProvider18, type19);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer21 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer17);
        java.lang.Class<java.util.List<java.lang.String>> strListClass22 = indexedStringListSerializer21.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType23 = typeFactory16.constructRawCollectionLikeType(strListClass22);
        boolean boolean24 = com.fasterxml.jackson.databind.util.ClassUtil.isNonStaticInnerClass(strListClass22);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings25 = null;
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray26 = typeFactory0.findTypeParameters(strListClass15, strListClass22, typeBindings25);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector27 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory28 = null;
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider29 = null;
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext30 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper31 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory28, defaultSerializerProvider29, defaultDeserializationContext30);
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature32 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper33 = objectMapper31.enable(deserializationFeature32);
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig34 = objectMapper31.getSerializationConfig();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass35 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(strListClass15, annotationIntrospector27, (com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver) serializationConfig34);
        com.fasterxml.jackson.annotation.JsonInclude.Include include36 = serializationConfig34.getSerializationInclusion();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(toStringSerializer1);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strListClass6);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(toStringSerializer10);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertNotNull(strListClass15);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(toStringSerializer17);
        org.junit.Assert.assertNotNull(jsonNode20);
        org.junit.Assert.assertNotNull(strListClass22);
        org.junit.Assert.assertNotNull(collectionLikeType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(javaTypeArray26);
        org.junit.Assert.assertTrue("'" + deserializationFeature32 + "' != '" + com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES + "'", deserializationFeature32.equals(com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        org.junit.Assert.assertNotNull(objectMapper33);
        org.junit.Assert.assertNotNull(serializationConfig34);
        org.junit.Assert.assertNotNull(annotatedClass35);
        org.junit.Assert.assertTrue("'" + include36 + "' != '" + com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS + "'", include36.equals(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass0 = null;
        java.lang.reflect.Field field1 = null;
        com.fasterxml.jackson.databind.introspect.AnnotationMap annotationMap2 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedField annotatedField3 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(annotatedClass0, field1, annotationMap2);
        com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition simpleBeanPropertyDefinition5 = new com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition((com.fasterxml.jackson.databind.introspect.AnnotatedMember) annotatedField3, "");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.fasterxml.jackson.databind.deser.Deserializers.Base base0 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
        com.fasterxml.jackson.databind.type.ArrayType arrayType1 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig2 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription3 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = null;
        com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer arrayBlockingQueueDeserializer10 = new com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer(javaType5, objJsonDeserializer6, typeDeserializer7, valueInstantiator8, objJsonDeserializer9);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = arrayBlockingQueueDeserializer10.getContentDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = base0.findArrayDeserializer(arrayType1, deserializationConfig2, beanDescription3, typeDeserializer4, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) arrayBlockingQueueDeserializer10);
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer15 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName18 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations19 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember20 = null;
        com.fasterxml.jackson.databind.BeanProperty.Std std22 = new com.fasterxml.jackson.databind.BeanProperty.Std("", javaType17, propertyName18, annotations19, annotatedMember20, true);
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer23 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.CollectionSerializer collectionSerializer24 = new com.fasterxml.jackson.databind.ser.std.CollectionSerializer(javaType13, true, typeSerializer15, (com.fasterxml.jackson.databind.BeanProperty) std22, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer23);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider25 = null;
        com.fasterxml.jackson.databind.JavaType javaType27 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName28 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations29 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember30 = null;
        com.fasterxml.jackson.databind.BeanProperty.Std std32 = new com.fasterxml.jackson.databind.BeanProperty.Std("", javaType27, propertyName28, annotations29, annotatedMember30, true);
        com.fasterxml.jackson.databind.PropertyName propertyName33 = std32.getWrapperName();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory34 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer35 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider36 = null;
        java.lang.reflect.Type type37 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode38 = toStringSerializer35.getSchema(serializerProvider36, type37);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer39 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer35);
        java.lang.Class<java.util.List<java.lang.String>> strListClass40 = indexedStringListSerializer39.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType41 = typeFactory34.constructRawCollectionLikeType(strListClass40);
        com.fasterxml.jackson.databind.BeanProperty.Std std42 = std32.withType((com.fasterxml.jackson.databind.JavaType) collectionLikeType41);
        com.fasterxml.jackson.databind.JsonNode jsonNode44 = toStringSerializer23.getSchema(serializerProvider25, (java.lang.reflect.Type) collectionLikeType41, true);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig45 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription46 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer47 = null;
        com.fasterxml.jackson.databind.JavaType javaType48 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer49 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer50 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator51 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer52 = null;
        com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer arrayBlockingQueueDeserializer53 = new com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer(javaType48, objJsonDeserializer49, typeDeserializer50, valueInstantiator51, objJsonDeserializer52);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer54 = arrayBlockingQueueDeserializer53.getContentDeserializer();
        java.util.Collection<java.lang.Object> objCollection55 = arrayBlockingQueueDeserializer53.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer56 = base0.findCollectionLikeDeserializer(collectionLikeType41, deserializationConfig45, beanDescription46, typeDeserializer47, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) arrayBlockingQueueDeserializer53);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory58 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals(false);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory59 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer60 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider61 = null;
        java.lang.reflect.Type type62 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode63 = toStringSerializer60.getSchema(serializerProvider61, type62);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer64 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer60);
        java.lang.Class<java.util.List<java.lang.String>> strListClass65 = indexedStringListSerializer64.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType66 = typeFactory59.constructRawCollectionLikeType(strListClass65);
        java.lang.Class<?> wildcardClass67 = collectionLikeType66.getParameterSource();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer68 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider69 = null;
        java.lang.reflect.Type type70 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode71 = toStringSerializer68.getSchema(serializerProvider69, type70);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer72 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer68);
        java.lang.Class<java.util.List<java.lang.String>> strListClass73 = indexedStringListSerializer72.handledType();
        boolean boolean74 = com.fasterxml.jackson.databind.util.ClassUtil.isConcrete(strListClass73);
        com.fasterxml.jackson.databind.JavaType javaType75 = collectionLikeType66.narrowBy(strListClass73);
        com.fasterxml.jackson.databind.node.ValueNode valueNode76 = jsonNodeFactory58.pojoNode((java.lang.Object) strListClass73);
        com.fasterxml.jackson.databind.type.SimpleType simpleType77 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(strListClass73);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig78 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription79 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer80 = base0.findBeanDeserializer((com.fasterxml.jackson.databind.JavaType) simpleType77, deserializationConfig78, beanDescription79);
        org.junit.Assert.assertNull(objJsonDeserializer11);
        org.junit.Assert.assertNull(wildcardJsonDeserializer12);
        org.junit.Assert.assertNotNull(toStringSerializer23);
        org.junit.Assert.assertNull(propertyName33);
        org.junit.Assert.assertNotNull(typeFactory34);
        org.junit.Assert.assertNotNull(toStringSerializer35);
        org.junit.Assert.assertNotNull(jsonNode38);
        org.junit.Assert.assertNotNull(strListClass40);
        org.junit.Assert.assertNotNull(collectionLikeType41);
        org.junit.Assert.assertNotNull(std42);
        org.junit.Assert.assertNotNull(jsonNode44);
        org.junit.Assert.assertNull(objJsonDeserializer54);
        org.junit.Assert.assertNull(objCollection55);
        org.junit.Assert.assertNull(wildcardJsonDeserializer56);
        org.junit.Assert.assertNotNull(jsonNodeFactory58);
        org.junit.Assert.assertNotNull(typeFactory59);
        org.junit.Assert.assertNotNull(toStringSerializer60);
        org.junit.Assert.assertNotNull(jsonNode63);
        org.junit.Assert.assertNotNull(strListClass65);
        org.junit.Assert.assertNotNull(collectionLikeType66);
        org.junit.Assert.assertNull(wildcardClass67);
        org.junit.Assert.assertNotNull(toStringSerializer68);
        org.junit.Assert.assertNotNull(jsonNode71);
        org.junit.Assert.assertNotNull(strListClass73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(javaType75);
        org.junit.Assert.assertNotNull(valueNode76);
        org.junit.Assert.assertNotNull(simpleType77);
        org.junit.Assert.assertNull(wildcardJsonDeserializer80);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException1 = new com.fasterxml.jackson.databind.JsonMappingException("[simple type, class java.lang.Object]");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer1 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        java.lang.reflect.Type type3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = toStringSerializer1.getSchema(serializerProvider2, type3);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer5 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer1);
        java.lang.Class<java.util.List<java.lang.String>> strListClass6 = indexedStringListSerializer5.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = typeFactory0.constructRawCollectionLikeType(strListClass6);
        com.fasterxml.jackson.databind.PropertyName propertyName8 = collectionLikeType7.getTypeHandler();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer13 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName16 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations17 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember18 = null;
        com.fasterxml.jackson.databind.BeanProperty.Std std20 = new com.fasterxml.jackson.databind.BeanProperty.Std("", javaType15, propertyName16, annotations17, annotatedMember18, true);
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer21 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.CollectionSerializer collectionSerializer22 = new com.fasterxml.jackson.databind.ser.std.CollectionSerializer(javaType11, true, typeSerializer13, (com.fasterxml.jackson.databind.BeanProperty) std20, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer21);
        com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer objectArraySerializer23 = new com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, false, typeSerializer10, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer21);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode26 = toStringSerializer21.createSchemaNode("hi!", false);
        com.fasterxml.jackson.databind.node.ValueNode valueNode28 = objectNode26.numberNode((java.lang.Float) 10.0f);
        com.fasterxml.jackson.core.JsonParser jsonParser29 = valueNode28.traverse();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(toStringSerializer1);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strListClass6);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertNull(propertyName8);
        org.junit.Assert.assertNotNull(toStringSerializer21);
        org.junit.Assert.assertNotNull(objectNode26);
        org.junit.Assert.assertNotNull(valueNode28);
        org.junit.Assert.assertNotNull(jsonParser29);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance;
        com.fasterxml.jackson.databind.node.ValueNode valueNode2 = jsonNodeFactory0.booleanNode(true);
        com.fasterxml.jackson.databind.node.ValueNode valueNode4 = jsonNodeFactory0.numberNode((java.lang.Integer) 2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec5 = null;
        com.fasterxml.jackson.databind.node.TreeTraversingParser treeTraversingParser6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser((com.fasterxml.jackson.databind.JsonNode) valueNode4, objectCodec5);
        boolean boolean8 = treeTraversingParser6.hasTokenId(9);
        com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap annotatedMethodMap10 = new com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap();
        java.util.Spliterator<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> annotatedMethodSpliterator11 = annotatedMethodMap10.spliterator();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory13 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals(false);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer15 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider16 = null;
        java.lang.reflect.Type type17 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = toStringSerializer15.getSchema(serializerProvider16, type17);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer19 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer15);
        java.lang.Class<java.util.List<java.lang.String>> strListClass20 = indexedStringListSerializer19.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType21 = typeFactory14.constructRawCollectionLikeType(strListClass20);
        java.lang.Class<?> wildcardClass22 = collectionLikeType21.getParameterSource();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer23 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider24 = null;
        java.lang.reflect.Type type25 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode26 = toStringSerializer23.getSchema(serializerProvider24, type25);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer27 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer23);
        java.lang.Class<java.util.List<java.lang.String>> strListClass28 = indexedStringListSerializer27.handledType();
        boolean boolean29 = com.fasterxml.jackson.databind.util.ClassUtil.isConcrete(strListClass28);
        com.fasterxml.jackson.databind.JavaType javaType30 = collectionLikeType21.narrowBy(strListClass28);
        com.fasterxml.jackson.databind.node.ValueNode valueNode31 = jsonNodeFactory13.pojoNode((java.lang.Object) strListClass28);
        com.fasterxml.jackson.databind.exc.InvalidFormatException invalidFormatException32 = com.fasterxml.jackson.databind.exc.InvalidFormatException.from((com.fasterxml.jackson.core.JsonParser) treeTraversingParser6, "java.util.List<java.util.List<java.lang.Object>,java.util.List<java.lang.Object>>", (java.lang.Object) annotatedMethodMap10, strListClass28);
        java.lang.Object obj33 = invalidFormatException32.getValue();
        org.junit.Assert.assertNotNull(jsonNodeFactory0);
        org.junit.Assert.assertNotNull(valueNode2);
        org.junit.Assert.assertNotNull(valueNode4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(annotatedMethodSpliterator11);
        org.junit.Assert.assertNotNull(jsonNodeFactory13);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNotNull(toStringSerializer15);
        org.junit.Assert.assertNotNull(jsonNode18);
        org.junit.Assert.assertNotNull(strListClass20);
        org.junit.Assert.assertNotNull(collectionLikeType21);
        org.junit.Assert.assertNull(wildcardClass22);
        org.junit.Assert.assertNotNull(toStringSerializer23);
        org.junit.Assert.assertNotNull(jsonNode26);
        org.junit.Assert.assertNotNull(strListClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(javaType30);
        org.junit.Assert.assertNotNull(valueNode31);
        org.junit.Assert.assertNotNull(invalidFormatException32);
        org.junit.Assert.assertNotNull(obj33);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer1 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        java.lang.reflect.Type type3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = toStringSerializer1.getSchema(serializerProvider2, type3);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer5 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer1);
        java.lang.Class<java.util.List<java.lang.String>> strListClass6 = indexedStringListSerializer5.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = typeFactory0.constructRawCollectionLikeType(strListClass6);
        java.lang.Class<?> wildcardClass8 = collectionLikeType7.getParameterSource();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer9 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        java.lang.reflect.Type type11 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = toStringSerializer9.getSchema(serializerProvider10, type11);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer13 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer9);
        java.lang.Class<java.util.List<java.lang.String>> strListClass14 = indexedStringListSerializer13.handledType();
        boolean boolean15 = com.fasterxml.jackson.databind.util.ClassUtil.isConcrete(strListClass14);
        com.fasterxml.jackson.databind.JavaType javaType16 = collectionLikeType7.narrowBy(strListClass14);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer18 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider19 = null;
        java.lang.reflect.Type type20 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode21 = toStringSerializer18.getSchema(serializerProvider19, type20);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer22 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer18);
        java.lang.Class<java.util.List<java.lang.String>> strListClass23 = indexedStringListSerializer22.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType24 = typeFactory17.constructRawCollectionLikeType(strListClass23);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer26 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider27 = null;
        java.lang.reflect.Type type28 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode29 = toStringSerializer26.getSchema(serializerProvider27, type28);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer30 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer26);
        java.lang.Class<java.util.List<java.lang.String>> strListClass31 = indexedStringListSerializer30.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType32 = typeFactory25.constructRawCollectionLikeType(strListClass31);
        java.lang.Class<?> wildcardClass33 = collectionLikeType32.getParameterSource();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer34 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider35 = null;
        java.lang.reflect.Type type36 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode37 = toStringSerializer34.getSchema(serializerProvider35, type36);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer38 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer34);
        java.lang.Class<java.util.List<java.lang.String>> strListClass39 = indexedStringListSerializer38.handledType();
        boolean boolean40 = com.fasterxml.jackson.databind.util.ClassUtil.isConcrete(strListClass39);
        com.fasterxml.jackson.databind.JavaType javaType41 = collectionLikeType32.narrowBy(strListClass39);
        com.fasterxml.jackson.databind.type.MapType mapType42 = com.fasterxml.jackson.databind.type.MapType.construct(strListClass14, (com.fasterxml.jackson.databind.JavaType) collectionLikeType24, (com.fasterxml.jackson.databind.JavaType) collectionLikeType32);
        com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion inclusion43 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.NON_DEFAULT;
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType44 = mapType42.withKeyTypeHandler((java.lang.Object) inclusion43);
        java.lang.StringBuilder stringBuilder45 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder46 = mapLikeType44.getGenericSignature(stringBuilder45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(toStringSerializer1);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strListClass6);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNotNull(toStringSerializer9);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNotNull(strListClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(javaType16);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNotNull(toStringSerializer18);
        org.junit.Assert.assertNotNull(jsonNode21);
        org.junit.Assert.assertNotNull(strListClass23);
        org.junit.Assert.assertNotNull(collectionLikeType24);
        org.junit.Assert.assertNotNull(typeFactory25);
        org.junit.Assert.assertNotNull(toStringSerializer26);
        org.junit.Assert.assertNotNull(jsonNode29);
        org.junit.Assert.assertNotNull(strListClass31);
        org.junit.Assert.assertNotNull(collectionLikeType32);
        org.junit.Assert.assertNull(wildcardClass33);
        org.junit.Assert.assertNotNull(toStringSerializer34);
        org.junit.Assert.assertNotNull(jsonNode37);
        org.junit.Assert.assertNotNull(strListClass39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(javaType41);
        org.junit.Assert.assertNotNull(mapType42);
        org.junit.Assert.assertTrue("'" + inclusion43 + "' != '" + com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.NON_DEFAULT + "'", inclusion43.equals(com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.NON_DEFAULT));
        org.junit.Assert.assertNotNull(mapLikeType44);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = null;
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider1 = null;
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext2 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper3 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory0, defaultSerializerProvider1, defaultDeserializationContext2);
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature4 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = objectMapper3.enable(deserializationFeature4);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance;
        com.fasterxml.jackson.databind.node.ValueNode valueNode8 = jsonNodeFactory6.booleanNode(true);
        com.fasterxml.jackson.databind.node.ValueNode valueNode10 = jsonNodeFactory6.numberNode((java.lang.Integer) 2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = null;
        com.fasterxml.jackson.databind.node.TreeTraversingParser treeTraversingParser12 = new com.fasterxml.jackson.databind.node.TreeTraversingParser((com.fasterxml.jackson.databind.JsonNode) valueNode10, objectCodec11);
        boolean boolean14 = treeTraversingParser12.hasTokenId(9);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer16 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider17 = null;
        java.lang.reflect.Type type18 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode19 = toStringSerializer16.getSchema(serializerProvider17, type18);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer20 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer16);
        java.lang.Class<java.util.List<java.lang.String>> strListClass21 = indexedStringListSerializer20.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType22 = typeFactory15.constructRawCollectionLikeType(strListClass21);
        java.lang.Class<?> wildcardClass23 = collectionLikeType22.getParameterSource();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer24 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider25 = null;
        java.lang.reflect.Type type26 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode27 = toStringSerializer24.getSchema(serializerProvider25, type26);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer28 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer24);
        java.lang.Class<java.util.List<java.lang.String>> strListClass29 = indexedStringListSerializer28.handledType();
        boolean boolean30 = com.fasterxml.jackson.databind.util.ClassUtil.isConcrete(strListClass29);
        com.fasterxml.jackson.databind.JavaType javaType31 = collectionLikeType22.narrowBy(strListClass29);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer33 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider34 = null;
        java.lang.reflect.Type type35 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode36 = toStringSerializer33.getSchema(serializerProvider34, type35);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer37 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer33);
        java.lang.Class<java.util.List<java.lang.String>> strListClass38 = indexedStringListSerializer37.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType39 = typeFactory32.constructRawCollectionLikeType(strListClass38);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory40 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer41 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider42 = null;
        java.lang.reflect.Type type43 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode44 = toStringSerializer41.getSchema(serializerProvider42, type43);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer45 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer41);
        java.lang.Class<java.util.List<java.lang.String>> strListClass46 = indexedStringListSerializer45.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType47 = typeFactory40.constructRawCollectionLikeType(strListClass46);
        java.lang.Class<?> wildcardClass48 = collectionLikeType47.getParameterSource();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer49 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider50 = null;
        java.lang.reflect.Type type51 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode52 = toStringSerializer49.getSchema(serializerProvider50, type51);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer53 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer49);
        java.lang.Class<java.util.List<java.lang.String>> strListClass54 = indexedStringListSerializer53.handledType();
        boolean boolean55 = com.fasterxml.jackson.databind.util.ClassUtil.isConcrete(strListClass54);
        com.fasterxml.jackson.databind.JavaType javaType56 = collectionLikeType47.narrowBy(strListClass54);
        com.fasterxml.jackson.databind.type.MapType mapType57 = com.fasterxml.jackson.databind.type.MapType.construct(strListClass29, (com.fasterxml.jackson.databind.JavaType) collectionLikeType39, (com.fasterxml.jackson.databind.JavaType) collectionLikeType47);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.MappingIterator<java.util.Spliterator<com.fasterxml.jackson.databind.introspect.AnnotatedMethod>> annotatedMethodSpliteratorItor58 = objectMapper3.readValues((com.fasterxml.jackson.core.JsonParser) treeTraversingParser12, (com.fasterxml.jackson.core.type.ResolvedType) collectionLikeType47);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.fasterxml.jackson.databind.type.CollectionLikeType cannot be cast to com.fasterxml.jackson.databind.type.CollectionType");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + deserializationFeature4 + "' != '" + com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES + "'", deserializationFeature4.equals(com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        org.junit.Assert.assertNotNull(objectMapper5);
        org.junit.Assert.assertNotNull(jsonNodeFactory6);
        org.junit.Assert.assertNotNull(valueNode8);
        org.junit.Assert.assertNotNull(valueNode10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNotNull(toStringSerializer16);
        org.junit.Assert.assertNotNull(jsonNode19);
        org.junit.Assert.assertNotNull(strListClass21);
        org.junit.Assert.assertNotNull(collectionLikeType22);
        org.junit.Assert.assertNull(wildcardClass23);
        org.junit.Assert.assertNotNull(toStringSerializer24);
        org.junit.Assert.assertNotNull(jsonNode27);
        org.junit.Assert.assertNotNull(strListClass29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(javaType31);
        org.junit.Assert.assertNotNull(typeFactory32);
        org.junit.Assert.assertNotNull(toStringSerializer33);
        org.junit.Assert.assertNotNull(jsonNode36);
        org.junit.Assert.assertNotNull(strListClass38);
        org.junit.Assert.assertNotNull(collectionLikeType39);
        org.junit.Assert.assertNotNull(typeFactory40);
        org.junit.Assert.assertNotNull(toStringSerializer41);
        org.junit.Assert.assertNotNull(jsonNode44);
        org.junit.Assert.assertNotNull(strListClass46);
        org.junit.Assert.assertNotNull(collectionLikeType47);
        org.junit.Assert.assertNull(wildcardClass48);
        org.junit.Assert.assertNotNull(toStringSerializer49);
        org.junit.Assert.assertNotNull(jsonNode52);
        org.junit.Assert.assertNotNull(strListClass54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(javaType56);
        org.junit.Assert.assertNotNull(mapType57);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer1 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        java.lang.reflect.Type type3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = toStringSerializer1.getSchema(serializerProvider2, type3);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer5 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer1);
        java.lang.Class<java.util.List<java.lang.String>> strListClass6 = indexedStringListSerializer5.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = typeFactory0.constructRawCollectionLikeType(strListClass6);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory0.withModifier(typeModifier8);
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer10 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        java.lang.reflect.Type type12 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = toStringSerializer10.getSchema(serializerProvider11, type12);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer14 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer10);
        java.lang.Class<java.util.List<java.lang.String>> strListClass15 = indexedStringListSerializer14.handledType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer17 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider18 = null;
        java.lang.reflect.Type type19 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode20 = toStringSerializer17.getSchema(serializerProvider18, type19);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer21 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer17);
        java.lang.Class<java.util.List<java.lang.String>> strListClass22 = indexedStringListSerializer21.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType23 = typeFactory16.constructRawCollectionLikeType(strListClass22);
        boolean boolean24 = com.fasterxml.jackson.databind.util.ClassUtil.isNonStaticInnerClass(strListClass22);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings25 = null;
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray26 = typeFactory0.findTypeParameters(strListClass15, strListClass22, typeBindings25);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector27 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory28 = null;
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider29 = null;
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext30 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper31 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory28, defaultSerializerProvider29, defaultDeserializationContext30);
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature32 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper33 = objectMapper31.enable(deserializationFeature32);
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig34 = objectMapper31.getSerializationConfig();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass35 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(strListClass15, annotationIntrospector27, (com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver) serializationConfig34);
        com.fasterxml.jackson.databind.introspect.AnnotationMap annotationMap36 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass37 = annotatedClass35.withAnnotations(annotationMap36);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(toStringSerializer1);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strListClass6);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(toStringSerializer10);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertNotNull(strListClass15);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(toStringSerializer17);
        org.junit.Assert.assertNotNull(jsonNode20);
        org.junit.Assert.assertNotNull(strListClass22);
        org.junit.Assert.assertNotNull(collectionLikeType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(javaTypeArray26);
        org.junit.Assert.assertTrue("'" + deserializationFeature32 + "' != '" + com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES + "'", deserializationFeature32.equals(com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        org.junit.Assert.assertNotNull(objectMapper33);
        org.junit.Assert.assertNotNull(serializationConfig34);
        org.junit.Assert.assertNotNull(annotatedClass35);
        org.junit.Assert.assertNotNull(annotatedClass37);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer1 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        java.lang.reflect.Type type3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = toStringSerializer1.getSchema(serializerProvider2, type3);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer5 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer1);
        java.lang.Class<java.util.List<java.lang.String>> strListClass6 = indexedStringListSerializer5.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = typeFactory0.constructRawCollectionLikeType(strListClass6);
        java.lang.Class<?> wildcardClass8 = collectionLikeType7.getParameterSource();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer9 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        java.lang.reflect.Type type11 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = toStringSerializer9.getSchema(serializerProvider10, type11);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer13 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer9);
        java.lang.Class<java.util.List<java.lang.String>> strListClass14 = indexedStringListSerializer13.handledType();
        boolean boolean15 = com.fasterxml.jackson.databind.util.ClassUtil.isConcrete(strListClass14);
        com.fasterxml.jackson.databind.JavaType javaType16 = collectionLikeType7.narrowBy(strListClass14);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer18 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider19 = null;
        java.lang.reflect.Type type20 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode21 = toStringSerializer18.getSchema(serializerProvider19, type20);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer22 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer18);
        java.lang.Class<java.util.List<java.lang.String>> strListClass23 = indexedStringListSerializer22.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType24 = typeFactory17.constructRawCollectionLikeType(strListClass23);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer26 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider27 = null;
        java.lang.reflect.Type type28 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode29 = toStringSerializer26.getSchema(serializerProvider27, type28);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer30 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer26);
        java.lang.Class<java.util.List<java.lang.String>> strListClass31 = indexedStringListSerializer30.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType32 = typeFactory25.constructRawCollectionLikeType(strListClass31);
        java.lang.Class<?> wildcardClass33 = collectionLikeType32.getParameterSource();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer34 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider35 = null;
        java.lang.reflect.Type type36 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode37 = toStringSerializer34.getSchema(serializerProvider35, type36);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer38 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer34);
        java.lang.Class<java.util.List<java.lang.String>> strListClass39 = indexedStringListSerializer38.handledType();
        boolean boolean40 = com.fasterxml.jackson.databind.util.ClassUtil.isConcrete(strListClass39);
        com.fasterxml.jackson.databind.JavaType javaType41 = collectionLikeType32.narrowBy(strListClass39);
        com.fasterxml.jackson.databind.type.MapType mapType42 = com.fasterxml.jackson.databind.type.MapType.construct(strListClass14, (com.fasterxml.jackson.databind.JavaType) collectionLikeType24, (com.fasterxml.jackson.databind.JavaType) collectionLikeType32);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory43 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer44 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider45 = null;
        java.lang.reflect.Type type46 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode47 = toStringSerializer44.getSchema(serializerProvider45, type46);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer48 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer44);
        java.lang.Class<java.util.List<java.lang.String>> strListClass49 = indexedStringListSerializer48.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType50 = typeFactory43.constructRawCollectionLikeType(strListClass49);
        com.fasterxml.jackson.databind.JavaType javaType51 = mapType42.widenContentsBy(strListClass49);
        java.lang.Class<?> wildcardClass52 = mapType42.getParameterSource();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(toStringSerializer1);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strListClass6);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNotNull(toStringSerializer9);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNotNull(strListClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(javaType16);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNotNull(toStringSerializer18);
        org.junit.Assert.assertNotNull(jsonNode21);
        org.junit.Assert.assertNotNull(strListClass23);
        org.junit.Assert.assertNotNull(collectionLikeType24);
        org.junit.Assert.assertNotNull(typeFactory25);
        org.junit.Assert.assertNotNull(toStringSerializer26);
        org.junit.Assert.assertNotNull(jsonNode29);
        org.junit.Assert.assertNotNull(strListClass31);
        org.junit.Assert.assertNotNull(collectionLikeType32);
        org.junit.Assert.assertNull(wildcardClass33);
        org.junit.Assert.assertNotNull(toStringSerializer34);
        org.junit.Assert.assertNotNull(jsonNode37);
        org.junit.Assert.assertNotNull(strListClass39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(javaType41);
        org.junit.Assert.assertNotNull(mapType42);
        org.junit.Assert.assertNotNull(typeFactory43);
        org.junit.Assert.assertNotNull(toStringSerializer44);
        org.junit.Assert.assertNotNull(jsonNode47);
        org.junit.Assert.assertNotNull(strListClass49);
        org.junit.Assert.assertNotNull(collectionLikeType50);
        org.junit.Assert.assertNotNull(javaType51);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap0 = com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.emptyForProperties();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer2 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        java.lang.reflect.Type type4 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = toStringSerializer2.getSchema(serializerProvider3, type4);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer6 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer2);
        java.lang.Class<java.util.List<java.lang.String>> strListClass7 = indexedStringListSerializer6.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType8 = typeFactory1.constructRawCollectionLikeType(strListClass7);
        com.fasterxml.jackson.databind.PropertyName propertyName9 = collectionLikeType8.getTypeHandler();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer11 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        java.lang.reflect.Type type13 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = toStringSerializer11.getSchema(serializerProvider12, type13);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer15 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer11);
        java.lang.Class<java.util.List<java.lang.String>> strListClass16 = indexedStringListSerializer15.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType17 = typeFactory10.constructRawCollectionLikeType(strListClass16);
        com.fasterxml.jackson.databind.PropertyName propertyName18 = collectionLikeType17.getTypeHandler();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer20 = null;
        com.fasterxml.jackson.databind.JavaType javaType21 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer23 = null;
        com.fasterxml.jackson.databind.JavaType javaType25 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName26 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations27 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember28 = null;
        com.fasterxml.jackson.databind.BeanProperty.Std std30 = new com.fasterxml.jackson.databind.BeanProperty.Std("", javaType25, propertyName26, annotations27, annotatedMember28, true);
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer31 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.CollectionSerializer collectionSerializer32 = new com.fasterxml.jackson.databind.ser.std.CollectionSerializer(javaType21, true, typeSerializer23, (com.fasterxml.jackson.databind.BeanProperty) std30, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer31);
        com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer objectArraySerializer33 = new com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer((com.fasterxml.jackson.databind.JavaType) collectionLikeType17, false, typeSerializer20, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer31);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult serializerAndMapResult34 = propertySerializerMap0.addSerializer((com.fasterxml.jackson.databind.JavaType) collectionLikeType8, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer31);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap35 = serializerAndMapResult34.map;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory37 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals(false);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory38 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer39 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider40 = null;
        java.lang.reflect.Type type41 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode42 = toStringSerializer39.getSchema(serializerProvider40, type41);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer43 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer39);
        java.lang.Class<java.util.List<java.lang.String>> strListClass44 = indexedStringListSerializer43.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType45 = typeFactory38.constructRawCollectionLikeType(strListClass44);
        java.lang.Class<?> wildcardClass46 = collectionLikeType45.getParameterSource();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer47 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider48 = null;
        java.lang.reflect.Type type49 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode50 = toStringSerializer47.getSchema(serializerProvider48, type49);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer51 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer47);
        java.lang.Class<java.util.List<java.lang.String>> strListClass52 = indexedStringListSerializer51.handledType();
        boolean boolean53 = com.fasterxml.jackson.databind.util.ClassUtil.isConcrete(strListClass52);
        com.fasterxml.jackson.databind.JavaType javaType54 = collectionLikeType45.narrowBy(strListClass52);
        com.fasterxml.jackson.databind.node.ValueNode valueNode55 = jsonNodeFactory37.pojoNode((java.lang.Object) strListClass52);
        com.fasterxml.jackson.databind.type.SimpleType simpleType56 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(strListClass52);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer57 = propertySerializerMap35.serializerFor(strListClass52);
        org.junit.Assert.assertNotNull(propertySerializerMap0);
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(toStringSerializer2);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNotNull(strListClass7);
        org.junit.Assert.assertNotNull(collectionLikeType8);
        org.junit.Assert.assertNull(propertyName9);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(toStringSerializer11);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNotNull(strListClass16);
        org.junit.Assert.assertNotNull(collectionLikeType17);
        org.junit.Assert.assertNull(propertyName18);
        org.junit.Assert.assertNotNull(toStringSerializer31);
        org.junit.Assert.assertNotNull(serializerAndMapResult34);
        org.junit.Assert.assertNotNull(propertySerializerMap35);
        org.junit.Assert.assertNotNull(jsonNodeFactory37);
        org.junit.Assert.assertNotNull(typeFactory38);
        org.junit.Assert.assertNotNull(toStringSerializer39);
        org.junit.Assert.assertNotNull(jsonNode42);
        org.junit.Assert.assertNotNull(strListClass44);
        org.junit.Assert.assertNotNull(collectionLikeType45);
        org.junit.Assert.assertNull(wildcardClass46);
        org.junit.Assert.assertNotNull(toStringSerializer47);
        org.junit.Assert.assertNotNull(jsonNode50);
        org.junit.Assert.assertNotNull(strListClass52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(javaType54);
        org.junit.Assert.assertNotNull(valueNode55);
        org.junit.Assert.assertNotNull(simpleType56);
        org.junit.Assert.assertNotNull(objJsonSerializer57);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap0 = com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.emptyForProperties();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer2 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        java.lang.reflect.Type type4 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = toStringSerializer2.getSchema(serializerProvider3, type4);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer6 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer2);
        java.lang.Class<java.util.List<java.lang.String>> strListClass7 = indexedStringListSerializer6.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType8 = typeFactory1.constructRawCollectionLikeType(strListClass7);
        com.fasterxml.jackson.databind.PropertyName propertyName9 = collectionLikeType8.getTypeHandler();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer11 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        java.lang.reflect.Type type13 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = toStringSerializer11.getSchema(serializerProvider12, type13);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer15 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer11);
        java.lang.Class<java.util.List<java.lang.String>> strListClass16 = indexedStringListSerializer15.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType17 = typeFactory10.constructRawCollectionLikeType(strListClass16);
        com.fasterxml.jackson.databind.PropertyName propertyName18 = collectionLikeType17.getTypeHandler();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer20 = null;
        com.fasterxml.jackson.databind.JavaType javaType21 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer23 = null;
        com.fasterxml.jackson.databind.JavaType javaType25 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName26 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations27 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember28 = null;
        com.fasterxml.jackson.databind.BeanProperty.Std std30 = new com.fasterxml.jackson.databind.BeanProperty.Std("", javaType25, propertyName26, annotations27, annotatedMember28, true);
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer31 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.CollectionSerializer collectionSerializer32 = new com.fasterxml.jackson.databind.ser.std.CollectionSerializer(javaType21, true, typeSerializer23, (com.fasterxml.jackson.databind.BeanProperty) std30, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer31);
        com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer objectArraySerializer33 = new com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer((com.fasterxml.jackson.databind.JavaType) collectionLikeType17, false, typeSerializer20, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer31);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult serializerAndMapResult34 = propertySerializerMap0.addSerializer((com.fasterxml.jackson.databind.JavaType) collectionLikeType8, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer31);
        java.lang.StringBuilder stringBuilder35 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder36 = collectionLikeType8.getErasedSignature(stringBuilder35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertySerializerMap0);
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(toStringSerializer2);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNotNull(strListClass7);
        org.junit.Assert.assertNotNull(collectionLikeType8);
        org.junit.Assert.assertNull(propertyName9);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(toStringSerializer11);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNotNull(strListClass16);
        org.junit.Assert.assertNotNull(collectionLikeType17);
        org.junit.Assert.assertNull(propertyName18);
        org.junit.Assert.assertNotNull(toStringSerializer31);
        org.junit.Assert.assertNotNull(serializerAndMapResult34);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer1 = com.fasterxml.jackson.databind.ser.std.CalendarSerializer.instance;
        java.util.Calendar calendar2 = null;
        long long3 = calendarSerializer1._timestamp(calendar2);
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer4 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        java.lang.reflect.Type type6 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = toStringSerializer4.getSchema(serializerProvider5, type6);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer8 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer4);
        java.lang.Class<java.util.List<java.lang.String>> strListClass9 = indexedStringListSerializer8.handledType();
        com.fasterxml.jackson.databind.exc.InvalidFormatException invalidFormatException10 = new com.fasterxml.jackson.databind.exc.InvalidFormatException("", (java.lang.Object) long3, strListClass9);
        java.util.List<com.fasterxml.jackson.databind.JsonMappingException.Reference> referenceList11 = invalidFormatException10.getPath();
        org.junit.Assert.assertNotNull(calendarSerializer1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(toStringSerializer4);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(strListClass9);
        org.junit.Assert.assertNotNull(referenceList11);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.fasterxml.jackson.databind.ser.std.InetAddressSerializer inetAddressSerializer0 = new com.fasterxml.jackson.databind.ser.std.InetAddressSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer3 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        java.lang.reflect.Type type5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = toStringSerializer3.getSchema(serializerProvider4, type5);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer7 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer3);
        java.lang.Class<java.util.List<java.lang.String>> strListClass8 = indexedStringListSerializer7.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType9 = typeFactory2.constructRawCollectionLikeType(strListClass8);
        java.lang.Class<?> wildcardClass10 = collectionLikeType9.getParameterSource();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer11 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        java.lang.reflect.Type type13 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = toStringSerializer11.getSchema(serializerProvider12, type13);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer15 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer11);
        java.lang.Class<java.util.List<java.lang.String>> strListClass16 = indexedStringListSerializer15.handledType();
        boolean boolean17 = com.fasterxml.jackson.databind.util.ClassUtil.isConcrete(strListClass16);
        com.fasterxml.jackson.databind.JavaType javaType18 = collectionLikeType9.narrowBy(strListClass16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer20 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider21 = null;
        java.lang.reflect.Type type22 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode23 = toStringSerializer20.getSchema(serializerProvider21, type22);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer24 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer20);
        java.lang.Class<java.util.List<java.lang.String>> strListClass25 = indexedStringListSerializer24.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType26 = typeFactory19.constructRawCollectionLikeType(strListClass25);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer28 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider29 = null;
        java.lang.reflect.Type type30 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode31 = toStringSerializer28.getSchema(serializerProvider29, type30);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer32 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer28);
        java.lang.Class<java.util.List<java.lang.String>> strListClass33 = indexedStringListSerializer32.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType34 = typeFactory27.constructRawCollectionLikeType(strListClass33);
        java.lang.Class<?> wildcardClass35 = collectionLikeType34.getParameterSource();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer36 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider37 = null;
        java.lang.reflect.Type type38 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode39 = toStringSerializer36.getSchema(serializerProvider37, type38);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer40 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer36);
        java.lang.Class<java.util.List<java.lang.String>> strListClass41 = indexedStringListSerializer40.handledType();
        boolean boolean42 = com.fasterxml.jackson.databind.util.ClassUtil.isConcrete(strListClass41);
        com.fasterxml.jackson.databind.JavaType javaType43 = collectionLikeType34.narrowBy(strListClass41);
        com.fasterxml.jackson.databind.type.MapType mapType44 = com.fasterxml.jackson.databind.type.MapType.construct(strListClass16, (com.fasterxml.jackson.databind.JavaType) collectionLikeType26, (com.fasterxml.jackson.databind.JavaType) collectionLikeType34);
        com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion inclusion45 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.NON_DEFAULT;
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType46 = mapType44.withKeyTypeHandler((java.lang.Object) inclusion45);
        com.fasterxml.jackson.databind.JsonNode jsonNode48 = inetAddressSerializer0.getSchema(serializerProvider1, (java.lang.reflect.Type) mapLikeType46, false);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer49 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.net.InetAddress> inetAddressJsonSerializer50 = inetAddressSerializer0.unwrappingSerializer(nameTransformer49);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(toStringSerializer3);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(strListClass8);
        org.junit.Assert.assertNotNull(collectionLikeType9);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNotNull(toStringSerializer11);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNotNull(strListClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(javaType18);
        org.junit.Assert.assertNotNull(typeFactory19);
        org.junit.Assert.assertNotNull(toStringSerializer20);
        org.junit.Assert.assertNotNull(jsonNode23);
        org.junit.Assert.assertNotNull(strListClass25);
        org.junit.Assert.assertNotNull(collectionLikeType26);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(toStringSerializer28);
        org.junit.Assert.assertNotNull(jsonNode31);
        org.junit.Assert.assertNotNull(strListClass33);
        org.junit.Assert.assertNotNull(collectionLikeType34);
        org.junit.Assert.assertNull(wildcardClass35);
        org.junit.Assert.assertNotNull(toStringSerializer36);
        org.junit.Assert.assertNotNull(jsonNode39);
        org.junit.Assert.assertNotNull(strListClass41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(javaType43);
        org.junit.Assert.assertNotNull(mapType44);
        org.junit.Assert.assertTrue("'" + inclusion45 + "' != '" + com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.NON_DEFAULT + "'", inclusion45.equals(com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.NON_DEFAULT));
        org.junit.Assert.assertNotNull(mapLikeType46);
        org.junit.Assert.assertNotNull(jsonNode48);
        org.junit.Assert.assertNotNull(inetAddressJsonSerializer50);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer2 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName5 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations6 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        com.fasterxml.jackson.databind.BeanProperty.Std std9 = new com.fasterxml.jackson.databind.BeanProperty.Std("", javaType4, propertyName5, annotations6, annotatedMember7, true);
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer10 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.CollectionSerializer collectionSerializer11 = new com.fasterxml.jackson.databind.ser.std.CollectionSerializer(javaType0, true, typeSerializer2, (com.fasterxml.jackson.databind.BeanProperty) std9, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName15 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations16 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember17 = null;
        com.fasterxml.jackson.databind.BeanProperty.Std std19 = new com.fasterxml.jackson.databind.BeanProperty.Std("", javaType14, propertyName15, annotations16, annotatedMember17, true);
        com.fasterxml.jackson.databind.PropertyName propertyName20 = std19.getWrapperName();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer22 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider23 = null;
        java.lang.reflect.Type type24 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode25 = toStringSerializer22.getSchema(serializerProvider23, type24);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer26 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer22);
        java.lang.Class<java.util.List<java.lang.String>> strListClass27 = indexedStringListSerializer26.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType28 = typeFactory21.constructRawCollectionLikeType(strListClass27);
        com.fasterxml.jackson.databind.BeanProperty.Std std29 = std19.withType((com.fasterxml.jackson.databind.JavaType) collectionLikeType28);
        com.fasterxml.jackson.databind.JsonNode jsonNode31 = toStringSerializer10.getSchema(serializerProvider12, (java.lang.reflect.Type) collectionLikeType28, true);
        com.fasterxml.jackson.databind.JavaType javaType33 = collectionLikeType28.containedTypeOrUnknown((int) (short) -1);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType35 = collectionLikeType28.withContentTypeHandler((java.lang.Object) false);
        org.junit.Assert.assertNotNull(toStringSerializer10);
        org.junit.Assert.assertNull(propertyName20);
        org.junit.Assert.assertNotNull(typeFactory21);
        org.junit.Assert.assertNotNull(toStringSerializer22);
        org.junit.Assert.assertNotNull(jsonNode25);
        org.junit.Assert.assertNotNull(strListClass27);
        org.junit.Assert.assertNotNull(collectionLikeType28);
        org.junit.Assert.assertNotNull(std29);
        org.junit.Assert.assertNotNull(jsonNode31);
        org.junit.Assert.assertNotNull(javaType33);
        org.junit.Assert.assertNotNull(collectionLikeType35);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer1 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        java.lang.reflect.Type type3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = toStringSerializer1.getSchema(serializerProvider2, type3);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer5 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer1);
        java.lang.Class<java.util.List<java.lang.String>> strListClass6 = indexedStringListSerializer5.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = typeFactory0.constructRawCollectionLikeType(strListClass6);
        com.fasterxml.jackson.databind.PropertyName propertyName8 = collectionLikeType7.getTypeHandler();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer13 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName16 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations17 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember18 = null;
        com.fasterxml.jackson.databind.BeanProperty.Std std20 = new com.fasterxml.jackson.databind.BeanProperty.Std("", javaType15, propertyName16, annotations17, annotatedMember18, true);
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer21 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.CollectionSerializer collectionSerializer22 = new com.fasterxml.jackson.databind.ser.std.CollectionSerializer(javaType11, true, typeSerializer13, (com.fasterxml.jackson.databind.BeanProperty) std20, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer21);
        com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer objectArraySerializer23 = new com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, false, typeSerializer10, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer21);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer24 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object[]> objArrayJsonSerializer25 = objectArraySerializer23.unwrappingSerializer(nameTransformer24);
        java.lang.Class<java.lang.Object[]> objArrayClass26 = objectArraySerializer23.handledType();
        com.fasterxml.jackson.core.JsonFactory jsonFactory27 = null;
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider28 = null;
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext29 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper30 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory27, defaultSerializerProvider28, defaultDeserializationContext29);
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature31 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper32 = objectMapper30.enable(deserializationFeature31);
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig33 = objectMapper30.getSerializationConfig();
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature34 = com.fasterxml.jackson.databind.DeserializationFeature.WRAP_EXCEPTIONS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory35 = null;
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider36 = null;
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext37 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper38 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory35, defaultSerializerProvider36, defaultDeserializationContext37);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper39 = objectMapper38.enableDefaultTyping();
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature40 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_INVALID_SUBTYPE;
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature41 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_INVALID_SUBTYPE;
        com.fasterxml.jackson.databind.DeserializationFeature[] deserializationFeatureArray42 = new com.fasterxml.jackson.databind.DeserializationFeature[] { deserializationFeature41 };
        com.fasterxml.jackson.databind.ObjectMapper objectMapper43 = objectMapper39.enable(deserializationFeature40, deserializationFeatureArray42);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper44 = objectMapper30.enable(deserializationFeature34, deserializationFeatureArray42);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator45 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider46 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer47 = null;
        // The following exception was thrown during execution in test generation
        try {
            objectArraySerializer23.serializeWithType((java.lang.Object[]) deserializationFeatureArray42, jsonGenerator45, serializerProvider46, typeSerializer47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(toStringSerializer1);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strListClass6);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertNull(propertyName8);
        org.junit.Assert.assertNotNull(toStringSerializer21);
        org.junit.Assert.assertNotNull(objArrayJsonSerializer25);
        org.junit.Assert.assertNotNull(objArrayClass26);
        org.junit.Assert.assertTrue("'" + deserializationFeature31 + "' != '" + com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES + "'", deserializationFeature31.equals(com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        org.junit.Assert.assertNotNull(objectMapper32);
        org.junit.Assert.assertNotNull(serializationConfig33);
        org.junit.Assert.assertTrue("'" + deserializationFeature34 + "' != '" + com.fasterxml.jackson.databind.DeserializationFeature.WRAP_EXCEPTIONS + "'", deserializationFeature34.equals(com.fasterxml.jackson.databind.DeserializationFeature.WRAP_EXCEPTIONS));
        org.junit.Assert.assertNotNull(objectMapper39);
        org.junit.Assert.assertTrue("'" + deserializationFeature40 + "' != '" + com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_INVALID_SUBTYPE + "'", deserializationFeature40.equals(com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_INVALID_SUBTYPE));
        org.junit.Assert.assertTrue("'" + deserializationFeature41 + "' != '" + com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_INVALID_SUBTYPE + "'", deserializationFeature41.equals(com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_INVALID_SUBTYPE));
        org.junit.Assert.assertNotNull(deserializationFeatureArray42);
        org.junit.Assert.assertNotNull(objectMapper43);
        org.junit.Assert.assertNotNull(objectMapper44);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer.instance;
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations5 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember6 = null;
        com.fasterxml.jackson.databind.BeanProperty.Std std8 = new com.fasterxml.jackson.databind.BeanProperty.Std("", javaType3, propertyName4, annotations5, annotatedMember6, true);
        com.fasterxml.jackson.databind.PropertyName propertyName9 = std8.getWrapperName();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer11 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        java.lang.reflect.Type type13 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = toStringSerializer11.getSchema(serializerProvider12, type13);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer15 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer11);
        java.lang.Class<java.util.List<java.lang.String>> strListClass16 = indexedStringListSerializer15.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType17 = typeFactory10.constructRawCollectionLikeType(strListClass16);
        com.fasterxml.jackson.databind.BeanProperty.Std std18 = std8.withType((com.fasterxml.jackson.databind.JavaType) collectionLikeType17);
        // The following exception was thrown during execution in test generation
        try {
            shortSerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, (com.fasterxml.jackson.databind.JavaType) collectionLikeType17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortSerializer0);
        org.junit.Assert.assertNull(propertyName9);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(toStringSerializer11);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNotNull(strListClass16);
        org.junit.Assert.assertNotNull(collectionLikeType17);
        org.junit.Assert.assertNotNull(std18);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = null;
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider1 = null;
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext2 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper3 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory0, defaultSerializerProvider1, defaultDeserializationContext2);
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature4 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = objectMapper3.enable(deserializationFeature4);
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig6 = objectMapper3.getSerializationConfig();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer7 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        java.lang.reflect.Type type9 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = toStringSerializer7.getSchema(serializerProvider8, type9);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer11 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer7);
        java.lang.Class<java.util.List<java.lang.String>> strListClass12 = indexedStringListSerializer11.handledType();
        boolean boolean13 = com.fasterxml.jackson.databind.util.ClassUtil.isConcrete(strListClass12);
        boolean boolean14 = com.fasterxml.jackson.databind.util.ClassUtil.isProxyType(strListClass12);
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig15 = serializationConfig6.withView(strListClass12);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector16 = serializationConfig15.getAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass17 = null;
        java.lang.reflect.Field field18 = null;
        com.fasterxml.jackson.databind.introspect.AnnotationMap annotationMap19 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedField annotatedField20 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(annotatedClass17, field18, annotationMap19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = annotationIntrospector16.findSerializationType((com.fasterxml.jackson.databind.introspect.Annotated) annotatedClass17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + deserializationFeature4 + "' != '" + com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES + "'", deserializationFeature4.equals(com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        org.junit.Assert.assertNotNull(objectMapper5);
        org.junit.Assert.assertNotNull(serializationConfig6);
        org.junit.Assert.assertNotNull(toStringSerializer7);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertNotNull(strListClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(serializationConfig15);
        org.junit.Assert.assertNotNull(annotationIntrospector16);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer0 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        java.lang.reflect.Type type2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = toStringSerializer0.getSchema(serializerProvider1, type2);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer4 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer0);
        java.lang.Class<java.util.List<java.lang.String>> strListClass5 = indexedStringListSerializer4.handledType();
        boolean boolean6 = indexedStringListSerializer4.isUnwrappingSerializer();
        org.junit.Assert.assertNotNull(toStringSerializer0);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNotNull(strListClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer0 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        java.lang.reflect.Type type2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = toStringSerializer0.getSchema(serializerProvider1, type2);
        java.lang.Class<java.lang.Object> objClass4 = toStringSerializer0.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName6 = com.fasterxml.jackson.databind.PropertyName.USE_DEFAULT;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer8 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider9 = null;
        java.lang.reflect.Type type10 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = toStringSerializer8.getSchema(serializerProvider9, type10);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer12 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer8);
        java.lang.Class<java.util.List<java.lang.String>> strListClass13 = indexedStringListSerializer12.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType14 = typeFactory7.constructRawCollectionLikeType(strListClass13);
        com.fasterxml.jackson.databind.PropertyName propertyName15 = collectionLikeType14.getTypeHandler();
        com.fasterxml.jackson.databind.PropertyName propertyName18 = com.fasterxml.jackson.databind.PropertyName.construct("hi!", "hi!");
        com.fasterxml.jackson.databind.util.Annotations annotations19 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass20 = null;
        java.lang.reflect.Field field21 = null;
        com.fasterxml.jackson.databind.introspect.AnnotationMap annotationMap22 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedField annotatedField23 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(annotatedClass20, field21, annotationMap22);
        com.fasterxml.jackson.databind.JavaType javaType25 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName26 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations27 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember28 = null;
        com.fasterxml.jackson.databind.BeanProperty.Std std30 = new com.fasterxml.jackson.databind.BeanProperty.Std("", javaType25, propertyName26, annotations27, annotatedMember28, true);
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata31 = std30.getMetadata();
        com.fasterxml.jackson.databind.BeanProperty.Std std32 = new com.fasterxml.jackson.databind.BeanProperty.Std(propertyName6, (com.fasterxml.jackson.databind.JavaType) collectionLikeType14, propertyName18, annotations19, (com.fasterxml.jackson.databind.introspect.AnnotatedMember) annotatedField23, propertyMetadata31);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer34 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider35 = null;
        java.lang.reflect.Type type36 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode37 = toStringSerializer34.getSchema(serializerProvider35, type36);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer38 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer34);
        java.lang.Class<java.util.List<java.lang.String>> strListClass39 = indexedStringListSerializer38.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType40 = typeFactory33.constructRawCollectionLikeType(strListClass39);
        com.fasterxml.jackson.databind.PropertyName propertyName41 = collectionLikeType40.getTypeHandler();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer43 = null;
        com.fasterxml.jackson.databind.JavaType javaType44 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer46 = null;
        com.fasterxml.jackson.databind.JavaType javaType48 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName49 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations50 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember51 = null;
        com.fasterxml.jackson.databind.BeanProperty.Std std53 = new com.fasterxml.jackson.databind.BeanProperty.Std("", javaType48, propertyName49, annotations50, annotatedMember51, true);
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer54 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.CollectionSerializer collectionSerializer55 = new com.fasterxml.jackson.databind.ser.std.CollectionSerializer(javaType44, true, typeSerializer46, (com.fasterxml.jackson.databind.BeanProperty) std53, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer54);
        com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer objectArraySerializer56 = new com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer((com.fasterxml.jackson.databind.JavaType) collectionLikeType40, false, typeSerializer43, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer54);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider57 = null;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory58 = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance;
        com.fasterxml.jackson.databind.node.ValueNode valueNode60 = jsonNodeFactory58.booleanNode(true);
        com.fasterxml.jackson.databind.node.ValueNode valueNode62 = jsonNodeFactory58.numberNode((java.lang.Integer) 2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec63 = null;
        com.fasterxml.jackson.databind.node.TreeTraversingParser treeTraversingParser64 = new com.fasterxml.jackson.databind.node.TreeTraversingParser((com.fasterxml.jackson.databind.JsonNode) valueNode62, objectCodec63);
        boolean boolean66 = treeTraversingParser64.hasTokenId(9);
        com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap annotatedMethodMap68 = new com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap();
        java.util.Spliterator<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> annotatedMethodSpliterator69 = annotatedMethodMap68.spliterator();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory71 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals(false);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory72 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer73 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider74 = null;
        java.lang.reflect.Type type75 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode76 = toStringSerializer73.getSchema(serializerProvider74, type75);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer77 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer73);
        java.lang.Class<java.util.List<java.lang.String>> strListClass78 = indexedStringListSerializer77.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType79 = typeFactory72.constructRawCollectionLikeType(strListClass78);
        java.lang.Class<?> wildcardClass80 = collectionLikeType79.getParameterSource();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer81 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider82 = null;
        java.lang.reflect.Type type83 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode84 = toStringSerializer81.getSchema(serializerProvider82, type83);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer85 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer81);
        java.lang.Class<java.util.List<java.lang.String>> strListClass86 = indexedStringListSerializer85.handledType();
        boolean boolean87 = com.fasterxml.jackson.databind.util.ClassUtil.isConcrete(strListClass86);
        com.fasterxml.jackson.databind.JavaType javaType88 = collectionLikeType79.narrowBy(strListClass86);
        com.fasterxml.jackson.databind.node.ValueNode valueNode89 = jsonNodeFactory71.pojoNode((java.lang.Object) strListClass86);
        com.fasterxml.jackson.databind.exc.InvalidFormatException invalidFormatException90 = com.fasterxml.jackson.databind.exc.InvalidFormatException.from((com.fasterxml.jackson.core.JsonParser) treeTraversingParser64, "java.util.List<java.util.List<java.lang.Object>,java.util.List<java.lang.Object>>", (java.lang.Object) annotatedMethodMap68, strListClass86);
        com.fasterxml.jackson.databind.JsonNode jsonNode92 = toStringSerializer54.getSchema(serializerProvider57, (java.lang.reflect.Type) strListClass86, true);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer93 = toStringSerializer0.findConvertingContentSerializer(serializerProvider5, (com.fasterxml.jackson.databind.BeanProperty) std32, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringSerializer0);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNotNull(objClass4);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(toStringSerializer8);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertNotNull(strListClass13);
        org.junit.Assert.assertNotNull(collectionLikeType14);
        org.junit.Assert.assertNull(propertyName15);
        org.junit.Assert.assertNotNull(propertyName18);
        org.junit.Assert.assertNotNull(propertyMetadata31);
        org.junit.Assert.assertNotNull(typeFactory33);
        org.junit.Assert.assertNotNull(toStringSerializer34);
        org.junit.Assert.assertNotNull(jsonNode37);
        org.junit.Assert.assertNotNull(strListClass39);
        org.junit.Assert.assertNotNull(collectionLikeType40);
        org.junit.Assert.assertNull(propertyName41);
        org.junit.Assert.assertNotNull(toStringSerializer54);
        org.junit.Assert.assertNotNull(jsonNodeFactory58);
        org.junit.Assert.assertNotNull(valueNode60);
        org.junit.Assert.assertNotNull(valueNode62);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(annotatedMethodSpliterator69);
        org.junit.Assert.assertNotNull(jsonNodeFactory71);
        org.junit.Assert.assertNotNull(typeFactory72);
        org.junit.Assert.assertNotNull(toStringSerializer73);
        org.junit.Assert.assertNotNull(jsonNode76);
        org.junit.Assert.assertNotNull(strListClass78);
        org.junit.Assert.assertNotNull(collectionLikeType79);
        org.junit.Assert.assertNull(wildcardClass80);
        org.junit.Assert.assertNotNull(toStringSerializer81);
        org.junit.Assert.assertNotNull(jsonNode84);
        org.junit.Assert.assertNotNull(strListClass86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(javaType88);
        org.junit.Assert.assertNotNull(valueNode89);
        org.junit.Assert.assertNotNull(invalidFormatException90);
        org.junit.Assert.assertNotNull(jsonNode92);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.fasterxml.jackson.databind.ser.std.SerializableSerializer serializableSerializer0 = new com.fasterxml.jackson.databind.ser.std.SerializableSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance;
        com.fasterxml.jackson.databind.node.ValueNode valueNode4 = jsonNodeFactory2.booleanNode(true);
        com.fasterxml.jackson.databind.node.ValueNode valueNode6 = jsonNodeFactory2.numberNode((java.lang.Integer) 2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = null;
        com.fasterxml.jackson.databind.node.TreeTraversingParser treeTraversingParser8 = new com.fasterxml.jackson.databind.node.TreeTraversingParser((com.fasterxml.jackson.databind.JsonNode) valueNode6, objectCodec7);
        boolean boolean10 = treeTraversingParser8.hasTokenId(9);
        com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap annotatedMethodMap12 = new com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap();
        java.util.Spliterator<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> annotatedMethodSpliterator13 = annotatedMethodMap12.spliterator();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory15 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals(false);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer17 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider18 = null;
        java.lang.reflect.Type type19 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode20 = toStringSerializer17.getSchema(serializerProvider18, type19);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer21 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer17);
        java.lang.Class<java.util.List<java.lang.String>> strListClass22 = indexedStringListSerializer21.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType23 = typeFactory16.constructRawCollectionLikeType(strListClass22);
        java.lang.Class<?> wildcardClass24 = collectionLikeType23.getParameterSource();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer25 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider26 = null;
        java.lang.reflect.Type type27 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode28 = toStringSerializer25.getSchema(serializerProvider26, type27);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer29 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer25);
        java.lang.Class<java.util.List<java.lang.String>> strListClass30 = indexedStringListSerializer29.handledType();
        boolean boolean31 = com.fasterxml.jackson.databind.util.ClassUtil.isConcrete(strListClass30);
        com.fasterxml.jackson.databind.JavaType javaType32 = collectionLikeType23.narrowBy(strListClass30);
        com.fasterxml.jackson.databind.node.ValueNode valueNode33 = jsonNodeFactory15.pojoNode((java.lang.Object) strListClass30);
        com.fasterxml.jackson.databind.exc.InvalidFormatException invalidFormatException34 = com.fasterxml.jackson.databind.exc.InvalidFormatException.from((com.fasterxml.jackson.core.JsonParser) treeTraversingParser8, "java.util.List<java.util.List<java.lang.Object>,java.util.List<java.lang.Object>>", (java.lang.Object) annotatedMethodMap12, strListClass30);
        com.fasterxml.jackson.databind.JsonNode jsonNode35 = serializableSerializer0.getSchema(serializerProvider1, (java.lang.reflect.Type) strListClass30);
        org.junit.Assert.assertNotNull(jsonNodeFactory2);
        org.junit.Assert.assertNotNull(valueNode4);
        org.junit.Assert.assertNotNull(valueNode6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(annotatedMethodSpliterator13);
        org.junit.Assert.assertNotNull(jsonNodeFactory15);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(toStringSerializer17);
        org.junit.Assert.assertNotNull(jsonNode20);
        org.junit.Assert.assertNotNull(strListClass22);
        org.junit.Assert.assertNotNull(collectionLikeType23);
        org.junit.Assert.assertNull(wildcardClass24);
        org.junit.Assert.assertNotNull(toStringSerializer25);
        org.junit.Assert.assertNotNull(jsonNode28);
        org.junit.Assert.assertNotNull(strListClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(javaType32);
        org.junit.Assert.assertNotNull(valueNode33);
        org.junit.Assert.assertNotNull(invalidFormatException34);
        org.junit.Assert.assertNotNull(jsonNode35);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer1 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        java.lang.reflect.Type type3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = toStringSerializer1.getSchema(serializerProvider2, type3);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer5 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer1);
        java.lang.Class<java.util.List<java.lang.String>> strListClass6 = indexedStringListSerializer5.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = typeFactory0.constructRawCollectionLikeType(strListClass6);
        com.fasterxml.jackson.databind.PropertyName propertyName8 = collectionLikeType7.getTypeHandler();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer13 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName16 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations17 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember18 = null;
        com.fasterxml.jackson.databind.BeanProperty.Std std20 = new com.fasterxml.jackson.databind.BeanProperty.Std("", javaType15, propertyName16, annotations17, annotatedMember18, true);
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer21 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.CollectionSerializer collectionSerializer22 = new com.fasterxml.jackson.databind.ser.std.CollectionSerializer(javaType11, true, typeSerializer13, (com.fasterxml.jackson.databind.BeanProperty) std20, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer21);
        com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer objectArraySerializer23 = new com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, false, typeSerializer10, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer21);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode26 = toStringSerializer21.createSchemaNode("hi!", false);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor27 = objectNode26.iterator();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode30 = objectNode26.put("", 0.0d);
        int int31 = objectNode30.size();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode34 = objectNode30.put("hi!", (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.node.NullNode nullNode35 = objectNode30.nullNode();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(toStringSerializer1);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strListClass6);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertNull(propertyName8);
        org.junit.Assert.assertNotNull(toStringSerializer21);
        org.junit.Assert.assertNotNull(objectNode26);
        org.junit.Assert.assertNotNull(jsonNodeItor27);
        org.junit.Assert.assertNotNull(objectNode30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertNotNull(objectNode34);
        org.junit.Assert.assertNotNull(nullNode35);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = null;
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider1 = null;
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext2 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper3 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory0, defaultSerializerProvider1, defaultDeserializationContext2);
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature4 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = objectMapper3.enable(deserializationFeature4);
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig6 = objectMapper3.getSerializationConfig();
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker7 = serializationConfig6.getDefaultVisibilityChecker();
        com.fasterxml.jackson.databind.SerializationFeature serializationFeature8 = com.fasterxml.jackson.databind.SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS;
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig9 = serializationConfig6.with(serializationFeature8);
        int int10 = serializationConfig9.mixInCount();
        org.junit.Assert.assertTrue("'" + deserializationFeature4 + "' != '" + com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES + "'", deserializationFeature4.equals(com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        org.junit.Assert.assertNotNull(objectMapper5);
        org.junit.Assert.assertNotNull(serializationConfig6);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker7);
        org.junit.Assert.assertTrue("'" + serializationFeature8 + "' != '" + com.fasterxml.jackson.databind.SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS + "'", serializationFeature8.equals(com.fasterxml.jackson.databind.SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS));
        org.junit.Assert.assertNotNull(serializationConfig9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = floatSerializer0.getDelegatee();
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer0 = com.fasterxml.jackson.databind.ser.std.CalendarSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.deser.UnresolvedForwardReference unresolvedForwardReference3 = new com.fasterxml.jackson.databind.deser.UnresolvedForwardReference("hi!");
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference4 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException5 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) unresolvedForwardReference3, reference4);
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            calendarSerializer0.wrapAndThrow(serializerProvider1, (java.lang.Throwable) unresolvedForwardReference3, obj6, "com.fasterxml.jackson.databind.deser.UnresolvedForwardReference: hi!.");
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.deser.UnresolvedForwardReference whose getMessage() throws an exception");
        } catch (com.fasterxml.jackson.databind.deser.UnresolvedForwardReference e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendarSerializer0);
        org.junit.Assert.assertNotNull(jsonMappingException5);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer1 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        java.lang.reflect.Type type3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = toStringSerializer1.getSchema(serializerProvider2, type3);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer5 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer1);
        java.lang.Class<java.util.List<java.lang.String>> strListClass6 = indexedStringListSerializer5.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = typeFactory0.constructRawCollectionLikeType(strListClass6);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory0.withModifier(typeModifier8);
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer10 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        java.lang.reflect.Type type12 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = toStringSerializer10.getSchema(serializerProvider11, type12);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer14 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer10);
        java.lang.Class<java.util.List<java.lang.String>> strListClass15 = indexedStringListSerializer14.handledType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer17 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider18 = null;
        java.lang.reflect.Type type19 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode20 = toStringSerializer17.getSchema(serializerProvider18, type19);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer21 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer17);
        java.lang.Class<java.util.List<java.lang.String>> strListClass22 = indexedStringListSerializer21.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType23 = typeFactory16.constructRawCollectionLikeType(strListClass22);
        boolean boolean24 = com.fasterxml.jackson.databind.util.ClassUtil.isNonStaticInnerClass(strListClass22);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings25 = null;
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray26 = typeFactory0.findTypeParameters(strListClass15, strListClass22, typeBindings25);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector27 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory28 = null;
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider29 = null;
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext30 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper31 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory28, defaultSerializerProvider29, defaultDeserializationContext30);
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature32 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper33 = objectMapper31.enable(deserializationFeature32);
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig34 = objectMapper31.getSerializationConfig();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass35 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(strListClass15, annotationIntrospector27, (com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver) serializationConfig34);
        java.lang.reflect.Method method36 = null;
        com.fasterxml.jackson.databind.introspect.AnnotationMap annotationMap37 = null;
        com.fasterxml.jackson.databind.introspect.AnnotationMap[] annotationMapArray38 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod39 = new com.fasterxml.jackson.databind.introspect.AnnotatedMethod(annotatedClass35, method36, annotationMap37, annotationMapArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not construct AnnotatedMethod with null Method");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(toStringSerializer1);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strListClass6);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(toStringSerializer10);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertNotNull(strListClass15);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(toStringSerializer17);
        org.junit.Assert.assertNotNull(jsonNode20);
        org.junit.Assert.assertNotNull(strListClass22);
        org.junit.Assert.assertNotNull(collectionLikeType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(javaTypeArray26);
        org.junit.Assert.assertTrue("'" + deserializationFeature32 + "' != '" + com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES + "'", deserializationFeature32.equals(com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        org.junit.Assert.assertNotNull(objectMapper33);
        org.junit.Assert.assertNotNull(serializationConfig34);
        org.junit.Assert.assertNotNull(annotatedClass35);
        org.junit.Assert.assertNotNull(annotationMapArray38);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.fasterxml.jackson.databind.util.EnumValues enumValues0 = null;
        com.fasterxml.jackson.databind.ser.std.EnumSerializer enumSerializer2 = new com.fasterxml.jackson.databind.ser.std.EnumSerializer(enumValues0, (java.lang.Boolean) false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer1 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        java.lang.reflect.Type type3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = toStringSerializer1.getSchema(serializerProvider2, type3);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer5 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer1);
        java.lang.Class<java.util.List<java.lang.String>> strListClass6 = indexedStringListSerializer5.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = typeFactory0.constructRawCollectionLikeType(strListClass6);
        java.lang.Class<?> wildcardClass8 = collectionLikeType7.getParameterSource();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer9 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        java.lang.reflect.Type type11 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = toStringSerializer9.getSchema(serializerProvider10, type11);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer13 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer9);
        java.lang.Class<java.util.List<java.lang.String>> strListClass14 = indexedStringListSerializer13.handledType();
        boolean boolean15 = com.fasterxml.jackson.databind.util.ClassUtil.isConcrete(strListClass14);
        com.fasterxml.jackson.databind.JavaType javaType16 = collectionLikeType7.narrowBy(strListClass14);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer18 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider19 = null;
        java.lang.reflect.Type type20 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode21 = toStringSerializer18.getSchema(serializerProvider19, type20);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer22 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer18);
        java.lang.Class<java.util.List<java.lang.String>> strListClass23 = indexedStringListSerializer22.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType24 = typeFactory17.constructRawCollectionLikeType(strListClass23);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer26 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider27 = null;
        java.lang.reflect.Type type28 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode29 = toStringSerializer26.getSchema(serializerProvider27, type28);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer30 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer26);
        java.lang.Class<java.util.List<java.lang.String>> strListClass31 = indexedStringListSerializer30.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType32 = typeFactory25.constructRawCollectionLikeType(strListClass31);
        java.lang.Class<?> wildcardClass33 = collectionLikeType32.getParameterSource();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer34 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider35 = null;
        java.lang.reflect.Type type36 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode37 = toStringSerializer34.getSchema(serializerProvider35, type36);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer38 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer34);
        java.lang.Class<java.util.List<java.lang.String>> strListClass39 = indexedStringListSerializer38.handledType();
        boolean boolean40 = com.fasterxml.jackson.databind.util.ClassUtil.isConcrete(strListClass39);
        com.fasterxml.jackson.databind.JavaType javaType41 = collectionLikeType32.narrowBy(strListClass39);
        com.fasterxml.jackson.databind.type.MapType mapType42 = com.fasterxml.jackson.databind.type.MapType.construct(strListClass14, (com.fasterxml.jackson.databind.JavaType) collectionLikeType24, (com.fasterxml.jackson.databind.JavaType) collectionLikeType32);
        com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion inclusion43 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.NON_DEFAULT;
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType44 = mapType42.withKeyTypeHandler((java.lang.Object) inclusion43);
        com.fasterxml.jackson.databind.ser.std.UUIDSerializer uUIDSerializer45 = new com.fasterxml.jackson.databind.ser.std.UUIDSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper46 = null;
        com.fasterxml.jackson.databind.JavaType javaType47 = null;
        uUIDSerializer45.acceptJsonFormatVisitor(jsonFormatVisitorWrapper46, javaType47);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType49 = mapType42.withContentTypeHandler((java.lang.Object) javaType47);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.type.HierarchicType hierarchicType50 = new com.fasterxml.jackson.databind.type.HierarchicType((java.lang.reflect.Type) javaType47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(toStringSerializer1);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strListClass6);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNotNull(toStringSerializer9);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNotNull(strListClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(javaType16);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNotNull(toStringSerializer18);
        org.junit.Assert.assertNotNull(jsonNode21);
        org.junit.Assert.assertNotNull(strListClass23);
        org.junit.Assert.assertNotNull(collectionLikeType24);
        org.junit.Assert.assertNotNull(typeFactory25);
        org.junit.Assert.assertNotNull(toStringSerializer26);
        org.junit.Assert.assertNotNull(jsonNode29);
        org.junit.Assert.assertNotNull(strListClass31);
        org.junit.Assert.assertNotNull(collectionLikeType32);
        org.junit.Assert.assertNull(wildcardClass33);
        org.junit.Assert.assertNotNull(toStringSerializer34);
        org.junit.Assert.assertNotNull(jsonNode37);
        org.junit.Assert.assertNotNull(strListClass39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(javaType41);
        org.junit.Assert.assertNotNull(mapType42);
        org.junit.Assert.assertTrue("'" + inclusion43 + "' != '" + com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.NON_DEFAULT + "'", inclusion43.equals(com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.NON_DEFAULT));
        org.junit.Assert.assertNotNull(mapLikeType44);
        org.junit.Assert.assertNotNull(mapLikeType49);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = null;
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider1 = null;
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext2 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper3 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory0, defaultSerializerProvider1, defaultDeserializationContext2);
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature4 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = objectMapper3.enable(deserializationFeature4);
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig6 = objectMapper3.getSerializationConfig();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer7 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        java.lang.reflect.Type type9 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = toStringSerializer7.getSchema(serializerProvider8, type9);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer11 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer7);
        java.lang.Class<java.util.List<java.lang.String>> strListClass12 = indexedStringListSerializer11.handledType();
        boolean boolean13 = com.fasterxml.jackson.databind.util.ClassUtil.isConcrete(strListClass12);
        boolean boolean14 = com.fasterxml.jackson.databind.util.ClassUtil.isProxyType(strListClass12);
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig15 = serializationConfig6.withView(strListClass12);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector16 = serializationConfig15.getAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = annotationIntrospector16.hasAsValueAnnotation(annotatedMethod17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + deserializationFeature4 + "' != '" + com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES + "'", deserializationFeature4.equals(com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        org.junit.Assert.assertNotNull(objectMapper5);
        org.junit.Assert.assertNotNull(serializationConfig6);
        org.junit.Assert.assertNotNull(toStringSerializer7);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertNotNull(strListClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(serializationConfig15);
        org.junit.Assert.assertNotNull(annotationIntrospector16);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.fasterxml.jackson.databind.ser.std.SerializableSerializer serializableSerializer0 = new com.fasterxml.jackson.databind.ser.std.SerializableSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        java.lang.reflect.Type type2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = serializableSerializer0.getSchema(serializerProvider1, type2);
        java.lang.Class<com.fasterxml.jackson.databind.JsonSerializable> jsonSerializableClass4 = serializableSerializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<com.fasterxml.jackson.databind.JsonSerializable> jsonSerializableJsonSerializer6 = serializableSerializer0.unwrappingSerializer(nameTransformer5);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNotNull(jsonSerializableClass4);
        org.junit.Assert.assertNotNull(jsonSerializableJsonSerializer6);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer.instance;
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer3 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        java.lang.reflect.Type type5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = toStringSerializer3.getSchema(serializerProvider4, type5);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer7 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer3);
        java.lang.Class<java.util.List<java.lang.String>> strListClass8 = indexedStringListSerializer7.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType9 = typeFactory2.constructRawCollectionLikeType(strListClass8);
        java.lang.Class<?> wildcardClass10 = collectionLikeType9.getParameterSource();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer11 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        java.lang.reflect.Type type13 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = toStringSerializer11.getSchema(serializerProvider12, type13);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer15 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer11);
        java.lang.Class<java.util.List<java.lang.String>> strListClass16 = indexedStringListSerializer15.handledType();
        boolean boolean17 = com.fasterxml.jackson.databind.util.ClassUtil.isConcrete(strListClass16);
        com.fasterxml.jackson.databind.JavaType javaType18 = collectionLikeType9.narrowBy(strListClass16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer20 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider21 = null;
        java.lang.reflect.Type type22 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode23 = toStringSerializer20.getSchema(serializerProvider21, type22);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer24 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer20);
        java.lang.Class<java.util.List<java.lang.String>> strListClass25 = indexedStringListSerializer24.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType26 = typeFactory19.constructRawCollectionLikeType(strListClass25);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer28 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider29 = null;
        java.lang.reflect.Type type30 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode31 = toStringSerializer28.getSchema(serializerProvider29, type30);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer32 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer28);
        java.lang.Class<java.util.List<java.lang.String>> strListClass33 = indexedStringListSerializer32.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType34 = typeFactory27.constructRawCollectionLikeType(strListClass33);
        java.lang.Class<?> wildcardClass35 = collectionLikeType34.getParameterSource();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer36 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider37 = null;
        java.lang.reflect.Type type38 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode39 = toStringSerializer36.getSchema(serializerProvider37, type38);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer40 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer36);
        java.lang.Class<java.util.List<java.lang.String>> strListClass41 = indexedStringListSerializer40.handledType();
        boolean boolean42 = com.fasterxml.jackson.databind.util.ClassUtil.isConcrete(strListClass41);
        com.fasterxml.jackson.databind.JavaType javaType43 = collectionLikeType34.narrowBy(strListClass41);
        com.fasterxml.jackson.databind.type.MapType mapType44 = com.fasterxml.jackson.databind.type.MapType.construct(strListClass16, (com.fasterxml.jackson.databind.JavaType) collectionLikeType26, (com.fasterxml.jackson.databind.JavaType) collectionLikeType34);
        // The following exception was thrown during execution in test generation
        try {
            shortSerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, (com.fasterxml.jackson.databind.JavaType) collectionLikeType34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortSerializer0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(toStringSerializer3);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(strListClass8);
        org.junit.Assert.assertNotNull(collectionLikeType9);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNotNull(toStringSerializer11);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNotNull(strListClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(javaType18);
        org.junit.Assert.assertNotNull(typeFactory19);
        org.junit.Assert.assertNotNull(toStringSerializer20);
        org.junit.Assert.assertNotNull(jsonNode23);
        org.junit.Assert.assertNotNull(strListClass25);
        org.junit.Assert.assertNotNull(collectionLikeType26);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(toStringSerializer28);
        org.junit.Assert.assertNotNull(jsonNode31);
        org.junit.Assert.assertNotNull(strListClass33);
        org.junit.Assert.assertNotNull(collectionLikeType34);
        org.junit.Assert.assertNull(wildcardClass35);
        org.junit.Assert.assertNotNull(toStringSerializer36);
        org.junit.Assert.assertNotNull(jsonNode39);
        org.junit.Assert.assertNotNull(strListClass41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(javaType43);
        org.junit.Assert.assertNotNull(mapType44);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer1 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        java.lang.reflect.Type type3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = toStringSerializer1.getSchema(serializerProvider2, type3);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer5 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer1);
        java.lang.Class<java.util.List<java.lang.String>> strListClass6 = indexedStringListSerializer5.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = typeFactory0.constructRawCollectionLikeType(strListClass6);
        java.lang.Class<?> wildcardClass8 = collectionLikeType7.getParameterSource();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer9 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        java.lang.reflect.Type type11 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = toStringSerializer9.getSchema(serializerProvider10, type11);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer13 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer9);
        java.lang.Class<java.util.List<java.lang.String>> strListClass14 = indexedStringListSerializer13.handledType();
        boolean boolean15 = com.fasterxml.jackson.databind.util.ClassUtil.isConcrete(strListClass14);
        com.fasterxml.jackson.databind.JavaType javaType16 = collectionLikeType7.narrowBy(strListClass14);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer18 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider19 = null;
        java.lang.reflect.Type type20 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode21 = toStringSerializer18.getSchema(serializerProvider19, type20);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer22 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer18);
        java.lang.Class<java.util.List<java.lang.String>> strListClass23 = indexedStringListSerializer22.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType24 = typeFactory17.constructRawCollectionLikeType(strListClass23);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer26 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider27 = null;
        java.lang.reflect.Type type28 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode29 = toStringSerializer26.getSchema(serializerProvider27, type28);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer30 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer26);
        java.lang.Class<java.util.List<java.lang.String>> strListClass31 = indexedStringListSerializer30.handledType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType32 = typeFactory25.constructRawCollectionLikeType(strListClass31);
        java.lang.Class<?> wildcardClass33 = collectionLikeType32.getParameterSource();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer34 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider35 = null;
        java.lang.reflect.Type type36 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode37 = toStringSerializer34.getSchema(serializerProvider35, type36);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer38 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer34);
        java.lang.Class<java.util.List<java.lang.String>> strListClass39 = indexedStringListSerializer38.handledType();
        boolean boolean40 = com.fasterxml.jackson.databind.util.ClassUtil.isConcrete(strListClass39);
        com.fasterxml.jackson.databind.JavaType javaType41 = collectionLikeType32.narrowBy(strListClass39);
        com.fasterxml.jackson.databind.type.MapType mapType42 = com.fasterxml.jackson.databind.type.MapType.construct(strListClass14, (com.fasterxml.jackson.databind.JavaType) collectionLikeType24, (com.fasterxml.jackson.databind.JavaType) collectionLikeType32);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType44 = collectionLikeType24.withContentTypeHandler((java.lang.Object) 8);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(toStringSerializer1);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strListClass6);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNotNull(toStringSerializer9);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNotNull(strListClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(javaType16);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNotNull(toStringSerializer18);
        org.junit.Assert.assertNotNull(jsonNode21);
        org.junit.Assert.assertNotNull(strListClass23);
        org.junit.Assert.assertNotNull(collectionLikeType24);
        org.junit.Assert.assertNotNull(typeFactory25);
        org.junit.Assert.assertNotNull(toStringSerializer26);
        org.junit.Assert.assertNotNull(jsonNode29);
        org.junit.Assert.assertNotNull(strListClass31);
        org.junit.Assert.assertNotNull(collectionLikeType32);
        org.junit.Assert.assertNull(wildcardClass33);
        org.junit.Assert.assertNotNull(toStringSerializer34);
        org.junit.Assert.assertNotNull(jsonNode37);
        org.junit.Assert.assertNotNull(strListClass39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(javaType41);
        org.junit.Assert.assertNotNull(mapType42);
        org.junit.Assert.assertNotNull(collectionLikeType44);
    }
}

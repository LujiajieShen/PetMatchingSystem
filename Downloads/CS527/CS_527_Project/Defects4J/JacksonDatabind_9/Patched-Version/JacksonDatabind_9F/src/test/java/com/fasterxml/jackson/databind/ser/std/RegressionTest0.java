package com.fasterxml.jackson.databind.ser.std;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature0 = com.fasterxml.jackson.databind.DeserializationFeature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE;
        org.junit.Assert.assertTrue("'" + deserializationFeature0 + "' != '" + com.fasterxml.jackson.databind.DeserializationFeature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE + "'", deserializationFeature0.equals(com.fasterxml.jackson.databind.DeserializationFeature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializer stdKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        java.lang.Throwable throwable2 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializer stdKeySerializer3 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
        // The following exception was thrown during execution in test generation
        try {
            stdKeySerializer0.wrapAndThrow(serializerProvider1, throwable2, (java.lang.Object) stdKeySerializer3, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializer stdKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        java.lang.Throwable throwable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            stdKeySerializer0.wrapAndThrow(serializerProvider1, throwable2, (java.lang.Object) true, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializer stdKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
        java.lang.Class<java.lang.Object> objClass1 = stdKeySerializer0.handledType();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator3 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            stdKeySerializer0.serializeWithType((java.lang.Object) "null", jsonGenerator3, serializerProvider4, typeSerializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Type id handling not implemented for type java.lang.Object");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objClass1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer0 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty1 = null;
        com.fasterxml.jackson.databind.ser.std.MapProperty mapProperty2 = new com.fasterxml.jackson.databind.ser.std.MapProperty(typeSerializer0, beanProperty1);
        java.lang.Object obj3 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializer stdKeySerializer4 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        java.lang.Object obj7 = null;
        boolean boolean8 = objJsonSerializer5.isEmpty(serializerProvider6, obj7);
        boolean boolean9 = objJsonSerializer5.isUnwrappingSerializer();
        mapProperty2.reset(obj3, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) stdKeySerializer4, objJsonSerializer5);
        com.fasterxml.jackson.databind.PropertyName propertyName11 = mapProperty2.getFullName();
        boolean boolean12 = propertyName11.isEmpty();
        org.junit.Assert.assertNotNull(objJsonSerializer5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(propertyName11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer0 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty1 = null;
        com.fasterxml.jackson.databind.ser.std.MapProperty mapProperty2 = new com.fasterxml.jackson.databind.ser.std.MapProperty(typeSerializer0, beanProperty1);
        java.lang.Object obj3 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializer stdKeySerializer4 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        java.lang.Object obj7 = null;
        boolean boolean8 = objJsonSerializer5.isEmpty(serializerProvider6, obj7);
        boolean boolean9 = objJsonSerializer5.isUnwrappingSerializer();
        mapProperty2.reset(obj3, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) stdKeySerializer4, objJsonSerializer5);
        com.fasterxml.jackson.databind.PropertyName propertyName11 = mapProperty2.getFullName();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator13 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider14 = null;
        // The following exception was thrown during execution in test generation
        try {
            mapProperty2.serializeAsField((java.lang.Object) 0.0d, jsonGenerator13, serializerProvider14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objJsonSerializer5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(propertyName11);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer0 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializer stdKeySerializer1 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
        com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer typeWrappedSerializer2 = new com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer(typeSerializer0, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) stdKeySerializer1);
        java.lang.Class<java.lang.Object> objClass3 = typeWrappedSerializer2.handledType();
        org.junit.Assert.assertNotNull(objClass3);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.fasterxml.jackson.databind.ser.impl.IteratorSerializer iteratorSerializer0 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer2 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializer stdKeySerializer3 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ser.impl.IteratorSerializer iteratorSerializer4 = new com.fasterxml.jackson.databind.ser.impl.IteratorSerializer(iteratorSerializer0, beanProperty1, typeSerializer2, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) stdKeySerializer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer0 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializer stdKeySerializer1 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
        com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer typeWrappedSerializer2 = new com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer(typeSerializer0, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) stdKeySerializer1);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer3 = typeWrappedSerializer2.typeSerializer();
        org.junit.Assert.assertNull(typeSerializer3);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        java.util.TimeZone timeZone0 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = stdDateFormat1.clone();
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer4 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty5 = null;
        com.fasterxml.jackson.databind.ser.std.MapProperty mapProperty6 = new com.fasterxml.jackson.databind.ser.std.MapProperty(typeSerializer4, beanProperty5);
        java.lang.Object obj7 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializer stdKeySerializer8 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        java.lang.Object obj11 = null;
        boolean boolean12 = objJsonSerializer9.isEmpty(serializerProvider10, obj11);
        boolean boolean13 = objJsonSerializer9.isUnwrappingSerializer();
        mapProperty6.reset(obj7, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) stdKeySerializer8, objJsonSerializer9);
        com.fasterxml.jackson.databind.ObjectWriter.Prefetch prefetch15 = com.fasterxml.jackson.databind.ObjectWriter.Prefetch.construct(javaType3, objJsonSerializer9);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap16 = null;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult serializerAndMapResult17 = new com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult(objJsonSerializer9, propertySerializerMap16);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator18 = stdDateFormat2.formatToCharacterIterator((java.lang.Object) objJsonSerializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat2);
        org.junit.Assert.assertNotNull(objJsonSerializer9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(prefetch15);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer0 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        boolean boolean1 = calendarSerializer0.isUnwrappingSerializer();
        java.util.TimeZone timeZone3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase<java.util.Calendar> calendarDateTimeSerializerBase5 = calendarSerializer0.withFormat((java.lang.Boolean) false, (java.text.DateFormat) stdDateFormat4);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper6 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker7 = objectMapper6.getVisibilityChecker();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer8 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.ser.std.MapProperty mapProperty10 = new com.fasterxml.jackson.databind.ser.std.MapProperty(typeSerializer8, beanProperty9);
        java.lang.Object obj11 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializer stdKeySerializer12 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer13 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider14 = null;
        java.lang.Object obj15 = null;
        boolean boolean16 = objJsonSerializer13.isEmpty(serializerProvider14, obj15);
        boolean boolean17 = objJsonSerializer13.isUnwrappingSerializer();
        mapProperty10.reset(obj11, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) stdKeySerializer12, objJsonSerializer13);
        com.fasterxml.jackson.databind.PropertyName propertyName19 = mapProperty10.getFullName();
        com.fasterxml.jackson.databind.PropertyName propertyName20 = mapProperty10.getFullName();
        byte[] byteArray21 = objectMapper6.writeValueAsBytes((java.lang.Object) propertyName20);
        java.lang.StringBuffer stringBuffer22 = null;
        java.text.FieldPosition fieldPosition23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer24 = stdDateFormat4.format((java.lang.Object) objectMapper6, stringBuffer22, fieldPosition23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(calendarDateTimeSerializerBase5);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker7);
        org.junit.Assert.assertNotNull(objJsonSerializer13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(propertyName19);
        org.junit.Assert.assertNotNull(propertyName20);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[123, 34, 110, 97, 109, 101, 115, 112, 97, 99, 101, 34, 58, 110, 117, 108, 108, 44, 34, 101, 109, 112, 116, 121, 34, 58, 102, 97, 108, 115, 101, 44, 34, 115, 105, 109, 112, 108, 101, 78, 97, 109, 101, 34, 58, 34, 110, 117, 108, 108, 34, 125]");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember0 = null;
        com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition simpleBeanPropertyDefinition2 = new com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition(annotatedMember0, "");
        boolean boolean3 = simpleBeanPropertyDefinition2.hasSetter();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer4 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty5 = null;
        com.fasterxml.jackson.databind.ser.std.MapProperty mapProperty6 = new com.fasterxml.jackson.databind.ser.std.MapProperty(typeSerializer4, beanProperty5);
        java.lang.Object obj7 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializer stdKeySerializer8 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        java.lang.Object obj11 = null;
        boolean boolean12 = objJsonSerializer9.isEmpty(serializerProvider10, obj11);
        boolean boolean13 = objJsonSerializer9.isUnwrappingSerializer();
        mapProperty6.reset(obj7, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) stdKeySerializer8, objJsonSerializer9);
        com.fasterxml.jackson.databind.PropertyName propertyName15 = mapProperty6.getFullName();
        com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition beanPropertyDefinition16 = simpleBeanPropertyDefinition2.withName(propertyName15);
        java.lang.String str17 = simpleBeanPropertyDefinition2.getName();
        com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo18 = simpleBeanPropertyDefinition2.findObjectIdInfo();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(propertyName15);
        org.junit.Assert.assertNotNull(beanPropertyDefinition16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(objectIdInfo18);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer0 = com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer.instance;
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        boolean boolean6 = indexedStringListSerializer0.isEmpty((java.util.List<java.lang.String>) strList4);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty referenceProperty9 = com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty.back("");
        java.lang.Class<?> wildcardClass10 = referenceProperty9.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = indexedStringListSerializer0.getSchema(serializerProvider7, (java.lang.reflect.Type) wildcardClass10);
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer13 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty14 = null;
        com.fasterxml.jackson.databind.ser.std.MapProperty mapProperty15 = new com.fasterxml.jackson.databind.ser.std.MapProperty(typeSerializer13, beanProperty14);
        java.lang.Object obj16 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializer stdKeySerializer17 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer18 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider19 = null;
        java.lang.Object obj20 = null;
        boolean boolean21 = objJsonSerializer18.isEmpty(serializerProvider19, obj20);
        boolean boolean22 = objJsonSerializer18.isUnwrappingSerializer();
        mapProperty15.reset(obj16, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) stdKeySerializer17, objJsonSerializer18);
        com.fasterxml.jackson.databind.ObjectWriter.Prefetch prefetch24 = com.fasterxml.jackson.databind.ObjectWriter.Prefetch.construct(javaType12, objJsonSerializer18);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap25 = null;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult serializerAndMapResult26 = new com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult(objJsonSerializer18, propertySerializerMap25);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<java.util.List<java.lang.String>> strListJsonSerializer27 = indexedStringListSerializer0.replaceDelegatee(objJsonSerializer18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexedStringListSerializer0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(referenceProperty9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertNotNull(objJsonSerializer18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(prefetch24);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer2 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty3 = null;
        com.fasterxml.jackson.databind.ser.std.MapProperty mapProperty4 = new com.fasterxml.jackson.databind.ser.std.MapProperty(typeSerializer2, beanProperty3);
        java.lang.Object obj5 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializer stdKeySerializer6 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        java.lang.Object obj9 = null;
        boolean boolean10 = objJsonSerializer7.isEmpty(serializerProvider8, obj9);
        boolean boolean11 = objJsonSerializer7.isUnwrappingSerializer();
        mapProperty4.reset(obj5, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) stdKeySerializer6, objJsonSerializer7);
        com.fasterxml.jackson.databind.ObjectWriter.Prefetch prefetch13 = com.fasterxml.jackson.databind.ObjectWriter.Prefetch.construct(javaType1, objJsonSerializer7);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap14 = null;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult serializerAndMapResult15 = new com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult(objJsonSerializer7, propertySerializerMap14);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer16 = intLikeSerializer0.replaceDelegatee(objJsonSerializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(prefetch13);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.ser.std.SqlDateSerializer sqlDateSerializer3 = new com.fasterxml.jackson.databind.ser.std.SqlDateSerializer((java.lang.Boolean) true);
        java.lang.Class<java.sql.Date> dateClass4 = sqlDateSerializer3.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = stringKeySerializer0.getSchema(serializerProvider1, (java.lang.reflect.Type) dateClass4);
        boolean boolean7 = stringKeySerializer0.isEmpty("");
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer8 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.ser.std.MapProperty mapProperty10 = new com.fasterxml.jackson.databind.ser.std.MapProperty(typeSerializer8, beanProperty9);
        java.lang.Object obj11 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializer stdKeySerializer12 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer13 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider14 = null;
        java.lang.Object obj15 = null;
        boolean boolean16 = objJsonSerializer13.isEmpty(serializerProvider14, obj15);
        boolean boolean17 = objJsonSerializer13.isUnwrappingSerializer();
        mapProperty10.reset(obj11, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) stdKeySerializer12, objJsonSerializer13);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.String> strJsonSerializer19 = stringKeySerializer0.replaceDelegatee(objJsonSerializer13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateClass4);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker1 = objectMapper0.getVisibilityChecker();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer2 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty3 = null;
        com.fasterxml.jackson.databind.ser.std.MapProperty mapProperty4 = new com.fasterxml.jackson.databind.ser.std.MapProperty(typeSerializer2, beanProperty3);
        java.lang.Object obj5 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializer stdKeySerializer6 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        java.lang.Object obj9 = null;
        boolean boolean10 = objJsonSerializer7.isEmpty(serializerProvider8, obj9);
        boolean boolean11 = objJsonSerializer7.isUnwrappingSerializer();
        mapProperty4.reset(obj5, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) stdKeySerializer6, objJsonSerializer7);
        com.fasterxml.jackson.databind.PropertyName propertyName13 = mapProperty4.getFullName();
        com.fasterxml.jackson.databind.PropertyName propertyName14 = mapProperty4.getFullName();
        byte[] byteArray15 = objectMapper0.writeValueAsBytes((java.lang.Object) propertyName14);
        com.fasterxml.jackson.databind.node.BinaryNode binaryNode16 = new com.fasterxml.jackson.databind.node.BinaryNode(byteArray15);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker1);
        org.junit.Assert.assertNotNull(objJsonSerializer7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(propertyName13);
        org.junit.Assert.assertNotNull(propertyName14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[123, 34, 110, 97, 109, 101, 115, 112, 97, 99, 101, 34, 58, 110, 117, 108, 108, 44, 34, 101, 109, 112, 116, 121, 34, 58, 102, 97, 108, 115, 101, 44, 34, 115, 105, 109, 112, 108, 101, 78, 97, 109, 101, 34, 58, 34, 110, 117, 108, 108, 34, 125]");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer1 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty2 = null;
        com.fasterxml.jackson.databind.ser.std.MapProperty mapProperty3 = new com.fasterxml.jackson.databind.ser.std.MapProperty(typeSerializer1, beanProperty2);
        java.lang.Object obj4 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializer stdKeySerializer5 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        java.lang.Object obj8 = null;
        boolean boolean9 = objJsonSerializer6.isEmpty(serializerProvider7, obj8);
        boolean boolean10 = objJsonSerializer6.isUnwrappingSerializer();
        mapProperty3.reset(obj4, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) stdKeySerializer5, objJsonSerializer6);
        com.fasterxml.jackson.databind.ObjectWriter.Prefetch prefetch12 = com.fasterxml.jackson.databind.ObjectWriter.Prefetch.construct(javaType0, objJsonSerializer6);
        boolean boolean13 = prefetch12.hasSerializer();
        boolean boolean14 = prefetch12.hasSerializer();
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(prefetch12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember0 = null;
        com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition simpleBeanPropertyDefinition2 = new com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition(annotatedMember0, "");
        boolean boolean3 = simpleBeanPropertyDefinition2.hasSetter();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer4 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty5 = null;
        com.fasterxml.jackson.databind.ser.std.MapProperty mapProperty6 = new com.fasterxml.jackson.databind.ser.std.MapProperty(typeSerializer4, beanProperty5);
        java.lang.Object obj7 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializer stdKeySerializer8 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        java.lang.Object obj11 = null;
        boolean boolean12 = objJsonSerializer9.isEmpty(serializerProvider10, obj11);
        boolean boolean13 = objJsonSerializer9.isUnwrappingSerializer();
        mapProperty6.reset(obj7, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) stdKeySerializer8, objJsonSerializer9);
        com.fasterxml.jackson.databind.PropertyName propertyName15 = mapProperty6.getFullName();
        com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition beanPropertyDefinition16 = simpleBeanPropertyDefinition2.withName(propertyName15);
        com.fasterxml.jackson.databind.PropertyName propertyName17 = propertyName15.internSimpleName();
        java.lang.String str18 = propertyName15.getNamespace();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(propertyName15);
        org.junit.Assert.assertNotNull(beanPropertyDefinition16);
        org.junit.Assert.assertNotNull(propertyName17);
        org.junit.Assert.assertNull(str18);
    }
}


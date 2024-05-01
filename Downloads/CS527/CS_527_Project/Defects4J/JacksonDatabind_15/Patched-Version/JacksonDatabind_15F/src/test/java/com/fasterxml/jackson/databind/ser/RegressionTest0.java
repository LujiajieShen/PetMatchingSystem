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
        com.fasterxml.jackson.databind.ser.std.DateSerializer dateSerializer0 = com.fasterxml.jackson.databind.ser.std.DateSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        java.lang.reflect.Type type2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode4 = dateSerializer0.getSchema(serializerProvider1, type2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'provider' passed for java.util.Date");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateSerializer0);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.util.Collection<java.util.Map.Entry<java.lang.Class<?>, java.lang.Object>> wildcardClassEntryCollection0 = com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.all();
        org.junit.Assert.assertNotNull(wildcardClassEntryCollection0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer0 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        java.lang.Throwable throwable3 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException4 = new com.fasterxml.jackson.databind.JsonMappingException("hi!", throwable3);
        // The following exception was thrown during execution in test generation
        try {
            toStringSerializer0.wrapAndThrow(serializerProvider1, throwable3, (java.lang.Object) 8, 0);
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
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer0 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        java.lang.Throwable throwable3 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException4 = new com.fasterxml.jackson.databind.JsonMappingException("hi!", throwable3);
        // The following exception was thrown during execution in test generation
        try {
            toStringSerializer0.wrapAndThrow(serializerProvider1, throwable3, (java.lang.Object) 0L, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringSerializer0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass0 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer1 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass2 = calendarSerializer1.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer4 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass5 = calendarSerializer4.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember6 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass0, calendarClass2, "", calendarClass5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = com.fasterxml.jackson.databind.util.ClassUtil.wrapperType(calendarClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Class java.util.Calendar is not a primitive type");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendarClass2);
        org.junit.Assert.assertNotNull(calendarClass5);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass0 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer1 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass2 = calendarSerializer1.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer4 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass5 = calendarSerializer4.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember6 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass0, calendarClass2, "", calendarClass5);
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass5);
        java.lang.Class<java.util.Calendar> calendarClass8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType9 = simpleType7.forcedNarrowBy(calendarClass8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendarClass2);
        org.junit.Assert.assertNotNull(calendarClass5);
        org.junit.Assert.assertNotNull(simpleType7);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass0 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer1 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass2 = calendarSerializer1.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer4 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass5 = calendarSerializer4.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember6 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass0, calendarClass2, "", calendarClass5);
        java.lang.reflect.Member member7 = virtualAnnotatedMember6.getMember();
        org.junit.Assert.assertNotNull(calendarClass2);
        org.junit.Assert.assertNotNull(calendarClass5);
        org.junit.Assert.assertNull(member7);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass0 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer1 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass2 = calendarSerializer1.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer4 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass5 = calendarSerializer4.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember6 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass0, calendarClass2, "", calendarClass5);
        java.lang.Class<?> wildcardClass7 = virtualAnnotatedMember6.getRawType();
        com.fasterxml.jackson.databind.node.LongNode longNode9 = new com.fasterxml.jackson.databind.node.LongNode((long) (-1));
        long long10 = longNode9.longValue();
        // The following exception was thrown during execution in test generation
        try {
            virtualAnnotatedMember6.setValue((java.lang.Object) longNode9, (java.lang.Object) 17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not set virtual property ''");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendarClass2);
        org.junit.Assert.assertNotNull(calendarClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.fasterxml.jackson.databind.ser.std.JsonValueSerializer jsonValueSerializer0 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer2 = null;
        com.fasterxml.jackson.databind.ser.std.DateSerializer dateSerializer3 = com.fasterxml.jackson.databind.ser.std.DateSerializer.instance;
        java.text.DateFormat dateFormat5 = null;
        com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase<java.util.Date> dateDateTimeSerializerBase6 = dateSerializer3.withFormat((java.lang.Boolean) true, dateFormat5);
        com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer typeWrappedSerializer7 = new com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer(typeSerializer2, (com.fasterxml.jackson.databind.JsonSerializer<java.util.Date>) dateSerializer3);
        boolean boolean8 = dateSerializer3.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = dateSerializer3.createSchemaNode("");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ser.std.JsonValueSerializer jsonValueSerializer12 = new com.fasterxml.jackson.databind.ser.std.JsonValueSerializer(jsonValueSerializer0, beanProperty1, (com.fasterxml.jackson.databind.JsonSerializer<java.util.Date>) dateSerializer3, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateSerializer3);
        org.junit.Assert.assertNotNull(dateDateTimeSerializerBase6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objectNode10);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer0 = null;
        com.fasterxml.jackson.databind.ser.std.DateSerializer dateSerializer1 = com.fasterxml.jackson.databind.ser.std.DateSerializer.instance;
        java.text.DateFormat dateFormat3 = null;
        com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase<java.util.Date> dateDateTimeSerializerBase4 = dateSerializer1.withFormat((java.lang.Boolean) true, dateFormat3);
        com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer typeWrappedSerializer5 = new com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer(typeSerializer0, (com.fasterxml.jackson.databind.JsonSerializer<java.util.Date>) dateSerializer1);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper6 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass7 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer8 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass9 = calendarSerializer8.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer11 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass12 = calendarSerializer11.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember13 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass7, calendarClass9, "", calendarClass12);
        com.fasterxml.jackson.databind.type.SimpleType simpleType14 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass12);
        // The following exception was thrown during execution in test generation
        try {
            dateSerializer1.acceptJsonFormatVisitor(jsonFormatVisitorWrapper6, (com.fasterxml.jackson.databind.JavaType) simpleType14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateSerializer1);
        org.junit.Assert.assertNotNull(dateDateTimeSerializerBase4);
        org.junit.Assert.assertNotNull(calendarClass9);
        org.junit.Assert.assertNotNull(calendarClass12);
        org.junit.Assert.assertNotNull(simpleType14);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember0 = null;
        com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition simpleBeanPropertyDefinition2 = new com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition(annotatedMember0, "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod3 = simpleBeanPropertyDefinition2.getSetter();
        java.lang.String str4 = simpleBeanPropertyDefinition2.getInternalName();
        com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition beanPropertyDefinition6 = simpleBeanPropertyDefinition2.withName("hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass7 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer8 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass9 = calendarSerializer8.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer11 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass12 = calendarSerializer11.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember13 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass7, calendarClass9, "", calendarClass12);
        com.fasterxml.jackson.databind.type.SimpleType simpleType14 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass12);
        boolean boolean15 = simpleType14.isPrimitive();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer16 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations17 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.impl.SetterlessProperty setterlessProperty19 = new com.fasterxml.jackson.databind.deser.impl.SetterlessProperty((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition) simpleBeanPropertyDefinition2, (com.fasterxml.jackson.databind.JavaType) simpleType14, typeDeserializer16, annotations17, annotatedMethod18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedMethod3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(beanPropertyDefinition6);
        org.junit.Assert.assertNotNull(calendarClass9);
        org.junit.Assert.assertNotNull(calendarClass12);
        org.junit.Assert.assertNotNull(simpleType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.fasterxml.jackson.databind.ser.impl.StringArraySerializer stringArraySerializer0 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer2 = null;
        com.fasterxml.jackson.databind.ser.std.DateSerializer dateSerializer3 = com.fasterxml.jackson.databind.ser.std.DateSerializer.instance;
        java.text.DateFormat dateFormat5 = null;
        com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase<java.util.Date> dateDateTimeSerializerBase6 = dateSerializer3.withFormat((java.lang.Boolean) true, dateFormat5);
        com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer typeWrappedSerializer7 = new com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer(typeSerializer2, (com.fasterxml.jackson.databind.JsonSerializer<java.util.Date>) dateSerializer3);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ser.impl.StringArraySerializer stringArraySerializer8 = new com.fasterxml.jackson.databind.ser.impl.StringArraySerializer(stringArraySerializer0, beanProperty1, (com.fasterxml.jackson.databind.JsonSerializer<java.util.Date>) dateSerializer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateSerializer3);
        org.junit.Assert.assertNotNull(dateDateTimeSerializerBase6);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.fasterxml.jackson.databind.ser.std.BeanSerializerBase beanSerializerBase0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer beanAsArraySerializer1 = new com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer(beanSerializerBase0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer0 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.util.Calendar calendar1 = null;
        boolean boolean2 = calendarSerializer0.isEmpty(calendar1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer0 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass1 = calendarSerializer0.handledType();
        boolean boolean2 = calendarSerializer0.usesObjectId();
        org.junit.Assert.assertNotNull(calendarClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition simpleBeanPropertyDefinition3 = new com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition(annotatedMember1, "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod4 = simpleBeanPropertyDefinition3.getSetter();
        java.lang.String str5 = simpleBeanPropertyDefinition3.getInternalName();
        com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition beanPropertyDefinition7 = simpleBeanPropertyDefinition3.withName("hi!");
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer8 = null;
        com.fasterxml.jackson.databind.ser.std.DateSerializer dateSerializer9 = com.fasterxml.jackson.databind.ser.std.DateSerializer.instance;
        java.text.DateFormat dateFormat11 = null;
        com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase<java.util.Date> dateDateTimeSerializerBase12 = dateSerializer9.withFormat((java.lang.Boolean) true, dateFormat11);
        com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer typeWrappedSerializer13 = new com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer(typeSerializer8, (com.fasterxml.jackson.databind.JsonSerializer<java.util.Date>) dateSerializer9);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode15 = dateSerializer9.createSchemaNode("");
        com.fasterxml.jackson.databind.node.ValueNode valueNode17 = objectNode15.numberNode((java.lang.Byte) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.SerializerProvider serializerProvider18 = impl0.setAttribute((java.lang.Object) beanPropertyDefinition7, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedMethod4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(beanPropertyDefinition7);
        org.junit.Assert.assertNotNull(dateSerializer9);
        org.junit.Assert.assertNotNull(dateDateTimeSerializerBase12);
        org.junit.Assert.assertNotNull(objectNode15);
        org.junit.Assert.assertNotNull(valueNode17);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass0 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer1 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass2 = calendarSerializer1.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer4 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass5 = calendarSerializer4.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember6 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass0, calendarClass2, "", calendarClass5);
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass5);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = null;
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass10 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer11 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass12 = calendarSerializer11.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer14 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass15 = calendarSerializer14.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember16 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass10, calendarClass12, "", calendarClass15);
        com.fasterxml.jackson.databind.type.SimpleType simpleType17 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass15);
        boolean boolean18 = simpleType17.isPrimitive();
        boolean boolean19 = simpleType17.isContainerType();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass20 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer21 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass22 = calendarSerializer21.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer24 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass25 = calendarSerializer24.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember26 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass20, calendarClass22, "", calendarClass25);
        com.fasterxml.jackson.databind.JavaType javaType27 = impl9.constructSpecializedType((com.fasterxml.jackson.databind.JavaType) simpleType17, calendarClass22);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer28 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleType7.serializeWithType(jsonGenerator8, (com.fasterxml.jackson.databind.SerializerProvider) impl9, typeSerializer28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendarClass2);
        org.junit.Assert.assertNotNull(calendarClass5);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(calendarClass12);
        org.junit.Assert.assertNotNull(calendarClass15);
        org.junit.Assert.assertNotNull(simpleType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(calendarClass22);
        org.junit.Assert.assertNotNull(calendarClass25);
        org.junit.Assert.assertNotNull(javaType27);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer2 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec1);
        com.fasterxml.jackson.databind.node.LongNode longNode4 = new com.fasterxml.jackson.databind.node.LongNode((long) (-1));
        double double5 = longNode4.asDouble();
        boolean boolean6 = longNode4.isBoolean();
        java.lang.Number number7 = longNode4.numberValue();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass8 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer9 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass10 = calendarSerializer9.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer12 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass13 = calendarSerializer12.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass8, calendarClass10, "", calendarClass13);
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass13);
        boolean boolean16 = simpleType15.isPrimitive();
        boolean boolean17 = simpleType15.isContainerType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType19 = simpleType15.withTypeHandler((java.lang.Object) "hi!");
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer20 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        // The following exception was thrown during execution in test generation
        try {
            impl0.serializeValue((com.fasterxml.jackson.core.JsonGenerator) tokenBuffer2, (java.lang.Object) number7, (com.fasterxml.jackson.databind.JavaType) simpleType15, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer20);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.JsonMappingException; message: Incompatible types: declared root type ([simple type, class java.util.Calendar]) vs java.lang.Long");
        } catch (com.fasterxml.jackson.databind.JsonMappingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (-1L) + "'", number7, (-1L));
        org.junit.Assert.assertNotNull(calendarClass10);
        org.junit.Assert.assertNotNull(calendarClass13);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(simpleType19);
        org.junit.Assert.assertNotNull(toStringSerializer20);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass1 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer2 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass3 = calendarSerializer2.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer5 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass6 = calendarSerializer5.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass1, calendarClass3, "", calendarClass6);
        com.fasterxml.jackson.databind.type.SimpleType simpleType8 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass6);
        boolean boolean9 = simpleType8.isPrimitive();
        boolean boolean10 = simpleType8.isContainerType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = simpleType8.withTypeHandler((java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType13 = impl0.constructType((java.lang.reflect.Type) simpleType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendarClass3);
        org.junit.Assert.assertNotNull(calendarClass6);
        org.junit.Assert.assertNotNull(simpleType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(simpleType12);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass0 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer1 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass2 = calendarSerializer1.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer4 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass5 = calendarSerializer4.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember6 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass0, calendarClass2, "", calendarClass5);
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = com.fasterxml.jackson.databind.util.ClassUtil.wrapperType(calendarClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Class java.util.Calendar is not a primitive type");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendarClass2);
        org.junit.Assert.assertNotNull(calendarClass5);
        org.junit.Assert.assertNotNull(simpleType7);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass1 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer2 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass3 = calendarSerializer2.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer5 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass6 = calendarSerializer5.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass1, calendarClass3, "", calendarClass6);
        com.fasterxml.jackson.databind.type.SimpleType simpleType8 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass6);
        boolean boolean9 = simpleType8.isPrimitive();
        boolean boolean10 = simpleType8.isContainerType();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass11 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer12 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass13 = calendarSerializer12.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer15 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass16 = calendarSerializer15.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass11, calendarClass13, "", calendarClass16);
        com.fasterxml.jackson.databind.JavaType javaType18 = impl0.constructSpecializedType((com.fasterxml.jackson.databind.JavaType) simpleType8, calendarClass13);
        com.fasterxml.jackson.databind.node.BooleanNode booleanNode20 = com.fasterxml.jackson.databind.node.BooleanNode.TRUE;
        com.fasterxml.jackson.core.JsonToken jsonToken21 = booleanNode20.asToken();
        short short22 = booleanNode20.shortValue();
        java.lang.Object[] objArray24 = new java.lang.Object[] { booleanNode20, 17 };
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException25 = impl0.mappingException("hi!", objArray24);
        com.fasterxml.jackson.databind.SerializationFeature serializationFeature26 = com.fasterxml.jackson.databind.SerializationFeature.EAGER_SERIALIZER_FETCH;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = impl0.isEnabled(serializationFeature26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendarClass3);
        org.junit.Assert.assertNotNull(calendarClass6);
        org.junit.Assert.assertNotNull(simpleType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(calendarClass13);
        org.junit.Assert.assertNotNull(calendarClass16);
        org.junit.Assert.assertNotNull(javaType18);
        org.junit.Assert.assertNotNull(booleanNode20);
        org.junit.Assert.assertTrue("'" + jsonToken21 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken21.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 0 + "'", short22 == (short) 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[true, 17]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[true, 17]");
        org.junit.Assert.assertNotNull(jsonMappingException25);
        org.junit.Assert.assertTrue("'" + serializationFeature26 + "' != '" + com.fasterxml.jackson.databind.SerializationFeature.EAGER_SERIALIZER_FETCH + "'", serializationFeature26.equals(com.fasterxml.jackson.databind.SerializationFeature.EAGER_SERIALIZER_FETCH));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer0 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap1 = null;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult serializerAndMapResult2 = new com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer0, propertySerializerMap1);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        toStringSerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper3, javaType4);
        boolean boolean6 = toStringSerializer0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer7 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer9 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec8);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass11 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer12 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass13 = calendarSerializer12.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer15 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass16 = calendarSerializer15.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass11, calendarClass13, "", calendarClass16);
        com.fasterxml.jackson.databind.type.SimpleType simpleType18 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass16);
        boolean boolean19 = simpleType18.isPrimitive();
        boolean boolean20 = simpleType18.isContainerType();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass21 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer22 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass23 = calendarSerializer22.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer25 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass26 = calendarSerializer25.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember27 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass21, calendarClass23, "", calendarClass26);
        com.fasterxml.jackson.databind.JavaType javaType28 = impl10.constructSpecializedType((com.fasterxml.jackson.databind.JavaType) simpleType18, calendarClass23);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer29 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringSerializer0.serializeWithType((java.lang.Object) toStringSerializer7, (com.fasterxml.jackson.core.JsonGenerator) tokenBuffer9, (com.fasterxml.jackson.databind.SerializerProvider) impl10, typeSerializer29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringSerializer0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(toStringSerializer7);
        org.junit.Assert.assertNotNull(calendarClass13);
        org.junit.Assert.assertNotNull(calendarClass16);
        org.junit.Assert.assertNotNull(simpleType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(calendarClass23);
        org.junit.Assert.assertNotNull(calendarClass26);
        org.junit.Assert.assertNotNull(javaType28);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty referenceProperty1 = com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty.back("hi!");
        com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty.Type type2 = referenceProperty1.getType();
        org.junit.Assert.assertNotNull(referenceProperty1);
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty.Type.BACK_REFERENCE + "'", type2.equals(com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty.Type.BACK_REFERENCE));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.fasterxml.jackson.databind.node.FloatNode floatNode1 = com.fasterxml.jackson.databind.node.FloatNode.valueOf((float) 100);
        float float2 = floatNode1.floatValue();
        org.junit.Assert.assertNotNull(floatNode1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition beanPropertyDefinition0 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass1 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer2 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass3 = calendarSerializer2.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer5 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass6 = calendarSerializer5.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass1, calendarClass3, "", calendarClass6);
        com.fasterxml.jackson.databind.type.SimpleType simpleType8 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass6);
        boolean boolean9 = simpleType8.isPrimitive();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations11 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedField annotatedField12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.impl.FieldProperty fieldProperty13 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(beanPropertyDefinition0, (com.fasterxml.jackson.databind.JavaType) simpleType8, typeDeserializer10, annotations11, annotatedField12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendarClass3);
        org.junit.Assert.assertNotNull(calendarClass6);
        org.junit.Assert.assertNotNull(simpleType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.fasterxml.jackson.databind.node.BooleanNode booleanNode0 = com.fasterxml.jackson.databind.node.BooleanNode.getFalse();
        boolean boolean2 = booleanNode0.equals((java.lang.Object) 100L);
        java.lang.Number number3 = booleanNode0.numberValue();
        org.junit.Assert.assertNotNull(booleanNode0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(number3);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer0 = null;
        com.fasterxml.jackson.databind.ser.std.DateSerializer dateSerializer1 = com.fasterxml.jackson.databind.ser.std.DateSerializer.instance;
        java.text.DateFormat dateFormat3 = null;
        com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase<java.util.Date> dateDateTimeSerializerBase4 = dateSerializer1.withFormat((java.lang.Boolean) true, dateFormat3);
        com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer typeWrappedSerializer5 = new com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer(typeSerializer0, (com.fasterxml.jackson.databind.JsonSerializer<java.util.Date>) dateSerializer1);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = dateSerializer1.createSchemaNode("");
        com.fasterxml.jackson.databind.node.ValueNode valueNode9 = objectNode7.numberNode((short) 0);
        org.junit.Assert.assertNotNull(dateSerializer1);
        org.junit.Assert.assertNotNull(dateDateTimeSerializerBase4);
        org.junit.Assert.assertNotNull(objectNode7);
        org.junit.Assert.assertNotNull(valueNode9);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer0 = null;
        com.fasterxml.jackson.databind.ser.std.DateSerializer dateSerializer1 = com.fasterxml.jackson.databind.ser.std.DateSerializer.instance;
        java.text.DateFormat dateFormat3 = null;
        com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase<java.util.Date> dateDateTimeSerializerBase4 = dateSerializer1.withFormat((java.lang.Boolean) true, dateFormat3);
        com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer typeWrappedSerializer5 = new com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer(typeSerializer0, (com.fasterxml.jackson.databind.JsonSerializer<java.util.Date>) dateSerializer1);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember6 = null;
        com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition simpleBeanPropertyDefinition8 = new com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition(annotatedMember6, "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod9 = simpleBeanPropertyDefinition8.getSetter();
        java.lang.String str10 = simpleBeanPropertyDefinition8.getInternalName();
        com.fasterxml.jackson.databind.MappingJsonFactory mappingJsonFactory11 = new com.fasterxml.jackson.databind.MappingJsonFactory();
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes12 = mappingJsonFactory11.getCharacterEscapes();
        java.io.OutputStream outputStream13 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator14 = mappingJsonFactory11.createGenerator(outputStream13);
        com.fasterxml.jackson.databind.ser.std.SerializableSerializer serializableSerializer15 = new com.fasterxml.jackson.databind.ser.std.SerializableSerializer();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass17 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer18 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass19 = calendarSerializer18.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer21 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass22 = calendarSerializer21.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember23 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass17, calendarClass19, "", calendarClass22);
        com.fasterxml.jackson.databind.type.SimpleType simpleType24 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass22);
        boolean boolean25 = simpleType24.isPrimitive();
        boolean boolean26 = simpleType24.isContainerType();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass27 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer28 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass29 = calendarSerializer28.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer31 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass32 = calendarSerializer31.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember33 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass27, calendarClass29, "", calendarClass32);
        com.fasterxml.jackson.databind.JavaType javaType34 = impl16.constructSpecializedType((com.fasterxml.jackson.databind.JavaType) simpleType24, calendarClass29);
        com.fasterxml.jackson.databind.node.BooleanNode booleanNode36 = com.fasterxml.jackson.databind.node.BooleanNode.TRUE;
        com.fasterxml.jackson.core.JsonToken jsonToken37 = booleanNode36.asToken();
        short short38 = booleanNode36.shortValue();
        java.lang.Object[] objArray40 = new java.lang.Object[] { booleanNode36, 17 };
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException41 = impl16.mappingException("hi!", objArray40);
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer42 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass43 = calendarSerializer42.handledType();
        java.lang.Class<?> wildcardClass44 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) calendarClass43);
        com.fasterxml.jackson.databind.JsonNode jsonNode46 = serializableSerializer15.getSchema((com.fasterxml.jackson.databind.SerializerProvider) impl16, (java.lang.reflect.Type) calendarClass43, false);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer47 = null;
        // The following exception was thrown during execution in test generation
        try {
            typeWrappedSerializer5.serializeWithType((java.lang.Object) simpleBeanPropertyDefinition8, jsonGenerator14, (com.fasterxml.jackson.databind.SerializerProvider) impl16, typeSerializer47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateSerializer1);
        org.junit.Assert.assertNotNull(dateDateTimeSerializerBase4);
        org.junit.Assert.assertNull(annotatedMethod9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(characterEscapes12);
        org.junit.Assert.assertNotNull(jsonGenerator14);
        org.junit.Assert.assertNotNull(calendarClass19);
        org.junit.Assert.assertNotNull(calendarClass22);
        org.junit.Assert.assertNotNull(simpleType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(calendarClass29);
        org.junit.Assert.assertNotNull(calendarClass32);
        org.junit.Assert.assertNotNull(javaType34);
        org.junit.Assert.assertNotNull(booleanNode36);
        org.junit.Assert.assertTrue("'" + jsonToken37 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken37.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + short38 + "' != '" + (short) 0 + "'", short38 == (short) 0);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[true, 17]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[true, 17]");
        org.junit.Assert.assertNotNull(jsonMappingException41);
        org.junit.Assert.assertNotNull(calendarClass43);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(jsonNode46);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer0 = null;
        com.fasterxml.jackson.databind.ser.std.DateSerializer dateSerializer1 = com.fasterxml.jackson.databind.ser.std.DateSerializer.instance;
        java.text.DateFormat dateFormat3 = null;
        com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase<java.util.Date> dateDateTimeSerializerBase4 = dateSerializer1.withFormat((java.lang.Boolean) true, dateFormat3);
        com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer typeWrappedSerializer5 = new com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer(typeSerializer0, (com.fasterxml.jackson.databind.JsonSerializer<java.util.Date>) dateSerializer1);
        boolean boolean6 = dateSerializer1.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass8 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer9 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass10 = calendarSerializer9.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer12 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass13 = calendarSerializer12.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass8, calendarClass10, "", calendarClass13);
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass13);
        boolean boolean16 = simpleType15.isPrimitive();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode17 = dateSerializer1.getSchema((com.fasterxml.jackson.databind.SerializerProvider) impl7, (java.lang.reflect.Type) simpleType15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateSerializer1);
        org.junit.Assert.assertNotNull(dateDateTimeSerializerBase4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(calendarClass10);
        org.junit.Assert.assertNotNull(calendarClass13);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass0 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer1 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass2 = calendarSerializer1.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer4 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass5 = calendarSerializer4.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember6 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass0, calendarClass2, "", calendarClass5);
        int int7 = virtualAnnotatedMember6.getAnnotationCount();
        java.lang.Iterable<java.lang.annotation.Annotation> annotationIterable8 = virtualAnnotatedMember6.annotations();
        org.junit.Assert.assertNotNull(calendarClass2);
        org.junit.Assert.assertNotNull(calendarClass5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(annotationIterable8);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer4 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = collectionDeserializer4.getContentDeserializer();
        java.lang.Class<?> wildcardClass6 = collectionDeserializer4.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = collectionDeserializer4.getObjectIdReader();
        com.fasterxml.jackson.databind.node.LongNode longNode9 = new com.fasterxml.jackson.databind.node.LongNode((long) (-1));
        double double10 = longNode9.asDouble();
        boolean boolean11 = longNode9.isBoolean();
        com.fasterxml.jackson.databind.node.TreeTraversingParser treeTraversingParser12 = new com.fasterxml.jackson.databind.node.TreeTraversingParser((com.fasterxml.jackson.databind.JsonNode) longNode9);
        int int13 = treeTraversingParser12.getTextOffset();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = collectionDeserializer4.deserializeWithType((com.fasterxml.jackson.core.JsonParser) treeTraversingParser12, deserializationContext14, typeDeserializer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.fasterxml.jackson.databind.MappingJsonFactory mappingJsonFactory0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes1 = mappingJsonFactory0.getCharacterEscapes();
        java.lang.String str2 = mappingJsonFactory0.getRootValueSeparator();
        org.junit.Assert.assertNull(characterEscapes1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector0, annotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass3 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer4 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass5 = calendarSerializer4.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer7 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass8 = calendarSerializer7.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember9 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass3, calendarClass5, "", calendarClass8);
        int int10 = virtualAnnotatedMember9.getAnnotationCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = annotationIntrospector2.findKeySerializer((com.fasterxml.jackson.databind.introspect.Annotated) virtualAnnotatedMember9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(calendarClass5);
        org.junit.Assert.assertNotNull(calendarClass8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember0 = null;
        com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition simpleBeanPropertyDefinition2 = new com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition(annotatedMember0, "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod3 = simpleBeanPropertyDefinition2.getSetter();
        java.lang.String str4 = simpleBeanPropertyDefinition2.getInternalName();
        com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition beanPropertyDefinition6 = simpleBeanPropertyDefinition2.withName("hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = simpleBeanPropertyDefinition2.getPrimaryMember();
        org.junit.Assert.assertNull(annotatedMethod3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(beanPropertyDefinition6);
        org.junit.Assert.assertNull(annotatedMember7);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer0 = null;
        com.fasterxml.jackson.databind.ser.std.DateSerializer dateSerializer1 = com.fasterxml.jackson.databind.ser.std.DateSerializer.instance;
        java.text.DateFormat dateFormat3 = null;
        com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase<java.util.Date> dateDateTimeSerializerBase4 = dateSerializer1.withFormat((java.lang.Boolean) true, dateFormat3);
        com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer typeWrappedSerializer5 = new com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer(typeSerializer0, (com.fasterxml.jackson.databind.JsonSerializer<java.util.Date>) dateSerializer1);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = dateSerializer1.createSchemaNode("");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = objectNode7.put("hi!", 0.0f);
        com.fasterxml.jackson.databind.node.NumericNode numericNode12 = objectNode10.numberNode((long) 10);
        org.junit.Assert.assertNotNull(dateSerializer1);
        org.junit.Assert.assertNotNull(dateDateTimeSerializerBase4);
        org.junit.Assert.assertNotNull(objectNode7);
        org.junit.Assert.assertNotNull(objectNode10);
        org.junit.Assert.assertNotNull(numericNode12);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.fasterxml.jackson.databind.deser.Deserializers.Base base0 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
        com.fasterxml.jackson.databind.type.MapType mapType1 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig2 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription3 = null;
        com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer4 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer5 = null;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer6 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = stringArrayDeserializer6.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = base0.findMapDeserializer(mapType1, deserializationConfig2, beanDescription3, keyDeserializer4, typeDeserializer5, (com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer6);
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer9 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass10 = calendarSerializer9.handledType();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig11 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = base0.findEnumDeserializer(calendarClass10, deserializationConfig11, beanDescription12);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass14 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer15 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass16 = calendarSerializer15.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer18 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass19 = calendarSerializer18.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember20 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass14, calendarClass16, "", calendarClass19);
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass19);
        boolean boolean22 = simpleType21.isPrimitive();
        boolean boolean23 = simpleType21.isContainerType();
        java.lang.String str24 = simpleType21.toCanonical();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig25 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription26 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer27 = base0.findBeanDeserializer((com.fasterxml.jackson.databind.JavaType) simpleType21, deserializationConfig25, beanDescription26);
        org.junit.Assert.assertNotNull(stringArrayDeserializer6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertNotNull(calendarClass10);
        org.junit.Assert.assertNull(wildcardJsonDeserializer13);
        org.junit.Assert.assertNotNull(calendarClass16);
        org.junit.Assert.assertNotNull(calendarClass19);
        org.junit.Assert.assertNotNull(simpleType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "java.util.Calendar" + "'", str24, "java.util.Calendar");
        org.junit.Assert.assertNull(wildcardJsonDeserializer27);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer0 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass1 = calendarSerializer0.handledType();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = calendarSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.ser.std.SerializableSerializer serializableSerializer3 = new com.fasterxml.jackson.databind.ser.std.SerializableSerializer();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass5 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer6 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass7 = calendarSerializer6.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer9 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass10 = calendarSerializer9.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember11 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass5, calendarClass7, "", calendarClass10);
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass10);
        boolean boolean13 = simpleType12.isPrimitive();
        boolean boolean14 = simpleType12.isContainerType();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass15 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer16 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass17 = calendarSerializer16.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer19 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass20 = calendarSerializer19.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember21 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass15, calendarClass17, "", calendarClass20);
        com.fasterxml.jackson.databind.JavaType javaType22 = impl4.constructSpecializedType((com.fasterxml.jackson.databind.JavaType) simpleType12, calendarClass17);
        com.fasterxml.jackson.databind.node.BooleanNode booleanNode24 = com.fasterxml.jackson.databind.node.BooleanNode.TRUE;
        com.fasterxml.jackson.core.JsonToken jsonToken25 = booleanNode24.asToken();
        short short26 = booleanNode24.shortValue();
        java.lang.Object[] objArray28 = new java.lang.Object[] { booleanNode24, 17 };
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException29 = impl4.mappingException("hi!", objArray28);
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer30 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass31 = calendarSerializer30.handledType();
        java.lang.Class<?> wildcardClass32 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) calendarClass31);
        com.fasterxml.jackson.databind.JsonNode jsonNode34 = serializableSerializer3.getSchema((com.fasterxml.jackson.databind.SerializerProvider) impl4, (java.lang.reflect.Type) calendarClass31, false);
        com.fasterxml.jackson.core.JsonLocation jsonLocation36 = null;
        java.lang.Throwable throwable39 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException40 = new com.fasterxml.jackson.databind.JsonMappingException("hi!", throwable39);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException41 = new com.fasterxml.jackson.databind.JsonMappingException("", throwable39);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException42 = new com.fasterxml.jackson.databind.JsonMappingException("hi!", jsonLocation36, (java.lang.Throwable) jsonMappingException41);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer43 = com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer.instance;
        // The following exception was thrown during execution in test generation
        try {
            calendarSerializer0.wrapAndThrow((com.fasterxml.jackson.databind.SerializerProvider) impl4, (java.lang.Throwable) jsonMappingException41, (java.lang.Object) indexedStringListSerializer43, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendarClass1);
        org.junit.Assert.assertNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(calendarClass7);
        org.junit.Assert.assertNotNull(calendarClass10);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(calendarClass17);
        org.junit.Assert.assertNotNull(calendarClass20);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(booleanNode24);
        org.junit.Assert.assertTrue("'" + jsonToken25 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken25.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) 0 + "'", short26 == (short) 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[true, 17]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[true, 17]");
        org.junit.Assert.assertNotNull(jsonMappingException29);
        org.junit.Assert.assertNotNull(calendarClass31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(jsonNode34);
        org.junit.Assert.assertNotNull(indexedStringListSerializer43);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0, strMap1);
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode2.get(10);
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = objectNode2.get(1);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectNode2.removeAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertNull(jsonNode6);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer0 = null;
        com.fasterxml.jackson.databind.ser.std.DateSerializer dateSerializer1 = com.fasterxml.jackson.databind.ser.std.DateSerializer.instance;
        java.text.DateFormat dateFormat3 = null;
        com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase<java.util.Date> dateDateTimeSerializerBase4 = dateSerializer1.withFormat((java.lang.Boolean) true, dateFormat3);
        com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer typeWrappedSerializer5 = new com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer(typeSerializer0, (com.fasterxml.jackson.databind.JsonSerializer<java.util.Date>) dateSerializer1);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = dateSerializer1.createSchemaNode("");
        com.fasterxml.jackson.databind.node.ValueNode valueNode9 = objectNode7.numberNode((java.lang.Float) 10.0f);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory12 = new com.fasterxml.jackson.databind.node.JsonNodeFactory(false);
        com.fasterxml.jackson.databind.node.NumericNode numericNode14 = jsonNodeFactory12.numberNode(0.0f);
        com.fasterxml.jackson.databind.node.NumericNode numericNode16 = jsonNodeFactory12.numberNode((long) (short) 100);
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = objectNode7.set("hi!", (com.fasterxml.jackson.databind.JsonNode) numericNode16);
        org.junit.Assert.assertNotNull(dateSerializer1);
        org.junit.Assert.assertNotNull(dateDateTimeSerializerBase4);
        org.junit.Assert.assertNotNull(objectNode7);
        org.junit.Assert.assertNotNull(valueNode9);
        org.junit.Assert.assertNotNull(numericNode14);
        org.junit.Assert.assertNotNull(numericNode16);
        org.junit.Assert.assertNotNull(jsonNode17);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0, strMap1);
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode2.get(10);
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = objectNode2.get(1);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = jsonNode6.intValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertNull(jsonNode6);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer indexedListSerializer0 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass2 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer3 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass4 = calendarSerializer3.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer6 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass7 = calendarSerializer6.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember8 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass2, calendarClass4, "", calendarClass7);
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass7);
        boolean boolean10 = simpleType9.isPrimitive();
        boolean boolean11 = simpleType9.isContainerType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType13 = simpleType9.withTypeHandler((java.lang.Object) "hi!");
        com.fasterxml.jackson.databind.PropertyName propertyName14 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer15 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations16 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter17 = null;
        com.fasterxml.jackson.databind.ser.std.DateSerializer dateSerializer19 = com.fasterxml.jackson.databind.ser.std.DateSerializer.instance;
        java.text.DateFormat dateFormat21 = null;
        com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase<java.util.Date> dateDateTimeSerializerBase22 = dateSerializer19.withFormat((java.lang.Boolean) true, dateFormat21);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode23 = dateDateTimeSerializerBase22.createObjectNode();
        java.math.BigInteger bigInteger24 = null;
        com.fasterxml.jackson.databind.node.NumericNode numericNode25 = objectNode23.numberNode(bigInteger24);
        com.fasterxml.jackson.databind.deser.CreatorProperty creatorProperty27 = new com.fasterxml.jackson.databind.deser.CreatorProperty("JSON", (com.fasterxml.jackson.databind.JavaType) simpleType9, propertyName14, typeDeserializer15, annotations16, annotatedParameter17, (int) (byte) -1, (java.lang.Object) numericNode25, true);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer28 = null;
        com.fasterxml.jackson.databind.ser.std.DateSerializer dateSerializer29 = com.fasterxml.jackson.databind.ser.std.DateSerializer.instance;
        java.text.DateFormat dateFormat31 = null;
        com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase<java.util.Date> dateDateTimeSerializerBase32 = dateSerializer29.withFormat((java.lang.Boolean) true, dateFormat31);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer33 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.util.Date> dateJsonSerializer34 = dateDateTimeSerializerBase32.unwrappingSerializer(nameTransformer33);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer indexedListSerializer35 = new com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer(indexedListSerializer0, (com.fasterxml.jackson.databind.BeanProperty) creatorProperty27, typeSerializer28, (com.fasterxml.jackson.databind.JsonSerializer<java.util.Date>) dateDateTimeSerializerBase32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendarClass4);
        org.junit.Assert.assertNotNull(calendarClass7);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(simpleType13);
        org.junit.Assert.assertNotNull(dateSerializer19);
        org.junit.Assert.assertNotNull(dateDateTimeSerializerBase22);
        org.junit.Assert.assertNotNull(objectNode23);
        org.junit.Assert.assertNotNull(numericNode25);
        org.junit.Assert.assertNotNull(dateSerializer29);
        org.junit.Assert.assertNotNull(dateDateTimeSerializerBase32);
        org.junit.Assert.assertNotNull(dateJsonSerializer34);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
        boolean boolean1 = floatSerializer0.usesObjectId();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.fasterxml.jackson.databind.node.LongNode longNode1 = new com.fasterxml.jackson.databind.node.LongNode((long) (-1));
        double double2 = longNode1.asDouble();
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference3 = new com.fasterxml.jackson.databind.JsonMappingException.Reference((java.lang.Object) longNode1);
        long long5 = longNode1.asLong((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.fasterxml.jackson.databind.ser.std.DateSerializer dateSerializer0 = com.fasterxml.jackson.databind.ser.std.DateSerializer.instance;
        java.text.DateFormat dateFormat2 = null;
        com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase<java.util.Date> dateDateTimeSerializerBase3 = dateSerializer0.withFormat((java.lang.Boolean) true, dateFormat2);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = dateDateTimeSerializerBase3.createObjectNode();
        com.fasterxml.jackson.databind.node.BooleanNode booleanNode5 = com.fasterxml.jackson.databind.node.BooleanNode.getFalse();
        boolean boolean7 = booleanNode5.equals((java.lang.Object) 100L);
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = booleanNode5.get((int) 'a');
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        java.util.List<java.lang.String> strList15 = booleanNode5.findValuesAsText("", (java.util.List<java.lang.String>) strList13);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode16 = objectNode4.remove((java.util.Collection<java.lang.String>) strList15);
        org.junit.Assert.assertNotNull(dateSerializer0);
        org.junit.Assert.assertNotNull(dateDateTimeSerializerBase3);
        org.junit.Assert.assertNotNull(objectNode4);
        org.junit.Assert.assertNotNull(booleanNode5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonNode9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(objectNode16);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer0 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap1 = null;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult serializerAndMapResult2 = new com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer0, propertySerializerMap1);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        toStringSerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper3, javaType4);
        boolean boolean6 = toStringSerializer0.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass7 = toStringSerializer0.handledType();
        org.junit.Assert.assertNotNull(toStringSerializer0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objClass7);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector0, annotationIntrospector1);
        com.fasterxml.jackson.databind.ser.std.SerializableSerializer serializableSerializer3 = new com.fasterxml.jackson.databind.ser.std.SerializableSerializer();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass5 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer6 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass7 = calendarSerializer6.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer9 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass10 = calendarSerializer9.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember11 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass5, calendarClass7, "", calendarClass10);
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass10);
        boolean boolean13 = simpleType12.isPrimitive();
        boolean boolean14 = simpleType12.isContainerType();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass15 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer16 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass17 = calendarSerializer16.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer19 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass20 = calendarSerializer19.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember21 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass15, calendarClass17, "", calendarClass20);
        com.fasterxml.jackson.databind.JavaType javaType22 = impl4.constructSpecializedType((com.fasterxml.jackson.databind.JavaType) simpleType12, calendarClass17);
        com.fasterxml.jackson.databind.node.BooleanNode booleanNode24 = com.fasterxml.jackson.databind.node.BooleanNode.TRUE;
        com.fasterxml.jackson.core.JsonToken jsonToken25 = booleanNode24.asToken();
        short short26 = booleanNode24.shortValue();
        java.lang.Object[] objArray28 = new java.lang.Object[] { booleanNode24, 17 };
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException29 = impl4.mappingException("hi!", objArray28);
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer30 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass31 = calendarSerializer30.handledType();
        java.lang.Class<?> wildcardClass32 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) calendarClass31);
        com.fasterxml.jackson.databind.JsonNode jsonNode34 = serializableSerializer3.getSchema((com.fasterxml.jackson.databind.SerializerProvider) impl4, (java.lang.reflect.Type) calendarClass31, false);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector35 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector36 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector37 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector35, annotationIntrospector36);
        com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver mixInResolver38 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass39 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(calendarClass31, annotationIntrospector35, mixInResolver38);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.fasterxml.jackson.databind.jsontype.NamedType> namedTypeList40 = annotationIntrospector2.findSubtypes((com.fasterxml.jackson.databind.introspect.Annotated) annotatedClass39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(calendarClass7);
        org.junit.Assert.assertNotNull(calendarClass10);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(calendarClass17);
        org.junit.Assert.assertNotNull(calendarClass20);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(booleanNode24);
        org.junit.Assert.assertTrue("'" + jsonToken25 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken25.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) 0 + "'", short26 == (short) 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[true, 17]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[true, 17]");
        org.junit.Assert.assertNotNull(jsonMappingException29);
        org.junit.Assert.assertNotNull(calendarClass31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(jsonNode34);
        org.junit.Assert.assertNotNull(annotationIntrospector37);
        org.junit.Assert.assertNotNull(annotatedClass39);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer0 = null;
        com.fasterxml.jackson.databind.ser.std.DateSerializer dateSerializer1 = com.fasterxml.jackson.databind.ser.std.DateSerializer.instance;
        java.text.DateFormat dateFormat3 = null;
        com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase<java.util.Date> dateDateTimeSerializerBase4 = dateSerializer1.withFormat((java.lang.Boolean) true, dateFormat3);
        com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer typeWrappedSerializer5 = new com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer(typeSerializer0, (com.fasterxml.jackson.databind.JsonSerializer<java.util.Date>) dateSerializer1);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = dateSerializer1.createSchemaNode("");
        com.fasterxml.jackson.databind.node.ValueNode valueNode9 = objectNode7.numberNode((java.lang.Byte) (byte) 10);
        boolean boolean10 = valueNode9.isLong();
        org.junit.Assert.assertNotNull(dateSerializer1);
        org.junit.Assert.assertNotNull(dateDateTimeSerializerBase4);
        org.junit.Assert.assertNotNull(objectNode7);
        org.junit.Assert.assertNotNull(valueNode9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer0 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass1 = calendarSerializer0.handledType();
        java.util.Calendar calendar2 = null;
        long long3 = calendarSerializer0._timestamp(calendar2);
        org.junit.Assert.assertNotNull(calendarClass1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass0 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer1 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass2 = calendarSerializer1.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer4 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass5 = calendarSerializer4.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember6 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass0, calendarClass2, "", calendarClass5);
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer7 = new com.fasterxml.jackson.databind.ser.std.ToStringSerializer(calendarClass5);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std std8 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec9 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer10 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec9);
        java.lang.Object[] objArray11 = new java.lang.Object[] { std8, objectCodec9 };
        java.util.ArrayList<java.lang.Object> objList12 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList12, objArray11);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.CollectionReferringAccumulator collectionReferringAccumulator14 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.CollectionReferringAccumulator(calendarClass5, (java.util.Collection<java.lang.Object>) objList12);
        com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicBooleanSerializer atomicBooleanSerializer16 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicBooleanSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer17 = atomicBooleanSerializer16.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            collectionReferringAccumulator14.resolveForwardReference((java.lang.Object) 'a', (java.lang.Object) wildcardJsonSerializer17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Trying to resolve a forward reference with id [a] that wasn't previously seen as unresolved.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendarClass2);
        org.junit.Assert.assertNotNull(calendarClass5);
        org.junit.Assert.assertNotNull(std8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[[Visibility: getter: PUBLIC_ONLY, isGetter: PUBLIC_ONLY, setter: ANY, creator: ANY, field: PUBLIC_ONLY], null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[[Visibility: getter: PUBLIC_ONLY, isGetter: PUBLIC_ONLY, setter: ANY, creator: ANY, field: PUBLIC_ONLY], null]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(wildcardJsonSerializer17);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass1 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer2 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass3 = calendarSerializer2.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer5 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass6 = calendarSerializer5.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass1, calendarClass3, "", calendarClass6);
        com.fasterxml.jackson.databind.type.SimpleType simpleType8 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass6);
        boolean boolean9 = simpleType8.isPrimitive();
        boolean boolean10 = simpleType8.isContainerType();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass11 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer12 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass13 = calendarSerializer12.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer15 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass16 = calendarSerializer15.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass11, calendarClass13, "", calendarClass16);
        com.fasterxml.jackson.databind.JavaType javaType18 = impl0.constructSpecializedType((com.fasterxml.jackson.databind.JavaType) simpleType8, calendarClass13);
        com.fasterxml.jackson.databind.node.BooleanNode booleanNode20 = com.fasterxml.jackson.databind.node.BooleanNode.TRUE;
        com.fasterxml.jackson.core.JsonToken jsonToken21 = booleanNode20.asToken();
        short short22 = booleanNode20.shortValue();
        java.lang.Object[] objArray24 = new java.lang.Object[] { booleanNode20, 17 };
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException25 = impl0.mappingException("hi!", objArray24);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ser.FilterProvider filterProvider26 = impl0.getFilterProvider();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendarClass3);
        org.junit.Assert.assertNotNull(calendarClass6);
        org.junit.Assert.assertNotNull(simpleType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(calendarClass13);
        org.junit.Assert.assertNotNull(calendarClass16);
        org.junit.Assert.assertNotNull(javaType18);
        org.junit.Assert.assertNotNull(booleanNode20);
        org.junit.Assert.assertTrue("'" + jsonToken21 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken21.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 0 + "'", short22 == (short) 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[true, 17]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[true, 17]");
        org.junit.Assert.assertNotNull(jsonMappingException25);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass1 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer2 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass3 = calendarSerializer2.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer5 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass6 = calendarSerializer5.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass1, calendarClass3, "", calendarClass6);
        com.fasterxml.jackson.databind.type.SimpleType simpleType8 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass6);
        boolean boolean9 = simpleType8.isPrimitive();
        boolean boolean10 = simpleType8.isContainerType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = simpleType8.withTypeHandler((java.lang.Object) "hi!");
        com.fasterxml.jackson.databind.PropertyName propertyName13 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer14 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations15 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter16 = null;
        com.fasterxml.jackson.databind.ser.std.DateSerializer dateSerializer18 = com.fasterxml.jackson.databind.ser.std.DateSerializer.instance;
        java.text.DateFormat dateFormat20 = null;
        com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase<java.util.Date> dateDateTimeSerializerBase21 = dateSerializer18.withFormat((java.lang.Boolean) true, dateFormat20);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode22 = dateDateTimeSerializerBase21.createObjectNode();
        java.math.BigInteger bigInteger23 = null;
        com.fasterxml.jackson.databind.node.NumericNode numericNode24 = objectNode22.numberNode(bigInteger23);
        com.fasterxml.jackson.databind.deser.CreatorProperty creatorProperty26 = new com.fasterxml.jackson.databind.deser.CreatorProperty("JSON", (com.fasterxml.jackson.databind.JavaType) simpleType8, propertyName13, typeDeserializer14, annotations15, annotatedParameter16, (int) (byte) -1, (java.lang.Object) numericNode24, true);
        com.fasterxml.jackson.databind.node.LongNode longNode28 = new com.fasterxml.jackson.databind.node.LongNode((long) (-1));
        double double29 = longNode28.asDouble();
        boolean boolean30 = longNode28.isBoolean();
        com.fasterxml.jackson.databind.node.TreeTraversingParser treeTraversingParser31 = new com.fasterxml.jackson.databind.node.TreeTraversingParser((com.fasterxml.jackson.databind.JsonNode) longNode28);
        int int32 = treeTraversingParser31.getTextOffset();
        float float33 = treeTraversingParser31.getFloatValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext34 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass35 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer36 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass37 = calendarSerializer36.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer39 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass40 = calendarSerializer39.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember41 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass35, calendarClass37, "", calendarClass40);
        int int42 = virtualAnnotatedMember41.getAnnotationCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj43 = creatorProperty26.deserializeSetAndReturn((com.fasterxml.jackson.core.JsonParser) treeTraversingParser31, deserializationContext34, (java.lang.Object) virtualAnnotatedMember41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendarClass3);
        org.junit.Assert.assertNotNull(calendarClass6);
        org.junit.Assert.assertNotNull(simpleType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(dateSerializer18);
        org.junit.Assert.assertNotNull(dateDateTimeSerializerBase21);
        org.junit.Assert.assertNotNull(objectNode22);
        org.junit.Assert.assertNotNull(numericNode24);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1.0d) + "'", double29 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + (-1.0f) + "'", float33 == (-1.0f));
        org.junit.Assert.assertNotNull(calendarClass37);
        org.junit.Assert.assertNotNull(calendarClass40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember0 = null;
        com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition simpleBeanPropertyDefinition2 = new com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition(annotatedMember0, "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod3 = simpleBeanPropertyDefinition2.getSetter();
        com.fasterxml.jackson.databind.ser.impl.StringArraySerializer stringArraySerializer4 = com.fasterxml.jackson.databind.ser.impl.StringArraySerializer.instance;
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass6 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer7 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass8 = calendarSerializer7.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer10 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass11 = calendarSerializer10.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember12 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass6, calendarClass8, "", calendarClass11);
        com.fasterxml.jackson.databind.type.SimpleType simpleType13 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass11);
        boolean boolean14 = simpleType13.isPrimitive();
        boolean boolean15 = simpleType13.isContainerType();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass16 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer17 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass18 = calendarSerializer17.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer20 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass21 = calendarSerializer20.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember22 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass16, calendarClass18, "", calendarClass21);
        com.fasterxml.jackson.databind.JavaType javaType23 = impl5.constructSpecializedType((com.fasterxml.jackson.databind.JavaType) simpleType13, calendarClass18);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass24 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer25 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass26 = calendarSerializer25.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer28 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass29 = calendarSerializer28.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember30 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass24, calendarClass26, "", calendarClass29);
        com.fasterxml.jackson.databind.type.SimpleType simpleType31 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass29);
        com.fasterxml.jackson.databind.JsonNode jsonNode33 = stringArraySerializer4.getSchema((com.fasterxml.jackson.databind.SerializerProvider) impl5, (java.lang.reflect.Type) simpleType31, false);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer34 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations35 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedField annotatedField36 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.impl.FieldProperty fieldProperty37 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition) simpleBeanPropertyDefinition2, (com.fasterxml.jackson.databind.JavaType) simpleType31, typeDeserializer34, annotations35, annotatedField36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedMethod3);
        org.junit.Assert.assertNotNull(stringArraySerializer4);
        org.junit.Assert.assertNotNull(calendarClass8);
        org.junit.Assert.assertNotNull(calendarClass11);
        org.junit.Assert.assertNotNull(simpleType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(calendarClass18);
        org.junit.Assert.assertNotNull(calendarClass21);
        org.junit.Assert.assertNotNull(javaType23);
        org.junit.Assert.assertNotNull(calendarClass26);
        org.junit.Assert.assertNotNull(calendarClass29);
        org.junit.Assert.assertNotNull(simpleType31);
        org.junit.Assert.assertNotNull(jsonNode33);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.fasterxml.jackson.databind.ser.std.SerializableSerializer serializableSerializer0 = new com.fasterxml.jackson.databind.ser.std.SerializableSerializer();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass2 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer3 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass4 = calendarSerializer3.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer6 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass7 = calendarSerializer6.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember8 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass2, calendarClass4, "", calendarClass7);
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass7);
        boolean boolean10 = simpleType9.isPrimitive();
        boolean boolean11 = simpleType9.isContainerType();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass12 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer13 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass14 = calendarSerializer13.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer16 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass17 = calendarSerializer16.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember18 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass12, calendarClass14, "", calendarClass17);
        com.fasterxml.jackson.databind.JavaType javaType19 = impl1.constructSpecializedType((com.fasterxml.jackson.databind.JavaType) simpleType9, calendarClass14);
        com.fasterxml.jackson.databind.node.BooleanNode booleanNode21 = com.fasterxml.jackson.databind.node.BooleanNode.TRUE;
        com.fasterxml.jackson.core.JsonToken jsonToken22 = booleanNode21.asToken();
        short short23 = booleanNode21.shortValue();
        java.lang.Object[] objArray25 = new java.lang.Object[] { booleanNode21, 17 };
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException26 = impl1.mappingException("hi!", objArray25);
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer27 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass28 = calendarSerializer27.handledType();
        java.lang.Class<?> wildcardClass29 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) calendarClass28);
        com.fasterxml.jackson.databind.JsonNode jsonNode31 = serializableSerializer0.getSchema((com.fasterxml.jackson.databind.SerializerProvider) impl1, (java.lang.reflect.Type) calendarClass28, false);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector32 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector33 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector34 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector32, annotationIntrospector33);
        com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver mixInResolver35 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass36 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(calendarClass28, annotationIntrospector32, mixInResolver35);
        com.fasterxml.jackson.databind.introspect.AnnotatedConstructor annotatedConstructor37 = annotatedClass36.getDefaultConstructor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = annotatedConstructor37.call();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalAccessException; message: Class com.fasterxml.jackson.databind.introspect.AnnotatedConstructor can not access a member of class java.util.Calendar with modifiers \"protected\"");
        } catch (java.lang.IllegalAccessException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendarClass4);
        org.junit.Assert.assertNotNull(calendarClass7);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(calendarClass14);
        org.junit.Assert.assertNotNull(calendarClass17);
        org.junit.Assert.assertNotNull(javaType19);
        org.junit.Assert.assertNotNull(booleanNode21);
        org.junit.Assert.assertTrue("'" + jsonToken22 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken22.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 0 + "'", short23 == (short) 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[true, 17]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[true, 17]");
        org.junit.Assert.assertNotNull(jsonMappingException26);
        org.junit.Assert.assertNotNull(calendarClass28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(jsonNode31);
        org.junit.Assert.assertNotNull(annotationIntrospector34);
        org.junit.Assert.assertNotNull(annotatedClass36);
        org.junit.Assert.assertNotNull(annotatedConstructor37);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass1 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer2 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass3 = calendarSerializer2.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer5 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass6 = calendarSerializer5.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass1, calendarClass3, "", calendarClass6);
        com.fasterxml.jackson.databind.type.SimpleType simpleType8 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass6);
        boolean boolean9 = simpleType8.isPrimitive();
        boolean boolean10 = simpleType8.isContainerType();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass11 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer12 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass13 = calendarSerializer12.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer15 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass16 = calendarSerializer15.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass11, calendarClass13, "", calendarClass16);
        com.fasterxml.jackson.databind.JavaType javaType18 = impl0.constructSpecializedType((com.fasterxml.jackson.databind.JavaType) simpleType8, calendarClass13);
        com.fasterxml.jackson.databind.node.BooleanNode booleanNode20 = com.fasterxml.jackson.databind.node.BooleanNode.TRUE;
        com.fasterxml.jackson.core.JsonToken jsonToken21 = booleanNode20.asToken();
        short short22 = booleanNode20.shortValue();
        java.lang.Object[] objArray24 = new java.lang.Object[] { booleanNode20, 17 };
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException25 = impl0.mappingException("hi!", objArray24);
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig26 = null;
        com.fasterxml.jackson.databind.ser.SerializerFactory serializerFactory27 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl28 = impl0.createInstance(serializationConfig26, serializerFactory27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendarClass3);
        org.junit.Assert.assertNotNull(calendarClass6);
        org.junit.Assert.assertNotNull(simpleType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(calendarClass13);
        org.junit.Assert.assertNotNull(calendarClass16);
        org.junit.Assert.assertNotNull(javaType18);
        org.junit.Assert.assertNotNull(booleanNode20);
        org.junit.Assert.assertTrue("'" + jsonToken21 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken21.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 0 + "'", short22 == (short) 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[true, 17]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[true, 17]");
        org.junit.Assert.assertNotNull(jsonMappingException25);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector0, annotationIntrospector1);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector3 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector4 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector5 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector3, annotationIntrospector4);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector6 = com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.create(annotationIntrospector1, annotationIntrospector5);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass7 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer8 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass9 = calendarSerializer8.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer11 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass12 = calendarSerializer11.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember13 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass7, calendarClass9, "", calendarClass12);
        int int14 = virtualAnnotatedMember13.getAnnotationCount();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.NameTransformer nameTransformer15 = annotationIntrospector5.findUnwrappingNameTransformer((com.fasterxml.jackson.databind.introspect.AnnotatedMember) virtualAnnotatedMember13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(annotationIntrospector5);
        org.junit.Assert.assertNotNull(annotationIntrospector6);
        org.junit.Assert.assertNotNull(calendarClass9);
        org.junit.Assert.assertNotNull(calendarClass12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass0 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer1 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass2 = calendarSerializer1.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer4 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass5 = calendarSerializer4.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember6 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass0, calendarClass2, "", calendarClass5);
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass5);
        boolean boolean8 = simpleType7.isPrimitive();
        boolean boolean9 = simpleType7.isContainerType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType11 = simpleType7.withTypeHandler((java.lang.Object) "hi!");
        boolean boolean12 = simpleType11.hasGenericTypes();
        org.junit.Assert.assertNotNull(calendarClass2);
        org.junit.Assert.assertNotNull(calendarClass5);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(simpleType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator3 = tokenBuffer1.setCodec(objectCodec2);
        com.fasterxml.jackson.databind.node.FloatNode floatNode5 = com.fasterxml.jackson.databind.node.FloatNode.valueOf((float) 100L);
        java.math.BigInteger bigInteger6 = floatNode5.bigIntegerValue();
        tokenBuffer1.writeNumber(bigInteger6);
        org.junit.Assert.assertNotNull(jsonGenerator3);
        org.junit.Assert.assertNotNull(floatNode5);
        org.junit.Assert.assertNotNull(bigInteger6);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass0 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer1 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass2 = calendarSerializer1.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer4 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass5 = calendarSerializer4.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember6 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass0, calendarClass2, "", calendarClass5);
        int int7 = virtualAnnotatedMember6.getAnnotationCount();
        com.fasterxml.jackson.databind.introspect.AnnotationMap annotationMap8 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = virtualAnnotatedMember6.withAnnotations(annotationMap8);
        org.junit.Assert.assertNotNull(calendarClass2);
        org.junit.Assert.assertNotNull(calendarClass5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(annotated9);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer.instance;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer3 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator5 = tokenBuffer3.setCodec(objectCodec4);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer7 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec6);
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator9 = tokenBuffer7.setCodec(objectCodec8);
        tokenBuffer3.serialize(jsonGenerator9);
        com.fasterxml.jackson.databind.ser.impl.StringArraySerializer stringArraySerializer11 = com.fasterxml.jackson.databind.ser.impl.StringArraySerializer.instance;
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass13 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer14 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass15 = calendarSerializer14.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer17 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass18 = calendarSerializer17.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember19 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass13, calendarClass15, "", calendarClass18);
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass18);
        boolean boolean21 = simpleType20.isPrimitive();
        boolean boolean22 = simpleType20.isContainerType();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass23 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer24 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass25 = calendarSerializer24.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer27 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass28 = calendarSerializer27.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember29 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass23, calendarClass25, "", calendarClass28);
        com.fasterxml.jackson.databind.JavaType javaType30 = impl12.constructSpecializedType((com.fasterxml.jackson.databind.JavaType) simpleType20, calendarClass25);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass31 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer32 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass33 = calendarSerializer32.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer35 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass36 = calendarSerializer35.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember37 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass31, calendarClass33, "", calendarClass36);
        com.fasterxml.jackson.databind.type.SimpleType simpleType38 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass36);
        com.fasterxml.jackson.databind.JsonNode jsonNode40 = stringArraySerializer11.getSchema((com.fasterxml.jackson.databind.SerializerProvider) impl12, (java.lang.reflect.Type) simpleType38, false);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer41 = null;
        // The following exception was thrown during execution in test generation
        try {
            shortSerializer0.serializeWithType((java.lang.Short) (short) 10, jsonGenerator9, (com.fasterxml.jackson.databind.SerializerProvider) impl12, typeSerializer41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortSerializer0);
        org.junit.Assert.assertNotNull(jsonGenerator5);
        org.junit.Assert.assertNotNull(jsonGenerator9);
        org.junit.Assert.assertNotNull(stringArraySerializer11);
        org.junit.Assert.assertNotNull(calendarClass15);
        org.junit.Assert.assertNotNull(calendarClass18);
        org.junit.Assert.assertNotNull(simpleType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(calendarClass25);
        org.junit.Assert.assertNotNull(calendarClass28);
        org.junit.Assert.assertNotNull(javaType30);
        org.junit.Assert.assertNotNull(calendarClass33);
        org.junit.Assert.assertNotNull(calendarClass36);
        org.junit.Assert.assertNotNull(simpleType38);
        org.junit.Assert.assertNotNull(jsonNode40);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass1 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer2 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass3 = calendarSerializer2.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer5 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass6 = calendarSerializer5.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass1, calendarClass3, "", calendarClass6);
        com.fasterxml.jackson.databind.type.SimpleType simpleType8 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass6);
        boolean boolean9 = simpleType8.isPrimitive();
        boolean boolean10 = simpleType8.isContainerType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = simpleType8.withTypeHandler((java.lang.Object) "hi!");
        com.fasterxml.jackson.databind.PropertyName propertyName13 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer14 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations15 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter16 = null;
        com.fasterxml.jackson.databind.ser.std.DateSerializer dateSerializer18 = com.fasterxml.jackson.databind.ser.std.DateSerializer.instance;
        java.text.DateFormat dateFormat20 = null;
        com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase<java.util.Date> dateDateTimeSerializerBase21 = dateSerializer18.withFormat((java.lang.Boolean) true, dateFormat20);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode22 = dateDateTimeSerializerBase21.createObjectNode();
        java.math.BigInteger bigInteger23 = null;
        com.fasterxml.jackson.databind.node.NumericNode numericNode24 = objectNode22.numberNode(bigInteger23);
        com.fasterxml.jackson.databind.deser.CreatorProperty creatorProperty26 = new com.fasterxml.jackson.databind.deser.CreatorProperty("JSON", (com.fasterxml.jackson.databind.JavaType) simpleType8, propertyName13, typeDeserializer14, annotations15, annotatedParameter16, (int) (byte) -1, (java.lang.Object) numericNode24, true);
        com.fasterxml.jackson.databind.node.LongNode longNode28 = new com.fasterxml.jackson.databind.node.LongNode((long) (-1));
        double double29 = longNode28.asDouble();
        boolean boolean30 = longNode28.isBoolean();
        com.fasterxml.jackson.databind.node.TreeTraversingParser treeTraversingParser31 = new com.fasterxml.jackson.databind.node.TreeTraversingParser((com.fasterxml.jackson.databind.JsonNode) longNode28);
        int int32 = treeTraversingParser31.getTextOffset();
        float float33 = treeTraversingParser31.getFloatValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext34 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer35 = null;
        com.fasterxml.jackson.databind.ser.std.DateSerializer dateSerializer36 = com.fasterxml.jackson.databind.ser.std.DateSerializer.instance;
        java.text.DateFormat dateFormat38 = null;
        com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase<java.util.Date> dateDateTimeSerializerBase39 = dateSerializer36.withFormat((java.lang.Boolean) true, dateFormat38);
        com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer typeWrappedSerializer40 = new com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer(typeSerializer35, (com.fasterxml.jackson.databind.JsonSerializer<java.util.Date>) dateSerializer36);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode42 = dateSerializer36.createSchemaNode("");
        com.fasterxml.jackson.databind.node.ValueNode valueNode44 = objectNode42.numberNode((java.lang.Byte) (byte) 10);
        com.fasterxml.jackson.core.JsonToken jsonToken45 = valueNode44.asToken();
        // The following exception was thrown during execution in test generation
        try {
            creatorProperty26.deserializeAndSet((com.fasterxml.jackson.core.JsonParser) treeTraversingParser31, deserializationContext34, (java.lang.Object) valueNode44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendarClass3);
        org.junit.Assert.assertNotNull(calendarClass6);
        org.junit.Assert.assertNotNull(simpleType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(dateSerializer18);
        org.junit.Assert.assertNotNull(dateDateTimeSerializerBase21);
        org.junit.Assert.assertNotNull(objectNode22);
        org.junit.Assert.assertNotNull(numericNode24);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1.0d) + "'", double29 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + (-1.0f) + "'", float33 == (-1.0f));
        org.junit.Assert.assertNotNull(dateSerializer36);
        org.junit.Assert.assertNotNull(dateDateTimeSerializerBase39);
        org.junit.Assert.assertNotNull(objectNode42);
        org.junit.Assert.assertNotNull(valueNode44);
        org.junit.Assert.assertTrue("'" + jsonToken45 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT + "'", jsonToken45.equals(com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass0 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer1 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass2 = calendarSerializer1.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer4 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass5 = calendarSerializer4.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember6 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass0, calendarClass2, "", calendarClass5);
        com.fasterxml.jackson.annotation.JsonFormat.Value value7 = null;
        java.lang.Boolean boolean9 = com.fasterxml.jackson.databind.ser.std.EnumSerializer._isShapeWrittenUsingIndex(calendarClass5, value7, false);
        org.junit.Assert.assertNotNull(calendarClass2);
        org.junit.Assert.assertNotNull(calendarClass5);
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.fasterxml.jackson.databind.JavaType javaType0 = com.fasterxml.jackson.databind.ser.std.MapSerializer.UNSPECIFIED_TYPE;
        com.fasterxml.jackson.databind.ser.std.SerializableSerializer serializableSerializer1 = new com.fasterxml.jackson.databind.ser.std.SerializableSerializer();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass3 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer4 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass5 = calendarSerializer4.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer7 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass8 = calendarSerializer7.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember9 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass3, calendarClass5, "", calendarClass8);
        com.fasterxml.jackson.databind.type.SimpleType simpleType10 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass8);
        boolean boolean11 = simpleType10.isPrimitive();
        boolean boolean12 = simpleType10.isContainerType();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass13 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer14 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass15 = calendarSerializer14.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer17 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass18 = calendarSerializer17.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember19 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass13, calendarClass15, "", calendarClass18);
        com.fasterxml.jackson.databind.JavaType javaType20 = impl2.constructSpecializedType((com.fasterxml.jackson.databind.JavaType) simpleType10, calendarClass15);
        com.fasterxml.jackson.databind.node.BooleanNode booleanNode22 = com.fasterxml.jackson.databind.node.BooleanNode.TRUE;
        com.fasterxml.jackson.core.JsonToken jsonToken23 = booleanNode22.asToken();
        short short24 = booleanNode22.shortValue();
        java.lang.Object[] objArray26 = new java.lang.Object[] { booleanNode22, 17 };
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException27 = impl2.mappingException("hi!", objArray26);
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer28 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass29 = calendarSerializer28.handledType();
        java.lang.Class<?> wildcardClass30 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) calendarClass29);
        com.fasterxml.jackson.databind.JsonNode jsonNode32 = serializableSerializer1.getSchema((com.fasterxml.jackson.databind.SerializerProvider) impl2, (java.lang.reflect.Type) calendarClass29, false);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector33 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector34 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector35 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector33, annotationIntrospector34);
        com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver mixInResolver36 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass37 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(calendarClass29, annotationIntrospector33, mixInResolver36);
        com.fasterxml.jackson.databind.deser.Deserializers.Base base38 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
        com.fasterxml.jackson.databind.type.MapType mapType39 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig40 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription41 = null;
        com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer42 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer43 = null;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer44 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer45 = stringArrayDeserializer44.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer46 = base38.findMapDeserializer(mapType39, deserializationConfig40, beanDescription41, keyDeserializer42, typeDeserializer43, (com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer44);
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer47 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass48 = calendarSerializer47.handledType();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig49 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription50 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer51 = base38.findEnumDeserializer(calendarClass48, deserializationConfig49, beanDescription50);
        java.lang.Class<java.util.Calendar> calendarClass53 = null;
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember54 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass37, calendarClass48, "", calendarClass53);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType55 = javaType0.widenBy(calendarClass53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaType0);
        org.junit.Assert.assertNotNull(calendarClass5);
        org.junit.Assert.assertNotNull(calendarClass8);
        org.junit.Assert.assertNotNull(simpleType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(calendarClass15);
        org.junit.Assert.assertNotNull(calendarClass18);
        org.junit.Assert.assertNotNull(javaType20);
        org.junit.Assert.assertNotNull(booleanNode22);
        org.junit.Assert.assertTrue("'" + jsonToken23 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken23.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 0 + "'", short24 == (short) 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[true, 17]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[true, 17]");
        org.junit.Assert.assertNotNull(jsonMappingException27);
        org.junit.Assert.assertNotNull(calendarClass29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(jsonNode32);
        org.junit.Assert.assertNotNull(annotationIntrospector35);
        org.junit.Assert.assertNotNull(annotatedClass37);
        org.junit.Assert.assertNotNull(stringArrayDeserializer44);
        org.junit.Assert.assertNull(wildcardJsonDeserializer45);
        org.junit.Assert.assertNull(wildcardJsonDeserializer46);
        org.junit.Assert.assertNotNull(calendarClass48);
        org.junit.Assert.assertNull(wildcardJsonDeserializer51);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.fasterxml.jackson.databind.MapperFeature mapperFeature0 = com.fasterxml.jackson.databind.MapperFeature.AUTO_DETECT_SETTERS;
        int int1 = mapperFeature0.getMask();
        org.junit.Assert.assertTrue("'" + mapperFeature0 + "' != '" + com.fasterxml.jackson.databind.MapperFeature.AUTO_DETECT_SETTERS + "'", mapperFeature0.equals(com.fasterxml.jackson.databind.MapperFeature.AUTO_DETECT_SETTERS));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector0, annotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass3 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer4 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass5 = calendarSerializer4.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer7 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass8 = calendarSerializer7.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember9 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass3, calendarClass5, "", calendarClass8);
        int int10 = virtualAnnotatedMember9.getAnnotationCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = annotationIntrospector2.findPropertyDescription((com.fasterxml.jackson.databind.introspect.Annotated) virtualAnnotatedMember9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(calendarClass5);
        org.junit.Assert.assertNotNull(calendarClass8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer0 = new com.fasterxml.jackson.databind.ser.std.ToStringSerializer();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass0 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer1 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass2 = calendarSerializer1.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer4 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass5 = calendarSerializer4.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember6 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass0, calendarClass2, "", calendarClass5);
        boolean boolean8 = virtualAnnotatedMember6.equals((java.lang.Object) 17);
        java.lang.String str9 = virtualAnnotatedMember6.toString();
        org.junit.Assert.assertNotNull(calendarClass2);
        org.junit.Assert.assertNotNull(calendarClass5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[field java.util.Calendar#]" + "'", str9, "[field java.util.Calendar#]");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.fasterxml.jackson.databind.node.LongNode longNode1 = new com.fasterxml.jackson.databind.node.LongNode((long) (-1));
        double double2 = longNode1.asDouble();
        boolean boolean3 = longNode1.isBoolean();
        com.fasterxml.jackson.databind.node.TreeTraversingParser treeTraversingParser4 = new com.fasterxml.jackson.databind.node.TreeTraversingParser((com.fasterxml.jackson.databind.JsonNode) longNode1);
        int int5 = treeTraversingParser4.getTextOffset();
        com.fasterxml.jackson.core.JsonLocation jsonLocation6 = treeTraversingParser4.getCurrentLocation();
        com.fasterxml.jackson.core.JsonToken jsonToken7 = treeTraversingParser4.nextValue();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jsonLocation6);
        org.junit.Assert.assertTrue("'" + jsonToken7 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT + "'", jsonToken7.equals(com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember0 = null;
        com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition simpleBeanPropertyDefinition2 = new com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition(annotatedMember0, "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod3 = simpleBeanPropertyDefinition2.getSetter();
        boolean boolean4 = simpleBeanPropertyDefinition2.hasGetter();
        boolean boolean5 = simpleBeanPropertyDefinition2.hasField();
        org.junit.Assert.assertNull(annotatedMethod3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass1 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer2 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass3 = calendarSerializer2.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer5 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass6 = calendarSerializer5.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass1, calendarClass3, "", calendarClass6);
        com.fasterxml.jackson.databind.type.SimpleType simpleType8 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass6);
        boolean boolean9 = simpleType8.isPrimitive();
        boolean boolean10 = simpleType8.isContainerType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = simpleType8.withTypeHandler((java.lang.Object) "hi!");
        com.fasterxml.jackson.databind.PropertyName propertyName13 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer14 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations15 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter16 = null;
        com.fasterxml.jackson.databind.ser.std.DateSerializer dateSerializer18 = com.fasterxml.jackson.databind.ser.std.DateSerializer.instance;
        java.text.DateFormat dateFormat20 = null;
        com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase<java.util.Date> dateDateTimeSerializerBase21 = dateSerializer18.withFormat((java.lang.Boolean) true, dateFormat20);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode22 = dateDateTimeSerializerBase21.createObjectNode();
        java.math.BigInteger bigInteger23 = null;
        com.fasterxml.jackson.databind.node.NumericNode numericNode24 = objectNode22.numberNode(bigInteger23);
        com.fasterxml.jackson.databind.deser.CreatorProperty creatorProperty26 = new com.fasterxml.jackson.databind.deser.CreatorProperty("JSON", (com.fasterxml.jackson.databind.JavaType) simpleType8, propertyName13, typeDeserializer14, annotations15, annotatedParameter16, (int) (byte) -1, (java.lang.Object) numericNode24, true);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext27 = null;
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl28 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass29 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer30 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass31 = calendarSerializer30.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer33 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass34 = calendarSerializer33.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember35 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass29, calendarClass31, "", calendarClass34);
        com.fasterxml.jackson.databind.type.SimpleType simpleType36 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass34);
        boolean boolean37 = simpleType36.isPrimitive();
        boolean boolean38 = simpleType36.isContainerType();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass39 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer40 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass41 = calendarSerializer40.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer43 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass44 = calendarSerializer43.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember45 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass39, calendarClass41, "", calendarClass44);
        com.fasterxml.jackson.databind.JavaType javaType46 = impl28.constructSpecializedType((com.fasterxml.jackson.databind.JavaType) simpleType36, calendarClass41);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass47 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer48 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass49 = calendarSerializer48.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer51 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass52 = calendarSerializer51.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember53 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass47, calendarClass49, "", calendarClass52);
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer54 = new com.fasterxml.jackson.databind.ser.std.ToStringSerializer(calendarClass52);
        com.fasterxml.jackson.annotation.JsonFormat.Value value55 = null;
        java.lang.Boolean boolean57 = com.fasterxml.jackson.databind.ser.std.EnumSerializer._isShapeWrittenUsingIndex(calendarClass52, value55, false);
        com.fasterxml.jackson.databind.type.SimpleType simpleType58 = simpleType36.withTypeHandler((java.lang.Object) boolean57);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj59 = creatorProperty26.findInjectableValue(deserializationContext27, (java.lang.Object) simpleType58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendarClass3);
        org.junit.Assert.assertNotNull(calendarClass6);
        org.junit.Assert.assertNotNull(simpleType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(dateSerializer18);
        org.junit.Assert.assertNotNull(dateDateTimeSerializerBase21);
        org.junit.Assert.assertNotNull(objectNode22);
        org.junit.Assert.assertNotNull(numericNode24);
        org.junit.Assert.assertNotNull(calendarClass31);
        org.junit.Assert.assertNotNull(calendarClass34);
        org.junit.Assert.assertNotNull(simpleType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(calendarClass41);
        org.junit.Assert.assertNotNull(calendarClass44);
        org.junit.Assert.assertNotNull(javaType46);
        org.junit.Assert.assertNotNull(calendarClass49);
        org.junit.Assert.assertNotNull(calendarClass52);
        org.junit.Assert.assertNull(boolean57);
        org.junit.Assert.assertNotNull(simpleType58);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer0 = com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer.instance;
        boolean boolean1 = indexedStringListSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer2 = com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer.instance;
        boolean boolean3 = indexedStringListSerializer2.usesObjectId();
        com.fasterxml.jackson.databind.ser.std.SerializableSerializer serializableSerializer4 = new com.fasterxml.jackson.databind.ser.std.SerializableSerializer();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass6 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer7 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass8 = calendarSerializer7.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer10 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass11 = calendarSerializer10.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember12 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass6, calendarClass8, "", calendarClass11);
        com.fasterxml.jackson.databind.type.SimpleType simpleType13 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass11);
        boolean boolean14 = simpleType13.isPrimitive();
        boolean boolean15 = simpleType13.isContainerType();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass16 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer17 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass18 = calendarSerializer17.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer20 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass21 = calendarSerializer20.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember22 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass16, calendarClass18, "", calendarClass21);
        com.fasterxml.jackson.databind.JavaType javaType23 = impl5.constructSpecializedType((com.fasterxml.jackson.databind.JavaType) simpleType13, calendarClass18);
        com.fasterxml.jackson.databind.node.BooleanNode booleanNode25 = com.fasterxml.jackson.databind.node.BooleanNode.TRUE;
        com.fasterxml.jackson.core.JsonToken jsonToken26 = booleanNode25.asToken();
        short short27 = booleanNode25.shortValue();
        java.lang.Object[] objArray29 = new java.lang.Object[] { booleanNode25, 17 };
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException30 = impl5.mappingException("hi!", objArray29);
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer31 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass32 = calendarSerializer31.handledType();
        java.lang.Class<?> wildcardClass33 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) calendarClass32);
        com.fasterxml.jackson.databind.JsonNode jsonNode35 = serializableSerializer4.getSchema((com.fasterxml.jackson.databind.SerializerProvider) impl5, (java.lang.reflect.Type) calendarClass32, false);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass36 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer37 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass38 = calendarSerializer37.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer40 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass41 = calendarSerializer40.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember42 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass36, calendarClass38, "", calendarClass41);
        com.fasterxml.jackson.databind.type.SimpleType simpleType43 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass41);
        boolean boolean44 = simpleType43.isPrimitive();
        boolean boolean45 = simpleType43.isContainerType();
        java.lang.String str46 = simpleType43.toCanonical();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer47 = null;
        com.fasterxml.jackson.databind.ser.std.DateSerializer dateSerializer48 = com.fasterxml.jackson.databind.ser.std.DateSerializer.instance;
        java.text.DateFormat dateFormat50 = null;
        com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase<java.util.Date> dateDateTimeSerializerBase51 = dateSerializer48.withFormat((java.lang.Boolean) true, dateFormat50);
        com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer typeWrappedSerializer52 = new com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer(typeSerializer47, (com.fasterxml.jackson.databind.JsonSerializer<java.util.Date>) dateSerializer48);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode54 = dateSerializer48.createSchemaNode("");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass55 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer56 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass57 = calendarSerializer56.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer59 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass60 = calendarSerializer59.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember61 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass55, calendarClass57, "", calendarClass60);
        com.fasterxml.jackson.databind.type.SimpleType simpleType62 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass60);
        boolean boolean63 = simpleType62.isPrimitive();
        boolean boolean64 = simpleType62.isContainerType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType66 = simpleType62.withTypeHandler((java.lang.Object) "hi!");
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer67 = null;
        com.fasterxml.jackson.databind.ObjectWriter.Prefetch prefetch68 = com.fasterxml.jackson.databind.ObjectWriter.Prefetch.construct((com.fasterxml.jackson.databind.JavaType) simpleType62, typeSerializer67);
        com.fasterxml.jackson.databind.type.ArrayType arrayType69 = com.fasterxml.jackson.databind.type.ArrayType.construct((com.fasterxml.jackson.databind.JavaType) simpleType43, (java.lang.Object) "", (java.lang.Object) simpleType62);
        com.fasterxml.jackson.databind.JsonNode jsonNode70 = indexedStringListSerializer2.getSchema((com.fasterxml.jackson.databind.SerializerProvider) impl5, (java.lang.reflect.Type) arrayType69);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass72 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer73 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass74 = calendarSerializer73.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer76 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass77 = calendarSerializer76.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember78 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass72, calendarClass74, "", calendarClass77);
        com.fasterxml.jackson.databind.type.SimpleType simpleType79 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass77);
        boolean boolean80 = simpleType79.isPrimitive();
        boolean boolean81 = simpleType79.isContainerType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType83 = simpleType79.withTypeHandler((java.lang.Object) "hi!");
        com.fasterxml.jackson.databind.PropertyName propertyName84 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer85 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations86 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter87 = null;
        com.fasterxml.jackson.databind.ser.std.DateSerializer dateSerializer89 = com.fasterxml.jackson.databind.ser.std.DateSerializer.instance;
        java.text.DateFormat dateFormat91 = null;
        com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase<java.util.Date> dateDateTimeSerializerBase92 = dateSerializer89.withFormat((java.lang.Boolean) true, dateFormat91);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode93 = dateDateTimeSerializerBase92.createObjectNode();
        java.math.BigInteger bigInteger94 = null;
        com.fasterxml.jackson.databind.node.NumericNode numericNode95 = objectNode93.numberNode(bigInteger94);
        com.fasterxml.jackson.databind.deser.CreatorProperty creatorProperty97 = new com.fasterxml.jackson.databind.deser.CreatorProperty("JSON", (com.fasterxml.jackson.databind.JavaType) simpleType79, propertyName84, typeDeserializer85, annotations86, annotatedParameter87, (int) (byte) -1, (java.lang.Object) numericNode95, true);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer98 = indexedStringListSerializer0.createContextual((com.fasterxml.jackson.databind.SerializerProvider) impl5, (com.fasterxml.jackson.databind.BeanProperty) creatorProperty97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexedStringListSerializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(indexedStringListSerializer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(calendarClass8);
        org.junit.Assert.assertNotNull(calendarClass11);
        org.junit.Assert.assertNotNull(simpleType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(calendarClass18);
        org.junit.Assert.assertNotNull(calendarClass21);
        org.junit.Assert.assertNotNull(javaType23);
        org.junit.Assert.assertNotNull(booleanNode25);
        org.junit.Assert.assertTrue("'" + jsonToken26 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken26.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) 0 + "'", short27 == (short) 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[true, 17]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[true, 17]");
        org.junit.Assert.assertNotNull(jsonMappingException30);
        org.junit.Assert.assertNotNull(calendarClass32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(jsonNode35);
        org.junit.Assert.assertNotNull(calendarClass38);
        org.junit.Assert.assertNotNull(calendarClass41);
        org.junit.Assert.assertNotNull(simpleType43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "java.util.Calendar" + "'", str46, "java.util.Calendar");
        org.junit.Assert.assertNotNull(dateSerializer48);
        org.junit.Assert.assertNotNull(dateDateTimeSerializerBase51);
        org.junit.Assert.assertNotNull(objectNode54);
        org.junit.Assert.assertNotNull(calendarClass57);
        org.junit.Assert.assertNotNull(calendarClass60);
        org.junit.Assert.assertNotNull(simpleType62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(simpleType66);
        org.junit.Assert.assertNotNull(prefetch68);
        org.junit.Assert.assertNotNull(arrayType69);
        org.junit.Assert.assertNotNull(jsonNode70);
        org.junit.Assert.assertNotNull(calendarClass74);
        org.junit.Assert.assertNotNull(calendarClass77);
        org.junit.Assert.assertNotNull(simpleType79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(simpleType83);
        org.junit.Assert.assertNotNull(dateSerializer89);
        org.junit.Assert.assertNotNull(dateDateTimeSerializerBase92);
        org.junit.Assert.assertNotNull(objectNode93);
        org.junit.Assert.assertNotNull(numericNode95);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.fasterxml.jackson.databind.ser.std.SerializableSerializer serializableSerializer0 = new com.fasterxml.jackson.databind.ser.std.SerializableSerializer();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass2 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer3 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass4 = calendarSerializer3.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer6 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass7 = calendarSerializer6.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember8 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass2, calendarClass4, "", calendarClass7);
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass7);
        boolean boolean10 = simpleType9.isPrimitive();
        boolean boolean11 = simpleType9.isContainerType();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass12 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer13 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass14 = calendarSerializer13.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer16 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass17 = calendarSerializer16.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember18 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass12, calendarClass14, "", calendarClass17);
        com.fasterxml.jackson.databind.JavaType javaType19 = impl1.constructSpecializedType((com.fasterxml.jackson.databind.JavaType) simpleType9, calendarClass14);
        com.fasterxml.jackson.databind.node.BooleanNode booleanNode21 = com.fasterxml.jackson.databind.node.BooleanNode.TRUE;
        com.fasterxml.jackson.core.JsonToken jsonToken22 = booleanNode21.asToken();
        short short23 = booleanNode21.shortValue();
        java.lang.Object[] objArray25 = new java.lang.Object[] { booleanNode21, 17 };
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException26 = impl1.mappingException("hi!", objArray25);
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer27 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass28 = calendarSerializer27.handledType();
        java.lang.Class<?> wildcardClass29 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) calendarClass28);
        com.fasterxml.jackson.databind.JsonNode jsonNode31 = serializableSerializer0.getSchema((com.fasterxml.jackson.databind.SerializerProvider) impl1, (java.lang.reflect.Type) calendarClass28, false);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector32 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector33 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector34 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector32, annotationIntrospector33);
        com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver mixInResolver35 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass36 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(calendarClass28, annotationIntrospector32, mixInResolver35);
        com.fasterxml.jackson.databind.introspect.AnnotatedConstructor annotatedConstructor37 = annotatedClass36.getDefaultConstructor();
        java.lang.Iterable<com.fasterxml.jackson.databind.introspect.AnnotatedField> annotatedFieldIterable38 = annotatedClass36.fields();
        org.junit.Assert.assertNotNull(calendarClass4);
        org.junit.Assert.assertNotNull(calendarClass7);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(calendarClass14);
        org.junit.Assert.assertNotNull(calendarClass17);
        org.junit.Assert.assertNotNull(javaType19);
        org.junit.Assert.assertNotNull(booleanNode21);
        org.junit.Assert.assertTrue("'" + jsonToken22 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken22.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 0 + "'", short23 == (short) 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[true, 17]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[true, 17]");
        org.junit.Assert.assertNotNull(jsonMappingException26);
        org.junit.Assert.assertNotNull(calendarClass28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(jsonNode31);
        org.junit.Assert.assertNotNull(annotationIntrospector34);
        org.junit.Assert.assertNotNull(annotatedClass36);
        org.junit.Assert.assertNotNull(annotatedConstructor37);
        org.junit.Assert.assertNotNull(annotatedFieldIterable38);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer0 = com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer.instance;
        boolean boolean1 = indexedStringListSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.ser.std.SerializableSerializer serializableSerializer2 = new com.fasterxml.jackson.databind.ser.std.SerializableSerializer();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass4 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer5 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass6 = calendarSerializer5.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer8 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass9 = calendarSerializer8.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember10 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass4, calendarClass6, "", calendarClass9);
        com.fasterxml.jackson.databind.type.SimpleType simpleType11 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass9);
        boolean boolean12 = simpleType11.isPrimitive();
        boolean boolean13 = simpleType11.isContainerType();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass14 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer15 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass16 = calendarSerializer15.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer18 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass19 = calendarSerializer18.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember20 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass14, calendarClass16, "", calendarClass19);
        com.fasterxml.jackson.databind.JavaType javaType21 = impl3.constructSpecializedType((com.fasterxml.jackson.databind.JavaType) simpleType11, calendarClass16);
        com.fasterxml.jackson.databind.node.BooleanNode booleanNode23 = com.fasterxml.jackson.databind.node.BooleanNode.TRUE;
        com.fasterxml.jackson.core.JsonToken jsonToken24 = booleanNode23.asToken();
        short short25 = booleanNode23.shortValue();
        java.lang.Object[] objArray27 = new java.lang.Object[] { booleanNode23, 17 };
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException28 = impl3.mappingException("hi!", objArray27);
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer29 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass30 = calendarSerializer29.handledType();
        java.lang.Class<?> wildcardClass31 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) calendarClass30);
        com.fasterxml.jackson.databind.JsonNode jsonNode33 = serializableSerializer2.getSchema((com.fasterxml.jackson.databind.SerializerProvider) impl3, (java.lang.reflect.Type) calendarClass30, false);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass34 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer35 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass36 = calendarSerializer35.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer38 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass39 = calendarSerializer38.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember40 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass34, calendarClass36, "", calendarClass39);
        com.fasterxml.jackson.databind.type.SimpleType simpleType41 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass39);
        boolean boolean42 = simpleType41.isPrimitive();
        boolean boolean43 = simpleType41.isContainerType();
        java.lang.String str44 = simpleType41.toCanonical();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer45 = null;
        com.fasterxml.jackson.databind.ser.std.DateSerializer dateSerializer46 = com.fasterxml.jackson.databind.ser.std.DateSerializer.instance;
        java.text.DateFormat dateFormat48 = null;
        com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase<java.util.Date> dateDateTimeSerializerBase49 = dateSerializer46.withFormat((java.lang.Boolean) true, dateFormat48);
        com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer typeWrappedSerializer50 = new com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer(typeSerializer45, (com.fasterxml.jackson.databind.JsonSerializer<java.util.Date>) dateSerializer46);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode52 = dateSerializer46.createSchemaNode("");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass53 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer54 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass55 = calendarSerializer54.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer57 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass58 = calendarSerializer57.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember59 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass53, calendarClass55, "", calendarClass58);
        com.fasterxml.jackson.databind.type.SimpleType simpleType60 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass58);
        boolean boolean61 = simpleType60.isPrimitive();
        boolean boolean62 = simpleType60.isContainerType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType64 = simpleType60.withTypeHandler((java.lang.Object) "hi!");
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer65 = null;
        com.fasterxml.jackson.databind.ObjectWriter.Prefetch prefetch66 = com.fasterxml.jackson.databind.ObjectWriter.Prefetch.construct((com.fasterxml.jackson.databind.JavaType) simpleType60, typeSerializer65);
        com.fasterxml.jackson.databind.type.ArrayType arrayType67 = com.fasterxml.jackson.databind.type.ArrayType.construct((com.fasterxml.jackson.databind.JavaType) simpleType41, (java.lang.Object) "", (java.lang.Object) simpleType60);
        com.fasterxml.jackson.databind.JsonNode jsonNode68 = indexedStringListSerializer0.getSchema((com.fasterxml.jackson.databind.SerializerProvider) impl3, (java.lang.reflect.Type) arrayType67);
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata71 = com.fasterxml.jackson.databind.PropertyMetadata.construct(false, "");
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata73 = propertyMetadata71.withRequired((java.lang.Boolean) true);
        boolean boolean74 = arrayType67.equals((java.lang.Object) propertyMetadata73);
        org.junit.Assert.assertNotNull(indexedStringListSerializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(calendarClass6);
        org.junit.Assert.assertNotNull(calendarClass9);
        org.junit.Assert.assertNotNull(simpleType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(calendarClass16);
        org.junit.Assert.assertNotNull(calendarClass19);
        org.junit.Assert.assertNotNull(javaType21);
        org.junit.Assert.assertNotNull(booleanNode23);
        org.junit.Assert.assertTrue("'" + jsonToken24 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken24.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 0 + "'", short25 == (short) 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[true, 17]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[true, 17]");
        org.junit.Assert.assertNotNull(jsonMappingException28);
        org.junit.Assert.assertNotNull(calendarClass30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(jsonNode33);
        org.junit.Assert.assertNotNull(calendarClass36);
        org.junit.Assert.assertNotNull(calendarClass39);
        org.junit.Assert.assertNotNull(simpleType41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "java.util.Calendar" + "'", str44, "java.util.Calendar");
        org.junit.Assert.assertNotNull(dateSerializer46);
        org.junit.Assert.assertNotNull(dateDateTimeSerializerBase49);
        org.junit.Assert.assertNotNull(objectNode52);
        org.junit.Assert.assertNotNull(calendarClass55);
        org.junit.Assert.assertNotNull(calendarClass58);
        org.junit.Assert.assertNotNull(simpleType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(simpleType64);
        org.junit.Assert.assertNotNull(prefetch66);
        org.junit.Assert.assertNotNull(arrayType67);
        org.junit.Assert.assertNotNull(jsonNode68);
        org.junit.Assert.assertNotNull(propertyMetadata71);
        org.junit.Assert.assertNotNull(propertyMetadata73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0, strMap1);
        com.fasterxml.jackson.core.JsonToken jsonToken3 = objectNode2.asToken();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.TextNode textNode5 = objectNode2.textNode("[field java.util.Calendar#]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicBooleanSerializer atomicBooleanSerializer0 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicBooleanSerializer();
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer1 = com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer.instance;
        boolean boolean2 = indexedStringListSerializer1.usesObjectId();
        com.fasterxml.jackson.databind.ser.std.SerializableSerializer serializableSerializer3 = new com.fasterxml.jackson.databind.ser.std.SerializableSerializer();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass5 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer6 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass7 = calendarSerializer6.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer9 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass10 = calendarSerializer9.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember11 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass5, calendarClass7, "", calendarClass10);
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass10);
        boolean boolean13 = simpleType12.isPrimitive();
        boolean boolean14 = simpleType12.isContainerType();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass15 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer16 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass17 = calendarSerializer16.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer19 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass20 = calendarSerializer19.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember21 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass15, calendarClass17, "", calendarClass20);
        com.fasterxml.jackson.databind.JavaType javaType22 = impl4.constructSpecializedType((com.fasterxml.jackson.databind.JavaType) simpleType12, calendarClass17);
        com.fasterxml.jackson.databind.node.BooleanNode booleanNode24 = com.fasterxml.jackson.databind.node.BooleanNode.TRUE;
        com.fasterxml.jackson.core.JsonToken jsonToken25 = booleanNode24.asToken();
        short short26 = booleanNode24.shortValue();
        java.lang.Object[] objArray28 = new java.lang.Object[] { booleanNode24, 17 };
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException29 = impl4.mappingException("hi!", objArray28);
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer30 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass31 = calendarSerializer30.handledType();
        java.lang.Class<?> wildcardClass32 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) calendarClass31);
        com.fasterxml.jackson.databind.JsonNode jsonNode34 = serializableSerializer3.getSchema((com.fasterxml.jackson.databind.SerializerProvider) impl4, (java.lang.reflect.Type) calendarClass31, false);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass35 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer36 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass37 = calendarSerializer36.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer39 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass40 = calendarSerializer39.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember41 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass35, calendarClass37, "", calendarClass40);
        com.fasterxml.jackson.databind.type.SimpleType simpleType42 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass40);
        boolean boolean43 = simpleType42.isPrimitive();
        boolean boolean44 = simpleType42.isContainerType();
        java.lang.String str45 = simpleType42.toCanonical();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer46 = null;
        com.fasterxml.jackson.databind.ser.std.DateSerializer dateSerializer47 = com.fasterxml.jackson.databind.ser.std.DateSerializer.instance;
        java.text.DateFormat dateFormat49 = null;
        com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase<java.util.Date> dateDateTimeSerializerBase50 = dateSerializer47.withFormat((java.lang.Boolean) true, dateFormat49);
        com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer typeWrappedSerializer51 = new com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer(typeSerializer46, (com.fasterxml.jackson.databind.JsonSerializer<java.util.Date>) dateSerializer47);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode53 = dateSerializer47.createSchemaNode("");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass54 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer55 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass56 = calendarSerializer55.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer58 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass59 = calendarSerializer58.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember60 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass54, calendarClass56, "", calendarClass59);
        com.fasterxml.jackson.databind.type.SimpleType simpleType61 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass59);
        boolean boolean62 = simpleType61.isPrimitive();
        boolean boolean63 = simpleType61.isContainerType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType65 = simpleType61.withTypeHandler((java.lang.Object) "hi!");
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer66 = null;
        com.fasterxml.jackson.databind.ObjectWriter.Prefetch prefetch67 = com.fasterxml.jackson.databind.ObjectWriter.Prefetch.construct((com.fasterxml.jackson.databind.JavaType) simpleType61, typeSerializer66);
        com.fasterxml.jackson.databind.type.ArrayType arrayType68 = com.fasterxml.jackson.databind.type.ArrayType.construct((com.fasterxml.jackson.databind.JavaType) simpleType42, (java.lang.Object) "", (java.lang.Object) simpleType61);
        com.fasterxml.jackson.databind.JsonNode jsonNode69 = indexedStringListSerializer1.getSchema((com.fasterxml.jackson.databind.SerializerProvider) impl4, (java.lang.reflect.Type) arrayType68);
        java.lang.Throwable throwable72 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException73 = new com.fasterxml.jackson.databind.JsonMappingException("hi!", throwable72);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException74 = new com.fasterxml.jackson.databind.JsonMappingException("", throwable72);
        com.fasterxml.jackson.databind.MappingJsonFactory mappingJsonFactory75 = new com.fasterxml.jackson.databind.MappingJsonFactory();
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes76 = mappingJsonFactory75.getCharacterEscapes();
        java.io.OutputStream outputStream77 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator78 = mappingJsonFactory75.createGenerator(outputStream77);
        // The following exception was thrown during execution in test generation
        try {
            atomicBooleanSerializer0.wrapAndThrow((com.fasterxml.jackson.databind.SerializerProvider) impl4, (java.lang.Throwable) jsonMappingException74, (java.lang.Object) outputStream77, "JSON");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexedStringListSerializer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(calendarClass7);
        org.junit.Assert.assertNotNull(calendarClass10);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(calendarClass17);
        org.junit.Assert.assertNotNull(calendarClass20);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(booleanNode24);
        org.junit.Assert.assertTrue("'" + jsonToken25 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken25.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) 0 + "'", short26 == (short) 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[true, 17]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[true, 17]");
        org.junit.Assert.assertNotNull(jsonMappingException29);
        org.junit.Assert.assertNotNull(calendarClass31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(jsonNode34);
        org.junit.Assert.assertNotNull(calendarClass37);
        org.junit.Assert.assertNotNull(calendarClass40);
        org.junit.Assert.assertNotNull(simpleType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "java.util.Calendar" + "'", str45, "java.util.Calendar");
        org.junit.Assert.assertNotNull(dateSerializer47);
        org.junit.Assert.assertNotNull(dateDateTimeSerializerBase50);
        org.junit.Assert.assertNotNull(objectNode53);
        org.junit.Assert.assertNotNull(calendarClass56);
        org.junit.Assert.assertNotNull(calendarClass59);
        org.junit.Assert.assertNotNull(simpleType61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(simpleType65);
        org.junit.Assert.assertNotNull(prefetch67);
        org.junit.Assert.assertNotNull(arrayType68);
        org.junit.Assert.assertNotNull(jsonNode69);
        org.junit.Assert.assertNull(characterEscapes76);
        org.junit.Assert.assertNotNull(jsonGenerator78);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer0 = com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer.instance;
        boolean boolean1 = indexedStringListSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass3 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer4 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass5 = calendarSerializer4.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer7 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass8 = calendarSerializer7.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember9 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass3, calendarClass5, "", calendarClass8);
        com.fasterxml.jackson.databind.type.SimpleType simpleType10 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass8);
        boolean boolean11 = simpleType10.isPrimitive();
        boolean boolean12 = simpleType10.isContainerType();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass13 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer14 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass15 = calendarSerializer14.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer17 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass18 = calendarSerializer17.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember19 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass13, calendarClass15, "", calendarClass18);
        com.fasterxml.jackson.databind.JavaType javaType20 = impl2.constructSpecializedType((com.fasterxml.jackson.databind.JavaType) simpleType10, calendarClass15);
        com.fasterxml.jackson.databind.node.BooleanNode booleanNode22 = com.fasterxml.jackson.databind.node.BooleanNode.TRUE;
        com.fasterxml.jackson.core.JsonToken jsonToken23 = booleanNode22.asToken();
        short short24 = booleanNode22.shortValue();
        java.lang.Object[] objArray26 = new java.lang.Object[] { booleanNode22, 17 };
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException27 = impl2.mappingException("hi!", objArray26);
        java.lang.String[] strArray35 = new java.lang.String[] { "com.fasterxml.jackson.databind.node.LongNode[?]", "java.util.Calendar", " ", "JSON", " ", "java.util.Calendar", "" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        boolean boolean38 = indexedStringListSerializer0.isEmpty((com.fasterxml.jackson.databind.SerializerProvider) impl2, (java.util.List<java.lang.String>) strList36);
        org.junit.Assert.assertNotNull(indexedStringListSerializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(calendarClass5);
        org.junit.Assert.assertNotNull(calendarClass8);
        org.junit.Assert.assertNotNull(simpleType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(calendarClass15);
        org.junit.Assert.assertNotNull(calendarClass18);
        org.junit.Assert.assertNotNull(javaType20);
        org.junit.Assert.assertNotNull(booleanNode22);
        org.junit.Assert.assertTrue("'" + jsonToken23 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken23.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 0 + "'", short24 == (short) 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[true, 17]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[true, 17]");
        org.junit.Assert.assertNotNull(jsonMappingException27);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer0 = null;
        com.fasterxml.jackson.databind.ser.std.DateSerializer dateSerializer1 = com.fasterxml.jackson.databind.ser.std.DateSerializer.instance;
        java.text.DateFormat dateFormat3 = null;
        com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase<java.util.Date> dateDateTimeSerializerBase4 = dateSerializer1.withFormat((java.lang.Boolean) true, dateFormat3);
        com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer typeWrappedSerializer5 = new com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer(typeSerializer0, (com.fasterxml.jackson.databind.JsonSerializer<java.util.Date>) dateSerializer1);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = dateSerializer1.createSchemaNode("");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = objectNode7.put("hi!", 0.0f);
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ValueNode valueNode16 = objectNode7.binaryNode(byteArray13, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateSerializer1);
        org.junit.Assert.assertNotNull(dateDateTimeSerializerBase4);
        org.junit.Assert.assertNotNull(objectNode7);
        org.junit.Assert.assertNotNull(objectNode10);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 100]");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.fasterxml.jackson.databind.node.BooleanNode booleanNode0 = com.fasterxml.jackson.databind.node.BooleanNode.getFalse();
        com.fasterxml.jackson.core.JsonToken jsonToken1 = booleanNode0.asToken();
        org.junit.Assert.assertNotNull(booleanNode0);
        org.junit.Assert.assertTrue("'" + jsonToken1 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_FALSE + "'", jsonToken1.equals(com.fasterxml.jackson.core.JsonToken.VALUE_FALSE));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.fasterxml.jackson.databind.ser.std.IterableSerializer iterableSerializer0 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass2 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer3 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass4 = calendarSerializer3.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer6 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass7 = calendarSerializer6.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember8 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass2, calendarClass4, "", calendarClass7);
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass7);
        boolean boolean10 = simpleType9.isPrimitive();
        boolean boolean11 = simpleType9.isContainerType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType13 = simpleType9.withTypeHandler((java.lang.Object) "hi!");
        com.fasterxml.jackson.databind.PropertyName propertyName14 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer15 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations16 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter17 = null;
        com.fasterxml.jackson.databind.ser.std.DateSerializer dateSerializer19 = com.fasterxml.jackson.databind.ser.std.DateSerializer.instance;
        java.text.DateFormat dateFormat21 = null;
        com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase<java.util.Date> dateDateTimeSerializerBase22 = dateSerializer19.withFormat((java.lang.Boolean) true, dateFormat21);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode23 = dateDateTimeSerializerBase22.createObjectNode();
        java.math.BigInteger bigInteger24 = null;
        com.fasterxml.jackson.databind.node.NumericNode numericNode25 = objectNode23.numberNode(bigInteger24);
        com.fasterxml.jackson.databind.deser.CreatorProperty creatorProperty27 = new com.fasterxml.jackson.databind.deser.CreatorProperty("JSON", (com.fasterxml.jackson.databind.JavaType) simpleType9, propertyName14, typeDeserializer15, annotations16, annotatedParameter17, (int) (byte) -1, (java.lang.Object) numericNode25, true);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer28 = null;
        com.fasterxml.jackson.databind.ser.std.DateSerializer dateSerializer29 = com.fasterxml.jackson.databind.ser.std.DateSerializer.instance;
        java.text.DateFormat dateFormat31 = null;
        com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase<java.util.Date> dateDateTimeSerializerBase32 = dateSerializer29.withFormat((java.lang.Boolean) true, dateFormat31);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer33 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.util.Date> dateJsonSerializer34 = dateDateTimeSerializerBase32.unwrappingSerializer(nameTransformer33);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ser.std.IterableSerializer iterableSerializer35 = new com.fasterxml.jackson.databind.ser.std.IterableSerializer(iterableSerializer0, (com.fasterxml.jackson.databind.BeanProperty) creatorProperty27, typeSerializer28, (com.fasterxml.jackson.databind.JsonSerializer<java.util.Date>) dateDateTimeSerializerBase32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendarClass4);
        org.junit.Assert.assertNotNull(calendarClass7);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(simpleType13);
        org.junit.Assert.assertNotNull(dateSerializer19);
        org.junit.Assert.assertNotNull(dateDateTimeSerializerBase22);
        org.junit.Assert.assertNotNull(objectNode23);
        org.junit.Assert.assertNotNull(numericNode25);
        org.junit.Assert.assertNotNull(dateSerializer29);
        org.junit.Assert.assertNotNull(dateDateTimeSerializerBase32);
        org.junit.Assert.assertNotNull(dateJsonSerializer34);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.fasterxml.jackson.databind.ser.std.DateSerializer dateSerializer0 = com.fasterxml.jackson.databind.ser.std.DateSerializer.instance;
        java.text.DateFormat dateFormat2 = null;
        com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase<java.util.Date> dateDateTimeSerializerBase3 = dateSerializer0.withFormat((java.lang.Boolean) true, dateFormat2);
        com.fasterxml.jackson.databind.JsonSerializer<java.util.Date> dateJsonSerializer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<java.util.Date> dateJsonSerializer5 = dateDateTimeSerializerBase3.replaceDelegatee(dateJsonSerializer4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateSerializer0);
        org.junit.Assert.assertNotNull(dateDateTimeSerializerBase3);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer0 = null;
        com.fasterxml.jackson.databind.ser.std.DateSerializer dateSerializer1 = com.fasterxml.jackson.databind.ser.std.DateSerializer.instance;
        java.text.DateFormat dateFormat3 = null;
        com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase<java.util.Date> dateDateTimeSerializerBase4 = dateSerializer1.withFormat((java.lang.Boolean) true, dateFormat3);
        com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer typeWrappedSerializer5 = new com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer(typeSerializer0, (com.fasterxml.jackson.databind.JsonSerializer<java.util.Date>) dateSerializer1);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = dateSerializer1.createSchemaNode("");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = objectNode7.put("hi!", 0.0f);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = objectNode7.deepCopy();
        org.junit.Assert.assertNotNull(dateSerializer1);
        org.junit.Assert.assertNotNull(dateDateTimeSerializerBase4);
        org.junit.Assert.assertNotNull(objectNode7);
        org.junit.Assert.assertNotNull(objectNode10);
        org.junit.Assert.assertNotNull(objectNode11);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass0 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer1 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass2 = calendarSerializer1.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer4 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass5 = calendarSerializer4.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember6 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass0, calendarClass2, "", calendarClass5);
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer7 = new com.fasterxml.jackson.databind.ser.std.ToStringSerializer(calendarClass5);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std std8 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec9 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer10 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec9);
        java.lang.Object[] objArray11 = new java.lang.Object[] { std8, objectCodec9 };
        java.util.ArrayList<java.lang.Object> objList12 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList12, objArray11);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.CollectionReferringAccumulator collectionReferringAccumulator14 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.CollectionReferringAccumulator(calendarClass5, (java.util.Collection<java.lang.Object>) objList12);
        com.fasterxml.jackson.databind.ser.impl.StringArraySerializer stringArraySerializer15 = com.fasterxml.jackson.databind.ser.impl.StringArraySerializer.instance;
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass17 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer18 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass19 = calendarSerializer18.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer21 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass22 = calendarSerializer21.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember23 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass17, calendarClass19, "", calendarClass22);
        com.fasterxml.jackson.databind.type.SimpleType simpleType24 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass22);
        boolean boolean25 = simpleType24.isPrimitive();
        boolean boolean26 = simpleType24.isContainerType();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass27 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer28 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass29 = calendarSerializer28.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer31 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass32 = calendarSerializer31.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember33 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass27, calendarClass29, "", calendarClass32);
        com.fasterxml.jackson.databind.JavaType javaType34 = impl16.constructSpecializedType((com.fasterxml.jackson.databind.JavaType) simpleType24, calendarClass29);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass35 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer36 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass37 = calendarSerializer36.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer39 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass40 = calendarSerializer39.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember41 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass35, calendarClass37, "", calendarClass40);
        com.fasterxml.jackson.databind.type.SimpleType simpleType42 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass40);
        com.fasterxml.jackson.databind.JsonNode jsonNode44 = stringArraySerializer15.getSchema((com.fasterxml.jackson.databind.SerializerProvider) impl16, (java.lang.reflect.Type) simpleType42, false);
        collectionReferringAccumulator14.add((java.lang.Object) stringArraySerializer15);
        boolean boolean46 = stringArraySerializer15.isUnwrappingSerializer();
        org.junit.Assert.assertNotNull(calendarClass2);
        org.junit.Assert.assertNotNull(calendarClass5);
        org.junit.Assert.assertNotNull(std8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[[Visibility: getter: PUBLIC_ONLY, isGetter: PUBLIC_ONLY, setter: ANY, creator: ANY, field: PUBLIC_ONLY], null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[[Visibility: getter: PUBLIC_ONLY, isGetter: PUBLIC_ONLY, setter: ANY, creator: ANY, field: PUBLIC_ONLY], null]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(stringArraySerializer15);
        org.junit.Assert.assertNotNull(calendarClass19);
        org.junit.Assert.assertNotNull(calendarClass22);
        org.junit.Assert.assertNotNull(simpleType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(calendarClass29);
        org.junit.Assert.assertNotNull(calendarClass32);
        org.junit.Assert.assertNotNull(javaType34);
        org.junit.Assert.assertNotNull(calendarClass37);
        org.junit.Assert.assertNotNull(calendarClass40);
        org.junit.Assert.assertNotNull(simpleType42);
        org.junit.Assert.assertNotNull(jsonNode44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer tokenBufferSerializer0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping0 = null;
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder defaultTypeResolverBuilder1 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(defaultTyping0);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = defaultTypeResolverBuilder1.typeProperty("java.util.Calendar");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass5 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer6 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass7 = calendarSerializer6.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer9 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass10 = calendarSerializer9.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember11 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass5, calendarClass7, "", calendarClass10);
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass10);
        boolean boolean13 = simpleType12.isPrimitive();
        boolean boolean14 = simpleType12.isContainerType();
        java.lang.String str15 = simpleType12.toCanonical();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer16 = null;
        com.fasterxml.jackson.databind.ser.std.DateSerializer dateSerializer17 = com.fasterxml.jackson.databind.ser.std.DateSerializer.instance;
        java.text.DateFormat dateFormat19 = null;
        com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase<java.util.Date> dateDateTimeSerializerBase20 = dateSerializer17.withFormat((java.lang.Boolean) true, dateFormat19);
        com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer typeWrappedSerializer21 = new com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer(typeSerializer16, (com.fasterxml.jackson.databind.JsonSerializer<java.util.Date>) dateSerializer17);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode23 = dateSerializer17.createSchemaNode("");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass24 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer25 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass26 = calendarSerializer25.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer28 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass29 = calendarSerializer28.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember30 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass24, calendarClass26, "", calendarClass29);
        com.fasterxml.jackson.databind.type.SimpleType simpleType31 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass29);
        boolean boolean32 = simpleType31.isPrimitive();
        boolean boolean33 = simpleType31.isContainerType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType35 = simpleType31.withTypeHandler((java.lang.Object) "hi!");
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer36 = null;
        com.fasterxml.jackson.databind.ObjectWriter.Prefetch prefetch37 = com.fasterxml.jackson.databind.ObjectWriter.Prefetch.construct((com.fasterxml.jackson.databind.JavaType) simpleType31, typeSerializer36);
        com.fasterxml.jackson.databind.type.ArrayType arrayType38 = com.fasterxml.jackson.databind.type.ArrayType.construct((com.fasterxml.jackson.databind.JavaType) simpleType12, (java.lang.Object) "", (java.lang.Object) simpleType31);
        boolean boolean39 = arrayType38.isConcrete();
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray40 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        java.util.ArrayList<com.fasterxml.jackson.databind.jsontype.NamedType> namedTypeList41 = new java.util.ArrayList<com.fasterxml.jackson.databind.jsontype.NamedType>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.jsontype.NamedType>) namedTypeList41, namedTypeArray40);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer43 = defaultTypeResolverBuilder1.buildTypeDeserializer(deserializationConfig4, (com.fasterxml.jackson.databind.JavaType) arrayType38, (java.util.Collection<com.fasterxml.jackson.databind.jsontype.NamedType>) namedTypeList41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder3);
        org.junit.Assert.assertNotNull(calendarClass7);
        org.junit.Assert.assertNotNull(calendarClass10);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.util.Calendar" + "'", str15, "java.util.Calendar");
        org.junit.Assert.assertNotNull(dateSerializer17);
        org.junit.Assert.assertNotNull(dateDateTimeSerializerBase20);
        org.junit.Assert.assertNotNull(objectNode23);
        org.junit.Assert.assertNotNull(calendarClass26);
        org.junit.Assert.assertNotNull(calendarClass29);
        org.junit.Assert.assertNotNull(simpleType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(simpleType35);
        org.junit.Assert.assertNotNull(prefetch37);
        org.junit.Assert.assertNotNull(arrayType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(namedTypeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.fasterxml.jackson.databind.ser.impl.UnknownSerializer unknownSerializer0 = new com.fasterxml.jackson.databind.ser.impl.UnknownSerializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        java.lang.String[] strArray2 = stringArrayDeserializer1.getNullValue();
        com.fasterxml.jackson.databind.MappingJsonFactory mappingJsonFactory3 = new com.fasterxml.jackson.databind.MappingJsonFactory();
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes4 = mappingJsonFactory3.getCharacterEscapes();
        java.io.OutputStream outputStream5 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator6 = mappingJsonFactory3.createJsonGenerator(outputStream5);
        com.fasterxml.jackson.databind.ser.impl.StringArraySerializer stringArraySerializer7 = com.fasterxml.jackson.databind.ser.impl.StringArraySerializer.instance;
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass9 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer10 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass11 = calendarSerializer10.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer13 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass14 = calendarSerializer13.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass9, calendarClass11, "", calendarClass14);
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass14);
        boolean boolean17 = simpleType16.isPrimitive();
        boolean boolean18 = simpleType16.isContainerType();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass19 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer20 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass21 = calendarSerializer20.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer23 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass24 = calendarSerializer23.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember25 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass19, calendarClass21, "", calendarClass24);
        com.fasterxml.jackson.databind.JavaType javaType26 = impl8.constructSpecializedType((com.fasterxml.jackson.databind.JavaType) simpleType16, calendarClass21);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass27 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer28 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass29 = calendarSerializer28.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer31 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass32 = calendarSerializer31.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember33 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass27, calendarClass29, "", calendarClass32);
        com.fasterxml.jackson.databind.type.SimpleType simpleType34 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass32);
        com.fasterxml.jackson.databind.JsonNode jsonNode36 = stringArraySerializer7.getSchema((com.fasterxml.jackson.databind.SerializerProvider) impl8, (java.lang.reflect.Type) simpleType34, false);
        com.fasterxml.jackson.databind.JavaType javaType37 = null;
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer38 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.instance;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap39 = null;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult serializerAndMapResult40 = new com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer38, propertySerializerMap39);
        com.fasterxml.jackson.databind.ObjectWriter.Prefetch prefetch41 = com.fasterxml.jackson.databind.ObjectWriter.Prefetch.construct(javaType37, (com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer38);
        impl8.setNullKeySerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) toStringSerializer38);
        // The following exception was thrown during execution in test generation
        try {
            unknownSerializer0.serialize((java.lang.Object) stringArrayDeserializer1, jsonGenerator6, (com.fasterxml.jackson.databind.SerializerProvider) impl8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringArrayDeserializer1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(characterEscapes4);
        org.junit.Assert.assertNotNull(jsonGenerator6);
        org.junit.Assert.assertNotNull(stringArraySerializer7);
        org.junit.Assert.assertNotNull(calendarClass11);
        org.junit.Assert.assertNotNull(calendarClass14);
        org.junit.Assert.assertNotNull(simpleType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(calendarClass21);
        org.junit.Assert.assertNotNull(calendarClass24);
        org.junit.Assert.assertNotNull(javaType26);
        org.junit.Assert.assertNotNull(calendarClass29);
        org.junit.Assert.assertNotNull(calendarClass32);
        org.junit.Assert.assertNotNull(simpleType34);
        org.junit.Assert.assertNotNull(jsonNode36);
        org.junit.Assert.assertNotNull(toStringSerializer38);
        org.junit.Assert.assertNotNull(prefetch41);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember0 = null;
        com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition simpleBeanPropertyDefinition2 = new com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition(annotatedMember0, "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod3 = simpleBeanPropertyDefinition2.getSetter();
        java.lang.String str4 = simpleBeanPropertyDefinition2.getInternalName();
        com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition beanPropertyDefinition6 = simpleBeanPropertyDefinition2.withName("hi!");
        com.fasterxml.jackson.databind.ser.impl.StringArraySerializer stringArraySerializer7 = com.fasterxml.jackson.databind.ser.impl.StringArraySerializer.instance;
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass9 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer10 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass11 = calendarSerializer10.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer13 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass14 = calendarSerializer13.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass9, calendarClass11, "", calendarClass14);
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass14);
        boolean boolean17 = simpleType16.isPrimitive();
        boolean boolean18 = simpleType16.isContainerType();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass19 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer20 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass21 = calendarSerializer20.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer23 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass24 = calendarSerializer23.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember25 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass19, calendarClass21, "", calendarClass24);
        com.fasterxml.jackson.databind.JavaType javaType26 = impl8.constructSpecializedType((com.fasterxml.jackson.databind.JavaType) simpleType16, calendarClass21);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass27 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer28 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass29 = calendarSerializer28.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer31 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass32 = calendarSerializer31.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember33 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass27, calendarClass29, "", calendarClass32);
        com.fasterxml.jackson.databind.type.SimpleType simpleType34 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass32);
        com.fasterxml.jackson.databind.JsonNode jsonNode36 = stringArraySerializer7.getSchema((com.fasterxml.jackson.databind.SerializerProvider) impl8, (java.lang.reflect.Type) simpleType34, false);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer37 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations38 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedField annotatedField39 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.impl.FieldProperty fieldProperty40 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition) simpleBeanPropertyDefinition2, (com.fasterxml.jackson.databind.JavaType) simpleType34, typeDeserializer37, annotations38, annotatedField39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedMethod3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(beanPropertyDefinition6);
        org.junit.Assert.assertNotNull(stringArraySerializer7);
        org.junit.Assert.assertNotNull(calendarClass11);
        org.junit.Assert.assertNotNull(calendarClass14);
        org.junit.Assert.assertNotNull(simpleType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(calendarClass21);
        org.junit.Assert.assertNotNull(calendarClass24);
        org.junit.Assert.assertNotNull(javaType26);
        org.junit.Assert.assertNotNull(calendarClass29);
        org.junit.Assert.assertNotNull(calendarClass32);
        org.junit.Assert.assertNotNull(simpleType34);
        org.junit.Assert.assertNotNull(jsonNode36);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer0 = com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer.instance;
        boolean boolean1 = indexedStringListSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.ser.std.SerializableSerializer serializableSerializer2 = new com.fasterxml.jackson.databind.ser.std.SerializableSerializer();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass4 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer5 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass6 = calendarSerializer5.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer8 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass9 = calendarSerializer8.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember10 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass4, calendarClass6, "", calendarClass9);
        com.fasterxml.jackson.databind.type.SimpleType simpleType11 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass9);
        boolean boolean12 = simpleType11.isPrimitive();
        boolean boolean13 = simpleType11.isContainerType();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass14 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer15 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass16 = calendarSerializer15.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer18 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass19 = calendarSerializer18.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember20 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass14, calendarClass16, "", calendarClass19);
        com.fasterxml.jackson.databind.JavaType javaType21 = impl3.constructSpecializedType((com.fasterxml.jackson.databind.JavaType) simpleType11, calendarClass16);
        com.fasterxml.jackson.databind.node.BooleanNode booleanNode23 = com.fasterxml.jackson.databind.node.BooleanNode.TRUE;
        com.fasterxml.jackson.core.JsonToken jsonToken24 = booleanNode23.asToken();
        short short25 = booleanNode23.shortValue();
        java.lang.Object[] objArray27 = new java.lang.Object[] { booleanNode23, 17 };
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException28 = impl3.mappingException("hi!", objArray27);
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer29 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass30 = calendarSerializer29.handledType();
        java.lang.Class<?> wildcardClass31 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) calendarClass30);
        com.fasterxml.jackson.databind.JsonNode jsonNode33 = serializableSerializer2.getSchema((com.fasterxml.jackson.databind.SerializerProvider) impl3, (java.lang.reflect.Type) calendarClass30, false);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass34 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer35 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass36 = calendarSerializer35.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer38 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass39 = calendarSerializer38.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember40 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass34, calendarClass36, "", calendarClass39);
        com.fasterxml.jackson.databind.type.SimpleType simpleType41 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass39);
        boolean boolean42 = simpleType41.isPrimitive();
        boolean boolean43 = simpleType41.isContainerType();
        java.lang.String str44 = simpleType41.toCanonical();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer45 = null;
        com.fasterxml.jackson.databind.ser.std.DateSerializer dateSerializer46 = com.fasterxml.jackson.databind.ser.std.DateSerializer.instance;
        java.text.DateFormat dateFormat48 = null;
        com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase<java.util.Date> dateDateTimeSerializerBase49 = dateSerializer46.withFormat((java.lang.Boolean) true, dateFormat48);
        com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer typeWrappedSerializer50 = new com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer(typeSerializer45, (com.fasterxml.jackson.databind.JsonSerializer<java.util.Date>) dateSerializer46);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode52 = dateSerializer46.createSchemaNode("");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass53 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer54 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass55 = calendarSerializer54.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer57 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass58 = calendarSerializer57.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember59 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass53, calendarClass55, "", calendarClass58);
        com.fasterxml.jackson.databind.type.SimpleType simpleType60 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass58);
        boolean boolean61 = simpleType60.isPrimitive();
        boolean boolean62 = simpleType60.isContainerType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType64 = simpleType60.withTypeHandler((java.lang.Object) "hi!");
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer65 = null;
        com.fasterxml.jackson.databind.ObjectWriter.Prefetch prefetch66 = com.fasterxml.jackson.databind.ObjectWriter.Prefetch.construct((com.fasterxml.jackson.databind.JavaType) simpleType60, typeSerializer65);
        com.fasterxml.jackson.databind.type.ArrayType arrayType67 = com.fasterxml.jackson.databind.type.ArrayType.construct((com.fasterxml.jackson.databind.JavaType) simpleType41, (java.lang.Object) "", (java.lang.Object) simpleType60);
        com.fasterxml.jackson.databind.JsonNode jsonNode68 = indexedStringListSerializer0.getSchema((com.fasterxml.jackson.databind.SerializerProvider) impl3, (java.lang.reflect.Type) arrayType67);
        java.lang.String str69 = arrayType67.toString();
        org.junit.Assert.assertNotNull(indexedStringListSerializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(calendarClass6);
        org.junit.Assert.assertNotNull(calendarClass9);
        org.junit.Assert.assertNotNull(simpleType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(calendarClass16);
        org.junit.Assert.assertNotNull(calendarClass19);
        org.junit.Assert.assertNotNull(javaType21);
        org.junit.Assert.assertNotNull(booleanNode23);
        org.junit.Assert.assertTrue("'" + jsonToken24 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken24.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 0 + "'", short25 == (short) 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[true, 17]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[true, 17]");
        org.junit.Assert.assertNotNull(jsonMappingException28);
        org.junit.Assert.assertNotNull(calendarClass30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(jsonNode33);
        org.junit.Assert.assertNotNull(calendarClass36);
        org.junit.Assert.assertNotNull(calendarClass39);
        org.junit.Assert.assertNotNull(simpleType41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "java.util.Calendar" + "'", str44, "java.util.Calendar");
        org.junit.Assert.assertNotNull(dateSerializer46);
        org.junit.Assert.assertNotNull(dateDateTimeSerializerBase49);
        org.junit.Assert.assertNotNull(objectNode52);
        org.junit.Assert.assertNotNull(calendarClass55);
        org.junit.Assert.assertNotNull(calendarClass58);
        org.junit.Assert.assertNotNull(simpleType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(simpleType64);
        org.junit.Assert.assertNotNull(prefetch66);
        org.junit.Assert.assertNotNull(arrayType67);
        org.junit.Assert.assertNotNull(jsonNode68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "[array type, component type: [simple type, class java.util.Calendar]]" + "'", str69, "[array type, component type: [simple type, class java.util.Calendar]]");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember0 = null;
        com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition simpleBeanPropertyDefinition2 = new com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition(annotatedMember0, "");
        java.lang.String str3 = simpleBeanPropertyDefinition2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer0 = com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer.instance;
        boolean boolean1 = indexedStringListSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.ser.std.SerializableSerializer serializableSerializer2 = new com.fasterxml.jackson.databind.ser.std.SerializableSerializer();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass4 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer5 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass6 = calendarSerializer5.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer8 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass9 = calendarSerializer8.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember10 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass4, calendarClass6, "", calendarClass9);
        com.fasterxml.jackson.databind.type.SimpleType simpleType11 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass9);
        boolean boolean12 = simpleType11.isPrimitive();
        boolean boolean13 = simpleType11.isContainerType();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass14 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer15 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass16 = calendarSerializer15.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer18 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass19 = calendarSerializer18.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember20 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass14, calendarClass16, "", calendarClass19);
        com.fasterxml.jackson.databind.JavaType javaType21 = impl3.constructSpecializedType((com.fasterxml.jackson.databind.JavaType) simpleType11, calendarClass16);
        com.fasterxml.jackson.databind.node.BooleanNode booleanNode23 = com.fasterxml.jackson.databind.node.BooleanNode.TRUE;
        com.fasterxml.jackson.core.JsonToken jsonToken24 = booleanNode23.asToken();
        short short25 = booleanNode23.shortValue();
        java.lang.Object[] objArray27 = new java.lang.Object[] { booleanNode23, 17 };
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException28 = impl3.mappingException("hi!", objArray27);
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer29 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass30 = calendarSerializer29.handledType();
        java.lang.Class<?> wildcardClass31 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) calendarClass30);
        com.fasterxml.jackson.databind.JsonNode jsonNode33 = serializableSerializer2.getSchema((com.fasterxml.jackson.databind.SerializerProvider) impl3, (java.lang.reflect.Type) calendarClass30, false);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass34 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer35 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass36 = calendarSerializer35.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer38 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass39 = calendarSerializer38.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember40 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass34, calendarClass36, "", calendarClass39);
        com.fasterxml.jackson.databind.type.SimpleType simpleType41 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass39);
        boolean boolean42 = simpleType41.isPrimitive();
        boolean boolean43 = simpleType41.isContainerType();
        java.lang.String str44 = simpleType41.toCanonical();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer45 = null;
        com.fasterxml.jackson.databind.ser.std.DateSerializer dateSerializer46 = com.fasterxml.jackson.databind.ser.std.DateSerializer.instance;
        java.text.DateFormat dateFormat48 = null;
        com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase<java.util.Date> dateDateTimeSerializerBase49 = dateSerializer46.withFormat((java.lang.Boolean) true, dateFormat48);
        com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer typeWrappedSerializer50 = new com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer(typeSerializer45, (com.fasterxml.jackson.databind.JsonSerializer<java.util.Date>) dateSerializer46);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode52 = dateSerializer46.createSchemaNode("");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass53 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer54 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass55 = calendarSerializer54.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer57 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass58 = calendarSerializer57.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember59 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass53, calendarClass55, "", calendarClass58);
        com.fasterxml.jackson.databind.type.SimpleType simpleType60 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass58);
        boolean boolean61 = simpleType60.isPrimitive();
        boolean boolean62 = simpleType60.isContainerType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType64 = simpleType60.withTypeHandler((java.lang.Object) "hi!");
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer65 = null;
        com.fasterxml.jackson.databind.ObjectWriter.Prefetch prefetch66 = com.fasterxml.jackson.databind.ObjectWriter.Prefetch.construct((com.fasterxml.jackson.databind.JavaType) simpleType60, typeSerializer65);
        com.fasterxml.jackson.databind.type.ArrayType arrayType67 = com.fasterxml.jackson.databind.type.ArrayType.construct((com.fasterxml.jackson.databind.JavaType) simpleType41, (java.lang.Object) "", (java.lang.Object) simpleType60);
        com.fasterxml.jackson.databind.JsonNode jsonNode68 = indexedStringListSerializer0.getSchema((com.fasterxml.jackson.databind.SerializerProvider) impl3, (java.lang.reflect.Type) arrayType67);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass69 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer70 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass71 = calendarSerializer70.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer73 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass74 = calendarSerializer73.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember75 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass69, calendarClass71, "", calendarClass74);
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer76 = new com.fasterxml.jackson.databind.ser.std.ToStringSerializer(calendarClass74);
        com.fasterxml.jackson.annotation.JsonFormat.Value value77 = null;
        java.lang.Boolean boolean79 = com.fasterxml.jackson.databind.ser.std.EnumSerializer._isShapeWrittenUsingIndex(calendarClass74, value77, false);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType80 = arrayType67.widenBy(calendarClass74);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incompatible narrowing operation: trying to narrow [array type, component type: [simple type, class java.util.Calendar]] to class java.util.Calendar");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexedStringListSerializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(calendarClass6);
        org.junit.Assert.assertNotNull(calendarClass9);
        org.junit.Assert.assertNotNull(simpleType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(calendarClass16);
        org.junit.Assert.assertNotNull(calendarClass19);
        org.junit.Assert.assertNotNull(javaType21);
        org.junit.Assert.assertNotNull(booleanNode23);
        org.junit.Assert.assertTrue("'" + jsonToken24 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken24.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 0 + "'", short25 == (short) 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[true, 17]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[true, 17]");
        org.junit.Assert.assertNotNull(jsonMappingException28);
        org.junit.Assert.assertNotNull(calendarClass30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(jsonNode33);
        org.junit.Assert.assertNotNull(calendarClass36);
        org.junit.Assert.assertNotNull(calendarClass39);
        org.junit.Assert.assertNotNull(simpleType41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "java.util.Calendar" + "'", str44, "java.util.Calendar");
        org.junit.Assert.assertNotNull(dateSerializer46);
        org.junit.Assert.assertNotNull(dateDateTimeSerializerBase49);
        org.junit.Assert.assertNotNull(objectNode52);
        org.junit.Assert.assertNotNull(calendarClass55);
        org.junit.Assert.assertNotNull(calendarClass58);
        org.junit.Assert.assertNotNull(simpleType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(simpleType64);
        org.junit.Assert.assertNotNull(prefetch66);
        org.junit.Assert.assertNotNull(arrayType67);
        org.junit.Assert.assertNotNull(jsonNode68);
        org.junit.Assert.assertNotNull(calendarClass71);
        org.junit.Assert.assertNotNull(calendarClass74);
        org.junit.Assert.assertNull(boolean79);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass1 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer2 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass3 = calendarSerializer2.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer5 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass6 = calendarSerializer5.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass1, calendarClass3, "", calendarClass6);
        com.fasterxml.jackson.databind.type.SimpleType simpleType8 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass6);
        boolean boolean9 = simpleType8.isPrimitive();
        boolean boolean10 = simpleType8.isContainerType();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass11 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer12 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass13 = calendarSerializer12.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer15 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass16 = calendarSerializer15.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass11, calendarClass13, "", calendarClass16);
        com.fasterxml.jackson.databind.JavaType javaType18 = impl0.constructSpecializedType((com.fasterxml.jackson.databind.JavaType) simpleType8, calendarClass13);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass19 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer20 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass21 = calendarSerializer20.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer23 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass24 = calendarSerializer23.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember25 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass19, calendarClass21, "", calendarClass24);
        com.fasterxml.jackson.databind.ser.std.ToStringSerializer toStringSerializer26 = new com.fasterxml.jackson.databind.ser.std.ToStringSerializer(calendarClass24);
        com.fasterxml.jackson.annotation.JsonFormat.Value value27 = null;
        java.lang.Boolean boolean29 = com.fasterxml.jackson.databind.ser.std.EnumSerializer._isShapeWrittenUsingIndex(calendarClass24, value27, false);
        com.fasterxml.jackson.databind.type.SimpleType simpleType30 = simpleType8.withTypeHandler((java.lang.Object) boolean29);
        com.fasterxml.jackson.databind.MappingJsonFactory mappingJsonFactory31 = new com.fasterxml.jackson.databind.MappingJsonFactory();
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes32 = mappingJsonFactory31.getCharacterEscapes();
        java.lang.String str33 = mappingJsonFactory31.getRootValueSeparator();
        java.io.OutputStream outputStream34 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator35 = mappingJsonFactory31.createGenerator(outputStream34);
        com.fasterxml.jackson.databind.ser.std.SerializableSerializer serializableSerializer36 = new com.fasterxml.jackson.databind.ser.std.SerializableSerializer();
        boolean boolean37 = serializableSerializer36.usesObjectId();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl38 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass39 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer40 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass41 = calendarSerializer40.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer43 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass44 = calendarSerializer43.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember45 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass39, calendarClass41, "", calendarClass44);
        com.fasterxml.jackson.databind.type.SimpleType simpleType46 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass44);
        boolean boolean47 = simpleType46.isPrimitive();
        com.fasterxml.jackson.databind.JsonNode jsonNode48 = serializableSerializer36.getSchema((com.fasterxml.jackson.databind.SerializerProvider) impl38, (java.lang.reflect.Type) simpleType46);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer49 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleType8.serializeWithType(jsonGenerator35, (com.fasterxml.jackson.databind.SerializerProvider) impl38, typeSerializer49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendarClass3);
        org.junit.Assert.assertNotNull(calendarClass6);
        org.junit.Assert.assertNotNull(simpleType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(calendarClass13);
        org.junit.Assert.assertNotNull(calendarClass16);
        org.junit.Assert.assertNotNull(javaType18);
        org.junit.Assert.assertNotNull(calendarClass21);
        org.junit.Assert.assertNotNull(calendarClass24);
        org.junit.Assert.assertNull(boolean29);
        org.junit.Assert.assertNotNull(simpleType30);
        org.junit.Assert.assertNull(characterEscapes32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + " " + "'", str33, " ");
        org.junit.Assert.assertNotNull(jsonGenerator35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(calendarClass41);
        org.junit.Assert.assertNotNull(calendarClass44);
        org.junit.Assert.assertNotNull(simpleType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(jsonNode48);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector0, annotationIntrospector1);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector3 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector4 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector5 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector3, annotationIntrospector4);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector6 = com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.create(annotationIntrospector1, annotationIntrospector5);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass7 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer8 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass9 = calendarSerializer8.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer11 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass12 = calendarSerializer11.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember13 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass7, calendarClass9, "", calendarClass12);
        boolean boolean15 = virtualAnnotatedMember13.equals((java.lang.Object) 17);
        java.lang.String str16 = virtualAnnotatedMember13.getName();
        com.fasterxml.jackson.annotation.JsonInclude.Include include17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonInclude.Include include18 = annotationIntrospector5.findSerializationInclusion((com.fasterxml.jackson.databind.introspect.Annotated) virtualAnnotatedMember13, include17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(annotationIntrospector5);
        org.junit.Assert.assertNotNull(annotationIntrospector6);
        org.junit.Assert.assertNotNull(calendarClass9);
        org.junit.Assert.assertNotNull(calendarClass12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer0 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        boolean boolean1 = calendarSerializer0.isUnwrappingSerializer();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer0 = null;
        com.fasterxml.jackson.databind.ser.std.DateSerializer dateSerializer1 = com.fasterxml.jackson.databind.ser.std.DateSerializer.instance;
        java.text.DateFormat dateFormat3 = null;
        com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase<java.util.Date> dateDateTimeSerializerBase4 = dateSerializer1.withFormat((java.lang.Boolean) true, dateFormat3);
        com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer typeWrappedSerializer5 = new com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer(typeSerializer0, (com.fasterxml.jackson.databind.JsonSerializer<java.util.Date>) dateSerializer1);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = dateSerializer1.createSchemaNode("");
        com.fasterxml.jackson.databind.node.ValueNode valueNode9 = objectNode7.numberNode((java.lang.Byte) (byte) 10);
        com.fasterxml.jackson.databind.node.ValueNode valueNode11 = objectNode7.numberNode((int) (short) 10);
        com.fasterxml.jackson.databind.node.NumericNode numericNode13 = objectNode7.numberNode((byte) 10);
        org.junit.Assert.assertNotNull(dateSerializer1);
        org.junit.Assert.assertNotNull(dateDateTimeSerializerBase4);
        org.junit.Assert.assertNotNull(objectNode7);
        org.junit.Assert.assertNotNull(valueNode9);
        org.junit.Assert.assertNotNull(valueNode11);
        org.junit.Assert.assertNotNull(numericNode13);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass0 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer1 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass2 = calendarSerializer1.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer4 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass5 = calendarSerializer4.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember6 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass0, calendarClass2, "", calendarClass5);
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass5);
        boolean boolean8 = simpleType7.isPrimitive();
        boolean boolean9 = simpleType7.isContainerType();
        java.lang.String str10 = simpleType7.toCanonical();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer11 = null;
        com.fasterxml.jackson.databind.ser.std.DateSerializer dateSerializer12 = com.fasterxml.jackson.databind.ser.std.DateSerializer.instance;
        java.text.DateFormat dateFormat14 = null;
        com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase<java.util.Date> dateDateTimeSerializerBase15 = dateSerializer12.withFormat((java.lang.Boolean) true, dateFormat14);
        com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer typeWrappedSerializer16 = new com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer(typeSerializer11, (com.fasterxml.jackson.databind.JsonSerializer<java.util.Date>) dateSerializer12);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode18 = dateSerializer12.createSchemaNode("");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass19 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer20 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass21 = calendarSerializer20.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer23 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass24 = calendarSerializer23.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember25 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass19, calendarClass21, "", calendarClass24);
        com.fasterxml.jackson.databind.type.SimpleType simpleType26 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass24);
        boolean boolean27 = simpleType26.isPrimitive();
        boolean boolean28 = simpleType26.isContainerType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType30 = simpleType26.withTypeHandler((java.lang.Object) "hi!");
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer31 = null;
        com.fasterxml.jackson.databind.ObjectWriter.Prefetch prefetch32 = com.fasterxml.jackson.databind.ObjectWriter.Prefetch.construct((com.fasterxml.jackson.databind.JavaType) simpleType26, typeSerializer31);
        com.fasterxml.jackson.databind.type.ArrayType arrayType33 = com.fasterxml.jackson.databind.type.ArrayType.construct((com.fasterxml.jackson.databind.JavaType) simpleType7, (java.lang.Object) "", (java.lang.Object) simpleType26);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl34 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass35 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer36 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass37 = calendarSerializer36.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer39 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass40 = calendarSerializer39.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember41 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass35, calendarClass37, "", calendarClass40);
        com.fasterxml.jackson.databind.type.SimpleType simpleType42 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass40);
        boolean boolean43 = simpleType42.isPrimitive();
        boolean boolean44 = simpleType42.isContainerType();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass45 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer46 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass47 = calendarSerializer46.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer49 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass50 = calendarSerializer49.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember51 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass45, calendarClass47, "", calendarClass50);
        com.fasterxml.jackson.databind.JavaType javaType52 = impl34.constructSpecializedType((com.fasterxml.jackson.databind.JavaType) simpleType42, calendarClass47);
        com.fasterxml.jackson.databind.JavaType javaType53 = arrayType33.widenContentsBy(calendarClass47);
        com.fasterxml.jackson.databind.node.BooleanNode booleanNode54 = com.fasterxml.jackson.databind.node.BooleanNode.getFalse();
        boolean boolean56 = booleanNode54.equals((java.lang.Object) 100L);
        boolean boolean57 = booleanNode54.isFloatingPointNumber();
        com.fasterxml.jackson.databind.type.ArrayType arrayType58 = arrayType33.withContentTypeHandler((java.lang.Object) boolean57);
        java.lang.String str59 = arrayType33.toString();
        org.junit.Assert.assertNotNull(calendarClass2);
        org.junit.Assert.assertNotNull(calendarClass5);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.util.Calendar" + "'", str10, "java.util.Calendar");
        org.junit.Assert.assertNotNull(dateSerializer12);
        org.junit.Assert.assertNotNull(dateDateTimeSerializerBase15);
        org.junit.Assert.assertNotNull(objectNode18);
        org.junit.Assert.assertNotNull(calendarClass21);
        org.junit.Assert.assertNotNull(calendarClass24);
        org.junit.Assert.assertNotNull(simpleType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(simpleType30);
        org.junit.Assert.assertNotNull(prefetch32);
        org.junit.Assert.assertNotNull(arrayType33);
        org.junit.Assert.assertNotNull(calendarClass37);
        org.junit.Assert.assertNotNull(calendarClass40);
        org.junit.Assert.assertNotNull(simpleType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(calendarClass47);
        org.junit.Assert.assertNotNull(calendarClass50);
        org.junit.Assert.assertNotNull(javaType52);
        org.junit.Assert.assertNotNull(javaType53);
        org.junit.Assert.assertNotNull(booleanNode54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(arrayType58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "[array type, component type: [simple type, class java.util.Calendar]]" + "'", str59, "[array type, component type: [simple type, class java.util.Calendar]]");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = stdDateFormat0.clone();
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = stdDateFormat0.parse("com.fasterxml.jackson.databind.node.LongNode[?]", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
        org.junit.Assert.assertNotNull(stdDateFormat1);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.fasterxml.jackson.databind.deser.Deserializers.Base base0 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType1 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig2 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription3 = null;
        com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer4 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer5 = null;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer6 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = base0.findMapLikeDeserializer(mapLikeType1, deserializationConfig2, beanDescription3, keyDeserializer4, typeDeserializer5, (com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer6);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType8 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription10 = null;
        com.fasterxml.jackson.databind.deser.Deserializers.Base base11 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
        com.fasterxml.jackson.databind.type.MapType mapType12 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig13 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription14 = null;
        com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer15 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer16 = null;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer17 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer18 = stringArrayDeserializer17.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer19 = base11.findMapDeserializer(mapType12, deserializationConfig13, beanDescription14, keyDeserializer15, typeDeserializer16, (com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer17);
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer20 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass21 = calendarSerializer20.handledType();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig22 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription23 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer24 = base11.findEnumDeserializer(calendarClass21, deserializationConfig22, beanDescription23);
        com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer stdKeyDeserializer25 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(calendarClass21);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer26 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer27 = null;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer28 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer29 = stringArrayDeserializer28.getDelegatee();
        com.fasterxml.jackson.databind.deser.Deserializers.Base base30 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
        com.fasterxml.jackson.databind.type.MapType mapType31 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig32 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription33 = null;
        com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer34 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer35 = null;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer36 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer37 = stringArrayDeserializer36.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer38 = base30.findMapDeserializer(mapType31, deserializationConfig32, beanDescription33, keyDeserializer34, typeDeserializer35, (com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer36);
        com.fasterxml.jackson.databind.deser.Deserializers.Base base39 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
        com.fasterxml.jackson.databind.type.MapType mapType40 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig41 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription42 = null;
        com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer43 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer44 = null;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer45 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer46 = stringArrayDeserializer45.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer47 = base39.findMapDeserializer(mapType40, deserializationConfig41, beanDescription42, keyDeserializer43, typeDeserializer44, (com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer45);
        com.fasterxml.jackson.databind.type.CollectionType collectionType48 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig49 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription50 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer51 = null;
        com.fasterxml.jackson.databind.deser.Deserializers.Base base52 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType53 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig54 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription55 = null;
        com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer56 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer57 = null;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer58 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer59 = base52.findMapLikeDeserializer(mapLikeType53, deserializationConfig54, beanDescription55, keyDeserializer56, typeDeserializer57, (com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer58);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer60 = base39.findCollectionDeserializer(collectionType48, deserializationConfig49, beanDescription50, typeDeserializer51, (com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer58);
        com.fasterxml.jackson.databind.deser.Deserializers.Base base61 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType62 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig63 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription64 = null;
        com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer65 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer66 = null;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer67 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer68 = base61.findMapLikeDeserializer(mapLikeType62, deserializationConfig63, beanDescription64, keyDeserializer65, typeDeserializer66, (com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer67);
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer69 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(untypedObjectDeserializer27, (com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer28, (com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer36, (com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer58, (com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer67);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer70 = base0.findMapLikeDeserializer(mapLikeType8, deserializationConfig9, beanDescription10, (com.fasterxml.jackson.databind.KeyDeserializer) stdKeyDeserializer25, typeDeserializer26, (com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer28);
        org.junit.Assert.assertNotNull(stringArrayDeserializer6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(stringArrayDeserializer17);
        org.junit.Assert.assertNull(wildcardJsonDeserializer18);
        org.junit.Assert.assertNull(wildcardJsonDeserializer19);
        org.junit.Assert.assertNotNull(calendarClass21);
        org.junit.Assert.assertNull(wildcardJsonDeserializer24);
        org.junit.Assert.assertNotNull(stdKeyDeserializer25);
        org.junit.Assert.assertNotNull(stringArrayDeserializer28);
        org.junit.Assert.assertNull(wildcardJsonDeserializer29);
        org.junit.Assert.assertNotNull(stringArrayDeserializer36);
        org.junit.Assert.assertNull(wildcardJsonDeserializer37);
        org.junit.Assert.assertNull(wildcardJsonDeserializer38);
        org.junit.Assert.assertNotNull(stringArrayDeserializer45);
        org.junit.Assert.assertNull(wildcardJsonDeserializer46);
        org.junit.Assert.assertNull(wildcardJsonDeserializer47);
        org.junit.Assert.assertNotNull(stringArrayDeserializer58);
        org.junit.Assert.assertNull(wildcardJsonDeserializer59);
        org.junit.Assert.assertNull(wildcardJsonDeserializer60);
        org.junit.Assert.assertNotNull(stringArrayDeserializer67);
        org.junit.Assert.assertNull(wildcardJsonDeserializer68);
        org.junit.Assert.assertNull(wildcardJsonDeserializer70);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.fasterxml.jackson.databind.node.LongNode longNode1 = new com.fasterxml.jackson.databind.node.LongNode((long) (-1));
        double double2 = longNode1.asDouble();
        boolean boolean3 = longNode1.isBoolean();
        com.fasterxml.jackson.databind.node.TreeTraversingParser treeTraversingParser4 = new com.fasterxml.jackson.databind.node.TreeTraversingParser((com.fasterxml.jackson.databind.JsonNode) longNode1);
        int int5 = treeTraversingParser4.getTextOffset();
        float float6 = treeTraversingParser4.getFloatValue();
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException8 = com.fasterxml.jackson.databind.JsonMappingException.from((com.fasterxml.jackson.core.JsonParser) treeTraversingParser4, "JSON");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.ClassUtil.throwAsIAE((java.lang.Throwable) jsonMappingException8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: JSON? at [Source: N/A; line: -1, column: -1]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        org.junit.Assert.assertNotNull(jsonMappingException8);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer unwrappingBeanSerializer0 = null;
        com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter objectIdWriter1 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass2 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer3 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass4 = calendarSerializer3.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer6 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass7 = calendarSerializer6.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember8 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass2, calendarClass4, "", calendarClass7);
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass7);
        boolean boolean10 = simpleType9.isPrimitive();
        boolean boolean11 = simpleType9.isContainerType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType13 = simpleType9.withTypeHandler((java.lang.Object) "hi!");
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer14 = null;
        com.fasterxml.jackson.databind.ObjectWriter.Prefetch prefetch15 = com.fasterxml.jackson.databind.ObjectWriter.Prefetch.construct((com.fasterxml.jackson.databind.JavaType) simpleType9, typeSerializer14);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer unwrappingBeanSerializer16 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(unwrappingBeanSerializer0, objectIdWriter1, (java.lang.Object) simpleType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendarClass4);
        org.junit.Assert.assertNotNull(calendarClass7);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(simpleType13);
        org.junit.Assert.assertNotNull(prefetch15);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass1 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer2 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass3 = calendarSerializer2.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer5 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass6 = calendarSerializer5.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass1, calendarClass3, "", calendarClass6);
        com.fasterxml.jackson.databind.type.SimpleType simpleType8 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass6);
        boolean boolean9 = simpleType8.isPrimitive();
        boolean boolean10 = simpleType8.isContainerType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = simpleType8.withTypeHandler((java.lang.Object) "hi!");
        com.fasterxml.jackson.databind.PropertyName propertyName13 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer14 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations15 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter16 = null;
        com.fasterxml.jackson.databind.ser.std.DateSerializer dateSerializer18 = com.fasterxml.jackson.databind.ser.std.DateSerializer.instance;
        java.text.DateFormat dateFormat20 = null;
        com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase<java.util.Date> dateDateTimeSerializerBase21 = dateSerializer18.withFormat((java.lang.Boolean) true, dateFormat20);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode22 = dateDateTimeSerializerBase21.createObjectNode();
        java.math.BigInteger bigInteger23 = null;
        com.fasterxml.jackson.databind.node.NumericNode numericNode24 = objectNode22.numberNode(bigInteger23);
        com.fasterxml.jackson.databind.deser.CreatorProperty creatorProperty26 = new com.fasterxml.jackson.databind.deser.CreatorProperty("JSON", (com.fasterxml.jackson.databind.JavaType) simpleType8, propertyName13, typeDeserializer14, annotations15, annotatedParameter16, (int) (byte) -1, (java.lang.Object) numericNode24, true);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory28 = new com.fasterxml.jackson.databind.node.JsonNodeFactory(false);
        com.fasterxml.jackson.databind.node.NumericNode numericNode30 = jsonNodeFactory28.numberNode(0.0f);
        com.fasterxml.jackson.databind.node.NumericNode numericNode32 = jsonNodeFactory28.numberNode((byte) -1);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer33 = com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer.instance;
        boolean boolean34 = indexedStringListSerializer33.usesObjectId();
        // The following exception was thrown during execution in test generation
        try {
            creatorProperty26.set((java.lang.Object) jsonNodeFactory28, (java.lang.Object) boolean34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No fallback setter/field defined: can not use creator property for com.fasterxml.jackson.databind.deser.CreatorProperty");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendarClass3);
        org.junit.Assert.assertNotNull(calendarClass6);
        org.junit.Assert.assertNotNull(simpleType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(dateSerializer18);
        org.junit.Assert.assertNotNull(dateDateTimeSerializerBase21);
        org.junit.Assert.assertNotNull(objectNode22);
        org.junit.Assert.assertNotNull(numericNode24);
        org.junit.Assert.assertNotNull(numericNode30);
        org.junit.Assert.assertNotNull(numericNode32);
        org.junit.Assert.assertNotNull(indexedStringListSerializer33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = floatSerializer0.getDelegatee();
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer0 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        com.fasterxml.jackson.databind.ser.std.SerializableSerializer serializableSerializer1 = new com.fasterxml.jackson.databind.ser.std.SerializableSerializer();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass3 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer4 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass5 = calendarSerializer4.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer7 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass8 = calendarSerializer7.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember9 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass3, calendarClass5, "", calendarClass8);
        com.fasterxml.jackson.databind.type.SimpleType simpleType10 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass8);
        boolean boolean11 = simpleType10.isPrimitive();
        boolean boolean12 = simpleType10.isContainerType();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass13 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer14 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass15 = calendarSerializer14.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer17 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass18 = calendarSerializer17.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember19 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass13, calendarClass15, "", calendarClass18);
        com.fasterxml.jackson.databind.JavaType javaType20 = impl2.constructSpecializedType((com.fasterxml.jackson.databind.JavaType) simpleType10, calendarClass15);
        com.fasterxml.jackson.databind.node.BooleanNode booleanNode22 = com.fasterxml.jackson.databind.node.BooleanNode.TRUE;
        com.fasterxml.jackson.core.JsonToken jsonToken23 = booleanNode22.asToken();
        short short24 = booleanNode22.shortValue();
        java.lang.Object[] objArray26 = new java.lang.Object[] { booleanNode22, 17 };
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException27 = impl2.mappingException("hi!", objArray26);
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer28 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass29 = calendarSerializer28.handledType();
        java.lang.Class<?> wildcardClass30 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) calendarClass29);
        com.fasterxml.jackson.databind.JsonNode jsonNode32 = serializableSerializer1.getSchema((com.fasterxml.jackson.databind.SerializerProvider) impl2, (java.lang.reflect.Type) calendarClass29, false);
        java.lang.reflect.Type type33 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode35 = calendarSerializer0.getSchema((com.fasterxml.jackson.databind.SerializerProvider) impl2, type33, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendarClass5);
        org.junit.Assert.assertNotNull(calendarClass8);
        org.junit.Assert.assertNotNull(simpleType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(calendarClass15);
        org.junit.Assert.assertNotNull(calendarClass18);
        org.junit.Assert.assertNotNull(javaType20);
        org.junit.Assert.assertNotNull(booleanNode22);
        org.junit.Assert.assertTrue("'" + jsonToken23 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken23.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 0 + "'", short24 == (short) 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[true, 17]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[true, 17]");
        org.junit.Assert.assertNotNull(jsonMappingException27);
        org.junit.Assert.assertNotNull(calendarClass29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(jsonNode32);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass0 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer1 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass2 = calendarSerializer1.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer4 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass5 = calendarSerializer4.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember6 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass0, calendarClass2, "", calendarClass5);
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass5);
        boolean boolean8 = simpleType7.isPrimitive();
        boolean boolean9 = simpleType7.isContainerType();
        java.lang.String str10 = simpleType7.toCanonical();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer11 = null;
        com.fasterxml.jackson.databind.ser.std.DateSerializer dateSerializer12 = com.fasterxml.jackson.databind.ser.std.DateSerializer.instance;
        java.text.DateFormat dateFormat14 = null;
        com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase<java.util.Date> dateDateTimeSerializerBase15 = dateSerializer12.withFormat((java.lang.Boolean) true, dateFormat14);
        com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer typeWrappedSerializer16 = new com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer(typeSerializer11, (com.fasterxml.jackson.databind.JsonSerializer<java.util.Date>) dateSerializer12);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode18 = dateSerializer12.createSchemaNode("");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass19 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer20 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass21 = calendarSerializer20.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer23 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass24 = calendarSerializer23.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember25 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass19, calendarClass21, "", calendarClass24);
        com.fasterxml.jackson.databind.type.SimpleType simpleType26 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass24);
        boolean boolean27 = simpleType26.isPrimitive();
        boolean boolean28 = simpleType26.isContainerType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType30 = simpleType26.withTypeHandler((java.lang.Object) "hi!");
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer31 = null;
        com.fasterxml.jackson.databind.ObjectWriter.Prefetch prefetch32 = com.fasterxml.jackson.databind.ObjectWriter.Prefetch.construct((com.fasterxml.jackson.databind.JavaType) simpleType26, typeSerializer31);
        com.fasterxml.jackson.databind.type.ArrayType arrayType33 = com.fasterxml.jackson.databind.type.ArrayType.construct((com.fasterxml.jackson.databind.JavaType) simpleType7, (java.lang.Object) "", (java.lang.Object) simpleType26);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass34 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer35 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass36 = calendarSerializer35.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer38 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass39 = calendarSerializer38.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember40 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass34, calendarClass36, "", calendarClass39);
        com.fasterxml.jackson.databind.type.SimpleType simpleType41 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass39);
        boolean boolean42 = simpleType41.isPrimitive();
        boolean boolean43 = simpleType41.isContainerType();
        java.lang.String str44 = simpleType41.toCanonical();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer45 = null;
        com.fasterxml.jackson.databind.ser.std.DateSerializer dateSerializer46 = com.fasterxml.jackson.databind.ser.std.DateSerializer.instance;
        java.text.DateFormat dateFormat48 = null;
        com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase<java.util.Date> dateDateTimeSerializerBase49 = dateSerializer46.withFormat((java.lang.Boolean) true, dateFormat48);
        com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer typeWrappedSerializer50 = new com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer(typeSerializer45, (com.fasterxml.jackson.databind.JsonSerializer<java.util.Date>) dateSerializer46);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode52 = dateSerializer46.createSchemaNode("");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass53 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer54 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass55 = calendarSerializer54.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer57 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass58 = calendarSerializer57.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember59 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass53, calendarClass55, "", calendarClass58);
        com.fasterxml.jackson.databind.type.SimpleType simpleType60 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass58);
        boolean boolean61 = simpleType60.isPrimitive();
        boolean boolean62 = simpleType60.isContainerType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType64 = simpleType60.withTypeHandler((java.lang.Object) "hi!");
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer65 = null;
        com.fasterxml.jackson.databind.ObjectWriter.Prefetch prefetch66 = com.fasterxml.jackson.databind.ObjectWriter.Prefetch.construct((com.fasterxml.jackson.databind.JavaType) simpleType60, typeSerializer65);
        com.fasterxml.jackson.databind.type.ArrayType arrayType67 = com.fasterxml.jackson.databind.type.ArrayType.construct((com.fasterxml.jackson.databind.JavaType) simpleType41, (java.lang.Object) "", (java.lang.Object) simpleType60);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl68 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass69 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer70 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass71 = calendarSerializer70.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer73 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass74 = calendarSerializer73.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember75 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass69, calendarClass71, "", calendarClass74);
        com.fasterxml.jackson.databind.type.SimpleType simpleType76 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass74);
        boolean boolean77 = simpleType76.isPrimitive();
        boolean boolean78 = simpleType76.isContainerType();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass79 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer80 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass81 = calendarSerializer80.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer83 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass84 = calendarSerializer83.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember85 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass79, calendarClass81, "", calendarClass84);
        com.fasterxml.jackson.databind.JavaType javaType86 = impl68.constructSpecializedType((com.fasterxml.jackson.databind.JavaType) simpleType76, calendarClass81);
        com.fasterxml.jackson.databind.JavaType javaType87 = arrayType67.widenContentsBy(calendarClass81);
        com.fasterxml.jackson.databind.JavaType javaType88 = simpleType7.forcedNarrowBy(calendarClass81);
        int int89 = simpleType7.containedTypeCount();
        org.junit.Assert.assertNotNull(calendarClass2);
        org.junit.Assert.assertNotNull(calendarClass5);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.util.Calendar" + "'", str10, "java.util.Calendar");
        org.junit.Assert.assertNotNull(dateSerializer12);
        org.junit.Assert.assertNotNull(dateDateTimeSerializerBase15);
        org.junit.Assert.assertNotNull(objectNode18);
        org.junit.Assert.assertNotNull(calendarClass21);
        org.junit.Assert.assertNotNull(calendarClass24);
        org.junit.Assert.assertNotNull(simpleType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(simpleType30);
        org.junit.Assert.assertNotNull(prefetch32);
        org.junit.Assert.assertNotNull(arrayType33);
        org.junit.Assert.assertNotNull(calendarClass36);
        org.junit.Assert.assertNotNull(calendarClass39);
        org.junit.Assert.assertNotNull(simpleType41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "java.util.Calendar" + "'", str44, "java.util.Calendar");
        org.junit.Assert.assertNotNull(dateSerializer46);
        org.junit.Assert.assertNotNull(dateDateTimeSerializerBase49);
        org.junit.Assert.assertNotNull(objectNode52);
        org.junit.Assert.assertNotNull(calendarClass55);
        org.junit.Assert.assertNotNull(calendarClass58);
        org.junit.Assert.assertNotNull(simpleType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(simpleType64);
        org.junit.Assert.assertNotNull(prefetch66);
        org.junit.Assert.assertNotNull(arrayType67);
        org.junit.Assert.assertNotNull(calendarClass71);
        org.junit.Assert.assertNotNull(calendarClass74);
        org.junit.Assert.assertNotNull(simpleType76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(calendarClass81);
        org.junit.Assert.assertNotNull(calendarClass84);
        org.junit.Assert.assertNotNull(javaType86);
        org.junit.Assert.assertNotNull(javaType87);
        org.junit.Assert.assertNotNull(javaType88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.fasterxml.jackson.databind.node.BooleanNode booleanNode0 = com.fasterxml.jackson.databind.node.BooleanNode.getFalse();
        boolean boolean2 = booleanNode0.equals((java.lang.Object) 100L);
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = booleanNode0.get((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode6 = booleanNode0.at("[field java.util.Calendar#]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid input: JSON Pointer expression must start with '/': \"[field java.util.Calendar#]\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanNode0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(jsonNode4);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer.instance;
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer1 = com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer.instance;
        boolean boolean2 = indexedStringListSerializer1.usesObjectId();
        com.fasterxml.jackson.databind.ser.std.SerializableSerializer serializableSerializer3 = new com.fasterxml.jackson.databind.ser.std.SerializableSerializer();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass5 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer6 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass7 = calendarSerializer6.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer9 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass10 = calendarSerializer9.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember11 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass5, calendarClass7, "", calendarClass10);
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass10);
        boolean boolean13 = simpleType12.isPrimitive();
        boolean boolean14 = simpleType12.isContainerType();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass15 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer16 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass17 = calendarSerializer16.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer19 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass20 = calendarSerializer19.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember21 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass15, calendarClass17, "", calendarClass20);
        com.fasterxml.jackson.databind.JavaType javaType22 = impl4.constructSpecializedType((com.fasterxml.jackson.databind.JavaType) simpleType12, calendarClass17);
        com.fasterxml.jackson.databind.node.BooleanNode booleanNode24 = com.fasterxml.jackson.databind.node.BooleanNode.TRUE;
        com.fasterxml.jackson.core.JsonToken jsonToken25 = booleanNode24.asToken();
        short short26 = booleanNode24.shortValue();
        java.lang.Object[] objArray28 = new java.lang.Object[] { booleanNode24, 17 };
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException29 = impl4.mappingException("hi!", objArray28);
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer30 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass31 = calendarSerializer30.handledType();
        java.lang.Class<?> wildcardClass32 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) calendarClass31);
        com.fasterxml.jackson.databind.JsonNode jsonNode34 = serializableSerializer3.getSchema((com.fasterxml.jackson.databind.SerializerProvider) impl4, (java.lang.reflect.Type) calendarClass31, false);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass35 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer36 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass37 = calendarSerializer36.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer39 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass40 = calendarSerializer39.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember41 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass35, calendarClass37, "", calendarClass40);
        com.fasterxml.jackson.databind.type.SimpleType simpleType42 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass40);
        boolean boolean43 = simpleType42.isPrimitive();
        boolean boolean44 = simpleType42.isContainerType();
        java.lang.String str45 = simpleType42.toCanonical();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer46 = null;
        com.fasterxml.jackson.databind.ser.std.DateSerializer dateSerializer47 = com.fasterxml.jackson.databind.ser.std.DateSerializer.instance;
        java.text.DateFormat dateFormat49 = null;
        com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase<java.util.Date> dateDateTimeSerializerBase50 = dateSerializer47.withFormat((java.lang.Boolean) true, dateFormat49);
        com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer typeWrappedSerializer51 = new com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer(typeSerializer46, (com.fasterxml.jackson.databind.JsonSerializer<java.util.Date>) dateSerializer47);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode53 = dateSerializer47.createSchemaNode("");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass54 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer55 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass56 = calendarSerializer55.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer58 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass59 = calendarSerializer58.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember60 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass54, calendarClass56, "", calendarClass59);
        com.fasterxml.jackson.databind.type.SimpleType simpleType61 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass59);
        boolean boolean62 = simpleType61.isPrimitive();
        boolean boolean63 = simpleType61.isContainerType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType65 = simpleType61.withTypeHandler((java.lang.Object) "hi!");
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer66 = null;
        com.fasterxml.jackson.databind.ObjectWriter.Prefetch prefetch67 = com.fasterxml.jackson.databind.ObjectWriter.Prefetch.construct((com.fasterxml.jackson.databind.JavaType) simpleType61, typeSerializer66);
        com.fasterxml.jackson.databind.type.ArrayType arrayType68 = com.fasterxml.jackson.databind.type.ArrayType.construct((com.fasterxml.jackson.databind.JavaType) simpleType42, (java.lang.Object) "", (java.lang.Object) simpleType61);
        com.fasterxml.jackson.databind.JsonNode jsonNode69 = indexedStringListSerializer1.getSchema((com.fasterxml.jackson.databind.SerializerProvider) impl4, (java.lang.reflect.Type) arrayType68);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl70 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass71 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer72 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass73 = calendarSerializer72.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer75 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass76 = calendarSerializer75.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember77 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass71, calendarClass73, "", calendarClass76);
        com.fasterxml.jackson.databind.type.SimpleType simpleType78 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(calendarClass76);
        boolean boolean79 = simpleType78.isPrimitive();
        boolean boolean80 = simpleType78.isContainerType();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass81 = null;
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer82 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass83 = calendarSerializer82.handledType();
        com.fasterxml.jackson.databind.ser.std.CalendarSerializer calendarSerializer85 = new com.fasterxml.jackson.databind.ser.std.CalendarSerializer();
        java.lang.Class<java.util.Calendar> calendarClass86 = calendarSerializer85.handledType();
        com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember virtualAnnotatedMember87 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(annotatedClass81, calendarClass83, "", calendarClass86);
        com.fasterxml.jackson.databind.JavaType javaType88 = impl70.constructSpecializedType((com.fasterxml.jackson.databind.JavaType) simpleType78, calendarClass83);
        com.fasterxml.jackson.databind.JsonNode jsonNode90 = shortSerializer0.getSchema((com.fasterxml.jackson.databind.SerializerProvider) impl4, (java.lang.reflect.Type) simpleType78, false);
        org.junit.Assert.assertNotNull(shortSerializer0);
        org.junit.Assert.assertNotNull(indexedStringListSerializer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(calendarClass7);
        org.junit.Assert.assertNotNull(calendarClass10);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(calendarClass17);
        org.junit.Assert.assertNotNull(calendarClass20);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(booleanNode24);
        org.junit.Assert.assertTrue("'" + jsonToken25 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken25.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) 0 + "'", short26 == (short) 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[true, 17]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[true, 17]");
        org.junit.Assert.assertNotNull(jsonMappingException29);
        org.junit.Assert.assertNotNull(calendarClass31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(jsonNode34);
        org.junit.Assert.assertNotNull(calendarClass37);
        org.junit.Assert.assertNotNull(calendarClass40);
        org.junit.Assert.assertNotNull(simpleType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "java.util.Calendar" + "'", str45, "java.util.Calendar");
        org.junit.Assert.assertNotNull(dateSerializer47);
        org.junit.Assert.assertNotNull(dateDateTimeSerializerBase50);
        org.junit.Assert.assertNotNull(objectNode53);
        org.junit.Assert.assertNotNull(calendarClass56);
        org.junit.Assert.assertNotNull(calendarClass59);
        org.junit.Assert.assertNotNull(simpleType61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(simpleType65);
        org.junit.Assert.assertNotNull(prefetch67);
        org.junit.Assert.assertNotNull(arrayType68);
        org.junit.Assert.assertNotNull(jsonNode69);
        org.junit.Assert.assertNotNull(calendarClass73);
        org.junit.Assert.assertNotNull(calendarClass76);
        org.junit.Assert.assertNotNull(simpleType78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(calendarClass83);
        org.junit.Assert.assertNotNull(calendarClass86);
        org.junit.Assert.assertNotNull(javaType88);
        org.junit.Assert.assertNotNull(jsonNode90);
    }
}


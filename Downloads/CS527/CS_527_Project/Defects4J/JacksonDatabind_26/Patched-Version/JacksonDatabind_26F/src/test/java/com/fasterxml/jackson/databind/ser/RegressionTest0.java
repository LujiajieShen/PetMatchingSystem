package com.fasterxml.jackson.databind.ser;

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
        com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition beanPropertyDefinition0 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations2 = null;
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicLongSerializer atomicLongSerializer4 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicLongSerializer();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter9 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyDefinition0, annotatedMember1, annotations2, javaType3, (com.fasterxml.jackson.databind.JsonSerializer<java.util.concurrent.atomic.AtomicLong>) atomicLongSerializer4, typeSerializer5, javaType6, true, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition beanPropertyDefinition0 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations2 = null;
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicLongSerializer atomicLongSerializer4 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicLongSerializer();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter9 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyDefinition0, annotatedMember1, annotations2, javaType3, (com.fasterxml.jackson.databind.JsonSerializer<java.util.concurrent.atomic.AtomicLong>) atomicLongSerializer4, typeSerializer5, javaType6, false, obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter1 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }
}


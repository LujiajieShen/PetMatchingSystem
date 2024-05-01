package com.google.gson;

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
        java.lang.reflect.Field field0 = null;
        java.lang.reflect.Type type1 = null;
        java.lang.reflect.Type type2 = null;
        java.lang.reflect.Type[] typeArray3 = new java.lang.reflect.Type[] { type2 };
        java.lang.reflect.Type type4 = null;
        com.google.gson.ParameterizedTypeImpl parameterizedTypeImpl5 = new com.google.gson.ParameterizedTypeImpl(type1, typeArray3, type4);
        boolean boolean7 = parameterizedTypeImpl5.equals((java.lang.Object) (byte) -1);
        java.lang.reflect.Type type8 = com.google.gson.TypeUtils.getActualTypeForFirstTypeVariable((java.lang.reflect.Type) parameterizedTypeImpl5);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.TypeInfo typeInfo9 = com.google.gson.TypeInfoFactory.getTypeInfoForField(field0, type8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type 'null' is not a Class, ParameterizedType, or GenericArrayType. Can't extract class.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(type8);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.google.gson.DefaultTypeAdapters.DoubleSerializer doubleSerializer1 = new com.google.gson.DefaultTypeAdapters.DoubleSerializer(false);
        com.google.gson.AnonymousAndLocalClassExclusionStrategy anonymousAndLocalClassExclusionStrategy3 = com.google.gson.Gson.DEFAULT_ANON_LOCAL_CLASS_EXCLUSION_STRATEGY;
        com.google.gson.JavaFieldNamingPolicy javaFieldNamingPolicy4 = new com.google.gson.JavaFieldNamingPolicy();
        com.google.gson.ObjectNavigatorFactory objectNavigatorFactory5 = new com.google.gson.ObjectNavigatorFactory((com.google.gson.ExclusionStrategy) anonymousAndLocalClassExclusionStrategy3, (com.google.gson.FieldNamingStrategy2) javaFieldNamingPolicy4);
        java.lang.reflect.Type type7 = null;
        java.lang.reflect.Type type8 = null;
        java.lang.reflect.Type[] typeArray9 = new java.lang.reflect.Type[] { type8 };
        java.lang.reflect.Type type10 = null;
        com.google.gson.ParameterizedTypeImpl parameterizedTypeImpl11 = new com.google.gson.ParameterizedTypeImpl(type7, typeArray9, type10);
        java.lang.annotation.Annotation[] annotationArray12 = new java.lang.annotation.Annotation[] {};
        java.util.ArrayList<java.lang.annotation.Annotation> annotationList13 = new java.util.ArrayList<java.lang.annotation.Annotation>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.annotation.Annotation>) annotationList13, annotationArray12);
        java.lang.String str15 = javaFieldNamingPolicy4.translateName("hi!", (java.lang.reflect.Type) parameterizedTypeImpl11, (java.util.Collection<java.lang.annotation.Annotation>) annotationList13);
        com.google.gson.JsonSerializationContext jsonSerializationContext16 = null;
        com.google.gson.JsonElement jsonElement17 = doubleSerializer1.serialize((java.lang.Double) 10.0d, (java.lang.reflect.Type) parameterizedTypeImpl11, jsonSerializationContext16);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.TypeInfoArray typeInfoArray18 = com.google.gson.TypeInfoFactory.getTypeInfoForArray((java.lang.reflect.Type) parameterizedTypeImpl11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: condition failed: false");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(anonymousAndLocalClassExclusionStrategy3);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(annotationArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(jsonElement17);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.lang.reflect.Type type0 = null;
        java.lang.reflect.Type type1 = null;
        java.lang.reflect.Type[] typeArray2 = new java.lang.reflect.Type[] { type1 };
        java.lang.reflect.Type type3 = null;
        com.google.gson.ParameterizedTypeImpl parameterizedTypeImpl4 = new com.google.gson.ParameterizedTypeImpl(type0, typeArray2, type3);
        boolean boolean6 = parameterizedTypeImpl4.equals((java.lang.Object) (byte) -1);
        java.lang.reflect.Type type7 = parameterizedTypeImpl4.getRawType();
        com.google.gson.GenericArrayTypeImpl genericArrayTypeImpl8 = new com.google.gson.GenericArrayTypeImpl((java.lang.reflect.Type) parameterizedTypeImpl4);
        java.lang.reflect.Type type9 = genericArrayTypeImpl8.getGenericComponentType();
        boolean boolean10 = com.google.gson.TypeUtils.isArray(type9);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.TypeInfoArray typeInfoArray11 = com.google.gson.TypeInfoFactory.getTypeInfoForArray(type9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: condition failed: false");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(type7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        java.lang.Object obj1 = null;
        java.lang.Appendable appendable2 = null;
        gson0.toJson(obj1, appendable2);
        java.lang.String str4 = gson0.toString();
        java.lang.reflect.Type type6 = null;
        java.lang.reflect.Type type7 = null;
        java.lang.reflect.Type[] typeArray8 = new java.lang.reflect.Type[] { type7 };
        java.lang.reflect.Type type9 = null;
        com.google.gson.ParameterizedTypeImpl parameterizedTypeImpl10 = new com.google.gson.ParameterizedTypeImpl(type6, typeArray8, type9);
        boolean boolean12 = parameterizedTypeImpl10.equals((java.lang.Object) (byte) -1);
        java.lang.reflect.Type type13 = parameterizedTypeImpl10.getRawType();
        com.google.gson.GenericArrayTypeImpl genericArrayTypeImpl14 = new com.google.gson.GenericArrayTypeImpl((java.lang.reflect.Type) parameterizedTypeImpl10);
        java.lang.reflect.Type type15 = genericArrayTypeImpl14.getGenericComponentType();
        boolean boolean16 = com.google.gson.TypeUtils.isArray(type15);
        com.google.gson.MappedObjectConstructor mappedObjectConstructor17 = gson0.fromJson("", type15);
        com.google.gson.JsonPrimitive jsonPrimitive19 = new com.google.gson.JsonPrimitive((java.lang.Character) '4');
        java.lang.String str20 = gson0.toJson((java.lang.Object) jsonPrimitive19);
        com.google.gson.AnonymousAndLocalClassExclusionStrategy anonymousAndLocalClassExclusionStrategy22 = com.google.gson.Gson.DEFAULT_ANON_LOCAL_CLASS_EXCLUSION_STRATEGY;
        com.google.gson.JavaFieldNamingPolicy javaFieldNamingPolicy23 = new com.google.gson.JavaFieldNamingPolicy();
        com.google.gson.ObjectNavigatorFactory objectNavigatorFactory24 = new com.google.gson.ObjectNavigatorFactory((com.google.gson.ExclusionStrategy) anonymousAndLocalClassExclusionStrategy22, (com.google.gson.FieldNamingStrategy2) javaFieldNamingPolicy23);
        java.lang.reflect.Type type26 = null;
        java.lang.reflect.Type type27 = null;
        java.lang.reflect.Type[] typeArray28 = new java.lang.reflect.Type[] { type27 };
        java.lang.reflect.Type type29 = null;
        com.google.gson.ParameterizedTypeImpl parameterizedTypeImpl30 = new com.google.gson.ParameterizedTypeImpl(type26, typeArray28, type29);
        java.lang.annotation.Annotation[] annotationArray31 = new java.lang.annotation.Annotation[] {};
        java.util.ArrayList<java.lang.annotation.Annotation> annotationList32 = new java.util.ArrayList<java.lang.annotation.Annotation>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.annotation.Annotation>) annotationList32, annotationArray31);
        java.lang.String str34 = javaFieldNamingPolicy23.translateName("hi!", (java.lang.reflect.Type) parameterizedTypeImpl30, (java.util.Collection<java.lang.annotation.Annotation>) annotationList32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = gson0.toJson((java.lang.Object) (short) 0, (java.lang.reflect.Type) parameterizedTypeImpl30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type 'null' is not a Class, ParameterizedType, or GenericArrayType. Can't extract class.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(type13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(mappedObjectConstructor17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{\"value\":\"4\"}" + "'", str20, "{\"value\":\"4\"}");
        org.junit.Assert.assertNotNull(anonymousAndLocalClassExclusionStrategy22);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(annotationArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        java.lang.Object obj1 = null;
        java.lang.Appendable appendable2 = null;
        gson0.toJson(obj1, appendable2);
        java.lang.String str4 = gson0.toString();
        java.lang.reflect.Type type6 = null;
        java.lang.reflect.Type type7 = null;
        java.lang.reflect.Type[] typeArray8 = new java.lang.reflect.Type[] { type7 };
        java.lang.reflect.Type type9 = null;
        com.google.gson.ParameterizedTypeImpl parameterizedTypeImpl10 = new com.google.gson.ParameterizedTypeImpl(type6, typeArray8, type9);
        boolean boolean12 = parameterizedTypeImpl10.equals((java.lang.Object) (byte) -1);
        java.lang.reflect.Type type13 = parameterizedTypeImpl10.getRawType();
        com.google.gson.GenericArrayTypeImpl genericArrayTypeImpl14 = new com.google.gson.GenericArrayTypeImpl((java.lang.reflect.Type) parameterizedTypeImpl10);
        java.lang.reflect.Type type15 = genericArrayTypeImpl14.getGenericComponentType();
        boolean boolean16 = com.google.gson.TypeUtils.isArray(type15);
        com.google.gson.MappedObjectConstructor mappedObjectConstructor17 = gson0.fromJson("", type15);
        com.google.gson.JsonPrimitive jsonPrimitive19 = new com.google.gson.JsonPrimitive((java.lang.Character) '4');
        java.lang.String str20 = gson0.toJson((java.lang.Object) jsonPrimitive19);
        java.lang.Appendable appendable22 = null;
        java.io.Writer writer23 = com.google.gson.Streams.writerForAppendable(appendable22);
        java.io.Writer writer24 = com.google.gson.Streams.writerForAppendable((java.lang.Appendable) writer23);
        com.google.gson.stream.JsonWriter jsonWriter25 = new com.google.gson.stream.JsonWriter(writer23);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.Streams.write((com.google.gson.JsonElement) jsonPrimitive19, false, jsonWriter25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JSON must start with an array or an object.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(type13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(mappedObjectConstructor17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{\"value\":\"4\"}" + "'", str20, "{\"value\":\"4\"}");
        org.junit.Assert.assertNotNull(writer23);
        org.junit.Assert.assertNotNull(writer24);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        java.lang.Object obj1 = null;
        java.lang.Appendable appendable2 = null;
        gson0.toJson(obj1, appendable2);
        java.lang.String str4 = gson0.toString();
        java.lang.reflect.Type type6 = null;
        java.lang.reflect.Type type7 = null;
        java.lang.reflect.Type[] typeArray8 = new java.lang.reflect.Type[] { type7 };
        java.lang.reflect.Type type9 = null;
        com.google.gson.ParameterizedTypeImpl parameterizedTypeImpl10 = new com.google.gson.ParameterizedTypeImpl(type6, typeArray8, type9);
        boolean boolean12 = parameterizedTypeImpl10.equals((java.lang.Object) (byte) -1);
        java.lang.reflect.Type type13 = parameterizedTypeImpl10.getRawType();
        com.google.gson.GenericArrayTypeImpl genericArrayTypeImpl14 = new com.google.gson.GenericArrayTypeImpl((java.lang.reflect.Type) parameterizedTypeImpl10);
        java.lang.reflect.Type type15 = genericArrayTypeImpl14.getGenericComponentType();
        boolean boolean16 = com.google.gson.TypeUtils.isArray(type15);
        com.google.gson.MappedObjectConstructor mappedObjectConstructor17 = gson0.fromJson("", type15);
        com.google.gson.JsonPrimitive jsonPrimitive19 = new com.google.gson.JsonPrimitive((java.lang.Character) '4');
        java.lang.String str20 = gson0.toJson((java.lang.Object) jsonPrimitive19);
        com.google.gson.JsonArray jsonArray21 = new com.google.gson.JsonArray();
        boolean boolean22 = jsonArray21.isJsonPrimitive();
        jsonArray21.reverse();
        java.util.Iterator<com.google.gson.JsonElement> jsonElementItor24 = jsonArray21.iterator();
        com.google.gson.JsonObject jsonObject25 = new com.google.gson.JsonObject();
        com.google.gson.JsonElement jsonElement27 = jsonObject25.remove("com.google.gson.stream.MalformedJsonException: ");
        com.google.gson.JsonElement jsonElement29 = jsonObject25.remove("");
        jsonArray21.add(jsonElement29);
        java.lang.Appendable appendable31 = null;
        java.io.Writer writer32 = com.google.gson.Streams.writerForAppendable(appendable31);
        java.io.Writer writer33 = com.google.gson.Streams.writerForAppendable((java.lang.Appendable) writer32);
        com.google.gson.stream.JsonWriter jsonWriter34 = new com.google.gson.stream.JsonWriter(writer32);
        // The following exception was thrown during execution in test generation
        try {
            gson0.toJson((com.google.gson.JsonElement) jsonArray21, jsonWriter34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(type13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(mappedObjectConstructor17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{\"value\":\"4\"}" + "'", str20, "{\"value\":\"4\"}");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(jsonElementItor24);
        org.junit.Assert.assertNull(jsonElement27);
        org.junit.Assert.assertNull(jsonElement29);
        org.junit.Assert.assertNotNull(writer32);
        org.junit.Assert.assertNotNull(writer33);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.lang.reflect.Field field0 = null;
        com.google.gson.JsonPrimitive jsonPrimitive2 = new com.google.gson.JsonPrimitive("100");
        java.lang.reflect.Type type3 = null;
        java.lang.reflect.Type type4 = null;
        java.lang.reflect.Type[] typeArray5 = new java.lang.reflect.Type[] { type4 };
        java.lang.reflect.Type type6 = null;
        com.google.gson.ParameterizedTypeImpl parameterizedTypeImpl7 = new com.google.gson.ParameterizedTypeImpl(type3, typeArray5, type6);
        boolean boolean9 = parameterizedTypeImpl7.equals((java.lang.Object) (byte) -1);
        java.lang.reflect.Type type10 = parameterizedTypeImpl7.getRawType();
        com.google.gson.GenericArrayTypeImpl genericArrayTypeImpl11 = new com.google.gson.GenericArrayTypeImpl((java.lang.reflect.Type) parameterizedTypeImpl7);
        com.google.gson.ObjectTypePair objectTypePair13 = new com.google.gson.ObjectTypePair((java.lang.Object) "100", (java.lang.reflect.Type) parameterizedTypeImpl7, true);
        java.lang.reflect.Type type14 = parameterizedTypeImpl7.getRawType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.TypeInfo typeInfo15 = com.google.gson.TypeInfoFactory.getTypeInfoForField(field0, type14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type 'null' is not a Class, ParameterizedType, or GenericArrayType. Can't extract class.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(type10);
        org.junit.Assert.assertNull(type14);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        java.lang.Object obj1 = null;
        java.lang.Appendable appendable2 = null;
        gson0.toJson(obj1, appendable2);
        java.lang.String str4 = gson0.toString();
        java.lang.reflect.Type type6 = null;
        java.lang.reflect.Type type7 = null;
        java.lang.reflect.Type[] typeArray8 = new java.lang.reflect.Type[] { type7 };
        java.lang.reflect.Type type9 = null;
        com.google.gson.ParameterizedTypeImpl parameterizedTypeImpl10 = new com.google.gson.ParameterizedTypeImpl(type6, typeArray8, type9);
        boolean boolean12 = parameterizedTypeImpl10.equals((java.lang.Object) (byte) -1);
        java.lang.reflect.Type type13 = parameterizedTypeImpl10.getRawType();
        com.google.gson.GenericArrayTypeImpl genericArrayTypeImpl14 = new com.google.gson.GenericArrayTypeImpl((java.lang.reflect.Type) parameterizedTypeImpl10);
        java.lang.reflect.Type type15 = genericArrayTypeImpl14.getGenericComponentType();
        boolean boolean16 = com.google.gson.TypeUtils.isArray(type15);
        com.google.gson.MappedObjectConstructor mappedObjectConstructor17 = gson0.fromJson("", type15);
        com.google.gson.JsonPrimitive jsonPrimitive19 = new com.google.gson.JsonPrimitive((java.lang.Character) '4');
        java.lang.String str20 = gson0.toJson((java.lang.Object) jsonPrimitive19);
        boolean boolean21 = jsonPrimitive19.isBoolean();
        short short22 = jsonPrimitive19.getAsShort();
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(type13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(mappedObjectConstructor17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{\"value\":\"4\"}" + "'", str20, "{\"value\":\"4\"}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 4 + "'", short22 == (short) 4);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        java.lang.Object obj1 = null;
        java.lang.Appendable appendable2 = null;
        gson0.toJson(obj1, appendable2);
        java.lang.String str4 = gson0.toString();
        java.lang.reflect.Type type6 = null;
        java.lang.reflect.Type type7 = null;
        java.lang.reflect.Type[] typeArray8 = new java.lang.reflect.Type[] { type7 };
        java.lang.reflect.Type type9 = null;
        com.google.gson.ParameterizedTypeImpl parameterizedTypeImpl10 = new com.google.gson.ParameterizedTypeImpl(type6, typeArray8, type9);
        boolean boolean12 = parameterizedTypeImpl10.equals((java.lang.Object) (byte) -1);
        java.lang.reflect.Type type13 = parameterizedTypeImpl10.getRawType();
        com.google.gson.GenericArrayTypeImpl genericArrayTypeImpl14 = new com.google.gson.GenericArrayTypeImpl((java.lang.reflect.Type) parameterizedTypeImpl10);
        java.lang.reflect.Type type15 = genericArrayTypeImpl14.getGenericComponentType();
        boolean boolean16 = com.google.gson.TypeUtils.isArray(type15);
        com.google.gson.MappedObjectConstructor mappedObjectConstructor17 = gson0.fromJson("", type15);
        com.google.gson.JsonPrimitive jsonPrimitive19 = new com.google.gson.JsonPrimitive((java.lang.Character) '4');
        java.lang.String str20 = gson0.toJson((java.lang.Object) jsonPrimitive19);
        boolean boolean21 = jsonPrimitive19.isNumber();
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(type13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(mappedObjectConstructor17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{\"value\":\"4\"}" + "'", str20, "{\"value\":\"4\"}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        java.lang.Object obj1 = null;
        java.lang.Appendable appendable2 = null;
        gson0.toJson(obj1, appendable2);
        java.lang.String str4 = gson0.toString();
        java.lang.reflect.Type type6 = null;
        java.lang.reflect.Type type7 = null;
        java.lang.reflect.Type[] typeArray8 = new java.lang.reflect.Type[] { type7 };
        java.lang.reflect.Type type9 = null;
        com.google.gson.ParameterizedTypeImpl parameterizedTypeImpl10 = new com.google.gson.ParameterizedTypeImpl(type6, typeArray8, type9);
        boolean boolean12 = parameterizedTypeImpl10.equals((java.lang.Object) (byte) -1);
        java.lang.reflect.Type type13 = parameterizedTypeImpl10.getRawType();
        com.google.gson.GenericArrayTypeImpl genericArrayTypeImpl14 = new com.google.gson.GenericArrayTypeImpl((java.lang.reflect.Type) parameterizedTypeImpl10);
        java.lang.reflect.Type type15 = genericArrayTypeImpl14.getGenericComponentType();
        boolean boolean16 = com.google.gson.TypeUtils.isArray(type15);
        com.google.gson.MappedObjectConstructor mappedObjectConstructor17 = gson0.fromJson("", type15);
        com.google.gson.JsonPrimitive jsonPrimitive19 = new com.google.gson.JsonPrimitive((java.lang.Character) '4');
        java.lang.String str20 = gson0.toJson((java.lang.Object) jsonPrimitive19);
        com.google.gson.LongSerializationPolicy longSerializationPolicy21 = com.google.gson.LongSerializationPolicy.DEFAULT;
        com.google.gson.JsonElement jsonElement23 = longSerializationPolicy21.serialize((java.lang.Long) 0L);
        com.google.gson.JsonPrimitive jsonPrimitive24 = jsonElement23.getAsJsonPrimitive();
        java.lang.Appendable appendable25 = null;
        java.io.Writer writer26 = com.google.gson.Streams.writerForAppendable(appendable25);
        java.io.Writer writer27 = com.google.gson.Streams.writerForAppendable((java.lang.Appendable) writer26);
        java.io.Writer writer28 = com.google.gson.Streams.writerForAppendable((java.lang.Appendable) writer26);
        com.google.gson.stream.JsonWriter jsonWriter29 = new com.google.gson.stream.JsonWriter(writer26);
        // The following exception was thrown during execution in test generation
        try {
            gson0.toJson((java.lang.Object) jsonElement23, (java.lang.Appendable) writer26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(type13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(mappedObjectConstructor17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{\"value\":\"4\"}" + "'", str20, "{\"value\":\"4\"}");
        org.junit.Assert.assertTrue("'" + longSerializationPolicy21 + "' != '" + com.google.gson.LongSerializationPolicy.DEFAULT + "'", longSerializationPolicy21.equals(com.google.gson.LongSerializationPolicy.DEFAULT));
        org.junit.Assert.assertNotNull(jsonElement23);
        org.junit.Assert.assertNotNull(jsonPrimitive24);
        org.junit.Assert.assertNotNull(writer26);
        org.junit.Assert.assertNotNull(writer27);
        org.junit.Assert.assertNotNull(writer28);
    }
}


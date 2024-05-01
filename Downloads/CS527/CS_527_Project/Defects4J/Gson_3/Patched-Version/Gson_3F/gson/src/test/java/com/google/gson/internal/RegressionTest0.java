package com.google.gson.internal;

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
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.stream.JsonReader jsonReader1 = null;
        com.google.gson.stream.MalformedJsonException malformedJsonException3 = new com.google.gson.stream.MalformedJsonException("");
        java.lang.Throwable[] throwableArray4 = malformedJsonException3.getSuppressed();
        java.lang.Class<?> wildcardClass5 = malformedJsonException3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.io.IOException iOException6 = gson0.fromJson(jsonReader1, (java.lang.reflect.Type) wildcardClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        java.lang.String str1 = gson0.toString();
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        java.lang.Object obj1 = null;
        com.google.gson.JsonElement jsonElement2 = gson0.toJsonTree(obj1);
        org.junit.Assert.assertNotNull(jsonElement2);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.JsonArray jsonArray1 = new com.google.gson.JsonArray();
        int int2 = jsonArray1.size();
        int int3 = jsonArray1.size();
        jsonArray1.add((java.lang.Character) 'a');
        com.google.gson.JsonObject jsonObject6 = new com.google.gson.JsonObject();
        com.google.gson.JsonPrimitive jsonPrimitive8 = jsonObject6.getAsJsonPrimitive("hi!");
        java.lang.Throwable throwable9 = null;
        com.google.gson.stream.MalformedJsonException malformedJsonException10 = new com.google.gson.stream.MalformedJsonException(throwable9);
        java.lang.Throwable throwable11 = null;
        com.google.gson.stream.MalformedJsonException malformedJsonException12 = new com.google.gson.stream.MalformedJsonException(throwable11);
        malformedJsonException10.addSuppressed((java.lang.Throwable) malformedJsonException12);
        boolean boolean14 = jsonObject6.equals((java.lang.Object) malformedJsonException12);
        jsonObject6.addProperty("$", (java.lang.Boolean) true);
        boolean boolean18 = jsonArray1.remove((com.google.gson.JsonElement) jsonObject6);
        com.google.gson.JsonElement jsonElement20 = jsonObject6.get("JsonTreeReader");
        com.google.gson.stream.MalformedJsonException malformedJsonException22 = new com.google.gson.stream.MalformedJsonException("");
        java.lang.Throwable[] throwableArray23 = malformedJsonException22.getSuppressed();
        java.lang.Class<?> wildcardClass24 = malformedJsonException22.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement25 = gson0.toJsonTree((java.lang.Object) "JsonTreeReader", (java.lang.reflect.Type) wildcardClass24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not set java.lang.String field java.lang.Throwable.detailMessage to java.lang.String");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(jsonPrimitive8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(jsonElement20);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.TypeAdapter<java.lang.Throwable[]> throwableArrayTypeAdapter1 = null;
        java.lang.Class<java.lang.Throwable[]> throwableArrayClass2 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]> throwableArrayArrayTypeAdapter3 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]>(gson0, throwableArrayTypeAdapter1, throwableArrayClass2);
        java.io.Reader reader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = throwableArrayArrayTypeAdapter3.fromJson(reader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test6");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.TypeAdapter<java.lang.Throwable[]> throwableArrayTypeAdapter1 = null;
        java.lang.Class<java.lang.Throwable[]> throwableArrayClass2 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]> throwableArrayArrayTypeAdapter3 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]>(gson0, throwableArrayTypeAdapter1, throwableArrayClass2);
        com.google.gson.JsonArray jsonArray4 = new com.google.gson.JsonArray();
        int int5 = jsonArray4.size();
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader6 = new com.google.gson.internal.bind.JsonTreeReader((com.google.gson.JsonElement) jsonArray4);
        jsonTreeReader6.setLenient(true);
        com.google.gson.stream.JsonToken jsonToken9 = jsonTreeReader6.peek();
        com.google.gson.JsonElement jsonElement10 = gson0.toJsonTree((java.lang.Object) jsonToken9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + jsonToken9 + "' != '" + com.google.gson.stream.JsonToken.BEGIN_ARRAY + "'", jsonToken9.equals(com.google.gson.stream.JsonToken.BEGIN_ARRAY));
        org.junit.Assert.assertNotNull(jsonElement10);
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test7");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.TypeAdapter<java.lang.Throwable[]> throwableArrayTypeAdapter1 = null;
        java.lang.Class<java.lang.Throwable[]> throwableArrayClass2 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]> throwableArrayArrayTypeAdapter3 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]>(gson0, throwableArrayTypeAdapter1, throwableArrayClass2);
        com.google.gson.Gson gson4 = new com.google.gson.Gson();
        java.lang.Appendable appendable5 = null;
        java.io.Writer writer6 = com.google.gson.internal.Streams.writerForAppendable(appendable5);
        com.google.gson.stream.JsonWriter jsonWriter7 = new com.google.gson.stream.JsonWriter(writer6);
        com.google.gson.stream.JsonWriter jsonWriter8 = gson4.newJsonWriter(writer6);
        com.google.gson.JsonNull jsonNull9 = new com.google.gson.JsonNull();
        boolean boolean10 = jsonNull9.isJsonPrimitive();
        boolean boolean11 = jsonNull9.isJsonNull();
        com.google.gson.JsonArray jsonArray12 = new com.google.gson.JsonArray();
        int int13 = jsonArray12.size();
        int int14 = jsonArray12.size();
        jsonArray12.add((java.lang.Character) 'a');
        jsonArray12.add((java.lang.Boolean) true);
        boolean boolean19 = jsonArray12.isJsonArray();
        jsonArray12.add((java.lang.Character) 'a');
        boolean boolean22 = jsonNull9.equals((java.lang.Object) jsonArray12);
        // The following exception was thrown during execution in test generation
        try {
            throwableArrayArrayTypeAdapter3.toJson(writer6, (java.lang.Object) jsonNull9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(writer6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test8");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.internal.Excluder excluder1 = new com.google.gson.internal.Excluder();
        com.google.gson.internal.Excluder excluder2 = excluder1.disableInnerClassSerialization();
        com.google.gson.internal.Excluder excluder4 = excluder1.withVersion(100.0d);
        com.google.gson.internal.Excluder excluder6 = excluder4.withVersion((double) (byte) 0);
        java.lang.String str7 = gson0.toJson((java.lang.Object) excluder4);
        java.lang.String str8 = gson0.toString();
        com.google.gson.JsonNull jsonNull9 = new com.google.gson.JsonNull();
        boolean boolean10 = jsonNull9.isJsonPrimitive();
        boolean boolean11 = jsonNull9.isJsonNull();
        com.google.gson.JsonArray jsonArray12 = new com.google.gson.JsonArray();
        int int13 = jsonArray12.size();
        int int14 = jsonArray12.size();
        jsonArray12.add((java.lang.Character) 'a');
        jsonArray12.add((java.lang.Boolean) true);
        boolean boolean19 = jsonArray12.isJsonArray();
        jsonArray12.add((java.lang.Character) 'a');
        boolean boolean22 = jsonNull9.equals((java.lang.Object) jsonArray12);
        java.lang.String str23 = gson0.toJson((com.google.gson.JsonElement) jsonNull9);
        org.junit.Assert.assertNotNull(excluder2);
        org.junit.Assert.assertNotNull(excluder4);
        org.junit.Assert.assertNotNull(excluder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}" + "'", str7, "{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "null" + "'", str23, "null");
    }
}


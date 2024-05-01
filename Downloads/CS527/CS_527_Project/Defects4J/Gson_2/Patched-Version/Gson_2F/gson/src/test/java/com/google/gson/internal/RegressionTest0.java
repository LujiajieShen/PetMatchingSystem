package com.google.gson.internal.bind;

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
        com.google.gson.JsonSyntaxException jsonSyntaxException1 = new com.google.gson.JsonSyntaxException("hi!");
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.internal.ConstructorConstructor constructorConstructor1 = null;
        com.google.gson.internal.bind.MapTypeAdapterFactory mapTypeAdapterFactory3 = new com.google.gson.internal.bind.MapTypeAdapterFactory(constructorConstructor1, true);
        java.lang.String str4 = gson0.toJson((java.lang.Object) constructorConstructor1);
        com.google.gson.JsonPrimitive jsonPrimitive6 = new com.google.gson.JsonPrimitive((java.lang.Boolean) false);
        boolean boolean7 = jsonPrimitive6.isString();
        java.lang.String str8 = jsonPrimitive6.getAsString();
        boolean boolean9 = jsonPrimitive6.isJsonPrimitive();
        java.lang.Appendable appendable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            gson0.toJson((java.lang.Object) boolean9, appendable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "false" + "'", str8, "false");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        java.lang.Object obj1 = null;
        java.lang.Appendable appendable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            gson0.toJson(obj1, appendable2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.internal.ConstructorConstructor constructorConstructor1 = null;
        com.google.gson.internal.bind.MapTypeAdapterFactory mapTypeAdapterFactory3 = new com.google.gson.internal.bind.MapTypeAdapterFactory(constructorConstructor1, true);
        java.lang.String str4 = gson0.toJson((java.lang.Object) constructorConstructor1);
        java.lang.Object obj5 = null;
        com.google.gson.JsonElement jsonElement6 = gson0.toJsonTree(obj5);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertNotNull(jsonElement6);
    }
}


package org.apache.commons.collections4.map;

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
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap1 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean2 = exceptionMap0.containsValue((java.lang.Object) exceptionMap1);
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet3 = exceptionMap1.entrySet();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap4 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap5 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean6 = exceptionMap4.containsValue((java.lang.Object) exceptionMap5);
        java.lang.Throwable throwable8 = null;
        org.apache.commons.collections4.FunctorException functorException9 = new org.apache.commons.collections4.FunctorException("", throwable8);
        java.lang.Throwable throwable16 = null;
        org.apache.commons.collections4.FunctorException functorException17 = new org.apache.commons.collections4.FunctorException("", throwable16);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap18 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap19 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean20 = exceptionMap18.containsValue((java.lang.Object) exceptionMap19);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap23 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection24 = exceptionMap23.values();
        int int25 = exceptionMap23.size();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap27 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection28 = exceptionMap27.values();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap29 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap30 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean31 = exceptionMap29.containsValue((java.lang.Object) exceptionMap30);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap36 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap37 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean38 = exceptionMap36.containsValue((java.lang.Object) exceptionMap37);
        int int39 = exceptionMap37.size();
        java.lang.Throwable throwable48 = null;
        org.apache.commons.collections4.FunctorException functorException49 = new org.apache.commons.collections4.FunctorException("", throwable48);
        org.apache.commons.collections4.FunctorException functorException50 = new org.apache.commons.collections4.FunctorException("", throwable48);
        java.io.Serializable[] serializableArray51 = new java.io.Serializable[] { (short) -1, 10L, 10.0d, (short) 100, (-1), throwable16, exceptionMap18, 0L, 0L, exceptionMap23, 0, exceptionMap27, exceptionMap29, (short) 1, ' ', "hi!", 100.0f, int39, false, 10.0f, '4', (-1), 1L, 1, throwable48 };
        java.util.ArrayList<java.io.Serializable> serializableList52 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList52, serializableArray51);
        boolean boolean54 = exceptionMap4.putAll((java.lang.Exception) functorException9, (java.util.Collection<java.io.Serializable>) serializableList52);
        boolean boolean56 = exceptionMap1.removeMapping((java.lang.Exception) functorException9, (java.io.Serializable) (-1.0f));
        org.apache.commons.collections4.MapIterator<java.lang.Exception, java.lang.Object> exceptionItor57 = exceptionMap1.mapIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Exception exception58 = exceptionItor57.getKey();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(exceptionEntrySet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objCollection24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objCollection28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(serializableArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(exceptionItor57);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.collections4.FunctorException functorException2 = new org.apache.commons.collections4.FunctorException("", throwable1);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap3 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap4 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean5 = exceptionMap3.containsValue((java.lang.Object) exceptionMap4);
        java.lang.Throwable throwable7 = null;
        org.apache.commons.collections4.FunctorException functorException8 = new org.apache.commons.collections4.FunctorException("", throwable7);
        java.lang.Throwable throwable15 = null;
        org.apache.commons.collections4.FunctorException functorException16 = new org.apache.commons.collections4.FunctorException("", throwable15);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap17 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap18 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean19 = exceptionMap17.containsValue((java.lang.Object) exceptionMap18);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap22 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection23 = exceptionMap22.values();
        int int24 = exceptionMap22.size();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap26 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection27 = exceptionMap26.values();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap28 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap29 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean30 = exceptionMap28.containsValue((java.lang.Object) exceptionMap29);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap35 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap36 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean37 = exceptionMap35.containsValue((java.lang.Object) exceptionMap36);
        int int38 = exceptionMap36.size();
        java.lang.Throwable throwable47 = null;
        org.apache.commons.collections4.FunctorException functorException48 = new org.apache.commons.collections4.FunctorException("", throwable47);
        org.apache.commons.collections4.FunctorException functorException49 = new org.apache.commons.collections4.FunctorException("", throwable47);
        java.io.Serializable[] serializableArray50 = new java.io.Serializable[] { (short) -1, 10L, 10.0d, (short) 100, (-1), throwable15, exceptionMap17, 0L, 0L, exceptionMap22, 0, exceptionMap26, exceptionMap28, (short) 1, ' ', "hi!", 100.0f, int38, false, 10.0f, '4', (-1), 1L, 1, throwable47 };
        java.util.ArrayList<java.io.Serializable> serializableList51 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList51, serializableArray50);
        boolean boolean53 = exceptionMap3.putAll((java.lang.Exception) functorException8, (java.util.Collection<java.io.Serializable>) serializableList51);
        functorException2.addSuppressed((java.lang.Throwable) functorException8);
        java.lang.Throwable throwable55 = null;
        // The following exception was thrown during execution in test generation
        try {
            functorException2.addSuppressed(throwable55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objCollection23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objCollection27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(serializableArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap1 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean2 = exceptionMap0.containsValue((java.lang.Object) exceptionMap1);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap3 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap4 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean5 = exceptionMap3.containsValue((java.lang.Object) exceptionMap4);
        exceptionMap1.putAll((java.util.Map<java.lang.Exception, java.lang.Object>) exceptionMap4);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap7 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection8 = exceptionMap7.values();
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet9 = exceptionMap7.entrySet();
        java.lang.Object obj10 = null;
        boolean boolean11 = exceptionMap4.containsValue((java.lang.Object) exceptionEntrySet9, obj10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertNotNull(exceptionEntrySet9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap1 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean2 = exceptionMap0.containsValue((java.lang.Object) exceptionMap1);
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet3 = exceptionMap1.entrySet();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap4 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap5 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean6 = exceptionMap4.containsValue((java.lang.Object) exceptionMap5);
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet7 = exceptionMap5.entrySet();
        java.util.Map<java.lang.Exception, java.lang.Object> exceptionMap8 = exceptionMap5.map;
        int int9 = exceptionMap8.size();
        java.lang.Object obj10 = exceptionMap1.remove((java.lang.Object) int9);
        java.lang.Throwable throwable13 = null;
        org.apache.commons.collections4.FunctorException functorException14 = new org.apache.commons.collections4.FunctorException("", throwable13);
        org.apache.commons.collections4.FunctorException functorException15 = new org.apache.commons.collections4.FunctorException("", throwable13);
        org.apache.commons.collections4.FunctorException functorException17 = new org.apache.commons.collections4.FunctorException("");
        functorException15.addSuppressed((java.lang.Throwable) functorException17);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap19 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap20 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean21 = exceptionMap19.containsValue((java.lang.Object) exceptionMap20);
        boolean boolean23 = exceptionMap20.containsKey((java.lang.Object) (short) 10);
        java.util.Collection<java.io.Serializable> serializableCollection25 = exceptionMap20.createCollection(10);
        boolean boolean26 = exceptionMap1.putAll((java.lang.Exception) functorException17, serializableCollection25);
        java.lang.Object obj27 = null;
        boolean boolean28 = exceptionMap1.containsValue(obj27);
        boolean boolean30 = exceptionMap1.containsKey((java.lang.Object) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(exceptionEntrySet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(exceptionEntrySet7);
        org.junit.Assert.assertNotNull(exceptionMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(serializableCollection25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap1 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean2 = exceptionMap0.containsValue((java.lang.Object) exceptionMap1);
        int int3 = exceptionMap1.size();
        java.util.Collection<java.lang.Object> objCollection4 = exceptionMap1.values();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap5 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap6 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean7 = exceptionMap5.containsValue((java.lang.Object) exceptionMap6);
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet8 = exceptionMap6.entrySet();
        exceptionMap1.putAll((java.util.Map<java.lang.Exception, java.lang.Object>) exceptionMap6);
        java.util.Collection<java.io.Serializable> serializableCollection11 = exceptionMap6.createCollection(1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(exceptionEntrySet8);
        org.junit.Assert.assertNotNull(serializableCollection11);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap1 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean2 = exceptionMap0.containsValue((java.lang.Object) exceptionMap1);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap3 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap4 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap5 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean6 = exceptionMap4.containsValue((java.lang.Object) exceptionMap5);
        int int7 = exceptionMap5.size();
        java.util.Collection<java.lang.Object> objCollection8 = exceptionMap5.values();
        java.util.Collection<java.lang.Object> objCollection9 = exceptionMap5.values();
        java.lang.Object obj10 = exceptionMap3.remove((java.lang.Object) objCollection9);
        java.lang.Object obj11 = exceptionMap0.get((java.lang.Object) objCollection9);
        java.lang.Object obj13 = exceptionMap0.remove((java.lang.Object) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertNotNull(objCollection9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection1 = exceptionMap0.values();
        int int2 = exceptionMap0.size();
        boolean boolean4 = exceptionMap0.containsValue((java.lang.Object) true);
        java.lang.Throwable throwable6 = null;
        org.apache.commons.collections4.FunctorException functorException7 = new org.apache.commons.collections4.FunctorException("", throwable6);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap8 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap9 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean10 = exceptionMap8.containsValue((java.lang.Object) exceptionMap9);
        java.lang.Throwable throwable12 = null;
        org.apache.commons.collections4.FunctorException functorException13 = new org.apache.commons.collections4.FunctorException("", throwable12);
        java.lang.Throwable throwable20 = null;
        org.apache.commons.collections4.FunctorException functorException21 = new org.apache.commons.collections4.FunctorException("", throwable20);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap22 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap23 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean24 = exceptionMap22.containsValue((java.lang.Object) exceptionMap23);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap27 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection28 = exceptionMap27.values();
        int int29 = exceptionMap27.size();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap31 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection32 = exceptionMap31.values();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap33 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap34 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean35 = exceptionMap33.containsValue((java.lang.Object) exceptionMap34);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap40 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap41 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean42 = exceptionMap40.containsValue((java.lang.Object) exceptionMap41);
        int int43 = exceptionMap41.size();
        java.lang.Throwable throwable52 = null;
        org.apache.commons.collections4.FunctorException functorException53 = new org.apache.commons.collections4.FunctorException("", throwable52);
        org.apache.commons.collections4.FunctorException functorException54 = new org.apache.commons.collections4.FunctorException("", throwable52);
        java.io.Serializable[] serializableArray55 = new java.io.Serializable[] { (short) -1, 10L, 10.0d, (short) 100, (-1), throwable20, exceptionMap22, 0L, 0L, exceptionMap27, 0, exceptionMap31, exceptionMap33, (short) 1, ' ', "hi!", 100.0f, int43, false, 10.0f, '4', (-1), 1L, 1, throwable52 };
        java.util.ArrayList<java.io.Serializable> serializableList56 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList56, serializableArray55);
        boolean boolean58 = exceptionMap8.putAll((java.lang.Exception) functorException13, (java.util.Collection<java.io.Serializable>) serializableList56);
        functorException7.addSuppressed((java.lang.Throwable) functorException13);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap60 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Map<java.lang.Exception, java.lang.Object> exceptionMap61 = exceptionMap60.decorated();
        boolean boolean62 = exceptionMap0.removeMapping((java.lang.Exception) functorException7, (java.io.Serializable) exceptionMap60);
        org.junit.Assert.assertNotNull(objCollection1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objCollection28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objCollection32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(serializableArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(exceptionMap61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap1 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean2 = exceptionMap0.containsValue((java.lang.Object) exceptionMap1);
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet3 = exceptionMap1.entrySet();
        exceptionMap1.clear();
        boolean boolean5 = exceptionMap1.isEmpty();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap6 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Map<java.lang.Exception, java.lang.Object> exceptionMap7 = exceptionMap6.decorated();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap8 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap9 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean10 = exceptionMap8.containsValue((java.lang.Object) exceptionMap9);
        boolean boolean11 = exceptionMap7.containsValue((java.lang.Object) exceptionMap9);
        java.lang.Object obj12 = exceptionMap1.get((java.lang.Object) exceptionMap9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(exceptionEntrySet3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(exceptionMap7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap1 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean2 = exceptionMap0.containsValue((java.lang.Object) exceptionMap1);
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet3 = exceptionMap1.entrySet();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap4 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap5 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean6 = exceptionMap4.containsValue((java.lang.Object) exceptionMap5);
        java.lang.Throwable throwable8 = null;
        org.apache.commons.collections4.FunctorException functorException9 = new org.apache.commons.collections4.FunctorException("", throwable8);
        java.lang.Throwable throwable16 = null;
        org.apache.commons.collections4.FunctorException functorException17 = new org.apache.commons.collections4.FunctorException("", throwable16);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap18 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap19 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean20 = exceptionMap18.containsValue((java.lang.Object) exceptionMap19);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap23 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection24 = exceptionMap23.values();
        int int25 = exceptionMap23.size();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap27 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection28 = exceptionMap27.values();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap29 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap30 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean31 = exceptionMap29.containsValue((java.lang.Object) exceptionMap30);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap36 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap37 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean38 = exceptionMap36.containsValue((java.lang.Object) exceptionMap37);
        int int39 = exceptionMap37.size();
        java.lang.Throwable throwable48 = null;
        org.apache.commons.collections4.FunctorException functorException49 = new org.apache.commons.collections4.FunctorException("", throwable48);
        org.apache.commons.collections4.FunctorException functorException50 = new org.apache.commons.collections4.FunctorException("", throwable48);
        java.io.Serializable[] serializableArray51 = new java.io.Serializable[] { (short) -1, 10L, 10.0d, (short) 100, (-1), throwable16, exceptionMap18, 0L, 0L, exceptionMap23, 0, exceptionMap27, exceptionMap29, (short) 1, ' ', "hi!", 100.0f, int39, false, 10.0f, '4', (-1), 1L, 1, throwable48 };
        java.util.ArrayList<java.io.Serializable> serializableList52 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList52, serializableArray51);
        boolean boolean54 = exceptionMap4.putAll((java.lang.Exception) functorException9, (java.util.Collection<java.io.Serializable>) serializableList52);
        boolean boolean56 = exceptionMap1.removeMapping((java.lang.Exception) functorException9, (java.io.Serializable) (-1.0f));
        org.apache.commons.collections4.MapIterator<java.lang.Exception, java.lang.Object> exceptionItor57 = exceptionMap1.mapIterator();
        boolean boolean58 = exceptionItor57.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Exception exception59 = exceptionItor57.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(exceptionEntrySet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objCollection24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objCollection28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(serializableArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(exceptionItor57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap1 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean2 = exceptionMap0.containsValue((java.lang.Object) exceptionMap1);
        int int3 = exceptionMap1.size();
        java.util.Collection<java.lang.Object> objCollection4 = exceptionMap1.values();
        int int5 = exceptionMap1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection1 = exceptionMap0.values();
        int int2 = exceptionMap0.size();
        java.lang.Throwable throwable4 = null;
        org.apache.commons.collections4.FunctorException functorException5 = new org.apache.commons.collections4.FunctorException("", throwable4);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap6 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap7 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean8 = exceptionMap6.containsValue((java.lang.Object) exceptionMap7);
        java.lang.Throwable throwable10 = null;
        org.apache.commons.collections4.FunctorException functorException11 = new org.apache.commons.collections4.FunctorException("", throwable10);
        java.lang.Throwable throwable18 = null;
        org.apache.commons.collections4.FunctorException functorException19 = new org.apache.commons.collections4.FunctorException("", throwable18);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap20 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap21 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean22 = exceptionMap20.containsValue((java.lang.Object) exceptionMap21);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap25 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection26 = exceptionMap25.values();
        int int27 = exceptionMap25.size();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap29 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection30 = exceptionMap29.values();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap31 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap32 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean33 = exceptionMap31.containsValue((java.lang.Object) exceptionMap32);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap38 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap39 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean40 = exceptionMap38.containsValue((java.lang.Object) exceptionMap39);
        int int41 = exceptionMap39.size();
        java.lang.Throwable throwable50 = null;
        org.apache.commons.collections4.FunctorException functorException51 = new org.apache.commons.collections4.FunctorException("", throwable50);
        org.apache.commons.collections4.FunctorException functorException52 = new org.apache.commons.collections4.FunctorException("", throwable50);
        java.io.Serializable[] serializableArray53 = new java.io.Serializable[] { (short) -1, 10L, 10.0d, (short) 100, (-1), throwable18, exceptionMap20, 0L, 0L, exceptionMap25, 0, exceptionMap29, exceptionMap31, (short) 1, ' ', "hi!", 100.0f, int41, false, 10.0f, '4', (-1), 1L, 1, throwable50 };
        java.util.ArrayList<java.io.Serializable> serializableList54 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList54, serializableArray53);
        boolean boolean56 = exceptionMap6.putAll((java.lang.Exception) functorException11, (java.util.Collection<java.io.Serializable>) serializableList54);
        functorException5.addSuppressed((java.lang.Throwable) functorException11);
        boolean boolean60 = exceptionMap0.replace((java.lang.Exception) functorException11, (java.lang.Object) "org.apache.commons.collections4.FunctorException: ", (java.lang.Object) 100.0f);
        org.junit.Assert.assertNotNull(objCollection1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objCollection26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objCollection30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(serializableArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap1 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean2 = exceptionMap0.containsValue((java.lang.Object) exceptionMap1);
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet3 = exceptionMap1.entrySet();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap4 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap5 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean6 = exceptionMap4.containsValue((java.lang.Object) exceptionMap5);
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet7 = exceptionMap5.entrySet();
        java.util.Map<java.lang.Exception, java.lang.Object> exceptionMap8 = exceptionMap5.map;
        int int9 = exceptionMap8.size();
        java.lang.Object obj10 = exceptionMap1.remove((java.lang.Object) int9);
        java.lang.Throwable throwable13 = null;
        org.apache.commons.collections4.FunctorException functorException14 = new org.apache.commons.collections4.FunctorException("", throwable13);
        org.apache.commons.collections4.FunctorException functorException15 = new org.apache.commons.collections4.FunctorException("", throwable13);
        org.apache.commons.collections4.FunctorException functorException17 = new org.apache.commons.collections4.FunctorException("");
        functorException15.addSuppressed((java.lang.Throwable) functorException17);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap19 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap20 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean21 = exceptionMap19.containsValue((java.lang.Object) exceptionMap20);
        boolean boolean23 = exceptionMap20.containsKey((java.lang.Object) (short) 10);
        java.util.Collection<java.io.Serializable> serializableCollection25 = exceptionMap20.createCollection(10);
        boolean boolean26 = exceptionMap1.putAll((java.lang.Exception) functorException17, serializableCollection25);
        java.lang.Object obj27 = null;
        boolean boolean28 = exceptionMap1.containsValue(obj27);
        java.util.Set<java.lang.Exception> exceptionSet29 = exceptionMap1.keySet();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(exceptionEntrySet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(exceptionEntrySet7);
        org.junit.Assert.assertNotNull(exceptionMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(serializableCollection25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(exceptionSet29);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection1 = exceptionMap0.values();
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet2 = exceptionMap0.entrySet();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap3 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection4 = exceptionMap3.values();
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet5 = exceptionMap3.entrySet();
        boolean boolean7 = exceptionMap0.remove((java.lang.Object) exceptionEntrySet5, (java.lang.Object) (byte) -1);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap8 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap9 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean10 = exceptionMap8.containsValue((java.lang.Object) exceptionMap9);
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet11 = exceptionMap9.entrySet();
        java.util.Map<java.lang.Exception, java.lang.Object> exceptionMap12 = exceptionMap9.map;
        int int13 = exceptionMap12.size();
        boolean boolean14 = exceptionMap0.containsKey((java.lang.Object) exceptionMap12);
        boolean boolean16 = exceptionMap0.equals((java.lang.Object) 0.0d);
        java.util.Collection<java.lang.Object> objCollection17 = exceptionMap0.values();
        org.junit.Assert.assertNotNull(objCollection1);
        org.junit.Assert.assertNotNull(exceptionEntrySet2);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertNotNull(exceptionEntrySet5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(exceptionEntrySet11);
        org.junit.Assert.assertNotNull(exceptionMap12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objCollection17);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap1 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean2 = exceptionMap0.containsValue((java.lang.Object) exceptionMap1);
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet3 = exceptionMap1.entrySet();
        exceptionMap1.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(exceptionEntrySet3);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection1 = exceptionMap0.values();
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet2 = exceptionMap0.entrySet();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap3 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection4 = exceptionMap3.values();
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet5 = exceptionMap3.entrySet();
        boolean boolean7 = exceptionMap0.remove((java.lang.Object) exceptionEntrySet5, (java.lang.Object) (byte) -1);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap8 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap9 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean10 = exceptionMap8.containsValue((java.lang.Object) exceptionMap9);
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet11 = exceptionMap9.entrySet();
        java.util.Map<java.lang.Exception, java.lang.Object> exceptionMap12 = exceptionMap9.map;
        int int13 = exceptionMap12.size();
        boolean boolean14 = exceptionMap0.containsKey((java.lang.Object) exceptionMap12);
        boolean boolean16 = exceptionMap12.containsKey((java.lang.Object) '4');
        org.junit.Assert.assertNotNull(objCollection1);
        org.junit.Assert.assertNotNull(exceptionEntrySet2);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertNotNull(exceptionEntrySet5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(exceptionEntrySet11);
        org.junit.Assert.assertNotNull(exceptionMap12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap1 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean2 = exceptionMap0.containsValue((java.lang.Object) exceptionMap1);
        int int3 = exceptionMap1.size();
        java.util.Collection<java.lang.Object> objCollection4 = exceptionMap1.values();
        java.util.Collection<java.lang.Object> objCollection5 = exceptionMap1.values();
        int int6 = exceptionMap1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertNotNull(objCollection5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection1 = exceptionMap0.values();
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet2 = exceptionMap0.entrySet();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap3 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection4 = exceptionMap3.values();
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet5 = exceptionMap3.entrySet();
        boolean boolean7 = exceptionMap0.remove((java.lang.Object) exceptionEntrySet5, (java.lang.Object) (byte) -1);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap8 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap9 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean10 = exceptionMap8.containsValue((java.lang.Object) exceptionMap9);
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet11 = exceptionMap9.entrySet();
        java.util.Map<java.lang.Exception, java.lang.Object> exceptionMap12 = exceptionMap9.map;
        int int13 = exceptionMap12.size();
        boolean boolean14 = exceptionMap0.containsKey((java.lang.Object) exceptionMap12);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap15 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap16 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean17 = exceptionMap15.containsValue((java.lang.Object) exceptionMap16);
        int int18 = exceptionMap16.size();
        java.util.Collection<java.lang.Object> objCollection19 = exceptionMap16.values();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap20 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap21 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean22 = exceptionMap20.containsValue((java.lang.Object) exceptionMap21);
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet23 = exceptionMap21.entrySet();
        exceptionMap16.putAll((java.util.Map<java.lang.Exception, java.lang.Object>) exceptionMap21);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap25 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap26 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean27 = exceptionMap25.containsValue((java.lang.Object) exceptionMap26);
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet28 = exceptionMap26.entrySet();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap29 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap30 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean31 = exceptionMap29.containsValue((java.lang.Object) exceptionMap30);
        java.lang.Throwable throwable33 = null;
        org.apache.commons.collections4.FunctorException functorException34 = new org.apache.commons.collections4.FunctorException("", throwable33);
        java.lang.Throwable throwable41 = null;
        org.apache.commons.collections4.FunctorException functorException42 = new org.apache.commons.collections4.FunctorException("", throwable41);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap43 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap44 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean45 = exceptionMap43.containsValue((java.lang.Object) exceptionMap44);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap48 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection49 = exceptionMap48.values();
        int int50 = exceptionMap48.size();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap52 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection53 = exceptionMap52.values();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap54 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap55 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean56 = exceptionMap54.containsValue((java.lang.Object) exceptionMap55);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap61 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap62 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean63 = exceptionMap61.containsValue((java.lang.Object) exceptionMap62);
        int int64 = exceptionMap62.size();
        java.lang.Throwable throwable73 = null;
        org.apache.commons.collections4.FunctorException functorException74 = new org.apache.commons.collections4.FunctorException("", throwable73);
        org.apache.commons.collections4.FunctorException functorException75 = new org.apache.commons.collections4.FunctorException("", throwable73);
        java.io.Serializable[] serializableArray76 = new java.io.Serializable[] { (short) -1, 10L, 10.0d, (short) 100, (-1), throwable41, exceptionMap43, 0L, 0L, exceptionMap48, 0, exceptionMap52, exceptionMap54, (short) 1, ' ', "hi!", 100.0f, int64, false, 10.0f, '4', (-1), 1L, 1, throwable73 };
        java.util.ArrayList<java.io.Serializable> serializableList77 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList77, serializableArray76);
        boolean boolean79 = exceptionMap29.putAll((java.lang.Exception) functorException34, (java.util.Collection<java.io.Serializable>) serializableList77);
        boolean boolean81 = exceptionMap26.removeMapping((java.lang.Exception) functorException34, (java.io.Serializable) (-1.0f));
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap83 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap84 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean85 = exceptionMap83.containsValue((java.lang.Object) exceptionMap84);
        boolean boolean86 = exceptionMap21.replace((java.lang.Exception) functorException34, (java.lang.Object) (short) 0, (java.lang.Object) exceptionMap83);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap87 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection88 = exceptionMap87.values();
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet89 = exceptionMap87.entrySet();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap90 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection91 = exceptionMap90.values();
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet92 = exceptionMap90.entrySet();
        boolean boolean94 = exceptionMap87.remove((java.lang.Object) exceptionEntrySet92, (java.lang.Object) (byte) -1);
        boolean boolean95 = exceptionMap0.removeMapping((java.lang.Object) exceptionMap21, (java.lang.Object) boolean94);
        org.junit.Assert.assertNotNull(objCollection1);
        org.junit.Assert.assertNotNull(exceptionEntrySet2);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertNotNull(exceptionEntrySet5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(exceptionEntrySet11);
        org.junit.Assert.assertNotNull(exceptionMap12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objCollection19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(exceptionEntrySet23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(exceptionEntrySet28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(objCollection49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(objCollection53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(serializableArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(objCollection88);
        org.junit.Assert.assertNotNull(exceptionEntrySet89);
        org.junit.Assert.assertNotNull(objCollection91);
        org.junit.Assert.assertNotNull(exceptionEntrySet92);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection1 = exceptionMap0.values();
        boolean boolean2 = exceptionMap0.isEmpty();
        java.lang.Throwable throwable4 = null;
        org.apache.commons.collections4.FunctorException functorException5 = new org.apache.commons.collections4.FunctorException("", throwable4);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap6 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap7 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean8 = exceptionMap6.containsValue((java.lang.Object) exceptionMap7);
        java.lang.Throwable throwable10 = null;
        org.apache.commons.collections4.FunctorException functorException11 = new org.apache.commons.collections4.FunctorException("", throwable10);
        java.lang.Throwable throwable18 = null;
        org.apache.commons.collections4.FunctorException functorException19 = new org.apache.commons.collections4.FunctorException("", throwable18);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap20 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap21 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean22 = exceptionMap20.containsValue((java.lang.Object) exceptionMap21);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap25 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection26 = exceptionMap25.values();
        int int27 = exceptionMap25.size();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap29 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection30 = exceptionMap29.values();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap31 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap32 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean33 = exceptionMap31.containsValue((java.lang.Object) exceptionMap32);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap38 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap39 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean40 = exceptionMap38.containsValue((java.lang.Object) exceptionMap39);
        int int41 = exceptionMap39.size();
        java.lang.Throwable throwable50 = null;
        org.apache.commons.collections4.FunctorException functorException51 = new org.apache.commons.collections4.FunctorException("", throwable50);
        org.apache.commons.collections4.FunctorException functorException52 = new org.apache.commons.collections4.FunctorException("", throwable50);
        java.io.Serializable[] serializableArray53 = new java.io.Serializable[] { (short) -1, 10L, 10.0d, (short) 100, (-1), throwable18, exceptionMap20, 0L, 0L, exceptionMap25, 0, exceptionMap29, exceptionMap31, (short) 1, ' ', "hi!", 100.0f, int41, false, 10.0f, '4', (-1), 1L, 1, throwable50 };
        java.util.ArrayList<java.io.Serializable> serializableList54 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList54, serializableArray53);
        boolean boolean56 = exceptionMap6.putAll((java.lang.Exception) functorException11, (java.util.Collection<java.io.Serializable>) serializableList54);
        functorException5.addSuppressed((java.lang.Throwable) functorException11);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap58 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap59 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean60 = exceptionMap58.containsValue((java.lang.Object) exceptionMap59);
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet61 = exceptionMap59.entrySet();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap62 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap63 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean64 = exceptionMap62.containsValue((java.lang.Object) exceptionMap63);
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet65 = exceptionMap63.entrySet();
        java.util.Map<java.lang.Exception, java.lang.Object> exceptionMap66 = exceptionMap63.map;
        int int67 = exceptionMap66.size();
        java.lang.Object obj68 = exceptionMap59.remove((java.lang.Object) int67);
        java.lang.Throwable throwable71 = null;
        org.apache.commons.collections4.FunctorException functorException72 = new org.apache.commons.collections4.FunctorException("", throwable71);
        org.apache.commons.collections4.FunctorException functorException73 = new org.apache.commons.collections4.FunctorException("", throwable71);
        org.apache.commons.collections4.FunctorException functorException75 = new org.apache.commons.collections4.FunctorException("");
        functorException73.addSuppressed((java.lang.Throwable) functorException75);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap77 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap78 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean79 = exceptionMap77.containsValue((java.lang.Object) exceptionMap78);
        boolean boolean81 = exceptionMap78.containsKey((java.lang.Object) (short) 10);
        java.util.Collection<java.io.Serializable> serializableCollection83 = exceptionMap78.createCollection(10);
        boolean boolean84 = exceptionMap59.putAll((java.lang.Exception) functorException75, serializableCollection83);
        boolean boolean85 = exceptionMap0.putAll((java.lang.Exception) functorException11, serializableCollection83);
        org.junit.Assert.assertNotNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objCollection26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objCollection30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(serializableArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(exceptionEntrySet61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(exceptionEntrySet65);
        org.junit.Assert.assertNotNull(exceptionMap66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(serializableCollection83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap1 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean2 = exceptionMap0.containsValue((java.lang.Object) exceptionMap1);
        int int3 = exceptionMap1.size();
        java.util.Collection<java.lang.Object> objCollection4 = exceptionMap1.values();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap5 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap6 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean7 = exceptionMap5.containsValue((java.lang.Object) exceptionMap6);
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet8 = exceptionMap6.entrySet();
        exceptionMap1.putAll((java.util.Map<java.lang.Exception, java.lang.Object>) exceptionMap6);
        org.apache.commons.collections4.MapIterator<java.lang.Exception, java.lang.Object> exceptionItor10 = exceptionMap6.mapIterator();
        java.lang.Object obj11 = null;
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap12 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection13 = exceptionMap12.values();
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet14 = exceptionMap12.entrySet();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap15 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection16 = exceptionMap15.values();
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet17 = exceptionMap15.entrySet();
        boolean boolean19 = exceptionMap12.remove((java.lang.Object) exceptionEntrySet17, (java.lang.Object) (byte) -1);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap20 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap21 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean22 = exceptionMap20.containsValue((java.lang.Object) exceptionMap21);
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet23 = exceptionMap21.entrySet();
        java.util.Map<java.lang.Exception, java.lang.Object> exceptionMap24 = exceptionMap21.map;
        int int25 = exceptionMap24.size();
        boolean boolean26 = exceptionMap12.containsKey((java.lang.Object) exceptionMap24);
        boolean boolean28 = exceptionMap12.equals((java.lang.Object) 0.0d);
        boolean boolean29 = exceptionMap6.remove(obj11, (java.lang.Object) boolean28);
        java.lang.Throwable throwable31 = null;
        org.apache.commons.collections4.FunctorException functorException32 = new org.apache.commons.collections4.FunctorException(throwable31);
        org.apache.commons.collections4.FunctorException functorException33 = new org.apache.commons.collections4.FunctorException("hi!", (java.lang.Throwable) functorException32);
        java.lang.Throwable throwable34 = null;
        org.apache.commons.collections4.FunctorException functorException35 = new org.apache.commons.collections4.FunctorException(throwable34);
        functorException33.addSuppressed((java.lang.Throwable) functorException35);
        java.util.Collection<java.io.Serializable> serializableCollection37 = null;
        boolean boolean38 = exceptionMap6.putAll((java.lang.Exception) functorException35, serializableCollection37);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(exceptionEntrySet8);
        org.junit.Assert.assertNotNull(exceptionItor10);
        org.junit.Assert.assertNotNull(objCollection13);
        org.junit.Assert.assertNotNull(exceptionEntrySet14);
        org.junit.Assert.assertNotNull(objCollection16);
        org.junit.Assert.assertNotNull(exceptionEntrySet17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(exceptionEntrySet23);
        org.junit.Assert.assertNotNull(exceptionMap24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap1 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean2 = exceptionMap0.containsValue((java.lang.Object) exceptionMap1);
        int int3 = exceptionMap1.size();
        java.util.Collection<java.lang.Object> objCollection4 = exceptionMap1.values();
        exceptionMap1.clear();
        java.util.Collection<java.lang.Object> objCollection6 = exceptionMap1.values();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertNotNull(objCollection6);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap1 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean2 = exceptionMap0.containsValue((java.lang.Object) exceptionMap1);
        java.util.Collection<java.lang.Object> objCollection3 = exceptionMap0.values();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objCollection3);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        java.lang.Throwable throwable2 = null;
        org.apache.commons.collections4.FunctorException functorException3 = new org.apache.commons.collections4.FunctorException("", throwable2);
        org.apache.commons.collections4.FunctorException functorException4 = new org.apache.commons.collections4.FunctorException("", throwable2);
        org.apache.commons.collections4.FunctorException functorException6 = new org.apache.commons.collections4.FunctorException("");
        functorException4.addSuppressed((java.lang.Throwable) functorException6);
        java.lang.Throwable[] throwableArray8 = functorException6.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap1 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean2 = exceptionMap0.containsValue((java.lang.Object) exceptionMap1);
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet3 = exceptionMap1.entrySet();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap4 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap5 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean6 = exceptionMap4.containsValue((java.lang.Object) exceptionMap5);
        java.lang.Throwable throwable8 = null;
        org.apache.commons.collections4.FunctorException functorException9 = new org.apache.commons.collections4.FunctorException("", throwable8);
        java.lang.Throwable throwable16 = null;
        org.apache.commons.collections4.FunctorException functorException17 = new org.apache.commons.collections4.FunctorException("", throwable16);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap18 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap19 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean20 = exceptionMap18.containsValue((java.lang.Object) exceptionMap19);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap23 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection24 = exceptionMap23.values();
        int int25 = exceptionMap23.size();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap27 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection28 = exceptionMap27.values();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap29 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap30 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean31 = exceptionMap29.containsValue((java.lang.Object) exceptionMap30);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap36 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap37 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean38 = exceptionMap36.containsValue((java.lang.Object) exceptionMap37);
        int int39 = exceptionMap37.size();
        java.lang.Throwable throwable48 = null;
        org.apache.commons.collections4.FunctorException functorException49 = new org.apache.commons.collections4.FunctorException("", throwable48);
        org.apache.commons.collections4.FunctorException functorException50 = new org.apache.commons.collections4.FunctorException("", throwable48);
        java.io.Serializable[] serializableArray51 = new java.io.Serializable[] { (short) -1, 10L, 10.0d, (short) 100, (-1), throwable16, exceptionMap18, 0L, 0L, exceptionMap23, 0, exceptionMap27, exceptionMap29, (short) 1, ' ', "hi!", 100.0f, int39, false, 10.0f, '4', (-1), 1L, 1, throwable48 };
        java.util.ArrayList<java.io.Serializable> serializableList52 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList52, serializableArray51);
        boolean boolean54 = exceptionMap4.putAll((java.lang.Exception) functorException9, (java.util.Collection<java.io.Serializable>) serializableList52);
        boolean boolean56 = exceptionMap1.removeMapping((java.lang.Exception) functorException9, (java.io.Serializable) (-1.0f));
        org.apache.commons.collections4.MapIterator<java.lang.Exception, java.lang.Object> exceptionItor57 = exceptionMap1.mapIterator();
        boolean boolean58 = exceptionMap1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(exceptionEntrySet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objCollection24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objCollection28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(serializableArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(exceptionItor57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap1 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean2 = exceptionMap0.containsValue((java.lang.Object) exceptionMap1);
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet3 = exceptionMap1.entrySet();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap4 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap5 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean6 = exceptionMap4.containsValue((java.lang.Object) exceptionMap5);
        java.lang.Throwable throwable8 = null;
        org.apache.commons.collections4.FunctorException functorException9 = new org.apache.commons.collections4.FunctorException("", throwable8);
        java.lang.Throwable throwable16 = null;
        org.apache.commons.collections4.FunctorException functorException17 = new org.apache.commons.collections4.FunctorException("", throwable16);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap18 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap19 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean20 = exceptionMap18.containsValue((java.lang.Object) exceptionMap19);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap23 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection24 = exceptionMap23.values();
        int int25 = exceptionMap23.size();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap27 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection28 = exceptionMap27.values();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap29 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap30 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean31 = exceptionMap29.containsValue((java.lang.Object) exceptionMap30);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap36 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap37 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean38 = exceptionMap36.containsValue((java.lang.Object) exceptionMap37);
        int int39 = exceptionMap37.size();
        java.lang.Throwable throwable48 = null;
        org.apache.commons.collections4.FunctorException functorException49 = new org.apache.commons.collections4.FunctorException("", throwable48);
        org.apache.commons.collections4.FunctorException functorException50 = new org.apache.commons.collections4.FunctorException("", throwable48);
        java.io.Serializable[] serializableArray51 = new java.io.Serializable[] { (short) -1, 10L, 10.0d, (short) 100, (-1), throwable16, exceptionMap18, 0L, 0L, exceptionMap23, 0, exceptionMap27, exceptionMap29, (short) 1, ' ', "hi!", 100.0f, int39, false, 10.0f, '4', (-1), 1L, 1, throwable48 };
        java.util.ArrayList<java.io.Serializable> serializableList52 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList52, serializableArray51);
        boolean boolean54 = exceptionMap4.putAll((java.lang.Exception) functorException9, (java.util.Collection<java.io.Serializable>) serializableList52);
        boolean boolean56 = exceptionMap1.removeMapping((java.lang.Exception) functorException9, (java.io.Serializable) (-1.0f));
        org.apache.commons.collections4.MapIterator<java.lang.Exception, java.lang.Object> exceptionItor57 = exceptionMap1.mapIterator();
        boolean boolean58 = exceptionItor57.hasNext();
        boolean boolean59 = exceptionItor57.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            exceptionItor57.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(exceptionEntrySet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objCollection24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objCollection28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(serializableArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(exceptionItor57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap1 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean2 = exceptionMap0.containsValue((java.lang.Object) exceptionMap1);
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet3 = exceptionMap1.entrySet();
        exceptionMap1.clear();
        boolean boolean5 = exceptionMap1.isEmpty();
        java.lang.Throwable throwable7 = null;
        org.apache.commons.collections4.FunctorException functorException8 = new org.apache.commons.collections4.FunctorException(throwable7);
        org.apache.commons.collections4.FunctorException functorException9 = new org.apache.commons.collections4.FunctorException("hi!", (java.lang.Throwable) functorException8);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap10 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap11 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean12 = exceptionMap10.containsValue((java.lang.Object) exceptionMap11);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap13 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap14 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean15 = exceptionMap13.containsValue((java.lang.Object) exceptionMap14);
        exceptionMap11.putAll((java.util.Map<java.lang.Exception, java.lang.Object>) exceptionMap14);
        java.lang.Object obj17 = exceptionMap1.put((java.lang.Exception) functorException9, (java.lang.Object) exceptionMap14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(exceptionEntrySet3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "{}");
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap1 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean2 = exceptionMap0.containsValue((java.lang.Object) exceptionMap1);
        int int3 = exceptionMap1.size();
        java.util.Collection<java.lang.Object> objCollection4 = exceptionMap1.values();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap5 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap6 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean7 = exceptionMap5.containsValue((java.lang.Object) exceptionMap6);
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet8 = exceptionMap6.entrySet();
        exceptionMap1.putAll((java.util.Map<java.lang.Exception, java.lang.Object>) exceptionMap6);
        java.util.Map<java.lang.Exception, java.lang.Object> exceptionMap10 = exceptionMap6.decorated();
        java.util.Set<java.lang.Exception> exceptionSet11 = exceptionMap6.keySet();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(exceptionEntrySet8);
        org.junit.Assert.assertNotNull(exceptionMap10);
        org.junit.Assert.assertNotNull(exceptionSet11);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.collections4.FunctorException functorException2 = new org.apache.commons.collections4.FunctorException("", throwable1);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap3 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap4 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean5 = exceptionMap3.containsValue((java.lang.Object) exceptionMap4);
        java.lang.Throwable throwable7 = null;
        org.apache.commons.collections4.FunctorException functorException8 = new org.apache.commons.collections4.FunctorException("", throwable7);
        java.lang.Throwable throwable15 = null;
        org.apache.commons.collections4.FunctorException functorException16 = new org.apache.commons.collections4.FunctorException("", throwable15);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap17 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap18 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean19 = exceptionMap17.containsValue((java.lang.Object) exceptionMap18);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap22 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection23 = exceptionMap22.values();
        int int24 = exceptionMap22.size();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap26 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection27 = exceptionMap26.values();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap28 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap29 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean30 = exceptionMap28.containsValue((java.lang.Object) exceptionMap29);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap35 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap36 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean37 = exceptionMap35.containsValue((java.lang.Object) exceptionMap36);
        int int38 = exceptionMap36.size();
        java.lang.Throwable throwable47 = null;
        org.apache.commons.collections4.FunctorException functorException48 = new org.apache.commons.collections4.FunctorException("", throwable47);
        org.apache.commons.collections4.FunctorException functorException49 = new org.apache.commons.collections4.FunctorException("", throwable47);
        java.io.Serializable[] serializableArray50 = new java.io.Serializable[] { (short) -1, 10L, 10.0d, (short) 100, (-1), throwable15, exceptionMap17, 0L, 0L, exceptionMap22, 0, exceptionMap26, exceptionMap28, (short) 1, ' ', "hi!", 100.0f, int38, false, 10.0f, '4', (-1), 1L, 1, throwable47 };
        java.util.ArrayList<java.io.Serializable> serializableList51 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList51, serializableArray50);
        boolean boolean53 = exceptionMap3.putAll((java.lang.Exception) functorException8, (java.util.Collection<java.io.Serializable>) serializableList51);
        functorException2.addSuppressed((java.lang.Throwable) functorException8);
        org.apache.commons.collections4.FunctorException functorException55 = new org.apache.commons.collections4.FunctorException((java.lang.Throwable) functorException8);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objCollection23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objCollection27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(serializableArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap1 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean2 = exceptionMap0.containsValue((java.lang.Object) exceptionMap1);
        int int3 = exceptionMap1.size();
        boolean boolean4 = exceptionMap1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap1 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean2 = exceptionMap0.containsValue((java.lang.Object) exceptionMap1);
        int int3 = exceptionMap1.size();
        java.util.Collection<java.lang.Object> objCollection4 = exceptionMap1.values();
        exceptionMap1.clear();
        java.lang.Throwable throwable7 = null;
        org.apache.commons.collections4.FunctorException functorException8 = new org.apache.commons.collections4.FunctorException("", throwable7);
        int int9 = exceptionMap1.size((java.lang.Object) functorException8);
        java.lang.Object obj10 = null;
        boolean boolean11 = exceptionMap1.containsValue(obj10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap1 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean2 = exceptionMap0.containsValue((java.lang.Object) exceptionMap1);
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet3 = exceptionMap1.entrySet();
        boolean boolean5 = exceptionMap1.containsKey((java.lang.Object) (byte) 1);
        java.lang.Throwable throwable8 = null;
        org.apache.commons.collections4.FunctorException functorException9 = new org.apache.commons.collections4.FunctorException("", throwable8);
        org.apache.commons.collections4.FunctorException functorException10 = new org.apache.commons.collections4.FunctorException("", throwable8);
        org.apache.commons.collections4.FunctorException functorException12 = new org.apache.commons.collections4.FunctorException("");
        functorException10.addSuppressed((java.lang.Throwable) functorException12);
        boolean boolean15 = exceptionMap1.removeMapping((java.lang.Exception) functorException12, (java.io.Serializable) 1);
        java.lang.Exception exception16 = null;
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap17 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap18 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean19 = exceptionMap17.containsValue((java.lang.Object) exceptionMap18);
        boolean boolean21 = exceptionMap18.containsKey((java.lang.Object) (short) 10);
        java.util.Collection<java.io.Serializable> serializableCollection23 = exceptionMap18.createCollection(10);
        boolean boolean24 = exceptionMap1.putAll(exception16, serializableCollection23);
        java.lang.Class<?> wildcardClass25 = exceptionMap1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(exceptionEntrySet3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(serializableCollection23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap1 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean2 = exceptionMap0.containsValue((java.lang.Object) exceptionMap1);
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet3 = exceptionMap1.entrySet();
        exceptionMap1.clear();
        java.lang.Throwable throwable6 = null;
        org.apache.commons.collections4.FunctorException functorException7 = new org.apache.commons.collections4.FunctorException(throwable6);
        org.apache.commons.collections4.FunctorException functorException8 = new org.apache.commons.collections4.FunctorException("hi!", (java.lang.Throwable) functorException7);
        java.lang.Throwable throwable9 = null;
        org.apache.commons.collections4.FunctorException functorException10 = new org.apache.commons.collections4.FunctorException(throwable9);
        functorException8.addSuppressed((java.lang.Throwable) functorException10);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap12 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap13 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean14 = exceptionMap12.containsValue((java.lang.Object) exceptionMap13);
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet15 = exceptionMap13.entrySet();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap16 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap17 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean18 = exceptionMap16.containsValue((java.lang.Object) exceptionMap17);
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet19 = exceptionMap17.entrySet();
        java.util.Map<java.lang.Exception, java.lang.Object> exceptionMap20 = exceptionMap17.map;
        int int21 = exceptionMap20.size();
        java.lang.Object obj22 = exceptionMap13.remove((java.lang.Object) int21);
        java.lang.Exception exception23 = null;
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap24 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection25 = exceptionMap24.values();
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet26 = exceptionMap24.entrySet();
        java.lang.Object obj27 = exceptionMap13.put(exception23, (java.lang.Object) exceptionEntrySet26);
        java.lang.Object obj28 = exceptionMap1.put((java.lang.Exception) functorException8, (java.lang.Object) exceptionEntrySet26);
        java.util.Map<java.lang.Exception, java.lang.Object> exceptionMap29 = exceptionMap1.decorated();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(exceptionEntrySet3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(exceptionEntrySet15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(exceptionEntrySet19);
        org.junit.Assert.assertNotNull(exceptionMap20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(objCollection25);
        org.junit.Assert.assertNotNull(exceptionEntrySet26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "[]");
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "[]");
        org.junit.Assert.assertNotNull(exceptionMap29);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap1 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean2 = exceptionMap0.containsValue((java.lang.Object) exceptionMap1);
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet3 = exceptionMap1.entrySet();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap4 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap5 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean6 = exceptionMap4.containsValue((java.lang.Object) exceptionMap5);
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet7 = exceptionMap5.entrySet();
        java.util.Map<java.lang.Exception, java.lang.Object> exceptionMap8 = exceptionMap5.map;
        int int9 = exceptionMap8.size();
        java.lang.Object obj10 = exceptionMap1.remove((java.lang.Object) int9);
        java.lang.Throwable throwable13 = null;
        org.apache.commons.collections4.FunctorException functorException14 = new org.apache.commons.collections4.FunctorException("", throwable13);
        org.apache.commons.collections4.FunctorException functorException15 = new org.apache.commons.collections4.FunctorException("", throwable13);
        org.apache.commons.collections4.FunctorException functorException17 = new org.apache.commons.collections4.FunctorException("");
        functorException15.addSuppressed((java.lang.Throwable) functorException17);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap19 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap20 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean21 = exceptionMap19.containsValue((java.lang.Object) exceptionMap20);
        boolean boolean23 = exceptionMap20.containsKey((java.lang.Object) (short) 10);
        java.util.Collection<java.io.Serializable> serializableCollection25 = exceptionMap20.createCollection(10);
        boolean boolean26 = exceptionMap1.putAll((java.lang.Exception) functorException17, serializableCollection25);
        java.lang.Object obj27 = null;
        boolean boolean28 = exceptionMap1.containsValue(obj27);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap29 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap30 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean31 = exceptionMap29.containsValue((java.lang.Object) exceptionMap30);
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet32 = exceptionMap30.entrySet();
        exceptionMap30.clear();
        boolean boolean34 = exceptionMap30.isEmpty();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap35 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection36 = exceptionMap35.values();
        int int37 = exceptionMap35.size();
        boolean boolean39 = exceptionMap35.containsValue((java.lang.Object) true);
        boolean boolean40 = exceptionMap30.containsValue((java.lang.Object) boolean39);
        java.util.Set<java.lang.Exception> exceptionSet41 = exceptionMap30.keySet();
        boolean boolean42 = exceptionMap1.containsValue((java.lang.Object) exceptionSet41);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap43 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection44 = exceptionMap43.values();
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet45 = exceptionMap43.entrySet();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap46 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection47 = exceptionMap46.values();
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet48 = exceptionMap46.entrySet();
        boolean boolean50 = exceptionMap43.remove((java.lang.Object) exceptionEntrySet48, (java.lang.Object) (byte) -1);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap51 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap52 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean53 = exceptionMap51.containsValue((java.lang.Object) exceptionMap52);
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet54 = exceptionMap52.entrySet();
        java.util.Map<java.lang.Exception, java.lang.Object> exceptionMap55 = exceptionMap52.map;
        int int56 = exceptionMap55.size();
        boolean boolean57 = exceptionMap43.containsKey((java.lang.Object) exceptionMap55);
        boolean boolean59 = exceptionMap43.equals((java.lang.Object) 0.0d);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap60 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap61 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean62 = exceptionMap60.containsValue((java.lang.Object) exceptionMap61);
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet63 = exceptionMap61.entrySet();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap64 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap65 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean66 = exceptionMap64.containsValue((java.lang.Object) exceptionMap65);
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet67 = exceptionMap65.entrySet();
        java.util.Map<java.lang.Exception, java.lang.Object> exceptionMap68 = exceptionMap65.map;
        int int69 = exceptionMap68.size();
        java.lang.Object obj70 = exceptionMap61.remove((java.lang.Object) int69);
        java.lang.Throwable throwable73 = null;
        org.apache.commons.collections4.FunctorException functorException74 = new org.apache.commons.collections4.FunctorException("", throwable73);
        org.apache.commons.collections4.FunctorException functorException75 = new org.apache.commons.collections4.FunctorException("", throwable73);
        org.apache.commons.collections4.FunctorException functorException77 = new org.apache.commons.collections4.FunctorException("");
        functorException75.addSuppressed((java.lang.Throwable) functorException77);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap79 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap80 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean81 = exceptionMap79.containsValue((java.lang.Object) exceptionMap80);
        boolean boolean83 = exceptionMap80.containsKey((java.lang.Object) (short) 10);
        java.util.Collection<java.io.Serializable> serializableCollection85 = exceptionMap80.createCollection(10);
        boolean boolean86 = exceptionMap61.putAll((java.lang.Exception) functorException77, serializableCollection85);
        boolean boolean87 = exceptionMap43.containsValue((java.lang.Object) serializableCollection85);
        java.util.Collection<java.io.Serializable> serializableCollection88 = exceptionMap1.getCollection((java.lang.Object) exceptionMap43);
        org.apache.commons.collections4.MapIterator<java.lang.Exception, java.lang.Object> exceptionItor89 = exceptionMap43.mapIterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(exceptionEntrySet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(exceptionEntrySet7);
        org.junit.Assert.assertNotNull(exceptionMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(serializableCollection25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(exceptionEntrySet32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(objCollection36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(exceptionSet41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(objCollection44);
        org.junit.Assert.assertNotNull(exceptionEntrySet45);
        org.junit.Assert.assertNotNull(objCollection47);
        org.junit.Assert.assertNotNull(exceptionEntrySet48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(exceptionEntrySet54);
        org.junit.Assert.assertNotNull(exceptionMap55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(exceptionEntrySet63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(exceptionEntrySet67);
        org.junit.Assert.assertNotNull(exceptionMap68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(serializableCollection85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNull(serializableCollection88);
        org.junit.Assert.assertNotNull(exceptionItor89);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap1 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean2 = exceptionMap0.containsValue((java.lang.Object) exceptionMap1);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap3 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap4 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap5 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean6 = exceptionMap4.containsValue((java.lang.Object) exceptionMap5);
        int int7 = exceptionMap5.size();
        java.util.Collection<java.lang.Object> objCollection8 = exceptionMap5.values();
        java.util.Collection<java.lang.Object> objCollection9 = exceptionMap5.values();
        java.lang.Object obj10 = exceptionMap3.remove((java.lang.Object) objCollection9);
        java.lang.Object obj11 = exceptionMap0.get((java.lang.Object) objCollection9);
        boolean boolean12 = exceptionMap0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertNotNull(objCollection9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap1 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean2 = exceptionMap0.containsValue((java.lang.Object) exceptionMap1);
        java.lang.String str3 = exceptionMap0.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{}" + "'", str3, "{}");
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap1 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean2 = exceptionMap0.containsValue((java.lang.Object) exceptionMap1);
        int int3 = exceptionMap1.size();
        java.util.Collection<java.lang.Object> objCollection4 = exceptionMap1.values();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap5 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.lang.Object obj7 = exceptionMap5.get((java.lang.Object) (-1L));
        java.lang.Throwable throwable9 = null;
        org.apache.commons.collections4.FunctorException functorException10 = new org.apache.commons.collections4.FunctorException(throwable9);
        org.apache.commons.collections4.FunctorException functorException11 = new org.apache.commons.collections4.FunctorException("hi!", (java.lang.Throwable) functorException10);
        boolean boolean13 = exceptionMap5.removeMapping((java.lang.Exception) functorException10, (java.io.Serializable) '#');
        java.util.Set<java.lang.Exception> exceptionSet14 = exceptionMap5.keySet();
        boolean boolean15 = exceptionMap1.equals((java.lang.Object) exceptionSet14);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap16 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap17 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean18 = exceptionMap16.containsValue((java.lang.Object) exceptionMap17);
        int int19 = exceptionMap17.size();
        java.util.Collection<java.lang.Object> objCollection20 = exceptionMap17.values();
        exceptionMap17.clear();
        java.util.Map<java.lang.Exception, java.lang.Object> exceptionMap22 = exceptionMap17.map;
        java.util.Collection<java.io.Serializable> serializableCollection23 = exceptionMap1.getCollection((java.lang.Object) exceptionMap17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(exceptionSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objCollection20);
        org.junit.Assert.assertNotNull(exceptionMap22);
        org.junit.Assert.assertNull(serializableCollection23);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap1 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean2 = exceptionMap0.containsValue((java.lang.Object) exceptionMap1);
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet3 = exceptionMap1.entrySet();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap4 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap5 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean6 = exceptionMap4.containsValue((java.lang.Object) exceptionMap5);
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet7 = exceptionMap5.entrySet();
        java.util.Map<java.lang.Exception, java.lang.Object> exceptionMap8 = exceptionMap5.map;
        int int9 = exceptionMap8.size();
        java.lang.Object obj10 = exceptionMap1.remove((java.lang.Object) int9);
        java.lang.Object obj11 = null;
        boolean boolean12 = exceptionMap1.containsKey(obj11);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap13 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap14 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean15 = exceptionMap13.containsValue((java.lang.Object) exceptionMap14);
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet16 = exceptionMap14.entrySet();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap17 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap18 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean19 = exceptionMap17.containsValue((java.lang.Object) exceptionMap18);
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet20 = exceptionMap18.entrySet();
        java.util.Map<java.lang.Exception, java.lang.Object> exceptionMap21 = exceptionMap18.map;
        int int22 = exceptionMap21.size();
        java.lang.Object obj23 = exceptionMap14.remove((java.lang.Object) int22);
        java.lang.Throwable throwable26 = null;
        org.apache.commons.collections4.FunctorException functorException27 = new org.apache.commons.collections4.FunctorException("", throwable26);
        org.apache.commons.collections4.FunctorException functorException28 = new org.apache.commons.collections4.FunctorException("", throwable26);
        org.apache.commons.collections4.FunctorException functorException30 = new org.apache.commons.collections4.FunctorException("");
        functorException28.addSuppressed((java.lang.Throwable) functorException30);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap32 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap33 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean34 = exceptionMap32.containsValue((java.lang.Object) exceptionMap33);
        boolean boolean36 = exceptionMap33.containsKey((java.lang.Object) (short) 10);
        java.util.Collection<java.io.Serializable> serializableCollection38 = exceptionMap33.createCollection(10);
        boolean boolean39 = exceptionMap14.putAll((java.lang.Exception) functorException30, serializableCollection38);
        boolean boolean40 = exceptionMap1.containsKey((java.lang.Object) serializableCollection38);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(exceptionEntrySet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(exceptionEntrySet7);
        org.junit.Assert.assertNotNull(exceptionMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(exceptionEntrySet16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(exceptionEntrySet20);
        org.junit.Assert.assertNotNull(exceptionMap21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(serializableCollection38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap1 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean2 = exceptionMap0.containsValue((java.lang.Object) exceptionMap1);
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet3 = exceptionMap1.entrySet();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap4 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap5 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean6 = exceptionMap4.containsValue((java.lang.Object) exceptionMap5);
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet7 = exceptionMap5.entrySet();
        java.util.Map<java.lang.Exception, java.lang.Object> exceptionMap8 = exceptionMap5.map;
        int int9 = exceptionMap8.size();
        java.lang.Object obj10 = exceptionMap1.remove((java.lang.Object) int9);
        java.lang.Object obj11 = null;
        boolean boolean12 = exceptionMap1.containsKey(obj11);
        java.util.Collection<java.lang.Object> objCollection13 = exceptionMap1.values();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(exceptionEntrySet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(exceptionEntrySet7);
        org.junit.Assert.assertNotNull(exceptionMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objCollection13);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.apache.commons.collections4.map.MultiValueMap<org.apache.commons.collections4.FunctorException, java.lang.RuntimeException> functorExceptionMap0 = new org.apache.commons.collections4.map.MultiValueMap<org.apache.commons.collections4.FunctorException, java.lang.RuntimeException>();
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap1 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean2 = exceptionMap0.containsValue((java.lang.Object) exceptionMap1);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap3 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap4 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean5 = exceptionMap3.containsValue((java.lang.Object) exceptionMap4);
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet6 = exceptionMap4.entrySet();
        exceptionMap4.clear();
        boolean boolean8 = exceptionMap4.isEmpty();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.lang.Class<?>> exceptionMap9 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap((java.util.Map<java.lang.Exception, java.lang.Object>) exceptionMap4);
        boolean boolean10 = exceptionMap0.equals((java.lang.Object) exceptionMap4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(exceptionEntrySet6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(exceptionMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap1 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean2 = exceptionMap0.containsValue((java.lang.Object) exceptionMap1);
        int int3 = exceptionMap1.size();
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet4 = exceptionMap1.entrySet();
        java.lang.Object obj6 = exceptionMap1.get((java.lang.Object) true);
        int int7 = exceptionMap1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(exceptionEntrySet4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Map<java.lang.Exception, java.lang.Object> exceptionMap1 = exceptionMap0.decorated();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap2 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap3 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean4 = exceptionMap2.containsValue((java.lang.Object) exceptionMap3);
        int int5 = exceptionMap3.size();
        java.util.Collection<java.lang.Object> objCollection6 = exceptionMap3.values();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap7 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap8 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean9 = exceptionMap7.containsValue((java.lang.Object) exceptionMap8);
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet10 = exceptionMap8.entrySet();
        exceptionMap3.putAll((java.util.Map<java.lang.Exception, java.lang.Object>) exceptionMap8);
        boolean boolean12 = exceptionMap0.equals((java.lang.Object) exceptionMap8);
        org.junit.Assert.assertNotNull(exceptionMap1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objCollection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(exceptionEntrySet10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap1 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean2 = exceptionMap0.containsValue((java.lang.Object) exceptionMap1);
        int int3 = exceptionMap1.size();
        java.util.Collection<java.lang.Object> objCollection4 = exceptionMap1.values();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap5 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap6 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean7 = exceptionMap5.containsValue((java.lang.Object) exceptionMap6);
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet8 = exceptionMap6.entrySet();
        exceptionMap1.putAll((java.util.Map<java.lang.Exception, java.lang.Object>) exceptionMap6);
        org.apache.commons.collections4.MapIterator<java.lang.Exception, java.lang.Object> exceptionItor10 = exceptionMap6.mapIterator();
        java.lang.Object obj11 = null;
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap12 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection13 = exceptionMap12.values();
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet14 = exceptionMap12.entrySet();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap15 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection16 = exceptionMap15.values();
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet17 = exceptionMap15.entrySet();
        boolean boolean19 = exceptionMap12.remove((java.lang.Object) exceptionEntrySet17, (java.lang.Object) (byte) -1);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap20 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap21 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean22 = exceptionMap20.containsValue((java.lang.Object) exceptionMap21);
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet23 = exceptionMap21.entrySet();
        java.util.Map<java.lang.Exception, java.lang.Object> exceptionMap24 = exceptionMap21.map;
        int int25 = exceptionMap24.size();
        boolean boolean26 = exceptionMap12.containsKey((java.lang.Object) exceptionMap24);
        boolean boolean28 = exceptionMap12.equals((java.lang.Object) 0.0d);
        boolean boolean29 = exceptionMap6.remove(obj11, (java.lang.Object) boolean28);
        boolean boolean30 = exceptionMap6.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(exceptionEntrySet8);
        org.junit.Assert.assertNotNull(exceptionItor10);
        org.junit.Assert.assertNotNull(objCollection13);
        org.junit.Assert.assertNotNull(exceptionEntrySet14);
        org.junit.Assert.assertNotNull(objCollection16);
        org.junit.Assert.assertNotNull(exceptionEntrySet17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(exceptionEntrySet23);
        org.junit.Assert.assertNotNull(exceptionMap24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap1 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean2 = exceptionMap0.containsValue((java.lang.Object) exceptionMap1);
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet3 = exceptionMap1.entrySet();
        boolean boolean5 = exceptionMap1.containsKey((java.lang.Object) (byte) 1);
        int int6 = exceptionMap1.size();
        java.util.Collection<java.lang.Object> objCollection7 = exceptionMap1.values();
        java.util.Collection<java.lang.Object> objCollection8 = exceptionMap1.values();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(exceptionEntrySet3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objCollection8);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.lang.Object obj2 = exceptionMap0.get((java.lang.Object) (-1L));
        java.lang.Throwable throwable4 = null;
        org.apache.commons.collections4.FunctorException functorException5 = new org.apache.commons.collections4.FunctorException(throwable4);
        org.apache.commons.collections4.FunctorException functorException6 = new org.apache.commons.collections4.FunctorException("hi!", (java.lang.Throwable) functorException5);
        boolean boolean8 = exceptionMap0.removeMapping((java.lang.Exception) functorException5, (java.io.Serializable) '#');
        java.util.Set<java.lang.Exception> exceptionSet9 = exceptionMap0.keySet();
        java.util.Collection<java.lang.Object> objCollection10 = exceptionMap0.values();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(exceptionSet9);
        org.junit.Assert.assertNotNull(objCollection10);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.lang.Object obj2 = exceptionMap0.get((java.lang.Object) (-1L));
        org.apache.commons.collections4.MapIterator<java.lang.Exception, java.lang.Object> exceptionItor3 = exceptionMap0.mapIterator();
        exceptionMap0.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(exceptionItor3);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection1 = exceptionMap0.values();
        int int2 = exceptionMap0.size();
        org.junit.Assert.assertNotNull(objCollection1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap1 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean2 = exceptionMap0.containsValue((java.lang.Object) exceptionMap1);
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet3 = exceptionMap1.entrySet();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap4 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap5 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean6 = exceptionMap4.containsValue((java.lang.Object) exceptionMap5);
        java.lang.Throwable throwable8 = null;
        org.apache.commons.collections4.FunctorException functorException9 = new org.apache.commons.collections4.FunctorException("", throwable8);
        java.lang.Throwable throwable16 = null;
        org.apache.commons.collections4.FunctorException functorException17 = new org.apache.commons.collections4.FunctorException("", throwable16);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap18 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap19 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean20 = exceptionMap18.containsValue((java.lang.Object) exceptionMap19);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap23 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection24 = exceptionMap23.values();
        int int25 = exceptionMap23.size();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap27 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection28 = exceptionMap27.values();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap29 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap30 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean31 = exceptionMap29.containsValue((java.lang.Object) exceptionMap30);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap36 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap37 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean38 = exceptionMap36.containsValue((java.lang.Object) exceptionMap37);
        int int39 = exceptionMap37.size();
        java.lang.Throwable throwable48 = null;
        org.apache.commons.collections4.FunctorException functorException49 = new org.apache.commons.collections4.FunctorException("", throwable48);
        org.apache.commons.collections4.FunctorException functorException50 = new org.apache.commons.collections4.FunctorException("", throwable48);
        java.io.Serializable[] serializableArray51 = new java.io.Serializable[] { (short) -1, 10L, 10.0d, (short) 100, (-1), throwable16, exceptionMap18, 0L, 0L, exceptionMap23, 0, exceptionMap27, exceptionMap29, (short) 1, ' ', "hi!", 100.0f, int39, false, 10.0f, '4', (-1), 1L, 1, throwable48 };
        java.util.ArrayList<java.io.Serializable> serializableList52 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList52, serializableArray51);
        boolean boolean54 = exceptionMap4.putAll((java.lang.Exception) functorException9, (java.util.Collection<java.io.Serializable>) serializableList52);
        boolean boolean56 = exceptionMap1.removeMapping((java.lang.Exception) functorException9, (java.io.Serializable) (-1.0f));
        org.apache.commons.collections4.MapIterator<java.lang.Exception, java.lang.Object> exceptionItor57 = exceptionMap1.mapIterator();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap58 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap59 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean60 = exceptionMap58.containsValue((java.lang.Object) exceptionMap59);
        int int61 = exceptionMap59.size();
        java.util.Collection<java.lang.Object> objCollection62 = exceptionMap59.values();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap63 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap64 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean65 = exceptionMap63.containsValue((java.lang.Object) exceptionMap64);
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet66 = exceptionMap64.entrySet();
        exceptionMap59.putAll((java.util.Map<java.lang.Exception, java.lang.Object>) exceptionMap64);
        java.util.Map<java.lang.Exception, java.lang.Object> exceptionMap68 = exceptionMap64.decorated();
        java.lang.Object obj69 = exceptionMap1.get((java.lang.Object) exceptionMap64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(exceptionEntrySet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objCollection24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objCollection28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(serializableArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(exceptionItor57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(objCollection62);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(exceptionEntrySet66);
        org.junit.Assert.assertNotNull(exceptionMap68);
        org.junit.Assert.assertNull(obj69);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.lang.Object obj2 = exceptionMap0.get((java.lang.Object) (-1L));
        java.lang.Throwable throwable4 = null;
        org.apache.commons.collections4.FunctorException functorException5 = new org.apache.commons.collections4.FunctorException(throwable4);
        org.apache.commons.collections4.FunctorException functorException6 = new org.apache.commons.collections4.FunctorException("hi!", (java.lang.Throwable) functorException5);
        boolean boolean8 = exceptionMap0.removeMapping((java.lang.Exception) functorException5, (java.io.Serializable) '#');
        java.util.Set<java.lang.Exception> exceptionSet9 = exceptionMap0.keySet();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap10 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap11 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean12 = exceptionMap10.containsValue((java.lang.Object) exceptionMap11);
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet13 = exceptionMap11.entrySet();
        boolean boolean15 = exceptionMap11.containsKey((java.lang.Object) (byte) 1);
        int int16 = exceptionMap11.size();
        exceptionMap0.putAll((java.util.Map<java.lang.Exception, java.lang.Object>) exceptionMap11);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(exceptionSet9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(exceptionEntrySet13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection1 = exceptionMap0.values();
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet2 = exceptionMap0.entrySet();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap3 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection4 = exceptionMap3.values();
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet5 = exceptionMap3.entrySet();
        boolean boolean7 = exceptionMap0.remove((java.lang.Object) exceptionEntrySet5, (java.lang.Object) (byte) -1);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap8 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap9 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean10 = exceptionMap8.containsValue((java.lang.Object) exceptionMap9);
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet11 = exceptionMap9.entrySet();
        java.util.Map<java.lang.Exception, java.lang.Object> exceptionMap12 = exceptionMap9.map;
        int int13 = exceptionMap12.size();
        boolean boolean14 = exceptionMap0.containsKey((java.lang.Object) exceptionMap12);
        boolean boolean16 = exceptionMap0.equals((java.lang.Object) 0.0d);
        int int17 = exceptionMap0.size();
        exceptionMap0.clear();
        org.junit.Assert.assertNotNull(objCollection1);
        org.junit.Assert.assertNotNull(exceptionEntrySet2);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertNotNull(exceptionEntrySet5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(exceptionEntrySet11);
        org.junit.Assert.assertNotNull(exceptionMap12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection1 = exceptionMap0.values();
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet2 = exceptionMap0.entrySet();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap3 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection4 = exceptionMap3.values();
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet5 = exceptionMap3.entrySet();
        boolean boolean7 = exceptionMap0.remove((java.lang.Object) exceptionEntrySet5, (java.lang.Object) (byte) -1);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap8 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap9 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean10 = exceptionMap8.containsValue((java.lang.Object) exceptionMap9);
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet11 = exceptionMap9.entrySet();
        java.util.Map<java.lang.Exception, java.lang.Object> exceptionMap12 = exceptionMap9.map;
        int int13 = exceptionMap12.size();
        boolean boolean14 = exceptionMap0.containsKey((java.lang.Object) exceptionMap12);
        boolean boolean16 = exceptionMap0.equals((java.lang.Object) 0.0d);
        int int17 = exceptionMap0.size();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap18 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection19 = exceptionMap18.values();
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet20 = exceptionMap18.entrySet();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap21 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection22 = exceptionMap21.values();
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet23 = exceptionMap21.entrySet();
        boolean boolean25 = exceptionMap18.remove((java.lang.Object) exceptionEntrySet23, (java.lang.Object) (byte) -1);
        java.lang.Object obj26 = exceptionMap0.get((java.lang.Object) boolean25);
        org.junit.Assert.assertNotNull(objCollection1);
        org.junit.Assert.assertNotNull(exceptionEntrySet2);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertNotNull(exceptionEntrySet5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(exceptionEntrySet11);
        org.junit.Assert.assertNotNull(exceptionMap12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objCollection19);
        org.junit.Assert.assertNotNull(exceptionEntrySet20);
        org.junit.Assert.assertNotNull(objCollection22);
        org.junit.Assert.assertNotNull(exceptionEntrySet23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap1 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean2 = exceptionMap0.containsValue((java.lang.Object) exceptionMap1);
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet3 = exceptionMap1.entrySet();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap4 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap5 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean6 = exceptionMap4.containsValue((java.lang.Object) exceptionMap5);
        java.lang.Throwable throwable8 = null;
        org.apache.commons.collections4.FunctorException functorException9 = new org.apache.commons.collections4.FunctorException("", throwable8);
        java.lang.Throwable throwable16 = null;
        org.apache.commons.collections4.FunctorException functorException17 = new org.apache.commons.collections4.FunctorException("", throwable16);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap18 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap19 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean20 = exceptionMap18.containsValue((java.lang.Object) exceptionMap19);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap23 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection24 = exceptionMap23.values();
        int int25 = exceptionMap23.size();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap27 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection28 = exceptionMap27.values();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap29 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap30 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean31 = exceptionMap29.containsValue((java.lang.Object) exceptionMap30);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap36 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap37 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean38 = exceptionMap36.containsValue((java.lang.Object) exceptionMap37);
        int int39 = exceptionMap37.size();
        java.lang.Throwable throwable48 = null;
        org.apache.commons.collections4.FunctorException functorException49 = new org.apache.commons.collections4.FunctorException("", throwable48);
        org.apache.commons.collections4.FunctorException functorException50 = new org.apache.commons.collections4.FunctorException("", throwable48);
        java.io.Serializable[] serializableArray51 = new java.io.Serializable[] { (short) -1, 10L, 10.0d, (short) 100, (-1), throwable16, exceptionMap18, 0L, 0L, exceptionMap23, 0, exceptionMap27, exceptionMap29, (short) 1, ' ', "hi!", 100.0f, int39, false, 10.0f, '4', (-1), 1L, 1, throwable48 };
        java.util.ArrayList<java.io.Serializable> serializableList52 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList52, serializableArray51);
        boolean boolean54 = exceptionMap4.putAll((java.lang.Exception) functorException9, (java.util.Collection<java.io.Serializable>) serializableList52);
        boolean boolean56 = exceptionMap1.removeMapping((java.lang.Exception) functorException9, (java.io.Serializable) (-1.0f));
        boolean boolean58 = exceptionMap1.containsKey((java.lang.Object) 1L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(exceptionEntrySet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objCollection24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objCollection28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(serializableArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection1 = exceptionMap0.values();
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = exceptionMap0.remove(obj2);
        org.junit.Assert.assertNotNull(objCollection1);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap1 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean2 = exceptionMap0.containsValue((java.lang.Object) exceptionMap1);
        int int3 = exceptionMap1.size();
        java.util.Collection<java.lang.Object> objCollection4 = exceptionMap1.values();
        exceptionMap1.clear();
        java.lang.Throwable throwable7 = null;
        org.apache.commons.collections4.FunctorException functorException8 = new org.apache.commons.collections4.FunctorException("", throwable7);
        int int9 = exceptionMap1.size((java.lang.Object) functorException8);
        java.lang.String str10 = exceptionMap1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap1 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean2 = exceptionMap0.containsValue((java.lang.Object) exceptionMap1);
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet3 = exceptionMap1.entrySet();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap4 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap5 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean6 = exceptionMap4.containsValue((java.lang.Object) exceptionMap5);
        java.lang.Throwable throwable8 = null;
        org.apache.commons.collections4.FunctorException functorException9 = new org.apache.commons.collections4.FunctorException("", throwable8);
        java.lang.Throwable throwable16 = null;
        org.apache.commons.collections4.FunctorException functorException17 = new org.apache.commons.collections4.FunctorException("", throwable16);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap18 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap19 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean20 = exceptionMap18.containsValue((java.lang.Object) exceptionMap19);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap23 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection24 = exceptionMap23.values();
        int int25 = exceptionMap23.size();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap27 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection28 = exceptionMap27.values();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap29 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap30 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean31 = exceptionMap29.containsValue((java.lang.Object) exceptionMap30);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap36 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap37 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean38 = exceptionMap36.containsValue((java.lang.Object) exceptionMap37);
        int int39 = exceptionMap37.size();
        java.lang.Throwable throwable48 = null;
        org.apache.commons.collections4.FunctorException functorException49 = new org.apache.commons.collections4.FunctorException("", throwable48);
        org.apache.commons.collections4.FunctorException functorException50 = new org.apache.commons.collections4.FunctorException("", throwable48);
        java.io.Serializable[] serializableArray51 = new java.io.Serializable[] { (short) -1, 10L, 10.0d, (short) 100, (-1), throwable16, exceptionMap18, 0L, 0L, exceptionMap23, 0, exceptionMap27, exceptionMap29, (short) 1, ' ', "hi!", 100.0f, int39, false, 10.0f, '4', (-1), 1L, 1, throwable48 };
        java.util.ArrayList<java.io.Serializable> serializableList52 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList52, serializableArray51);
        boolean boolean54 = exceptionMap4.putAll((java.lang.Exception) functorException9, (java.util.Collection<java.io.Serializable>) serializableList52);
        boolean boolean56 = exceptionMap1.removeMapping((java.lang.Exception) functorException9, (java.io.Serializable) (-1.0f));
        boolean boolean57 = exceptionMap1.isEmpty();
        java.util.Collection<java.lang.Object> objCollection58 = exceptionMap1.values();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(exceptionEntrySet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objCollection24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objCollection28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(serializableArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(objCollection58);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap1 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean2 = exceptionMap0.containsValue((java.lang.Object) exceptionMap1);
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet3 = exceptionMap1.entrySet();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap4 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap5 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean6 = exceptionMap4.containsValue((java.lang.Object) exceptionMap5);
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet7 = exceptionMap5.entrySet();
        java.util.Map<java.lang.Exception, java.lang.Object> exceptionMap8 = exceptionMap5.map;
        int int9 = exceptionMap8.size();
        java.lang.Object obj10 = exceptionMap1.remove((java.lang.Object) int9);
        java.lang.Throwable throwable13 = null;
        org.apache.commons.collections4.FunctorException functorException14 = new org.apache.commons.collections4.FunctorException("", throwable13);
        org.apache.commons.collections4.FunctorException functorException15 = new org.apache.commons.collections4.FunctorException("", throwable13);
        org.apache.commons.collections4.FunctorException functorException17 = new org.apache.commons.collections4.FunctorException("");
        functorException15.addSuppressed((java.lang.Throwable) functorException17);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap19 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap20 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean21 = exceptionMap19.containsValue((java.lang.Object) exceptionMap20);
        boolean boolean23 = exceptionMap20.containsKey((java.lang.Object) (short) 10);
        java.util.Collection<java.io.Serializable> serializableCollection25 = exceptionMap20.createCollection(10);
        boolean boolean26 = exceptionMap1.putAll((java.lang.Exception) functorException17, serializableCollection25);
        java.lang.Object obj27 = null;
        boolean boolean28 = exceptionMap1.containsValue(obj27);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap29 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap30 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean31 = exceptionMap29.containsValue((java.lang.Object) exceptionMap30);
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet32 = exceptionMap30.entrySet();
        exceptionMap30.clear();
        boolean boolean34 = exceptionMap30.isEmpty();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap35 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection36 = exceptionMap35.values();
        int int37 = exceptionMap35.size();
        boolean boolean39 = exceptionMap35.containsValue((java.lang.Object) true);
        boolean boolean40 = exceptionMap30.containsValue((java.lang.Object) boolean39);
        java.util.Set<java.lang.Exception> exceptionSet41 = exceptionMap30.keySet();
        boolean boolean42 = exceptionMap1.containsValue((java.lang.Object) exceptionSet41);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap43 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection44 = exceptionMap43.values();
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet45 = exceptionMap43.entrySet();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap46 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        java.util.Collection<java.lang.Object> objCollection47 = exceptionMap46.values();
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet48 = exceptionMap46.entrySet();
        boolean boolean50 = exceptionMap43.remove((java.lang.Object) exceptionEntrySet48, (java.lang.Object) (byte) -1);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap51 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap52 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean53 = exceptionMap51.containsValue((java.lang.Object) exceptionMap52);
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet54 = exceptionMap52.entrySet();
        java.util.Map<java.lang.Exception, java.lang.Object> exceptionMap55 = exceptionMap52.map;
        int int56 = exceptionMap55.size();
        boolean boolean57 = exceptionMap43.containsKey((java.lang.Object) exceptionMap55);
        boolean boolean59 = exceptionMap43.equals((java.lang.Object) 0.0d);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap60 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap61 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean62 = exceptionMap60.containsValue((java.lang.Object) exceptionMap61);
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet63 = exceptionMap61.entrySet();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap64 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap65 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean66 = exceptionMap64.containsValue((java.lang.Object) exceptionMap65);
        java.util.Set<java.util.Map.Entry<java.lang.Exception, java.lang.Object>> exceptionEntrySet67 = exceptionMap65.entrySet();
        java.util.Map<java.lang.Exception, java.lang.Object> exceptionMap68 = exceptionMap65.map;
        int int69 = exceptionMap68.size();
        java.lang.Object obj70 = exceptionMap61.remove((java.lang.Object) int69);
        java.lang.Throwable throwable73 = null;
        org.apache.commons.collections4.FunctorException functorException74 = new org.apache.commons.collections4.FunctorException("", throwable73);
        org.apache.commons.collections4.FunctorException functorException75 = new org.apache.commons.collections4.FunctorException("", throwable73);
        org.apache.commons.collections4.FunctorException functorException77 = new org.apache.commons.collections4.FunctorException("");
        functorException75.addSuppressed((java.lang.Throwable) functorException77);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap79 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap80 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean81 = exceptionMap79.containsValue((java.lang.Object) exceptionMap80);
        boolean boolean83 = exceptionMap80.containsKey((java.lang.Object) (short) 10);
        java.util.Collection<java.io.Serializable> serializableCollection85 = exceptionMap80.createCollection(10);
        boolean boolean86 = exceptionMap61.putAll((java.lang.Exception) functorException77, serializableCollection85);
        boolean boolean87 = exceptionMap43.containsValue((java.lang.Object) serializableCollection85);
        java.util.Collection<java.io.Serializable> serializableCollection88 = exceptionMap1.getCollection((java.lang.Object) exceptionMap43);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap89 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable> exceptionMap90 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.Exception, java.io.Serializable>();
        boolean boolean91 = exceptionMap89.containsValue((java.lang.Object) exceptionMap90);
        int int92 = exceptionMap90.size();
        java.util.Collection<java.lang.Object> objCollection93 = exceptionMap90.values();
        java.util.Collection<java.io.Serializable> serializableCollection94 = exceptionMap43.getCollection((java.lang.Object) objCollection93);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(exceptionEntrySet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(exceptionEntrySet7);
        org.junit.Assert.assertNotNull(exceptionMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(serializableCollection25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(exceptionEntrySet32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(objCollection36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(exceptionSet41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(objCollection44);
        org.junit.Assert.assertNotNull(exceptionEntrySet45);
        org.junit.Assert.assertNotNull(objCollection47);
        org.junit.Assert.assertNotNull(exceptionEntrySet48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(exceptionEntrySet54);
        org.junit.Assert.assertNotNull(exceptionMap55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(exceptionEntrySet63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(exceptionEntrySet67);
        org.junit.Assert.assertNotNull(exceptionMap68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(serializableCollection85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNull(serializableCollection88);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertNotNull(objCollection93);
        org.junit.Assert.assertNull(serializableCollection94);
    }
}


package org.apache.commons.collections4.trie;

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
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedMap<java.lang.String, java.io.Serializable> strMap4 = serializableMap0.subMap("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromKey > toKey");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap0.mapIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = serializableMap0.firstKey();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(strItor2);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap0.mapIterator();
        java.util.Set set3 = serializableMap0.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable5 = serializableMap0.get((java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable2 = strItor1.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry5 = null;
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry6 = null;
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry8 = serializableMap1.nextEntryImpl(strTrieEntry5, strTrieEntry6, strTrieEntry7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1);
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap6 = serializableMap1.headMap("hi!");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap7 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor8 = serializableMap7.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor9 = serializableMap7.mapIterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = serializableMap1.containsKey((java.lang.Object) strItor9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieMapIterator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strItor8);
        org.junit.Assert.assertNotNull(strItor9);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1);
        int int5 = serializableMap0.bitsPerElement();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry6 = null;
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry7 = null;
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry9 = serializableMap0.nextEntryImpl(strTrieEntry6, strTrieEntry7, strTrieEntry8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap0.mapIterator();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap3 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor4 = serializableMap3.mapIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable5 = strItor2.setValue((java.io.Serializable) serializableMap3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor4);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        boolean boolean1 = org.apache.commons.collections4.trie.KeyAnalyzer.isEqualBitKey((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        int int2 = serializableMap0.size();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = serializableMap0.containsKey((java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedMap<java.lang.String, java.io.Serializable> strMap3 = serializableMap0.subMap("Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromKey > toKey");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = serializableMap0.lastKey();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor1);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap0.mapIterator();
        java.util.Set set3 = serializableMap0.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedMap<java.lang.String, java.io.Serializable> strMap6 = serializableMap0.subMap("hi!", "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromKey > toKey");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap0 = null;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        java.util.Set set4 = serializableMap1.keySet();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry6 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set>(strMap0, set4, (int) ' ');
        java.lang.String str7 = strMapTrieEntry6.toString();
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])" + "'", str7, "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap0.mapIterator();
        java.util.Set set3 = serializableMap0.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap5 = serializableMap0.tailMap("hi!");
        java.io.Serializable serializable7 = serializableMap0.selectValue("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = serializableMap0.firstKey();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(serializable7);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        int int0 = org.apache.commons.collections4.trie.KeyAnalyzer.EQUAL_BIT_KEY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-2) + "'", int0 == (-2));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap0.mapIterator();
        java.util.Set set3 = serializableMap0.keySet();
        boolean boolean4 = serializableMap0.isEmpty();
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap0.mapIterator();
        java.util.Set set3 = serializableMap0.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap5 = serializableMap0.tailMap("hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor6 = serializableMap0.mapIterator();
        boolean boolean7 = strItor6.hasPrevious();
        // The following exception was thrown during execution in test generation
        try {
            strItor6.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        serializableMap0.clear();
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap0.mapIterator();
        boolean boolean3 = strItor2.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable4 = strItor2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry7 = serializableMap0.getNearestEntryForKey("", (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = serializableMap0.containsKey((java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNotNull(strTrieEntry7);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap0.mapIterator();
        java.util.Set set3 = serializableMap0.keySet();
        serializableMap0.clear();
        java.lang.String str6 = serializableMap0.selectKey("");
        java.io.Serializable serializable8 = serializableMap0.selectValue("Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(serializable8);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        boolean boolean1 = org.apache.commons.collections4.trie.KeyAnalyzer.isValidBitIndex(0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap0 = null;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        java.util.Set set4 = serializableMap1.keySet();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry6 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set>(strMap0, set4, (int) ' ');
        java.lang.String str7 = strMapTrieEntry6.toString();
        strMapTrieEntry6.bitIndex = 0;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap10 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor11 = serializableMap10.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor12 = serializableMap10.mapIterator();
        java.util.Set set13 = serializableMap10.keySet();
        boolean boolean15 = serializableMap10.containsKey((java.lang.Object) "hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor16 = serializableMap10.mapIterator();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap17 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor18 = serializableMap17.mapIterator();
        java.util.Collection<java.io.Serializable> serializableCollection19 = serializableMap17.values();
        java.util.Set<java.lang.String> strSet20 = serializableMap17.keySet();
        java.util.Set set21 = strMapTrieEntry6.setKeyValue((java.util.SortedMap<java.lang.String, java.io.Serializable>) serializableMap10, (java.util.Set) strSet20);
        java.io.Serializable serializable24 = serializableMap10.put("hi!", (java.io.Serializable) "");
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])" + "'", str7, "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(serializableCollection19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(serializable24);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        int int0 = org.apache.commons.collections4.trie.KeyAnalyzer.OUT_OF_BOUNDS_BIT_KEY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-3) + "'", int0 == (-3));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        java.util.Collection<java.io.Serializable> serializableCollection2 = serializableMap0.values();
        int int3 = serializableMap0.modCount;
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry7 = serializableMap0.subtree("Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])", (int) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(strTrieEntry7);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap0.mapIterator();
        java.util.Set set3 = serializableMap0.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap5 = serializableMap0.tailMap("hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor6 = serializableMap0.mapIterator();
        // The following exception was thrown during execution in test generation
        try {
            strItor6.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strItor6);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1);
        java.util.Collection<java.io.Serializable> serializableCollection5 = serializableMap0.values();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry7 = serializableMap0.floorEntry("Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNotNull(serializableCollection5);
        org.junit.Assert.assertNull(strTrieEntry7);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap0 = null;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        java.util.Set set4 = serializableMap1.keySet();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry6 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set>(strMap0, set4, (int) ' ');
        java.lang.String str7 = strMapTrieEntry6.toString();
        strMapTrieEntry6.bitIndex = 0;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap10 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor11 = serializableMap10.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor12 = serializableMap10.mapIterator();
        java.util.Set set13 = serializableMap10.keySet();
        boolean boolean15 = serializableMap10.containsKey((java.lang.Object) "hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor16 = serializableMap10.mapIterator();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap17 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor18 = serializableMap17.mapIterator();
        java.util.Collection<java.io.Serializable> serializableCollection19 = serializableMap17.values();
        java.util.Set<java.lang.String> strSet20 = serializableMap17.keySet();
        java.util.Set set21 = strMapTrieEntry6.setKeyValue((java.util.SortedMap<java.lang.String, java.io.Serializable>) serializableMap10, (java.util.Set) strSet20);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry22 = strMapTrieEntry6.parent;
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])" + "'", str7, "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(serializableCollection19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(strMapTrieEntry22);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap0.mapIterator();
        java.util.Set set3 = serializableMap0.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap5 = serializableMap0.tailMap("hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor6 = serializableMap0.mapIterator();
        int int7 = serializableMap0.size();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap10 = serializableMap0.subMap("Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])", "Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap12 = serializableMap0.prefixMap("hi!");
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap0.mapIterator();
        java.util.Set set3 = serializableMap0.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap5 = serializableMap0.tailMap("hi!");
        java.util.Set<java.lang.String> strSet6 = serializableMap0.keySet();
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap0.mapIterator();
        java.util.Set set3 = serializableMap0.keySet();
        serializableMap0.clear();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap5 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap6 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor7 = serializableMap6.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor8 = serializableMap6.mapIterator();
        serializableMap5.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap6);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry12 = serializableMap5.getNearestEntryForKey("", (int) ' ');
        boolean boolean13 = serializableMap0.equals((java.lang.Object) "");
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertNotNull(strItor8);
        org.junit.Assert.assertNotNull(strTrieEntry12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap0.mapIterator();
        java.util.Set set3 = serializableMap0.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap5 = serializableMap0.tailMap("hi!");
        java.io.Serializable serializable7 = serializableMap0.selectValue("");
        serializableMap0.clear();
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(serializable7);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        java.lang.String str3 = serializableMap0.nextKey("Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        boolean boolean1 = org.apache.commons.collections4.trie.KeyAnalyzer.isOutOfBoundsIndex((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap0.mapIterator();
        java.util.Set set3 = serializableMap0.keySet();
        boolean boolean5 = serializableMap0.containsKey((java.lang.Object) "hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor6 = serializableMap0.mapIterator();
        boolean boolean7 = strItor6.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            strItor6.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry6 = serializableMap1.floorEntry("");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap7 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap8 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor9 = serializableMap8.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor10 = serializableMap8.mapIterator();
        serializableMap7.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap8);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry14 = serializableMap7.getNearestEntryForKey("", (int) ' ');
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry15 = serializableMap1.nextEntry(strTrieEntry14);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry17 = serializableMap1.lowerEntry("Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap18 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor19 = serializableMap18.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor20 = serializableMap18.mapIterator();
        java.util.Set set21 = serializableMap18.keySet();
        boolean boolean23 = serializableMap18.containsKey((java.lang.Object) "hi!");
        java.util.Set set24 = serializableMap18.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable25 = serializableMap1.remove((java.lang.Object) set24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.collections4.trie.AbstractPatriciaTrie$KeySet cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNull(strTrieEntry6);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(strTrieEntry14);
        org.junit.Assert.assertNull(strTrieEntry15);
        org.junit.Assert.assertNull(strTrieEntry17);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(set24);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap0.mapIterator();
        java.util.Map<java.lang.String, java.io.Serializable> strMap3 = null;
        // The following exception was thrown during execution in test generation
        try {
            serializableMap0.putAll(strMap3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(strItor2);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1);
        java.lang.String str6 = serializableMap0.previousKey("hi!");
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap8 = serializableMap0.prefixMap("hi!");
        java.util.Set set9 = null;
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry11 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set>(strMap8, set9, (int) (short) 100);
        strMapTrieEntry11.bitIndex = 0;
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap0.mapIterator();
        java.util.Set set3 = serializableMap0.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap5 = serializableMap0.tailMap("hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor6 = serializableMap0.mapIterator();
        int int7 = serializableMap0.size();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap8 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor9 = serializableMap8.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor10 = serializableMap8.mapIterator();
        java.util.Set set11 = serializableMap8.keySet();
        boolean boolean13 = serializableMap8.containsKey((java.lang.Object) "hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor14 = serializableMap8.mapIterator();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap15 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap16 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor17 = serializableMap16.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor18 = serializableMap16.mapIterator();
        serializableMap15.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap16);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry21 = serializableMap16.floorEntry("");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap22 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap23 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor24 = serializableMap23.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor25 = serializableMap23.mapIterator();
        serializableMap22.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap23);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry29 = serializableMap22.getNearestEntryForKey("", (int) ' ');
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry30 = serializableMap16.nextEntry(strTrieEntry29);
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap31 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap32 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor33 = serializableMap32.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor34 = serializableMap32.mapIterator();
        serializableMap31.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap32);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry37 = serializableMap32.floorEntry("");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap38 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap39 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor40 = serializableMap39.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor41 = serializableMap39.mapIterator();
        serializableMap38.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap39);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry45 = serializableMap38.getNearestEntryForKey("", (int) ' ');
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry46 = serializableMap32.nextEntry(strTrieEntry45);
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap47 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap48 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor49 = serializableMap48.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor50 = serializableMap48.mapIterator();
        serializableMap47.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap48);
        java.lang.String str53 = serializableMap47.previousKey("hi!");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap54 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor55 = serializableMap54.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor56 = serializableMap54.mapIterator();
        java.util.Set set57 = serializableMap54.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap59 = serializableMap54.tailMap("hi!");
        java.io.Serializable serializable61 = serializableMap54.selectValue("");
        boolean boolean64 = serializableMap54.compareKeys("hi!", "Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        java.io.Serializable serializable65 = serializableMap47.get((java.lang.Object) "Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap66 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap67 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor68 = serializableMap67.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor69 = serializableMap67.mapIterator();
        serializableMap66.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap67);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry73 = serializableMap66.getNearestEntryForKey("", (int) ' ');
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry74 = serializableMap47.nextEntry(strTrieEntry73);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry75 = serializableMap8.nextEntryImpl(strTrieEntry29, strTrieEntry46, strTrieEntry73);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable76 = serializableMap0.removeEntry(strTrieEntry75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNull(strTrieEntry21);
        org.junit.Assert.assertNotNull(strItor24);
        org.junit.Assert.assertNotNull(strItor25);
        org.junit.Assert.assertNotNull(strTrieEntry29);
        org.junit.Assert.assertNull(strTrieEntry30);
        org.junit.Assert.assertNotNull(strItor33);
        org.junit.Assert.assertNotNull(strItor34);
        org.junit.Assert.assertNull(strTrieEntry37);
        org.junit.Assert.assertNotNull(strItor40);
        org.junit.Assert.assertNotNull(strItor41);
        org.junit.Assert.assertNotNull(strTrieEntry45);
        org.junit.Assert.assertNull(strTrieEntry46);
        org.junit.Assert.assertNotNull(strItor49);
        org.junit.Assert.assertNotNull(strItor50);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(strItor55);
        org.junit.Assert.assertNotNull(strItor56);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNotNull(strMap59);
        org.junit.Assert.assertNull(serializable61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(serializable65);
        org.junit.Assert.assertNotNull(strItor68);
        org.junit.Assert.assertNotNull(strItor69);
        org.junit.Assert.assertNotNull(strTrieEntry73);
        org.junit.Assert.assertNull(strTrieEntry74);
        org.junit.Assert.assertNull(strTrieEntry75);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        boolean boolean2 = strItor1.hasPrevious();
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = strItor1.getKey();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor1);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap0.mapIterator();
        java.util.Set set3 = serializableMap0.keySet();
        boolean boolean5 = serializableMap0.containsKey((java.lang.Object) "hi!");
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry9 = serializableMap0.subtree("hi!", 16, 0);
        java.util.Comparator comparator10 = serializableMap0.comparator();
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strTrieEntry9);
        org.junit.Assert.assertNotNull(comparator10);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        int int0 = org.apache.commons.collections4.trie.KeyAnalyzer.OUT_OF_BOUNDS_BIT_KEY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-3) + "'", int0 == (-3));
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap0.mapIterator();
        java.io.Serializable serializable4 = serializableMap0.selectValue("Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        serializableMap0.clear();
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNull(serializable4);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1);
        int int5 = serializableMap0.bitsPerElement();
        serializableMap0.clear();
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        boolean boolean1 = org.apache.commons.collections4.trie.KeyAnalyzer.isEqualBitKey((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        java.util.Collection<java.io.Serializable> serializableCollection2 = serializableMap0.values();
        java.util.Set<java.lang.String> strSet3 = serializableMap0.keySet();
        java.util.Set<java.util.Map.Entry<java.lang.String, java.io.Serializable>> strEntrySet4 = serializableMap0.entrySet();
        java.util.Set<java.util.Map.Entry<java.lang.String, java.io.Serializable>> strEntrySet5 = serializableMap0.entrySet();
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strEntrySet4);
        org.junit.Assert.assertNotNull(strEntrySet5);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry6 = serializableMap0.ceilingEntry("hi!");
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry9 = serializableMap0.getNearestEntryForKey("hi!", (int) (short) 10);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNull(strTrieEntry6);
        org.junit.Assert.assertNotNull(strTrieEntry9);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1);
        java.lang.String str6 = serializableMap0.previousKey("hi!");
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap8 = serializableMap0.prefixMap("hi!");
        java.util.Set<java.util.Map.Entry<java.lang.String, java.io.Serializable>> strEntrySet9 = serializableMap0.entrySet();
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strEntrySet9);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry6 = serializableMap1.floorEntry("");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap7 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap8 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor9 = serializableMap8.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor10 = serializableMap8.mapIterator();
        serializableMap7.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap8);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry14 = serializableMap7.getNearestEntryForKey("", (int) ' ');
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry15 = serializableMap1.nextEntry(strTrieEntry14);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry17 = serializableMap1.lowerEntry("Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        boolean boolean20 = serializableMap1.compareKeys("Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])", "Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap21 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor22 = serializableMap21.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor23 = serializableMap21.mapIterator();
        java.util.Set set24 = serializableMap21.keySet();
        boolean boolean26 = serializableMap21.containsKey((java.lang.Object) "hi!");
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry30 = serializableMap21.subtree("hi!", 16, 0);
        java.io.Serializable serializable31 = serializableMap1.remove((java.lang.Object) strTrieEntry30);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNull(strTrieEntry6);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(strTrieEntry14);
        org.junit.Assert.assertNull(strTrieEntry15);
        org.junit.Assert.assertNull(strTrieEntry17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strItor22);
        org.junit.Assert.assertNotNull(strItor23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(strTrieEntry30);
        org.junit.Assert.assertNull(serializable31);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1);
        java.util.Collection<java.io.Serializable> serializableCollection5 = serializableMap0.values();
        java.lang.String str7 = serializableMap0.previousKey("hi!");
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNotNull(serializableCollection5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1);
        java.util.Collection<java.io.Serializable> serializableCollection5 = serializableMap0.values();
        boolean boolean9 = serializableMap0.isBitSet("hi!", (-1), (int) (short) 100);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry13 = serializableMap0.subtree("", (int) (byte) 1, (int) '4');
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNotNull(serializableCollection5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strTrieEntry13);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap0.mapIterator();
        java.io.Serializable serializable4 = serializableMap0.selectValue("Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        java.lang.String str6 = serializableMap0.previousKey("Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap0.mapIterator();
        java.util.Set set3 = serializableMap0.keySet();
        boolean boolean5 = serializableMap0.containsKey((java.lang.Object) "hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor6 = serializableMap0.mapIterator();
        java.util.Collection<java.io.Serializable> serializableCollection7 = serializableMap0.values();
        java.lang.String str9 = serializableMap0.previousKey("hi!");
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertNotNull(serializableCollection7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1);
        java.lang.String str6 = serializableMap0.previousKey("hi!");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap7 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor8 = serializableMap7.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor9 = serializableMap7.mapIterator();
        java.util.Set set10 = serializableMap7.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap12 = serializableMap7.tailMap("hi!");
        java.io.Serializable serializable14 = serializableMap7.selectValue("");
        boolean boolean17 = serializableMap7.compareKeys("hi!", "Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        java.io.Serializable serializable18 = serializableMap0.get((java.lang.Object) "Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap19 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap20 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor21 = serializableMap20.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor22 = serializableMap20.mapIterator();
        serializableMap19.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap20);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry26 = serializableMap19.getNearestEntryForKey("", (int) ' ');
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry27 = serializableMap0.nextEntry(strTrieEntry26);
        java.io.Serializable serializable29 = serializableMap0.selectValue("Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strItor8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(serializable14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(serializable18);
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertNotNull(strItor22);
        org.junit.Assert.assertNotNull(strTrieEntry26);
        org.junit.Assert.assertNull(strTrieEntry27);
        org.junit.Assert.assertNull(serializable29);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1);
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap6 = serializableMap1.headMap("hi!");
        int int7 = serializableMap1.size();
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1);
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap6 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor7 = serializableMap6.mapIterator();
        int int8 = serializableMap6.modCount;
        serializableMap6.clear();
        java.io.Serializable serializable10 = serializableMap0.replace("", (java.io.Serializable) serializableMap6);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(serializable10);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry6 = serializableMap1.floorEntry("");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap7 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap8 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor9 = serializableMap8.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor10 = serializableMap8.mapIterator();
        serializableMap7.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap8);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry14 = serializableMap7.getNearestEntryForKey("", (int) ' ');
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry15 = serializableMap1.nextEntry(strTrieEntry14);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry17 = serializableMap1.lowerEntry("Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        java.io.Serializable serializable19 = null;
        boolean boolean21 = serializableMap1.replace("Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])", serializable19, (java.io.Serializable) (-1.0d));
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNull(strTrieEntry6);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(strTrieEntry14);
        org.junit.Assert.assertNull(strTrieEntry15);
        org.junit.Assert.assertNull(strTrieEntry17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry7 = serializableMap0.getNearestEntryForKey("", (int) ' ');
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap8 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap9 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor10 = serializableMap9.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor11 = serializableMap9.mapIterator();
        serializableMap8.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap9);
        int int13 = serializableMap8.bitsPerElement();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable14 = serializableMap0.remove((java.lang.Object) serializableMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.collections4.trie.PatriciaTrie cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNotNull(strTrieEntry7);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16 + "'", int13 == 16);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1);
        java.lang.String str6 = serializableMap0.previousKey("hi!");
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap8 = serializableMap0.prefixMap("hi!");
        java.util.Set set9 = null;
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry11 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set>(strMap8, set9, (int) (short) 100);
        java.util.Set set12 = strMapTrieEntry11.value;
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry13 = strMapTrieEntry11.predecessor;
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(set12);
        org.junit.Assert.assertNotNull(strMapTrieEntry13);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap0 = null;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        java.util.Set set4 = serializableMap1.keySet();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry6 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set>(strMap0, set4, (int) ' ');
        java.lang.String str7 = strMapTrieEntry6.toString();
        strMapTrieEntry6.bitIndex = 0;
        java.lang.String str10 = strMapTrieEntry6.toString();
        int int11 = strMapTrieEntry6.bitIndex;
        int int12 = strMapTrieEntry6.bitIndex;
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])" + "'", str7, "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])" + "'", str10, "Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1);
        java.util.Map.Entry<java.lang.String, java.io.Serializable> strEntry6 = serializableMap0.select("");
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNull(strEntry6);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        // The following exception was thrown during execution in test generation
        try {
            strItor1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor1);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1);
        java.lang.String str6 = serializableMap0.previousKey("hi!");
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap8 = serializableMap0.prefixMap("hi!");
        java.util.Comparator<? super java.lang.String> wildcardComparator9 = strMap8.comparator();
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(wildcardComparator9);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry7 = serializableMap0.getNearestEntryForKey("", (int) ' ');
        java.lang.String str9 = serializableMap0.previousKey("Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap10 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor11 = serializableMap10.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor12 = serializableMap10.mapIterator();
        java.util.Set set13 = serializableMap10.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap15 = serializableMap10.tailMap("hi!");
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) strMap15);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNotNull(strTrieEntry7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap0.mapIterator();
        java.util.Set set3 = serializableMap0.keySet();
        boolean boolean5 = serializableMap0.containsKey((java.lang.Object) "hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor6 = serializableMap0.mapIterator();
        boolean boolean7 = strItor6.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = strItor6.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap0 = null;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        java.util.Set set4 = serializableMap1.keySet();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry6 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set>(strMap0, set4, (int) ' ');
        java.lang.String str7 = strMapTrieEntry6.toString();
        strMapTrieEntry6.bitIndex = 0;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap10 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor11 = serializableMap10.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor12 = serializableMap10.mapIterator();
        java.util.Set set13 = serializableMap10.keySet();
        boolean boolean15 = serializableMap10.containsKey((java.lang.Object) "hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor16 = serializableMap10.mapIterator();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap17 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor18 = serializableMap17.mapIterator();
        java.util.Collection<java.io.Serializable> serializableCollection19 = serializableMap17.values();
        java.util.Set<java.lang.String> strSet20 = serializableMap17.keySet();
        java.util.Set set21 = strMapTrieEntry6.setKeyValue((java.util.SortedMap<java.lang.String, java.io.Serializable>) serializableMap10, (java.util.Set) strSet20);
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap22 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor23 = serializableMap22.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor24 = serializableMap22.mapIterator();
        java.util.Set set25 = serializableMap22.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap27 = serializableMap22.tailMap("hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor28 = serializableMap22.mapIterator();
        int int29 = serializableMap22.size();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap32 = serializableMap22.subMap("Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])", "Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        java.io.Serializable serializable33 = serializableMap10.remove((java.lang.Object) "Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap34 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor35 = serializableMap34.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor36 = serializableMap34.mapIterator();
        java.util.Set set37 = serializableMap34.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap39 = serializableMap34.tailMap("hi!");
        java.io.Serializable serializable41 = serializableMap34.selectValue("");
        boolean boolean42 = serializableMap34.isEmpty();
        serializableMap34.clear();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry47 = serializableMap34.subtree("", 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable48 = serializableMap10.remove((java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])" + "'", str7, "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(serializableCollection19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(strItor23);
        org.junit.Assert.assertNotNull(strItor24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(strItor28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNull(serializable33);
        org.junit.Assert.assertNotNull(strItor35);
        org.junit.Assert.assertNotNull(strItor36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNull(serializable41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(strTrieEntry47);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry6 = serializableMap0.ceilingEntry("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = serializableMap0.lastKey();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNull(strTrieEntry6);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        int int2 = serializableMap0.modCount;
        serializableMap0.clear();
        java.lang.Object obj4 = null;
        boolean boolean5 = serializableMap0.containsKey(obj4);
        serializableMap0.incrementSize();
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap0.mapIterator();
        java.io.Serializable serializable4 = serializableMap0.selectValue("Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap5 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor6 = serializableMap5.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor7 = serializableMap5.mapIterator();
        java.util.Set set8 = serializableMap5.keySet();
        boolean boolean10 = serializableMap5.containsKey((java.lang.Object) "hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor11 = serializableMap5.mapIterator();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap12 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap13 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor14 = serializableMap13.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor15 = serializableMap13.mapIterator();
        serializableMap12.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap13);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry18 = serializableMap13.floorEntry("");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap19 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap20 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor21 = serializableMap20.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor22 = serializableMap20.mapIterator();
        serializableMap19.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap20);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry26 = serializableMap19.getNearestEntryForKey("", (int) ' ');
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry27 = serializableMap13.nextEntry(strTrieEntry26);
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap28 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap29 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor30 = serializableMap29.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor31 = serializableMap29.mapIterator();
        serializableMap28.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap29);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry34 = serializableMap29.floorEntry("");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap35 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap36 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor37 = serializableMap36.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor38 = serializableMap36.mapIterator();
        serializableMap35.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap36);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry42 = serializableMap35.getNearestEntryForKey("", (int) ' ');
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry43 = serializableMap29.nextEntry(strTrieEntry42);
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap44 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap45 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor46 = serializableMap45.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor47 = serializableMap45.mapIterator();
        serializableMap44.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap45);
        java.lang.String str50 = serializableMap44.previousKey("hi!");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap51 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor52 = serializableMap51.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor53 = serializableMap51.mapIterator();
        java.util.Set set54 = serializableMap51.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap56 = serializableMap51.tailMap("hi!");
        java.io.Serializable serializable58 = serializableMap51.selectValue("");
        boolean boolean61 = serializableMap51.compareKeys("hi!", "Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        java.io.Serializable serializable62 = serializableMap44.get((java.lang.Object) "Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap63 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap64 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor65 = serializableMap64.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor66 = serializableMap64.mapIterator();
        serializableMap63.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap64);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry70 = serializableMap63.getNearestEntryForKey("", (int) ' ');
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry71 = serializableMap44.nextEntry(strTrieEntry70);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry72 = serializableMap5.nextEntryImpl(strTrieEntry26, strTrieEntry43, strTrieEntry70);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry73 = serializableMap0.followRight(strTrieEntry70);
        java.util.Set<java.lang.String> strSet74 = serializableMap0.keySet();
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertNull(strTrieEntry18);
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertNotNull(strItor22);
        org.junit.Assert.assertNotNull(strTrieEntry26);
        org.junit.Assert.assertNull(strTrieEntry27);
        org.junit.Assert.assertNotNull(strItor30);
        org.junit.Assert.assertNotNull(strItor31);
        org.junit.Assert.assertNull(strTrieEntry34);
        org.junit.Assert.assertNotNull(strItor37);
        org.junit.Assert.assertNotNull(strItor38);
        org.junit.Assert.assertNotNull(strTrieEntry42);
        org.junit.Assert.assertNull(strTrieEntry43);
        org.junit.Assert.assertNotNull(strItor46);
        org.junit.Assert.assertNotNull(strItor47);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(strItor52);
        org.junit.Assert.assertNotNull(strItor53);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertNull(serializable58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(serializable62);
        org.junit.Assert.assertNotNull(strItor65);
        org.junit.Assert.assertNotNull(strItor66);
        org.junit.Assert.assertNotNull(strTrieEntry70);
        org.junit.Assert.assertNull(strTrieEntry71);
        org.junit.Assert.assertNull(strTrieEntry72);
        org.junit.Assert.assertNull(strTrieEntry73);
        org.junit.Assert.assertNotNull(strSet74);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1);
        java.util.Collection<java.io.Serializable> serializableCollection5 = serializableMap0.values();
        boolean boolean9 = serializableMap0.isBitSet("hi!", (-1), (int) (short) 100);
        java.util.Set set10 = serializableMap0.keySet();
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNotNull(serializableCollection5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        java.util.Collection<java.io.Serializable> serializableCollection2 = serializableMap0.values();
        java.util.Set<java.lang.String> strSet3 = serializableMap0.keySet();
        java.util.Set<java.util.Map.Entry<java.lang.String, java.io.Serializable>> strEntrySet4 = serializableMap0.entrySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap7 = serializableMap0.subMap("Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])", "hi!");
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strEntrySet4);
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1);
        int int5 = serializableMap0.bitsPerElement();
        serializableMap0.modCount = 10;
        boolean boolean8 = serializableMap0.isEmpty();
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap0.mapIterator();
        java.util.Set set3 = serializableMap0.keySet();
        boolean boolean5 = serializableMap0.containsKey((java.lang.Object) "hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor6 = serializableMap0.mapIterator();
        java.util.Set<java.lang.String> strSet7 = serializableMap0.keySet();
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test76");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry6 = serializableMap1.floorEntry("");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap7 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap8 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor9 = serializableMap8.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor10 = serializableMap8.mapIterator();
        serializableMap7.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap8);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry14 = serializableMap7.getNearestEntryForKey("", (int) ' ');
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry15 = serializableMap1.nextEntry(strTrieEntry14);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry17 = serializableMap1.lowerEntry("Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        java.util.Map.Entry<java.lang.String, java.io.Serializable> strEntry19 = serializableMap1.select("Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        int int20 = serializableMap1.size();
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNull(strTrieEntry6);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(strTrieEntry14);
        org.junit.Assert.assertNull(strTrieEntry15);
        org.junit.Assert.assertNull(strTrieEntry17);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test77");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap0.mapIterator();
        java.util.Set set3 = serializableMap0.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap5 = serializableMap0.prefixMap("Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test78");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap0.mapIterator();
        java.util.Set set3 = serializableMap0.keySet();
        serializableMap0.clear();
        java.lang.String str6 = serializableMap0.selectKey("");
        java.lang.String str8 = serializableMap0.nextKey("");
        int int9 = serializableMap0.bitsPerElement();
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test79");
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap0 = null;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        java.util.Set set4 = serializableMap1.keySet();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry6 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set>(strMap0, set4, (int) ' ');
        java.lang.String str7 = strMapTrieEntry6.toString();
        boolean boolean8 = strMapTrieEntry6.isEmpty();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap9 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor10 = serializableMap9.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor11 = serializableMap9.mapIterator();
        java.util.Set set12 = serializableMap9.keySet();
        boolean boolean14 = serializableMap9.containsKey((java.lang.Object) "hi!");
        java.util.Set set15 = serializableMap9.keySet();
        java.util.Set set16 = strMapTrieEntry6.setValue(set15);
        boolean boolean17 = strMapTrieEntry6.isExternalNode();
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])" + "'", str7, "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test80");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap0.mapIterator();
        java.io.Serializable serializable4 = serializableMap0.selectValue("Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap5 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor6 = serializableMap5.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor7 = serializableMap5.mapIterator();
        java.util.Set set8 = serializableMap5.keySet();
        boolean boolean10 = serializableMap5.containsKey((java.lang.Object) "hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor11 = serializableMap5.mapIterator();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap12 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap13 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor14 = serializableMap13.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor15 = serializableMap13.mapIterator();
        serializableMap12.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap13);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry18 = serializableMap13.floorEntry("");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap19 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap20 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor21 = serializableMap20.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor22 = serializableMap20.mapIterator();
        serializableMap19.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap20);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry26 = serializableMap19.getNearestEntryForKey("", (int) ' ');
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry27 = serializableMap13.nextEntry(strTrieEntry26);
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap28 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap29 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor30 = serializableMap29.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor31 = serializableMap29.mapIterator();
        serializableMap28.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap29);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry34 = serializableMap29.floorEntry("");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap35 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap36 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor37 = serializableMap36.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor38 = serializableMap36.mapIterator();
        serializableMap35.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap36);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry42 = serializableMap35.getNearestEntryForKey("", (int) ' ');
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry43 = serializableMap29.nextEntry(strTrieEntry42);
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap44 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap45 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor46 = serializableMap45.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor47 = serializableMap45.mapIterator();
        serializableMap44.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap45);
        java.lang.String str50 = serializableMap44.previousKey("hi!");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap51 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor52 = serializableMap51.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor53 = serializableMap51.mapIterator();
        java.util.Set set54 = serializableMap51.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap56 = serializableMap51.tailMap("hi!");
        java.io.Serializable serializable58 = serializableMap51.selectValue("");
        boolean boolean61 = serializableMap51.compareKeys("hi!", "Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        java.io.Serializable serializable62 = serializableMap44.get((java.lang.Object) "Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap63 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap64 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor65 = serializableMap64.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor66 = serializableMap64.mapIterator();
        serializableMap63.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap64);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry70 = serializableMap63.getNearestEntryForKey("", (int) ' ');
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry71 = serializableMap44.nextEntry(strTrieEntry70);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry72 = serializableMap5.nextEntryImpl(strTrieEntry26, strTrieEntry43, strTrieEntry70);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry73 = serializableMap0.followRight(strTrieEntry70);
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap75 = serializableMap0.headMap("Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        java.util.Set set76 = null;
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry78 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set>(strMap75, set76, (int) (short) 1);
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertNull(strTrieEntry18);
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertNotNull(strItor22);
        org.junit.Assert.assertNotNull(strTrieEntry26);
        org.junit.Assert.assertNull(strTrieEntry27);
        org.junit.Assert.assertNotNull(strItor30);
        org.junit.Assert.assertNotNull(strItor31);
        org.junit.Assert.assertNull(strTrieEntry34);
        org.junit.Assert.assertNotNull(strItor37);
        org.junit.Assert.assertNotNull(strItor38);
        org.junit.Assert.assertNotNull(strTrieEntry42);
        org.junit.Assert.assertNull(strTrieEntry43);
        org.junit.Assert.assertNotNull(strItor46);
        org.junit.Assert.assertNotNull(strItor47);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(strItor52);
        org.junit.Assert.assertNotNull(strItor53);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertNull(serializable58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(serializable62);
        org.junit.Assert.assertNotNull(strItor65);
        org.junit.Assert.assertNotNull(strItor66);
        org.junit.Assert.assertNotNull(strTrieEntry70);
        org.junit.Assert.assertNull(strTrieEntry71);
        org.junit.Assert.assertNull(strTrieEntry72);
        org.junit.Assert.assertNull(strTrieEntry73);
        org.junit.Assert.assertNotNull(strMap75);
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test81");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry2 = serializableMap0.firstEntry();
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNull(strTrieEntry2);
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test82");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1);
        boolean boolean6 = serializableMap1.equals((java.lang.Object) (-1.0f));
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap8 = serializableMap1.headMap("Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap10 = serializableMap1.tailMap("Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap12 = serializableMap1.tailMap("hi!");
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test83");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap0.mapIterator();
        java.util.Set set3 = serializableMap0.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap5 = serializableMap0.tailMap("hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor6 = serializableMap0.mapIterator();
        int int7 = serializableMap0.size();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap9 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap10 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor11 = serializableMap10.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor12 = serializableMap10.mapIterator();
        serializableMap9.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap10);
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap15 = serializableMap10.headMap("hi!");
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator16 = serializableMap10.mapIterator();
        java.io.Serializable serializable17 = serializableMap0.replace("", (java.io.Serializable) serializableMap10);
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(orderedMapIterator16);
        org.junit.Assert.assertNull(serializable17);
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test84");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1);
        int int5 = serializableMap0.bitsPerElement();
        java.io.Serializable serializable8 = serializableMap0.replace("hi!", (java.io.Serializable) (-1.0d));
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap9 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap10 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor11 = serializableMap10.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor12 = serializableMap10.mapIterator();
        serializableMap9.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap10);
        int int14 = serializableMap9.bitsPerElement();
        java.io.Serializable serializable17 = serializableMap9.replace("hi!", (java.io.Serializable) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable18 = serializableMap0.get((java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
        org.junit.Assert.assertNull(serializable8);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertNull(serializable17);
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test85");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry6 = serializableMap1.floorEntry("");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap7 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap8 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor9 = serializableMap8.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor10 = serializableMap8.mapIterator();
        serializableMap7.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap8);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry14 = serializableMap7.getNearestEntryForKey("", (int) ' ');
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry15 = serializableMap1.nextEntry(strTrieEntry14);
        java.util.Set<java.lang.String> strSet16 = serializableMap1.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap17 = null;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap18 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor19 = serializableMap18.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor20 = serializableMap18.mapIterator();
        java.util.Set set21 = serializableMap18.keySet();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry23 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set>(strMap17, set21, (int) ' ');
        java.lang.String str24 = strMapTrieEntry23.toString();
        strMapTrieEntry23.bitIndex = 0;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap27 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor28 = serializableMap27.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor29 = serializableMap27.mapIterator();
        java.util.Set set30 = serializableMap27.keySet();
        boolean boolean32 = serializableMap27.containsKey((java.lang.Object) "hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor33 = serializableMap27.mapIterator();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap34 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor35 = serializableMap34.mapIterator();
        java.util.Collection<java.io.Serializable> serializableCollection36 = serializableMap34.values();
        java.util.Set<java.lang.String> strSet37 = serializableMap34.keySet();
        java.util.Set set38 = strMapTrieEntry23.setKeyValue((java.util.SortedMap<java.lang.String, java.io.Serializable>) serializableMap27, (java.util.Set) strSet37);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.Map<java.lang.String, java.io.Serializable>, java.util.Map<java.lang.String, java.io.Serializable>> strMapTrieEntry40 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.Map<java.lang.String, java.io.Serializable>, java.util.Map<java.lang.String, java.io.Serializable>>((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1, (java.util.Map<java.lang.String, java.io.Serializable>) serializableMap27, (int) '4');
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap41 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor42 = serializableMap41.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor43 = serializableMap41.mapIterator();
        java.util.Set set44 = serializableMap41.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap46 = serializableMap41.tailMap("hi!");
        java.io.Serializable serializable48 = serializableMap41.selectValue("");
        boolean boolean49 = serializableMap41.isEmpty();
        serializableMap41.clear();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry54 = serializableMap41.subtree("", 0, 1);
        java.io.Serializable serializable55 = serializableMap27.remove((java.lang.Object) "");
        java.util.Set set56 = serializableMap27.keySet();
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNull(strTrieEntry6);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(strTrieEntry14);
        org.junit.Assert.assertNull(strTrieEntry15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])" + "'", str24, "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        org.junit.Assert.assertNotNull(strItor28);
        org.junit.Assert.assertNotNull(strItor29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strItor33);
        org.junit.Assert.assertNotNull(strItor35);
        org.junit.Assert.assertNotNull(serializableCollection36);
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(strItor42);
        org.junit.Assert.assertNotNull(strItor43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(strMap46);
        org.junit.Assert.assertNull(serializable48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(strTrieEntry54);
        org.junit.Assert.assertNull(serializable55);
        org.junit.Assert.assertNotNull(set56);
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test86");
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap0 = null;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        java.util.Set set4 = serializableMap1.keySet();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry6 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set>(strMap0, set4, (int) ' ');
        java.lang.String str7 = strMapTrieEntry6.toString();
        strMapTrieEntry6.bitIndex = 0;
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap10 = null;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap11 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor12 = serializableMap11.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor13 = serializableMap11.mapIterator();
        java.util.Set set14 = serializableMap11.keySet();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry16 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set>(strMap10, set14, (int) ' ');
        java.lang.String str17 = strMapTrieEntry16.toString();
        boolean boolean18 = strMapTrieEntry16.isEmpty();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap19 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor20 = serializableMap19.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor21 = serializableMap19.mapIterator();
        java.util.Set set22 = serializableMap19.keySet();
        boolean boolean24 = serializableMap19.containsKey((java.lang.Object) "hi!");
        java.util.Set set25 = serializableMap19.keySet();
        java.util.Set set26 = strMapTrieEntry16.setValue(set25);
        strMapTrieEntry6.right = strMapTrieEntry16;
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])" + "'", str7, "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])" + "'", str17, "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set26);
    }

    @Test
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test87");
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap0 = null;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        java.util.Set set4 = serializableMap1.keySet();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry6 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set>(strMap0, set4, (int) ' ');
        java.lang.String str7 = strMapTrieEntry6.toString();
        strMapTrieEntry6.bitIndex = 0;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap10 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor11 = serializableMap10.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor12 = serializableMap10.mapIterator();
        java.util.Set set13 = serializableMap10.keySet();
        boolean boolean15 = serializableMap10.containsKey((java.lang.Object) "hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor16 = serializableMap10.mapIterator();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap17 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor18 = serializableMap17.mapIterator();
        java.util.Collection<java.io.Serializable> serializableCollection19 = serializableMap17.values();
        java.util.Set<java.lang.String> strSet20 = serializableMap17.keySet();
        java.util.Set set21 = strMapTrieEntry6.setKeyValue((java.util.SortedMap<java.lang.String, java.io.Serializable>) serializableMap10, (java.util.Set) strSet20);
        boolean boolean22 = strMapTrieEntry6.isInternalNode();
        int int23 = strMapTrieEntry6.bitIndex;
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])" + "'", str7, "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(serializableCollection19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test88");
        org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer stringKeyAnalyzer0 = org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer.INSTANCE;
        boolean boolean4 = stringKeyAnalyzer0.isBitSet("hi!", (int) (short) 1, 10);
        org.junit.Assert.assertNotNull(stringKeyAnalyzer0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test89() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test89");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry6 = serializableMap1.floorEntry("");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap7 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap8 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor9 = serializableMap8.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor10 = serializableMap8.mapIterator();
        serializableMap7.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap8);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry14 = serializableMap7.getNearestEntryForKey("", (int) ' ');
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry15 = serializableMap1.nextEntry(strTrieEntry14);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry17 = serializableMap1.lowerEntry("Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        boolean boolean20 = serializableMap1.compareKeys("Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])", "Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap21 = null;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap22 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor23 = serializableMap22.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor24 = serializableMap22.mapIterator();
        java.util.Set set25 = serializableMap22.keySet();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry27 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set>(strMap21, set25, (int) ' ');
        java.lang.String str28 = strMapTrieEntry27.toString();
        strMapTrieEntry27.bitIndex = 0;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap31 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor32 = serializableMap31.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor33 = serializableMap31.mapIterator();
        java.util.Set set34 = serializableMap31.keySet();
        boolean boolean36 = serializableMap31.containsKey((java.lang.Object) "hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor37 = serializableMap31.mapIterator();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap38 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor39 = serializableMap38.mapIterator();
        java.util.Collection<java.io.Serializable> serializableCollection40 = serializableMap38.values();
        java.util.Set<java.lang.String> strSet41 = serializableMap38.keySet();
        java.util.Set set42 = strMapTrieEntry27.setKeyValue((java.util.SortedMap<java.lang.String, java.io.Serializable>) serializableMap31, (java.util.Set) strSet41);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable43 = serializableMap1.remove((java.lang.Object) serializableMap31);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNull(strTrieEntry6);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(strTrieEntry14);
        org.junit.Assert.assertNull(strTrieEntry15);
        org.junit.Assert.assertNull(strTrieEntry17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strItor23);
        org.junit.Assert.assertNotNull(strItor24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])" + "'", str28, "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        org.junit.Assert.assertNotNull(strItor32);
        org.junit.Assert.assertNotNull(strItor33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strItor37);
        org.junit.Assert.assertNotNull(strItor39);
        org.junit.Assert.assertNotNull(serializableCollection40);
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertNotNull(set42);
    }

    @Test
    public void test90() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test90");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry6 = serializableMap1.floorEntry("");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap7 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap8 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor9 = serializableMap8.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor10 = serializableMap8.mapIterator();
        serializableMap7.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap8);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry14 = serializableMap7.getNearestEntryForKey("", (int) ' ');
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry15 = serializableMap1.nextEntry(strTrieEntry14);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry17 = serializableMap1.lowerEntry("Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor18 = serializableMap1.mapIterator();
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNull(strTrieEntry6);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(strTrieEntry14);
        org.junit.Assert.assertNull(strTrieEntry15);
        org.junit.Assert.assertNull(strTrieEntry17);
        org.junit.Assert.assertNotNull(strItor18);
    }

    @Test
    public void test91() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test91");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1);
        java.lang.String str6 = serializableMap0.previousKey("hi!");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap7 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor8 = serializableMap7.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor9 = serializableMap7.mapIterator();
        java.util.Set set10 = serializableMap7.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap12 = serializableMap7.tailMap("hi!");
        java.io.Serializable serializable14 = serializableMap7.selectValue("");
        boolean boolean17 = serializableMap7.compareKeys("hi!", "Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        java.io.Serializable serializable18 = serializableMap0.get((java.lang.Object) "Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap19 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap20 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor21 = serializableMap20.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor22 = serializableMap20.mapIterator();
        serializableMap19.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap20);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry26 = serializableMap19.getNearestEntryForKey("", (int) ' ');
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry27 = serializableMap0.nextEntry(strTrieEntry26);
        java.util.Collection collection28 = serializableMap0.values();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap29 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor30 = serializableMap29.mapIterator();
        java.util.Collection<java.io.Serializable> serializableCollection31 = serializableMap29.values();
        int int32 = serializableMap29.modCount;
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable33 = serializableMap0.remove((java.lang.Object) serializableMap29);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strItor8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(serializable14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(serializable18);
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertNotNull(strItor22);
        org.junit.Assert.assertNotNull(strTrieEntry26);
        org.junit.Assert.assertNull(strTrieEntry27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(strItor30);
        org.junit.Assert.assertNotNull(serializableCollection31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test92() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test92");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        int int2 = serializableMap0.modCount;
        java.util.Set set3 = serializableMap0.entrySet();
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test93() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test93");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry6 = serializableMap1.floorEntry("");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap7 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap8 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor9 = serializableMap8.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor10 = serializableMap8.mapIterator();
        serializableMap7.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap8);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry14 = serializableMap7.getNearestEntryForKey("", (int) ' ');
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry15 = serializableMap1.nextEntry(strTrieEntry14);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry17 = serializableMap1.lowerEntry("Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        java.util.Map.Entry<java.lang.String, java.io.Serializable> strEntry19 = serializableMap1.select("Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap20 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor21 = serializableMap20.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor22 = serializableMap20.mapIterator();
        java.util.Set set23 = serializableMap20.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap25 = serializableMap20.tailMap("hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor26 = serializableMap20.mapIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = serializableMap1.get((java.lang.Object) strItor26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNull(strTrieEntry6);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(strTrieEntry14);
        org.junit.Assert.assertNull(strTrieEntry15);
        org.junit.Assert.assertNull(strTrieEntry17);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertNotNull(strItor22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(strItor26);
    }

    @Test
    public void test94() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test94");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap0.mapIterator();
        int int3 = serializableMap0.modCount;
        java.util.Set<java.util.Map.Entry<java.lang.String, java.io.Serializable>> strEntrySet4 = serializableMap0.entrySet();
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strEntrySet4);
    }

    @Test
    public void test95() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test95");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        java.util.Collection<java.io.Serializable> serializableCollection2 = serializableMap0.values();
        java.util.Set<java.lang.String> strSet3 = serializableMap0.keySet();
        java.util.Set<java.lang.String> strSet4 = serializableMap0.keySet();
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test96() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test96");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap0.mapIterator();
        boolean boolean3 = strItor2.hasNext();
        boolean boolean4 = strItor2.hasNext();
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test97() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test97");
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap0 = null;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        java.util.Set set4 = serializableMap1.keySet();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry6 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set>(strMap0, set4, (int) ' ');
        java.lang.String str7 = strMapTrieEntry6.toString();
        strMapTrieEntry6.bitIndex = 0;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap10 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor11 = serializableMap10.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor12 = serializableMap10.mapIterator();
        java.util.Set set13 = serializableMap10.keySet();
        boolean boolean15 = serializableMap10.containsKey((java.lang.Object) "hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor16 = serializableMap10.mapIterator();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap17 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor18 = serializableMap17.mapIterator();
        java.util.Collection<java.io.Serializable> serializableCollection19 = serializableMap17.values();
        java.util.Set<java.lang.String> strSet20 = serializableMap17.keySet();
        java.util.Set set21 = strMapTrieEntry6.setKeyValue((java.util.SortedMap<java.lang.String, java.io.Serializable>) serializableMap10, (java.util.Set) strSet20);
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap22 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor23 = serializableMap22.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor24 = serializableMap22.mapIterator();
        java.util.Set set25 = serializableMap22.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap27 = serializableMap22.tailMap("hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor28 = serializableMap22.mapIterator();
        int int29 = serializableMap22.size();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap32 = serializableMap22.subMap("Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])", "Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        java.io.Serializable serializable33 = serializableMap10.remove((java.lang.Object) "Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        serializableMap10.clear();
        serializableMap10.clear();
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])" + "'", str7, "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(serializableCollection19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(strItor23);
        org.junit.Assert.assertNotNull(strItor24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(strItor28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNull(serializable33);
    }
}


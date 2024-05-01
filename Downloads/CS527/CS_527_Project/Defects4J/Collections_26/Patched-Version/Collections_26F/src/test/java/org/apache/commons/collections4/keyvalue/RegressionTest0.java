package org.apache.commons.collections4.keyvalue;

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
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str5 = charSequenceMultiKey4.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence7 = charSequenceMultiKey4.getKey((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str5 = charSequenceMultiKey4.toString();
        java.lang.Class<?> wildcardClass6 = charSequenceMultiKey4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence6 = charSequenceMultiKey4.getKey(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        java.lang.Class<?> wildcardClass7 = charSequenceMultiKey6.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str5 = charSequenceMultiKey4.toString();
        int int6 = charSequenceMultiKey4.size();
        java.lang.Class<?> wildcardClass7 = charSequenceMultiKey4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str5 = charSequenceMultiKey4.toString();
        int int6 = charSequenceMultiKey4.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence8 = charSequenceMultiKey4.getKey(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence3 = charSequenceMultiKey1.getKey((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray0);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str5 = charSequenceMultiKey4.toString();
        java.lang.CharSequence[] charSequenceArray6 = null; // flaky: charSequenceMultiKey4.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence8 = charSequenceMultiKey4.getKey((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray6);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence4 = charSequenceMultiKey2.getKey((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray0);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        int int3 = charSequenceMultiKey2.size();
        int int4 = charSequenceMultiKey2.size();
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence5 = charSequenceMultiKey3.getKey(3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence6 = charSequenceMultiKey4.getKey(3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.lang.CharSequence[] charSequenceArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The array of keys must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", charSequence1, (java.lang.CharSequence) "hi!");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence2, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray7 = null; // flaky: charSequenceMultiKey6.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray7);
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable> serializableMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable>((java.io.Serializable) false, (java.io.Serializable) (byte) 10, (java.io.Serializable) charSequenceArray7);
        java.lang.Class<?> wildcardClass10 = null; // flaky: charSequenceArray7.getClass();
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray7);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence4 = charSequenceMultiKey2.getKey(3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        java.lang.Object obj7 = charSequenceMultiKey6.readResolve();
        java.lang.String str8 = charSequenceMultiKey6.toString();
        java.lang.String str9 = charSequenceMultiKey6.toString();
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]" + "'", str8, "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]" + "'", str9, "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "", (java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        boolean boolean8 = charSequenceMultiKey6.equals((java.lang.Object) '4');
        java.lang.CharSequence charSequence9 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey13 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence9, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str14 = charSequenceMultiKey13.toString();
        java.lang.String str15 = charSequenceMultiKey13.toString();
        boolean boolean16 = charSequenceMultiKey6.equals((java.lang.Object) charSequenceMultiKey13);
        int int17 = charSequenceMultiKey13.size();
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str14, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str15, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str5 = charSequenceMultiKey4.toString();
        java.lang.CharSequence[] charSequenceArray6 = null; // flaky: charSequenceMultiKey4.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence8 = charSequenceMultiKey4.getKey((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray6);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str5 = charSequenceMultiKey4.toString();
        java.lang.String str6 = charSequenceMultiKey4.toString();
        java.lang.Object obj7 = null;
        boolean boolean8 = charSequenceMultiKey4.equals(obj7);
        java.lang.CharSequence[] charSequenceArray9 = null; // flaky: charSequenceMultiKey4.getKeys();
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "MultiKey[null, hi!, hi!, hi!]", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" };
        java.lang.CharSequence[] charSequenceArray13 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray13);
        java.lang.CharSequence[] charSequenceArray19 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray19, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]> charSequenceArrayMultiKey22 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]>(charSequenceArray9, charSequenceArray12, charSequenceArray13, charSequenceArray19);
        java.lang.Class<?> wildcardClass23 = charSequenceArray19.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str6, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertNotNull(charSequenceArray12);
        org.junit.Assert.assertNotNull(charSequenceArray13);
        org.junit.Assert.assertNotNull(charSequenceArray19);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!, hi!]");
        java.lang.Class<?> wildcardClass4 = strComparableMultiKey3.getClass();
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray5);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray17, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray17, true);
        java.lang.CharSequence[] charSequenceArray22 = charSequenceMultiKey21.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray24 = new org.apache.commons.collections4.keyvalue.MultiKey[4];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray25 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray24;
        charSequenceMultiKeyArray25[0] = charSequenceMultiKey6;
        charSequenceMultiKeyArray25[1] = charSequenceMultiKey9;
        charSequenceMultiKeyArray25[2] = charSequenceMultiKey12;
        charSequenceMultiKeyArray25[3] = charSequenceMultiKey21;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>> charSequenceMultiKeyMultiKey35 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>>(charSequenceMultiKeyArray25, false);
        java.lang.Class<?> wildcardClass36 = charSequenceMultiKeyMultiKey35.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type> typeMultiKey37 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type>((java.lang.reflect.Type) wildcardClass4, (java.lang.reflect.Type) wildcardClass36);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceArray17);
        org.junit.Assert.assertNotNull(charSequenceArray22);
        org.junit.Assert.assertNotNull(multiKeyArray24);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray25);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray5 = null; // flaky: charSequenceMultiKey4.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray5);
        java.lang.String str7 = null; // flaky: charSequenceMultiKey6.toString();
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray5);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str7, "MultiKey[null, hi!, hi!, hi!]");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        java.lang.CharSequence charSequence3 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence3, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray8 = null; // flaky: charSequenceMultiKey7.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey9 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray8);
        int int10 = 0; // flaky: charSequenceMultiKey9.size();
        boolean boolean11 = charSequenceMultiKey2.equals((java.lang.Object) charSequenceMultiKey9);
        org.junit.Assert.assertNotNull(charSequenceArray0);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray8);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence2, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str7 = charSequenceMultiKey6.toString();
        int int8 = charSequenceMultiKey6.size();
        java.lang.Class<?> wildcardClass9 = charSequenceMultiKey6.getClass();
        java.io.Serializable[] serializableArray10 = new java.io.Serializable[] { (short) 0, (byte) 100, charSequenceMultiKey6 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable> serializableMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable>(serializableArray10, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str7, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(serializableArray10);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, true);
        java.lang.CharSequence[] charSequenceArray9 = charSequenceMultiKey8.getKeys();
        java.lang.CharSequence charSequence11 = charSequenceMultiKey8.getKey((int) (byte) 0);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "" + "'", charSequence11, "");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", charSequence2, (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
        java.lang.CharSequence charSequence7 = charSequenceMultiKey5.getKey((int) (short) 1);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]" + "'", charSequence7, "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[]");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", (java.lang.CharSequence) "MultiKey[]");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
        java.lang.Object obj3 = null;
        boolean boolean4 = charSequenceMultiKey2.equals(obj3);
        java.lang.String str5 = charSequenceMultiKey2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence7 = charSequenceMultiKey2.getKey((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" + "'", str5, "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        java.lang.String str7 = charSequenceMultiKey6.toString();
        int int8 = charSequenceMultiKey6.size();
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" + "'", str7, "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", (java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "");
        int int6 = charSequenceMultiKey5.size();
        java.lang.String str7 = charSequenceMultiKey5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]" + "'", str7, "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray5 = null; // flaky: charSequenceMultiKey4.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey7 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray5, false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray5);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str5 = charSequenceMultiKey4.toString();
        java.lang.String str6 = charSequenceMultiKey4.toString();
        java.lang.Object obj7 = null;
        boolean boolean8 = charSequenceMultiKey4.equals(obj7);
        java.lang.CharSequence[] charSequenceArray9 = null; // flaky: charSequenceMultiKey4.getKeys();
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "MultiKey[null, hi!, hi!, hi!]", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" };
        java.lang.CharSequence[] charSequenceArray13 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray13);
        java.lang.CharSequence[] charSequenceArray19 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray19, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]> charSequenceArrayMultiKey22 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]>(charSequenceArray9, charSequenceArray12, charSequenceArray13, charSequenceArray19);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey24 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray9, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str6, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertNotNull(charSequenceArray12);
        org.junit.Assert.assertNotNull(charSequenceArray13);
        org.junit.Assert.assertNotNull(charSequenceArray19);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.lang.Object[] objArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object> objMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object>(objArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The array of keys must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        java.lang.Object obj3 = charSequenceMultiKey2.readResolve();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "MultiKey[null, MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "MultiKey[null, MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "MultiKey[null, MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]]");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, true);
        java.lang.String str12 = charSequenceMultiKey11.toString();
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" + "'", str12, "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", charSequence2);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
        java.lang.CharSequence charSequence7 = charSequenceMultiKey5.getKey(4);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", charSequence7, "MultiKey[null, hi!, hi!, hi!]");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0, false);
        int int4 = charSequenceMultiKey3.size();
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        int int3 = charSequenceMultiKey2.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5);
        java.lang.Class<?> wildcardClass7 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray5 = null; // flaky: charSequenceMultiKey4.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray5);
        java.lang.Object obj7 = null; // flaky: charSequenceMultiKey6.readResolve();
        java.lang.String str8 = null; // flaky: charSequenceMultiKey6.toString();
        java.lang.String str9 = null; // flaky: charSequenceMultiKey6.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence11 = null; // flaky: charSequenceMultiKey6.getKey((int) 'a');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray5);
// flaky:         org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str8, "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str9, "MultiKey[null, hi!, hi!, hi!]");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.lang.CharSequence charSequence3 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", (java.lang.CharSequence) "", charSequence3, (java.lang.CharSequence) "MultiKey[]");
        int int6 = charSequenceMultiKey5.size();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String> strMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String>("MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", "MultiKey[null, hi!, hi!, hi!]");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "hi!");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        java.lang.CharSequence[] charSequenceArray5 = null; // flaky: charSequenceMultiKey4.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey7 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray5, false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray5);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", charSequence2, (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "");
        java.lang.CharSequence[] charSequenceArray6 = null; // flaky: charSequenceMultiKey5.getKeys();
        java.lang.Class<?> wildcardClass7 = null; // flaky: charSequenceArray6.getClass();
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray6);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        java.lang.Object obj2 = charSequenceMultiKey1.readResolve();
        java.lang.Object obj3 = charSequenceMultiKey1.readResolve();
        java.lang.String str4 = charSequenceMultiKey1.toString();
        java.lang.Class<?> wildcardClass5 = charSequenceMultiKey1.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "MultiKey[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "MultiKey[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "MultiKey[]");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "MultiKey[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "MultiKey[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "MultiKey[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiKey[]" + "'", str4, "MultiKey[]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "");
        int int5 = charSequenceMultiKey4.size();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        java.lang.CharSequence charSequence6 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence6, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str11 = charSequenceMultiKey10.toString();
        int int12 = charSequenceMultiKey10.size();
        java.lang.Class<?> wildcardClass13 = charSequenceMultiKey10.getClass();
        java.lang.reflect.Type[] typeArray14 = new java.lang.reflect.Type[] { wildcardClass13 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type> typeMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type>(typeArray14, true);
        boolean boolean17 = charSequenceMultiKey5.equals((java.lang.Object) true);
        java.lang.CharSequence[] charSequenceArray18 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray18);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey20 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray18);
        java.lang.String str21 = charSequenceMultiKey20.toString();
        boolean boolean22 = charSequenceMultiKey5.equals((java.lang.Object) charSequenceMultiKey20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence24 = charSequenceMultiKey20.getKey((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str11, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(charSequenceArray18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MultiKey[]" + "'", str21, "MultiKey[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[]");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "");
        java.lang.CharSequence[] charSequenceArray6 = null; // flaky: charSequenceMultiKey5.getKeys();
        java.lang.String str7 = charSequenceMultiKey5.toString();
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]" + "'", str7, "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[]", charSequence2);
        java.lang.Object obj4 = charSequenceMultiKey3.readResolve();
        java.lang.String str5 = charSequenceMultiKey3.toString();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]" + "'", str5, "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        java.lang.String str3 = charSequenceMultiKey2.toString();
        java.lang.String str4 = charSequenceMultiKey2.toString();
        int int5 = charSequenceMultiKey2.size();
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MultiKey[]" + "'", str3, "MultiKey[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiKey[]" + "'", str4, "MultiKey[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
        java.lang.CharSequence[] charSequenceArray3 = null; // flaky: charSequenceMultiKey2.getKeys();
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray3);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        java.lang.CharSequence charSequence6 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence6, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str11 = charSequenceMultiKey10.toString();
        int int12 = charSequenceMultiKey10.size();
        java.lang.Class<?> wildcardClass13 = charSequenceMultiKey10.getClass();
        java.lang.reflect.Type[] typeArray14 = new java.lang.reflect.Type[] { wildcardClass13 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type> typeMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type>(typeArray14, true);
        boolean boolean17 = charSequenceMultiKey5.equals((java.lang.Object) true);
        java.lang.String str18 = charSequenceMultiKey5.toString();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str11, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]" + "'", str18, "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
        java.lang.Object obj3 = null;
        boolean boolean4 = charSequenceMultiKey2.equals(obj3);
        java.lang.CharSequence[] charSequenceArray5 = null; // flaky: charSequenceMultiKey2.getKeys();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray5);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", charSequence2, (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "hi!");
        java.lang.String str6 = charSequenceMultiKey5.toString();
        java.lang.Object obj7 = charSequenceMultiKey5.readResolve();
        java.lang.Object obj8 = charSequenceMultiKey5.readResolve();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]" + "'", str6, "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", (java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
        java.lang.CharSequence[] charSequenceArray6 = null; // flaky: charSequenceMultiKey5.getKeys();
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray6);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.lang.CharSequence charSequence3 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", charSequence3);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        java.lang.CharSequence[] charSequenceArray7 = charSequenceMultiKey6.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray7, false);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceArray7);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str5 = charSequenceMultiKey4.toString();
        java.lang.String str6 = charSequenceMultiKey4.toString();
        java.lang.Object obj7 = null;
        boolean boolean8 = charSequenceMultiKey4.equals(obj7);
        java.lang.CharSequence[] charSequenceArray9 = null; // flaky: charSequenceMultiKey4.getKeys();
        java.lang.String str10 = charSequenceMultiKey4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str6, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str10, "MultiKey[null, hi!, hi!, hi!]");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        java.lang.String str3 = charSequenceMultiKey2.toString();
        java.lang.String str4 = charSequenceMultiKey2.toString();
        java.lang.Object obj5 = charSequenceMultiKey2.readResolve();
        java.lang.Class<?> wildcardClass6 = charSequenceMultiKey2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]" + "'", str3, "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]" + "'", str4, "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
        java.lang.String str4 = charSequenceMultiKey3.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence6 = charSequenceMultiKey3.getKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]" + "'", str4, "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0, false);
        java.lang.CharSequence[] charSequenceArray5 = charSequenceMultiKey4.getKeys();
        java.lang.String str6 = charSequenceMultiKey4.toString();
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[]" + "'", str6, "MultiKey[]");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        java.lang.CharSequence charSequence4 = charSequenceMultiKey2.getKey((int) (byte) 1);
        int int5 = charSequenceMultiKey2.size();
        org.junit.Assert.assertEquals("'" + charSequence4 + "' != '" + "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" + "'", charSequence4, "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str5 = charSequenceMultiKey4.toString();
        java.lang.CharSequence[] charSequenceArray6 = null; // flaky: charSequenceMultiKey4.getKeys();
        java.lang.Class<?> wildcardClass7 = charSequenceMultiKey4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.lang.Comparable<java.lang.String>[] strComparableArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The array of keys must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray5 = null; // flaky: charSequenceMultiKey4.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray5);
        java.lang.Object obj7 = null; // flaky: charSequenceMultiKey6.readResolve();
        java.lang.CharSequence charSequence9 = null; // flaky: charSequenceMultiKey6.getKey(3);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray5);
// flaky:         org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9, "hi!");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        java.lang.CharSequence[] charSequenceArray7 = charSequenceMultiKey6.getKeys();
        int int8 = charSequenceMultiKey6.size();
        java.lang.CharSequence[] charSequenceArray9 = charSequenceMultiKey6.getKeys();
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(charSequenceArray9);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", charSequence2);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4);
        java.lang.String str8 = charSequenceMultiKey7.toString();
        boolean boolean10 = charSequenceMultiKey7.equals((java.lang.Object) 10L);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]" + "'", str8, "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.io.Serializable serializable0 = null;
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray1);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray1);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray1, false);
        java.lang.CharSequence[] charSequenceArray6 = charSequenceMultiKey5.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray6);
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable> serializableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable>(serializable0, (java.io.Serializable) charSequenceArray6);
        org.junit.Assert.assertNotNull(charSequenceArray1);
        org.junit.Assert.assertNotNull(charSequenceArray6);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        java.lang.CharSequence[] charSequenceArray5 = null; // flaky: charSequenceMultiKey4.getKeys();
        int int6 = charSequenceMultiKey4.size();
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", charSequence2, (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
        java.lang.CharSequence charSequence9 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey13 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence9, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str14 = charSequenceMultiKey13.toString();
        java.lang.String str15 = charSequenceMultiKey13.toString();
        java.lang.Object obj16 = null;
        boolean boolean17 = charSequenceMultiKey13.equals(obj16);
        java.lang.CharSequence[] charSequenceArray18 = null; // flaky: charSequenceMultiKey13.getKeys();
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "MultiKey[null, hi!, hi!, hi!]", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" };
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray22);
        java.lang.CharSequence[] charSequenceArray28 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey30 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray28, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]> charSequenceArrayMultiKey31 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]>(charSequenceArray18, charSequenceArray21, charSequenceArray22, charSequenceArray28);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey33 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray22, true);
        boolean boolean34 = charSequenceMultiKey8.equals((java.lang.Object) charSequenceArray22);
        boolean boolean35 = charSequenceMultiKey5.equals((java.lang.Object) boolean34);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str14, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str15, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray18);
        org.junit.Assert.assertNotNull(charSequenceArray21);
        org.junit.Assert.assertNotNull(charSequenceArray22);
        org.junit.Assert.assertNotNull(charSequenceArray28);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type> typeMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type>(typeArray0);
        org.junit.Assert.assertNotNull(typeArray0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.lang.CharSequence charSequence4 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]", charSequence4);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str5 = charSequenceMultiKey4.toString();
        java.lang.String str6 = charSequenceMultiKey4.toString();
        java.lang.Object obj7 = charSequenceMultiKey4.readResolve();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str6, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "MultiKey[null, hi!, hi!, hi!]");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5);
        java.lang.String[] strArray9 = new java.lang.String[] { "MultiKey[null, hi!, hi!, hi!]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray15);
        java.lang.String[] strArray22 = new java.lang.String[] { "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "hi!", "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", "MultiKey[]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray5, strArray9, strArray15, strArray22);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey24 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey25 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray5);
        java.lang.String str26 = charSequenceMultiKey25.toString();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]" + "'", str26, "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "");
        java.lang.CharSequence[] charSequenceArray6 = null; // flaky: charSequenceMultiKey5.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray6, false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray6);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]", (java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5);
        java.lang.String[] strArray9 = new java.lang.String[] { "MultiKey[null, hi!, hi!, hi!]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray15);
        java.lang.String[] strArray22 = new java.lang.String[] { "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "hi!", "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", "MultiKey[]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray5, strArray9, strArray15, strArray22);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey24 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey25 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray5);
        int int26 = charSequenceMultiKey25.size();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray1 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray2 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray1;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray4 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray5 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray4;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray7 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray8 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray7;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray10 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray11 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray10;
        org.apache.commons.collections4.keyvalue.MultiKey[][] multiKeyArray13 = new org.apache.commons.collections4.keyvalue.MultiKey[4][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][] charSequenceMultiKeyArray14 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][]) multiKeyArray13;
        charSequenceMultiKeyArray14[0] = multiKeyArray1;
        charSequenceMultiKeyArray14[1] = charSequenceMultiKeyArray5;
        charSequenceMultiKeyArray14[2] = multiKeyArray7;
        charSequenceMultiKeyArray14[3] = multiKeyArray10;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]> charSequenceMultiKeyArrayMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]>(charSequenceMultiKeyArray14);
        java.lang.Class<?> wildcardClass24 = charSequenceMultiKeyArray14.getClass();
        org.junit.Assert.assertNotNull(multiKeyArray1);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray2);
        org.junit.Assert.assertNotNull(multiKeyArray4);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray5);
        org.junit.Assert.assertNotNull(multiKeyArray7);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray8);
        org.junit.Assert.assertNotNull(multiKeyArray10);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray11);
        org.junit.Assert.assertNotNull(multiKeyArray13);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray14);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String> strMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String>("MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", "MultiKey[null, hi!, hi!, hi!]", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]", (java.lang.CharSequence) "MultiKey[]");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
        boolean boolean5 = charSequenceMultiKey3.equals((java.lang.Object) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", (java.lang.CharSequence) "");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", (java.lang.CharSequence) "hi!");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, true);
        java.lang.String str9 = charSequenceMultiKey8.toString();
        int int10 = charSequenceMultiKey8.size();
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" + "'", str9, "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", charSequence2, (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "hi!");
        java.lang.String str6 = charSequenceMultiKey5.toString();
        java.lang.Object obj7 = charSequenceMultiKey5.readResolve();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        java.lang.String str11 = charSequenceMultiKey10.toString();
        java.lang.String str12 = charSequenceMultiKey10.toString();
        java.lang.Object obj13 = charSequenceMultiKey10.readResolve();
        boolean boolean14 = charSequenceMultiKey5.equals(obj13);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]" + "'", str6, "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]" + "'", str11, "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]" + "'", str12, "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "");
        java.lang.CharSequence[] charSequenceArray5 = null; // flaky: charSequenceMultiKey4.getKeys();
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray5);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[]", charSequence2);
        java.lang.Object obj4 = charSequenceMultiKey3.readResolve();
        java.lang.CharSequence[] charSequenceArray5 = null; // flaky: charSequenceMultiKey3.getKeys();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]");
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray5);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.lang.CharSequence charSequence3 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]", charSequence3, (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        java.lang.CharSequence charSequence6 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence6, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str11 = charSequenceMultiKey10.toString();
        int int12 = charSequenceMultiKey10.size();
        java.lang.Class<?> wildcardClass13 = charSequenceMultiKey10.getClass();
        java.lang.reflect.Type[] typeArray14 = new java.lang.reflect.Type[] { wildcardClass13 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type> typeMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type>(typeArray14, true);
        boolean boolean17 = charSequenceMultiKey5.equals((java.lang.Object) true);
        java.lang.CharSequence[] charSequenceArray18 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray18);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey20 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray18);
        java.lang.String str21 = charSequenceMultiKey20.toString();
        boolean boolean22 = charSequenceMultiKey5.equals((java.lang.Object) charSequenceMultiKey20);
        int int23 = charSequenceMultiKey20.size();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str11, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(charSequenceArray18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MultiKey[]" + "'", str21, "MultiKey[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        java.lang.String str3 = charSequenceMultiKey2.toString();
        java.lang.String str4 = charSequenceMultiKey2.toString();
        boolean boolean6 = charSequenceMultiKey2.equals((java.lang.Object) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MultiKey[]" + "'", str3, "MultiKey[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiKey[]" + "'", str4, "MultiKey[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence7 = charSequenceMultiKey5.getKey((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str5 = charSequenceMultiKey4.toString();
        java.lang.String str6 = charSequenceMultiKey4.toString();
        java.lang.Object obj7 = null;
        boolean boolean8 = charSequenceMultiKey4.equals(obj7);
        java.lang.CharSequence[] charSequenceArray9 = null; // flaky: charSequenceMultiKey4.getKeys();
        java.lang.Object obj10 = charSequenceMultiKey4.readResolve();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str6, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "MultiKey[null, hi!, hi!, hi!]");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]", (java.lang.CharSequence) "");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        java.lang.CharSequence[] charSequenceArray2 = charSequenceMultiKey1.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray2);
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertNotNull(charSequenceArray2);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray7, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray7, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray7);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray7, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey15 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray7);
        boolean boolean16 = charSequenceMultiKey2.equals((java.lang.Object) charSequenceMultiKey15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence18 = charSequenceMultiKey2.getKey((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str5 = charSequenceMultiKey4.toString();
        java.lang.String str6 = charSequenceMultiKey4.toString();
        java.lang.Object obj7 = null;
        boolean boolean8 = charSequenceMultiKey4.equals(obj7);
        java.lang.CharSequence[] charSequenceArray9 = null; // flaky: charSequenceMultiKey4.getKeys();
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "MultiKey[null, hi!, hi!, hi!]", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" };
        java.lang.CharSequence[] charSequenceArray13 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray13);
        java.lang.CharSequence[] charSequenceArray19 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray19, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]> charSequenceArrayMultiKey22 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]>(charSequenceArray9, charSequenceArray12, charSequenceArray13, charSequenceArray19);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray12);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey25 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray12, false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str6, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertNotNull(charSequenceArray12);
        org.junit.Assert.assertNotNull(charSequenceArray13);
        org.junit.Assert.assertNotNull(charSequenceArray19);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String> strMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String>("MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "", "", "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]", "");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        java.lang.String str7 = charSequenceMultiKey6.toString();
        boolean boolean9 = charSequenceMultiKey6.equals((java.lang.Object) 100);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" + "'", str7, "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        java.lang.CharSequence charSequence4 = charSequenceMultiKey2.getKey((int) (byte) 1);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray10);
        java.lang.String[] strArray14 = new java.lang.String[] { "MultiKey[null, hi!, hi!, hi!]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray20);
        java.lang.String[] strArray27 = new java.lang.String[] { "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "hi!", "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", "MultiKey[]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey28 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray10, strArray14, strArray20, strArray27);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray10);
        boolean boolean30 = charSequenceMultiKey2.equals((java.lang.Object) strComparableMultiKey29);
        org.junit.Assert.assertEquals("'" + charSequence4 + "' != '" + "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" + "'", charSequence4, "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]", (java.lang.CharSequence) "");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        java.lang.CharSequence[] charSequenceArray7 = charSequenceMultiKey6.getKeys();
        java.lang.CharSequence charSequence9 = charSequenceMultiKey6.getKey((int) (byte) 1);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertEquals("'" + charSequence9 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", charSequence9, "MultiKey[null, hi!, hi!, hi!]");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence4 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]", (java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", charSequence4);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
        int int3 = charSequenceMultiKey2.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][] charSequenceMultiKeyArray0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray2 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray3 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray2;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray5 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray6 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray5;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray8 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray9 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray8;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray11 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray12 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray11;
        org.apache.commons.collections4.keyvalue.MultiKey[][] multiKeyArray14 = new org.apache.commons.collections4.keyvalue.MultiKey[4][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][] charSequenceMultiKeyArray15 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][]) multiKeyArray14;
        charSequenceMultiKeyArray15[0] = multiKeyArray2;
        charSequenceMultiKeyArray15[1] = multiKeyArray5;
        charSequenceMultiKeyArray15[2] = charSequenceMultiKeyArray9;
        charSequenceMultiKeyArray15[3] = multiKeyArray11;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]> charSequenceMultiKeyArrayMultiKey25 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]>(charSequenceMultiKeyArray15, true);
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray27 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray28 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray27;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray30 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray31 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray30;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray33 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray34 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray33;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray36 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray37 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray36;
        org.apache.commons.collections4.keyvalue.MultiKey[][] multiKeyArray39 = new org.apache.commons.collections4.keyvalue.MultiKey[4][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][] charSequenceMultiKeyArray40 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][]) multiKeyArray39;
        charSequenceMultiKeyArray40[0] = multiKeyArray27;
        charSequenceMultiKeyArray40[1] = multiKeyArray30;
        charSequenceMultiKeyArray40[2] = charSequenceMultiKeyArray34;
        charSequenceMultiKeyArray40[3] = multiKeyArray36;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]> charSequenceMultiKeyArrayMultiKey50 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]>(charSequenceMultiKeyArray40, true);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][]> charSequenceMultiKeyArrayMultiKey51 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][]>(charSequenceMultiKeyArray0, charSequenceMultiKeyArray15, charSequenceMultiKeyArray40);
        org.junit.Assert.assertNotNull(multiKeyArray2);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray3);
        org.junit.Assert.assertNotNull(multiKeyArray5);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray6);
        org.junit.Assert.assertNotNull(multiKeyArray8);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray9);
        org.junit.Assert.assertNotNull(multiKeyArray11);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray12);
        org.junit.Assert.assertNotNull(multiKeyArray14);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray15);
        org.junit.Assert.assertNotNull(multiKeyArray27);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray28);
        org.junit.Assert.assertNotNull(multiKeyArray30);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray31);
        org.junit.Assert.assertNotNull(multiKeyArray33);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray34);
        org.junit.Assert.assertNotNull(multiKeyArray36);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray37);
        org.junit.Assert.assertNotNull(multiKeyArray39);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray40);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]> charSequenceArrayMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]>(charSequenceArray0);
        java.lang.Class<?> wildcardClass2 = charSequenceArrayMultiKey1.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, true);
        java.lang.CharSequence[] charSequenceArray9 = charSequenceMultiKey8.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray9, false);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceArray9);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.lang.CharSequence charSequence3 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", (java.lang.CharSequence) "", charSequence3, (java.lang.CharSequence) "MultiKey[]");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
        boolean boolean10 = charSequenceMultiKey5.equals((java.lang.Object) "MultiKey[null, hi!, hi!, hi!]");
        java.lang.CharSequence[] charSequenceArray11 = null; // flaky: charSequenceMultiKey5.getKeys();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray11);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4);
        java.lang.Object obj10 = null;
        boolean boolean11 = charSequenceMultiKey9.equals(obj10);
        java.lang.String str12 = charSequenceMultiKey9.toString();
        java.lang.String str13 = charSequenceMultiKey9.toString();
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" + "'", str12, "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" + "'", str13, "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str5 = charSequenceMultiKey4.toString();
        java.lang.String str6 = charSequenceMultiKey4.toString();
        java.lang.Object obj7 = null;
        boolean boolean8 = charSequenceMultiKey4.equals(obj7);
        java.lang.Object obj9 = charSequenceMultiKey4.readResolve();
        java.lang.CharSequence[] charSequenceArray10 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray10);
        java.lang.Object obj12 = charSequenceMultiKey11.readResolve();
        java.lang.Object obj13 = charSequenceMultiKey11.readResolve();
        java.lang.String str14 = charSequenceMultiKey11.toString();
        boolean boolean15 = charSequenceMultiKey4.equals((java.lang.Object) str14);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str6, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertNotNull(charSequenceArray10);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "MultiKey[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "MultiKey[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "MultiKey[]");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "MultiKey[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "MultiKey[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "MultiKey[]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MultiKey[]" + "'", str14, "MultiKey[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.lang.String[] strArray3 = new java.lang.String[] { "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String> strMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String>(strArray3, true);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray5, false);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", charSequence1, (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "");
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray7, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray7, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray7);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray7, true);
        java.lang.Class<?> wildcardClass15 = charSequenceMultiKey14.getClass();
        boolean boolean16 = charSequenceMultiKey2.equals((java.lang.Object) wildcardClass15);
        java.lang.String str17 = charSequenceMultiKey2.toString();
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]" + "'", str17, "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceArray4);
    }
}

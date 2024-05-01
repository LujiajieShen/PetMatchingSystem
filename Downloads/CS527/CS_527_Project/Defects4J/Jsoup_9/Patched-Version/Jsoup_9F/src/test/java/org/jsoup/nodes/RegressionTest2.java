package org.jsoup.nodes;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode2 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.util.Map<java.lang.Character, java.lang.String> charMap3 = escapeMode2.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap4 = escapeMode2.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap5 = escapeMode2.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap6 = escapeMode2.getMap();
        java.lang.String str7 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode2);
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode2.getMap();
        java.lang.Class<?> wildcardClass9 = charMap8.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode2 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode2.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertNotNull(charMap3);
        org.junit.Assert.assertNotNull(charMap4);
        org.junit.Assert.assertNotNull(charMap5);
        org.junit.Assert.assertNotNull(charMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.lang.String str10 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode8.getMap();
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode8.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        java.lang.Class<?> wildcardClass17 = escapeMode8.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode10.getMap();
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode10.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode10.getMap();
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode10.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charMap24);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.lang.String str10 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode8.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode8.getMap();
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode12.getMap();
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode12.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode12);
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode12.getMap();
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode12);
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode12.getMap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertNotNull(charMap24);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode12.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode12);
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode12);
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode12.getMap();
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode12.getMap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertNotNull(charMap22);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode14);
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode14.getMap();
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode14.getMap();
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode14);
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode14.getMap();
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode14);
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode14);
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode2 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        java.util.Map<java.lang.Character, java.lang.String> charMap3 = escapeMode2.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap4 = escapeMode2.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap5 = escapeMode2.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap6 = escapeMode2.getMap();
        java.lang.String str7 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode2);
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode2.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode2.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode2.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode2.getMap();
        java.lang.Class<?> wildcardClass12 = charMap11.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode2 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode2.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertNotNull(charMap3);
        org.junit.Assert.assertNotNull(charMap4);
        org.junit.Assert.assertNotNull(charMap5);
        org.junit.Assert.assertNotNull(charMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode10.getMap();
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode10.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode10.getMap();
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode10.getMap();
        java.lang.Class<?> wildcardClass22 = charMap21.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode8.getMap();
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode8.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode12.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode12);
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode12);
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode12.getMap();
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode12.getMap();
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode12.getMap();
        java.lang.Class<?> wildcardClass25 = charMap24.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode10.getMap();
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode10.getMap();
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode10.getMap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode8.getMap();
        java.lang.String str10 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode8.getMap();
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode8.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode8.getMap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode6.getMap();
        java.lang.String str8 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        java.lang.String str10 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode6.getMap();
        java.lang.Class<?> wildcardClass13 = charMap12.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode8.getMap();
        java.lang.String str10 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode8.getMap();
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode8.getMap();
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode8.getMap();
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode14.getMap();
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode14.getMap();
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode14);
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode14.getMap();
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode14.getMap();
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode14);
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap26 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap27 = escapeMode14.getMap();
        java.lang.String str28 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode14);
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(charMap26);
        org.junit.Assert.assertNotNull(charMap27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode12.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode12);
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode12);
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode12);
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode12);
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.lang.String str10 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode8.getMap();
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode8.getMap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charMap15);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode14);
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode14.getMap();
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode14);
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode14.getMap();
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode14.getMap();
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str7 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.lang.String str8 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode6.getMap();
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode6.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charMap14);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode10.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode10.getMap();
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode10);
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode14.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode14.getMap();
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode14);
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode14.getMap();
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode14);
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode14.getMap();
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode14);
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap26 = escapeMode14.getMap();
        java.lang.Class<?> wildcardClass27 = charMap26.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(charMap26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.util.Map<java.lang.Character, java.lang.String> charMap5 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap6 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode4.getMap();
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode4);
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode4);
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode4.getMap();
        java.lang.Class<?> wildcardClass14 = charMap13.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertNotNull(charMap5);
        org.junit.Assert.assertNotNull(charMap6);
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode10.getMap();
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode10.getMap();
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode10.getMap();
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode10.getMap();
        java.lang.Class<?> wildcardClass21 = escapeMode10.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode10.getMap();
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode10.getMap();
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode10.getMap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charMap20);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode8.getMap();
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode8.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode8.getMap();
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode8.getMap();
        java.lang.Class<?> wildcardClass21 = charMap20.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode18);
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode18);
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode18.getMap();
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode18);
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode18.getMap();
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode18);
        java.util.Map<java.lang.Character, java.lang.String> charMap25 = escapeMode18.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap26 = escapeMode18.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap27 = escapeMode18.getMap();
        java.lang.String str28 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode18);
        java.lang.String str29 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode18);
        java.lang.String str30 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode18);
        java.lang.String str31 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(charMap25);
        org.junit.Assert.assertNotNull(charMap26);
        org.junit.Assert.assertNotNull(charMap27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode6.getMap();
        java.lang.String str8 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode6.getMap();
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode6.getMap();
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode6.getMap();
        java.lang.Class<?> wildcardClass21 = charMap20.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode18);
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode18);
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode18.getMap();
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode18);
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode18);
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode18);
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode18);
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode18);
        java.util.Map<java.lang.Character, java.lang.String> charMap27 = escapeMode18.getMap();
        java.lang.String str28 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(charMap27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode16);
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode16);
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode16.getMap();
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode16);
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode16);
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode16);
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode16);
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode16.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap25 = escapeMode16.getMap();
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode16);
        java.util.Map<java.lang.Character, java.lang.String> charMap27 = escapeMode16.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap28 = escapeMode16.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap29 = escapeMode16.getMap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertNotNull(charMap25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(charMap27);
        org.junit.Assert.assertNotNull(charMap28);
        org.junit.Assert.assertNotNull(charMap29);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode20);
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode20);
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode20.getMap();
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode20);
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode20);
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode20);
        java.lang.String str27 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode20);
        java.lang.String str28 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode20);
        java.util.Map<java.lang.Character, java.lang.String> charMap29 = escapeMode20.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap30 = escapeMode20.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap31 = escapeMode20.getMap();
        java.lang.String str32 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode20);
        java.util.Map<java.lang.Character, java.lang.String> charMap33 = escapeMode20.getMap();
        java.lang.String str34 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode20);
        java.lang.String str35 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode20);
        java.util.Map<java.lang.Character, java.lang.String> charMap36 = escapeMode20.getMap();
        java.lang.Class<?> wildcardClass37 = charMap36.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(charMap29);
        org.junit.Assert.assertNotNull(charMap30);
        org.junit.Assert.assertNotNull(charMap31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(charMap33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(charMap36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode6.getMap();
        java.lang.String str8 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode6.getMap();
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode6.getMap();
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode6.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(charMap21);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode12);
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode12.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode12);
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode12);
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode12);
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode12.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertNotNull(charMap23);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode8.getMap();
        java.lang.String str10 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode8.getMap();
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode8.getMap();
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode8.getMap();
        java.lang.String str10 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode8.getMap();
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode8.getMap();
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode8.getMap();
        java.lang.Class<?> wildcardClass22 = charMap21.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode8.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode8.getMap();
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        java.lang.Class<?> wildcardClass20 = escapeMode8.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        java.util.Map<java.lang.Character, java.lang.String> charMap5 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap6 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode4.getMap();
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode4);
        java.lang.String str10 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode4);
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode4.getMap();
        java.lang.Class<?> wildcardClass13 = escapeMode4.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertNotNull(charMap5);
        org.junit.Assert.assertNotNull(charMap6);
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode14.getMap();
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode14.getMap();
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode14);
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode14.getMap();
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode14.getMap();
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode14);
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap26 = escapeMode14.getMap();
        java.lang.String str27 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap28 = escapeMode14.getMap();
        java.lang.Class<?> wildcardClass29 = charMap28.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(charMap26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(charMap28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str5 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode4);
        java.util.Map<java.lang.Character, java.lang.String> charMap6 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode4.getMap();
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode4);
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode4.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charMap6);
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode12);
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode12.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode12.getMap();
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode12.getMap();
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode12);
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap25 = escapeMode12.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertNotNull(charMap25);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str7 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode6.getMap();
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        java.lang.String str10 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode6.getMap();
        java.lang.Class<?> wildcardClass14 = charMap13.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode6.getMap();
        java.lang.String str8 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode6.getMap();
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode6.getMap();
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode6);
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode18);
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode18);
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode18.getMap();
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode18);
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode18.getMap();
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode18);
        java.util.Map<java.lang.Character, java.lang.String> charMap25 = escapeMode18.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap26 = escapeMode18.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap27 = escapeMode18.getMap();
        java.lang.String str28 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode18);
        java.lang.String str29 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode18);
        java.lang.String str30 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode18);
        java.lang.String str31 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode18);
        java.lang.String str32 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode18);
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(charMap25);
        org.junit.Assert.assertNotNull(charMap26);
        org.junit.Assert.assertNotNull(charMap27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode14.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode14.getMap();
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode14);
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode14.getMap();
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode14);
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap25 = escapeMode14.getMap();
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertNotNull(charMap25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode16);
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode16);
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode16.getMap();
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode16);
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode16.getMap();
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode16);
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode16.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode16.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap25 = escapeMode16.getMap();
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode16);
        java.lang.String str27 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode16);
        java.lang.String str28 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode16);
        java.lang.String str29 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode16);
        java.util.Map<java.lang.Character, java.lang.String> charMap30 = escapeMode16.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertNotNull(charMap25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(charMap30);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode6.getMap();
        java.lang.String str8 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode6.getMap();
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode6.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode6.getMap();
        java.lang.Class<?> wildcardClass17 = escapeMode6.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode16.getMap();
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode16);
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode16.getMap();
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode16);
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode16);
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode16.getMap();
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode16);
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode16);
        java.util.Map<java.lang.Character, java.lang.String> charMap25 = escapeMode16.getMap();
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode16);
        java.lang.String str27 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode16);
        java.util.Map<java.lang.Character, java.lang.String> charMap28 = escapeMode16.getMap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(charMap25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(charMap28);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str7 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode6.getMap();
        java.lang.String str10 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode6.getMap();
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode6.getMap();
        java.lang.Class<?> wildcardClass18 = escapeMode6.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode2 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str3 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode2);
        java.util.Map<java.lang.Character, java.lang.String> charMap4 = escapeMode2.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap5 = escapeMode2.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap6 = escapeMode2.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode2.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode2.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode2 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode2.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charMap4);
        org.junit.Assert.assertNotNull(charMap5);
        org.junit.Assert.assertNotNull(charMap6);
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertNotNull(charMap8);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        java.util.Map<java.lang.Character, java.lang.String> charMap5 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap6 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode4.getMap();
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode4);
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode4.getMap();
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode4);
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertNotNull(charMap5);
        org.junit.Assert.assertNotNull(charMap6);
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str7 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode6.getMap();
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode6.getMap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode10.getMap();
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode10.getMap();
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode10.getMap();
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode10.getMap();
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode10);
        java.lang.Class<?> wildcardClass21 = escapeMode10.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode12.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode12.getMap();
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode12);
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode12.getMap();
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode12);
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode12);
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode12.getMap();
        java.lang.Class<?> wildcardClass25 = charMap24.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode12);
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode12.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode12);
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode12.getMap();
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode12);
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode12);
        java.lang.Class<?> wildcardClass23 = escapeMode12.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode10.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode10.getMap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode18);
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode18);
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode18.getMap();
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode18);
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode18);
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode18);
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode18);
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode18);
        java.util.Map<java.lang.Character, java.lang.String> charMap27 = escapeMode18.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap28 = escapeMode18.getMap();
        java.lang.String str29 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode18);
        java.lang.String str30 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode18);
        java.util.Map<java.lang.Character, java.lang.String> charMap31 = escapeMode18.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap32 = escapeMode18.getMap();
        java.lang.Class<?> wildcardClass33 = escapeMode18.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(charMap27);
        org.junit.Assert.assertNotNull(charMap28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(charMap31);
        org.junit.Assert.assertNotNull(charMap32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode8.getMap();
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode8.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        java.util.Map<java.lang.Character, java.lang.String> charMap5 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap6 = escapeMode4.getMap();
        java.lang.String str7 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode4);
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode4.getMap();
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode4);
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertNotNull(charMap5);
        org.junit.Assert.assertNotNull(charMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str7 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.lang.String str8 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode6.getMap();
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode6.getMap();
        java.lang.Class<?> wildcardClass14 = escapeMode6.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str5 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode4);
        java.util.Map<java.lang.Character, java.lang.String> charMap6 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode4.getMap();
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode4);
        java.lang.Class<?> wildcardClass12 = escapeMode4.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charMap6);
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str5 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode4);
        java.lang.String str6 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode4);
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode4.getMap();
        java.lang.Class<?> wildcardClass14 = charMap13.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str5 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode4);
        java.util.Map<java.lang.Character, java.lang.String> charMap6 = escapeMode4.getMap();
        java.lang.String str7 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode4);
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode4.getMap();
        java.lang.Class<?> wildcardClass9 = charMap8.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode12.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode12.getMap();
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode12);
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode12.getMap();
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode12);
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode12);
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode12);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode12.getMap();
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode12.getMap();
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode12);
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode12);
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode12);
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode12);
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode12.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charMap23);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode10.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode10.getMap();
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode10.getMap();
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode10);
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode6.getMap();
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.lang.String str10 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode6.getMap();
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode6.getMap();
        java.lang.Class<?> wildcardClass18 = escapeMode6.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode10.getMap();
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode10.getMap();
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode10);
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode16.getMap();
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode16);
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode16.getMap();
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode16);
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode16);
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode16.getMap();
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode16);
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode16);
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode16);
        java.util.Map<java.lang.Character, java.lang.String> charMap26 = escapeMode16.getMap();
        java.lang.String str27 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(charMap26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode8.getMap();
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode8.getMap();
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode8.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode8.getMap();
        java.lang.Class<?> wildcardClass18 = escapeMode8.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap5 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap6 = escapeMode4.getMap();
        java.lang.String str7 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode4);
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode4.getMap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap5);
        org.junit.Assert.assertNotNull(charMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charMap8);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode2 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        java.lang.String str3 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode2);
        java.util.Map<java.lang.Character, java.lang.String> charMap4 = escapeMode2.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap5 = escapeMode2.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap6 = escapeMode2.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode2.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode2.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode2 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode2.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charMap4);
        org.junit.Assert.assertNotNull(charMap5);
        org.junit.Assert.assertNotNull(charMap6);
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertNotNull(charMap8);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode8.getMap();
        java.lang.String str10 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode8.getMap();
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode8.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode8.getMap();
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode8.getMap();
        java.lang.Class<?> wildcardClass21 = charMap20.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode6.getMap();
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode6.getMap();
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode6.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode6);
        java.lang.Class<?> wildcardClass16 = escapeMode6.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str5 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode4);
        java.util.Map<java.lang.Character, java.lang.String> charMap6 = escapeMode4.getMap();
        java.lang.String str7 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode4);
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode4.getMap();
        java.lang.Class<?> wildcardClass11 = escapeMode4.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode12.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode12);
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode12.getMap();
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode12.getMap();
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap25 = escapeMode12.getMap();
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode12);
        java.lang.Class<?> wildcardClass27 = escapeMode12.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertNotNull(charMap25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode6.getMap();
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode6.getMap();
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode6.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode20);
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode20);
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode20.getMap();
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode20);
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode20);
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode20);
        java.lang.String str27 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode20);
        java.lang.String str28 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode20);
        java.util.Map<java.lang.Character, java.lang.String> charMap29 = escapeMode20.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap30 = escapeMode20.getMap();
        java.lang.String str31 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode20);
        java.lang.String str32 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(charMap29);
        org.junit.Assert.assertNotNull(charMap30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode12.getMap();
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode12.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode12);
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode12.getMap();
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode12.getMap();
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode6.getMap();
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.lang.String str10 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode6.getMap();
        java.lang.Class<?> wildcardClass20 = escapeMode6.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode18);
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode18);
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode18.getMap();
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode18);
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode18.getMap();
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode18);
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode18);
        java.util.Map<java.lang.Character, java.lang.String> charMap26 = escapeMode18.getMap();
        java.lang.String str27 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode18);
        java.lang.String str28 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode18);
        java.lang.String str29 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode18);
        java.lang.String str30 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode18);
        java.util.Map<java.lang.Character, java.lang.String> charMap31 = escapeMode18.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap32 = escapeMode18.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(charMap26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(charMap31);
        org.junit.Assert.assertNotNull(charMap32);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str7 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode6.getMap();
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode6.getMap();
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode6.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode2 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.util.Map<java.lang.Character, java.lang.String> charMap3 = escapeMode2.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap4 = escapeMode2.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap5 = escapeMode2.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap6 = escapeMode2.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode2.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode2.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode2.getMap();
        java.lang.String str10 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode2);
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode2.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode2 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode2.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertNotNull(charMap3);
        org.junit.Assert.assertNotNull(charMap4);
        org.junit.Assert.assertNotNull(charMap5);
        org.junit.Assert.assertNotNull(charMap6);
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charMap11);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode10.getMap();
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode10.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode10.getMap();
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode10.getMap();
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode10.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charMap21);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode8.getMap();
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode8.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode8.getMap();
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode12.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode12);
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode12.getMap();
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode12.getMap();
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap25 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap26 = escapeMode12.getMap();
        java.lang.String str27 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode12);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertNotNull(charMap25);
        org.junit.Assert.assertNotNull(charMap26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode16);
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode16);
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode16);
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode16.getMap();
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode16);
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode16);
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode16.getMap();
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode16);
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode16);
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode16);
        java.lang.Class<?> wildcardClass27 = escapeMode16.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode8.getMap();
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode8.getMap();
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode10.getMap();
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode10.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode10.getMap();
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode18);
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode18);
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode18);
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode18.getMap();
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode18);
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode18);
        java.util.Map<java.lang.Character, java.lang.String> charMap25 = escapeMode18.getMap();
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode18);
        java.lang.String str27 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode18);
        java.lang.String str28 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode18);
        java.util.Map<java.lang.Character, java.lang.String> charMap29 = escapeMode18.getMap();
        java.lang.String str30 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode18);
        java.lang.Class<?> wildcardClass31 = escapeMode18.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(charMap25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(charMap29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode8.getMap();
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode8.getMap();
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode8.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode8.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode8.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        java.lang.Class<?> wildcardClass19 = escapeMode8.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode10.getMap();
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode10.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode6.getMap();
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode6.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode12.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode12);
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode12);
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode12);
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode12.getMap();
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode12);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode8.getMap();
        java.lang.String str10 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode8.getMap();
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode8.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode8.getMap();
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode8.getMap();
        java.lang.Class<?> wildcardClass19 = escapeMode8.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str7 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.lang.String str8 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode6.getMap();
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode6.getMap();
        java.lang.Class<?> wildcardClass18 = escapeMode6.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.lang.String str10 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode8.getMap();
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode8.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode8.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode20);
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode20);
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode20.getMap();
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode20);
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode20);
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode20);
        java.lang.String str27 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode20);
        java.lang.String str28 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode20);
        java.util.Map<java.lang.Character, java.lang.String> charMap29 = escapeMode20.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap30 = escapeMode20.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap31 = escapeMode20.getMap();
        java.lang.String str32 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode20);
        java.util.Map<java.lang.Character, java.lang.String> charMap33 = escapeMode20.getMap();
        java.lang.String str34 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode20);
        java.lang.String str35 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode20);
        java.lang.Class<?> wildcardClass36 = escapeMode20.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(charMap29);
        org.junit.Assert.assertNotNull(charMap30);
        org.junit.Assert.assertNotNull(charMap31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(charMap33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str7 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode6.getMap();
        java.lang.String str10 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode6.getMap();
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode6.getMap();
        java.lang.Class<?> wildcardClass15 = charMap14.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode2 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str3 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode2);
        java.util.Map<java.lang.Character, java.lang.String> charMap4 = escapeMode2.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap5 = escapeMode2.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap6 = escapeMode2.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode2.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode2.getMap();
        java.lang.Class<?> wildcardClass9 = escapeMode2.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode2 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode2.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charMap4);
        org.junit.Assert.assertNotNull(charMap5);
        org.junit.Assert.assertNotNull(charMap6);
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode10.getMap();
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode10.getMap();
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode10);
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode12.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode12.getMap();
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode12);
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode12.getMap();
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode12);
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode12.getMap();
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode12);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode6.getMap();
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.lang.String str10 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode6.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode6);
        java.lang.Class<?> wildcardClass16 = escapeMode6.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode6.getMap();
        java.lang.String str8 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode6.getMap();
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode6.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charMap13);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode14);
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode14.getMap();
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode14);
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode14.getMap();
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode14.getMap();
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode14.getMap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charMap24);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode6.getMap();
        java.lang.String str8 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode6.getMap();
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode6.getMap();
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode6);
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode8.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode8.getMap();
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap5 = escapeMode4.getMap();
        java.lang.String str6 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode4);
        java.lang.String str7 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode4);
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode4.getMap();
        java.lang.Class<?> wildcardClass13 = escapeMode4.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode8.getMap();
        java.lang.String str10 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode8.getMap();
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode8.getMap();
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode8.getMap();
        java.lang.String str10 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode8.getMap();
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode8.getMap();
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode8.getMap();
        java.lang.Class<?> wildcardClass24 = charMap23.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode14.getMap();
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode14);
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode14);
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode14);
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode14.getMap();
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode14);
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap25 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap26 = escapeMode14.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(charMap25);
        org.junit.Assert.assertNotNull(charMap26);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode12);
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode12.getMap();
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode12.getMap();
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode12);
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode12);
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode12);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode6.getMap();
        java.lang.String str8 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode6.getMap();
        java.lang.String str10 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode6.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap5 = escapeMode4.getMap();
        java.lang.String str6 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode4);
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode4.getMap();
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode4);
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode14);
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode14.getMap();
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode14.getMap();
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode14.getMap();
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode14);
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap26 = escapeMode14.getMap();
        java.lang.String str27 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap28 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap29 = escapeMode14.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(charMap26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(charMap28);
        org.junit.Assert.assertNotNull(charMap29);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str5 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode4);
        java.util.Map<java.lang.Character, java.lang.String> charMap6 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode4.getMap();
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode4);
        java.lang.Class<?> wildcardClass15 = escapeMode4.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charMap6);
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str7 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode6.getMap();
        java.lang.String str10 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode6.getMap();
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode6.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode8.getMap();
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode8.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        java.lang.Class<?> wildcardClass16 = escapeMode8.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode6.getMap();
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.lang.String str10 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode6.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode8.getMap();
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode8.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode8.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str5 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode4);
        java.util.Map<java.lang.Character, java.lang.String> charMap6 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode4.getMap();
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode4);
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode4.getMap();
        java.lang.Class<?> wildcardClass14 = charMap13.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charMap6);
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode12.getMap();
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode12.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode12);
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode12.getMap();
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode12.getMap();
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode12);
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode12);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode10.getMap();
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode10.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode10.getMap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charMap18);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode14.getMap();
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode14);
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode14);
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode14);
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode14.getMap();
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode14);
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap25 = escapeMode14.getMap();
        java.lang.Class<?> wildcardClass26 = charMap25.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(charMap25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode14.getMap();
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode14);
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode14.getMap();
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap25 = escapeMode14.getMap();
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode14);
        java.lang.String str27 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertNotNull(charMap25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode12.getMap();
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode12.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode12);
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode12);
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode12.getMap();
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode12.getMap();
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode12.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertNotNull(charMap24);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode8.getMap();
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode8.getMap();
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode8.getMap();
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        java.util.Map<java.lang.Character, java.lang.String> charMap5 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap6 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode4.getMap();
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode4);
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode4.getMap();
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode4);
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertNotNull(charMap5);
        org.junit.Assert.assertNotNull(charMap6);
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode20);
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode20);
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode20);
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode20.getMap();
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode20);
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode20);
        java.util.Map<java.lang.Character, java.lang.String> charMap27 = escapeMode20.getMap();
        java.lang.String str28 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode20);
        java.lang.String str29 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode20);
        java.lang.String str30 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode20);
        java.util.Map<java.lang.Character, java.lang.String> charMap31 = escapeMode20.getMap();
        java.lang.String str32 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode20);
        java.lang.String str33 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode20);
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(charMap27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(charMap31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode16);
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode16);
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode16.getMap();
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode16);
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode16);
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode16);
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode16);
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode16);
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode16);
        java.util.Map<java.lang.Character, java.lang.String> charMap26 = escapeMode16.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap27 = escapeMode16.getMap();
        java.lang.Class<?> wildcardClass28 = charMap27.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(charMap26);
        org.junit.Assert.assertNotNull(charMap27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode8.getMap();
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode8.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode8.getMap();
        java.lang.Class<?> wildcardClass18 = charMap17.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode14.getMap();
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode14.getMap();
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode14);
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode14.getMap();
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode14.getMap();
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode14);
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap26 = escapeMode14.getMap();
        java.lang.String str27 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap28 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap29 = escapeMode14.getMap();
        java.lang.Class<?> wildcardClass30 = charMap29.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(charMap26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(charMap28);
        org.junit.Assert.assertNotNull(charMap29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode16.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode16.getMap();
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode16);
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode16.getMap();
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode16);
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode16);
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode16.getMap();
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode16);
        java.util.Map<java.lang.Character, java.lang.String> charMap25 = escapeMode16.getMap();
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode16);
        java.lang.String str27 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode16);
        java.util.Map<java.lang.Character, java.lang.String> charMap28 = escapeMode16.getMap();
        java.lang.String str29 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(charMap25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(charMap28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode6.getMap();
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode6.getMap();
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode6);
        java.lang.Class<?> wildcardClass13 = escapeMode6.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode12);
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode12);
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode12.getMap();
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode12.getMap();
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.lang.String str10 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode8.getMap();
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode8.getMap();
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode8.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.lang.String str10 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode8.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode8.getMap();
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode8.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str7 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.lang.String str8 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode6.getMap();
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode6.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode8.getMap();
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode8.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charMap15);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode12.getMap();
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode12.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode12);
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode12.getMap();
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode12.getMap();
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode12);
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode12);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode6.getMap();
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode6.getMap();
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode6.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charMap15);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        java.util.Map<java.lang.Character, java.lang.String> charMap5 = escapeMode4.getMap();
        java.lang.String str6 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode4);
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode4.getMap();
        java.lang.String str10 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode4);
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode4.getMap();
        java.lang.Class<?> wildcardClass12 = escapeMode4.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertNotNull(charMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.lang.String str10 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode8.getMap();
        java.lang.Class<?> wildcardClass14 = charMap13.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode10.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode10.getMap();
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode10.getMap();
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode10);
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode10.getMap();
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode10.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode10.getMap();
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode10.getMap();
        java.lang.Class<?> wildcardClass22 = escapeMode10.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode2 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap3 = escapeMode2.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap4 = escapeMode2.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap5 = escapeMode2.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap6 = escapeMode2.getMap();
        java.lang.String str7 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode2);
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode2.getMap();
        java.lang.Class<?> wildcardClass9 = charMap8.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode2 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode2.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap3);
        org.junit.Assert.assertNotNull(charMap4);
        org.junit.Assert.assertNotNull(charMap5);
        org.junit.Assert.assertNotNull(charMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode10.getMap();
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode10.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode10.getMap();
        java.lang.Class<?> wildcardClass19 = charMap18.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode8.getMap();
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode8.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode8.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode14);
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode14.getMap();
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode14.getMap();
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode14.getMap();
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap25 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap26 = escapeMode14.getMap();
        java.lang.String str27 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode14);
        java.lang.String str28 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode14);
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(charMap25);
        org.junit.Assert.assertNotNull(charMap26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode10.getMap();
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode10.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode10);
        java.lang.Class<?> wildcardClass19 = escapeMode10.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode16);
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode16);
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode16);
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode16.getMap();
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode16);
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode16);
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode16.getMap();
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode16);
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode16);
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode16);
        java.util.Map<java.lang.Character, java.lang.String> charMap27 = escapeMode16.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap28 = escapeMode16.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap29 = escapeMode16.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(charMap27);
        org.junit.Assert.assertNotNull(charMap28);
        org.junit.Assert.assertNotNull(charMap29);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode10.getMap();
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode10.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode10.getMap();
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode10.getMap();
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode10);
        java.lang.Class<?> wildcardClass22 = escapeMode10.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode10.getMap();
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode10.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode10.getMap();
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode10);
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode6.getMap();
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode6.getMap();
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode6.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode6.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode2 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        java.util.Map<java.lang.Character, java.lang.String> charMap3 = escapeMode2.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap4 = escapeMode2.getMap();
        java.lang.String str5 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode2);
        java.util.Map<java.lang.Character, java.lang.String> charMap6 = escapeMode2.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode2.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode2 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode2.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertNotNull(charMap3);
        org.junit.Assert.assertNotNull(charMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charMap6);
        org.junit.Assert.assertNotNull(charMap7);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode10.getMap();
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode10.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode10.getMap();
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode10);
        java.lang.Class<?> wildcardClass22 = escapeMode10.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode8.getMap();
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode8.getMap();
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode8.getMap();
        java.lang.Class<?> wildcardClass19 = charMap18.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode16);
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode16);
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode16.getMap();
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode16);
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode16);
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode16);
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode16);
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode16);
        java.util.Map<java.lang.Character, java.lang.String> charMap25 = escapeMode16.getMap();
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode16);
        java.util.Map<java.lang.Character, java.lang.String> charMap27 = escapeMode16.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap28 = escapeMode16.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap29 = escapeMode16.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(charMap25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(charMap27);
        org.junit.Assert.assertNotNull(charMap28);
        org.junit.Assert.assertNotNull(charMap29);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode14.getMap();
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode14);
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode14);
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode14.getMap();
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode14.getMap();
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap26 = escapeMode14.getMap();
        java.lang.String str27 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap28 = escapeMode14.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(charMap26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(charMap28);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode14);
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode14.getMap();
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode14);
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode14);
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode14);
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode14.getMap();
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap25 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap26 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap27 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap28 = escapeMode14.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(charMap25);
        org.junit.Assert.assertNotNull(charMap26);
        org.junit.Assert.assertNotNull(charMap27);
        org.junit.Assert.assertNotNull(charMap28);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode10.getMap();
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode10.getMap();
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode10.getMap();
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode10.getMap();
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode10.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(charMap21);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode6.getMap();
        java.lang.String str8 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode6.getMap();
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode6.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charMap13);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.lang.String str10 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode8.getMap();
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode8.getMap();
        java.lang.Class<?> wildcardClass18 = escapeMode8.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode10.getMap();
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode10.getMap();
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode10);
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode2 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        java.lang.String str3 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode2);
        java.util.Map<java.lang.Character, java.lang.String> charMap4 = escapeMode2.getMap();
        java.lang.Class<?> wildcardClass5 = escapeMode2.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode2 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode2.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charMap4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str7 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode6.getMap();
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode6.getMap();
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode6);
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode22);
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode22);
        java.util.Map<java.lang.Character, java.lang.String> charMap25 = escapeMode22.getMap();
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode22);
        java.lang.String str27 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode22);
        java.lang.String str28 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode22);
        java.lang.String str29 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode22);
        java.lang.String str30 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode22);
        java.util.Map<java.lang.Character, java.lang.String> charMap31 = escapeMode22.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap32 = escapeMode22.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap33 = escapeMode22.getMap();
        java.lang.String str34 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode22);
        java.lang.String str35 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode22);
        java.lang.String str36 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode22);
        java.util.Map<java.lang.Character, java.lang.String> charMap37 = escapeMode22.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap38 = escapeMode22.getMap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str39 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode22 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode22.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(charMap25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(charMap31);
        org.junit.Assert.assertNotNull(charMap32);
        org.junit.Assert.assertNotNull(charMap33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(charMap37);
        org.junit.Assert.assertNotNull(charMap38);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode22);
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode22);
        java.util.Map<java.lang.Character, java.lang.String> charMap25 = escapeMode22.getMap();
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode22);
        java.lang.String str27 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode22);
        java.lang.String str28 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode22);
        java.lang.String str29 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode22);
        java.lang.String str30 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode22);
        java.util.Map<java.lang.Character, java.lang.String> charMap31 = escapeMode22.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap32 = escapeMode22.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap33 = escapeMode22.getMap();
        java.lang.String str34 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode22);
        java.lang.String str35 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode22);
        java.lang.String str36 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode22);
        java.lang.String str37 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode22);
        java.util.Map<java.lang.Character, java.lang.String> charMap38 = escapeMode22.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode22 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode22.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(charMap25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(charMap31);
        org.junit.Assert.assertNotNull(charMap32);
        org.junit.Assert.assertNotNull(charMap33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(charMap38);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode14);
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode14.getMap();
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode14.getMap();
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode14.getMap();
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode14);
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode14);
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap27 = escapeMode14.getMap();
        java.lang.Class<?> wildcardClass28 = escapeMode14.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(charMap27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode8.getMap();
        java.lang.String str10 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode8.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode8.getMap();
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode8.getMap();
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        java.lang.Class<?> wildcardClass20 = escapeMode8.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap5 = escapeMode4.getMap();
        java.lang.String str6 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode4);
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode4.getMap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str5 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode4);
        java.util.Map<java.lang.Character, java.lang.String> charMap6 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode4.getMap();
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode4);
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode4.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charMap6);
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charMap10);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode12.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode12);
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode12.getMap();
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode12.getMap();
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap25 = escapeMode12.getMap();
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap27 = escapeMode12.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertNotNull(charMap25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(charMap27);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode8.getMap();
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode8.getMap();
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode8.getMap();
        java.lang.Class<?> wildcardClass20 = charMap19.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.lang.String str10 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode8.getMap();
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode8.getMap();
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode8.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charMap18);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode14);
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode14.getMap();
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode14.getMap();
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode14);
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode14.getMap();
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode14);
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode14);
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode8.getMap();
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode8.getMap();
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode8.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode8.getMap();
        java.lang.Class<?> wildcardClass20 = charMap19.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode8.getMap();
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode8.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode8.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        java.lang.String str5 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode4);
        java.util.Map<java.lang.Character, java.lang.String> charMap6 = escapeMode4.getMap();
        java.lang.String str7 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode4);
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode6.getMap();
        java.lang.String str8 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode6.getMap();
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode6.getMap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charMap13);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode12.getMap();
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode12.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode12);
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode12.getMap();
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode12);
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode12.getMap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertNotNull(charMap23);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap5 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap6 = escapeMode4.getMap();
        java.lang.String str7 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode4);
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode4.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode4.getMap();
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode4);
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode4.getMap();
        java.lang.Class<?> wildcardClass13 = charMap12.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap5);
        org.junit.Assert.assertNotNull(charMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode10.getMap();
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode10.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode10.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode10.getMap();
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode10);
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode14.getMap();
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode14);
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode14);
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode14.getMap();
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap24 = escapeMode14.getMap();
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode14);
        java.util.Map<java.lang.Character, java.lang.String> charMap26 = escapeMode14.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap27 = escapeMode14.getMap();
        java.lang.String str28 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode14);
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertNotNull(charMap24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(charMap26);
        org.junit.Assert.assertNotNull(charMap27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap8 = escapeMode6.getMap();
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode6.getMap();
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode6.getMap();
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode6);
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertNotNull(charMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode6.getMap();
        java.lang.String str8 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode6.getMap();
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode6.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode6.getMap();
        java.lang.Class<?> wildcardClass17 = escapeMode6.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode6.getMap();
        java.lang.String str8 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode6.getMap();
        java.lang.String str10 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode6.getMap();
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode6);
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode8.getMap();
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode8.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode8.getMap();
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode8.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charMap19);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode8.getMap();
        java.lang.String str10 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode8.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode8.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode8.getMap();
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode8.getMap();
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode10.getMap();
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode10.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode10.getMap();
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode10.getMap();
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode10);
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode10.getMap();
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode10.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode10.getMap();
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode10.getMap();
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode10);
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode12.getMap();
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode12.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode12.getMap();
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode12.getMap();
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap20 = escapeMode12.getMap();
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap22 = escapeMode12.getMap();
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode12);
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode12);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charMap20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charMap22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap7 = escapeMode6.getMap();
        java.lang.String str8 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap9 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap10 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode6.getMap();
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode6.getMap();
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode6);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode6.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode6.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charMap9);
        org.junit.Assert.assertNotNull(charMap10);
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode16);
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode16);
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode16.getMap();
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode16);
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode16);
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode16);
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode16.getMap();
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode16);
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode16);
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode16);
        java.lang.Class<?> wildcardClass27 = escapeMode16.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charMap23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode10.getMap();
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap16 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap17 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode10.getMap();
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode10.getMap();
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap23 = escapeMode10.getMap();
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charMap16);
        org.junit.Assert.assertNotNull(charMap17);
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charMap23);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap11 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap12 = escapeMode10.getMap();
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap14 = escapeMode10.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap15 = escapeMode10.getMap();
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.util.Map<java.lang.Character, java.lang.String> charMap18 = escapeMode10.getMap();
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode10);
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap11);
        org.junit.Assert.assertNotNull(charMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charMap14);
        org.junit.Assert.assertNotNull(charMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.util.Map<java.lang.Character, java.lang.String> charMap13 = escapeMode12.getMap();
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode12);
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode12);
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode12);
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode12);
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap19 = escapeMode12.getMap();
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode12);
        java.util.Map<java.lang.Character, java.lang.String> charMap21 = escapeMode12.getMap();
        java.lang.Class<?> wildcardClass22 = charMap21.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charMap21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }
}


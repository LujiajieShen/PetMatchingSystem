package org.jsoup.parser;

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
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.Jsoup.clean("hi!", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.jsoup.select.Collector collector0 = new org.jsoup.select.Collector();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = elements7.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.jsoup.parser.Tag tag0 = null;
        org.jsoup.nodes.Attributes attributes2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag0, "", attributes2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse(uRL0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = element10.html("");
        org.jsoup.nodes.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            element10.replaceWith(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        java.util.Collection<org.jsoup.nodes.Element> elementCollection6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = elements5.retainAll(elementCollection6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        java.lang.String str9 = document1.tagName();
        org.jsoup.nodes.Element element11 = document1.wrap("#root");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#root" + "'", str9, "#root");
        org.junit.Assert.assertNull(element11);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        boolean boolean7 = document6.hasText();
        boolean boolean8 = document6.hasText();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        boolean boolean11 = document10.hasText();
        java.lang.String str12 = document10.nodeName();
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        org.jsoup.nodes.Element element17 = document10.classNames((java.util.Set<java.lang.String>) strSet15);
        org.jsoup.nodes.Element element18 = document6.classNames((java.util.Set<java.lang.String>) strSet15);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element19 = elements3.set((int) (short) 10, (org.jsoup.nodes.Element) document6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.val();
        java.lang.Object obj5 = null;
        int int6 = elements3.lastIndexOf(obj5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Element> elementList9 = elements3.subList(0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        boolean boolean16 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        java.util.function.UnaryOperator<org.jsoup.nodes.Element> elementUnaryOperator17 = null;
        // The following exception was thrown during execution in test generation
        try {
            elements5.replaceAll(elementUnaryOperator17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        // The following exception was thrown during execution in test generation
        try {
            document1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = elements3.attr("#root");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element[] elementArray8 = new org.jsoup.nodes.Element[] { document7 };
        java.util.ArrayList<org.jsoup.nodes.Element> elementList9 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList9, elementArray8);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator11 = elementList9.spliterator();
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator12 = elementList9.spliterator();
        boolean boolean13 = elements3.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elementList9);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements15 = elements3.select("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elementArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(elementSpliterator11);
        org.junit.Assert.assertNotNull(elementSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = document1.prepend("#document");
        org.jsoup.nodes.Element element14 = element12.wrap("#document");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = element14.val();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.val();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element4 = document1.getElementById("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.select.Elements elements7 = element5.getElementsByAttribute("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<org.jsoup.nodes.Element> elementItor9 = elements7.listIterator((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        java.lang.Class<?> wildcardClass9 = element8.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        boolean boolean11 = document10.hasText();
        java.lang.String str12 = document10.nodeName();
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        org.jsoup.nodes.Element element17 = document10.classNames((java.util.Set<java.lang.String>) strSet15);
        org.jsoup.nodes.Element element19 = document10.append("#document");
        org.jsoup.nodes.Element element21 = document10.prepend("#document");
        org.jsoup.nodes.Element element23 = element21.wrap("#document");
        java.lang.String str24 = element21.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            elements7.add((int) (short) -1, element21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = document1.prepend("#document");
        org.jsoup.nodes.Element element14 = element12.wrap("#document");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = element14.hasClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#root", "#root");
        java.lang.String str3 = comment2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n<!--#root-->" + "'", str3, "\n<!--#root-->");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        java.lang.String str6 = element5.outerHtml();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = document1.prepend("#document");
        org.jsoup.nodes.Attributes attributes13 = element12.attributes();
        org.jsoup.nodes.Element element15 = element12.append("hi!");
        boolean boolean17 = element12.hasClass("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = document1.prepend("#document");
        org.jsoup.select.Elements elements14 = element12.getElementsByTag("#document");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        boolean boolean8 = document7.hasText();
        boolean boolean9 = document7.hasText();
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        boolean boolean12 = document11.hasText();
        java.lang.String str13 = document11.nodeName();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = document11.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.nodes.Element element19 = document7.classNames((java.util.Set<java.lang.String>) strSet16);
        int int20 = elements3.indexOf((java.lang.Object) element19);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element22 = element19.child((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#document" + "'", str13, "#document");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        boolean boolean16 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements20 = document18.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements22 = elements20.prepend("");
        org.jsoup.select.Elements elements24 = elements22.removeAttr("");
        org.jsoup.nodes.Document document26 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements28 = document26.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements30 = elements28.prepend("");
        org.jsoup.select.Elements elements32 = elements30.removeAttr("");
        boolean boolean33 = elements22.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements30);
        org.jsoup.select.Elements elements35 = elements30.wrap("#root");
        boolean boolean36 = elements13.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements35);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Element> elementList39 = elements13.subList((int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>", "org.jsoup.select.Selector$SelectorParseException: ");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.val();
        java.lang.Object obj5 = null;
        int int6 = elements3.lastIndexOf(obj5);
        org.jsoup.select.Elements elements8 = elements3.eq((int) '#');
        java.lang.String str9 = elements3.outerHtml();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element15 = document12.attr("hi!", "#root");
        // The following exception was thrown during execution in test generation
        try {
            elements3.add((int) '#', element15);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.nodes.Attributes attributes3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element4 = new org.jsoup.nodes.Element(tag1, "#document#document", attributes3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements8 = document6.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = document6.prepend("#document");
        org.jsoup.nodes.Element element11 = element10.empty();
        org.jsoup.select.Elements elements13 = element10.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = elements3.addAll((int) (short) 100, (java.util.Collection<org.jsoup.nodes.Element>) elements13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        java.lang.String str11 = document1.outerHtml();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#document" + "'", str11, "#document");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.outerHtml();
        java.lang.String str5 = elements3.val();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        boolean boolean9 = document8.hasText();
        java.lang.String str10 = document8.nodeName();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        org.jsoup.nodes.Element element15 = document8.classNames((java.util.Set<java.lang.String>) strSet13);
        org.jsoup.nodes.Element element17 = document8.append("#document");
        org.jsoup.nodes.Element element19 = document8.prepend("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element20 = elements3.set(0, (org.jsoup.nodes.Element) document8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#document" + "'", str10, "#document");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element6 = element5.empty();
        org.jsoup.select.Elements elements8 = element5.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element5.getElementsByAttributeValueStarting("", "org.jsoup.select.selector$selectorparseexception:");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element5 = document2.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str6 = document2.tagName();
        org.jsoup.nodes.Element element7 = document2.empty();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = document2.getElementsByAttributeValue("#document", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean("", "#document#document", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = document1.prepend("#document");
        org.jsoup.nodes.Attributes attributes13 = element12.attributes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = attributes13.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = element10.html("");
        org.jsoup.nodes.Element element15 = element10.attr("#root", "hi!");
        org.jsoup.nodes.Element element16 = element10.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes17 = element16.attributes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNull(element16);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str2 = tag1.getName();
        java.lang.String str3 = tag1.toString();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str2, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str3, "org.jsoup.select.selector$selectorparseexception:");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute2.setKey("#root");
        java.lang.String str5 = attribute2.toString();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root=\"hi!\"" + "'", str5, "#root=\"hi!\"");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.outerHtml();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements8 = document6.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements10 = elements8.prepend("");
        org.jsoup.select.Elements elements12 = elements10.removeAttr("");
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements16 = document14.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements18 = elements16.prepend("");
        org.jsoup.select.Elements elements20 = elements18.removeAttr("");
        boolean boolean21 = elements10.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements18);
        org.jsoup.nodes.Document document23 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements25 = document23.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements27 = elements25.prepend("");
        org.jsoup.select.Elements elements29 = elements27.removeAttr("");
        org.jsoup.nodes.Document document31 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements33 = document31.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements35 = elements33.prepend("");
        org.jsoup.select.Elements elements37 = elements35.removeAttr("");
        boolean boolean38 = elements27.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements35);
        org.jsoup.select.Elements elements40 = elements35.wrap("#root");
        boolean boolean41 = elements18.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements40);
        boolean boolean42 = elements3.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements18);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        boolean boolean16 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        org.jsoup.select.Elements elements18 = elements5.prepend("hi!");
        org.jsoup.select.Elements elements20 = elements5.select("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.nodes.Element element22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element23 = elements5.set((int) (byte) 100, element22);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.jsoup.nodes.Document document2 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document2.hasText();
        java.lang.String str4 = document2.nodeName();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = document2.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Element element11 = document2.append("#document");
        org.jsoup.nodes.Element element13 = document2.prepend("#document");
        org.jsoup.nodes.Attributes attributes14 = element13.attributes();
        org.jsoup.nodes.Element element16 = element13.append("hi!");
        org.jsoup.nodes.Element element18 = element16.appendText("#root=\"hi!\"");
        org.jsoup.select.Elements elements19 = org.jsoup.select.Selector.select("#document#document", element18);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        boolean boolean16 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        org.jsoup.select.Elements elements18 = elements13.wrap("#root");
        java.util.Collection<org.jsoup.nodes.Element> elementCollection19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = elements18.addAll(elementCollection19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        boolean boolean3 = document1.hasText();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        boolean boolean6 = document5.hasText();
        java.lang.String str7 = document5.nodeName();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        org.jsoup.nodes.Element element12 = document5.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element13 = document1.classNames((java.util.Set<java.lang.String>) strSet10);
        element13.setBaseUri("\n<!--#root-->");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        boolean boolean6 = document1.isBlock();
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        boolean boolean16 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        org.jsoup.select.Elements elements18 = elements13.wrap("#root");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        boolean boolean21 = document20.hasText();
        java.lang.String str22 = document20.nodeName();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        org.jsoup.nodes.Element element27 = document20.classNames((java.util.Set<java.lang.String>) strSet25);
        org.jsoup.nodes.Element element29 = element27.addClass("#document");
        org.jsoup.select.Elements elements32 = element29.getElementsByAttributeValueNot("#root", "org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str33 = elements32.html();
        org.jsoup.nodes.Attributes attributes35 = new org.jsoup.nodes.Attributes();
        int int36 = attributes35.size();
        org.jsoup.nodes.Document document38 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements40 = document38.getElementsByAttribute("hi!");
        java.lang.String str41 = elements40.val();
        java.lang.Object obj42 = null;
        int int43 = elements40.lastIndexOf(obj42);
        org.jsoup.select.Elements elements45 = elements40.eq((int) '#');
        boolean boolean46 = attributes35.equals((java.lang.Object) elements45);
        boolean boolean48 = elements45.hasClass("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        boolean boolean49 = elements32.addAll(1, (java.util.Collection<org.jsoup.nodes.Element>) elements45);
        boolean boolean50 = elements18.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements32);
        org.jsoup.nodes.Document document52 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element[] elementArray53 = new org.jsoup.nodes.Element[] { document52 };
        java.util.ArrayList<org.jsoup.nodes.Element> elementList54 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList54, elementArray53);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator56 = elementList54.spliterator();
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator57 = elementList54.spliterator();
        boolean boolean58 = elements32.contains((java.lang.Object) elementList54);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements60 = elements32.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#document" + "'", str22, "#document");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(elementArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(elementSpliterator56);
        org.junit.Assert.assertNotNull(elementSpliterator57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document");
        boolean boolean3 = tokenQueue1.matches("\n<!--#root-->");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = document1.prepend("#document");
        org.jsoup.nodes.Attributes attributes13 = element12.attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator14 = attributes13.spliterator();
        java.lang.String str16 = attributes13.get("hi!");
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element22 = document19.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        boolean boolean23 = attributes13.equals((java.lang.Object) "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str24 = attributes13.html();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(attributeSpliterator14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + " class=\"hi!\"" + "'", str24, " class=\"hi!\"");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        boolean boolean16 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        org.jsoup.select.Elements elements18 = elements13.wrap("#root");
        java.lang.String str20 = elements18.attr("hi!");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#document", "");
        org.jsoup.nodes.Element element4 = document2.addClass("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = element4.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.jsoup.nodes.Document document2 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document2.hasText();
        boolean boolean4 = document2.hasText();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        boolean boolean7 = document6.hasText();
        java.lang.String str8 = document6.nodeName();
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        org.jsoup.nodes.Element element13 = document6.classNames((java.util.Set<java.lang.String>) strSet11);
        org.jsoup.nodes.Element element14 = document2.classNames((java.util.Set<java.lang.String>) strSet11);
        org.jsoup.nodes.Element element16 = document2.appendText("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements17 = org.jsoup.select.Selector.select("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>", (org.jsoup.nodes.Element) document2);
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <html>?<head>?</head>?<body>? #root ?</body>?</html>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#document" + "'", str8, "#document");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = elements3.attr("#root");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element[] elementArray8 = new org.jsoup.nodes.Element[] { document7 };
        java.util.ArrayList<org.jsoup.nodes.Element> elementList9 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList9, elementArray8);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator11 = elementList9.spliterator();
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator12 = elementList9.spliterator();
        boolean boolean13 = elements3.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elementList9);
        org.jsoup.select.Elements elements14 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elementList9);
        org.jsoup.select.Elements elements15 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements14);
        java.lang.String str16 = elements15.html();
        java.lang.String str17 = elements15.html();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elementArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(elementSpliterator11);
        org.junit.Assert.assertNotNull(elementSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "\n<!--#root-->");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("hi!");
        java.lang.String str6 = textNode2.getWholeText();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Element element5 = document2.append("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.select.Elements elements8 = document2.getElementsByAttributeValueStarting("#root=\"hi!\"", "org.jsoup.select.Selector$SelectorParseException: ");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = document2.getElementsByAttributeValueEnding("#document", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = document1.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = document1.createElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueNot(" class=\"hi!\"", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        boolean boolean16 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        org.jsoup.select.Elements elements18 = elements13.wrap("#root");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        boolean boolean21 = document20.hasText();
        java.lang.String str22 = document20.nodeName();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        org.jsoup.nodes.Element element27 = document20.classNames((java.util.Set<java.lang.String>) strSet25);
        org.jsoup.nodes.Element element29 = element27.addClass("#document");
        org.jsoup.select.Elements elements32 = element29.getElementsByAttributeValueNot("#root", "org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str33 = elements32.html();
        org.jsoup.nodes.Attributes attributes35 = new org.jsoup.nodes.Attributes();
        int int36 = attributes35.size();
        org.jsoup.nodes.Document document38 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements40 = document38.getElementsByAttribute("hi!");
        java.lang.String str41 = elements40.val();
        java.lang.Object obj42 = null;
        int int43 = elements40.lastIndexOf(obj42);
        org.jsoup.select.Elements elements45 = elements40.eq((int) '#');
        boolean boolean46 = attributes35.equals((java.lang.Object) elements45);
        boolean boolean48 = elements45.hasClass("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        boolean boolean49 = elements32.addAll(1, (java.util.Collection<org.jsoup.nodes.Element>) elements45);
        boolean boolean50 = elements18.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements32);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<org.jsoup.nodes.Element> elementItor52 = elements32.listIterator(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#document" + "'", str22, "#document");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = document1.prepend("#document");
        org.jsoup.nodes.Attributes attributes13 = element12.attributes();
        org.jsoup.nodes.Element element15 = element12.append("hi!");
        java.lang.String str16 = element12.html();
        java.lang.String str17 = element12.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#document#documenthi!" + "'", str16, "#document#documenthi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#document#documenthi!" + "'", str17, "#document#documenthi!");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute2.setValue("#root=\"hi!\"");
        java.lang.String str5 = attribute2.getKey();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.select.Elements elements12 = document1.getElementsByTag(" class=\"hi!\"");
        java.lang.String str13 = document1.nodeName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#document" + "'", str13, "#document");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        org.jsoup.nodes.Element element6 = document1.body();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = element6.data();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNull(element6);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element5 = document2.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str6 = element5.id();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = element5.getElementsByAttributeValueContaining("#document", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = document1.nodeName();
        org.jsoup.nodes.Element element6 = document1.appendElement("#document#document");
        org.jsoup.nodes.Node node7 = element6.previousSibling();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = document1.nodeName();
        org.jsoup.nodes.Element element6 = document1.appendElement("#document#document");
        java.lang.String str7 = document1.nodeName();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.jsoup.nodes.Evaluator evaluator0 = null;
        org.jsoup.nodes.Document document2 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document2.hasText();
        java.lang.String str4 = document2.nodeName();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = document2.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Element element11 = element9.addClass("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = org.jsoup.select.Collector.collect(evaluator0, element11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.jsoup.nodes.DataNode dataNode2 = org.jsoup.nodes.DataNode.createFromEncoded("\n<!--#root-->", "#document");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = dataNode2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataNode2);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        boolean boolean16 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements20 = document18.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements22 = elements20.prepend("");
        org.jsoup.select.Elements elements24 = elements22.removeAttr("");
        org.jsoup.nodes.Document document26 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements28 = document26.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements30 = elements28.prepend("");
        org.jsoup.select.Elements elements32 = elements30.removeAttr("");
        boolean boolean33 = elements22.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements30);
        org.jsoup.select.Elements elements35 = elements30.wrap("#root");
        boolean boolean36 = elements13.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements35);
        org.jsoup.select.Elements elements38 = elements13.val("#root=\"hi!\"");
        org.jsoup.nodes.Document document40 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements42 = document40.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements44 = elements42.prepend("");
        org.jsoup.select.Elements elements46 = elements44.removeAttr("");
        org.jsoup.nodes.Document document48 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements50 = document48.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements52 = elements50.prepend("");
        org.jsoup.select.Elements elements54 = elements52.removeAttr("");
        boolean boolean55 = elements44.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements52);
        org.jsoup.select.Elements elements57 = elements52.wrap("#root");
        boolean boolean58 = elements13.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements57);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertNotNull(elements50);
        org.junit.Assert.assertNotNull(elements52);
        org.junit.Assert.assertNotNull(elements54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(elements57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element6 = element5.empty();
        org.jsoup.select.Elements elements8 = element5.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements10 = elements8.removeClass("#root");
        org.jsoup.nodes.Element element11 = elements8.first();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNull(element11);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = document1.prepend("#document");
        org.jsoup.nodes.Element element14 = element12.wrap("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = element12.child((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        boolean boolean3 = document1.hasText();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        boolean boolean6 = document5.hasText();
        java.lang.String str7 = document5.nodeName();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        org.jsoup.nodes.Element element12 = document5.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element13 = document1.classNames((java.util.Set<java.lang.String>) strSet10);
        java.util.Set<java.lang.String> strSet14 = document1.classNames();
        org.jsoup.nodes.Element element16 = document1.getElementById("#document#document");
        org.jsoup.nodes.Comment comment19 = new org.jsoup.nodes.Comment("#root", "");
        java.lang.String str20 = comment19.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            document1.replaceWith((org.jsoup.nodes.Node) comment19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#comment" + "'", str20, "#comment");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Element element5 = document2.append("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements7 = element5.getElementsByAttribute("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean2 = tag1.isData();
        boolean boolean3 = tag1.requiresSpecificParent();
        boolean boolean4 = tag1.isBlock();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "org.jsoup.select.Selector$SelectorParseException: ");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.addClass("#document");
        java.lang.String str11 = element10.html();
        org.jsoup.nodes.Element element13 = element10.appendElement("#document");
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        boolean boolean16 = document15.hasText();
        java.lang.String str17 = document15.nodeName();
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        org.jsoup.nodes.Element element22 = document15.classNames((java.util.Set<java.lang.String>) strSet20);
        org.jsoup.nodes.Element element24 = document15.append("#document");
        org.jsoup.nodes.Element element26 = document15.prepend("#document");
        org.jsoup.nodes.Element element28 = element26.wrap("#document");
        java.lang.String str29 = element26.baseUri();
        org.jsoup.nodes.Element element30 = element10.prependChild((org.jsoup.nodes.Node) element26);
        org.jsoup.select.Elements elements32 = element26.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#document" + "'", str17, "#document");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(elements32);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = element10.html("");
        org.jsoup.select.Elements elements15 = element10.getElementsByAttributeValueNot("#root", "org.jsoup.select.Selector$SelectorParseException: ");
        // The following exception was thrown during execution in test generation
        try {
            element10.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = document1.prepend("#document");
        boolean boolean13 = element12.hasText();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element6 = element5.empty();
        org.jsoup.select.Elements elements8 = element5.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements10 = elements8.removeClass("#root");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        boolean boolean13 = document12.hasText();
        java.lang.String str14 = document12.nodeName();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.jsoup.nodes.Element element19 = document12.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.nodes.Element element21 = document12.append("#document");
        org.jsoup.nodes.Element element23 = document12.prepend("#document");
        org.jsoup.nodes.Attributes attributes24 = element23.attributes();
        org.jsoup.nodes.Element element26 = element23.append("hi!");
        org.jsoup.select.Elements elements28 = element26.getElementsByIndexLessThan((int) (short) 0);
        boolean boolean29 = elements8.equals((java.lang.Object) elements28);
        org.jsoup.select.Elements elements31 = elements8.append("#document");
        org.jsoup.nodes.DataNode dataNode34 = org.jsoup.nodes.DataNode.createFromEncoded("\n<!--#root-->", "#document");
        boolean boolean35 = elements8.equals((java.lang.Object) dataNode34);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#document" + "'", str14, "#document");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(dataNode34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#root", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("#document");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text(" class=\"hi!\"");
        boolean boolean8 = textNode6.hasAttr("org.jsoup.select.Selector$SelectorParseException: ");
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean2 = tag1.isData();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        int int5 = attributes4.size();
        java.lang.String str6 = attributes4.html();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element(tag1, "org.jsoup.select.selector$selectorparseexception:", attributes4);
        attributes4.remove("#comment");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element[] elementArray10 = new org.jsoup.nodes.Element[] { document9 };
        java.util.ArrayList<org.jsoup.nodes.Element> elementList11 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList11, elementArray10);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator13 = elementList11.spliterator();
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator14 = elementList11.spliterator();
        int int15 = elements5.lastIndexOf((java.lang.Object) elementList11);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elementArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(elementSpliterator13);
        org.junit.Assert.assertNotNull(elementSpliterator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        boolean boolean3 = document1.hasText();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        boolean boolean6 = document5.hasText();
        java.lang.String str7 = document5.nodeName();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        org.jsoup.nodes.Element element12 = document5.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element13 = document1.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element15 = document1.appendText("hi!");
        // The following exception was thrown during execution in test generation
        try {
            document1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        boolean boolean3 = document1.hasText();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        boolean boolean6 = document5.hasText();
        java.lang.String str7 = document5.nodeName();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        org.jsoup.nodes.Element element12 = document5.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element13 = document1.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element15 = document1.appendText("hi!");
        java.lang.String str16 = document1.outerHtml();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = element10.html("");
        org.jsoup.nodes.Element element15 = element12.attr("org.jsoup.select.Selector$SelectorParseException: ", "#root");
        java.lang.String str16 = element15.baseUri();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        boolean boolean16 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements20 = document18.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements22 = elements20.prepend("");
        org.jsoup.select.Elements elements24 = elements22.removeAttr("");
        org.jsoup.nodes.Document document26 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements28 = document26.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements30 = elements28.prepend("");
        org.jsoup.select.Elements elements32 = elements30.removeAttr("");
        boolean boolean33 = elements22.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements30);
        org.jsoup.select.Elements elements35 = elements30.wrap("#root");
        boolean boolean36 = elements13.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements35);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor37 = elements35.listIterator();
        java.util.Collection<org.jsoup.nodes.Element> elementCollection38 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = elements35.containsAll(elementCollection38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(elementItor37);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute2.setKey("#root");
        java.lang.String str5 = attribute2.getKey();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.jsoup.nodes.Document document2 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document2.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements6 = elements4.prepend("");
        org.jsoup.select.Elements elements8 = elements6.removeAttr("");
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements12 = document10.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements14 = elements12.prepend("");
        org.jsoup.select.Elements elements16 = elements14.removeAttr("");
        boolean boolean17 = elements6.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements14);
        org.jsoup.select.Elements elements19 = elements14.wrap("#root");
        org.jsoup.select.Elements elements20 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements19);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements21 = org.jsoup.select.Selector.select("", (java.lang.Iterable<org.jsoup.nodes.Element>) elements20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = document1.prepend("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = document1.childNode((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = document1.prepend("#document");
        org.jsoup.nodes.Element element14 = element12.wrap("#document");
        java.lang.String str15 = element12.text();
        java.lang.String str16 = element12.id();
        org.jsoup.select.Elements elements18 = element12.getElementsByAttribute("#data");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#document#document" + "'", str15, "#document#document");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = elements3.attr("#root");
        org.jsoup.select.Elements elements6 = elements3.parents();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = document1.nodeName();
        java.lang.String str5 = document1.className();
        org.jsoup.nodes.Element element7 = document1.getElementById("org.jsoup.select.Selector$SelectorParseException: ");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(element7);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = document1.prepend("#document");
        org.jsoup.nodes.Attributes attributes13 = element12.attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator14 = attributes13.spliterator();
        java.lang.String str16 = attributes13.get("hi!");
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element22 = document19.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        boolean boolean23 = attributes13.equals((java.lang.Object) "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str24 = attributes13.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(attributeSpliterator14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + " class=\"hi!\"" + "'", str24, " class=\"hi!\"");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = document1.prepend("#document");
        org.jsoup.nodes.Attributes attributes13 = element12.attributes();
        org.jsoup.nodes.Element element15 = element12.append("hi!");
        java.lang.String str16 = element12.html();
        java.lang.String str17 = element12.html();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#document#documenthi!" + "'", str16, "#document#documenthi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#document#documenthi!" + "'", str17, "#document#documenthi!");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = element10.html("");
        org.jsoup.nodes.Element element15 = element10.attr("#root", "hi!");
        org.jsoup.nodes.Element element17 = element10.toggleClass("#data");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("org.jsoup.select.Selector$SelectorParseException: ", "");
        java.lang.String str4 = textNode2.absUrl("#data");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("#data");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(textNode6);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        boolean boolean16 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        org.jsoup.select.Elements elements18 = elements5.prepend("hi!");
        boolean boolean19 = elements18.isEmpty();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(tag1);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        int int1 = attributes0.size();
        boolean boolean3 = attributes0.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor4 = attributes0.iterator();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeItor4);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse(file0, "#data");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#document#document", "#comment");
        document2.setBaseUri("[#, d, o, c, u, m, e, n, t]");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#document#documenthi!", " class=\"hi!\"");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.val();
        java.lang.Object obj5 = null;
        int int6 = elements3.lastIndexOf(obj5);
        org.jsoup.select.Elements elements8 = elements3.eq((int) '#');
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("#root", "");
        int int12 = elements8.lastIndexOf((java.lang.Object) "#root");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = element10.html("");
        org.jsoup.select.Elements elements15 = element10.getElementsByAttributeValueNot("#root", "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements16 = element10.getAllElements();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.jsoup.nodes.Document document3 = org.jsoup.parser.Parser.parseBodyFragment("#document", "");
        org.jsoup.nodes.Element element5 = document3.addClass("hi!");
        java.lang.String str6 = document3.title();
        org.jsoup.select.Elements elements7 = org.jsoup.select.Selector.select("#document#document", (org.jsoup.nodes.Element) document3);
        java.lang.String str8 = document3.text();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#document" + "'", str8, "#document");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Element element5 = document2.append("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.select.Elements elements8 = document2.getElementsByAttributeValueStarting("#root=\"hi!\"", "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.nodes.Element element10 = document2.prepend("#root=\"hi!\"");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        org.jsoup.nodes.Element element3 = document1.html("org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str4 = document1.title();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean2 = tag1.isData();
        boolean boolean3 = tag1.requiresSpecificParent();
        boolean boolean4 = tag1.isBlock();
        org.jsoup.parser.Tag tag6 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean7 = tag6.isData();
        boolean boolean8 = tag6.requiresSpecificParent();
        boolean boolean9 = tag6.isBlock();
        boolean boolean10 = tag1.canContain(tag6);
        java.lang.String str11 = tag6.getName();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str11, "org.jsoup.select.selector$selectorparseexception:");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#document", "#root");
        java.lang.String str3 = comment2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n<!--#document-->" + "'", str3, "\n<!--#document-->");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        org.jsoup.nodes.Element element4 = document1.wrap("#comment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(element4);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("org.jsoup.select.Selector$SelectorParseException: ", "#document#documenthi!");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        org.jsoup.nodes.Element element4 = document1.addClass("\n<!--#document-->");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = element10.html("");
        org.jsoup.select.Elements elements15 = element10.getElementsByAttributeValueNot("#root", "org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str16 = element10.val();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.val();
        java.lang.Object obj5 = null;
        int int6 = elements3.lastIndexOf(obj5);
        org.jsoup.select.Elements elements8 = elements3.eq((int) '#');
        boolean boolean10 = elements3.hasAttr("#root");
        int int12 = elements3.indexOf((java.lang.Object) (byte) 100);
        int int13 = elements3.size();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = elements3.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = document1.prepend("#document");
        org.jsoup.nodes.Attributes attributes13 = element12.attributes();
        org.jsoup.nodes.Element element15 = element12.append("hi!");
        java.lang.String str16 = element12.html();
        org.jsoup.nodes.Node node18 = element12.removeAttr("[#, d, o, c, u, m, e, n, t]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#document#documenthi!" + "'", str16, "#document#documenthi!");
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean2 = tag1.isData();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        int int5 = attributes4.size();
        java.lang.String str6 = attributes4.html();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element(tag1, "org.jsoup.select.selector$selectorparseexception:", attributes4);
        boolean boolean8 = tag1.isBlock();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#root", "");
        comment2.setBaseUri("#document#documenthi!");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "\n<!--#root-->");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#root=\"hi!\"");
        boolean boolean8 = textNode7.isBlank();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element6 = element5.empty();
        org.jsoup.select.Elements elements8 = element5.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements10 = elements8.removeClass("#root");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        boolean boolean13 = document12.hasText();
        java.lang.String str14 = document12.nodeName();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.jsoup.nodes.Element element19 = document12.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.nodes.Element element21 = document12.append("#document");
        org.jsoup.nodes.Element element23 = document12.prepend("#document");
        org.jsoup.nodes.Attributes attributes24 = element23.attributes();
        org.jsoup.nodes.Element element26 = element23.append("hi!");
        org.jsoup.select.Elements elements28 = element26.getElementsByIndexLessThan((int) (short) 0);
        boolean boolean29 = elements8.equals((java.lang.Object) elements28);
        java.util.function.UnaryOperator<org.jsoup.nodes.Element> elementUnaryOperator30 = null;
        // The following exception was thrown during execution in test generation
        try {
            elements8.replaceAll(elementUnaryOperator30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#document" + "'", str14, "#document");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean2 = tag1.isData();
        boolean boolean3 = tag1.requiresSpecificParent();
        boolean boolean4 = tag1.isBlock();
        boolean boolean5 = tag1.isEmpty();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements9 = document7.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements11 = elements9.prepend("");
        elements11.clear();
        int int14 = elements11.indexOf((java.lang.Object) "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements16 = elements11.append("#document");
        java.util.Iterator<org.jsoup.nodes.Element> elementItor17 = elements11.iterator();
        boolean boolean18 = tag1.equals((java.lang.Object) elements11);
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elementItor17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.outerHtml();
        java.lang.String str5 = elements3.val();
        org.jsoup.select.Elements elements6 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements3);
        java.lang.String str8 = elements3.attr("org.jsoup.select.Selector$SelectorParseException: ");
        int int10 = elements3.lastIndexOf((java.lang.Object) 100.0d);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        int int1 = attributes0.size();
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements5 = document3.getElementsByAttribute("hi!");
        java.lang.String str6 = elements5.val();
        java.lang.Object obj7 = null;
        int int8 = elements5.lastIndexOf(obj7);
        org.jsoup.select.Elements elements10 = elements5.eq((int) '#');
        boolean boolean11 = attributes0.equals((java.lang.Object) elements10);
        boolean boolean13 = elements10.hasClass("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.nodes.Element element14 = elements10.last();
        org.jsoup.select.Elements elements16 = elements10.removeClass("#root=\"hi!\"");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element5 = document2.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str6 = element5.id();
        org.jsoup.select.Elements elements8 = element5.getElementsByIndexEquals((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = elements8.select("#document#documenthi!");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query #document#documenthi!");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Element element5 = document2.createElement("#document#documenthi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = document2.appendElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        boolean boolean2 = tokenQueue1.isEmpty();
        boolean boolean3 = tokenQueue1.matchesWhitespace();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#data", "[#, d, o, c, u, m, e, n, t]");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "org.jsoup.select.selector$selectorparseexception:");
        java.lang.String str3 = document2.outerHtml();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.val();
        java.lang.Object obj5 = null;
        int int6 = elements3.lastIndexOf(obj5);
        org.jsoup.select.Elements elements8 = elements3.eq((int) '#');
        boolean boolean10 = elements3.hasAttr("#root");
        boolean boolean12 = elements3.is("#root=\"hi!\"");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.jsoup.nodes.DataNode dataNode2 = org.jsoup.nodes.DataNode.createFromEncoded("org.jsoup.select.selector$selectorparseexception:", "hi!");
        java.lang.String str3 = dataNode2.getWholeData();
        org.junit.Assert.assertNotNull(dataNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str3, "org.jsoup.select.selector$selectorparseexception:");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        boolean boolean5 = document1.hasClass("");
        java.lang.String str6 = document1.nodeName();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.addClass("#document");
        org.jsoup.select.Elements elements13 = element10.getElementsByAttributeValueNot("#root", "org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str14 = element10.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        boolean boolean16 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        org.jsoup.select.Elements elements18 = elements5.toggleClass("#root");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        elements5.clear();
        java.lang.String str8 = elements5.attr("");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Element element5 = document2.append("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.select.Elements elements7 = document2.getElementsByIndexEquals(1);
        org.jsoup.nodes.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = document2.appendChild(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Element element5 = document2.append("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.select.Elements elements7 = document2.getElementsByIndexEquals(1);
        java.lang.String str8 = document2.nodeName();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#document" + "'", str8, "#document");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        boolean boolean3 = document1.hasText();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        boolean boolean6 = document5.hasText();
        java.lang.String str7 = document5.nodeName();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        org.jsoup.nodes.Element element12 = document5.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element13 = document1.classNames((java.util.Set<java.lang.String>) strSet10);
        java.lang.String str14 = element13.text();
        org.jsoup.nodes.Element element16 = element13.appendElement("#document#document=\"#document#document\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse(file0, "", " class=\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        boolean boolean16 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements21 = document19.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element23 = document19.prepend("#document");
        org.jsoup.nodes.Element element24 = element23.empty();
        org.jsoup.select.Elements elements26 = element23.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements28 = elements26.removeClass("#root");
        org.jsoup.nodes.Document document30 = new org.jsoup.nodes.Document("");
        boolean boolean31 = document30.hasText();
        java.lang.String str32 = document30.nodeName();
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet35 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet35, strArray34);
        org.jsoup.nodes.Element element37 = document30.classNames((java.util.Set<java.lang.String>) strSet35);
        org.jsoup.nodes.Element element39 = document30.append("#document");
        org.jsoup.nodes.Element element41 = document30.prepend("#document");
        org.jsoup.nodes.Attributes attributes42 = element41.attributes();
        org.jsoup.nodes.Element element44 = element41.append("hi!");
        org.jsoup.select.Elements elements46 = element44.getElementsByIndexLessThan((int) (short) 0);
        boolean boolean47 = elements26.equals((java.lang.Object) elements46);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor49 = elements46.listIterator(0);
        org.jsoup.select.Elements elements51 = elements46.append("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean52 = elements13.addAll((int) 'a', (java.util.Collection<org.jsoup.nodes.Element>) elements51);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#document" + "'", str32, "#document");
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(elementItor49);
        org.junit.Assert.assertNotNull(elements51);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        int int1 = attributes0.size();
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements5 = document3.getElementsByAttribute("hi!");
        java.lang.String str6 = elements5.val();
        java.lang.Object obj7 = null;
        int int8 = elements5.lastIndexOf(obj7);
        org.jsoup.select.Elements elements10 = elements5.eq((int) '#');
        boolean boolean11 = attributes0.equals((java.lang.Object) elements10);
        boolean boolean13 = elements10.hasClass("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.nodes.Element element14 = elements10.last();
        org.jsoup.select.Elements elements16 = elements10.removeClass("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element18 = elements10.get(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#document#document", "hi!");
        java.lang.String str3 = comment2.getData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document#document" + "'", str3, "#document#document");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        org.jsoup.select.Elements elements4 = document1.children();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements7 = document1.getElementsByAttributeValueEnding("\n<!--#root-->", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        int int1 = attributes0.size();
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements5 = document3.getElementsByAttribute("hi!");
        java.lang.String str6 = elements5.val();
        java.lang.Object obj7 = null;
        int int8 = elements5.lastIndexOf(obj7);
        org.jsoup.select.Elements elements10 = elements5.eq((int) '#');
        boolean boolean11 = attributes0.equals((java.lang.Object) elements10);
        boolean boolean12 = elements10.hasText();
        java.lang.String str13 = elements10.val();
        java.util.Iterator<org.jsoup.nodes.Element> elementItor14 = elements10.iterator();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elementItor14);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "\n<!--#root-->");
        java.lang.String str3 = textNode2.text();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.addClass("#document");
        java.lang.String str11 = element10.html();
        org.jsoup.nodes.Element element13 = element10.prepend("#data");
        java.lang.String str14 = element13.data();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        int int1 = attributes0.size();
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements5 = document3.getElementsByAttribute("hi!");
        java.lang.String str6 = elements5.val();
        java.lang.Object obj7 = null;
        int int8 = elements5.lastIndexOf(obj7);
        org.jsoup.select.Elements elements10 = elements5.eq((int) '#');
        boolean boolean11 = attributes0.equals((java.lang.Object) elements10);
        boolean boolean13 = elements10.hasClass("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.nodes.Element element14 = elements10.last();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = elements10.is("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse(file0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element6 = element5.empty();
        org.jsoup.select.Elements elements8 = element5.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements10 = elements8.removeClass("#root");
        org.jsoup.select.Elements elements12 = elements8.append("");
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        boolean boolean16 = document15.hasText();
        java.lang.String str17 = document15.nodeName();
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        org.jsoup.nodes.Element element22 = document15.classNames((java.util.Set<java.lang.String>) strSet20);
        org.jsoup.nodes.Element element24 = document15.append("#document");
        org.jsoup.nodes.Element element26 = element24.html("");
        org.jsoup.nodes.Element element29 = element26.attr("org.jsoup.select.Selector$SelectorParseException: ", "#root");
        elements12.add(0, element29);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#document" + "'", str17, "#document");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element29);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element5 = document2.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str6 = document2.tagName();
        org.jsoup.nodes.Element element7 = document2.parent();
        java.lang.String str8 = document2.title();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = element10.child((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.addClass("#document");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        boolean boolean13 = document12.hasText();
        boolean boolean14 = document12.hasText();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        boolean boolean17 = document16.hasText();
        java.lang.String str18 = document16.nodeName();
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        org.jsoup.nodes.Element element23 = document16.classNames((java.util.Set<java.lang.String>) strSet21);
        org.jsoup.nodes.Element element24 = document12.classNames((java.util.Set<java.lang.String>) strSet21);
        java.util.Set<java.lang.String> strSet25 = document12.classNames();
        org.jsoup.nodes.Element element26 = element8.classNames(strSet25);
        java.lang.String str27 = element8.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#document" + "'", str18, "#document");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        boolean boolean3 = document1.hasText();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        boolean boolean6 = document5.hasText();
        java.lang.String str7 = document5.nodeName();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        org.jsoup.nodes.Element element12 = document5.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element13 = document1.classNames((java.util.Set<java.lang.String>) strSet10);
        java.util.Set<java.lang.String> strSet14 = document1.classNames();
        org.jsoup.nodes.Element element16 = document1.getElementById("#document#document");
        java.lang.String str17 = document1.id();
        boolean boolean19 = document1.hasAttr("#root");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("\n<!--#root-->", "#root");
        boolean boolean3 = document2.hasText();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.jsoup.select.Selector.SelectorParseException selectorParseException1 = new org.jsoup.select.Selector.SelectorParseException("\n<!--#document-->");
        org.jsoup.select.Selector.SelectorParseException selectorParseException3 = new org.jsoup.select.Selector.SelectorParseException("org.jsoup.select.selector$selectorparseexception:");
        java.lang.Throwable[] throwableArray4 = selectorParseException3.getSuppressed();
        selectorParseException1.addSuppressed((java.lang.Throwable) selectorParseException3);
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = elements3.attr("#root");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element[] elementArray8 = new org.jsoup.nodes.Element[] { document7 };
        java.util.ArrayList<org.jsoup.nodes.Element> elementList9 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList9, elementArray8);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator11 = elementList9.spliterator();
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator12 = elementList9.spliterator();
        boolean boolean13 = elements3.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elementList9);
        org.jsoup.select.Elements elements14 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elementList9);
        org.jsoup.select.Elements elements15 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements14);
        org.jsoup.nodes.Document document17 = org.jsoup.Jsoup.parse("hi!");
        int int18 = elements14.indexOf((java.lang.Object) document17);
        java.lang.String str19 = document17.nodeName();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elementArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(elementSpliterator11);
        org.junit.Assert.assertNotNull(elementSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#document" + "'", str19, "#document");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("<?#document#document>", "org.jsoup.select.Selector$SelectorParseException: ");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("<?#document#document>");
        org.junit.Assert.assertNotNull(tag1);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("", "");
        java.lang.String str3 = document2.nodeName();
        java.lang.String str4 = document2.text();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse(file0, "\n<!--#root-->", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "org.jsoup.select.selector$selectorparseexception:");
        boolean boolean4 = document2.hasAttr("#root");
        org.jsoup.nodes.Element element6 = document2.appendText("#root");
        org.jsoup.select.Elements elements8 = element6.getElementsByIndexLessThan(0);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        boolean boolean16 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        java.lang.Object[] objArray17 = elements5.toArray();
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        boolean boolean20 = document19.hasText();
        java.lang.String str21 = document19.nodeName();
        java.lang.String str22 = document19.val();
        boolean boolean23 = elements5.add((org.jsoup.nodes.Element) document19);
        org.jsoup.select.Elements elements25 = elements5.prepend("");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#document" + "'", str21, "#document");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(elements25);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document2 = document1.normalise();
        java.lang.String str3 = document1.nodeName();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = element10.html("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str13 = element12.className();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.addClass("#document");
        java.lang.String str11 = element10.html();
        org.jsoup.nodes.Element element13 = element10.appendElement("#document");
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        boolean boolean16 = document15.hasText();
        java.lang.String str17 = document15.nodeName();
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        org.jsoup.nodes.Element element22 = document15.classNames((java.util.Set<java.lang.String>) strSet20);
        org.jsoup.nodes.Element element24 = document15.append("#document");
        org.jsoup.nodes.Element element26 = document15.prepend("#document");
        org.jsoup.nodes.Element element28 = element26.wrap("#document");
        java.lang.String str29 = element26.baseUri();
        org.jsoup.nodes.Element element30 = element10.prependChild((org.jsoup.nodes.Node) element26);
        org.jsoup.nodes.Element element32 = element30.addClass("#document#document");
        org.jsoup.select.Elements elements34 = element30.getElementsByAttribute("[#, d, o, c, u, m, e, n, t]");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream35 = elements34.parallelStream();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#document" + "'", str17, "#document");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(elementStream35);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#root", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("#document");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text(" class=\"hi!\"");
        java.lang.String str7 = textNode6.getWholeText();
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " class=\"hi!\"" + "'", str7, " class=\"hi!\"");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        boolean boolean16 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        java.lang.Object[] objArray17 = elements5.toArray();
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        boolean boolean20 = document19.hasText();
        java.lang.String str21 = document19.nodeName();
        java.lang.String str22 = document19.val();
        boolean boolean23 = elements5.add((org.jsoup.nodes.Element) document19);
        org.jsoup.nodes.Element element24 = document19.empty();
        org.jsoup.select.Elements elements26 = document19.getElementsByIndexGreaterThan((int) (byte) -1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#document" + "'", str21, "#document");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements26);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = elements3.attr("#root");
        java.lang.String str6 = elements3.text();
        org.jsoup.select.Elements elements8 = elements3.prepend("org.jsoup.select.selector$selectorparseexception:");
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parseBodyFragment("#document", "");
        org.jsoup.nodes.Element element13 = document11.addClass("hi!");
        java.lang.String str14 = document11.title();
        boolean boolean15 = elements3.add((org.jsoup.nodes.Element) document11);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element6 = element5.empty();
        org.jsoup.select.Elements elements8 = element5.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements10 = elements8.removeClass("#root");
        org.jsoup.select.Elements elements12 = elements8.append("");
        boolean boolean14 = elements8.hasAttr("#document#document");
        org.jsoup.select.Elements elements16 = elements8.eq((int) 'a');
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi!=\"#root=&quot;hi!&quot;\"", "#root=\"hi!\"");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueContaining("[]", "#root");
        org.jsoup.nodes.Element element6 = elements5.first();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNull(element6);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document");
        java.lang.String str2 = tokenQueue1.consumeAttributeKey();
        java.lang.String str4 = tokenQueue1.consumeTo("#root=\"hi!\"");
        java.lang.String str5 = tokenQueue1.consumeAttributeKey();
        java.lang.String str6 = tokenQueue1.consumeCssIdentifier();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Element element5 = document2.createElement("#document#documenthi!");
        java.lang.String str6 = document2.text();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.outerHtml();
        java.lang.String str5 = elements3.val();
        org.jsoup.select.Elements elements6 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements3);
        org.jsoup.nodes.TextNode textNode9 = org.jsoup.nodes.TextNode.createFromEncoded("#data", "#root");
        java.lang.String str10 = textNode9.nodeName();
        int int11 = elements3.lastIndexOf((java.lang.Object) str10);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#text" + "'", str10, "#text");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        int int1 = attributes0.size();
        java.lang.String str2 = attributes0.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = attributes0.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = elements3.attr("#root");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element[] elementArray8 = new org.jsoup.nodes.Element[] { document7 };
        java.util.ArrayList<org.jsoup.nodes.Element> elementList9 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList9, elementArray8);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator11 = elementList9.spliterator();
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator12 = elementList9.spliterator();
        boolean boolean13 = elements3.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elementList9);
        org.jsoup.select.Elements elements15 = elements3.addClass("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.nodes.Document document17 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements19 = document17.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element21 = document17.prepend("#document");
        boolean boolean22 = elements3.equals((java.lang.Object) element21);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elementArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(elementSpliterator11);
        org.junit.Assert.assertNotNull(elementSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = document1.prepend("#document");
        org.jsoup.nodes.Attributes attributes13 = element12.attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator14 = attributes13.spliterator();
        java.lang.String str16 = attributes13.get("hi!");
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element22 = document19.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        boolean boolean23 = attributes13.equals((java.lang.Object) "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.parser.Tag tag25 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean26 = tag25.isData();
        org.jsoup.nodes.Attributes attributes28 = new org.jsoup.nodes.Attributes();
        int int29 = attributes28.size();
        java.lang.String str30 = attributes28.html();
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element(tag25, "org.jsoup.select.selector$selectorparseexception:", attributes28);
        org.jsoup.nodes.Attribute attribute34 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute34.setKey("#root");
        java.lang.String str37 = attribute34.html();
        attributes28.put(attribute34);
        attributes13.addAll(attributes28);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(attributeSpliterator14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(attribute34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "#root=\"hi!\"" + "'", str37, "#root=\"hi!\"");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        boolean boolean8 = document7.hasText();
        boolean boolean9 = document7.hasText();
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        boolean boolean12 = document11.hasText();
        java.lang.String str13 = document11.nodeName();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = document11.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.nodes.Element element19 = document7.classNames((java.util.Set<java.lang.String>) strSet16);
        int int20 = elements3.indexOf((java.lang.Object) element19);
        org.jsoup.select.Elements elements21 = element19.children();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#document" + "'", str13, "#document");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse(file0, "#data", "#document");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("\n<!--#root-->", "#root");
        org.jsoup.nodes.Element element4 = document2.removeClass("#root=\"hi!\"");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element6 = element5.empty();
        org.jsoup.select.Elements elements8 = element5.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements10 = elements8.removeClass("#root");
        org.jsoup.select.Elements elements12 = elements8.append("");
        boolean boolean14 = elements8.hasAttr("#document#document");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream15 = elements8.parallelStream();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elementStream15);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.addClass("#document");
        org.jsoup.select.Elements elements13 = element10.getElementsByAttributeValueNot("#root", "org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str14 = element10.data();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element17 = element10.attr("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element6 = element5.empty();
        org.jsoup.select.Elements elements8 = element5.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements10 = elements8.removeClass("#root");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        boolean boolean13 = document12.hasText();
        java.lang.String str14 = document12.nodeName();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.jsoup.nodes.Element element19 = document12.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.nodes.Element element21 = document12.append("#document");
        org.jsoup.nodes.Element element23 = document12.prepend("#document");
        org.jsoup.nodes.Attributes attributes24 = element23.attributes();
        org.jsoup.nodes.Element element26 = element23.append("hi!");
        org.jsoup.select.Elements elements28 = element26.getElementsByIndexLessThan((int) (short) 0);
        boolean boolean29 = elements8.equals((java.lang.Object) elements28);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor31 = elements28.listIterator(0);
        org.jsoup.select.Elements elements33 = elements28.append("");
        boolean boolean34 = elements33.isEmpty();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#document" + "'", str14, "#document");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(elementItor31);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document4 = org.jsoup.parser.Parser.parseBodyFragment("#document", "");
        org.jsoup.nodes.Element element6 = document4.addClass("hi!");
        org.jsoup.nodes.Element element7 = document4.body();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        boolean boolean10 = document9.hasText();
        java.lang.String str11 = document9.nodeName();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.jsoup.nodes.Element element16 = document9.classNames((java.util.Set<java.lang.String>) strSet14);
        org.jsoup.nodes.Element element18 = element16.addClass("#document");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        boolean boolean21 = document20.hasText();
        boolean boolean22 = document20.hasText();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        boolean boolean25 = document24.hasText();
        java.lang.String str26 = document24.nodeName();
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        org.jsoup.nodes.Element element31 = document24.classNames((java.util.Set<java.lang.String>) strSet29);
        org.jsoup.nodes.Element element32 = document20.classNames((java.util.Set<java.lang.String>) strSet29);
        java.util.Set<java.lang.String> strSet33 = document20.classNames();
        org.jsoup.nodes.Element element34 = element16.classNames(strSet33);
        org.jsoup.nodes.Element element35 = element7.classNames(strSet33);
        java.util.List<org.jsoup.nodes.Node> nodeList36 = element35.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            document1.replaceWith((org.jsoup.nodes.Node) element35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#document" + "'", str11, "#document");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#document" + "'", str26, "#document");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(nodeList36);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = document1.prepend("#document");
        org.jsoup.nodes.Attributes attributes13 = element12.attributes();
        org.jsoup.nodes.Element element15 = element12.append("hi!");
        org.jsoup.select.Elements elements17 = element15.getElementsByIndexLessThan((int) (short) 0);
        java.lang.String str18 = element15.val();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element8 = document5.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes9 = document5.attributes();
        boolean boolean10 = document1.equals((java.lang.Object) attributes9);
        org.jsoup.nodes.Attributes attributes11 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes9.addAll(attributes11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("hi!", "#data");
        org.jsoup.parser.Tag tag3 = document2.tag();
        boolean boolean4 = tag3.isInline();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        boolean boolean3 = document1.hasText();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        boolean boolean6 = document5.hasText();
        java.lang.String str7 = document5.nodeName();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        org.jsoup.nodes.Element element12 = document5.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element13 = document1.classNames((java.util.Set<java.lang.String>) strSet10);
        java.lang.Class<?> wildcardClass14 = element13.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#document#document", "#comment");
        document2.setBaseUri("org.jsoup.select.Selector$SelectorParseException: ");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        elements5.clear();
        int int8 = elements5.indexOf((java.lang.Object) "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements10 = elements5.append("#document");
        java.util.Iterator<org.jsoup.nodes.Element> elementItor11 = elements5.iterator();
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parseBodyFragment(" class=\"hi!\"");
        boolean boolean14 = elements5.add((org.jsoup.nodes.Element) document13);
        boolean boolean16 = document13.hasClass("#document");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elementItor11);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element4 = elements3.first();
        org.jsoup.select.Elements elements6 = elements3.toggleClass("#document");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        org.jsoup.nodes.Document document17 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements19 = document17.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements21 = elements19.prepend("");
        org.jsoup.select.Elements elements23 = elements21.removeAttr("");
        boolean boolean24 = elements13.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements21);
        org.jsoup.nodes.Document document26 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements28 = document26.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements30 = elements28.prepend("");
        org.jsoup.select.Elements elements32 = elements30.removeAttr("");
        org.jsoup.nodes.Document document34 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements36 = document34.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements38 = elements36.prepend("");
        org.jsoup.select.Elements elements40 = elements38.removeAttr("");
        boolean boolean41 = elements30.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements38);
        org.jsoup.select.Elements elements43 = elements38.wrap("#root");
        boolean boolean44 = elements21.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements43);
        org.jsoup.select.Elements elements46 = elements21.val("#root=\"hi!\"");
        org.jsoup.select.Elements elements48 = elements46.append("#text");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean49 = elements6.addAll((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements48);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertNotNull(elements48);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element6 = element5.empty();
        org.jsoup.select.Elements elements8 = element6.getElementsByIndexLessThan(10);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        boolean boolean2 = tokenQueue1.isEmpty();
        java.lang.Character char3 = tokenQueue1.peek();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(char3);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element6 = element5.empty();
        org.jsoup.select.Elements elements8 = element5.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements10 = elements8.removeClass("#root");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        boolean boolean13 = document12.hasText();
        java.lang.String str14 = document12.nodeName();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.jsoup.nodes.Element element19 = document12.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.nodes.Element element21 = document12.append("#document");
        org.jsoup.nodes.Element element23 = document12.prepend("#document");
        org.jsoup.nodes.Attributes attributes24 = element23.attributes();
        org.jsoup.nodes.Element element26 = element23.append("hi!");
        org.jsoup.select.Elements elements28 = element26.getElementsByIndexLessThan((int) (short) 0);
        boolean boolean29 = elements8.equals((java.lang.Object) elements28);
        org.jsoup.select.Elements elements31 = elements8.append("#document");
        org.jsoup.select.Elements elements33 = elements31.wrap("\n<!--#root-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element35 = elements33.get((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#document" + "'", str14, "#document");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(elements33);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        org.jsoup.select.Elements elements6 = document1.children();
        java.util.Set<java.lang.String> strSet7 = document1.classNames();
        org.jsoup.select.Elements elements9 = document1.getElementsByTag("hi!=\"#root=&quot;hi!&quot;\"");
        org.jsoup.nodes.Element element11 = document1.addClass("\n<!--#root-->");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        org.jsoup.select.Elements elements5 = element4.parents();
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element6 = element5.empty();
        org.jsoup.select.Elements elements8 = element5.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements10 = elements8.removeClass("#root");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        boolean boolean13 = document12.hasText();
        java.lang.String str14 = document12.nodeName();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.jsoup.nodes.Element element19 = document12.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.nodes.Element element21 = document12.append("#document");
        org.jsoup.nodes.Element element23 = document12.prepend("#document");
        org.jsoup.nodes.Attributes attributes24 = element23.attributes();
        org.jsoup.nodes.Element element26 = element23.append("hi!");
        org.jsoup.select.Elements elements28 = element26.getElementsByIndexLessThan((int) (short) 0);
        boolean boolean29 = elements8.equals((java.lang.Object) elements28);
        org.jsoup.select.Elements elements31 = elements8.append("#document");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream32 = elements31.parallelStream();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#document" + "'", str14, "#document");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(elementStream32);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        boolean boolean3 = document1.hasText();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        boolean boolean6 = document5.hasText();
        java.lang.String str7 = document5.nodeName();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        org.jsoup.nodes.Element element12 = document5.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element13 = document1.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element15 = document1.appendText("hi!");
        org.jsoup.parser.Tag tag16 = document1.tag();
        boolean boolean17 = tag16.requiresSpecificParent();
        org.jsoup.parser.Tag tag18 = tag16.getImplicitParent();
        boolean boolean19 = tag18.requiresSpecificParent();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = elements3.attr("#root");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element[] elementArray8 = new org.jsoup.nodes.Element[] { document7 };
        java.util.ArrayList<org.jsoup.nodes.Element> elementList9 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList9, elementArray8);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator11 = elementList9.spliterator();
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator12 = elementList9.spliterator();
        boolean boolean13 = elements3.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elementList9);
        org.jsoup.select.Elements elements15 = elements3.addClass("org.jsoup.select.Selector$SelectorParseException: ");
        java.util.Collection<org.jsoup.nodes.Element> elementCollection16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = elements15.addAll(elementCollection16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elementArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(elementSpliterator11);
        org.junit.Assert.assertNotNull(elementSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.val();
        java.lang.Object obj5 = null;
        int int6 = elements3.lastIndexOf(obj5);
        org.jsoup.select.Elements elements8 = elements3.eq((int) '#');
        elements3.clear();
        org.jsoup.select.Elements elements11 = elements3.prepend("hi!");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Element element5 = document2.append("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        boolean boolean7 = element5.hasClass("#document");
        org.jsoup.select.Elements elements9 = element5.getElementsByIndexLessThan(10);
        org.jsoup.nodes.Element element10 = element5.empty();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = elements3.attr("#root");
        java.lang.String str6 = elements3.text();
        org.jsoup.select.Elements elements8 = elements3.prepend("org.jsoup.select.selector$selectorparseexception:");
        java.lang.String str9 = elements8.val();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        int int1 = attributes0.size();
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements5 = document3.getElementsByAttribute("hi!");
        java.lang.String str6 = elements5.val();
        java.lang.Object obj7 = null;
        int int8 = elements5.lastIndexOf(obj7);
        org.jsoup.select.Elements elements10 = elements5.eq((int) '#');
        boolean boolean11 = attributes0.equals((java.lang.Object) elements10);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor12 = attributes0.iterator();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attributeItor12);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.val();
        java.lang.Object obj5 = null;
        int int6 = elements3.lastIndexOf(obj5);
        org.jsoup.select.Elements elements8 = elements3.eq((int) '#');
        boolean boolean10 = elements3.hasAttr("#root");
        int int12 = elements3.indexOf((java.lang.Object) (byte) 100);
        java.lang.String str14 = elements3.attr("org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.Object[] objArray15 = elements3.toArray();
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        boolean boolean19 = document18.hasText();
        java.lang.String str20 = document18.nodeName();
        org.jsoup.select.Elements elements21 = document18.children();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element22 = elements3.set((int) (short) 10, (org.jsoup.nodes.Element) document18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#document" + "'", str20, "#document");
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = document1.nodeName();
        java.lang.String str5 = document1.outerHtml();
        boolean boolean7 = document1.hasAttr("#document#document");
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueEnding("#document", "#comment");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element4 = elements3.first();
        org.jsoup.nodes.Document document7 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str8 = document7.outerHtml();
        org.jsoup.nodes.Element element10 = document7.append("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.select.Elements elements13 = document7.getElementsByAttributeValueStarting("#root=\"hi!\"", "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements17 = document15.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element19 = document15.prepend("#document");
        org.jsoup.nodes.Element element20 = element19.empty();
        org.jsoup.select.Elements elements22 = element19.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements24 = elements22.removeClass("#root");
        org.jsoup.nodes.Document document26 = new org.jsoup.nodes.Document("");
        boolean boolean27 = document26.hasText();
        java.lang.String str28 = document26.nodeName();
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        org.jsoup.nodes.Element element33 = document26.classNames((java.util.Set<java.lang.String>) strSet31);
        org.jsoup.nodes.Element element35 = document26.append("#document");
        org.jsoup.nodes.Element element37 = document26.prepend("#document");
        org.jsoup.nodes.Attributes attributes38 = element37.attributes();
        org.jsoup.nodes.Element element40 = element37.append("hi!");
        org.jsoup.select.Elements elements42 = element40.getElementsByIndexLessThan((int) (short) 0);
        boolean boolean43 = elements22.equals((java.lang.Object) elements42);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor45 = elements42.listIterator(0);
        org.jsoup.select.Elements elements47 = elements42.append("");
        org.jsoup.nodes.Document document49 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements51 = document49.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements53 = elements51.prepend("");
        org.jsoup.select.Elements elements55 = elements53.removeAttr("");
        org.jsoup.nodes.Document document57 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements59 = document57.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements61 = elements59.prepend("");
        org.jsoup.select.Elements elements63 = elements61.removeAttr("");
        boolean boolean64 = elements53.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements61);
        java.util.Collection[] collectionArray66 = new java.util.Collection[3];
        @SuppressWarnings("unchecked")
        java.util.Collection<org.jsoup.nodes.Element>[] elementCollectionArray67 = (java.util.Collection<org.jsoup.nodes.Element>[]) collectionArray66;
        elementCollectionArray67[0] = elements13;
        elementCollectionArray67[1] = elements47;
        elementCollectionArray67[2] = elements53;
        java.util.Collection<org.jsoup.nodes.Element>[] elementCollectionArray74 = elements3.toArray(elementCollectionArray67);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str8, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#document" + "'", str28, "#document");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(elementItor45);
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertNotNull(elements51);
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertNotNull(elements55);
        org.junit.Assert.assertNotNull(elements59);
        org.junit.Assert.assertNotNull(elements61);
        org.junit.Assert.assertNotNull(elements63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(collectionArray66);
        org.junit.Assert.assertNotNull(elementCollectionArray67);
        org.junit.Assert.assertNotNull(elementCollectionArray74);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.val();
        java.lang.Object obj5 = null;
        int int6 = elements3.lastIndexOf(obj5);
        org.jsoup.select.Elements elements8 = elements3.eq((int) '#');
        boolean boolean10 = elements3.hasAttr("#root");
        int int12 = elements3.indexOf((java.lang.Object) (byte) 100);
        int int13 = elements3.size();
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parseBodyFragment("#document", "");
        org.jsoup.nodes.Element element19 = document17.addClass("hi!");
        org.jsoup.nodes.Element element20 = document17.body();
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("");
        boolean boolean23 = document22.hasText();
        java.lang.String str24 = document22.nodeName();
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        org.jsoup.nodes.Element element29 = document22.classNames((java.util.Set<java.lang.String>) strSet27);
        org.jsoup.nodes.Element element31 = element29.addClass("#document");
        org.jsoup.nodes.Document document33 = new org.jsoup.nodes.Document("");
        boolean boolean34 = document33.hasText();
        boolean boolean35 = document33.hasText();
        org.jsoup.nodes.Document document37 = new org.jsoup.nodes.Document("");
        boolean boolean38 = document37.hasText();
        java.lang.String str39 = document37.nodeName();
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        org.jsoup.nodes.Element element44 = document37.classNames((java.util.Set<java.lang.String>) strSet42);
        org.jsoup.nodes.Element element45 = document33.classNames((java.util.Set<java.lang.String>) strSet42);
        java.util.Set<java.lang.String> strSet46 = document33.classNames();
        org.jsoup.nodes.Element element47 = element29.classNames(strSet46);
        org.jsoup.nodes.Element element48 = element20.classNames(strSet46);
        boolean boolean50 = element48.hasClass("#document#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element51 = elements3.set((int) (short) -1, element48);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#document" + "'", str24, "#document");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "#document" + "'", str39, "#document");
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(strSet46);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.addClass("#document");
        java.lang.String str11 = element10.html();
        org.jsoup.nodes.Element element13 = element10.appendElement("#document");
        java.lang.String str14 = element13.html();
        org.jsoup.select.Elements elements17 = element13.getElementsByAttributeValueStarting("#root=\"hi!\"", "[#, d, o, c, u, m, e, n, t]");
        java.lang.String str18 = element13.text();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element6 = element5.empty();
        org.jsoup.select.Elements elements8 = element5.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements10 = elements8.removeClass("#root");
        org.jsoup.select.Elements elements12 = elements8.append("");
        org.jsoup.nodes.Document document15 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str16 = document15.outerHtml();
        org.jsoup.nodes.Element element18 = document15.createElement("#document#documenthi!");
        boolean boolean19 = elements12.remove((java.lang.Object) document15);
        org.jsoup.select.Elements elements21 = document15.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str16, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        boolean boolean16 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        java.util.Iterator<org.jsoup.nodes.Element> elementItor17 = elements5.iterator();
        boolean boolean18 = elements5.hasText();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(elementItor17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean2 = tag1.isData();
        boolean boolean3 = tag1.requiresSpecificParent();
        boolean boolean4 = tag1.isBlock();
        org.jsoup.parser.Tag tag6 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean7 = tag6.isData();
        boolean boolean8 = tag6.requiresSpecificParent();
        boolean boolean9 = tag6.isBlock();
        boolean boolean10 = tag1.canContain(tag6);
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        boolean boolean14 = document13.hasText();
        java.lang.String str15 = document13.nodeName();
        org.jsoup.nodes.Document document17 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element20 = document17.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes21 = document17.attributes();
        boolean boolean22 = document13.equals((java.lang.Object) attributes21);
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element(tag1, "#document#document=\"#document#document\"", attributes21);
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#document" + "'", str15, "#document");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean2 = tag1.isData();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        int int5 = attributes4.size();
        java.lang.String str6 = attributes4.html();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element(tag1, "org.jsoup.select.selector$selectorparseexception:", attributes4);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator8 = attributes4.spliterator();
        attributes4.put("#comment", "#document#document=\"#document#document\"");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributeSpliterator8);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = document1.prepend("#document");
        org.jsoup.nodes.Element element14 = element12.wrap("#document");
        org.jsoup.select.Elements elements17 = element12.getElementsByAttributeValueStarting("[#, d, o, c, u, m, e, n, t]", "\n<!--#root-->");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("#root", "hi!");
        java.lang.String str3 = attribute2.html();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root=\"hi!\"" + "'", str3, "#root=\"hi!\"");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#document#document=\"#document#document\"", "hi!=\"#root=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>", "");
        org.jsoup.nodes.Document document4 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements6 = document4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element8 = document4.prepend("#document");
        org.jsoup.nodes.Element element10 = document4.createElement("#data");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        boolean boolean13 = document12.hasText();
        org.jsoup.nodes.Element element15 = document12.addClass("\n<!--#document-->");
        org.jsoup.nodes.Document document17 = new org.jsoup.nodes.Document("");
        boolean boolean18 = document17.hasText();
        boolean boolean19 = document17.hasText();
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        boolean boolean22 = document21.hasText();
        java.lang.String str23 = document21.nodeName();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        org.jsoup.nodes.Element element28 = document21.classNames((java.util.Set<java.lang.String>) strSet26);
        org.jsoup.nodes.Element element29 = document17.classNames((java.util.Set<java.lang.String>) strSet26);
        org.jsoup.nodes.Document document31 = new org.jsoup.nodes.Document("");
        boolean boolean32 = document31.hasText();
        java.lang.String str33 = document31.nodeName();
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        org.jsoup.nodes.Element element38 = document31.classNames((java.util.Set<java.lang.String>) strSet36);
        org.jsoup.nodes.Element element40 = document31.append("#document");
        org.jsoup.nodes.Element element42 = element40.html("");
        org.jsoup.nodes.Document document44 = new org.jsoup.nodes.Document("");
        boolean boolean45 = document44.hasText();
        java.lang.String str46 = document44.nodeName();
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet49 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet49, strArray48);
        org.jsoup.nodes.Element element51 = document44.classNames((java.util.Set<java.lang.String>) strSet49);
        org.jsoup.nodes.Element element53 = document44.append("");
        org.jsoup.nodes.Element element55 = element53.addClass("#document#document");
        org.jsoup.nodes.Element[] elementArray56 = new org.jsoup.nodes.Element[] { document2, element10, element15, element29, element42, element53 };
        org.jsoup.select.Elements elements57 = new org.jsoup.select.Elements(elementArray56);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#document" + "'", str23, "#document");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#document" + "'", str33, "#document");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "#document" + "'", str46, "#document");
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertNotNull(elementArray56);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        boolean boolean16 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements20 = document18.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements22 = elements20.prepend("");
        org.jsoup.select.Elements elements24 = elements22.removeAttr("");
        org.jsoup.nodes.Document document26 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements28 = document26.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements30 = elements28.prepend("");
        org.jsoup.select.Elements elements32 = elements30.removeAttr("");
        boolean boolean33 = elements22.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements30);
        org.jsoup.select.Elements elements35 = elements30.wrap("#root");
        boolean boolean36 = elements13.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements35);
        org.jsoup.select.Elements elements37 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        org.jsoup.select.Elements elements38 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements13);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = document1.prepend("#document");
        org.jsoup.nodes.Attributes attributes13 = element12.attributes();
        org.jsoup.nodes.Element element15 = element12.append("hi!");
        org.jsoup.nodes.Element element17 = element15.appendText("#root=\"hi!\"");
        boolean boolean18 = element17.isBlock();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.jsoup.nodes.Document document3 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element6 = document3.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str7 = document3.tagName();
        java.lang.String str8 = document3.toString();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        boolean boolean11 = document10.hasText();
        java.lang.String str12 = document10.nodeName();
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        org.jsoup.nodes.Element element17 = document10.classNames((java.util.Set<java.lang.String>) strSet15);
        org.jsoup.nodes.Element element19 = document10.append("#document");
        org.jsoup.nodes.Element element21 = element19.html("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.nodes.Element element22 = document3.appendChild((org.jsoup.nodes.Node) element21);
        org.jsoup.select.Elements elements23 = org.jsoup.select.Selector.select("#text", element21);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#root" + "'", str7, "#root");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str8, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = element10.html("");
        org.jsoup.nodes.Element element15 = element12.attr("org.jsoup.select.Selector$SelectorParseException: ", "#root");
        org.jsoup.nodes.Element element17 = element15.removeClass("#document#documenthi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        int int1 = attributes0.size();
        java.lang.String str2 = attributes0.html();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes0.iterator();
        attributes0.put("#comment", "");
        int int7 = attributes0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document2 = document1.normalise();
        org.jsoup.nodes.Element element4 = document1.prependElement("org.jsoup.select.selector$selectorparseexception:");
        org.jsoup.nodes.Element element6 = element4.wrap("#root");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNull(element6);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.jsoup.nodes.Element[] elementArray0 = new org.jsoup.nodes.Element[] {};
        org.jsoup.select.Elements elements1 = new org.jsoup.select.Elements(elementArray0);
        org.jsoup.select.Elements elements2 = new org.jsoup.select.Elements(elementArray0);
        org.junit.Assert.assertNotNull(elementArray0);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        boolean boolean16 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        org.jsoup.select.Elements elements18 = elements13.wrap("#root");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        boolean boolean21 = document20.hasText();
        java.lang.String str22 = document20.nodeName();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        org.jsoup.nodes.Element element27 = document20.classNames((java.util.Set<java.lang.String>) strSet25);
        org.jsoup.nodes.Element element29 = element27.addClass("#document");
        org.jsoup.select.Elements elements32 = element29.getElementsByAttributeValueNot("#root", "org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str33 = elements32.html();
        org.jsoup.nodes.Attributes attributes35 = new org.jsoup.nodes.Attributes();
        int int36 = attributes35.size();
        org.jsoup.nodes.Document document38 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements40 = document38.getElementsByAttribute("hi!");
        java.lang.String str41 = elements40.val();
        java.lang.Object obj42 = null;
        int int43 = elements40.lastIndexOf(obj42);
        org.jsoup.select.Elements elements45 = elements40.eq((int) '#');
        boolean boolean46 = attributes35.equals((java.lang.Object) elements45);
        boolean boolean48 = elements45.hasClass("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        boolean boolean49 = elements32.addAll(1, (java.util.Collection<org.jsoup.nodes.Element>) elements45);
        boolean boolean50 = elements18.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements32);
        org.jsoup.nodes.Document document54 = org.jsoup.Jsoup.parseBodyFragment("hi!=\"#root=&quot;hi!&quot;\"", "#root=\"hi!\"");
        org.jsoup.select.Elements elements57 = document54.getElementsByAttributeValueContaining("[]", "#root");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean58 = elements18.addAll(3, (java.util.Collection<org.jsoup.nodes.Element>) elements57);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#document" + "'", str22, "#document");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertNotNull(elements57);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.html();
        java.lang.String str5 = document2.attr("org.jsoup.select.selector$selectorparseexception:");
        java.lang.String str6 = document2.id();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = document2.attr("", "hi!=\"#root=&quot;hi!&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document");
        java.lang.String str2 = tokenQueue1.consumeAttributeKey();
        java.lang.String str4 = tokenQueue1.consumeTo("#root=\"hi!\"");
        java.lang.String str5 = tokenQueue1.toString();
        java.lang.String str7 = tokenQueue1.chompTo("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.jsoup.nodes.Document document2 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document2.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements6 = elements4.prepend("");
        elements6.clear();
        int int9 = elements6.indexOf((java.lang.Object) "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements11 = elements6.removeClass("#data");
        org.jsoup.select.Elements elements12 = org.jsoup.select.Selector.select("#data", (java.lang.Iterable<org.jsoup.nodes.Element>) elements11);
        org.jsoup.parser.Tag tag14 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean15 = tag14.isData();
        boolean boolean16 = tag14.requiresSpecificParent();
        boolean boolean17 = tag14.isBlock();
        org.jsoup.parser.Tag tag19 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean20 = tag19.isData();
        boolean boolean21 = tag19.requiresSpecificParent();
        boolean boolean22 = tag19.isBlock();
        boolean boolean23 = tag14.canContain(tag19);
        boolean boolean24 = elements11.equals((java.lang.Object) tag19);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element26 = elements11.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = document1.prepend("#document");
        org.jsoup.nodes.Attributes attributes13 = element12.attributes();
        org.jsoup.nodes.Element element15 = element12.append("hi!");
        org.jsoup.nodes.Document document17 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements19 = document17.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element21 = document17.prepend("#document");
        org.jsoup.nodes.Element element22 = element21.empty();
        org.jsoup.select.Elements elements24 = element21.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements26 = elements24.removeClass("#root");
        org.jsoup.nodes.Document document28 = new org.jsoup.nodes.Document("");
        boolean boolean29 = document28.hasText();
        java.lang.String str30 = document28.nodeName();
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet33 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet33, strArray32);
        org.jsoup.nodes.Element element35 = document28.classNames((java.util.Set<java.lang.String>) strSet33);
        org.jsoup.nodes.Element element37 = document28.append("#document");
        org.jsoup.nodes.Element element39 = document28.prepend("#document");
        org.jsoup.nodes.Attributes attributes40 = element39.attributes();
        org.jsoup.nodes.Element element42 = element39.append("hi!");
        org.jsoup.select.Elements elements44 = element42.getElementsByIndexLessThan((int) (short) 0);
        boolean boolean45 = elements24.equals((java.lang.Object) elements44);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor47 = elements44.listIterator(0);
        boolean boolean48 = element15.equals((java.lang.Object) elements44);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#document" + "'", str30, "#document");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(attributes40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(elementItor47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.val();
        java.lang.Object obj5 = null;
        int int6 = elements3.lastIndexOf(obj5);
        org.jsoup.select.Elements elements8 = elements3.eq((int) '#');
        boolean boolean10 = elements3.hasAttr("#root");
        boolean boolean12 = elements3.hasAttr("hi!");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean(" class=\"hi!\"", "", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("<?#document#document>");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        boolean boolean3 = tokenQueue1.matchChomp("org.jsoup.select.selector$selectorparseexception:");
        java.lang.String str4 = tokenQueue1.consumeWord();
        java.lang.String str5 = tokenQueue1.consumeAttributeKey();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        boolean boolean16 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        org.jsoup.select.Elements elements18 = elements5.prepend("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element20 = elements5.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "hi!", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document");
        java.lang.String str2 = tokenQueue1.consumeAttributeKey();
        java.lang.String str4 = tokenQueue1.consumeTo("#root=\"hi!\"");
        java.lang.String str5 = tokenQueue1.toString();
        boolean boolean6 = tokenQueue1.consumeWhitespace();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        boolean boolean16 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        org.jsoup.select.Elements elements18 = elements13.wrap("#root");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        boolean boolean21 = document20.hasText();
        java.lang.String str22 = document20.nodeName();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        org.jsoup.nodes.Element element27 = document20.classNames((java.util.Set<java.lang.String>) strSet25);
        org.jsoup.nodes.Element element29 = element27.addClass("#document");
        org.jsoup.select.Elements elements32 = element29.getElementsByAttributeValueNot("#root", "org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str33 = elements32.html();
        org.jsoup.nodes.Attributes attributes35 = new org.jsoup.nodes.Attributes();
        int int36 = attributes35.size();
        org.jsoup.nodes.Document document38 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements40 = document38.getElementsByAttribute("hi!");
        java.lang.String str41 = elements40.val();
        java.lang.Object obj42 = null;
        int int43 = elements40.lastIndexOf(obj42);
        org.jsoup.select.Elements elements45 = elements40.eq((int) '#');
        boolean boolean46 = attributes35.equals((java.lang.Object) elements45);
        boolean boolean48 = elements45.hasClass("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        boolean boolean49 = elements32.addAll(1, (java.util.Collection<org.jsoup.nodes.Element>) elements45);
        boolean boolean50 = elements18.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements32);
        java.lang.String str51 = elements32.html();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#document" + "'", str22, "#document");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse(uRL0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        org.jsoup.nodes.Document document6 = document1.normalise();
        java.lang.String str7 = document1.title();
        org.jsoup.select.Elements elements9 = document1.getElementsByIndexEquals((int) (short) 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element6 = element5.empty();
        org.jsoup.select.Elements elements8 = element5.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements10 = elements8.removeClass("#root");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        boolean boolean13 = document12.hasText();
        java.lang.String str14 = document12.nodeName();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.jsoup.nodes.Element element19 = document12.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.nodes.Element element21 = document12.append("#document");
        org.jsoup.nodes.Element element23 = document12.prepend("#document");
        org.jsoup.nodes.Attributes attributes24 = element23.attributes();
        org.jsoup.nodes.Element element26 = element23.append("hi!");
        org.jsoup.select.Elements elements28 = element26.getElementsByIndexLessThan((int) (short) 0);
        boolean boolean29 = elements8.equals((java.lang.Object) elements28);
        org.jsoup.select.Elements elements31 = elements8.append("#document");
        org.jsoup.nodes.Document document34 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element37 = document34.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes38 = document34.attributes();
        // The following exception was thrown during execution in test generation
        try {
            elements31.add(3, (org.jsoup.nodes.Element) document34);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#document" + "'", str14, "#document");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(attributes38);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean("hi!", "#document#documentdocument", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#document", "");
        org.jsoup.nodes.Element element4 = document2.addClass("hi!");
        org.jsoup.nodes.Element element5 = document2.body();
        java.lang.String str6 = element5.nodeName();
        java.lang.String str7 = element5.text();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "body" + "'", str6, "body");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("org.jsoup.select.selector$selectorparseexception:");
        org.jsoup.select.Elements elements5 = elements3.eq((int) (byte) 10);
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        int int7 = attributes6.size();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        java.lang.String str12 = elements11.val();
        java.lang.Object obj13 = null;
        int int14 = elements11.lastIndexOf(obj13);
        org.jsoup.select.Elements elements16 = elements11.eq((int) '#');
        boolean boolean17 = attributes6.equals((java.lang.Object) elements16);
        boolean boolean18 = elements16.hasText();
        java.lang.String str19 = elements16.val();
        org.jsoup.select.Elements elements21 = elements16.append("#document#document");
        boolean boolean22 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements21);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse(file0, "#root=\"hi!\"", "[]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.jsoup.nodes.Document document3 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("hi!", "#data");
        org.jsoup.parser.Tag tag4 = document3.tag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements5 = org.jsoup.select.Selector.select("", (org.jsoup.nodes.Element) document3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(tag4);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = elements3.attr("#root");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element[] elementArray8 = new org.jsoup.nodes.Element[] { document7 };
        java.util.ArrayList<org.jsoup.nodes.Element> elementList9 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList9, elementArray8);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator11 = elementList9.spliterator();
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator12 = elementList9.spliterator();
        boolean boolean13 = elements3.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elementList9);
        org.jsoup.select.Elements elements15 = elements3.prepend("#root=\"hi!\"");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elementArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(elementSpliterator11);
        org.junit.Assert.assertNotNull(elementSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#root", "#root");
        java.lang.String str3 = comment2.nodeName();
        java.lang.String str4 = comment2.nodeName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#comment" + "'", str4, "#comment");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        boolean boolean16 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        org.jsoup.select.Elements elements18 = elements13.wrap("#root");
        org.jsoup.select.Elements elements19 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements18);
        java.lang.String str20 = elements19.html();
        java.lang.String str21 = elements19.text();
        boolean boolean23 = elements19.is("[#, d, o, c, u, m, e, n, t]");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document");
        java.lang.String str2 = tokenQueue1.consumeAttributeKey();
        java.lang.String str3 = tokenQueue1.consumeCssIdentifier();
        boolean boolean4 = tokenQueue1.consumeWhitespace();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document");
        java.lang.String str2 = tokenQueue1.consumeAttributeKey();
        java.lang.String str3 = tokenQueue1.consumeCssIdentifier();
        boolean boolean5 = tokenQueue1.matches("#comment");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.addClass("#document");
        java.lang.String str11 = element10.html();
        org.jsoup.nodes.Element element13 = element10.appendElement("#document");
        java.lang.String str14 = element13.html();
        java.lang.String str15 = element13.text();
        org.jsoup.nodes.Element element16 = element13.firstElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element18 = element16.getElementById("#document#document=\"#document#document\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(element16);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        boolean boolean3 = document1.hasText();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        boolean boolean6 = document5.hasText();
        java.lang.String str7 = document5.nodeName();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        org.jsoup.nodes.Element element12 = document5.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element13 = document1.classNames((java.util.Set<java.lang.String>) strSet10);
        java.util.Set<java.lang.String> strSet14 = document1.classNames();
        org.jsoup.nodes.Element element16 = document1.getElementById("#document#document");
        java.lang.String str17 = document1.id();
        java.lang.String str18 = document1.nodeName();
        java.lang.String str20 = document1.attr("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#document" + "'", str18, "#document");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute2.setValue("#root=\"hi!\"");
        attribute2.setValue("#root");
        java.lang.String str7 = attribute2.getKey();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = element10.html("");
        org.jsoup.nodes.Element element15 = element10.attr("#root", "hi!");
        java.lang.String str16 = element15.className();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        boolean boolean3 = tokenQueue1.matchChomp("org.jsoup.select.selector$selectorparseexception:");
        java.lang.String str4 = tokenQueue1.consumeCssIdentifier();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = document1.nodeName();
        org.jsoup.nodes.Element element6 = document1.appendElement("#document#document");
        org.jsoup.nodes.Element element7 = element6.firstElementSibling();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNull(element7);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        boolean boolean16 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements20 = document18.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements22 = elements20.prepend("");
        org.jsoup.select.Elements elements24 = elements22.removeAttr("");
        org.jsoup.nodes.Document document26 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements28 = document26.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements30 = elements28.prepend("");
        org.jsoup.select.Elements elements32 = elements30.removeAttr("");
        boolean boolean33 = elements22.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements30);
        org.jsoup.select.Elements elements35 = elements30.wrap("#root");
        boolean boolean36 = elements13.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements35);
        org.jsoup.select.Elements elements38 = elements13.removeClass("");
        org.jsoup.nodes.Element element39 = elements38.last();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNull(element39);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        int int1 = attributes0.size();
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements5 = document3.getElementsByAttribute("hi!");
        java.lang.String str6 = elements5.val();
        java.lang.Object obj7 = null;
        int int8 = elements5.lastIndexOf(obj7);
        org.jsoup.select.Elements elements10 = elements5.eq((int) '#');
        boolean boolean11 = attributes0.equals((java.lang.Object) elements10);
        boolean boolean13 = elements10.hasClass("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        boolean boolean15 = elements10.hasAttr("#declaration");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        boolean boolean3 = document1.hasText();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        boolean boolean6 = document5.hasText();
        java.lang.String str7 = document5.nodeName();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        org.jsoup.nodes.Element element12 = document5.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element13 = document1.classNames((java.util.Set<java.lang.String>) strSet10);
        java.lang.String str14 = element13.html();
        java.lang.Class<?> wildcardClass15 = element13.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        int int1 = attributes0.size();
        boolean boolean3 = attributes0.hasKey("");
        java.lang.String str4 = attributes0.toString();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        boolean boolean7 = document6.hasText();
        java.lang.String str8 = document6.nodeName();
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        org.jsoup.nodes.Element element13 = document6.classNames((java.util.Set<java.lang.String>) strSet11);
        org.jsoup.nodes.Element element15 = document6.append("#document");
        org.jsoup.nodes.Element element17 = document6.prepend("#document");
        org.jsoup.nodes.Attributes attributes18 = element17.attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator19 = attributes18.spliterator();
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        int int21 = attributes20.size();
        java.lang.String str22 = attributes20.html();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor23 = attributes20.iterator();
        boolean boolean24 = attributes18.equals((java.lang.Object) attributes20);
        org.jsoup.nodes.Attribute attribute27 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute27.setKey("#root");
        java.lang.String str30 = attribute27.html();
        attribute27.setKey("#data");
        org.jsoup.nodes.Document document34 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements36 = document34.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements38 = elements36.prepend("");
        org.jsoup.select.Elements elements40 = elements38.removeAttr("");
        org.jsoup.nodes.Document document42 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements44 = document42.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements46 = elements44.prepend("");
        org.jsoup.select.Elements elements48 = elements46.removeAttr("");
        boolean boolean49 = elements38.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements46);
        java.lang.Object[] objArray50 = elements38.toArray();
        org.jsoup.nodes.Document document52 = new org.jsoup.nodes.Document("");
        boolean boolean53 = document52.hasText();
        java.lang.String str54 = document52.nodeName();
        java.lang.String str55 = document52.val();
        boolean boolean56 = elements38.add((org.jsoup.nodes.Element) document52);
        boolean boolean57 = attribute27.equals((java.lang.Object) boolean56);
        boolean boolean58 = attributes18.equals((java.lang.Object) boolean57);
        attributes0.addAll(attributes18);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#document" + "'", str8, "#document");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(attributeSpliterator19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(attributeItor23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(attribute27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#root=\"hi!\"" + "'", str30, "#root=\"hi!\"");
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "#document" + "'", str54, "#document");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.Jsoup.clean("org.jsoup.select.selector$selectorparseexception:", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = document1.nodeName();
        org.jsoup.nodes.Element element6 = document1.appendElement("#document#document");
        org.jsoup.nodes.Element element8 = document1.prepend("hi!=\"#root=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.select.Elements elements9 = elements7.prepend("<?#document#document>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#document", "");
        org.jsoup.nodes.Element element4 = document2.addClass("hi!");
        org.jsoup.nodes.Element element5 = document2.body();
        org.jsoup.nodes.Element element6 = document2.body();
        boolean boolean7 = element6.isBlock();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document2 = document1.normalise();
        org.jsoup.nodes.Element element3 = document1.head();
        java.lang.String str4 = element3.id();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#document#document", "\n<!--#document-->", false);
        java.lang.String str4 = xmlDeclaration3.toString();
        java.lang.String str5 = xmlDeclaration3.getWholeDeclaration();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<?#document#document>" + "'", str4, "<?#document#document>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document#document" + "'", str5, "#document#document");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document");
        boolean boolean3 = tokenQueue1.matches("\n<!--#root-->");
        boolean boolean5 = tokenQueue1.matchChomp("#data");
        boolean boolean7 = tokenQueue1.matchChomp("#document#document");
        boolean boolean8 = tokenQueue1.matchesWord();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean2 = tag1.isData();
        boolean boolean3 = tag1.requiresSpecificParent();
        boolean boolean4 = tag1.isBlock();
        org.jsoup.parser.Tag tag6 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean7 = tag6.isData();
        boolean boolean8 = tag6.requiresSpecificParent();
        boolean boolean9 = tag6.isBlock();
        boolean boolean10 = tag1.canContain(tag6);
        boolean boolean11 = tag1.isBlock();
        boolean boolean12 = tag1.isData();
        java.lang.String str13 = tag1.toString();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str13, "org.jsoup.select.selector$selectorparseexception:");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = element10.html("");
        org.jsoup.nodes.Element element15 = element10.attr("#root", "hi!");
        org.jsoup.nodes.Element element16 = element10.parent();
        org.jsoup.nodes.Element element18 = element10.prependText("<?#document#document>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.outerHtml();
        java.lang.String str5 = elements3.val();
        org.jsoup.select.Elements elements6 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements3);
        org.jsoup.select.Elements elements8 = elements3.removeAttr("#document#document");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = element10.html("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            element12.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document2 = document1.normalise();
        org.jsoup.nodes.Element element3 = document1.head();
        org.jsoup.nodes.Element element5 = element3.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean7 = element3.hasClass("#text");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        int int1 = attributes0.size();
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("");
        boolean boolean4 = document3.hasText();
        java.lang.String str5 = document3.nodeName();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        org.jsoup.nodes.Element element10 = document3.classNames((java.util.Set<java.lang.String>) strSet8);
        org.jsoup.nodes.Element element12 = document3.append("#document");
        org.jsoup.nodes.Element element14 = document3.prepend("#document");
        org.jsoup.nodes.Attributes attributes15 = element14.attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator16 = attributes15.spliterator();
        org.jsoup.nodes.Attributes attributes17 = new org.jsoup.nodes.Attributes();
        int int18 = attributes17.size();
        java.lang.String str19 = attributes17.html();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor20 = attributes17.iterator();
        boolean boolean21 = attributes15.equals((java.lang.Object) attributes17);
        attributes0.addAll(attributes15);
        org.jsoup.nodes.Attributes attributes23 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes15.addAll(attributes23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(attributeSpliterator16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(attributeItor20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.select.Elements elements9 = elements7.removeAttr("hi!");
        java.lang.String str10 = elements7.outerHtml();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse(uRL0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.select.Elements elements9 = elements5.addClass("#document#documenthi!");
        org.jsoup.select.Elements elements10 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements5);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element6 = element5.empty();
        org.jsoup.select.Elements elements8 = element5.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements10 = elements8.removeClass("#root");
        org.jsoup.select.Elements elements12 = elements8.append("");
        boolean boolean14 = elements8.hasAttr("#document#document");
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        boolean boolean17 = document16.hasText();
        java.lang.String str18 = document16.nodeName();
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        org.jsoup.nodes.Element element23 = document16.classNames((java.util.Set<java.lang.String>) strSet21);
        org.jsoup.nodes.Element element25 = document16.append("#document");
        org.jsoup.nodes.Element element27 = element25.html("");
        org.jsoup.select.Elements elements30 = element25.getElementsByAttributeValueNot("#root", "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements32 = element25.getElementsByClass("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        int int33 = elements8.lastIndexOf((java.lang.Object) elements32);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#document" + "'", str18, "#document");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.addClass("#document");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        boolean boolean13 = document12.hasText();
        boolean boolean14 = document12.hasText();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        boolean boolean17 = document16.hasText();
        java.lang.String str18 = document16.nodeName();
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        org.jsoup.nodes.Element element23 = document16.classNames((java.util.Set<java.lang.String>) strSet21);
        org.jsoup.nodes.Element element24 = document12.classNames((java.util.Set<java.lang.String>) strSet21);
        java.util.Set<java.lang.String> strSet25 = document12.classNames();
        org.jsoup.nodes.Element element26 = element8.classNames(strSet25);
        org.jsoup.nodes.Element element27 = element8.empty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#document" + "'", str18, "#document");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element27);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "\n<!--#root-->");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#root=\"hi!\"");
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("\n<!--#root-->");
        java.lang.String str10 = textNode9.toString();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n&lt;!--#root--&gt;" + "'", str10, "\n&lt;!--#root--&gt;");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element6 = element5.empty();
        org.jsoup.select.Elements elements8 = element5.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements10 = elements8.html("#document");
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor11 = elements10.listIterator();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elementItor11);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse(file0, "<?#document#document>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        boolean boolean3 = document1.hasClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element5 = document2.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str6 = document2.tagName();
        java.lang.String str7 = document2.text();
        boolean boolean8 = document2.isBlock();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document2.childNodes();
        org.jsoup.nodes.Element element11 = document2.getElementById("hi!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#root" + "'", str7, "#root");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(element11);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.jsoup.nodes.DataNode dataNode2 = org.jsoup.nodes.DataNode.createFromEncoded("#document", "#document");
        java.lang.String str3 = dataNode2.toString();
        org.junit.Assert.assertNotNull(dataNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean("", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element5 = document2.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document2.child((int) (byte) 0);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = element10.html("");
        org.jsoup.nodes.Element element15 = element12.attr("org.jsoup.select.Selector$SelectorParseException: ", "#root");
        java.lang.String str16 = element12.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.select.Elements elements7 = element5.getElementsByAttribute("hi!");
        java.lang.String str8 = elements7.val();
        boolean boolean9 = elements7.hasText();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.select.Elements elements9 = elements7.removeAttr("hi!");
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements14 = document11.getElementsByAttributeValue("hi!", "hi!");
        document11.title("[]");
        org.jsoup.nodes.Element element18 = document11.prependText("#document#document");
        boolean boolean19 = elements9.add(element18);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.outerHtml();
        java.lang.String str5 = elements3.val();
        org.jsoup.select.Elements elements6 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements3);
        java.lang.String str8 = elements3.attr("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements10 = elements3.append("");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        java.lang.String str5 = document1.id();
        org.jsoup.nodes.Element element7 = document1.append("hi!=\"#root=&quot;hi!&quot;\"");
        java.lang.String str8 = document1.data();
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        boolean boolean3 = document1.hasText();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        boolean boolean6 = document5.hasText();
        java.lang.String str7 = document5.nodeName();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        org.jsoup.nodes.Element element12 = document5.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element13 = document1.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element15 = document1.appendText("hi!");
        org.jsoup.parser.Tag tag16 = document1.tag();
        org.jsoup.nodes.Element element17 = document1.head();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNull(element17);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        boolean boolean16 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        org.jsoup.select.Elements elements18 = elements5.prepend("hi!");
        org.jsoup.select.Elements elements20 = elements5.wrap("#document#documenthi!");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = document1.prepend("#document");
        org.jsoup.nodes.Attributes attributes13 = element12.attributes();
        java.lang.String str14 = element12.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#document#document" + "'", str14, "#document#document");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValue("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        org.jsoup.nodes.Element element6 = document1.head();
        org.jsoup.select.Elements elements7 = element6.getAllElements();
        org.jsoup.select.Elements elements8 = element6.getAllElements();
        org.jsoup.select.Elements elements10 = elements8.val(" class=\"hi!\"");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.jsoup.nodes.DataNode dataNode2 = new org.jsoup.nodes.DataNode("\n<!--#root-->", "hi!");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.val();
        java.lang.Object obj5 = null;
        int int6 = elements3.lastIndexOf(obj5);
        org.jsoup.select.Elements elements8 = elements3.eq((int) '#');
        boolean boolean10 = elements3.hasAttr("#root");
        int int12 = elements3.indexOf((java.lang.Object) (byte) 100);
        org.jsoup.select.Elements elements14 = elements3.addClass("");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = document1.nodeName();
        java.lang.String str5 = document1.outerHtml();
        boolean boolean7 = document1.hasAttr("#document#document");
        org.jsoup.nodes.Element element9 = document1.val("[#, d, o, c, u, m, e, n, t]");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document");
        java.lang.String str2 = tokenQueue1.consumeAttributeKey();
        java.lang.String str4 = tokenQueue1.consumeTo("#root=\"hi!\"");
        boolean boolean5 = tokenQueue1.matchesWhitespace();
        org.jsoup.parser.TokenQueue tokenQueue7 = new org.jsoup.parser.TokenQueue("");
        boolean boolean9 = tokenQueue7.matchChomp("org.jsoup.select.selector$selectorparseexception:");
        java.lang.String str10 = tokenQueue7.consumeWord();
        org.jsoup.parser.TokenQueue tokenQueue12 = new org.jsoup.parser.TokenQueue("");
        boolean boolean13 = tokenQueue12.isEmpty();
        java.lang.String[] strArray17 = new java.lang.String[] { " class=\"hi!\"", "#data", "[]" };
        java.lang.String str18 = tokenQueue12.consumeToAny(strArray17);
        java.lang.String str19 = tokenQueue7.consumeToAny(strArray17);
        boolean boolean20 = tokenQueue1.matchesAny(strArray17);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("org.jsoup.select.selector$selectorparseexception:");
        java.lang.String str4 = elements3.text();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("\n<!--#root-->");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.select.Elements elements9 = elements7.removeAttr("hi!");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements13 = document11.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements15 = elements13.prepend("");
        org.jsoup.select.Elements elements17 = elements15.removeAttr("");
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements21 = document19.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements23 = elements21.prepend("");
        org.jsoup.select.Elements elements25 = elements23.removeAttr("");
        boolean boolean26 = elements15.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements23);
        org.jsoup.nodes.Document document28 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements30 = document28.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements32 = elements30.prepend("");
        org.jsoup.select.Elements elements34 = elements32.removeAttr("");
        org.jsoup.nodes.Document document36 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements38 = document36.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements40 = elements38.prepend("");
        org.jsoup.select.Elements elements42 = elements40.removeAttr("");
        boolean boolean43 = elements32.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements40);
        org.jsoup.select.Elements elements45 = elements40.wrap("#root");
        boolean boolean46 = elements23.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements45);
        boolean boolean47 = elements9.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements45);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element49 = elements45.get((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document");
        boolean boolean3 = tokenQueue1.matches("\n<!--#root-->");
        boolean boolean5 = tokenQueue1.matchChomp("#data");
        java.lang.String str6 = tokenQueue1.toString();
        java.lang.String str7 = tokenQueue1.remainder();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[#, d, o, c, u, m, e, n, t]" + "'", str6, "[#, d, o, c, u, m, e, n, t]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element6 = element5.empty();
        org.jsoup.select.Elements elements8 = element5.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements10 = elements8.removeClass("#root");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        boolean boolean13 = document12.hasText();
        java.lang.String str14 = document12.nodeName();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.jsoup.nodes.Element element19 = document12.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.nodes.Element element21 = document12.append("#document");
        org.jsoup.nodes.Element element23 = document12.prepend("#document");
        org.jsoup.nodes.Attributes attributes24 = element23.attributes();
        org.jsoup.nodes.Element element26 = element23.append("hi!");
        org.jsoup.select.Elements elements28 = element26.getElementsByIndexLessThan((int) (short) 0);
        boolean boolean29 = elements8.equals((java.lang.Object) elements28);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor31 = elements28.listIterator(0);
        org.jsoup.select.Elements elements33 = elements28.append("");
        org.jsoup.select.Elements elements35 = elements28.html(" class=\"hi!\"");
        boolean boolean36 = elements28.hasText();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#document" + "'", str14, "#document");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(elementItor31);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        org.jsoup.nodes.Element element4 = document1.createElement("#text");
        java.lang.String str5 = document1.outerHtml();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = elements3.attr("#root");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element[] elementArray8 = new org.jsoup.nodes.Element[] { document7 };
        java.util.ArrayList<org.jsoup.nodes.Element> elementList9 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList9, elementArray8);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator11 = elementList9.spliterator();
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator12 = elementList9.spliterator();
        boolean boolean13 = elements3.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elementList9);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor14 = elements3.listIterator();
        java.lang.String str15 = elements3.val();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elementArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(elementSpliterator11);
        org.junit.Assert.assertNotNull(elementSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(elementItor14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        tokenQueue1.addFirst((java.lang.Character) '#');
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document2 = document1.normalise();
        org.jsoup.nodes.Element element3 = document1.head();
        org.jsoup.nodes.Element element5 = element3.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean7 = element5.equals((java.lang.Object) "#root=\"hi!\"");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        boolean boolean10 = document9.hasText();
        java.lang.String str11 = document9.nodeName();
        java.lang.String str12 = document9.val();
        java.lang.String str13 = document9.outerHtml();
        java.lang.String[] strArray16 = new java.lang.String[] { "\n<!--#document-->", "#data" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.jsoup.nodes.Element element19 = document9.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.nodes.Element element20 = element5.classNames((java.util.Set<java.lang.String>) strSet17);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#document" + "'", str11, "#document");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.select.Elements elements7 = element5.getElementsByAttribute("hi!");
        java.lang.String str8 = elements7.val();
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        boolean boolean12 = document11.hasText();
        boolean boolean13 = document11.hasText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = elements7.set(0, (org.jsoup.nodes.Element) document11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("hi!=\"#root=&quot;hi!&quot;\"", "");
        org.jsoup.nodes.Element element4 = document2.createElement("a");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        java.lang.String str5 = document1.id();
        boolean boolean7 = document1.hasAttr("#root");
        java.lang.String str8 = document1.baseUri();
        boolean boolean10 = document1.hasAttr("");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element6 = element5.empty();
        org.jsoup.select.Elements elements8 = element5.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements10 = elements8.removeClass("#root");
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("", "");
        int int14 = elements8.lastIndexOf((java.lang.Object) "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.val();
        java.lang.Object obj5 = null;
        int int6 = elements3.lastIndexOf(obj5);
        org.jsoup.select.Elements elements8 = elements3.eq((int) '#');
        boolean boolean10 = elements3.hasAttr("#root");
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str15 = document14.outerHtml();
        org.jsoup.nodes.Element element17 = document14.append("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.select.Elements elements19 = document14.getElementsByIndexEquals(1);
        org.jsoup.nodes.Element element20 = document14.body();
        // The following exception was thrown during execution in test generation
        try {
            elements3.add((int) (byte) -1, element20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str15, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        boolean boolean3 = document1.hasText();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        boolean boolean6 = document5.hasText();
        java.lang.String str7 = document5.nodeName();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        org.jsoup.nodes.Element element12 = document5.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element13 = document1.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element15 = document1.appendText("hi!");
        org.jsoup.parser.Tag tag16 = document1.tag();
        boolean boolean17 = tag16.requiresSpecificParent();
        org.jsoup.parser.Tag tag18 = tag16.getImplicitParent();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element(tag16, "<?#document#document>");
        boolean boolean21 = element20.hasText();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        boolean boolean16 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements20 = document18.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements22 = elements20.prepend("");
        org.jsoup.select.Elements elements24 = elements22.removeAttr("");
        org.jsoup.nodes.Document document26 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements28 = document26.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements30 = elements28.prepend("");
        org.jsoup.select.Elements elements32 = elements30.removeAttr("");
        boolean boolean33 = elements22.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements30);
        org.jsoup.select.Elements elements35 = elements30.wrap("#root");
        boolean boolean36 = elements13.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements35);
        org.jsoup.select.Elements elements38 = elements13.val("#root=\"hi!\"");
        org.jsoup.select.Elements elements40 = elements38.append("#text");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean42 = elements38.is("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(elements40);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.select.Elements elements9 = elements7.removeAttr("hi!");
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element15 = document12.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str16 = document12.tagName();
        java.lang.String str17 = document12.toString();
        org.jsoup.nodes.Node node19 = document12.removeAttr("[#, d, o, c, u, m, e, n, t]");
        boolean boolean20 = elements7.equals((java.lang.Object) "[#, d, o, c, u, m, e, n, t]");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#root" + "'", str16, "#root");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str17, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element7 = document1.createElement("#data");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = element7.getElementsByAttributeValueNot("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValue("hi!", "hi!");
        org.jsoup.nodes.Element element6 = document1.text("<?#document#document>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#document#documentdocument", "");
        org.junit.Assert.assertNotNull(textNode2);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.outerHtml();
        java.lang.String str5 = elements3.val();
        org.jsoup.select.Elements elements6 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements3);
        org.jsoup.select.Elements elements7 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements3);
        org.jsoup.select.Elements elements9 = elements7.addClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueNot("org.jsoup.select.selector$selectorparseexception:", "hi!");
        org.jsoup.select.Elements elements10 = elements8.html("#document#documentdocument");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        boolean boolean16 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        java.lang.Object[] objArray17 = elements5.toArray();
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        boolean boolean20 = document19.hasText();
        java.lang.String str21 = document19.nodeName();
        java.lang.String str22 = document19.val();
        boolean boolean23 = elements5.add((org.jsoup.nodes.Element) document19);
        org.jsoup.nodes.Element element25 = document19.appendText("#document#documenthi!");
        org.jsoup.select.Elements elements27 = element25.getElementsByClass("#data");
        org.jsoup.select.Selector.SelectorParseException selectorParseException29 = new org.jsoup.select.Selector.SelectorParseException("#data");
        boolean boolean30 = element25.equals((java.lang.Object) "#data");
        org.jsoup.nodes.Element element32 = element25.getElementById("#document#document");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#document" + "'", str21, "#document");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(element32);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.val("a");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = document2.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Element element5 = document2.append("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.select.Elements elements7 = document2.getElementsByIndexEquals(1);
        boolean boolean9 = elements7.contains((java.lang.Object) "#comment");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.addClass("#document");
        java.lang.String str11 = element10.html();
        org.jsoup.nodes.Element element13 = element10.appendElement("#document");
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        boolean boolean16 = document15.hasText();
        java.lang.String str17 = document15.nodeName();
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        org.jsoup.nodes.Element element22 = document15.classNames((java.util.Set<java.lang.String>) strSet20);
        org.jsoup.nodes.Element element24 = document15.append("#document");
        org.jsoup.nodes.Element element26 = document15.prepend("#document");
        org.jsoup.nodes.Element element28 = element26.wrap("#document");
        java.lang.String str29 = element26.baseUri();
        org.jsoup.nodes.Element element30 = element10.prependChild((org.jsoup.nodes.Node) element26);
        org.jsoup.select.Elements elements32 = element30.getElementsByAttribute("a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#document" + "'", str17, "#document");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(elements32);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("#root", "hi!");
        attribute2.setValue("hi!=\"#root=&quot;hi!&quot;\"");
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = element10.html("");
        org.jsoup.select.Elements elements15 = element10.getElementsByAttributeValueNot("#root", "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements17 = element10.getElementsByClass("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor18 = elements17.listIterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elementItor18);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#data", "#root");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        boolean boolean3 = document1.hasText();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        boolean boolean6 = document5.hasText();
        java.lang.String str7 = document5.nodeName();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        org.jsoup.nodes.Element element12 = document5.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element13 = document1.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element15 = document1.appendText("hi!");
        org.jsoup.nodes.Element element16 = document1.head();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNull(element16);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.addClass("#document");
        java.lang.String str11 = element10.html();
        org.jsoup.nodes.Element element13 = element10.appendElement("#document");
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        boolean boolean16 = document15.hasText();
        java.lang.String str17 = document15.nodeName();
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        org.jsoup.nodes.Element element22 = document15.classNames((java.util.Set<java.lang.String>) strSet20);
        org.jsoup.nodes.Element element24 = document15.append("#document");
        org.jsoup.nodes.Element element26 = document15.prepend("#document");
        org.jsoup.nodes.Element element28 = element26.wrap("#document");
        java.lang.String str29 = element26.baseUri();
        org.jsoup.nodes.Element element30 = element10.prependChild((org.jsoup.nodes.Node) element26);
        java.lang.String str31 = element26.outerHtml();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#document" + "'", str17, "#document");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#document#document" + "'", str31, "#document#document");
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document2 = document1.normalise();
        org.jsoup.nodes.Element element3 = document2.head();
        org.jsoup.nodes.Element element6 = document2.attr("org.jsoup.select.Selector$SelectorParseException: ", "[]");
        java.lang.String str7 = document2.outerHtml();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str7, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document4 = document3.normalise();
        org.jsoup.nodes.Element element5 = document3.head();
        org.jsoup.nodes.Element element7 = element5.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element9 = element5.wrap("#text");
        boolean boolean10 = tag1.equals((java.lang.Object) element9);
        boolean boolean11 = tag1.isBlock();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        java.lang.String str5 = document1.id();
        org.jsoup.select.Elements elements6 = document1.children();
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        org.jsoup.select.Elements elements6 = element4.getElementsByTag("\n<!--#root-->");
        int int7 = elements6.size();
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValue("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        org.jsoup.nodes.Element element6 = document1.head();
        java.lang.String str7 = document1.title();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element5 = document2.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str6 = document2.tagName();
        org.jsoup.nodes.Element element7 = document2.empty();
        org.jsoup.select.Elements elements8 = element7.children();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        boolean boolean11 = document10.hasText();
        java.lang.String str12 = document10.nodeName();
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        org.jsoup.nodes.Element element17 = document10.classNames((java.util.Set<java.lang.String>) strSet15);
        org.jsoup.nodes.Element element19 = document10.append("");
        org.jsoup.nodes.Element element21 = element19.addClass("#document#document");
        boolean boolean22 = elements8.add(element21);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        org.jsoup.parser.Tag tag2 = org.jsoup.parser.Tag.valueOf("#root");
        boolean boolean3 = tag2.isInline();
        boolean boolean4 = tag2.isInline();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        boolean boolean7 = document6.hasText();
        java.lang.String str8 = document6.nodeName();
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        org.jsoup.nodes.Element element13 = document6.classNames((java.util.Set<java.lang.String>) strSet11);
        org.jsoup.nodes.Element element15 = element13.addClass("#document");
        org.jsoup.nodes.Document document17 = new org.jsoup.nodes.Document("");
        boolean boolean18 = document17.hasText();
        boolean boolean19 = document17.hasText();
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        boolean boolean22 = document21.hasText();
        java.lang.String str23 = document21.nodeName();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        org.jsoup.nodes.Element element28 = document21.classNames((java.util.Set<java.lang.String>) strSet26);
        org.jsoup.nodes.Element element29 = document17.classNames((java.util.Set<java.lang.String>) strSet26);
        java.util.Set<java.lang.String> strSet30 = document17.classNames();
        org.jsoup.nodes.Element element31 = element13.classNames(strSet30);
        boolean boolean32 = tag2.equals((java.lang.Object) element13);
        org.jsoup.select.Elements elements33 = org.jsoup.select.Selector.select("body", element13);
        org.jsoup.select.Elements elements35 = elements33.removeClass("");
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#document" + "'", str8, "#document");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#document" + "'", str23, "#document");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(elements35);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document2 = document1.normalise();
        org.jsoup.nodes.Element element3 = document1.head();
        java.lang.String str4 = document1.val();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        org.jsoup.select.Elements elements6 = element4.getElementsByTag("\n<!--#root-->");
        boolean boolean8 = elements6.hasAttr("\n<!--#root-->");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#document");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        boolean boolean16 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        org.jsoup.select.Elements elements18 = elements13.wrap("#root");
        org.jsoup.select.Elements elements19 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements18);
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements23 = document21.getElementsByAttribute("hi!");
        java.lang.String str25 = elements23.attr("#root");
        java.lang.String str26 = elements23.text();
        org.jsoup.select.Elements elements28 = elements23.eq((int) (short) 10);
        boolean boolean29 = elements19.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements23);
        org.jsoup.select.Elements elements31 = elements19.html("#root");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(elements31);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "\n<!--#root-->");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#root=\"hi!\"");
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#data");
        java.lang.String str10 = textNode2.getWholeText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = textNode2.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#data" + "'", str10, "#data");
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.addClass("#document");
        java.lang.String str11 = element10.html();
        org.jsoup.nodes.Element element13 = element10.appendElement("#document");
        java.lang.String str14 = element13.html();
        java.lang.String str15 = element13.text();
        org.jsoup.select.Elements elements17 = element13.getElementsByAttribute("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements19 = element13.getElementsByIndexEquals((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#document#document", "#data");
        org.jsoup.nodes.Element element4 = document2.toggleClass("#document#document");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#document#documenthi!", "#comment");
        java.lang.String str3 = textNode2.text();
        boolean boolean4 = textNode2.isBlank();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document#documenthi!" + "'", str3, "#document#documenthi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        java.lang.String str11 = element10.html();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#document" + "'", str11, "#document");
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean2 = tag1.isData();
        boolean boolean3 = tag1.requiresSpecificParent();
        boolean boolean4 = tag1.isBlock();
        org.jsoup.parser.Tag tag6 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean7 = tag6.isData();
        boolean boolean8 = tag6.requiresSpecificParent();
        boolean boolean9 = tag6.isBlock();
        boolean boolean10 = tag1.canContain(tag6);
        boolean boolean11 = tag1.isBlock();
        boolean boolean12 = tag1.isData();
        boolean boolean13 = tag1.isBlock();
        java.lang.String str14 = tag1.getName();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str14, "org.jsoup.select.selector$selectorparseexception:");
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = document1.prepend("#document");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = element12.childNodes();
        org.jsoup.select.Elements elements14 = element12.children();
        org.jsoup.nodes.Element element16 = element12.prependElement("#comment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.addClass("#document");
        java.lang.String str11 = element10.html();
        org.jsoup.nodes.Element element13 = element10.appendElement("#document");
        java.lang.String str14 = element13.html();
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str18 = document17.outerHtml();
        org.jsoup.nodes.Element element20 = document17.createElement("#document#documenthi!");
        org.jsoup.nodes.Element element21 = element13.prependChild((org.jsoup.nodes.Node) element20);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements23 = element20.getElementsByTag("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str18, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        org.jsoup.nodes.Document document2 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document2.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements6 = elements4.prepend("");
        org.jsoup.select.Elements elements8 = elements6.removeAttr("");
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements12 = document10.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements14 = elements12.prepend("");
        org.jsoup.select.Elements elements16 = elements14.removeAttr("");
        boolean boolean17 = elements6.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements14);
        java.lang.Object[] objArray18 = elements6.toArray();
        org.jsoup.select.Elements elements20 = elements6.select("#document#document");
        org.jsoup.select.Elements elements21 = org.jsoup.select.Selector.select("hi!", (java.lang.Iterable<org.jsoup.nodes.Element>) elements6);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "\n<!--#root-->");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#root=\"hi!\"");
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#data");
        java.lang.String str10 = textNode2.nodeName();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#text" + "'", str10, "#text");
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        boolean boolean16 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements20 = document18.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements22 = elements20.prepend("");
        org.jsoup.select.Elements elements24 = elements22.removeAttr("");
        org.jsoup.nodes.Document document26 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements28 = document26.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements30 = elements28.prepend("");
        org.jsoup.select.Elements elements32 = elements30.removeAttr("");
        boolean boolean33 = elements22.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements30);
        org.jsoup.select.Elements elements35 = elements30.wrap("#root");
        boolean boolean36 = elements13.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements35);
        org.jsoup.select.Elements elements38 = elements13.val("#root=\"hi!\"");
        org.jsoup.select.Elements elements40 = elements13.wrap("[#, d, o, c, u, m, e, n, t]");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(elements40);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document4 = document3.normalise();
        org.jsoup.nodes.Element element5 = document3.head();
        org.jsoup.nodes.Element element7 = element5.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element9 = element5.wrap("#text");
        boolean boolean10 = tag1.equals((java.lang.Object) element9);
        boolean boolean11 = tag1.isEmpty();
        boolean boolean12 = tag1.preserveWhitespace();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str2 = tag1.getName();
        boolean boolean3 = tag1.isInline();
        boolean boolean4 = tag1.isEmpty();
        org.jsoup.parser.Tag tag6 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str7 = tag6.getName();
        boolean boolean8 = tag6.isInline();
        boolean boolean9 = tag6.isEmpty();
        boolean boolean10 = tag6.isEmpty();
        boolean boolean11 = tag1.isValidAncestor(tag6);
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str2, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str7, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#document#documentdocument", "#document#document=\"#document#document\"", false);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.select.Elements elements7 = element5.getElementsByAttribute("hi!");
        int int8 = elements7.size();
        org.jsoup.select.Elements elements10 = elements7.toggleClass("#document#document=\"#document#document\"");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        boolean boolean3 = document1.hasText();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        boolean boolean6 = document5.hasText();
        java.lang.String str7 = document5.nodeName();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        org.jsoup.nodes.Element element12 = document5.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element13 = document1.classNames((java.util.Set<java.lang.String>) strSet10);
        java.util.Set<java.lang.String> strSet14 = document1.classNames();
        org.jsoup.nodes.Element element16 = document1.getElementById("#document#document");
        java.lang.String str17 = document1.id();
        java.lang.String str18 = document1.nodeName();
        java.lang.String str20 = document1.attr("[]");
        org.jsoup.nodes.Element element22 = document1.prependText("#document");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#document" + "'", str18, "#document");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(element22);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element5 = document2.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str6 = document2.tagName();
        org.jsoup.nodes.Element element7 = document2.empty();
        org.jsoup.select.Elements elements8 = element7.children();
        // The following exception was thrown during execution in test generation
        try {
            element7.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.addClass("#document");
        java.lang.String str11 = element10.html();
        org.jsoup.nodes.Element element13 = element10.appendElement("#document");
        java.lang.String str14 = element13.html();
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str18 = document17.outerHtml();
        org.jsoup.nodes.Element element20 = document17.createElement("#document#documenthi!");
        org.jsoup.nodes.Element element21 = element13.prependChild((org.jsoup.nodes.Node) element20);
        org.jsoup.nodes.Element element22 = element13.previousElementSibling();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str18, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNull(element22);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.Jsoup.isValid("", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#root", "");
        comment2.setBaseUri("#document#documenthi!");
        java.lang.String str5 = comment2.getData();
        java.lang.String str6 = comment2.nodeName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#comment" + "'", str6, "#comment");
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = document1.prepend("#document");
        org.jsoup.nodes.Attributes attributes13 = element12.attributes();
        org.jsoup.nodes.Element element15 = element12.append("hi!");
        org.jsoup.nodes.Element element17 = element15.appendText("#root=\"hi!\"");
        org.jsoup.select.Elements elements19 = element17.getElementsByIndexLessThan((-1));
        org.jsoup.select.Elements elements22 = element17.getElementsByAttributeValueStarting("hi!", "#comment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#document", "");
        org.jsoup.nodes.Element element4 = document2.addClass("hi!");
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements8 = document6.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements10 = elements8.prepend("");
        org.jsoup.select.Elements elements12 = elements10.removeAttr("");
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements16 = document14.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements18 = elements16.prepend("");
        org.jsoup.select.Elements elements20 = elements18.removeAttr("");
        boolean boolean21 = elements10.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements18);
        java.lang.Object[] objArray22 = elements10.toArray();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        boolean boolean25 = document24.hasText();
        java.lang.String str26 = document24.nodeName();
        java.lang.String str27 = document24.val();
        boolean boolean28 = elements10.add((org.jsoup.nodes.Element) document24);
        org.jsoup.nodes.Element element31 = document24.attr("[#, d, o, c, u, m, e, n, t]", "#text");
        // The following exception was thrown during execution in test generation
        try {
            document2.replaceWith((org.jsoup.nodes.Node) document24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#document" + "'", str26, "#document");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(element31);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("org.jsoup.select.selector$selectorparseexception:", "");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        org.jsoup.select.Elements elements4 = document1.children();
        org.jsoup.nodes.Element element6 = document1.prependElement("[#, d, o, c, u, m, e, n, t]");
        java.lang.String str8 = element6.absUrl("#document#documentdocument");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValue("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        org.jsoup.nodes.Element element6 = document1.head();
        org.jsoup.select.Elements elements7 = element6.getAllElements();
        org.jsoup.nodes.DataNode dataNode10 = org.jsoup.nodes.DataNode.createFromEncoded("#document", "#document");
        java.lang.String str11 = dataNode10.nodeName();
        boolean boolean12 = elements7.remove((java.lang.Object) dataNode10);
        java.lang.String str13 = dataNode10.toString();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(dataNode10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#data" + "'", str11, "#data");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#document" + "'", str13, "#document");
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#data", "body");
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = element10.html("");
        org.jsoup.select.Elements elements15 = element10.getElementsByAttributeValueNot("#root", "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements17 = element10.getElementsByClass("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.nodes.Element element19 = element10.prependText("[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        org.jsoup.nodes.Document document2 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document2.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements6 = elements4.prepend("");
        org.jsoup.select.Elements elements8 = elements6.removeAttr("");
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements12 = document10.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements14 = elements12.prepend("");
        org.jsoup.select.Elements elements16 = elements14.removeAttr("");
        boolean boolean17 = elements6.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements14);
        org.jsoup.select.Elements elements19 = elements14.wrap("#root");
        org.jsoup.select.Elements elements20 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements19);
        org.jsoup.nodes.Document document22 = org.jsoup.nodes.Document.createShell("hi!");
        boolean boolean23 = elements20.add((org.jsoup.nodes.Element) document22);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements24 = org.jsoup.select.Selector.select("\n<!--#document-->", (java.lang.Iterable<org.jsoup.nodes.Element>) elements20);
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <!--#document-->");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = document1.createElement("<?#document#document>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValue("hi!", "hi!");
        document1.title("[]");
        org.jsoup.nodes.Element element8 = document1.prependText("#document#document");
        boolean boolean10 = document1.hasClass("body");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("#document#document", "#document#document");
        java.lang.String str3 = attribute2.html();
        java.lang.String str4 = attribute2.getKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document#document=\"#document#document\"" + "'", str3, "#document#document=\"#document#document\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document#document" + "'", str4, "#document#document");
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueNot("org.jsoup.select.selector$selectorparseexception:", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Element> elementList11 = elements8.subList((int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("#root=\"hi!\"", "body");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        boolean boolean3 = document1.hasText();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        boolean boolean6 = document5.hasText();
        java.lang.String str7 = document5.nodeName();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        org.jsoup.nodes.Element element12 = document5.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element13 = document1.classNames((java.util.Set<java.lang.String>) strSet10);
        java.util.Set<java.lang.String> strSet14 = document1.classNames();
        org.jsoup.nodes.Element element16 = document1.getElementById("#document#document");
        java.lang.String str17 = document1.id();
        org.jsoup.parser.Tag tag18 = document1.tag();
        org.jsoup.nodes.Document document21 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element24 = document21.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str25 = element24.id();
        java.util.Set<java.lang.String> strSet26 = element24.classNames();
        boolean boolean27 = tag18.equals((java.lang.Object) element24);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        org.jsoup.nodes.Element element3 = document1.html("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.nodes.Element element4 = element3.empty();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("org.jsoup.select.selector$selectorparseexception:");
        java.lang.String str4 = document1.nodeName();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Element element5 = document2.append("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.select.Elements elements7 = document2.getElementsByIndexEquals(1);
        java.lang.String str8 = document2.nodeName();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#document" + "'", str8, "#document");
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#data", "#root");
        java.lang.String str3 = textNode2.nodeName();
        boolean boolean4 = textNode2.isBlank();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = textNode2.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#text" + "'", str3, "#text");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        org.jsoup.nodes.Evaluator evaluator0 = null;
        org.jsoup.nodes.Document document2 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document2.getElementsByIndexGreaterThan((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements5 = org.jsoup.select.Collector.collect(evaluator0, (org.jsoup.nodes.Element) document2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean2 = tag1.isData();
        boolean boolean3 = tag1.requiresSpecificParent();
        boolean boolean4 = tag1.isBlock();
        org.jsoup.parser.Tag tag6 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean7 = tag6.isData();
        boolean boolean8 = tag6.requiresSpecificParent();
        boolean boolean9 = tag6.isBlock();
        boolean boolean10 = tag1.canContain(tag6);
        boolean boolean11 = tag1.isBlock();
        boolean boolean12 = tag1.isData();
        java.lang.String str13 = tag1.getName();
        boolean boolean14 = tag1.requiresSpecificParent();
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("#root");
        boolean boolean17 = tag16.isInline();
        boolean boolean18 = tag1.canContain(tag16);
        boolean boolean19 = tag1.canContainBlock();
        java.lang.Class<?> wildcardClass20 = tag1.getClass();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str13, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#document", "#root");
        java.lang.String str3 = comment2.nodeName();
        java.lang.String str4 = comment2.getData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.addClass("#document");
        java.lang.String str11 = element10.html();
        org.jsoup.nodes.Element element13 = element10.prepend("#data");
        java.lang.String str14 = element10.nodeName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#document" + "'", str14, "#document");
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#document", "");
        org.jsoup.nodes.Element element4 = document2.addClass("hi!");
        org.jsoup.nodes.Element element5 = document2.body();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        boolean boolean8 = document7.hasText();
        java.lang.String str9 = document7.nodeName();
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        org.jsoup.nodes.Element element14 = document7.classNames((java.util.Set<java.lang.String>) strSet12);
        org.jsoup.nodes.Element element16 = element14.addClass("#document");
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        boolean boolean19 = document18.hasText();
        boolean boolean20 = document18.hasText();
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("");
        boolean boolean23 = document22.hasText();
        java.lang.String str24 = document22.nodeName();
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        org.jsoup.nodes.Element element29 = document22.classNames((java.util.Set<java.lang.String>) strSet27);
        org.jsoup.nodes.Element element30 = document18.classNames((java.util.Set<java.lang.String>) strSet27);
        java.util.Set<java.lang.String> strSet31 = document18.classNames();
        org.jsoup.nodes.Element element32 = element14.classNames(strSet31);
        org.jsoup.nodes.Element element33 = element5.classNames(strSet31);
        org.jsoup.select.Elements elements34 = element33.getAllElements();
        org.jsoup.nodes.Element element36 = element33.append(" class=\"hi!\"");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#document" + "'", str9, "#document");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#document" + "'", str24, "#document");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(element36);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = document1.prepend("#document");
        org.jsoup.nodes.Attributes attributes13 = element12.attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator14 = attributes13.spliterator();
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        int int16 = attributes15.size();
        java.lang.String str17 = attributes15.html();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor18 = attributes15.iterator();
        boolean boolean19 = attributes13.equals((java.lang.Object) attributes15);
        java.lang.String str20 = attributes13.toString();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator21 = attributes13.spliterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(attributeSpliterator14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(attributeItor18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " class=\"hi!\"" + "'", str20, " class=\"hi!\"");
        org.junit.Assert.assertNotNull(attributeSpliterator21);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.val();
        boolean boolean6 = elements3.is("org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        org.jsoup.nodes.Document document6 = document1.normalise();
        java.lang.String str7 = document1.nodeName();
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.select.Elements elements7 = element5.getElementsByAttribute("hi!");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream8 = elements7.stream();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elementStream8);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.addClass("#document");
        org.jsoup.select.Elements elements13 = element10.getElementsByAttributeValueNot("#root", "org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str14 = elements13.html();
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        int int16 = attributes15.size();
        java.lang.String str17 = attributes15.html();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor18 = attributes15.iterator();
        boolean boolean19 = elements13.contains((java.lang.Object) attributes15);
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        int int21 = attributes20.size();
        java.lang.String str22 = attributes20.html();
        java.lang.String str23 = attributes20.html();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator24 = attributes20.spliterator();
        java.lang.String str25 = attributes20.html();
        attributes15.addAll(attributes20);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(attributeItor18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(attributeSpliterator24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = document1.prepend("#document");
        org.jsoup.nodes.Attributes attributes13 = element12.attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator14 = attributes13.spliterator();
        int int15 = attributes13.size();
        org.jsoup.nodes.Attribute attribute18 = new org.jsoup.nodes.Attribute("#document#document", "#document#document");
        java.lang.String str19 = attribute18.html();
        attributes13.put(attribute18);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(attributeSpliterator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#document#document=\"#document#document\"" + "'", str19, "#document#document=\"#document#document\"");
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#text", "#root");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute2.setKey("#root");
        java.lang.String str5 = attribute2.getKey();
        java.lang.String str6 = attribute2.html();
        java.lang.String str7 = attribute2.getValue();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root=\"hi!\"" + "'", str6, "#root=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "org.jsoup.select.selector$selectorparseexception:");
        java.lang.String str3 = document2.nodeName();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        boolean boolean8 = document7.hasText();
        boolean boolean9 = document7.hasText();
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        boolean boolean12 = document11.hasText();
        java.lang.String str13 = document11.nodeName();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = document11.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.nodes.Element element19 = document7.classNames((java.util.Set<java.lang.String>) strSet16);
        int int20 = elements3.indexOf((java.lang.Object) element19);
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements24 = document22.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements26 = elements24.prepend("");
        org.jsoup.select.Elements elements28 = elements26.removeAttr("");
        org.jsoup.nodes.Document document30 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements32 = document30.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements34 = elements32.prepend("");
        org.jsoup.select.Elements elements36 = elements34.removeAttr("");
        boolean boolean37 = elements26.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements34);
        org.jsoup.nodes.Document document39 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements41 = document39.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements43 = elements41.prepend("");
        org.jsoup.select.Elements elements45 = elements43.removeAttr("");
        org.jsoup.nodes.Document document47 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements49 = document47.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements51 = elements49.prepend("");
        org.jsoup.select.Elements elements53 = elements51.removeAttr("");
        boolean boolean54 = elements43.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements51);
        org.jsoup.select.Elements elements56 = elements51.wrap("#root");
        boolean boolean57 = elements34.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements56);
        org.jsoup.select.Elements elements58 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements34);
        boolean boolean59 = elements3.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements34);
        org.jsoup.select.Elements elements61 = elements3.removeClass("");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#document" + "'", str13, "#document");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertNotNull(elements51);
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(elements56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(elements61);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean2 = tag1.isData();
        boolean boolean3 = tag1.requiresSpecificParent();
        boolean boolean4 = tag1.isBlock();
        org.jsoup.parser.Tag tag6 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean7 = tag6.isData();
        boolean boolean8 = tag6.requiresSpecificParent();
        boolean boolean9 = tag6.isBlock();
        boolean boolean10 = tag1.canContain(tag6);
        boolean boolean11 = tag1.isEmpty();
        boolean boolean12 = tag1.isData();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        org.jsoup.nodes.Evaluator evaluator0 = null;
        org.jsoup.nodes.Element element1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements2 = org.jsoup.select.Collector.collect(evaluator0, element1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi!=\"#root=&quot;hi!&quot;\"", "#root=\"hi!\"");
        java.lang.String str3 = document2.id();
        java.lang.String str4 = document2.nodeName();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.val();
        java.lang.Object obj5 = null;
        int int6 = elements3.lastIndexOf(obj5);
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements10 = document8.getElementsByAttribute("hi!");
        java.lang.String str11 = elements10.val();
        java.lang.Object obj12 = null;
        int int13 = elements10.lastIndexOf(obj12);
        org.jsoup.select.Elements elements15 = elements10.eq((int) '#');
        boolean boolean16 = elements3.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        org.jsoup.select.Selector.SelectorParseException selectorParseException1 = new org.jsoup.select.Selector.SelectorParseException("org.jsoup.select.selector$selectorparseexception:");
        org.jsoup.select.Selector.SelectorParseException selectorParseException3 = new org.jsoup.select.Selector.SelectorParseException("org.jsoup.select.selector$selectorparseexception:");
        java.lang.Throwable[] throwableArray4 = selectorParseException3.getSuppressed();
        org.jsoup.select.Selector.SelectorParseException selectorParseException6 = new org.jsoup.select.Selector.SelectorParseException("\n<!--#document-->");
        selectorParseException3.addSuppressed((java.lang.Throwable) selectorParseException6);
        selectorParseException1.addSuppressed((java.lang.Throwable) selectorParseException6);
        java.lang.String str9 = selectorParseException6.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.jsoup.select.Selector$SelectorParseException: \n<!--#document-->" + "'", str9, "org.jsoup.select.Selector$SelectorParseException: \n<!--#document-->");
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        org.jsoup.nodes.Document document2 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document2.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements6 = elements4.prepend("");
        elements6.clear();
        int int9 = elements6.indexOf((java.lang.Object) "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements11 = elements6.removeClass("#data");
        org.jsoup.select.Elements elements12 = org.jsoup.select.Selector.select("#data", (java.lang.Iterable<org.jsoup.nodes.Element>) elements11);
        org.jsoup.nodes.Element element13 = elements12.last();
        org.jsoup.select.Elements elements15 = elements12.html("#data");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNull(element13);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        org.jsoup.select.Elements elements4 = document1.children();
        org.jsoup.select.Elements elements6 = document1.getElementsByTag("#document#documenthi!");
        org.jsoup.select.Elements elements8 = elements6.removeClass("#document#documentdocument");
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        boolean boolean11 = document10.hasText();
        boolean boolean12 = document10.hasText();
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        boolean boolean15 = document14.hasText();
        java.lang.String str16 = document14.nodeName();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        org.jsoup.nodes.Element element21 = document14.classNames((java.util.Set<java.lang.String>) strSet19);
        org.jsoup.nodes.Element element22 = document10.classNames((java.util.Set<java.lang.String>) strSet19);
        org.jsoup.nodes.Document document24 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document25 = document24.normalise();
        org.jsoup.nodes.Element element26 = document24.head();
        org.jsoup.nodes.Element element28 = element26.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean30 = element28.equals((java.lang.Object) "#root=\"hi!\"");
        org.jsoup.nodes.Document document32 = new org.jsoup.nodes.Document("");
        boolean boolean33 = document32.hasText();
        java.lang.String str34 = document32.nodeName();
        java.lang.String str35 = document32.val();
        java.lang.String str36 = document32.outerHtml();
        java.lang.String[] strArray39 = new java.lang.String[] { "\n<!--#document-->", "#data" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        org.jsoup.nodes.Element element42 = document32.classNames((java.util.Set<java.lang.String>) strSet40);
        org.jsoup.nodes.Element element43 = element28.classNames((java.util.Set<java.lang.String>) strSet40);
        java.util.HashSet[] hashSetArray45 = new java.util.HashSet[2];
        @SuppressWarnings("unchecked")
        java.util.HashSet<java.lang.String>[] strSetArray46 = (java.util.HashSet<java.lang.String>[]) hashSetArray45;
        strSetArray46[0] = strSet19;
        strSetArray46[1] = strSet40;
        java.util.HashSet<java.lang.String>[] strSetArray51 = elements8.toArray(strSetArray46);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#document" + "'", str16, "#document");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#document" + "'", str34, "#document");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(hashSetArray45);
        org.junit.Assert.assertNotNull(strSetArray46);
        org.junit.Assert.assertNotNull(strSetArray51);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = document1.prepend("#document");
        org.jsoup.select.Elements elements13 = document1.parents();
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements17 = document15.getElementsByAttribute("hi!");
        java.lang.String str18 = elements17.val();
        java.lang.Object obj19 = null;
        int int20 = elements17.lastIndexOf(obj19);
        org.jsoup.select.Elements elements22 = elements17.eq((int) '#');
        elements17.clear();
        int int24 = elements17.size();
        org.jsoup.nodes.TextNode textNode27 = new org.jsoup.nodes.TextNode("#root", "");
        boolean boolean28 = elements17.equals((java.lang.Object) "#root");
        boolean boolean29 = elements13.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("");
        org.jsoup.nodes.Element element12 = element10.addClass("#document#document");
        org.jsoup.select.Elements elements15 = element10.getElementsByAttributeValueStarting("body", "org.jsoup.select.Selector$SelectorParseException: ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element6 = element5.empty();
        org.jsoup.select.Elements elements8 = element5.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements10 = elements8.removeClass("#root");
        org.jsoup.select.Elements elements12 = elements8.append("");
        boolean boolean14 = elements8.hasAttr("#document#document");
        org.jsoup.select.Elements elements16 = elements8.toggleClass("#document#document");
        java.util.HashSet<java.lang.String>[] strSetArray17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashSet<java.lang.String>[] strSetArray18 = elements8.toArray(strSetArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Element element5 = document2.createElement("#document#documenthi!");
        org.jsoup.nodes.Element element8 = document2.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "org.jsoup.select.Selector$SelectorParseException: \n<!--#document-->");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse(uRL0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean("#document#document=\"#document#document\"", "a", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document(" class=\"hi!\"");
        java.lang.String str2 = document1.toString();
        java.lang.String str3 = document1.outerHtml();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#document#document", "\n<!--#document-->", false);
        java.lang.String str4 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlDeclaration3.childNodes();
        java.lang.String str6 = xmlDeclaration3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<?#document#document>" + "'", str4, "<?#document#document>");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<?#document#document>" + "'", str6, "<?#document#document>");
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        org.jsoup.nodes.Document document2 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document2.hasText();
        boolean boolean4 = document2.hasText();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        boolean boolean7 = document6.hasText();
        java.lang.String str8 = document6.nodeName();
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        org.jsoup.nodes.Element element13 = document6.classNames((java.util.Set<java.lang.String>) strSet11);
        org.jsoup.nodes.Element element14 = document2.classNames((java.util.Set<java.lang.String>) strSet11);
        java.util.Set<java.lang.String> strSet15 = document2.classNames();
        org.jsoup.nodes.Element element17 = document2.getElementById("#document#document");
        java.lang.String str18 = document2.id();
        org.jsoup.parser.Tag tag19 = document2.tag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements20 = org.jsoup.select.Selector.select("\n<!--#document-->", (org.jsoup.nodes.Element) document2);
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <!--#document-->");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#document" + "'", str8, "#document");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(tag19);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.Jsoup.clean(" class=\"hi!\"", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        boolean boolean16 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        java.lang.Object[] objArray17 = elements5.toArray();
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        boolean boolean20 = document19.hasText();
        java.lang.String str21 = document19.nodeName();
        java.lang.String str22 = document19.val();
        boolean boolean23 = elements5.add((org.jsoup.nodes.Element) document19);
        org.jsoup.nodes.Element element24 = document19.empty();
        org.jsoup.nodes.Element element26 = document19.prependText("#comment");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#document" + "'", str21, "#document");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        boolean boolean16 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements20 = document18.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements22 = elements20.prepend("");
        org.jsoup.select.Elements elements24 = elements22.removeAttr("");
        org.jsoup.nodes.Document document26 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements28 = document26.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements30 = elements28.prepend("");
        org.jsoup.select.Elements elements32 = elements30.removeAttr("");
        boolean boolean33 = elements22.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements30);
        org.jsoup.select.Elements elements35 = elements30.wrap("#root");
        boolean boolean36 = elements13.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements35);
        org.jsoup.select.Elements elements37 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        org.jsoup.nodes.Element element38 = elements13.first();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(element38);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("\n<!--#root-->", "\n<!--#root-->");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("[]");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValue("hi!", "hi!");
        org.jsoup.select.Selector.SelectorParseException selectorParseException6 = new org.jsoup.select.Selector.SelectorParseException("");
        boolean boolean7 = elements4.contains((java.lang.Object) "");
        boolean boolean9 = elements4.is("[]");
        elements4.clear();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document2 = document1.normalise();
        org.jsoup.nodes.Element element3 = document1.head();
        org.jsoup.nodes.Element element5 = document1.removeClass("\n<!--#root-->");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element4 = elements3.first();
        org.jsoup.select.Elements elements6 = elements3.toggleClass("#document");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Element> elementList9 = elements6.subList(0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element5 = document2.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str6 = element5.id();
        org.jsoup.select.Elements elements8 = element5.getElementsByIndexEquals((int) (short) 1);
        java.lang.Object[] objArray9 = elements8.toArray();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[\n<body>\n #root \n</body>]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[\n<body>\n #root \n</body>]");
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("org.jsoup.select.selector$selectorparseexception:", "#document");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        boolean boolean8 = document7.hasText();
        boolean boolean9 = document7.hasText();
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        boolean boolean12 = document11.hasText();
        java.lang.String str13 = document11.nodeName();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = document11.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.nodes.Element element19 = document7.classNames((java.util.Set<java.lang.String>) strSet16);
        int int20 = elements3.indexOf((java.lang.Object) element19);
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements24 = document22.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements26 = elements24.prepend("");
        org.jsoup.select.Elements elements28 = elements26.removeAttr("");
        org.jsoup.nodes.Document document30 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements32 = document30.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements34 = elements32.prepend("");
        org.jsoup.select.Elements elements36 = elements34.removeAttr("");
        boolean boolean37 = elements26.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements34);
        org.jsoup.nodes.Document document39 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements41 = document39.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements43 = elements41.prepend("");
        org.jsoup.select.Elements elements45 = elements43.removeAttr("");
        org.jsoup.nodes.Document document47 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements49 = document47.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements51 = elements49.prepend("");
        org.jsoup.select.Elements elements53 = elements51.removeAttr("");
        boolean boolean54 = elements43.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements51);
        org.jsoup.select.Elements elements56 = elements51.wrap("#root");
        boolean boolean57 = elements34.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements56);
        org.jsoup.select.Elements elements58 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements34);
        boolean boolean59 = elements3.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements34);
        org.jsoup.nodes.Element element60 = elements34.last();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#document" + "'", str13, "#document");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertNotNull(elements51);
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(elements56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNull(element60);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        org.jsoup.nodes.DataNode dataNode2 = org.jsoup.nodes.DataNode.createFromEncoded("org.jsoup.select.selector$selectorparseexception:", "hi!");
        java.lang.String str3 = dataNode2.toString();
        java.lang.String str4 = dataNode2.outerHtml();
        org.junit.Assert.assertNotNull(dataNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str3, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str4, "org.jsoup.select.selector$selectorparseexception:");
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValue("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements6 = document1.getAllElements();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#document#document=\"#document#document\"", "\n<!--#document-->");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValue("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements7 = document1.getElementsByIndexLessThan((int) (byte) 10);
        boolean boolean8 = elements7.isEmpty();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = elements3.attr("#root");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        boolean boolean8 = document7.hasText();
        java.lang.String str9 = document7.nodeName();
        org.jsoup.select.Elements elements10 = document7.children();
        org.jsoup.nodes.Element element12 = document7.prependElement("[#, d, o, c, u, m, e, n, t]");
        int int13 = elements3.lastIndexOf((java.lang.Object) document7);
        org.jsoup.nodes.Element element14 = document7.parent();
        org.jsoup.nodes.Element element16 = document7.append("#root=\"hi!\"");
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element21 = document18.attr("hi!", "#root");
        java.lang.String str22 = document18.id();
        boolean boolean23 = element16.equals((java.lang.Object) document18);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#document" + "'", str9, "#document");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Element element5 = document2.append("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document2.getElementById("[#, d, o, c, u, m, e, n, t]");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element7);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        boolean boolean16 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements20 = document18.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements22 = elements20.prepend("");
        org.jsoup.select.Elements elements24 = elements22.removeAttr("");
        org.jsoup.nodes.Document document26 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements28 = document26.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements30 = elements28.prepend("");
        org.jsoup.select.Elements elements32 = elements30.removeAttr("");
        boolean boolean33 = elements22.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements30);
        org.jsoup.select.Elements elements35 = elements30.wrap("#root");
        boolean boolean36 = elements13.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements35);
        org.jsoup.select.Elements elements38 = elements13.removeClass("");
        org.jsoup.select.Elements elements41 = elements38.attr("#data", " class=\"hi!\"");
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor42 = elements41.listIterator();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(elementItor42);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document");
        java.lang.String str2 = tokenQueue1.consumeAttributeKey();
        java.lang.String str3 = tokenQueue1.remainder();
        // The following exception was thrown during execution in test generation
        try {
            tokenQueue1.consume("<?#document#document>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Queue did not match expected sequence");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        org.jsoup.nodes.DataNode dataNode2 = new org.jsoup.nodes.DataNode("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!=\"#root=&quot;hi!&quot;\"");
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.select.Elements elements7 = element5.getElementsByAttribute("hi!");
        java.lang.String str8 = elements7.val();
        org.jsoup.select.Elements elements10 = elements7.toggleClass("#document#document");
        org.jsoup.select.Elements elements12 = elements7.eq((int) (byte) 10);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document2 = document1.normalise();
        org.jsoup.nodes.Element element3 = document1.head();
        org.jsoup.nodes.Node node5 = document1.removeAttr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean("\n<!--#root-->", "org.jsoup.select.Selector$SelectorParseException: ", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        org.jsoup.nodes.Document document3 = org.jsoup.parser.Parser.parse("#root", "\n<!--#root-->");
        org.jsoup.select.Elements elements4 = org.jsoup.select.Selector.select("#declaration", (org.jsoup.nodes.Element) document3);
        org.jsoup.nodes.Element element5 = document3.body();
        org.jsoup.nodes.Element element6 = element5.firstElementSibling();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        org.jsoup.select.Selector.SelectorParseException selectorParseException1 = new org.jsoup.select.Selector.SelectorParseException("org.jsoup.select.selector$selectorparseexception:");
        org.jsoup.select.Selector.SelectorParseException selectorParseException3 = new org.jsoup.select.Selector.SelectorParseException("org.jsoup.select.selector$selectorparseexception:");
        java.lang.Throwable[] throwableArray4 = selectorParseException3.getSuppressed();
        org.jsoup.select.Selector.SelectorParseException selectorParseException6 = new org.jsoup.select.Selector.SelectorParseException("\n<!--#document-->");
        selectorParseException3.addSuppressed((java.lang.Throwable) selectorParseException6);
        selectorParseException1.addSuppressed((java.lang.Throwable) selectorParseException6);
        org.jsoup.select.Selector.SelectorParseException selectorParseException10 = new org.jsoup.select.Selector.SelectorParseException("org.jsoup.select.selector$selectorparseexception:");
        java.lang.Throwable[] throwableArray11 = selectorParseException10.getSuppressed();
        org.jsoup.select.Selector.SelectorParseException selectorParseException13 = new org.jsoup.select.Selector.SelectorParseException("\n<!--#document-->");
        selectorParseException10.addSuppressed((java.lang.Throwable) selectorParseException13);
        selectorParseException6.addSuppressed((java.lang.Throwable) selectorParseException10);
        java.lang.Throwable[] throwableArray16 = selectorParseException10.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray16);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = elements3.attr("#root");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element[] elementArray8 = new org.jsoup.nodes.Element[] { document7 };
        java.util.ArrayList<org.jsoup.nodes.Element> elementList9 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList9, elementArray8);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator11 = elementList9.spliterator();
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator12 = elementList9.spliterator();
        boolean boolean13 = elements3.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elementList9);
        org.jsoup.select.Elements elements14 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elementList9);
        org.jsoup.select.Elements elements15 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements14);
        org.jsoup.nodes.Document document17 = org.jsoup.Jsoup.parse("hi!");
        int int18 = elements14.indexOf((java.lang.Object) document17);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator19 = elements14.spliterator();
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator20 = elements14.spliterator();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elementArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(elementSpliterator11);
        org.junit.Assert.assertNotNull(elementSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(elementSpliterator19);
        org.junit.Assert.assertNotNull(elementSpliterator20);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("[#, d, o, c, u, m, e, n, t]", "hi!");
        org.junit.Assert.assertNotNull(textNode2);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        boolean boolean3 = document1.hasText();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        boolean boolean6 = document5.hasText();
        java.lang.String str7 = document5.nodeName();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        org.jsoup.nodes.Element element12 = document5.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element13 = document1.classNames((java.util.Set<java.lang.String>) strSet10);
        java.util.Set<java.lang.String> strSet14 = document1.classNames();
        org.jsoup.nodes.Element element16 = document1.getElementById("#document#document");
        java.lang.String str17 = document1.id();
        org.jsoup.parser.Tag tag18 = document1.tag();
        org.jsoup.parser.Tag tag20 = org.jsoup.parser.Tag.valueOf("#declaration");
        java.lang.String str21 = tag20.toString();
        boolean boolean22 = tag18.isValidParent(tag20);
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element(tag18, "");
        java.lang.String str25 = element24.text();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#declaration" + "'", str21, "#declaration");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element7 = document1.createElement("#data");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = document1.childNode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        org.jsoup.nodes.Document document3 = org.jsoup.parser.Parser.parse("#root", "\n<!--#root-->");
        org.jsoup.select.Elements elements4 = org.jsoup.select.Selector.select("#declaration", (org.jsoup.nodes.Element) document3);
        org.jsoup.nodes.Element element5 = document3.body();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        boolean boolean8 = document7.hasText();
        java.lang.String str9 = document7.nodeName();
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        org.jsoup.nodes.Element element14 = document7.classNames((java.util.Set<java.lang.String>) strSet12);
        org.jsoup.nodes.Element element16 = document7.append("#document");
        org.jsoup.nodes.Element element18 = document7.prepend("#document");
        org.jsoup.select.Elements elements19 = document7.parents();
        org.jsoup.nodes.Element element20 = element5.appendChild((org.jsoup.nodes.Node) document7);
        org.jsoup.select.Elements elements21 = element20.getAllElements();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = element20.childNodes();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#document" + "'", str9, "#document");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(nodeList22);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document(" class=\"hi!\"");
        java.lang.String str2 = document1.id();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str2 = tag1.getName();
        boolean boolean3 = tag1.isInline();
        boolean boolean4 = tag1.isEmpty();
        org.jsoup.parser.Tag tag6 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str7 = tag6.getName();
        boolean boolean8 = tag6.isInline();
        boolean boolean9 = tag6.isEmpty();
        boolean boolean10 = tag6.isEmpty();
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element16 = document13.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str17 = document13.tagName();
        java.lang.String str18 = document13.text();
        boolean boolean19 = document13.isBlock();
        boolean boolean20 = tag6.equals((java.lang.Object) document13);
        boolean boolean21 = tag1.isValidParent(tag6);
        java.lang.String str22 = tag1.toString();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str2, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str7, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#root" + "'", str17, "#root");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#root" + "'", str18, "#root");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str22, "org.jsoup.select.selector$selectorparseexception:");
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("body", "");
        org.jsoup.select.Elements elements4 = document2.getElementsByIndexEquals((-1));
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements4);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "\n<!--#root-->");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("hi!");
        java.lang.String str6 = textNode2.toString();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }
}


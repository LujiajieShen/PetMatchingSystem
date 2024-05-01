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
        org.jsoup.nodes.Element[] elementArray0 = new org.jsoup.nodes.Element[] {};
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList1, elementArray0);
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream3 = elementList1.parallelStream();
        org.junit.Assert.assertNotNull(elementArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elementStream3);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("hi!");
        org.jsoup.select.Elements elements4 = elements3.parents();
        org.jsoup.select.Elements elements6 = elements3.html("");
        org.jsoup.select.Elements elements8 = elements3.select("hi!");
        boolean boolean9 = elements8.hasText();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements15 = document1.getElementsByAttributeValueEnding("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.jsoup.parser.Tag tag0 = null;
        org.jsoup.nodes.Document document4 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes5 = document4.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag0, "", attributes5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(attributes5);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        org.jsoup.nodes.Element element5 = document2.prependText("hi!");
        org.jsoup.nodes.Element element7 = element5.append("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = element7.select("hi!");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query hi!");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        org.jsoup.nodes.Element element5 = document2.prependText("hi!");
        org.jsoup.nodes.Element element7 = element5.append("hi!");
        org.jsoup.nodes.Element element9 = element5.removeClass("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValue("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse(uRL0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.jsoup.select.Elements elements0 = new org.jsoup.select.Elements();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.select.Elements elements16 = element15.getAllElements();
        org.jsoup.nodes.Element element17 = element15.parent();
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNull(element17);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element5 = document1.createElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        // The following exception was thrown during execution in test generation
        try {
            attributes3.put("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(attributes3);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        boolean boolean3 = document1.hasAttr("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements9 = document7.getElementsByTag("hi!");
        org.jsoup.select.Elements elements10 = elements9.parents();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements14 = document12.getElementsByTag("hi!");
        boolean boolean15 = elements10.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements14);
        boolean boolean16 = document5.equals((java.lang.Object) elements10);
        java.lang.String str17 = document5.toString();
        org.jsoup.nodes.Element element19 = document5.addClass("");
        org.jsoup.nodes.Element element21 = document5.prepend("");
        org.jsoup.nodes.Element element22 = document1.prependChild((org.jsoup.nodes.Node) document5);
        java.lang.String str24 = element22.attr("hi!");
        java.lang.Class<?> wildcardClass25 = element22.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.select.Elements elements16 = element15.getAllElements();
        org.jsoup.nodes.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            element15.replaceWith(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("hi!");
        org.jsoup.select.Elements elements4 = elements3.parents();
        boolean boolean6 = elements3.is("hi!");
        java.lang.Object obj7 = null;
        int int8 = elements3.indexOf(obj7);
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements12 = document10.getElementsByTag("hi!");
        org.jsoup.select.Elements elements13 = elements12.parents();
        boolean boolean15 = elements12.is("hi!");
        boolean boolean16 = elements3.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements12);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("hi!");
        org.jsoup.select.Elements elements4 = elements3.parents();
        org.jsoup.select.Elements elements6 = elements3.html("");
        boolean boolean8 = elements6.equals((java.lang.Object) '#');
        java.util.Collection<org.jsoup.nodes.Element> elementCollection9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = elements6.addAll(elementCollection9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("hi!");
        org.jsoup.select.Elements elements4 = elements3.parents();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements6 = elements3.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements16 = document1.getElementsByAttributeValueStarting("", "#document");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.util.Collection<org.jsoup.nodes.Element> elementCollection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements1 = new org.jsoup.select.Elements(elementCollection0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("hi!");
        org.jsoup.select.Elements elements4 = elements3.parents();
        org.jsoup.select.Elements elements6 = elements3.html("");
        boolean boolean8 = elements6.equals((java.lang.Object) '#');
        org.jsoup.select.Elements elements10 = elements6.append("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = elements6.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("hi!");
        org.jsoup.select.Elements elements4 = elements3.parents();
        java.lang.String str5 = elements4.val();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor6 = elements4.listIterator();
        java.lang.String str7 = elements4.text();
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes12 = document11.attributes();
        org.jsoup.nodes.Element element14 = document11.prependText("hi!");
        org.jsoup.nodes.Element element16 = element14.append("hi!");
        // The following exception was thrown during execution in test generation
        try {
            elements4.add((int) '#', element16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elementItor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("hi!");
        java.lang.String str4 = document1.tagName();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean("#document", "#root", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.jsoup.select.Elements elements0 = new org.jsoup.select.Elements();
        java.lang.Object[] objArray1 = elements0.toArray();
        org.jsoup.select.Elements elements2 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements0);
        elements0.clear();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Element element17 = document1.createElement("hi!");
        java.lang.String str18 = element17.baseUri();
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("hi!");
        org.jsoup.select.Elements elements4 = elements3.parents();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Element> elementList7 = elements3.subList((int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: fromIndex = -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        boolean boolean3 = document1.hasAttr("");
        java.lang.String str4 = document1.nodeName();
        org.jsoup.select.Elements elements5 = document1.parents();
        java.util.Collection<org.jsoup.nodes.Element> elementCollection6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = elements5.addAll(elementCollection6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.select.Elements elements16 = element15.getAllElements();
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes20 = document19.attributes();
        org.jsoup.nodes.Element element22 = document19.prependText("hi!");
        org.jsoup.nodes.Element element24 = element22.append("hi!");
        org.jsoup.nodes.Element element26 = element24.addClass("");
        java.lang.String str27 = element26.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            element15.replaceWith((org.jsoup.nodes.Node) element26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str27, "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Document document4 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements8 = document6.getElementsByTag("hi!");
        org.jsoup.select.Elements elements9 = elements8.parents();
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements13 = document11.getElementsByTag("hi!");
        boolean boolean14 = elements9.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        boolean boolean15 = document4.equals((java.lang.Object) elements9);
        java.lang.String str16 = document4.toString();
        org.jsoup.nodes.Element element18 = document4.addClass("");
        org.jsoup.select.Elements elements19 = element18.getAllElements();
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document23 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements25 = document23.getElementsByTag("hi!");
        org.jsoup.select.Elements elements26 = elements25.parents();
        org.jsoup.nodes.Document document28 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements30 = document28.getElementsByTag("hi!");
        boolean boolean31 = elements26.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements30);
        boolean boolean32 = document21.equals((java.lang.Object) elements26);
        java.lang.String str33 = document21.toString();
        org.jsoup.nodes.Element element35 = document21.addClass("");
        org.jsoup.nodes.Element element37 = document21.prepend("");
        org.jsoup.nodes.Document document39 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document41 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements43 = document41.getElementsByTag("hi!");
        org.jsoup.select.Elements elements44 = elements43.parents();
        org.jsoup.nodes.Document document46 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements48 = document46.getElementsByTag("hi!");
        boolean boolean49 = elements44.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements48);
        boolean boolean50 = document39.equals((java.lang.Object) elements44);
        org.jsoup.nodes.Document document52 = new org.jsoup.nodes.Document("hi!");
        boolean boolean54 = document52.hasAttr("");
        org.jsoup.nodes.Document document56 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document58 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements60 = document58.getElementsByTag("hi!");
        org.jsoup.select.Elements elements61 = elements60.parents();
        org.jsoup.nodes.Document document63 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements65 = document63.getElementsByTag("hi!");
        boolean boolean66 = elements61.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements65);
        boolean boolean67 = document56.equals((java.lang.Object) elements61);
        java.lang.String str68 = document56.toString();
        org.jsoup.nodes.Element element70 = document56.addClass("");
        org.jsoup.nodes.Element element72 = document56.prepend("");
        org.jsoup.nodes.Element element73 = document52.prependChild((org.jsoup.nodes.Node) document56);
        org.jsoup.nodes.Element[] elementArray74 = new org.jsoup.nodes.Element[] { document2, element18, document21, document39, document52 };
        org.jsoup.select.Elements elements75 = new org.jsoup.select.Elements(elementArray74);
        // The following exception was thrown during execution in test generation
        try {
            elements75.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(elements60);
        org.junit.Assert.assertNotNull(elements61);
        org.junit.Assert.assertNotNull(elements65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(element70);
        org.junit.Assert.assertNotNull(element72);
        org.junit.Assert.assertNotNull(element73);
        org.junit.Assert.assertNotNull(elementArray74);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element4 = document2.appendElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Element[] elementArray17 = new org.jsoup.nodes.Element[] { document1, document16 };
        org.jsoup.select.Elements elements18 = new org.jsoup.select.Elements(elementArray17);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element20 = elements18.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(elementArray17);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("hi!");
        org.jsoup.select.Elements elements4 = elements3.parents();
        org.jsoup.select.Elements elements6 = elements3.prepend("#document");
        java.util.function.UnaryOperator<org.jsoup.nodes.Element> elementUnaryOperator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            elements3.replaceAll(elementUnaryOperator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.jsoup.parser.Tag tag0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element2 = new org.jsoup.nodes.Element(tag0, "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("hi!");
        org.jsoup.select.Elements elements4 = elements3.parents();
        org.jsoup.select.Elements elements6 = elements4.eq(1);
        org.jsoup.select.Elements elements7 = new org.jsoup.select.Elements();
        java.lang.Object[] objArray8 = elements7.toArray();
        org.jsoup.select.Elements elements9 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements7);
        boolean boolean10 = elements6.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements7);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Document document4 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements8 = document6.getElementsByTag("hi!");
        org.jsoup.select.Elements elements9 = elements8.parents();
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements13 = document11.getElementsByTag("hi!");
        boolean boolean14 = elements9.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        boolean boolean15 = document4.equals((java.lang.Object) elements9);
        java.lang.String str16 = document4.toString();
        org.jsoup.nodes.Element element18 = document4.addClass("");
        org.jsoup.select.Elements elements19 = element18.getAllElements();
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document23 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements25 = document23.getElementsByTag("hi!");
        org.jsoup.select.Elements elements26 = elements25.parents();
        org.jsoup.nodes.Document document28 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements30 = document28.getElementsByTag("hi!");
        boolean boolean31 = elements26.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements30);
        boolean boolean32 = document21.equals((java.lang.Object) elements26);
        java.lang.String str33 = document21.toString();
        org.jsoup.nodes.Element element35 = document21.addClass("");
        org.jsoup.nodes.Element element37 = document21.prepend("");
        org.jsoup.nodes.Document document39 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document41 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements43 = document41.getElementsByTag("hi!");
        org.jsoup.select.Elements elements44 = elements43.parents();
        org.jsoup.nodes.Document document46 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements48 = document46.getElementsByTag("hi!");
        boolean boolean49 = elements44.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements48);
        boolean boolean50 = document39.equals((java.lang.Object) elements44);
        org.jsoup.nodes.Document document52 = new org.jsoup.nodes.Document("hi!");
        boolean boolean54 = document52.hasAttr("");
        org.jsoup.nodes.Document document56 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document58 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements60 = document58.getElementsByTag("hi!");
        org.jsoup.select.Elements elements61 = elements60.parents();
        org.jsoup.nodes.Document document63 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements65 = document63.getElementsByTag("hi!");
        boolean boolean66 = elements61.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements65);
        boolean boolean67 = document56.equals((java.lang.Object) elements61);
        java.lang.String str68 = document56.toString();
        org.jsoup.nodes.Element element70 = document56.addClass("");
        org.jsoup.nodes.Element element72 = document56.prepend("");
        org.jsoup.nodes.Element element73 = document52.prependChild((org.jsoup.nodes.Node) document56);
        org.jsoup.nodes.Element[] elementArray74 = new org.jsoup.nodes.Element[] { document2, element18, document21, document39, document52 };
        org.jsoup.select.Elements elements75 = new org.jsoup.select.Elements(elementArray74);
        java.lang.Object obj76 = null;
        boolean boolean77 = elements75.equals(obj76);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(elements60);
        org.junit.Assert.assertNotNull(elements61);
        org.junit.Assert.assertNotNull(elements65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(element70);
        org.junit.Assert.assertNotNull(element72);
        org.junit.Assert.assertNotNull(element73);
        org.junit.Assert.assertNotNull(elementArray74);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("hi!");
        org.jsoup.select.Elements elements4 = elements3.parents();
        boolean boolean6 = elements3.is("hi!");
        org.jsoup.select.Elements elements8 = elements3.val("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Element> elementList11 = elements8.subList((int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("hi!");
        org.jsoup.select.Elements elements4 = elements3.parents();
        org.jsoup.select.Elements elements6 = elements3.html("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Element> elementList9 = elements6.subList(10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Element element17 = document1.createElement("hi!");
        java.lang.String str18 = document1.baseUri();
        org.jsoup.nodes.Element element19 = document1.empty();
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Element element17 = document1.createElement("hi!");
        boolean boolean18 = element17.isBlock();
        java.lang.Class<?> wildcardClass19 = element17.getClass();
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        org.jsoup.nodes.Element element5 = document2.prependText("hi!");
        org.jsoup.nodes.Element element7 = element5.append("hi!");
        org.jsoup.nodes.Element element9 = element7.addClass("");
        org.jsoup.nodes.Element element11 = element7.addClass(" class=\"\"");
        org.jsoup.nodes.Node node13 = element7.removeAttr("#text");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        // The following exception was thrown during execution in test generation
        try {
            document1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
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
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.jsoup.select.Collector collector0 = new org.jsoup.select.Collector();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Attributes attributes16 = element15.attributes();
        java.lang.String str17 = attributes16.toString();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator18 = attributes16.spliterator();
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements24 = document22.getElementsByTag("hi!");
        org.jsoup.select.Elements elements25 = elements24.parents();
        org.jsoup.nodes.Document document27 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements29 = document27.getElementsByTag("hi!");
        boolean boolean30 = elements25.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements29);
        boolean boolean31 = document20.equals((java.lang.Object) elements25);
        java.lang.String str32 = document20.toString();
        org.jsoup.nodes.Element element34 = document20.addClass("");
        boolean boolean35 = attributes16.equals((java.lang.Object) document20);
        org.jsoup.nodes.Attribute attribute36 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes16.put(attribute36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " class=\"\"" + "'", str17, " class=\"\"");
        org.junit.Assert.assertNotNull(attributeSpliterator18);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Document document4 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements8 = document6.getElementsByTag("hi!");
        org.jsoup.select.Elements elements9 = elements8.parents();
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements13 = document11.getElementsByTag("hi!");
        boolean boolean14 = elements9.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        boolean boolean15 = document4.equals((java.lang.Object) elements9);
        java.lang.String str16 = document4.toString();
        org.jsoup.nodes.Element element18 = document4.addClass("");
        org.jsoup.select.Elements elements19 = element18.getAllElements();
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document23 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements25 = document23.getElementsByTag("hi!");
        org.jsoup.select.Elements elements26 = elements25.parents();
        org.jsoup.nodes.Document document28 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements30 = document28.getElementsByTag("hi!");
        boolean boolean31 = elements26.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements30);
        boolean boolean32 = document21.equals((java.lang.Object) elements26);
        java.lang.String str33 = document21.toString();
        org.jsoup.nodes.Element element35 = document21.addClass("");
        org.jsoup.nodes.Element element37 = document21.prepend("");
        org.jsoup.nodes.Document document39 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document41 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements43 = document41.getElementsByTag("hi!");
        org.jsoup.select.Elements elements44 = elements43.parents();
        org.jsoup.nodes.Document document46 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements48 = document46.getElementsByTag("hi!");
        boolean boolean49 = elements44.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements48);
        boolean boolean50 = document39.equals((java.lang.Object) elements44);
        org.jsoup.nodes.Document document52 = new org.jsoup.nodes.Document("hi!");
        boolean boolean54 = document52.hasAttr("");
        org.jsoup.nodes.Document document56 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document58 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements60 = document58.getElementsByTag("hi!");
        org.jsoup.select.Elements elements61 = elements60.parents();
        org.jsoup.nodes.Document document63 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements65 = document63.getElementsByTag("hi!");
        boolean boolean66 = elements61.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements65);
        boolean boolean67 = document56.equals((java.lang.Object) elements61);
        java.lang.String str68 = document56.toString();
        org.jsoup.nodes.Element element70 = document56.addClass("");
        org.jsoup.nodes.Element element72 = document56.prepend("");
        org.jsoup.nodes.Element element73 = document52.prependChild((org.jsoup.nodes.Node) document56);
        org.jsoup.nodes.Element[] elementArray74 = new org.jsoup.nodes.Element[] { document2, element18, document21, document39, document52 };
        org.jsoup.select.Elements elements75 = new org.jsoup.select.Elements(elementArray74);
        int int77 = elements75.indexOf((java.lang.Object) (byte) 100);
        java.lang.Object obj78 = null;
        int int79 = elements75.indexOf(obj78);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(elements60);
        org.junit.Assert.assertNotNull(elements61);
        org.junit.Assert.assertNotNull(elements65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(element70);
        org.junit.Assert.assertNotNull(element72);
        org.junit.Assert.assertNotNull(element73);
        org.junit.Assert.assertNotNull(elementArray74);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("hi!");
        org.jsoup.select.Elements elements4 = elements3.parents();
        java.lang.String str5 = elements4.val();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor6 = elements4.listIterator();
        java.lang.String str7 = elements4.text();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = elements4.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elementItor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("hi!");
        org.jsoup.select.Elements elements4 = elements3.parents();
        org.jsoup.select.Elements elements6 = elements3.html("");
        boolean boolean8 = elements6.equals((java.lang.Object) '#');
        org.jsoup.select.Elements elements10 = elements6.val("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = elements10.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        org.jsoup.nodes.Element element5 = document2.prependText("hi!");
        org.jsoup.nodes.Element element7 = element5.append("hi!");
        org.jsoup.nodes.Element element9 = element7.addClass("");
        org.jsoup.nodes.Element element11 = element7.addClass(" class=\"\"");
        java.lang.String str13 = element7.attr("#root");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Element element17 = document1.createElement("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = document1.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Element element17 = document1.prepend("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements20 = element17.getElementsByAttributeValueContaining("org.jsoup.select.Selector$SelectorParseException: ", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        org.jsoup.nodes.Element element5 = document2.prependText("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements7 = document2.select("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("hi!");
        org.jsoup.select.Elements elements4 = elements3.parents();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements8 = document6.getElementsByTag("hi!");
        boolean boolean9 = elements4.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements8);
        java.lang.String str10 = elements4.html();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("hi!");
        org.jsoup.select.Elements elements4 = elements3.parents();
        org.jsoup.select.Elements elements6 = elements3.html("");
        boolean boolean8 = elements6.equals((java.lang.Object) '#');
        org.jsoup.select.Elements elements10 = elements6.val("hi!");
        java.lang.Class<?> wildcardClass11 = elements6.getClass();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.jsoup.select.Selector.SelectorParseException selectorParseException1 = new org.jsoup.select.Selector.SelectorParseException("");
        java.lang.Throwable[] throwableArray2 = selectorParseException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = selectorParseException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Element[] elementArray17 = new org.jsoup.nodes.Element[] { document1, document16 };
        org.jsoup.select.Elements elements18 = new org.jsoup.select.Elements(elementArray17);
        org.jsoup.select.Elements elements19 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements18);
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document23 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements25 = document23.getElementsByTag("hi!");
        org.jsoup.select.Elements elements26 = elements25.parents();
        org.jsoup.nodes.Document document28 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements30 = document28.getElementsByTag("hi!");
        boolean boolean31 = elements26.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements30);
        boolean boolean32 = document21.equals((java.lang.Object) elements26);
        java.lang.String str33 = document21.toString();
        org.jsoup.nodes.Element element35 = document21.addClass("");
        org.jsoup.nodes.Attributes attributes36 = element35.attributes();
        java.lang.String str37 = attributes36.toString();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator38 = attributes36.spliterator();
        boolean boolean39 = elements18.equals((java.lang.Object) attributeSpliterator38);
        boolean boolean41 = elements18.hasClass(" class=\"\"");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(elementArray17);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + " class=\"\"" + "'", str37, " class=\"\"");
        org.junit.Assert.assertNotNull(attributeSpliterator38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        org.jsoup.nodes.Element element5 = document2.prependText("hi!");
        org.jsoup.nodes.Element element7 = element5.append("hi!");
        org.jsoup.nodes.Element element9 = element5.removeClass("");
        boolean boolean10 = element5.hasText();
        org.jsoup.nodes.Node node13 = element5.attr("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!", "hi! hi!hi! hi!    hi! hi!   ");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Element element17 = document1.prepend("");
        java.lang.String str18 = element17.toString();
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("hi!");
        org.jsoup.select.Elements elements4 = elements3.parents();
        boolean boolean6 = elements3.is("hi!");
        java.lang.String str8 = elements3.attr("#root");
        org.jsoup.select.Elements elements10 = elements3.addClass("");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.jsoup.nodes.DataNode dataNode2 = org.jsoup.nodes.DataNode.createFromEncoded(" class=\"\"", "");
        java.lang.String str3 = dataNode2.nodeName();
        java.lang.String str4 = dataNode2.getWholeData();
        org.junit.Assert.assertNotNull(dataNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#data" + "'", str3, "#data");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " class=\"\"" + "'", str4, " class=\"\"");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Element element17 = document1.createElement("hi!");
        java.lang.String str18 = document1.outerHtml();
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream13 = elements6.stream();
        boolean boolean14 = elements6.hasText();
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elementStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        boolean boolean3 = document1.hasAttr("");
        java.lang.String str4 = document1.nodeName();
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.nodes.Element element7 = document1.html("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.jsoup.select.Elements elements0 = new org.jsoup.select.Elements();
        java.lang.Object[] objArray1 = elements0.toArray();
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        boolean boolean7 = elements0.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements5);
        java.util.Iterator<org.jsoup.nodes.Element> elementItor8 = elements0.iterator();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(elementItor8);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        org.jsoup.nodes.Element element5 = document2.prependText("hi!");
        org.jsoup.nodes.Element element7 = element5.append("hi!");
        org.jsoup.nodes.Element element9 = element7.addClass("");
        org.jsoup.nodes.Element element11 = element7.addClass(" class=\"\"");
        org.jsoup.nodes.Element element13 = element7.removeClass("#text");
        java.lang.String str14 = element13.toString();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str14, "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("hi!");
        org.jsoup.select.Elements elements4 = elements3.parents();
        org.jsoup.select.Elements elements6 = elements3.html("");
        boolean boolean8 = elements6.equals((java.lang.Object) '#');
        org.jsoup.select.Elements elements10 = elements6.append("hi!");
        org.jsoup.select.Elements elements12 = elements6.removeClass("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = elements6.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.jsoup.select.Elements elements0 = new org.jsoup.select.Elements();
        java.lang.Object[] objArray1 = elements0.toArray();
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        boolean boolean7 = elements0.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements5);
        java.lang.String str8 = elements0.val();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.jsoup.nodes.Document document3 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes4 = document3.attributes();
        org.jsoup.nodes.Element element6 = document3.prependText("hi!");
        org.jsoup.nodes.Element element8 = element6.append("hi!");
        org.jsoup.nodes.Element element10 = element6.removeClass("");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements16 = document14.getElementsByTag("hi!");
        org.jsoup.select.Elements elements17 = elements16.parents();
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements21 = document19.getElementsByTag("hi!");
        boolean boolean22 = elements17.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements21);
        boolean boolean23 = document12.equals((java.lang.Object) elements17);
        java.lang.String str24 = document12.toString();
        org.jsoup.nodes.Element element26 = document12.addClass("");
        org.jsoup.nodes.Element element28 = document12.createElement("hi!");
        boolean boolean29 = element10.equals((java.lang.Object) document12);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements30 = org.jsoup.select.Selector.select("org.jsoup.select.Selector$SelectorParseException: ", element10);
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query org.jsoup.select.Selector$SelectorParseException:");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        java.lang.String str2 = document1.outerHtml();
        org.jsoup.nodes.Element element5 = document1.attr("org.jsoup.select.Selector$SelectorParseException: ", "hi! hi!hi! hi!    hi! hi!   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        boolean boolean3 = document1.hasAttr("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements9 = document7.getElementsByTag("hi!");
        org.jsoup.select.Elements elements10 = elements9.parents();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements14 = document12.getElementsByTag("hi!");
        boolean boolean15 = elements10.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements14);
        boolean boolean16 = document5.equals((java.lang.Object) elements10);
        java.lang.String str17 = document5.toString();
        org.jsoup.nodes.Element element19 = document5.addClass("");
        org.jsoup.nodes.Element element21 = document5.prepend("");
        org.jsoup.nodes.Element element22 = document1.prependChild((org.jsoup.nodes.Node) document5);
        java.lang.String str23 = document5.nodeName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#document" + "'", str23, "#document");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        boolean boolean3 = document1.hasAttr("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements9 = document7.getElementsByTag("hi!");
        org.jsoup.select.Elements elements10 = elements9.parents();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements14 = document12.getElementsByTag("hi!");
        boolean boolean15 = elements10.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements14);
        boolean boolean16 = document5.equals((java.lang.Object) elements10);
        java.lang.String str17 = document5.toString();
        org.jsoup.nodes.Element element19 = document5.addClass("");
        org.jsoup.nodes.Element element21 = document5.prepend("");
        org.jsoup.nodes.Element element22 = document1.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Element element24 = document5.wrap(" class=\"\"");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element26 = element24.html(" class=\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNull(element24);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        org.jsoup.nodes.Element element5 = document2.prependText("hi!");
        org.jsoup.nodes.Element element7 = element5.append("hi!");
        org.jsoup.nodes.Element element9 = element7.addClass("");
        java.lang.String str10 = element9.outerHtml();
        org.jsoup.nodes.Element element12 = element9.prepend("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements15 = element9.getElementsByAttributeValueStarting("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "org.jsoup.select.Selector$SelectorParseException: ");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str10, "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Element element16 = element15.empty();
        org.jsoup.nodes.Element element18 = element16.prepend("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str19 = element16.toString();
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<html> \n<head> \n</head> \n<body>  \n</body>\n</html>" + "'", str19, "<html> \n<head> \n</head> \n<body>  \n</body>\n</html>");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Element element17 = document1.createElement("hi!");
        java.lang.String str18 = document1.val();
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi!", "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.select.Elements elements4 = document2.getElementsByIndexGreaterThan((int) (byte) 100);
        org.jsoup.nodes.Element element5 = elements4.first();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNull(element5);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        org.jsoup.nodes.Element element5 = document2.prependText("hi!");
        org.jsoup.nodes.Element element7 = element5.append("hi!");
        org.jsoup.nodes.Element element9 = element7.addClass("");
        org.jsoup.nodes.Attributes attributes10 = element9.attributes();
        attributes10.put(" class=\"\"", "");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.nodeName();
        java.lang.String str4 = textNode2.getWholeText();
        boolean boolean6 = textNode2.hasAttr("hi! hi!hi! hi!    hi! hi!   ");
        java.lang.String str7 = textNode2.toString();
        java.lang.String str8 = textNode2.outerHtml();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#text" + "'", str3, "#text");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        boolean boolean3 = document1.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document1.childNodes();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(nodeList4);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.select.Elements elements16 = element15.getAllElements();
        org.jsoup.select.Elements elements17 = elements16.parents();
        org.jsoup.select.Elements elements19 = elements16.append("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<org.jsoup.nodes.Element> elementItor21 = elements19.listIterator((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("hi!");
        org.jsoup.select.Elements elements4 = elements3.parents();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements8 = document6.getElementsByTag("hi!");
        boolean boolean9 = elements4.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements8);
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream10 = elements8.stream();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elementStream10);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi!", "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.select.Elements elements4 = document2.getElementsByIndexGreaterThan((int) (byte) 100);
        boolean boolean6 = document2.hasAttr("");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.jsoup.nodes.DataNode dataNode2 = new org.jsoup.nodes.DataNode("", "hi! hi!hi! hi!    hi! hi!   ");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.jsoup.nodes.DataNode dataNode2 = org.jsoup.nodes.DataNode.createFromEncoded(" class=\"\"", "");
        java.lang.String str3 = dataNode2.getWholeData();
        java.lang.String str4 = dataNode2.getWholeData();
        org.junit.Assert.assertNotNull(dataNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " class=\"\"" + "'", str3, " class=\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " class=\"\"" + "'", str4, " class=\"\"");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str5 = textNode2.text();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse(file0, "#root");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        org.jsoup.nodes.Element element5 = document2.prependText("hi!");
        org.jsoup.nodes.Element element7 = element5.append("hi!");
        org.jsoup.nodes.Element element9 = element7.addClass("");
        org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValue("hi! hi!hi! hi!    hi! hi!   ", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str13 = element9.toString();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str13, "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        java.lang.String str4 = document2.html();
        org.jsoup.nodes.Document document5 = document2.normalise();
        boolean boolean7 = document2.hasAttr("");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str4, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        boolean boolean3 = document1.hasAttr("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements9 = document7.getElementsByTag("hi!");
        org.jsoup.select.Elements elements10 = elements9.parents();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements14 = document12.getElementsByTag("hi!");
        boolean boolean15 = elements10.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements14);
        boolean boolean16 = document5.equals((java.lang.Object) elements10);
        java.lang.String str17 = document5.toString();
        org.jsoup.nodes.Element element19 = document5.addClass("");
        org.jsoup.nodes.Element element21 = document5.prepend("");
        org.jsoup.nodes.Element element22 = document1.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Element element24 = document5.prepend(" class=\"\"");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = element24.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        boolean boolean3 = document1.hasAttr("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements9 = document7.getElementsByTag("hi!");
        org.jsoup.select.Elements elements10 = elements9.parents();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements14 = document12.getElementsByTag("hi!");
        boolean boolean15 = elements10.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements14);
        boolean boolean16 = document5.equals((java.lang.Object) elements10);
        java.lang.String str17 = document5.toString();
        org.jsoup.nodes.Element element19 = document5.addClass("");
        org.jsoup.nodes.Element element21 = document5.prepend("");
        org.jsoup.nodes.Element element22 = document1.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Element element23 = document1.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element25 = document1.createElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNull(element23);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("hi!");
        org.jsoup.select.Elements elements4 = elements3.parents();
        java.lang.String str5 = elements4.val();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor6 = elements4.listIterator();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        org.jsoup.select.Elements elements11 = elements10.parents();
        org.jsoup.select.Elements elements13 = elements10.html("");
        org.jsoup.select.Elements elements15 = elements10.select("hi!");
        boolean boolean17 = elements10.hasClass("#document");
        int int18 = elements4.indexOf((java.lang.Object) "#document");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elementItor6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse(" class=\"\"", "org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean3 = document2.hasText();
        boolean boolean4 = document2.isBlock();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        org.jsoup.nodes.Element element5 = document2.prependText("hi!");
        org.jsoup.nodes.Element element7 = element5.append("hi!");
        org.jsoup.nodes.Element element9 = element7.addClass("");
        org.jsoup.nodes.Element element11 = element7.addClass(" class=\"\"");
        java.lang.String str12 = element11.outerHtml();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str12, "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("#root", "");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("hi!");
        org.jsoup.select.Elements elements4 = elements3.parents();
        org.jsoup.select.Elements elements6 = elements3.html("");
        boolean boolean8 = elements6.equals((java.lang.Object) '#');
        org.jsoup.select.Elements elements10 = elements6.append("hi!");
        org.jsoup.select.Elements elements12 = elements10.toggleClass("#root");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.Jsoup.isValid("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        org.jsoup.nodes.Element element5 = document2.prependText("hi!");
        org.jsoup.nodes.Element element7 = element5.append("hi!");
        org.jsoup.nodes.Element element8 = element5.empty();
        org.jsoup.nodes.Element element10 = element8.prependElement("hi!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("org.jsoup.select.Selector$SelectorParseException: ", " class=\"\"");
        org.jsoup.parser.Tag tag3 = document2.tag();
        org.jsoup.nodes.Element element4 = document2.body();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.select.Elements elements16 = element15.getAllElements();
        java.lang.String str17 = elements16.html();
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("org.jsoup.select.Selector$SelectorParseException: ", " class=\"\"");
        java.lang.String str3 = document2.baseUri();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class=\"\"" + "'", str3, "class=\"\"");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        boolean boolean3 = document1.equals((java.lang.Object) (-1));
        java.lang.String str4 = document1.val();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#text");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.jsoup.select.Elements elements0 = new org.jsoup.select.Elements();
        java.lang.Object[] objArray1 = elements0.toArray();
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        boolean boolean7 = elements0.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements5);
        org.jsoup.select.Elements elements9 = elements0.html("hi!");
        boolean boolean10 = elements9.isEmpty();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        boolean boolean3 = document1.hasAttr("");
        java.lang.String str4 = document1.nodeName();
        java.lang.String str5 = document1.id();
        java.lang.String str6 = document1.data();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        boolean boolean3 = document1.hasAttr("");
        java.lang.String str4 = document1.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Attributes attributes16 = element15.attributes();
        java.lang.String str17 = attributes16.toString();
        int int18 = attributes16.size();
        attributes16.remove(" class=\"\"");
        attributes16.put(" class=\"\"", "#comment");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " class=\"\"" + "'", str17, " class=\"\"");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.jsoup.select.Selector.SelectorParseException selectorParseException1 = new org.jsoup.select.Selector.SelectorParseException("#text");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueContaining(" class=\"\"", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.attr("#root", " class=\"\"");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.nodeName();
        java.lang.String str4 = textNode2.getWholeText();
        boolean boolean6 = textNode2.hasAttr("hi! hi!hi! hi!    hi! hi!   ");
        java.lang.String str7 = textNode2.nodeName();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#text" + "'", str3, "#text");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#text" + "'", str7, "#text");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Attributes attributes16 = element15.attributes();
        java.lang.String str17 = attributes16.toString();
        int int18 = attributes16.size();
        java.lang.String str19 = attributes16.toString();
        java.lang.String str21 = attributes16.get("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " class=\"\"" + "'", str17, " class=\"\"");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + " class=\"\"" + "'", str19, " class=\"\"");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.jsoup.select.Elements elements0 = new org.jsoup.select.Elements();
        java.lang.Object[] objArray1 = elements0.toArray();
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        boolean boolean7 = elements0.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements5);
        org.jsoup.select.Elements elements9 = elements5.eq((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Element> elementList12 = elements9.subList(10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(10) > toIndex(0)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("hi!");
        org.jsoup.select.Elements elements4 = elements3.parents();
        org.jsoup.select.Elements elements6 = elements3.html("");
        org.jsoup.select.Elements elements8 = elements3.select("hi!");
        boolean boolean10 = elements3.hasClass("#document");
        org.jsoup.select.Elements elements12 = elements3.val(" class=\"\"");
        org.jsoup.nodes.Element element13 = elements12.last();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNull(element13);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("org.jsoup.select.Selector$SelectorParseException: ");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        boolean boolean3 = document1.hasAttr("");
        java.lang.String str4 = document1.nodeName();
        java.lang.String str5 = document1.id();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements7 = document1.select("hi!");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query hi!");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        org.jsoup.nodes.Element element5 = document2.prependText("hi!");
        org.jsoup.nodes.Element element7 = element5.append("hi!");
        org.jsoup.nodes.Element element9 = element5.removeClass("");
        boolean boolean10 = element5.hasText();
        org.jsoup.select.Elements elements13 = element5.getElementsByAttributeValue("hi! hi!hi! hi!    hi! hi!   ", "#root");
        java.lang.String str14 = element5.nodeName();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#document" + "'", str14, "#document");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("class=\"\"", "#text", true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Attributes attributes16 = element15.attributes();
        java.lang.String str17 = attributes16.toString();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator18 = attributes16.spliterator();
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements24 = document22.getElementsByTag("hi!");
        org.jsoup.select.Elements elements25 = elements24.parents();
        org.jsoup.nodes.Document document27 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements29 = document27.getElementsByTag("hi!");
        boolean boolean30 = elements25.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements29);
        boolean boolean31 = document20.equals((java.lang.Object) elements25);
        java.lang.String str32 = document20.toString();
        org.jsoup.nodes.Element element34 = document20.addClass("");
        boolean boolean35 = attributes16.equals((java.lang.Object) document20);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements37 = document20.select("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <html>?<head>?</head>?<body>?</body>?</html>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " class=\"\"" + "'", str17, " class=\"\"");
        org.junit.Assert.assertNotNull(attributeSpliterator18);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<html> \n<head> \n</head> \n<body>  \n</body>\n</html>", "");
        java.lang.String str3 = document2.nodeName();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.jsoup.select.Elements elements0 = new org.jsoup.select.Elements();
        java.lang.Object[] objArray1 = elements0.toArray();
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        boolean boolean7 = elements0.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements5);
        boolean boolean9 = elements5.remove((java.lang.Object) 100.0f);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Element element17 = element15.removeClass(" class=\"\"");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        java.lang.String str2 = document1.outerHtml();
        org.jsoup.select.Elements elements3 = document1.getAllElements();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isEmpty();
        org.jsoup.nodes.Element element4 = new org.jsoup.nodes.Element(tag1, "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Node node16 = element15.parent();
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Element[] elementArray17 = new org.jsoup.nodes.Element[] { document1, document16 };
        org.jsoup.select.Elements elements18 = new org.jsoup.select.Elements(elementArray17);
        org.jsoup.select.Elements elements19 = new org.jsoup.select.Elements(elementArray17);
        java.lang.String str20 = elements19.outerHtml();
        org.jsoup.select.Elements elements21 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements19);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(elementArray17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str20, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
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
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Attributes attributes16 = element15.attributes();
        java.lang.String str17 = attributes16.toString();
        int int18 = attributes16.size();
        org.jsoup.nodes.Attribute attribute21 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        attributes16.put(attribute21);
        java.lang.String str23 = attribute21.getKey();
        org.jsoup.nodes.Document document25 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements27 = document25.getElementsByTag("hi!");
        org.jsoup.select.Elements elements28 = elements27.parents();
        boolean boolean29 = attribute21.equals((java.lang.Object) elements27);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element31 = elements27.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " class=\"\"" + "'", str17, " class=\"\"");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(attribute21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi!", "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.select.Elements elements4 = document2.getElementsByIndexGreaterThan((int) (byte) 100);
        org.jsoup.nodes.Element element6 = document2.text("#text");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        org.jsoup.nodes.Element element5 = document2.prependText("hi!");
        org.jsoup.nodes.Element element7 = element5.val("#document");
        org.jsoup.select.Elements elements9 = element7.getElementsByTag("#document");
        org.jsoup.nodes.Element element11 = element7.append("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.nodes.Element element13 = element11.addClass("org.jsoup.select.Selector$SelectorParseException: ");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Element[] elementArray17 = new org.jsoup.nodes.Element[] { document1, document16 };
        org.jsoup.select.Elements elements18 = new org.jsoup.select.Elements(elementArray17);
        org.jsoup.select.Elements elements19 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements18);
        org.jsoup.select.Elements elements22 = elements18.attr("#text", "#text");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(elementArray17);
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse(file0, "class=\"\"", "class=\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("hi!");
        org.jsoup.select.Elements elements4 = elements3.parents();
        org.jsoup.select.Elements elements6 = elements3.html("");
        org.jsoup.select.Elements elements8 = elements3.select("hi!");
        org.jsoup.select.Elements elements10 = elements8.toggleClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor11 = elements10.listIterator();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elementItor11);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Element element17 = document1.prepend("");
        org.jsoup.nodes.Element element19 = document1.prependText("");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = document1.childNodes();
        java.lang.String str22 = document1.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.select.Elements elements16 = element15.getAllElements();
        org.jsoup.select.Elements elements17 = elements16.parents();
        java.lang.String str18 = elements17.text();
        java.lang.String str19 = elements17.html();
        java.util.Iterator<org.jsoup.nodes.Element> elementItor20 = elements17.iterator();
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elementItor20);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("hi!");
        org.jsoup.select.Elements elements4 = elements3.parents();
        org.jsoup.select.Elements elements6 = elements3.html("");
        org.jsoup.select.Elements elements8 = elements3.select("hi!");
        boolean boolean10 = elements3.hasClass("#document");
        java.lang.String str11 = elements3.outerHtml();
        org.jsoup.select.Elements elements13 = elements3.val("#text");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        boolean boolean17 = element15.hasClass("#root");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("org", "#root");
        org.jsoup.select.Elements elements4 = document2.getElementsByTag("hi! hi!hi! hi!    hi! hi!   ");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements4);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Attributes attributes16 = element15.attributes();
        java.lang.String str17 = attributes16.toString();
        int int18 = attributes16.size();
        org.jsoup.nodes.Attribute attribute21 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        attributes16.put(attribute21);
        java.lang.String str23 = attribute21.getKey();
        java.lang.String str24 = attribute21.getKey();
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " class=\"\"" + "'", str17, " class=\"\"");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(attribute21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.jsoup.nodes.Evaluator evaluator0 = null;
        org.jsoup.nodes.Document document2 = new org.jsoup.nodes.Document("hi!");
        boolean boolean4 = document2.hasAttr("");
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        org.jsoup.select.Elements elements11 = elements10.parents();
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements15 = document13.getElementsByTag("hi!");
        boolean boolean16 = elements11.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements15);
        boolean boolean17 = document6.equals((java.lang.Object) elements11);
        java.lang.String str18 = document6.toString();
        org.jsoup.nodes.Element element20 = document6.addClass("");
        org.jsoup.nodes.Element element22 = document6.prepend("");
        org.jsoup.nodes.Element element23 = document2.prependChild((org.jsoup.nodes.Node) document6);
        java.lang.String str24 = document6.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements25 = org.jsoup.select.Collector.collect(evaluator0, (org.jsoup.nodes.Element) document6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#document" + "'", str24, "#document");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        boolean boolean3 = document1.hasAttr("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements9 = document7.getElementsByTag("hi!");
        org.jsoup.select.Elements elements10 = elements9.parents();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements14 = document12.getElementsByTag("hi!");
        boolean boolean15 = elements10.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements14);
        boolean boolean16 = document5.equals((java.lang.Object) elements10);
        java.lang.String str17 = document5.toString();
        org.jsoup.nodes.Element element19 = document5.addClass("");
        org.jsoup.nodes.Element element21 = document5.prepend("");
        org.jsoup.nodes.Element element22 = document1.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Element element23 = document1.parent();
        org.jsoup.parser.Tag tag24 = document1.tag();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNull(element23);
        org.junit.Assert.assertNotNull(tag24);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("hi!");
        org.jsoup.select.Elements elements4 = elements3.parents();
        boolean boolean6 = elements3.is("hi!");
        java.lang.String str8 = elements3.attr("#root");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements13 = document11.getElementsByTag("hi!");
        org.jsoup.select.Elements elements14 = elements13.parents();
        org.jsoup.select.Elements elements16 = elements13.html("");
        boolean boolean18 = elements16.equals((java.lang.Object) '#');
        org.jsoup.select.Elements elements20 = elements16.append("hi!");
        org.jsoup.nodes.Element element21 = elements20.first();
        boolean boolean23 = elements20.hasAttr("org.jsoup.select.Selector$SelectorParseException: ");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = elements3.addAll(1, (java.util.Collection<org.jsoup.nodes.Element>) elements20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNull(element21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Element[] elementArray17 = new org.jsoup.nodes.Element[] { document1, document16 };
        org.jsoup.select.Elements elements18 = new org.jsoup.select.Elements(elementArray17);
        org.jsoup.select.Elements elements19 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements18);
        java.lang.String str21 = elements19.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.util.function.UnaryOperator<org.jsoup.nodes.Element> elementUnaryOperator22 = null;
        // The following exception was thrown during execution in test generation
        try {
            elements19.replaceAll(elementUnaryOperator22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(elementArray17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        boolean boolean3 = document1.hasAttr("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements9 = document7.getElementsByTag("hi!");
        org.jsoup.select.Elements elements10 = elements9.parents();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements14 = document12.getElementsByTag("hi!");
        boolean boolean15 = elements10.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements14);
        boolean boolean16 = document5.equals((java.lang.Object) elements10);
        java.lang.String str17 = document5.toString();
        org.jsoup.nodes.Element element19 = document5.addClass("");
        org.jsoup.nodes.Element element21 = document5.prepend("");
        org.jsoup.nodes.Element element22 = document1.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Element element23 = document1.parent();
        org.jsoup.nodes.Element element24 = document1.body();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNull(element23);
        org.junit.Assert.assertNull(element24);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.parser.Tag tag2 = document1.tag();
        java.lang.String str3 = document1.id();
        org.jsoup.select.Elements elements4 = document1.parents();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(elements4);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        org.jsoup.nodes.Element element5 = document2.prependText("hi!");
        org.jsoup.nodes.Element element7 = element5.append("hi!");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes11 = document10.attributes();
        org.jsoup.nodes.Element element13 = document10.prependText("hi!");
        org.jsoup.nodes.Element element15 = element13.append("hi!");
        java.lang.String str16 = element15.nodeName();
        org.jsoup.nodes.Element element17 = element5.appendChild((org.jsoup.nodes.Node) element15);
        org.jsoup.select.Elements elements18 = element17.getAllElements();
        java.lang.String str19 = elements18.text();
        int int21 = elements18.indexOf((java.lang.Object) "org.jsoup.select.Selector$SelectorParseException: ");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#document" + "'", str16, "#document");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! hi!hi! hi!    hi! hi!   " + "'", str19, "hi! hi!hi! hi!    hi! hi!   ");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        org.jsoup.nodes.Element element5 = document2.prependText("hi!");
        org.jsoup.nodes.Element element7 = element5.append("hi!");
        org.jsoup.nodes.Element element9 = element7.addClass("");
        java.lang.String str10 = element9.outerHtml();
        org.jsoup.nodes.Element element12 = element9.prepend("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements13 = element9.children();
        org.jsoup.nodes.Element element14 = elements13.last();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str10, "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.jsoup.select.Elements elements0 = new org.jsoup.select.Elements();
        java.lang.Object[] objArray1 = elements0.toArray();
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        boolean boolean7 = elements0.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements5);
        org.jsoup.select.Elements elements9 = elements5.addClass("org.jsoup.select.Selector$SelectorParseException: ");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.jsoup.select.Elements elements0 = new org.jsoup.select.Elements();
        java.lang.Object[] objArray1 = elements0.toArray();
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        boolean boolean7 = elements0.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements5);
        org.jsoup.select.Elements elements9 = elements0.wrap("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.jsoup.select.Elements elements0 = new org.jsoup.select.Elements();
        java.lang.Object[] objArray1 = elements0.toArray();
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        boolean boolean7 = elements0.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements5);
        boolean boolean9 = elements0.hasClass("#root");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        org.jsoup.nodes.Element element5 = document2.prependText("hi!");
        org.jsoup.nodes.Element element7 = element5.append("hi!");
        org.jsoup.nodes.Element element9 = element7.addClass("");
        org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValue("hi! hi!hi! hi!    hi! hi!   ", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements13 = element9.children();
        java.lang.String str14 = elements13.text();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Element[] elementArray17 = new org.jsoup.nodes.Element[] { document1, document16 };
        org.jsoup.select.Elements elements18 = new org.jsoup.select.Elements(elementArray17);
        org.jsoup.select.Elements elements19 = new org.jsoup.select.Elements(elementArray17);
        java.lang.String str20 = elements19.outerHtml();
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("hi!");
        boolean boolean24 = document22.hasAttr("");
        org.jsoup.nodes.Document document26 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document28 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements30 = document28.getElementsByTag("hi!");
        org.jsoup.select.Elements elements31 = elements30.parents();
        org.jsoup.nodes.Document document33 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements35 = document33.getElementsByTag("hi!");
        boolean boolean36 = elements31.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements35);
        boolean boolean37 = document26.equals((java.lang.Object) elements31);
        java.lang.String str38 = document26.toString();
        org.jsoup.nodes.Element element40 = document26.addClass("");
        org.jsoup.nodes.Element element42 = document26.prepend("");
        org.jsoup.nodes.Element element43 = document22.prependChild((org.jsoup.nodes.Node) document26);
        org.jsoup.nodes.Element element45 = document26.prepend(" class=\"\"");
        org.jsoup.nodes.Element element47 = document26.html("");
        boolean boolean48 = elements19.contains((java.lang.Object) "");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(elementArray17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str20, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Node node16 = document1.attr("hi!", "");
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes20 = document19.attributes();
        org.jsoup.nodes.Element element22 = document19.prependText("hi!");
        org.jsoup.nodes.Element element24 = element22.append("hi!");
        org.jsoup.nodes.Document document27 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes28 = document27.attributes();
        org.jsoup.nodes.Element element30 = document27.prependText("hi!");
        org.jsoup.nodes.Element element32 = element30.append("hi!");
        java.lang.String str33 = element32.nodeName();
        org.jsoup.nodes.Element element34 = element22.appendChild((org.jsoup.nodes.Node) element32);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) element32);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang.NotImplementedException; message: Cannot (yet) move nodes in tree");
        } catch (org.apache.commons.lang.NotImplementedException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#document" + "'", str33, "#document");
        org.junit.Assert.assertNotNull(element34);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Node node16 = document1.attr("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element19 = document1.attr("", "class=\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        org.jsoup.nodes.Element element5 = document2.prependText("hi!");
        org.jsoup.nodes.Element element7 = element5.append("hi!");
        org.jsoup.nodes.Element element9 = element7.addClass("");
        java.lang.String str10 = element9.outerHtml();
        org.jsoup.nodes.Element element12 = element9.prepend("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str13 = element9.id();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str10, "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("hi!");
        org.jsoup.select.Elements elements4 = elements3.parents();
        org.jsoup.select.Elements elements6 = elements4.toggleClass("#document");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Element element16 = element15.empty();
        java.lang.String str18 = element15.absUrl("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        java.lang.String str19 = element15.outerHtml();
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("hi!");
        org.jsoup.select.Elements elements4 = elements3.parents();
        org.jsoup.select.Elements elements6 = elements3.html("");
        org.jsoup.select.Elements elements8 = elements3.select("hi!");
        boolean boolean10 = elements3.hasClass("#document");
        org.jsoup.select.Elements elements12 = elements3.val(" class=\"\"");
        java.lang.String str13 = elements3.text();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        org.jsoup.nodes.Element element5 = document2.prependText("hi!");
        org.jsoup.nodes.Element element7 = element5.append("hi!");
        org.jsoup.nodes.Element element9 = element5.removeClass("");
        boolean boolean10 = element5.hasText();
        org.jsoup.select.Elements elements13 = element5.getElementsByAttributeValue("hi! hi!hi! hi!    hi! hi!   ", "#root");
        org.jsoup.nodes.Element element15 = element5.prependElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        boolean boolean3 = document1.hasAttr("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements9 = document7.getElementsByTag("hi!");
        org.jsoup.select.Elements elements10 = elements9.parents();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements14 = document12.getElementsByTag("hi!");
        boolean boolean15 = elements10.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements14);
        boolean boolean16 = document5.equals((java.lang.Object) elements10);
        java.lang.String str17 = document5.toString();
        org.jsoup.nodes.Element element19 = document5.addClass("");
        org.jsoup.nodes.Element element21 = document5.prepend("");
        org.jsoup.nodes.Element element22 = document1.prependChild((org.jsoup.nodes.Node) document5);
        java.lang.String str23 = document5.outerHtml();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("hi!");
        org.jsoup.select.Elements elements4 = elements3.parents();
        org.jsoup.select.Elements elements6 = elements4.eq(1);
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        org.jsoup.select.Elements elements11 = elements10.parents();
        org.jsoup.select.Elements elements13 = elements10.html("");
        java.lang.String str14 = elements10.outerHtml();
        boolean boolean15 = elements4.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements17 = elements4.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        boolean boolean3 = document1.hasAttr("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements9 = document7.getElementsByTag("hi!");
        org.jsoup.select.Elements elements10 = elements9.parents();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements14 = document12.getElementsByTag("hi!");
        boolean boolean15 = elements10.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements14);
        boolean boolean16 = document5.equals((java.lang.Object) elements10);
        java.lang.String str17 = document5.toString();
        org.jsoup.nodes.Element element19 = document5.addClass("");
        org.jsoup.nodes.Element element21 = document5.prepend("");
        org.jsoup.nodes.Element element22 = document1.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Element element24 = element22.append("#comment");
        org.jsoup.nodes.Document document26 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document28 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements30 = document28.getElementsByTag("hi!");
        org.jsoup.select.Elements elements31 = elements30.parents();
        org.jsoup.nodes.Document document33 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements35 = document33.getElementsByTag("hi!");
        boolean boolean36 = elements31.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements35);
        boolean boolean37 = document26.equals((java.lang.Object) elements31);
        java.lang.String str38 = document26.toString();
        org.jsoup.nodes.Element element40 = document26.addClass("");
        org.jsoup.nodes.Attributes attributes41 = element40.attributes();
        java.lang.String str42 = attributes41.toString();
        int int43 = attributes41.size();
        org.jsoup.nodes.Attribute attribute46 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        attributes41.put(attribute46);
        java.lang.String str48 = attribute46.getKey();
        org.jsoup.nodes.Document document50 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements52 = document50.getElementsByTag("hi!");
        org.jsoup.select.Elements elements53 = elements52.parents();
        boolean boolean54 = attribute46.equals((java.lang.Object) elements52);
        java.lang.String str55 = attribute46.html();
        boolean boolean56 = element22.equals((java.lang.Object) attribute46);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(attributes41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + " class=\"\"" + "'", str42, " class=\"\"");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(attribute46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(elements52);
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"" + "'", str55, "hi!=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Attributes attributes16 = element15.attributes();
        java.lang.String str17 = attributes16.toString();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor18 = attributes16.iterator();
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " class=\"\"" + "'", str17, " class=\"\"");
        org.junit.Assert.assertNotNull(attributeItor18);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Element element17 = document1.prepend("");
        org.jsoup.nodes.Element element19 = document1.prependText("");
        boolean boolean21 = document1.hasClass("");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("#root", "");
        java.lang.String str3 = attribute2.html();
        java.lang.String str4 = attribute2.html();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root=\"\"" + "'", str3, "#root=\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root=\"\"" + "'", str4, "#root=\"\"");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.jsoup.select.Selector.SelectorParseException selectorParseException1 = new org.jsoup.select.Selector.SelectorParseException("org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.Throwable[] throwableArray2 = selectorParseException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        org.jsoup.nodes.Element element5 = document2.prependText("hi!");
        org.jsoup.nodes.Element element7 = element5.append("hi!");
        org.jsoup.nodes.Element element9 = element7.addClass("");
        org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValue("hi! hi!hi! hi!    hi! hi!   ", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements13 = element9.children();
        org.jsoup.nodes.Element element15 = element9.removeClass("class=\"\"");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("#root", "");
        java.lang.String str3 = attribute2.html();
        java.lang.String str4 = attribute2.getKey();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root=\"\"" + "'", str3, "#root=\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        org.jsoup.nodes.Element element5 = document2.prependText("hi!");
        org.jsoup.nodes.Element element7 = element5.append("hi!");
        org.jsoup.nodes.Element element9 = element7.addClass("");
        org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValue("hi! hi!hi! hi!    hi! hi!   ", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document15 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes16 = document15.attributes();
        org.jsoup.nodes.Element element18 = document15.prependText("hi!");
        org.jsoup.nodes.Element element20 = element18.append("hi!");
        org.jsoup.nodes.Document document23 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes24 = document23.attributes();
        org.jsoup.nodes.Element element26 = document23.prependText("hi!");
        org.jsoup.nodes.Element element28 = element26.append("hi!");
        java.lang.String str29 = element28.nodeName();
        org.jsoup.nodes.Element element30 = element18.appendChild((org.jsoup.nodes.Node) element28);
        java.lang.String str31 = element30.data();
        boolean boolean32 = elements12.add(element30);
        org.jsoup.select.Elements elements34 = elements12.append("");
        java.lang.String str36 = elements12.attr("[]");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#document" + "'", str29, "#document");
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.jsoup.nodes.DataNode dataNode2 = new org.jsoup.nodes.DataNode("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!", "#comment");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Element[] elementArray17 = new org.jsoup.nodes.Element[] { document1, document16 };
        org.jsoup.select.Elements elements18 = new org.jsoup.select.Elements(elementArray17);
        org.jsoup.select.Elements elements19 = new org.jsoup.select.Elements(elementArray17);
        org.jsoup.select.Elements elements20 = new org.jsoup.select.Elements(elementArray17);
        org.jsoup.select.Elements elements21 = new org.jsoup.select.Elements(elementArray17);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(elementArray17);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("hi!");
        org.jsoup.select.Elements elements4 = elements3.parents();
        boolean boolean6 = elements3.is("hi!");
        org.jsoup.select.Elements elements8 = elements3.val("hi!");
        int int9 = elements8.size();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Attributes attributes16 = element15.attributes();
        java.lang.String str17 = attributes16.toString();
        int int18 = attributes16.size();
        java.lang.String str19 = attributes16.html();
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " class=\"\"" + "'", str17, " class=\"\"");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + " class=\"\"" + "'", str19, " class=\"\"");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi!", "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.select.Elements elements4 = document2.getElementsByIndexGreaterThan((int) (byte) 100);
        org.jsoup.nodes.Element element5 = document2.body();
        java.lang.String str6 = element5.outerHtml();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n<body>\n hi!\n</body>" + "'", str6, "\n<body>\n hi!\n</body>");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.select.Elements elements16 = element15.getAllElements();
        org.jsoup.select.Elements elements17 = elements16.parents();
        java.lang.String str18 = elements17.text();
        java.lang.String str19 = elements17.html();
        org.jsoup.select.Elements elements21 = elements17.wrap("#comment");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Document document4 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements8 = document6.getElementsByTag("hi!");
        org.jsoup.select.Elements elements9 = elements8.parents();
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements13 = document11.getElementsByTag("hi!");
        boolean boolean14 = elements9.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        boolean boolean15 = document4.equals((java.lang.Object) elements9);
        java.lang.String str16 = document4.toString();
        org.jsoup.nodes.Element element18 = document4.addClass("");
        org.jsoup.nodes.Element element20 = document4.prepend("");
        java.lang.String str21 = element20.toString();
        org.jsoup.nodes.Element element24 = element20.attr("hi! hi!hi! hi!    hi! hi!   ", "#root");
        org.jsoup.nodes.Element element25 = document1.appendChild((org.jsoup.nodes.Node) element24);
        org.jsoup.nodes.Element element27 = element25.prepend(".jsoup.select.Selector$SelectorParseException: ");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Node node16 = document1.attr("hi!", "");
        org.jsoup.nodes.Element element18 = document1.removeClass("org.jsoup.select.Selector$SelectorParseException: ");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Attributes attributes16 = element15.attributes();
        java.lang.String str17 = attributes16.toString();
        int int18 = attributes16.size();
        org.jsoup.nodes.Attribute attribute21 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        attributes16.put(attribute21);
        java.lang.String str23 = attribute21.getKey();
        attribute21.setValue("org.jsoup.select.Selector$SelectorParseException: ");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " class=\"\"" + "'", str17, " class=\"\"");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(attribute21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.parser.Tag tag2 = document1.tag();
        boolean boolean3 = tag2.canContainBlock();
        boolean boolean4 = tag2.isData();
        boolean boolean5 = tag2.preserveWhitespace();
        boolean boolean6 = tag2.isData();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Attributes attributes16 = element15.attributes();
        java.lang.String str17 = attributes16.toString();
        int int18 = attributes16.size();
        org.jsoup.nodes.Attribute attribute21 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        attributes16.put(attribute21);
        java.lang.String str23 = attribute21.getKey();
        org.jsoup.nodes.Document document25 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements27 = document25.getElementsByTag("hi!");
        org.jsoup.select.Elements elements28 = elements27.parents();
        boolean boolean29 = attribute21.equals((java.lang.Object) elements27);
        attribute21.setKey("[]");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " class=\"\"" + "'", str17, " class=\"\"");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(attribute21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.parser.Tag tag2 = document1.tag();
        boolean boolean3 = tag2.canContainBlock();
        boolean boolean4 = tag2.isData();
        boolean boolean5 = tag2.preserveWhitespace();
        java.lang.String str6 = tag2.toString();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("hi!");
        org.jsoup.select.Elements elements4 = elements3.parents();
        org.jsoup.select.Elements elements6 = elements3.html("");
        boolean boolean8 = elements6.equals((java.lang.Object) '#');
        org.jsoup.select.Elements elements10 = elements6.append("hi!");
        java.lang.String str11 = elements10.text();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Element element16 = element15.empty();
        org.jsoup.nodes.Element element18 = element16.prepend("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element20 = element18.append("#data");
        org.jsoup.nodes.Element element22 = element18.html("");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.Jsoup.clean("\n<body>\n hi!\n</body>", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Element[] elementArray17 = new org.jsoup.nodes.Element[] { document1, document16 };
        org.jsoup.select.Elements elements18 = new org.jsoup.select.Elements(elementArray17);
        org.jsoup.select.Elements elements19 = new org.jsoup.select.Elements(elementArray17);
        java.lang.String str20 = elements19.outerHtml();
        java.lang.String str21 = elements19.text();
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(elementArray17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str20, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.jsoup.parser.Tag tag0 = null;
        org.jsoup.nodes.Document document4 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes5 = document4.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag0, " class=\"\"", attributes5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(attributes5);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("hi!");
        org.jsoup.select.Elements elements4 = elements3.parents();
        org.jsoup.select.Elements elements6 = elements3.html("");
        org.jsoup.select.Elements elements8 = elements3.select("hi!");
        java.lang.Class<?> wildcardClass9 = elements3.getClass();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        org.jsoup.nodes.Element element5 = document2.prependText("hi!");
        org.jsoup.nodes.Element element7 = element5.val("#document");
        org.jsoup.select.Elements elements9 = element7.getElementsByTag("#document");
        int int10 = elements9.size();
        elements9.clear();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        org.jsoup.nodes.Element element5 = document2.prependText("hi!");
        org.jsoup.nodes.Element element7 = element5.append("hi!");
        org.jsoup.nodes.Element element9 = element7.addClass("");
        java.lang.String str10 = element9.outerHtml();
        org.jsoup.nodes.Element element12 = element9.prepend("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements15 = element9.getElementsByAttributeValueContaining("#root=\"\"", "[]");
        boolean boolean16 = elements15.hasText();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str10, "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        org.jsoup.nodes.Element element5 = document2.prependText("hi!");
        org.jsoup.nodes.Element element7 = element5.append("hi!");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes11 = document10.attributes();
        org.jsoup.nodes.Element element13 = document10.prependText("hi!");
        org.jsoup.nodes.Element element15 = element13.append("hi!");
        java.lang.String str16 = element15.nodeName();
        org.jsoup.nodes.Element element17 = element5.appendChild((org.jsoup.nodes.Node) element15);
        java.lang.String str18 = element17.data();
        boolean boolean20 = element17.hasAttr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements23 = element17.getElementsByAttributeValueNot("#root=\"\"", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#document" + "'", str16, "#document");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("hi!");
        boolean boolean4 = elements3.hasText();
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream5 = elements3.stream();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements11 = document9.getElementsByTag("hi!");
        org.jsoup.select.Elements elements12 = elements11.parents();
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements16 = document14.getElementsByTag("hi!");
        boolean boolean17 = elements12.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements16);
        boolean boolean18 = document7.equals((java.lang.Object) elements12);
        java.lang.String str19 = document7.toString();
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Element[] elementArray23 = new org.jsoup.nodes.Element[] { document7, document22 };
        org.jsoup.select.Elements elements24 = new org.jsoup.select.Elements(elementArray23);
        org.jsoup.select.Elements elements25 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements24);
        java.lang.String str27 = elements25.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean28 = elements3.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements25);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(elementStream5);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(elementArray23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        boolean boolean3 = document1.hasAttr("");
        org.jsoup.nodes.Element[] elementArray4 = new org.jsoup.nodes.Element[] { document1 };
        org.jsoup.select.Elements elements5 = new org.jsoup.select.Elements(elementArray4);
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream6 = elements5.parallelStream();
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream7 = elements5.stream();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(elementArray4);
        org.junit.Assert.assertNotNull(elementStream6);
        org.junit.Assert.assertNotNull(elementStream7);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.select.Elements elements16 = element15.getAllElements();
        org.jsoup.select.Elements elements18 = elements16.prepend(" class=\"\"");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<org.jsoup.nodes.Element> elementItor20 = elements18.listIterator((int) 'j');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 106");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.jsoup.nodes.Document document3 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes4 = document3.attributes();
        org.jsoup.nodes.Element element6 = document3.prependText("hi!");
        org.jsoup.nodes.Element element8 = element6.append("hi!");
        org.jsoup.nodes.Element element10 = element8.addClass("");
        java.lang.String str11 = element10.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = org.jsoup.select.Selector.select("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!", element10);
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query hi!?<html>?<head>?</head>?<body>?</body>?</html>hi!");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str11, "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("class=\"\"", "#text", true);
        java.lang.String str4 = xmlDeclaration3.toString();
        java.lang.String str5 = xmlDeclaration3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!class=\"\">" + "'", str4, "<!class=\"\">");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!class=\"\">" + "'", str5, "<!class=\"\">");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("hi!");
        org.jsoup.select.Elements elements4 = elements3.parents();
        boolean boolean6 = elements3.is("hi!");
        java.lang.String str8 = elements3.attr("#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = elements3.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("hi!");
        org.jsoup.select.Elements elements4 = elements3.parents();
        org.jsoup.select.Elements elements6 = elements3.html("");
        boolean boolean8 = elements6.equals((java.lang.Object) '#');
        org.jsoup.select.Elements elements10 = elements6.append("hi!");
        org.jsoup.select.Elements elements11 = new org.jsoup.select.Elements();
        java.lang.Object[] objArray12 = elements11.toArray();
        org.jsoup.select.Elements elements13 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements11);
        boolean boolean14 = elements6.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements11);
        java.util.Collection<org.jsoup.nodes.Element> elementCollection16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = elements6.addAll((int) ' ', elementCollection16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.parser.Tag tag16 = element15.tag();
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(tag16);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.parser.Tag tag2 = document1.tag();
        boolean boolean3 = tag2.canContainBlock();
        java.lang.String str4 = tag2.getName();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str2 = tokenQueue1.consumeWord();
        java.lang.String[] strArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = tokenQueue1.consumeToAny(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org" + "'", str2, "org");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        boolean boolean3 = document1.hasAttr("");
        java.lang.String str4 = document1.nodeName();
        org.jsoup.select.Elements elements5 = document1.parents();
        java.util.Collection<org.jsoup.nodes.Element> elementCollection6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = elements5.retainAll(elementCollection6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Element element17 = document1.prepend("");
        java.lang.String str18 = element17.toString();
        org.jsoup.nodes.Element element20 = element17.append("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element22 = element17.child(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("hi!");
        org.jsoup.select.Elements elements4 = elements3.parents();
        boolean boolean6 = elements3.is("hi!");
        java.lang.String str8 = elements3.attr("#root");
        org.jsoup.select.Elements elements10 = elements3.val("");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str2 = tokenQueue1.consumeWord();
        boolean boolean4 = tokenQueue1.matchChomp("\n<!--#root-->");
        java.lang.String str5 = tokenQueue1.remainder();
        java.lang.String str6 = tokenQueue1.toString();
        java.lang.String str7 = tokenQueue1.consumeWord();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org" + "'", str2, "org");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ".jsoup.select.Selector$SelectorParseException: " + "'", str5, ".jsoup.select.Selector$SelectorParseException: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("hi!");
        boolean boolean4 = elements3.hasText();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor5 = elements3.listIterator();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(elementItor5);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Element element17 = document1.createElement("hi!");
        java.lang.String str18 = document1.baseUri();
        java.lang.String str19 = document1.toString();
        org.jsoup.nodes.Element element20 = document1.head();
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(element20);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.jsoup.nodes.Evaluator evaluator0 = null;
        org.jsoup.nodes.Document document2 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document4 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements6 = document4.getElementsByTag("hi!");
        org.jsoup.select.Elements elements7 = elements6.parents();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements11 = document9.getElementsByTag("hi!");
        boolean boolean12 = elements7.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements11);
        boolean boolean13 = document2.equals((java.lang.Object) elements7);
        java.lang.String str14 = document2.toString();
        org.jsoup.nodes.Element element16 = document2.addClass("");
        org.jsoup.nodes.Element element18 = document2.prepend("");
        java.lang.String str19 = element18.toString();
        org.jsoup.nodes.Element element22 = element18.attr("hi! hi!hi! hi!    hi! hi!   ", "#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements23 = org.jsoup.select.Collector.collect(evaluator0, element22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(element22);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        org.jsoup.nodes.Element element5 = document2.prependText("hi!");
        org.jsoup.nodes.Element element7 = element5.append("hi!");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes11 = document10.attributes();
        org.jsoup.nodes.Element element13 = document10.prependText("hi!");
        org.jsoup.nodes.Element element15 = element13.append("hi!");
        java.lang.String str16 = element15.nodeName();
        org.jsoup.nodes.Element element17 = element5.appendChild((org.jsoup.nodes.Node) element15);
        org.jsoup.select.Elements elements18 = element17.getAllElements();
        java.lang.String[] strArray21 = new java.lang.String[] { "#comment", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        org.jsoup.nodes.Element element24 = element17.classNames((java.util.Set<java.lang.String>) strSet22);
        org.jsoup.nodes.Element element26 = element24.prepend("[]");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#document" + "'", str16, "#document");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("hi!");
        org.jsoup.select.Elements elements4 = elements3.parents();
        java.lang.String str5 = elements4.val();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor6 = elements4.listIterator();
        java.lang.String str7 = elements4.text();
        org.jsoup.select.Elements elements10 = elements4.attr("", "#root=\"\"");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elementItor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("hi!");
        org.jsoup.select.Elements elements4 = elements3.parents();
        org.jsoup.select.Elements elements6 = elements3.prepend("#document");
        org.jsoup.nodes.Document document9 = org.jsoup.Jsoup.parseBodyFragment("hi!", "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.select.Elements elements11 = document9.getElementsByIndexGreaterThan((int) (byte) 100);
        org.jsoup.nodes.Element element12 = document9.body();
        boolean boolean13 = elements3.add(element12);
        element12.remove();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("org.jsoup.select.Selector$SelectorParseException: ", " class=\"\"");
        org.jsoup.parser.Tag tag3 = document2.tag();
        java.lang.String str4 = tag3.getName();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements11 = document9.getElementsByTag("hi!");
        org.jsoup.select.Elements elements12 = elements11.parents();
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements16 = document14.getElementsByTag("hi!");
        boolean boolean17 = elements12.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements16);
        boolean boolean18 = document7.equals((java.lang.Object) elements12);
        java.lang.String str19 = document7.toString();
        org.jsoup.nodes.Element element21 = document7.addClass("");
        org.jsoup.nodes.Attributes attributes22 = element21.attributes();
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element(tag3, "class=\"\"", attributes22);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(attributes22);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        org.jsoup.nodes.Element element5 = document2.prependText("hi!");
        org.jsoup.nodes.Element element7 = element5.append("hi!");
        org.jsoup.nodes.Element element9 = element5.removeClass("");
        boolean boolean10 = element5.hasText();
        org.jsoup.select.Elements elements13 = element5.getElementsByAttributeValue("hi! hi!hi! hi!    hi! hi!   ", "#root");
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document17 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements19 = document17.getElementsByTag("hi!");
        org.jsoup.select.Elements elements20 = elements19.parents();
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements24 = document22.getElementsByTag("hi!");
        boolean boolean25 = elements20.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements24);
        boolean boolean26 = document15.equals((java.lang.Object) elements20);
        java.lang.String str27 = document15.toString();
        org.jsoup.nodes.Element element29 = document15.addClass("");
        org.jsoup.nodes.Element element31 = document15.prepend("");
        java.lang.String str32 = element31.toString();
        boolean boolean33 = elements13.remove((java.lang.Object) element31);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Element element17 = document1.prepend("");
        org.jsoup.nodes.Element element19 = document1.prependText("");
        org.jsoup.parser.Tag tag20 = document1.tag();
        org.jsoup.nodes.Document document23 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document25 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements27 = document25.getElementsByTag("hi!");
        org.jsoup.select.Elements elements28 = elements27.parents();
        org.jsoup.nodes.Document document30 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements32 = document30.getElementsByTag("hi!");
        boolean boolean33 = elements28.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements32);
        boolean boolean34 = document23.equals((java.lang.Object) elements28);
        java.lang.String str35 = document23.toString();
        org.jsoup.nodes.Element element37 = document23.addClass("");
        org.jsoup.nodes.Attributes attributes38 = element37.attributes();
        java.lang.String str39 = attributes38.toString();
        org.jsoup.nodes.Element element40 = new org.jsoup.nodes.Element(tag20, "#data", attributes38);
        boolean boolean41 = tag20.isData();
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + " class=\"\"" + "'", str39, " class=\"\"");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.parser.Tag tag2 = document1.tag();
        java.lang.String str3 = document1.html();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.jsoup.select.Elements elements0 = new org.jsoup.select.Elements();
        java.lang.Object[] objArray1 = elements0.toArray();
        org.jsoup.nodes.Document document4 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes5 = document4.attributes();
        org.jsoup.nodes.Element element7 = document4.prependText("hi!");
        org.jsoup.nodes.Element element9 = document4.html("");
        org.jsoup.select.Elements elements11 = element9.getElementsByClass(".jsoup.select.Selector$SelectorParseException: ");
        boolean boolean12 = elements0.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements11);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#document", "#document");
        java.lang.String str4 = document2.absUrl("\n<!--#root-->");
        org.jsoup.select.Elements elements6 = document2.getElementsByIndexLessThan((int) ' ');
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("<!class=\"\">", "#root=\"\"");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.parser.Tag tag2 = document1.tag();
        boolean boolean3 = tag2.isData();
        org.jsoup.nodes.TextNode textNode6 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str7 = textNode6.nodeName();
        java.lang.String str8 = textNode6.getWholeText();
        boolean boolean9 = tag2.equals((java.lang.Object) textNode6);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#text" + "'", str7, "#text");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Element[] elementArray17 = new org.jsoup.nodes.Element[] { document1, document16 };
        org.jsoup.select.Elements elements18 = new org.jsoup.select.Elements(elementArray17);
        org.jsoup.select.Elements elements20 = elements18.removeClass("");
        org.jsoup.nodes.Element element22 = elements20.get((int) (byte) 0);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(elementArray17);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element22);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.nodeName();
        java.lang.String str4 = textNode2.getWholeText();
        boolean boolean6 = textNode2.hasAttr("hi! hi!hi! hi!    hi! hi!   ");
        java.lang.String str7 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        java.lang.String str10 = textNode2.toString();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#text" + "'", str3, "#text");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#text" + "'", str7, "#text");
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Attributes attributes16 = element15.attributes();
        java.lang.String str17 = attributes16.toString();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator18 = attributes16.spliterator();
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements24 = document22.getElementsByTag("hi!");
        org.jsoup.select.Elements elements25 = elements24.parents();
        org.jsoup.nodes.Document document27 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements29 = document27.getElementsByTag("hi!");
        boolean boolean30 = elements25.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements29);
        boolean boolean31 = document20.equals((java.lang.Object) elements25);
        java.lang.String str32 = document20.toString();
        org.jsoup.nodes.Element element34 = document20.addClass("");
        boolean boolean35 = attributes16.equals((java.lang.Object) document20);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor36 = attributes16.iterator();
        org.jsoup.nodes.Document document38 = new org.jsoup.nodes.Document("hi!");
        boolean boolean40 = document38.hasAttr("");
        org.jsoup.nodes.Document document42 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document44 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements46 = document44.getElementsByTag("hi!");
        org.jsoup.select.Elements elements47 = elements46.parents();
        org.jsoup.nodes.Document document49 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements51 = document49.getElementsByTag("hi!");
        boolean boolean52 = elements47.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements51);
        boolean boolean53 = document42.equals((java.lang.Object) elements47);
        java.lang.String str54 = document42.toString();
        org.jsoup.nodes.Element element56 = document42.addClass("");
        org.jsoup.nodes.Element element58 = document42.prepend("");
        org.jsoup.nodes.Element element59 = document38.prependChild((org.jsoup.nodes.Node) document42);
        java.lang.String str60 = element59.id();
        boolean boolean61 = attributes16.equals((java.lang.Object) element59);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " class=\"\"" + "'", str17, " class=\"\"");
        org.junit.Assert.assertNotNull(attributeSpliterator18);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(attributeItor36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertNotNull(elements51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        boolean boolean3 = document1.hasAttr("");
        org.jsoup.nodes.Element[] elementArray4 = new org.jsoup.nodes.Element[] { document1 };
        org.jsoup.select.Elements elements5 = new org.jsoup.select.Elements(elementArray4);
        org.jsoup.select.Elements elements7 = elements5.removeAttr("[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(elementArray4);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("#root", "");
        java.lang.String str3 = attribute2.html();
        attribute2.setKey(".jsoup.select.Selector$SelectorParseException: ");
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root=\"\"" + "'", str3, "#root=\"\"");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        org.jsoup.nodes.Element element5 = document2.prependText("hi!");
        org.jsoup.nodes.Element element7 = element5.append("hi!");
        org.jsoup.nodes.Element element9 = element5.removeClass("");
        org.jsoup.nodes.Node node12 = element9.attr(" class=\"\"", " class=\"\"");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node12.childNodes();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Attributes attributes16 = element15.attributes();
        java.lang.String str17 = attributes16.toString();
        int int18 = attributes16.size();
        org.jsoup.nodes.Attribute attribute21 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        attributes16.put(attribute21);
        java.lang.String str23 = attribute21.getKey();
        org.jsoup.nodes.Document document25 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements27 = document25.getElementsByTag("hi!");
        org.jsoup.select.Elements elements28 = elements27.parents();
        boolean boolean29 = attribute21.equals((java.lang.Object) elements27);
        java.lang.String str30 = attribute21.toString();
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " class=\"\"" + "'", str17, " class=\"\"");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(attribute21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"" + "'", str30, "hi!=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("hi!");
        org.jsoup.select.Elements elements4 = elements3.parents();
        org.jsoup.select.Elements elements6 = elements4.eq(1);
        boolean boolean7 = elements6.hasText();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("\n<body>\n hi!\n</body>");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment(".jsoup.select.Selector$SelectorParseException: ", " class=\"\"");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Element[] elementArray17 = new org.jsoup.nodes.Element[] { document1, document16 };
        org.jsoup.select.Elements elements18 = new org.jsoup.select.Elements(elementArray17);
        org.jsoup.select.Elements elements20 = elements18.eq(0);
        org.jsoup.select.Elements elements23 = elements20.attr("#comment", "org.jsoup.select.Selector$SelectorParseException: ");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(elementArray17);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Document document4 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements8 = document6.getElementsByTag("hi!");
        org.jsoup.select.Elements elements9 = elements8.parents();
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements13 = document11.getElementsByTag("hi!");
        boolean boolean14 = elements9.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        boolean boolean15 = document4.equals((java.lang.Object) elements9);
        java.lang.String str16 = document4.toString();
        org.jsoup.nodes.Element element18 = document4.addClass("");
        org.jsoup.select.Elements elements19 = element18.getAllElements();
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document23 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements25 = document23.getElementsByTag("hi!");
        org.jsoup.select.Elements elements26 = elements25.parents();
        org.jsoup.nodes.Document document28 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements30 = document28.getElementsByTag("hi!");
        boolean boolean31 = elements26.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements30);
        boolean boolean32 = document21.equals((java.lang.Object) elements26);
        java.lang.String str33 = document21.toString();
        org.jsoup.nodes.Element element35 = document21.addClass("");
        org.jsoup.nodes.Element element37 = document21.prepend("");
        org.jsoup.nodes.Document document39 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document41 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements43 = document41.getElementsByTag("hi!");
        org.jsoup.select.Elements elements44 = elements43.parents();
        org.jsoup.nodes.Document document46 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements48 = document46.getElementsByTag("hi!");
        boolean boolean49 = elements44.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements48);
        boolean boolean50 = document39.equals((java.lang.Object) elements44);
        org.jsoup.nodes.Document document52 = new org.jsoup.nodes.Document("hi!");
        boolean boolean54 = document52.hasAttr("");
        org.jsoup.nodes.Document document56 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document58 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements60 = document58.getElementsByTag("hi!");
        org.jsoup.select.Elements elements61 = elements60.parents();
        org.jsoup.nodes.Document document63 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements65 = document63.getElementsByTag("hi!");
        boolean boolean66 = elements61.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements65);
        boolean boolean67 = document56.equals((java.lang.Object) elements61);
        java.lang.String str68 = document56.toString();
        org.jsoup.nodes.Element element70 = document56.addClass("");
        org.jsoup.nodes.Element element72 = document56.prepend("");
        org.jsoup.nodes.Element element73 = document52.prependChild((org.jsoup.nodes.Node) document56);
        org.jsoup.nodes.Element[] elementArray74 = new org.jsoup.nodes.Element[] { document2, element18, document21, document39, document52 };
        org.jsoup.select.Elements elements75 = new org.jsoup.select.Elements(elementArray74);
        int int77 = elements75.indexOf((java.lang.Object) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element79 = elements75.remove(1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(elements60);
        org.junit.Assert.assertNotNull(elements61);
        org.junit.Assert.assertNotNull(elements65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(element70);
        org.junit.Assert.assertNotNull(element72);
        org.junit.Assert.assertNotNull(element73);
        org.junit.Assert.assertNotNull(elementArray74);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isEmpty();
        boolean boolean3 = tag1.isBlock();
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.parser.Tag tag6 = document5.tag();
        boolean boolean7 = tag6.canContainBlock();
        boolean boolean8 = tag1.isValidParent(tag6);
        boolean boolean9 = tag1.isEmpty();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#comment", "org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str3 = textNode2.toString();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Attributes attributes16 = element15.attributes();
        java.lang.String str17 = attributes16.toString();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator18 = attributes16.spliterator();
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements24 = document22.getElementsByTag("hi!");
        org.jsoup.select.Elements elements25 = elements24.parents();
        org.jsoup.nodes.Document document27 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements29 = document27.getElementsByTag("hi!");
        boolean boolean30 = elements25.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements29);
        boolean boolean31 = document20.equals((java.lang.Object) elements25);
        java.lang.String str32 = document20.toString();
        org.jsoup.nodes.Element element34 = document20.addClass("");
        boolean boolean35 = attributes16.equals((java.lang.Object) document20);
        org.jsoup.nodes.Element element37 = document20.removeClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " class=\"\"" + "'", str17, " class=\"\"");
        org.junit.Assert.assertNotNull(attributeSpliterator18);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(element37);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse(" class=\"\"", "org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean3 = document2.hasText();
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) (byte) 1);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.jsoup.nodes.DataNode dataNode2 = org.jsoup.nodes.DataNode.createFromEncoded(" class=\"\"", "");
        java.lang.String str3 = dataNode2.nodeName();
        java.lang.String str4 = dataNode2.nodeName();
        org.junit.Assert.assertNotNull(dataNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#data" + "'", str3, "#data");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#data" + "'", str4, "#data");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("org.jsoup.select.Selector$SelectorParseException: ", " class=\"\"");
        org.jsoup.parser.Tag tag3 = document2.tag();
        java.lang.String str4 = tag3.getName();
        boolean boolean5 = tag3.isBlock();
        org.jsoup.parser.Tag tag6 = tag3.getImplicitParent();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#root", "");
        java.lang.String str3 = comment2.nodeName();
        java.lang.String str4 = comment2.nodeName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#comment" + "'", str4, "#comment");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.select.Elements elements16 = element15.getAllElements();
        org.jsoup.nodes.Element element18 = element15.addClass("#document");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("hi!");
        org.jsoup.select.Elements elements4 = elements3.parents();
        org.jsoup.select.Elements elements6 = elements3.html("");
        org.jsoup.select.Elements elements8 = elements3.select("hi!");
        boolean boolean10 = elements3.hasClass("#document");
        org.jsoup.select.Elements elements12 = elements3.val(" class=\"\"");
        org.jsoup.select.Elements elements14 = elements12.val("jsoup.select.Selector$SelectorParseException: ");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueContaining(" class=\"\"", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element5 = elements4.last();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("hi!");
        boolean boolean8 = elements4.add((org.jsoup.nodes.Element) document7);
        org.jsoup.select.Elements elements11 = document7.getElementsByAttributeValueContaining("\n<!--#root-->", "jsoup.select.Selector$SelectorParseException: ");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNull(element5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        org.jsoup.nodes.Element element5 = document2.prependText("hi!");
        org.jsoup.nodes.Element element7 = element5.append("hi!");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes11 = document10.attributes();
        org.jsoup.nodes.Element element13 = document10.prependText("hi!");
        org.jsoup.nodes.Element element15 = element13.append("hi!");
        java.lang.String str16 = element15.nodeName();
        org.jsoup.nodes.Element element17 = element5.appendChild((org.jsoup.nodes.Node) element15);
        element17.setBaseUri("");
        org.jsoup.select.Elements elements22 = element17.getElementsByAttributeValue("#document", "<html> \n<head> \n</head> \n<body>  \n</body>\n</html>");
        boolean boolean24 = elements22.hasAttr("#comment");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#document" + "'", str16, "#document");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse(" class=\"\"", "org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean3 = document2.hasText();
        java.lang.String str4 = document2.title();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = document2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        org.jsoup.nodes.Element element5 = document2.prependText("hi!");
        org.jsoup.nodes.Element element7 = element5.append("hi!");
        org.jsoup.nodes.Element element9 = element7.addClass("");
        org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValue("hi! hi!hi! hi!    hi! hi!   ", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document15 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes16 = document15.attributes();
        org.jsoup.nodes.Element element18 = document15.prependText("hi!");
        org.jsoup.nodes.Element element20 = element18.append("hi!");
        org.jsoup.nodes.Document document23 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes24 = document23.attributes();
        org.jsoup.nodes.Element element26 = document23.prependText("hi!");
        org.jsoup.nodes.Element element28 = element26.append("hi!");
        java.lang.String str29 = element28.nodeName();
        org.jsoup.nodes.Element element30 = element18.appendChild((org.jsoup.nodes.Node) element28);
        java.lang.String str31 = element30.data();
        boolean boolean32 = elements12.add(element30);
        org.jsoup.select.Elements elements35 = element30.getElementsByAttributeValueEnding("[]", "#text");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#document" + "'", str29, "#document");
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(elements35);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        org.jsoup.nodes.Element element5 = document2.prependText("hi!");
        org.jsoup.nodes.Element element7 = element5.append("hi!");
        org.jsoup.nodes.Element element9 = element7.addClass("");
        java.lang.String str10 = element9.outerHtml();
        org.jsoup.nodes.Element element12 = element9.prepend("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements13 = element9.children();
        boolean boolean14 = elements13.hasText();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str10, "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("org.jsoup.select.Selector$SelectorParseException: ", " class=\"\"");
        org.jsoup.parser.Tag tag3 = document2.tag();
        java.lang.String str4 = tag3.getName();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag3, "#text");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("hi!");
        org.jsoup.select.Elements elements4 = elements3.parents();
        org.jsoup.select.Elements elements6 = elements3.html("");
        org.jsoup.select.Elements elements8 = elements3.select("hi!");
        boolean boolean10 = elements3.hasClass("#document");
        boolean boolean12 = elements3.is(".jsoup.select.Selector$SelectorParseException: ");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("hi!");
        org.jsoup.select.Elements elements4 = elements3.parents();
        java.lang.String str5 = elements4.val();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor6 = elements4.listIterator();
        java.lang.String str7 = elements4.text();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor8 = elements4.listIterator();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elementItor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elementItor8);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#comment", "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#document", "#document");
        java.lang.String str3 = document2.toString();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Element element17 = document1.prepend("");
        java.lang.String str18 = element17.toString();
        org.jsoup.nodes.Element element20 = element17.append("#document");
        org.jsoup.select.Elements elements23 = element20.getElementsByAttributeValue("\n<body>\n hi!\n</body>", "#root");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        java.lang.String str16 = element15.nodeName();
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#document" + "'", str16, "#document");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.jsoup.select.Elements elements0 = new org.jsoup.select.Elements();
        java.lang.Object[] objArray1 = elements0.toArray();
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        boolean boolean7 = elements0.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements5);
        org.jsoup.select.Elements elements9 = elements5.eq((int) (byte) 0);
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements14 = document11.getElementsByAttributeValueContaining(" class=\"\"", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean15 = elements9.remove((java.lang.Object) document11);
        java.lang.String str16 = document11.html();
        document11.setBaseUri("org");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("jsoup.select.Selector$SelectorParseException: ", "<html> \n<head> \n</head> \n<body>  \n</body>\n</html>");
        boolean boolean3 = document2.isBlock();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi!", "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.select.Elements elements4 = document2.getElementsByIndexGreaterThan((int) (byte) 100);
        org.jsoup.nodes.Element element5 = document2.body();
        org.jsoup.nodes.TextNode textNode8 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str9 = textNode8.nodeName();
        java.lang.String str10 = textNode8.getWholeText();
        boolean boolean12 = textNode8.hasAttr("hi! hi!hi! hi!    hi! hi!   ");
        java.lang.String str13 = textNode8.toString();
        java.lang.String str14 = textNode8.outerHtml();
        java.lang.String str15 = textNode8.getWholeText();
        org.jsoup.nodes.Element element16 = element5.appendChild((org.jsoup.nodes.Node) textNode8);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#text" + "'", str9, "#text");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str2 = tokenQueue1.consumeWord();
        java.lang.String[] strArray4 = new java.lang.String[] { "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" };
        boolean boolean5 = tokenQueue1.matchesAny(strArray4);
        java.lang.String str7 = tokenQueue1.consumeTo("jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str8 = tokenQueue1.remainder();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org" + "'", str2, "org");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "." + "'", str7, ".");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "jsoup.select.Selector$SelectorParseException: " + "'", str8, "jsoup.select.Selector$SelectorParseException: ");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Element element17 = document1.prepend("");
        java.lang.String str18 = element17.toString();
        org.jsoup.nodes.Element element21 = element17.attr("hi! hi!hi! hi!    hi! hi!   ", "#root");
        java.lang.String str23 = element17.attr("\n<!--#root-->");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("#document", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element4 = document2.appendElement("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse(" class=\"\"", "org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean3 = document2.hasText();
        java.lang.String str4 = document2.title();
        document2.setBaseUri("#root=\"\"");
        org.jsoup.nodes.Element element8 = document2.createElement("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements7 = document5.getElementsByTag("hi!");
        org.jsoup.select.Elements elements8 = elements7.parents();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements12 = document10.getElementsByTag("hi!");
        boolean boolean13 = elements8.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements12);
        boolean boolean14 = document3.equals((java.lang.Object) elements8);
        java.lang.String str15 = document3.toString();
        org.jsoup.nodes.Element element17 = document3.addClass("");
        org.jsoup.nodes.Attributes attributes18 = element17.attributes();
        java.lang.String str19 = attributes18.toString();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator20 = attributes18.spliterator();
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements26 = document24.getElementsByTag("hi!");
        org.jsoup.select.Elements elements27 = elements26.parents();
        org.jsoup.nodes.Document document29 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements31 = document29.getElementsByTag("hi!");
        boolean boolean32 = elements27.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements31);
        boolean boolean33 = document22.equals((java.lang.Object) elements27);
        java.lang.String str34 = document22.toString();
        org.jsoup.nodes.Element element36 = document22.addClass("");
        boolean boolean37 = attributes18.equals((java.lang.Object) document22);
        org.jsoup.nodes.Document document39 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document41 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements43 = document41.getElementsByTag("hi!");
        org.jsoup.select.Elements elements44 = elements43.parents();
        org.jsoup.nodes.Document document46 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements48 = document46.getElementsByTag("hi!");
        boolean boolean49 = elements44.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements48);
        boolean boolean50 = document39.equals((java.lang.Object) elements44);
        java.lang.String str51 = document39.toString();
        org.jsoup.nodes.Element element53 = document39.addClass("");
        org.jsoup.nodes.Attributes attributes54 = element53.attributes();
        attributes54.remove("hi!");
        org.jsoup.nodes.Document document58 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document60 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements62 = document60.getElementsByTag("hi!");
        org.jsoup.select.Elements elements63 = elements62.parents();
        org.jsoup.nodes.Document document65 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements67 = document65.getElementsByTag("hi!");
        boolean boolean68 = elements63.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements67);
        boolean boolean69 = document58.equals((java.lang.Object) elements63);
        java.lang.String str70 = document58.toString();
        org.jsoup.nodes.Element element72 = document58.addClass("");
        org.jsoup.nodes.Attributes attributes73 = element72.attributes();
        java.lang.String str74 = attributes73.toString();
        int int75 = attributes73.size();
        org.jsoup.nodes.Attribute attribute78 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        attributes73.put(attribute78);
        attributes54.put(attribute78);
        attributes18.addAll(attributes54);
        boolean boolean82 = document1.equals((java.lang.Object) attributes18);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + " class=\"\"" + "'", str19, " class=\"\"");
        org.junit.Assert.assertNotNull(attributeSpliterator20);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(attributes54);
        org.junit.Assert.assertNotNull(elements62);
        org.junit.Assert.assertNotNull(elements63);
        org.junit.Assert.assertNotNull(elements67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(element72);
        org.junit.Assert.assertNotNull(attributes73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + " class=\"\"" + "'", str74, " class=\"\"");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertNotNull(attribute78);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.jsoup.select.Elements elements0 = new org.jsoup.select.Elements();
        java.lang.Object[] objArray1 = elements0.toArray();
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        boolean boolean7 = elements0.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements5);
        org.jsoup.select.Elements elements9 = elements5.eq((int) (byte) 0);
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements14 = document11.getElementsByAttributeValueContaining(" class=\"\"", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean15 = elements9.remove((java.lang.Object) document11);
        org.jsoup.nodes.Element element17 = document11.append(" class=\"\"");
        java.lang.String str18 = element17.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements20 = element17.getElementsByClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#document" + "'", str18, "#document");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        boolean boolean3 = document1.hasAttr("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements9 = document7.getElementsByTag("hi!");
        org.jsoup.select.Elements elements10 = elements9.parents();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements14 = document12.getElementsByTag("hi!");
        boolean boolean15 = elements10.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements14);
        boolean boolean16 = document5.equals((java.lang.Object) elements10);
        java.lang.String str17 = document5.toString();
        org.jsoup.nodes.Element element19 = document5.addClass("");
        org.jsoup.nodes.Element element21 = document5.prepend("");
        org.jsoup.nodes.Element element22 = document1.prependChild((org.jsoup.nodes.Node) document5);
        java.lang.String str23 = element22.id();
        org.jsoup.nodes.Document document26 = org.jsoup.parser.Parser.parseBodyFragment("#text", "#text");
        org.jsoup.nodes.Document document29 = org.jsoup.Jsoup.parseBodyFragment("hi!", "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        java.lang.String[] strArray34 = new java.lang.String[] { "#root", "hi! hi!hi! hi!    hi! hi!   ", "org.jsoup.select.Selector$SelectorParseException: ", "" };
        java.util.LinkedHashSet<java.lang.String> strSet35 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet35, strArray34);
        org.jsoup.nodes.Element element37 = document29.classNames((java.util.Set<java.lang.String>) strSet35);
        java.lang.String str39 = document29.absUrl("#text");
        org.jsoup.nodes.Element element40 = document26.appendChild((org.jsoup.nodes.Node) document29);
        org.jsoup.select.Elements elements42 = element40.getElementsByIndexGreaterThan((int) '.');
        // The following exception was thrown during execution in test generation
        try {
            element22.replaceWith((org.jsoup.nodes.Node) element40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(elements42);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("#root", "<html> \n<head> \n</head> \n<body>  \n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        boolean boolean3 = document1.hasAttr("");
        java.lang.String str4 = document1.nodeName();
        java.lang.String str5 = document1.outerHtml();
        java.lang.String str6 = document1.outerHtml();
        org.jsoup.nodes.Element element8 = document1.html(" class=\"\"");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Attributes attributes16 = element15.attributes();
        java.lang.String str17 = attributes16.toString();
        int int18 = attributes16.size();
        org.jsoup.nodes.Attribute attribute21 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        attributes16.put(attribute21);
        java.lang.String str23 = attribute21.getKey();
        org.jsoup.nodes.Document document25 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements27 = document25.getElementsByTag("hi!");
        org.jsoup.select.Elements elements28 = elements27.parents();
        boolean boolean29 = attribute21.equals((java.lang.Object) elements27);
        org.jsoup.select.Elements elements31 = elements27.prepend("class=\"\"");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " class=\"\"" + "'", str17, " class=\"\"");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(attribute21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(elements31);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str2 = tokenQueue1.consumeWord();
        boolean boolean3 = tokenQueue1.isEmpty();
        tokenQueue1.addFirst((java.lang.Character) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org" + "'", str2, "org");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }
}


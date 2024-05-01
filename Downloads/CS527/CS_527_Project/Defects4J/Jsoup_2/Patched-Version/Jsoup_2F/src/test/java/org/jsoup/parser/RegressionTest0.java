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
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element9 = document7.prependElement("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element3.prependChild((org.jsoup.nodes.Node) element9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang.NotImplementedException; message: Cannot (yet) move nodes in tree");
        } catch (org.apache.commons.lang.NotImplementedException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element9 = document7.prependElement("hi!");
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element13 = document11.prependElement("hi!");
        org.jsoup.nodes.Element element15 = element13.append("");
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element19 = document17.prependElement("hi!");
        org.jsoup.nodes.Element[] elementArray20 = new org.jsoup.nodes.Element[] { element5, element9, element13, document17 };
        java.util.ArrayList<org.jsoup.nodes.Element> elementList21 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList21, elementArray20);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator23 = elementList21.spliterator();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elementArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(elementSpliterator23);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        // The following exception was thrown during execution in test generation
        try {
            document1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
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
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = document1.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("#root");
        org.jsoup.select.Elements elements5 = elements3.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = elements3.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("#root");
        org.jsoup.select.Elements elements5 = elements3.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element9 = document7.prependElement("hi!");
        org.jsoup.nodes.Element element11 = element9.append("");
        org.jsoup.nodes.Document document13 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str14 = document13.tagName();
        org.jsoup.nodes.Element element16 = document13.append("hi!");
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("#root");
        org.jsoup.nodes.Document document20 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements22 = document20.getElementsByTag("#root");
        org.jsoup.nodes.Element[] elementArray23 = new org.jsoup.nodes.Element[] { element9, element16, document18, document20 };
        org.jsoup.select.Elements elements24 = new org.jsoup.select.Elements(elementArray23);
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream25 = elements24.parallelStream();
        boolean boolean26 = elements5.remove((java.lang.Object) elementStream25);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#root" + "'", str14, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(elementArray23);
        org.junit.Assert.assertNotNull(elementStream25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        boolean boolean2 = document1.hasText();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor5 = elements4.listIterator();
        org.jsoup.select.Elements elements6 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements4);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element10 = document8.prependElement("hi!");
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element15 = document13.addClass("<#root>\n</#root>");
        element10.replaceWith((org.jsoup.nodes.Node) document13);
        boolean boolean17 = elements4.add((org.jsoup.nodes.Element) document13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elementItor5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element4 = document2.addClass("<#root>\n</#root>");
        org.jsoup.nodes.Element element6 = element4.getElementById("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Element element8 = element4.prependElement("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Element element7 = element3.toggleClass("#declaration");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str3 = document2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element5 = document2.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.className();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Element element6 = element5.previousElementSibling();
        java.lang.String str7 = element5.nodeName();
        org.jsoup.nodes.Element element9 = element5.appendElement("#declaration");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        java.lang.String str6 = document1.val();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.children();
        org.jsoup.select.Elements elements5 = elements3.html("#root=\"\"");
        boolean boolean7 = elements5.hasAttr("");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.Jsoup.clean("", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean("#declaration", "", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element4 = document2.addClass("<#root>\n</#root>");
        java.lang.String str5 = element4.baseUri();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements6 = document1.getElementsByClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.Jsoup.isValid("#root=\"hi!\"", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        java.lang.String str3 = document2.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element5 = document2.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element8 = document6.addClass("<#root>\n</#root>");
        element3.replaceWith((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element11 = element3.val("\n<!--#root=\"\"-->");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.jsoup.nodes.Document document2 = new org.jsoup.nodes.Document("#root");
        boolean boolean3 = document2.hasText();
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor6 = elements5.listIterator();
        org.jsoup.select.Elements elements9 = elements5.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element13 = document11.prependElement("hi!");
        org.jsoup.nodes.Element element14 = element13.parent();
        int int15 = elements5.indexOf((java.lang.Object) element14);
        org.jsoup.select.Elements elements16 = org.jsoup.select.Selector.select("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!", (java.lang.Iterable<org.jsoup.nodes.Element>) elements5);
        org.jsoup.nodes.Document document19 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str20 = document19.toString();
        java.lang.String str21 = document19.nodeName();
        java.lang.String str22 = document19.outerHtml();
        boolean boolean23 = elements16.add((org.jsoup.nodes.Element) document19);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elementItor6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str20, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#document" + "'", str21, "#document");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str22, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("", "#root");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        org.jsoup.nodes.Element element6 = document1.prependText("hi!");
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValue("#root=\"\"", "#root=\"hi!\"");
        boolean boolean10 = document1.isBlock();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.children();
        org.jsoup.select.Elements elements5 = elements3.html("#root=\"\"");
        org.jsoup.select.Elements elements7 = elements3.removeClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = elements3.attr("", "#root=\"\"=\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean("#root=\"\"", "hi!", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("", "");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("#root");
        org.jsoup.select.Elements elements5 = elements3.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = elements5.attr("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element8 = document6.addClass("<#root>\n</#root>");
        element3.replaceWith((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element10 = document6.parent();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        org.jsoup.nodes.Element element6 = document1.prependText("hi!");
        document1.setBaseUri("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element4 = document2.addClass("<#root>\n</#root>");
        org.jsoup.select.Elements elements6 = element4.getElementsByAttribute("\n<!--#root=\"\"-->");
        java.lang.String str7 = elements6.text();
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<org.jsoup.nodes.Element> elementItor9 = elements6.listIterator((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element4 = document2.addClass("<#root>\n</#root>");
        org.jsoup.select.Elements elements5 = element4.children();
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator6 = elements5.spliterator();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elementSpliterator6);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("<#root>\n</#root>");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
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
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.jsoup.nodes.Document document2 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element4 = document2.prependElement("hi!");
        org.jsoup.nodes.Element element6 = element4.append("");
        org.jsoup.select.Elements elements7 = org.jsoup.select.Selector.select("#root", element6);
        java.lang.String str8 = elements7.text();
        java.util.function.UnaryOperator<org.jsoup.nodes.Element> elementUnaryOperator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            elements7.replaceAll(elementUnaryOperator9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.select.Elements elements6 = document1.children();
        org.jsoup.select.Elements elements8 = elements6.html("#root=\"\"=\"\"");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        org.jsoup.nodes.Element element6 = document1.prependText("hi!");
        org.jsoup.select.Elements elements9 = element6.getElementsByAttributeValueStarting("<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n\n <head>\n </head>\n\n <body>\n </body>", "<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n\n <head>\n </head>\n\n <body>\n </body>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexGreaterThan((-1));
        boolean boolean5 = elements4.isEmpty();
        org.jsoup.select.Elements elements7 = elements4.append("\n<!--#root=\"\"-->");
        java.util.function.UnaryOperator<org.jsoup.nodes.Element> elementUnaryOperator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            elements7.replaceAll(elementUnaryOperator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.jsoup.nodes.Evaluator evaluator0 = null;
        org.jsoup.nodes.Document document2 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str3 = document2.tagName();
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexGreaterThan((-1));
        java.lang.String str6 = document2.toString();
        org.jsoup.nodes.Element element8 = document2.text("#root=\"hi!\"");
        org.jsoup.nodes.Element element10 = document2.prepend("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = org.jsoup.select.Collector.collect(evaluator0, (org.jsoup.nodes.Element) document2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str6, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.jsoup.nodes.Document document2 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element4 = document2.prependElement("hi!");
        org.jsoup.nodes.Element element6 = element4.append("");
        org.jsoup.select.Elements elements7 = org.jsoup.select.Selector.select("#root", element6);
        org.jsoup.nodes.Element element8 = elements7.last();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNull(element8);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.select.Elements elements6 = document1.children();
        java.lang.String str8 = document1.absUrl("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueContaining("<#root>\n</#root>", "#document");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!", "#root=\"hi!\"");
        org.jsoup.nodes.Document document4 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element6 = document4.prependElement("hi!");
        org.jsoup.nodes.Element element8 = element6.append("");
        boolean boolean9 = attribute2.equals((java.lang.Object) "");
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#document", "\n<!--#root=\"\"-->");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element4 = document2.addClass("<#root>\n</#root>");
        org.jsoup.select.Elements elements5 = element4.children();
        java.lang.String str6 = element4.nodeName();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        java.lang.String str3 = document1.html();
        org.jsoup.nodes.Element element5 = document1.append("hi!");
        org.jsoup.nodes.Element element6 = element5.parent();
        java.util.Set<java.lang.String> strSet7 = element5.classNames();
        java.util.Set<java.lang.String> strSet8 = element5.classNames();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Element element7 = element3.prepend("<#root>\n</#root>");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("#root");
        boolean boolean10 = document9.hasText();
        org.jsoup.select.Elements elements12 = document9.getElementsByIndexEquals(10);
        java.lang.Object[] objArray13 = elements12.toArray();
        org.jsoup.nodes.Document document16 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element18 = document16.prependElement("hi!");
        org.jsoup.nodes.Element element19 = element18.parent();
        org.jsoup.nodes.Element element20 = element18.empty();
        elements12.add(0, element20);
        org.jsoup.nodes.Document document23 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str24 = document23.tagName();
        org.jsoup.parser.Tag tag25 = document23.tag();
        org.jsoup.nodes.TextNode textNode28 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Node node29 = textNode28.parent();
        org.jsoup.nodes.Element element30 = document23.appendChild((org.jsoup.nodes.Node) textNode28);
        org.jsoup.select.Elements elements32 = element30.getElementsByClass("#root");
        org.jsoup.nodes.Element element33 = element20.prependChild((org.jsoup.nodes.Node) element30);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element34 = element3.appendChild((org.jsoup.nodes.Node) element30);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang.NotImplementedException; message: Cannot (yet) move nodes in tree");
        } catch (org.apache.commons.lang.NotImplementedException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#root" + "'", str24, "#root");
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(element33);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "\n<!--#root=\"\"-->");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueContaining("\n<!--#root=\"\"-->", "#root=\"hi!\"");
        int int6 = elements5.size();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element4 = document2.addClass("<#root>\n</#root>");
        org.jsoup.select.Elements elements5 = element4.children();
        org.jsoup.select.Elements elements8 = element4.getElementsByAttributeValueNot("#root", "<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n\n <head>\n </head>\n\n <body>\n </body>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("#root");
        org.jsoup.select.Elements elements5 = elements3.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.select.Elements elements7 = elements3.prepend("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        boolean boolean2 = document1.hasText();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor5 = elements4.listIterator();
        org.jsoup.select.Elements elements6 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements4);
        java.lang.Object obj7 = null;
        boolean boolean8 = elements4.remove(obj7);
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str12 = document11.nodeName();
        org.jsoup.select.Elements elements14 = document11.getElementsByIndexEquals(10);
        boolean boolean15 = elements4.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elementItor5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        java.lang.String str3 = document1.html();
        org.jsoup.nodes.Element element5 = document1.append("hi!");
        boolean boolean7 = document1.hasAttr("#declaration");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Element element2 = document1.body();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.select.Elements elements6 = document1.children();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("#root");
        boolean boolean11 = document1.equals((java.lang.Object) document8);
        org.jsoup.nodes.Element element13 = document8.append("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = document8.child(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Element element6 = element5.previousElementSibling();
        org.jsoup.nodes.Element element8 = element5.toggleClass("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Node node9 = element5.previousSibling();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str8 = document7.tagName();
        org.jsoup.nodes.Element element10 = document7.append("hi!");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("#root");
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements16 = document14.getElementsByTag("#root");
        org.jsoup.nodes.Element[] elementArray17 = new org.jsoup.nodes.Element[] { element3, element10, document12, document14 };
        org.jsoup.select.Elements elements18 = new org.jsoup.select.Elements(elementArray17);
        org.jsoup.select.Elements elements19 = new org.jsoup.select.Elements(elementArray17);
        org.jsoup.select.Elements elements20 = new org.jsoup.select.Elements(elementArray17);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#root" + "'", str8, "#root");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elementArray17);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element4 = document2.addClass("<#root>\n</#root>");
        org.jsoup.nodes.Element element6 = document2.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Node node7 = document2.parent();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        org.jsoup.nodes.Element element6 = document1.html("org.jsoup.select.Selector$SelectorParseException: hi!");
        org.jsoup.nodes.Element element8 = document1.prependText("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document1.createElement("aorg");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element4 = document2.appendElement("#data");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element4 = document2.addClass("<#root>\n</#root>");
        org.jsoup.nodes.Element element6 = document2.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str7 = element6.nodeName();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.select.Elements elements6 = document1.children();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("#root");
        boolean boolean11 = document1.equals((java.lang.Object) document8);
        org.jsoup.nodes.Element element13 = document8.createElement("\n<!--#root=\"\"-->");
        org.jsoup.nodes.Element element15 = document8.text("org.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.select.Elements elements6 = document1.children();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("#root");
        boolean boolean11 = document1.equals((java.lang.Object) document8);
        org.jsoup.nodes.Element element13 = document8.appendText("#root");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("org.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root", "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Element element4 = document2.toggleClass("org.jsoup.select.Selector$SelectorParseException: <html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element6 = element4.val("org.jsoup.select.Selector$SelectorParseException: hi!");
        java.lang.String str7 = element6.data();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = element6.getElementsByAttributeValueStarting("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        boolean boolean2 = document1.hasText();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexEquals(10);
        java.lang.Object[] objArray5 = elements4.toArray();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element10 = document8.prependElement("hi!");
        org.jsoup.nodes.Element element11 = element10.parent();
        org.jsoup.nodes.Element element12 = element10.empty();
        elements4.add(0, element12);
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str16 = document15.tagName();
        org.jsoup.parser.Tag tag17 = document15.tag();
        org.jsoup.nodes.TextNode textNode20 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Node node21 = textNode20.parent();
        org.jsoup.nodes.Element element22 = document15.appendChild((org.jsoup.nodes.Node) textNode20);
        org.jsoup.select.Elements elements24 = element22.getElementsByClass("#root");
        org.jsoup.nodes.Element element25 = element12.prependChild((org.jsoup.nodes.Node) element22);
        org.jsoup.select.Elements elements27 = element22.getElementsByAttribute("#root=\"hi!\"");
        org.jsoup.nodes.Document document29 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str30 = document29.tagName();
        org.jsoup.nodes.Element element32 = document29.append("hi!");
        java.lang.String str33 = element32.outerHtml();
        boolean boolean35 = element32.equals((java.lang.Object) 1.0f);
        java.lang.String str36 = element32.nodeName();
        org.jsoup.nodes.Element element38 = element32.wrap("#comment");
        org.jsoup.nodes.Element element39 = element22.appendChild((org.jsoup.nodes.Node) element32);
        org.jsoup.nodes.Element element41 = element39.child((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#root" + "'", str16, "#root");
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#root" + "'", str30, "#root");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str33, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#document" + "'", str36, "#document");
        org.junit.Assert.assertNull(element38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element41);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element4 = document2.addClass("<#root>\n</#root>");
        org.jsoup.nodes.Element element6 = document2.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str7 = document2.title();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean("#root", "aorg", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        org.jsoup.nodes.Element element6 = document1.prependText("hi!");
        org.jsoup.select.Elements elements8 = element6.getElementsByIndexGreaterThan((int) (short) 100);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.select.Elements elements6 = document1.children();
        java.lang.String str8 = elements6.attr("hi!");
        java.util.Collection<org.jsoup.nodes.Element> elementCollection9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = elements6.removeAll(elementCollection9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexGreaterThan((-1));
        boolean boolean5 = elements4.isEmpty();
        org.jsoup.select.Elements elements7 = elements4.append("\n<!--#root=\"\"-->");
        java.lang.String str9 = elements4.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("#root");
        java.lang.String str4 = elements3.text();
        org.jsoup.select.Elements elements7 = elements3.attr("#root", "#root");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("#root");
        boolean boolean10 = document9.hasText();
        org.jsoup.select.Elements elements12 = document9.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor13 = elements12.listIterator();
        org.jsoup.select.Elements elements16 = elements12.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element20 = document18.prependElement("hi!");
        org.jsoup.nodes.Element element21 = element20.parent();
        int int22 = elements12.indexOf((java.lang.Object) element21);
        boolean boolean23 = elements7.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements12);
        org.jsoup.nodes.Document document27 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str28 = document27.nodeName();
        org.jsoup.select.Elements elements30 = document27.getElementsByIndexEquals(10);
        java.lang.String str31 = document27.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element32 = elements7.set((int) (short) 100, (org.jsoup.nodes.Element) document27);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elementItor13);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#document" + "'", str28, "#document");
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str31, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.select.Elements elements6 = document1.children();
        org.jsoup.nodes.Element element7 = document1.empty();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("org.jsoup.select.Selector$SelectorParseException: <html>\n<head>\n</head>\n<body>\n</body>\n</html>", "");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.jsoup.nodes.Document document2 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str3 = document2.tagName();
        org.jsoup.nodes.Element element5 = document2.append("hi!");
        org.jsoup.nodes.Element element7 = document2.html("org.jsoup.select.Selector$SelectorParseException: hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = org.jsoup.select.Selector.select("#root=\"\"", element7);
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query #root=\"\"");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        boolean boolean2 = document1.hasText();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexEquals(10);
        java.lang.Object[] objArray5 = elements4.toArray();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element10 = document8.prependElement("hi!");
        org.jsoup.nodes.Element element11 = element10.parent();
        org.jsoup.nodes.Element element12 = element10.empty();
        elements4.add(0, element12);
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str16 = document15.tagName();
        org.jsoup.parser.Tag tag17 = document15.tag();
        org.jsoup.nodes.TextNode textNode20 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Node node21 = textNode20.parent();
        org.jsoup.nodes.Element element22 = document15.appendChild((org.jsoup.nodes.Node) textNode20);
        org.jsoup.select.Elements elements24 = element22.getElementsByClass("#root");
        org.jsoup.nodes.Element element25 = element12.prependChild((org.jsoup.nodes.Node) element22);
        org.jsoup.select.Elements elements27 = element22.getElementsByAttribute("#root=\"hi!\"");
        org.jsoup.nodes.Document document29 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str30 = document29.tagName();
        org.jsoup.nodes.Element element32 = document29.append("hi!");
        java.lang.String str33 = element32.outerHtml();
        boolean boolean35 = element32.equals((java.lang.Object) 1.0f);
        java.lang.String str36 = element32.nodeName();
        org.jsoup.nodes.Element element38 = element32.wrap("#comment");
        org.jsoup.nodes.Element element39 = element22.appendChild((org.jsoup.nodes.Node) element32);
        org.jsoup.select.Elements elements41 = element39.getElementsByClass("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        org.jsoup.select.Elements elements43 = elements41.eq((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#root" + "'", str16, "#root");
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#root" + "'", str30, "#root");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str33, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#document" + "'", str36, "#document");
        org.junit.Assert.assertNull(element38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(elements43);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Element element7 = element3.prepend("<#root>\n</#root>");
        org.jsoup.select.Elements elements10 = element3.getElementsByAttributeValueStarting("#root=&quot;&quot;", "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str8 = document7.tagName();
        org.jsoup.nodes.Element element10 = document7.append("hi!");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("#root");
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements16 = document14.getElementsByTag("#root");
        org.jsoup.nodes.Element[] elementArray17 = new org.jsoup.nodes.Element[] { element3, element10, document12, document14 };
        org.jsoup.select.Elements elements18 = new org.jsoup.select.Elements(elementArray17);
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream19 = elements18.parallelStream();
        java.lang.Object obj20 = null;
        boolean boolean21 = elements18.contains(obj20);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator22 = elements18.spliterator();
        org.jsoup.select.Elements elements24 = elements18.addClass("#root=&quot;&quot;");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#root" + "'", str8, "#root");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elementArray17);
        org.junit.Assert.assertNotNull(elementStream19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(elementSpliterator22);
        org.junit.Assert.assertNotNull(elements24);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("#root");
        java.lang.String str4 = elements3.text();
        org.jsoup.select.Elements elements6 = elements3.toggleClass("");
        org.jsoup.select.Elements elements7 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements6);
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element12 = document10.prependElement("hi!");
        org.jsoup.nodes.Element element14 = element12.append("");
        org.jsoup.select.Elements elements15 = org.jsoup.select.Selector.select("#root", element14);
        org.jsoup.select.Elements elements17 = elements15.prepend("\n<!--#root=\"\"-->");
        boolean boolean18 = elements6.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements15);
        org.jsoup.select.Elements elements20 = elements6.val("");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element8 = document6.addClass("<#root>\n</#root>");
        element3.replaceWith((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str12 = document11.tagName();
        java.lang.String str13 = document11.html();
        org.jsoup.nodes.Element element15 = document11.append("hi!");
        org.jsoup.nodes.Element element16 = element15.parent();
        java.util.Set<java.lang.String> strSet17 = element15.classNames();
        org.jsoup.nodes.Element element18 = element3.classNames(strSet17);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#root" + "'", str12, "#root");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str13, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        boolean boolean2 = document1.hasText();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexEquals(10);
        java.lang.Object[] objArray5 = elements4.toArray();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element10 = document8.prependElement("hi!");
        org.jsoup.nodes.Element element11 = element10.parent();
        org.jsoup.nodes.Element element12 = element10.empty();
        elements4.add(0, element12);
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str16 = document15.tagName();
        org.jsoup.parser.Tag tag17 = document15.tag();
        org.jsoup.nodes.TextNode textNode20 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Node node21 = textNode20.parent();
        org.jsoup.nodes.Element element22 = document15.appendChild((org.jsoup.nodes.Node) textNode20);
        org.jsoup.select.Elements elements24 = element22.getElementsByClass("#root");
        org.jsoup.nodes.Element element25 = element12.prependChild((org.jsoup.nodes.Node) element22);
        org.jsoup.select.Elements elements27 = element22.getElementsByAttribute("#root=\"hi!\"");
        org.jsoup.nodes.Document document29 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str30 = document29.tagName();
        org.jsoup.nodes.Element element32 = document29.append("hi!");
        java.lang.String str33 = element32.outerHtml();
        boolean boolean35 = element32.equals((java.lang.Object) 1.0f);
        java.lang.String str36 = element32.nodeName();
        org.jsoup.nodes.Element element38 = element32.wrap("#comment");
        org.jsoup.nodes.Element element39 = element22.appendChild((org.jsoup.nodes.Node) element32);
        java.lang.String str41 = element39.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#root" + "'", str16, "#root");
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#root" + "'", str30, "#root");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str33, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#document" + "'", str36, "#document");
        org.junit.Assert.assertNull(element38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        boolean boolean2 = document1.hasText();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexEquals(10);
        java.lang.Object[] objArray5 = elements4.toArray();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element10 = document8.prependElement("hi!");
        org.jsoup.nodes.Element element11 = element10.parent();
        org.jsoup.nodes.Element element12 = element10.empty();
        elements4.add(0, element12);
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str16 = document15.tagName();
        org.jsoup.parser.Tag tag17 = document15.tag();
        org.jsoup.nodes.TextNode textNode20 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Node node21 = textNode20.parent();
        org.jsoup.nodes.Element element22 = document15.appendChild((org.jsoup.nodes.Node) textNode20);
        org.jsoup.select.Elements elements24 = element22.getElementsByClass("#root");
        org.jsoup.nodes.Element element25 = element12.prependChild((org.jsoup.nodes.Node) element22);
        org.jsoup.select.Elements elements27 = element22.getElementsByAttribute("#root=\"hi!\"");
        org.jsoup.nodes.Document document29 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str30 = document29.tagName();
        org.jsoup.nodes.Element element32 = document29.append("hi!");
        java.lang.String str33 = element32.outerHtml();
        boolean boolean35 = element32.equals((java.lang.Object) 1.0f);
        java.lang.String str36 = element32.nodeName();
        org.jsoup.nodes.Element element38 = element32.wrap("#comment");
        org.jsoup.nodes.Element element39 = element22.appendChild((org.jsoup.nodes.Node) element32);
        org.jsoup.nodes.Node node40 = element32.nextSibling();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#root" + "'", str16, "#root");
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#root" + "'", str30, "#root");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str33, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#document" + "'", str36, "#document");
        org.junit.Assert.assertNull(element38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNull(node40);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element4 = document2.addClass("<#root>\n</#root>");
        org.jsoup.select.Elements elements5 = element4.children();
        java.lang.String str6 = element4.val();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Element element6 = element5.previousElementSibling();
        org.jsoup.nodes.Element element8 = element5.toggleClass("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.select.Elements elements9 = element8.getAllElements();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str6 = document1.absUrl("hi!");
        org.jsoup.select.Elements elements7 = document1.getAllElements();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element4 = document2.addClass("<#root>\n</#root>");
        org.jsoup.select.Elements elements6 = element4.getElementsByAttribute("\n<!--#root=\"\"-->");
        java.lang.String str7 = element4.outerHtml();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root\n</body>\n</html>" + "'", str7, "<html>\n<head>\n</head>\n<body>\n #root\n</body>\n</html>");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        boolean boolean2 = document1.hasText();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexEquals(10);
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str7 = document6.tagName();
        org.jsoup.parser.Tag tag8 = document6.tag();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Node node12 = textNode11.parent();
        org.jsoup.nodes.Element element13 = document6.appendChild((org.jsoup.nodes.Node) textNode11);
        org.jsoup.select.Elements elements15 = element13.getElementsByClass("#root");
        org.jsoup.nodes.Element element16 = document1.prependChild((org.jsoup.nodes.Node) element13);
        org.jsoup.select.Elements elements19 = element13.getElementsByAttributeValueNot("#text", "#document");
        org.jsoup.nodes.Element element21 = element13.appendElement("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        org.jsoup.select.Elements elements22 = element21.siblingElements();
        org.jsoup.nodes.Document document25 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        java.lang.String str27 = document25.absUrl("#root=\"\"");
        document25.title("#document");
        document25.setBaseUri("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.nodes.Element element32 = element21.appendChild((org.jsoup.nodes.Node) document25);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#root" + "'", str7, "#root");
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(element32);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        org.jsoup.nodes.Element element3 = document2.head();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexEquals(10);
        org.jsoup.nodes.Element element7 = document2.append("<!<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Element element6 = element5.previousElementSibling();
        java.lang.String str7 = element5.nodeName();
        org.jsoup.nodes.Element element10 = element5.attr("#root=\"\"=\"\"", "#comment");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Element element6 = element5.previousElementSibling();
        org.jsoup.nodes.Element element8 = element5.html("#root=\"\"");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        java.lang.String str4 = document1.outerHtml();
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.nodes.Element element7 = document1.prepend("hi");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str4, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexEquals(10);
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("", "\n<!--#root=\"\"-->");
        boolean boolean9 = document2.equals((java.lang.Object) "\n<!--#root=\"\"-->");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "\n<!--#root=\"\"-->");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueContaining("\n<!--#root=\"\"-->", "#root=\"hi!\"");
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("#root");
        boolean boolean9 = document8.hasText();
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor12 = elements11.listIterator();
        org.jsoup.select.Elements elements15 = elements11.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        org.jsoup.select.Elements elements16 = org.jsoup.select.Selector.select("#root", (java.lang.Iterable<org.jsoup.nodes.Element>) elements11);
        org.jsoup.select.Elements elements17 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements11);
        boolean boolean18 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements11);
        org.jsoup.select.Elements elements20 = elements5.addClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements22 = elements20.html("#document");
        org.jsoup.select.Elements elements25 = elements20.attr("hi", "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elementItor12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(elements25);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = element4.text();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.select.Elements elements4 = document2.getElementsByClass("<html>\n<head>\n</head>\n<body>\n #root\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements4);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element4 = element3.parent();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.nodes.Element element6 = element5.empty();
        java.lang.String str7 = element6.nodeName();
        org.jsoup.nodes.Document document9 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str10 = document9.tagName();
        org.jsoup.nodes.Element element12 = document9.append("hi!");
        java.lang.String str13 = document9.outerHtml();
        org.jsoup.select.Elements elements14 = document9.children();
        org.jsoup.nodes.Document document16 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements18 = document16.getElementsByTag("#root");
        boolean boolean19 = document9.equals((java.lang.Object) document16);
        org.jsoup.nodes.Element element21 = document16.append("#text");
        element6.replaceWith((org.jsoup.nodes.Node) document16);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str13, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "\n<!--#root=\"\"-->");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueContaining("\n<!--#root=\"\"-->", "#root=\"hi!\"");
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("#root");
        boolean boolean9 = document8.hasText();
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor12 = elements11.listIterator();
        org.jsoup.select.Elements elements15 = elements11.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        org.jsoup.select.Elements elements16 = org.jsoup.select.Selector.select("#root", (java.lang.Iterable<org.jsoup.nodes.Element>) elements11);
        org.jsoup.select.Elements elements17 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements11);
        boolean boolean18 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements11);
        org.jsoup.select.Elements elements20 = elements5.addClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements22 = elements20.html("#document");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream23 = elements20.parallelStream();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elementItor12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(elementStream23);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean("\n<!--#root=\"\"-->", "", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueStarting("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "#root=\"\"=\"\"");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("#root");
        java.lang.String str4 = elements3.text();
        org.jsoup.select.Elements elements6 = elements3.toggleClass("");
        org.jsoup.select.Elements elements7 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements6);
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element12 = document10.prependElement("hi!");
        org.jsoup.nodes.Element element14 = element12.append("");
        org.jsoup.select.Elements elements15 = org.jsoup.select.Selector.select("#root", element14);
        org.jsoup.select.Elements elements17 = elements15.prepend("\n<!--#root=\"\"-->");
        boolean boolean18 = elements6.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements15);
        org.jsoup.select.Elements elements20 = elements6.html("#declaration");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexEquals(10);
        java.lang.String str6 = document2.toString();
        org.jsoup.nodes.Element element8 = document2.append("hi!");
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element12 = document10.prependElement("hi!");
        org.jsoup.nodes.Element element13 = element12.parent();
        org.jsoup.nodes.Element element14 = element12.empty();
        org.jsoup.nodes.Element element15 = element14.empty();
        java.util.Set<java.lang.String> strSet16 = element15.classNames();
        org.jsoup.nodes.Element element17 = document2.classNames(strSet16);
        org.jsoup.nodes.Element element19 = document2.prependElement("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str6, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        boolean boolean4 = tag3.isEmpty();
        boolean boolean5 = tag3.isBlock();
        boolean boolean6 = tag3.isEmpty();
        org.jsoup.nodes.Document document9 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str10 = document9.toString();
        java.lang.String str11 = document9.nodeName();
        java.lang.String str12 = document9.outerHtml();
        org.jsoup.nodes.Element element13 = document9.body();
        boolean boolean14 = element13.hasText();
        boolean boolean15 = tag3.equals((java.lang.Object) element13);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str10, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#document" + "'", str11, "#document");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str12, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element8 = document6.addClass("<#root>\n</#root>");
        element3.replaceWith((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element11 = element3.toggleClass("#root=\"hi!\"");
        org.jsoup.nodes.Element element13 = element11.toggleClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.children();
        org.jsoup.select.Elements elements5 = elements3.html("#root=\"\"");
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator6 = elements5.spliterator();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elementSpliterator6);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n\n <head>\n </head>\n\n <body>\n </body>", "#declaration");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        java.lang.String str3 = document1.html();
        org.jsoup.nodes.Element element5 = document1.append("#root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi!", "#root=\"hi!\"");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.select.Elements elements6 = document1.children();
        java.util.Collection<org.jsoup.nodes.Element> elementCollection7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = elements6.containsAll(elementCollection7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("org.jsoup.select.Selector$SelectorParseException: <html>\n<head>\n</head>\n<body>\n</body>\n</html>", "#text");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str3 = document2.toString();
        java.lang.String str4 = document2.nodeName();
        java.lang.String str5 = document2.outerHtml();
        org.jsoup.nodes.Element element6 = document2.body();
        org.jsoup.nodes.Document document7 = document2.normalise();
        org.jsoup.nodes.Node node8 = document2.parent();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str5, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        java.lang.String str3 = document1.html();
        org.jsoup.nodes.Element element5 = document1.append("hi!");
        org.jsoup.select.Elements elements7 = element5.getElementsByIndexLessThan((int) (short) -1);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.select.Elements elements6 = document1.children();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("#root");
        boolean boolean10 = document9.hasText();
        org.jsoup.select.Elements elements12 = document9.getElementsByIndexEquals(10);
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str15 = document14.tagName();
        org.jsoup.parser.Tag tag16 = document14.tag();
        org.jsoup.nodes.TextNode textNode19 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Node node20 = textNode19.parent();
        org.jsoup.nodes.Element element21 = document14.appendChild((org.jsoup.nodes.Node) textNode19);
        org.jsoup.select.Elements elements23 = element21.getElementsByClass("#root");
        org.jsoup.nodes.Element element24 = document9.prependChild((org.jsoup.nodes.Node) element21);
        org.jsoup.select.Elements elements27 = element21.getElementsByAttributeValueNot("#text", "#document");
        org.jsoup.nodes.Element element29 = element21.appendElement("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        elements6.add((int) (byte) 1, element21);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#root" + "'", str15, "#root");
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element29);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.nodes.Element element7 = document1.prependText("#root=&quot;&quot;");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("#root=\"\"=\"\"");
        java.lang.String str2 = document1.data();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Element element6 = element5.previousElementSibling();
        java.lang.String str7 = element5.nodeName();
        org.jsoup.select.Elements elements10 = element5.getElementsByAttributeValueStarting("<!<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>", "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        org.jsoup.nodes.Element element6 = document1.prependText("hi!");
        org.jsoup.nodes.Element element8 = document1.createElement("#root=\"hi!\"");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
    }
}


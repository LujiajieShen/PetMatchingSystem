package org.jsoup.nodes;

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
            boolean boolean2 = org.jsoup.Jsoup.isValid("hi!", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Element[] elementArray3 = new org.jsoup.nodes.Element[] { document2 };
        java.util.ArrayList<org.jsoup.nodes.Element> elementList4 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList4, elementArray3);
        java.util.function.UnaryOperator<org.jsoup.nodes.Element> elementUnaryOperator6 = null;
        // The following exception was thrown during execution in test generation
        try {
            elementList4.replaceAll(elementUnaryOperator6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elementArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.jsoup.nodes.Element element0 = null;
        org.jsoup.nodes.Document document3 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Element[] elementArray4 = new org.jsoup.nodes.Element[] { document3 };
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList5, elementArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int7 = org.jsoup.nodes.Node.indexInList(element0, (java.util.List<org.jsoup.nodes.Element>) elementList5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(elementArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        boolean boolean13 = document2.hasAttr("hi!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        java.lang.String str6 = document2.text();
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str10 = document9.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            document2.replaceWith((org.jsoup.nodes.Node) document9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str10, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements5 = document2.select("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Attributes attributes12 = document6.attributes();
        java.lang.String str14 = attributes12.get("hi!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Attributes attributes12 = document6.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = document6.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = document2.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        java.lang.String str6 = document2.text();
        org.jsoup.nodes.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            document2.replaceWith(node7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.jsoup.nodes.Element element0 = null;
        org.jsoup.nodes.Document document3 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str4 = document3.outerHtml();
        org.jsoup.select.Elements elements5 = document3.getAllElements();
        org.jsoup.select.Elements elements7 = elements5.prepend("");
        org.jsoup.select.Elements elements9 = elements7.prepend("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int10 = org.jsoup.nodes.Node.indexInList(element0, (java.util.List<org.jsoup.nodes.Element>) elements9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str4, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        org.jsoup.select.Elements elements6 = elements4.prepend("");
        org.jsoup.select.Elements elements8 = elements6.prepend("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = elements8.is("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <html>?<head>?</head>?<body> hi!?</body>?</html>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream6 = elements5.stream();
        org.jsoup.select.Elements elements8 = elements5.addClass("hi");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Element> elementList11 = elements5.subList((int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elementStream6);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Element element6 = document2.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        java.lang.StringBuilder stringBuilder7 = null;
        // The following exception was thrown during execution in test generation
        try {
            element6.outerHtml(stringBuilder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.select.Elements elements14 = document2.select("hi");
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str19 = document18.outerHtml();
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node23 = document22.parentNode;
        java.lang.String str24 = document22.title();
        org.jsoup.nodes.Element element26 = document22.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element27 = document18.appendChild((org.jsoup.nodes.Node) document22);
        // The following exception was thrown during execution in test generation
        try {
            elements14.add((int) (byte) -1, element27);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str19, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element27);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi", "hi");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean("", "#document", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.select.Elements elements14 = document2.select("hi");
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node19 = document18.parentNode;
        org.jsoup.select.Elements elements21 = document18.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements23 = elements21.val("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements25 = elements23.append("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = elements14.addAll((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements23);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(elements25);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = document2.getElementsByAttributeValueStarting("", "<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Node node8 = document2.attr("hi!", "hi!");
        org.jsoup.select.Elements elements9 = document2.getAllElements();
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator10 = elements9.spliterator();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elementSpliterator10);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.jsoup.nodes.Document document3 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node4 = document3.parentNode;
        org.jsoup.select.Elements elements5 = document3.getAllElements();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements6 = org.jsoup.select.Selector.select("<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!", (java.lang.Iterable<org.jsoup.nodes.Element>) elements5);
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <html class=\" hi\">?<head class=\" hi\">?</head>?<body class=\" hi\"> hi!?</body>?</html>?<head class=\" hi\">?</head>?<body class=\" hi\"> hi!?</body>??hi!");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document2.childNodes;
        org.jsoup.select.Elements elements15 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element17 = document2.child((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.select.Elements elements14 = document2.select("hi");
        org.jsoup.select.Elements elements15 = document2.children();
        org.jsoup.nodes.Element element16 = null;
        org.jsoup.nodes.Element[] elementArray17 = new org.jsoup.nodes.Element[] { element16 };
        org.jsoup.select.Elements elements18 = new org.jsoup.select.Elements(elementArray17);
        boolean boolean19 = elements15.remove((java.lang.Object) elements18);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elementArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = document2.getElementById("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        document2.baseUri = "<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!";
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements4);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.select.Elements elements14 = document2.select("hi");
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str18 = document17.outerHtml();
        org.jsoup.select.Elements elements19 = document17.getAllElements();
        java.lang.String str20 = document17.data();
        org.jsoup.nodes.Element element22 = document17.text("");
        org.jsoup.nodes.Node node23 = document17.parentNode;
        org.jsoup.select.Elements elements25 = document17.getElementsByIndexGreaterThan((int) '4');
        boolean boolean26 = elements14.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements25);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<org.jsoup.nodes.Element> elementItor28 = elements25.listIterator(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str18, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi", "");
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node6 = document5.parentNode;
        java.lang.String str7 = document5.title();
        boolean boolean8 = attribute2.equals((java.lang.Object) str7);
        boolean boolean10 = attribute2.equals((java.lang.Object) 100L);
        java.lang.String str11 = attribute2.getValue();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Document document15 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str16 = document15.outerHtml();
        org.jsoup.select.Elements elements17 = document15.getAllElements();
        // The following exception was thrown during execution in test generation
        try {
            document2.replaceWith((org.jsoup.nodes.Node) document15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str16, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Attribute attribute8 = org.jsoup.nodes.Attribute.createFromEncoded("hi", "");
        java.lang.String str9 = attribute8.html();
        attributes5.put(attribute8);
        org.jsoup.nodes.Attribute attribute13 = org.jsoup.nodes.Attribute.createFromEncoded("hi", "");
        java.lang.String str14 = attribute13.html();
        java.lang.String str15 = attribute13.getValue();
        attributes5.put(attribute13);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi=\"\"" + "'", str9, "hi=\"\"");
        org.junit.Assert.assertNotNull(attribute13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi=\"\"" + "'", str14, "hi=\"\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Attributes attributes12 = document6.attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor13 = attributes12.iterator();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(attributeItor13);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        java.util.Set<java.lang.String> strSet4 = document2.classNames();
        java.lang.String str5 = document2.nodeName();
        java.lang.StringBuilder stringBuilder6 = null;
        // The following exception was thrown during execution in test generation
        try {
            document2.outerHtml(stringBuilder6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements7 = elements5.val("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements9 = elements7.append("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        java.lang.String str11 = elements9.attr("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        boolean boolean12 = elements9.hasText();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>\n<head>\n</head>\n<body> hi!\n</body>\n\nhi!");
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
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>", "");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document2.childNodes;
        org.jsoup.select.Elements elements15 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements17 = document2.select("#document");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Attribute attribute8 = org.jsoup.nodes.Attribute.createFromEncoded("hi", "");
        java.lang.String str9 = attribute8.html();
        attributes5.put(attribute8);
        java.lang.String str11 = attributes5.toString();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi=\"\"" + "'", str9, "hi=\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " hi=\"\"" + "'", str11, " hi=\"\"");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Element element6 = document2.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = element6.getElementsByTag("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.jsoup.nodes.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.nodes.Evaluator.IndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Document document4 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node5 = document4.parentNode;
        org.jsoup.select.Elements elements7 = document4.getElementsByIndexLessThan((int) 'a');
        boolean boolean8 = indexLessThan1.matches((org.jsoup.nodes.Element) document4);
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node12 = document11.parentNode;
        org.jsoup.select.Elements elements13 = document11.getAllElements();
        org.jsoup.select.Elements elements14 = org.jsoup.select.Collector.collect((org.jsoup.nodes.Evaluator) indexLessThan1, (org.jsoup.nodes.Element) document11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = document11.attr("", "!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        org.jsoup.nodes.Document document7 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str8 = document7.outerHtml();
        org.jsoup.select.Elements elements9 = document7.getAllElements();
        java.lang.String str10 = document7.data();
        org.jsoup.nodes.Element element12 = document7.text("");
        org.jsoup.nodes.Node node13 = document7.parentNode;
        org.jsoup.select.Elements elements15 = document7.getElementsByIndexGreaterThan((int) '4');
        org.jsoup.nodes.Element element17 = document7.text("hi=\"\"");
        org.jsoup.select.Elements elements18 = document7.children();
        org.jsoup.nodes.Element element21 = document7.attr("hi!", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>\n<head>\n</head>\n<body> hi!\n</body>\n\nhi!");
        boolean boolean22 = elements4.remove((java.lang.Object) element21);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str8, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Node node8 = document2.attr("hi!", "hi!");
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str12 = document11.outerHtml();
        org.jsoup.nodes.Document document15 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node16 = document15.parentNode;
        java.lang.String str17 = document15.title();
        org.jsoup.nodes.Element element19 = document15.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element20 = document11.appendChild((org.jsoup.nodes.Node) document15);
        org.jsoup.nodes.Node node21 = document15.parentNode;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element22 = document2.prependChild((org.jsoup.nodes.Node) document15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang.NotImplementedException; message: Cannot (yet) move nodes in tree");
        } catch (org.apache.commons.lang.NotImplementedException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str12, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Attribute attribute8 = org.jsoup.nodes.Attribute.createFromEncoded("hi", "");
        java.lang.String str9 = attribute8.html();
        attributes5.put(attribute8);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator11 = attributes5.spliterator();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi=\"\"" + "'", str9, "hi=\"\"");
        org.junit.Assert.assertNotNull(attributeSpliterator11);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.jsoup.nodes.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.nodes.Evaluator.IndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Document document4 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node5 = document4.parentNode;
        org.jsoup.select.Elements elements7 = document4.getElementsByIndexLessThan((int) 'a');
        boolean boolean8 = indexLessThan1.matches((org.jsoup.nodes.Element) document4);
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node12 = document11.parentNode;
        java.lang.String str13 = document11.title();
        org.jsoup.nodes.Attributes attributes14 = document11.attributes();
        org.jsoup.nodes.Node node17 = document11.attr("hi!", "hi!");
        org.jsoup.select.Elements elements18 = document11.getAllElements();
        boolean boolean19 = indexLessThan1.matches((org.jsoup.nodes.Element) document11);
        java.lang.String str20 = document11.id();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.jsoup.nodes.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.nodes.Evaluator.AttributeWithValueStarting("hi", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        attributeWithValueStarting2.value = "hi!";
        java.lang.String str5 = attributeWithValueStarting2.value;
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        java.lang.String str12 = document8.text();
        org.jsoup.nodes.Element element14 = document8.text("");
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str18 = document17.outerHtml();
        org.jsoup.select.Elements elements19 = document17.getAllElements();
        boolean boolean20 = element14.equals((java.lang.Object) elements19);
        boolean boolean21 = attributeWithValueStarting2.matches(element14);
        org.jsoup.nodes.Element element24 = element14.attr("hi!", "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str18, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.select.Elements elements14 = document2.select("hi");
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str18 = document17.outerHtml();
        org.jsoup.select.Elements elements19 = document17.getAllElements();
        java.lang.String str20 = document17.data();
        org.jsoup.nodes.Element element22 = document17.text("");
        org.jsoup.nodes.Node node23 = document17.parentNode;
        org.jsoup.select.Elements elements25 = document17.getElementsByIndexGreaterThan((int) '4');
        boolean boolean26 = elements14.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements25);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<org.jsoup.nodes.Element> elementItor28 = elements25.listIterator(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str18, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        boolean boolean4 = document2.isBlock();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream6 = elements5.stream();
        org.jsoup.select.Elements elements8 = elements5.addClass("hi");
        java.lang.String str9 = elements8.html();
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node13 = document12.parentNode;
        java.lang.String str14 = document12.title();
        org.jsoup.nodes.Attributes attributes15 = document12.attributes();
        org.jsoup.nodes.Node node18 = document12.attr("hi!", "hi!");
        org.jsoup.select.Elements elements19 = document12.getAllElements();
        boolean boolean20 = elements8.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements19);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elementStream6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!" + "'", str9, "<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Document document7 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str8 = document7.outerHtml();
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node12 = document11.parentNode;
        java.lang.String str13 = document11.title();
        org.jsoup.nodes.Element element15 = document11.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element16 = document7.appendChild((org.jsoup.nodes.Node) document11);
        org.jsoup.nodes.Node node17 = document11.parentNode;
        document2.setParentNode(node17);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element20 = document2.child((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str8, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.select.Elements elements14 = document2.select("hi");
        org.jsoup.select.Elements elements15 = document2.children();
        org.jsoup.parser.TokenQueue tokenQueue17 = new org.jsoup.parser.TokenQueue("hi!");
        boolean boolean19 = tokenQueue17.matchChomp("");
        java.lang.String str20 = tokenQueue17.consumeWord();
        java.lang.String str22 = tokenQueue17.chompTo("hi");
        int int23 = elements15.indexOf((java.lang.Object) "hi");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi" + "'", str20, "hi");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "!" + "'", str22, "!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document2.childNodes;
        org.jsoup.select.Elements elements15 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements17 = elements15.removeAttr("hi");
        boolean boolean19 = elements17.hasClass("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>\n<head>\n</head>\n<body> hi!\n</body>\n\nhi!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        org.jsoup.select.Elements elements6 = elements4.prepend("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str11 = document10.outerHtml();
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node15 = document14.parentNode;
        java.lang.String str16 = document14.title();
        org.jsoup.nodes.Element element18 = document14.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element19 = document10.appendChild((org.jsoup.nodes.Node) document14);
        org.jsoup.nodes.Element element20 = document14.nextElementSibling();
        org.jsoup.select.Elements elements21 = document14.siblingElements();
        org.jsoup.nodes.Element element22 = elements4.set(1, (org.jsoup.nodes.Element) document14);
        java.lang.String str23 = document14.nodeName();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str11, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNull(element20);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#document" + "'", str23, "#document");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
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
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        org.jsoup.select.Elements elements6 = elements4.prepend("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str11 = document10.outerHtml();
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node15 = document14.parentNode;
        java.lang.String str16 = document14.title();
        org.jsoup.nodes.Element element18 = document14.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element19 = document10.appendChild((org.jsoup.nodes.Node) document14);
        org.jsoup.nodes.Element element20 = document14.nextElementSibling();
        org.jsoup.select.Elements elements21 = document14.siblingElements();
        org.jsoup.nodes.Element element22 = elements4.set(1, (org.jsoup.nodes.Element) document14);
        java.util.Set<java.lang.String> strSet23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element24 = element22.classNames(strSet23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str11, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNull(element20);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element22);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node15 = document14.parentNode;
        java.lang.String str16 = document14.title();
        org.jsoup.nodes.Attributes attributes17 = document14.attributes();
        org.jsoup.nodes.Document document20 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node21 = document20.parentNode;
        org.jsoup.select.Elements elements23 = document20.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element24 = document14.prependChild((org.jsoup.nodes.Node) document20);
        org.jsoup.select.Elements elements26 = document14.select("hi");
        org.jsoup.nodes.Element element27 = document6.appendChild((org.jsoup.nodes.Node) document14);
        org.jsoup.nodes.Element element29 = element27.prependText("#document");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean("", "<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.nodeName();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        java.util.Set<java.lang.String> strSet4 = document2.classNames();
        org.jsoup.nodes.Element element5 = document2.parent();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        java.lang.String str12 = document8.text();
        org.jsoup.select.Elements elements15 = document8.getElementsByAttributeValueNot("hi=\"\"", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = element5.equals((java.lang.Object) "hi=\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(element5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Document document15 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node16 = document15.parentNode;
        java.lang.String str17 = document15.title();
        org.jsoup.nodes.Attributes attributes18 = document15.attributes();
        org.jsoup.nodes.Document document21 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node22 = document21.parentNode;
        org.jsoup.select.Elements elements24 = document21.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element25 = document15.prependChild((org.jsoup.nodes.Node) document21);
        java.lang.String str26 = document21.baseUri();
        org.jsoup.nodes.Document document29 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str30 = document29.outerHtml();
        org.jsoup.nodes.Document document33 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node34 = document33.parentNode;
        java.lang.String str35 = document33.title();
        org.jsoup.nodes.Element element37 = document33.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element38 = document29.appendChild((org.jsoup.nodes.Node) document33);
        org.jsoup.nodes.Attributes attributes39 = document33.attributes();
        document21.addChild((org.jsoup.nodes.Node) document33);
        org.jsoup.nodes.Document document42 = org.jsoup.Jsoup.parseBodyFragment("head");
        org.jsoup.nodes.Element element43 = document33.prependChild((org.jsoup.nodes.Node) document42);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element44 = element12.prependChild((org.jsoup.nodes.Node) document33);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang.NotImplementedException; message: Cannot (yet) move nodes in tree");
        } catch (org.apache.commons.lang.NotImplementedException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str30, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertNotNull(element43);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node15 = document14.parentNode;
        java.lang.String str16 = document14.title();
        org.jsoup.nodes.Attributes attributes17 = document14.attributes();
        org.jsoup.nodes.Document document20 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node21 = document20.parentNode;
        org.jsoup.select.Elements elements23 = document20.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element24 = document14.prependChild((org.jsoup.nodes.Node) document20);
        org.jsoup.select.Elements elements26 = document14.select("hi");
        org.jsoup.nodes.Element element27 = document6.appendChild((org.jsoup.nodes.Node) document14);
        org.jsoup.nodes.Element element29 = document14.addClass("#declaration");
        java.lang.StringBuilder stringBuilder30 = null;
        // The following exception was thrown during execution in test generation
        try {
            document14.indent(stringBuilder30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document2.childNodes;
        org.jsoup.select.Elements elements15 = document2.getElementsByIndexEquals((int) 'h');
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<html>\n<head>\n</head>\n<body>\n hi\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.jsoup.nodes.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.nodes.Evaluator.IndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Document document4 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node5 = document4.parentNode;
        org.jsoup.select.Elements elements7 = document4.getElementsByIndexLessThan((int) 'a');
        boolean boolean8 = indexLessThan1.matches((org.jsoup.nodes.Element) document4);
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node12 = document11.parentNode;
        java.lang.String str13 = document11.title();
        org.jsoup.nodes.Attributes attributes14 = document11.attributes();
        org.jsoup.nodes.Node node17 = document11.attr("hi!", "hi!");
        org.jsoup.select.Elements elements18 = document11.getAllElements();
        boolean boolean19 = indexLessThan1.matches((org.jsoup.nodes.Element) document11);
        org.jsoup.nodes.Element element20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = indexLessThan1.matches(element20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.jsoup.nodes.Document document3 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node4 = document3.parentNode;
        java.lang.String str5 = document3.title();
        org.jsoup.nodes.Attributes attributes6 = document3.attributes();
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node10 = document9.parentNode;
        org.jsoup.select.Elements elements12 = document9.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element13 = document3.prependChild((org.jsoup.nodes.Node) document9);
        java.lang.String str14 = document9.baseUri();
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str18 = document17.outerHtml();
        org.jsoup.nodes.Document document21 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node22 = document21.parentNode;
        java.lang.String str23 = document21.title();
        org.jsoup.nodes.Element element25 = document21.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element26 = document17.appendChild((org.jsoup.nodes.Node) document21);
        org.jsoup.nodes.Attributes attributes27 = document21.attributes();
        document9.addChild((org.jsoup.nodes.Node) document21);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements29 = org.jsoup.select.Selector.select("<!---->=\"\"", (org.jsoup.nodes.Element) document21);
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <!---->=\"\"");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str18, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(attributes27);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        java.util.Set<java.lang.String> strSet4 = document2.classNames();
        org.jsoup.nodes.Element element5 = document2.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements7 = element5.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(element5);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.jsoup.nodes.Element element0 = null;
        org.jsoup.nodes.Element[] elementArray1 = new org.jsoup.nodes.Element[] { element0 };
        org.jsoup.select.Elements elements2 = new org.jsoup.select.Elements(elementArray1);
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str7 = document6.outerHtml();
        org.jsoup.select.Elements elements8 = document6.getAllElements();
        org.jsoup.select.Elements elements10 = elements8.prepend("");
        org.jsoup.select.Elements elements12 = elements10.prepend("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        int int14 = elements12.lastIndexOf((java.lang.Object) '#');
        elements12.clear();
        boolean boolean16 = elements2.addAll(0, (java.util.Collection<org.jsoup.nodes.Element>) elements12);
        java.lang.String[] strArray18 = new java.lang.String[] { "\n<!---->" };
        java.lang.Comparable<java.lang.String>[] strComparableArray19 = elements12.toArray((java.lang.Comparable<java.lang.String>[]) strArray18);
        org.junit.Assert.assertNotNull(elementArray1);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str7, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strComparableArray19);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document2.childNodes;
        org.jsoup.select.Elements elements15 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str19 = document18.outerHtml();
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node23 = document22.parentNode;
        java.lang.String str24 = document22.title();
        org.jsoup.nodes.Element element26 = document22.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element27 = document18.appendChild((org.jsoup.nodes.Node) document22);
        org.jsoup.nodes.Attributes attributes28 = document22.attributes();
        java.lang.String str29 = document22.title();
        int int30 = elements15.lastIndexOf((java.lang.Object) document22);
        org.jsoup.nodes.Element element32 = document22.appendText("<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!");
        org.jsoup.select.Elements elements34 = element32.getElementsByClass("\n<!---->");
        java.lang.Class<?> wildcardClass35 = elements34.getClass();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str19, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document2.childNodes;
        org.jsoup.select.Elements elements15 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements17 = elements15.removeAttr("hi");
        org.jsoup.select.Elements elements18 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements15);
        org.jsoup.select.Elements elements20 = elements15.addClass("");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document2.childNodes;
        org.jsoup.select.Elements elements15 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        document2.setBaseUri("");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        java.lang.String str12 = element11.outerHtml();
        org.jsoup.select.Elements elements14 = element11.getElementsByIndexEquals((int) (byte) 0);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>" + "'", str12, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>");
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean("", "", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        java.lang.String str13 = document8.baseUri();
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str17 = document16.outerHtml();
        org.jsoup.nodes.Document document20 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node21 = document20.parentNode;
        java.lang.String str22 = document20.title();
        org.jsoup.nodes.Element element24 = document20.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element25 = document16.appendChild((org.jsoup.nodes.Node) document20);
        org.jsoup.nodes.Attributes attributes26 = document20.attributes();
        document8.addChild((org.jsoup.nodes.Node) document20);
        org.jsoup.nodes.Document document29 = org.jsoup.Jsoup.parseBodyFragment("head");
        org.jsoup.nodes.Element element30 = document20.prependChild((org.jsoup.nodes.Node) document29);
        java.lang.String str31 = document20.val();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str17, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi", "");
        attribute2.setKey("[ , !]");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        boolean boolean5 = document2.hasText();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element12 = document6.nextElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements15 = document6.getElementsByAttributeValueContaining("hi", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNull(element12);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Attribute attribute8 = org.jsoup.nodes.Attribute.createFromEncoded("hi", "");
        java.lang.String str9 = attribute8.html();
        attributes5.put(attribute8);
        java.lang.String str11 = attribute8.getValue();
        java.lang.String str12 = attribute8.getKey();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi=\"\"" + "'", str9, "hi=\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi" + "'", str12, "hi");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.Jsoup.clean("<html>\n<head>\n</head>\n<body>\n hi\n</body>\n</html>", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>\n<head>\n</head>\n<body> hi!\n</body>\n\nhi!", " hi=\"\"");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document2.childNodes;
        org.jsoup.select.Elements elements15 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str19 = document18.outerHtml();
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node23 = document22.parentNode;
        java.lang.String str24 = document22.title();
        org.jsoup.nodes.Element element26 = document22.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element27 = document18.appendChild((org.jsoup.nodes.Node) document22);
        org.jsoup.nodes.Attributes attributes28 = document22.attributes();
        java.lang.String str29 = document22.title();
        int int30 = elements15.lastIndexOf((java.lang.Object) document22);
        org.jsoup.nodes.Element element32 = document22.appendText("<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!");
        org.jsoup.nodes.Document document35 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str36 = document35.outerHtml();
        org.jsoup.select.Elements elements37 = document35.getAllElements();
        java.lang.String str38 = document35.data();
        org.jsoup.nodes.Element element40 = document35.text("");
        org.jsoup.select.Elements elements42 = element40.getElementsByIndexLessThan((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            element32.removeChild((org.jsoup.nodes.Node) element40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated expression is false");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str19, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str36, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(elements42);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.jsoup.nodes.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.nodes.Evaluator.IndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Document document4 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node5 = document4.parentNode;
        org.jsoup.select.Elements elements7 = document4.getElementsByIndexLessThan((int) 'a');
        boolean boolean8 = indexLessThan1.matches((org.jsoup.nodes.Element) document4);
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node12 = document11.parentNode;
        java.lang.String str13 = document11.title();
        org.jsoup.nodes.Attributes attributes14 = document11.attributes();
        org.jsoup.nodes.Node node17 = document11.attr("hi!", "hi!");
        org.jsoup.select.Elements elements18 = document11.getAllElements();
        boolean boolean19 = indexLessThan1.matches((org.jsoup.nodes.Element) document11);
        java.lang.String str20 = document11.title();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        org.jsoup.select.Elements elements6 = elements4.prepend("");
        org.jsoup.select.Elements elements8 = elements6.prepend("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        int int10 = elements8.lastIndexOf((java.lang.Object) '#');
        elements8.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Element> elementList14 = elements8.subList((int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.jsoup.nodes.Evaluator.Tag tag1 = new org.jsoup.nodes.Evaluator.Tag("hi!");
        org.jsoup.nodes.Document document4 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str5 = document4.outerHtml();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        java.lang.String str10 = document8.title();
        org.jsoup.nodes.Element element12 = document8.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = document4.appendChild((org.jsoup.nodes.Node) document8);
        boolean boolean14 = tag1.matches((org.jsoup.nodes.Element) document4);
        java.lang.String str15 = document4.toString();
        java.lang.String str17 = document4.attr("<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!");
        // The following exception was thrown during execution in test generation
        try {
            document4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str5, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>" + "'", str15, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.data();
        org.jsoup.nodes.Element element7 = document2.text("");
        org.jsoup.nodes.Node node8 = document2.parentNode;
        org.jsoup.select.Elements elements10 = document2.getElementsByIndexGreaterThan((int) '4');
        org.jsoup.nodes.Element element12 = document2.text("hi=\"\"");
        org.jsoup.select.Elements elements13 = document2.children();
        org.jsoup.nodes.Element element16 = document2.attr("hi!", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>\n<head>\n</head>\n<body> hi!\n</body>\n\nhi!");
        org.jsoup.nodes.Element element18 = element16.val("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>\n<head>\n</head>\n<body> hi!\n</body>\n\nhi!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        org.jsoup.select.Elements elements6 = elements4.prepend("");
        int int7 = elements6.size();
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str11 = document10.outerHtml();
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node15 = document14.parentNode;
        java.lang.String str16 = document14.title();
        org.jsoup.nodes.Element element18 = document14.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element19 = document10.appendChild((org.jsoup.nodes.Node) document14);
        org.jsoup.nodes.Attributes attributes20 = document14.attributes();
        boolean boolean22 = attributes20.hasKey("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor23 = attributes20.iterator();
        org.jsoup.nodes.Document document26 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node27 = document26.parentNode;
        java.lang.String str28 = document26.title();
        org.jsoup.nodes.Attributes attributes29 = document26.attributes();
        java.lang.String str30 = attributes29.html();
        attributes20.addAll(attributes29);
        java.lang.String str32 = attributes20.toString();
        int int33 = elements6.indexOf((java.lang.Object) attributes20);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str11, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(attributeItor23);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream6 = elements5.stream();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = elements5.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elementStream6);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueStarting("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>", "head");
        org.junit.Assert.assertNotNull(elements4);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        java.lang.String str13 = document8.baseUri();
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str17 = document16.outerHtml();
        org.jsoup.nodes.Document document20 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node21 = document20.parentNode;
        java.lang.String str22 = document20.title();
        org.jsoup.nodes.Element element24 = document20.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element25 = document16.appendChild((org.jsoup.nodes.Node) document20);
        org.jsoup.nodes.Attributes attributes26 = document20.attributes();
        document8.addChild((org.jsoup.nodes.Node) document20);
        org.jsoup.nodes.Element element29 = document20.wrap("<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!");
        org.jsoup.select.Elements elements30 = element29.getAllElements();
        org.jsoup.nodes.Element element32 = element29.prepend("<!---->=\"\"");
        java.util.List<org.jsoup.nodes.Node> nodeList33 = element29.childNodes;
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str17, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(nodeList33);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.data();
        org.jsoup.nodes.Element element7 = document2.text("");
        org.jsoup.nodes.Node node8 = document2.parentNode;
        org.jsoup.select.Elements elements10 = document2.getElementsByIndexGreaterThan((int) '4');
        org.jsoup.nodes.Element element11 = elements10.first();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNull(element11);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element12 = document6.nextElementSibling();
        org.jsoup.select.Elements elements13 = document6.siblingElements();
        boolean boolean15 = document6.hasClass("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>\n<head>\n</head>\n<body> hi!\n</body>\n\nhi!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNull(element12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document2.childNodes;
        org.jsoup.select.Elements elements15 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements17 = elements15.removeAttr("hi");
        boolean boolean19 = elements15.is("[ , !]");
        org.jsoup.nodes.DataNode dataNode22 = org.jsoup.nodes.DataNode.createFromEncoded("<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!", "");
        java.lang.String str23 = dataNode22.getWholeData();
        boolean boolean24 = elements15.contains((java.lang.Object) str23);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dataNode22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!" + "'", str23, "<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.jsoup.nodes.Evaluator.IndexEquals indexEquals1 = new org.jsoup.nodes.Evaluator.IndexEquals((int) (short) 10);
        org.jsoup.nodes.Evaluator.Tag tag3 = new org.jsoup.nodes.Evaluator.Tag("#document");
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str7 = document6.outerHtml();
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node11 = document10.parentNode;
        java.lang.String str12 = document10.title();
        org.jsoup.nodes.Element element14 = document10.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element15 = document6.appendChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Element element16 = document10.head();
        java.lang.String str17 = element16.id();
        boolean boolean18 = tag3.matches(element16);
        boolean boolean19 = indexEquals1.matches(element16);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str7, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        java.lang.String str13 = document8.baseUri();
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str17 = document16.outerHtml();
        org.jsoup.nodes.Document document20 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node21 = document20.parentNode;
        java.lang.String str22 = document20.title();
        org.jsoup.nodes.Element element24 = document20.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element25 = document16.appendChild((org.jsoup.nodes.Node) document20);
        org.jsoup.nodes.Attributes attributes26 = document20.attributes();
        document8.addChild((org.jsoup.nodes.Node) document20);
        org.jsoup.nodes.Element element29 = document20.wrap("<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!");
        org.jsoup.nodes.Element element30 = element29.firstElementSibling();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str17, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNull(element30);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document2.childNodes;
        org.jsoup.select.Elements elements15 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements17 = elements15.removeAttr("hi");
        org.jsoup.select.Elements elements18 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements17);
        org.jsoup.select.Elements elements20 = elements18.select("hi");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.jsoup.nodes.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.nodes.Evaluator.IndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Document document4 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node5 = document4.parentNode;
        org.jsoup.select.Elements elements7 = document4.getElementsByIndexLessThan((int) 'a');
        boolean boolean8 = indexLessThan1.matches((org.jsoup.nodes.Element) document4);
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node12 = document11.parentNode;
        java.lang.String str13 = document11.title();
        org.jsoup.nodes.Attributes attributes14 = document11.attributes();
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node18 = document17.parentNode;
        org.jsoup.select.Elements elements20 = document17.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element21 = document11.prependChild((org.jsoup.nodes.Node) document17);
        java.util.List<org.jsoup.nodes.Node> nodeList22 = document11.childNodes;
        org.jsoup.select.Elements elements24 = document11.getElementsByTag("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        boolean boolean25 = indexLessThan1.matches((org.jsoup.nodes.Element) document11);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.jsoup.nodes.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.nodes.Evaluator.AttributeWithValueStarting("hi", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        attributeWithValueStarting2.value = "hi!";
        java.lang.String str5 = attributeWithValueStarting2.value;
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        java.lang.String str12 = document8.text();
        org.jsoup.nodes.Element element14 = document8.text("");
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str18 = document17.outerHtml();
        org.jsoup.select.Elements elements19 = document17.getAllElements();
        boolean boolean20 = element14.equals((java.lang.Object) elements19);
        boolean boolean21 = attributeWithValueStarting2.matches(element14);
        java.lang.String str22 = element14.text();
        org.jsoup.parser.Tag tag23 = element14.tag();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str18, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(tag23);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isEmpty();
        boolean boolean3 = tag1.preserveWhitespace();
        org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parseBodyFragment("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>", "hi");
        boolean boolean7 = tag1.equals((java.lang.Object) "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi", "");
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node6 = document5.parentNode;
        java.lang.String str7 = document5.title();
        boolean boolean8 = attribute2.equals((java.lang.Object) str7);
        java.lang.String str9 = attribute2.html();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi=\"\"" + "'", str9, "hi=\"\"");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag1, "!");
        boolean boolean4 = tag1.isData();
        org.jsoup.nodes.Evaluator.Tag tag6 = new org.jsoup.nodes.Evaluator.Tag("hi!");
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str10 = document9.outerHtml();
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node14 = document13.parentNode;
        java.lang.String str15 = document13.title();
        org.jsoup.nodes.Element element17 = document13.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element18 = document9.appendChild((org.jsoup.nodes.Node) document13);
        boolean boolean19 = tag6.matches((org.jsoup.nodes.Element) document9);
        boolean boolean20 = tag1.equals((java.lang.Object) tag6);
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str10, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        java.lang.String str13 = document8.baseUri();
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str17 = document16.outerHtml();
        org.jsoup.nodes.Document document20 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node21 = document20.parentNode;
        java.lang.String str22 = document20.title();
        org.jsoup.nodes.Element element24 = document20.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element25 = document16.appendChild((org.jsoup.nodes.Node) document20);
        org.jsoup.nodes.Attributes attributes26 = document20.attributes();
        document8.addChild((org.jsoup.nodes.Node) document20);
        org.jsoup.nodes.Document document29 = org.jsoup.Jsoup.parseBodyFragment("head");
        org.jsoup.nodes.Element element30 = document20.prependChild((org.jsoup.nodes.Node) document29);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element32 = element30.child((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str17, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(element30);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream6 = elements5.stream();
        int int7 = elements5.size();
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream8 = elements5.parallelStream();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elementStream6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(elementStream8);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream6 = elements5.stream();
        org.jsoup.select.Elements elements8 = elements5.addClass("hi");
        org.jsoup.select.Elements elements9 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements8);
        org.jsoup.select.Elements elements12 = elements8.attr("head", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements14 = elements12.val("#text");
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node18 = document17.parentNode;
        java.lang.String str19 = document17.title();
        org.jsoup.nodes.Attributes attributes20 = document17.attributes();
        org.jsoup.nodes.Document document23 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node24 = document23.parentNode;
        org.jsoup.select.Elements elements26 = document23.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element27 = document17.prependChild((org.jsoup.nodes.Node) document23);
        org.jsoup.select.Elements elements29 = document23.getElementsByClass("!");
        org.jsoup.nodes.Element element31 = document23.append("hi!");
        int int32 = elements12.lastIndexOf((java.lang.Object) document23);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<org.jsoup.nodes.Element> elementItor34 = elements12.listIterator(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elementStream6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.data();
        org.jsoup.nodes.Element element7 = document2.text("");
        org.jsoup.nodes.Node node8 = document2.parentNode;
        org.jsoup.select.Elements elements10 = document2.getElementsByIndexGreaterThan((int) '4');
        org.jsoup.nodes.Element element12 = document2.text("hi=\"\"");
        org.jsoup.select.Elements elements13 = document2.children();
        org.jsoup.nodes.Element element16 = document2.attr("hi!", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>\n<head>\n</head>\n<body> hi!\n</body>\n\nhi!");
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str20 = document19.outerHtml();
        org.jsoup.select.Elements elements21 = document19.getAllElements();
        java.lang.String str22 = document19.data();
        org.jsoup.nodes.Element element24 = document19.text("");
        org.jsoup.nodes.Node node25 = document19.parentNode;
        org.jsoup.select.Elements elements27 = document19.getElementsByIndexGreaterThan((int) '4');
        org.jsoup.nodes.Element element29 = document19.text("hi=\"\"");
        boolean boolean30 = document19.hasText();
        org.jsoup.nodes.Element element32 = document19.text("hi=\"\"");
        document2.parentNode = document19;
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str20, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(element32);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Node node12 = document6.parentNode;
        java.lang.String str13 = document6.data();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        java.lang.String str6 = document2.text();
        org.jsoup.select.Elements elements9 = document2.getElementsByAttributeValueNot("hi=\"\"", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Evaluator.AttributeWithValueContaining attributeWithValueContaining12 = new org.jsoup.nodes.Evaluator.AttributeWithValueContaining("<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!", "head");
        int int13 = elements9.indexOf((java.lang.Object) "head");
        org.jsoup.nodes.Element element15 = elements9.get(0);
        java.util.Collection<org.jsoup.nodes.Element> elementCollection16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = elements9.containsAll(elementCollection16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.jsoup.nodes.Evaluator.IndexEquals indexEquals1 = new org.jsoup.nodes.Evaluator.IndexEquals(0);
        org.jsoup.nodes.Document document4 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str5 = document4.outerHtml();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        java.lang.String str10 = document8.title();
        org.jsoup.nodes.Element element12 = document8.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = document4.appendChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element14 = document8.nextElementSibling();
        org.jsoup.select.Elements elements15 = document8.siblingElements();
        org.jsoup.nodes.Attributes attributes16 = document8.attributes;
        boolean boolean17 = indexEquals1.matches((org.jsoup.nodes.Element) document8);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str5, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        java.lang.String str5 = document2.className();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.jsoup.nodes.Evaluator.Attribute attribute1 = new org.jsoup.nodes.Evaluator.Attribute("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Document document4 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node5 = document4.parentNode;
        java.lang.String str6 = document4.title();
        org.jsoup.nodes.Attributes attributes7 = document4.attributes();
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node11 = document10.parentNode;
        org.jsoup.select.Elements elements13 = document10.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element14 = document4.prependChild((org.jsoup.nodes.Node) document10);
        org.jsoup.select.Elements elements16 = document4.select("hi");
        org.jsoup.select.Elements elements17 = document4.children();
        boolean boolean18 = attribute1.matches((org.jsoup.nodes.Element) document4);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream6 = elements5.stream();
        org.jsoup.select.Elements elements8 = elements5.addClass("hi");
        java.lang.Object[] objArray9 = elements8.toArray();
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str13 = document12.outerHtml();
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node17 = document16.parentNode;
        java.lang.String str18 = document16.title();
        org.jsoup.nodes.Element element20 = document16.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element21 = document12.appendChild((org.jsoup.nodes.Node) document16);
        org.jsoup.nodes.Element element22 = document16.nextElementSibling();
        org.jsoup.select.Elements elements23 = document16.siblingElements();
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream24 = elements23.stream();
        org.jsoup.nodes.Document document27 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node28 = document27.parentNode;
        org.jsoup.select.Elements elements30 = document27.getElementsByIndexLessThan((int) 'a');
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream31 = elements30.stream();
        org.jsoup.select.Elements elements33 = elements30.addClass("hi");
        java.lang.String str34 = elements33.html();
        boolean boolean35 = elements23.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements33);
        boolean boolean36 = elements8.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements33);
        org.jsoup.nodes.Comment comment39 = new org.jsoup.nodes.Comment("", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>\n<head>\n</head>\n<body> hi!\n</body>\n\nhi!");
        java.lang.String str40 = comment39.toString();
        java.lang.String str41 = comment39.getData();
        java.lang.String str42 = comment39.toString();
        boolean boolean43 = elements8.contains((java.lang.Object) str42);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elementStream6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>, \n<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>, \n<head class=\" hi\">\n</head>, \n<body class=\" hi\"> hi!\n</body>]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>, \n<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>, \n<head class=\" hi\">\n</head>, \n<body class=\" hi\"> hi!\n</body>]");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str13, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNull(element22);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(elementStream24);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(elementStream31);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!" + "'", str34, "<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\n<!---->" + "'", str40, "\n<!---->");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\n<!---->" + "'", str42, "\n<!---->");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document2.childNodes;
        org.jsoup.select.Elements elements15 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element17 = document2.addClass("<html>\n<head>\n</head>\n<body>\n hi\n</body>\n</html>");
        org.jsoup.nodes.Node node18 = null;
        org.jsoup.nodes.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            element17.replaceChild(node18, node19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document2.childNodes;
        org.jsoup.select.Elements elements15 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements17 = elements15.removeAttr("hi");
        org.jsoup.select.Elements elements18 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements17);
        java.lang.String str19 = elements18.val();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        java.lang.String str6 = document2.text();
        org.jsoup.select.Elements elements9 = document2.getElementsByAttributeValueNot("hi=\"\"", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        java.lang.String str10 = elements9.val();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.select.Elements elements14 = document2.select("hi");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements16 = document2.select(" hi=\"\"");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query hi=\"\"");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document2.childNodes;
        boolean boolean14 = document2.hasText();
        java.lang.StringBuilder stringBuilder15 = null;
        // The following exception was thrown during execution in test generation
        try {
            document2.outerHtml(stringBuilder15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document2.childNodes;
        boolean boolean14 = document2.hasText();
        org.jsoup.nodes.Node node15 = document2.parent();
        java.lang.String str16 = document2.html();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<#root>\n<html>\n <head>\n </head>\n <body> hi!\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str16, "<#root>\n<html>\n <head>\n </head>\n <body> hi!\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.select.Elements elements14 = document8.getElementsByClass("!");
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator15 = elements14.spliterator();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elementSpliterator15);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        java.lang.String str4 = document2.title();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements7 = elements5.val("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements9 = elements7.append("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        java.lang.String str11 = elements9.attr("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        elements9.clear();
        org.jsoup.select.Elements elements13 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements9);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Node node8 = document2.attr("hi!", "hi!");
        org.jsoup.select.Elements elements9 = document2.getAllElements();
        org.jsoup.nodes.Element element11 = document2.appendElement("<html>\n<head>\n</head>\n<body>\n hi\n</body>\n</html>");
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str15 = document14.outerHtml();
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node19 = document18.parentNode;
        java.lang.String str20 = document18.title();
        org.jsoup.nodes.Element element22 = document18.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element23 = document14.appendChild((org.jsoup.nodes.Node) document18);
        org.jsoup.nodes.Node node24 = document18.parentNode;
        boolean boolean26 = node24.hasAttr("hi");
        document2.setParentNode(node24);
        org.jsoup.nodes.Node node28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element29 = document2.appendChild(node28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str15, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Attributes attributes12 = document6.attributes();
        boolean boolean14 = attributes12.hasKey("hi!");
        int int15 = attributes12.size();
        int int16 = attributes12.size();
        java.util.List<org.jsoup.nodes.Attribute> attributeList17 = attributes12.asList();
        java.lang.String str18 = attributes12.html();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator19 = attributes12.spliterator();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(attributeList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(attributeSpliterator19);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        java.lang.String str6 = document2.text();
        org.jsoup.nodes.Element element8 = document2.text("");
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str12 = document11.outerHtml();
        org.jsoup.select.Elements elements13 = document11.getAllElements();
        boolean boolean14 = element8.equals((java.lang.Object) elements13);
        boolean boolean15 = element8.isBlock();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str12, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements7 = elements5.val("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements9 = elements7.append("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements11 = elements7.addClass("<!---->=\"\"");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document2.childNodes;
        org.jsoup.select.Elements elements15 = document2.getElementsByIndexEquals((int) (byte) 0);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.select.Elements elements14 = document8.getElementsByClass("!");
        int int16 = elements14.lastIndexOf((java.lang.Object) 100.0f);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Node node13 = document8.parentNode;
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.data();
        org.jsoup.nodes.Element element7 = document2.text("");
        org.jsoup.nodes.Node node10 = document2.attr(" hi=\"\"", "!");
        java.lang.String str11 = document2.title();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.select.Elements elements6 = document2.getElementsByAttributeValueContaining("\n&lt;!----&gt;", "hi");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Attributes attributes12 = document6.attributes();
        boolean boolean14 = attributes12.hasKey("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor15 = attributes12.iterator();
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node19 = document18.parentNode;
        java.lang.String str20 = document18.title();
        org.jsoup.nodes.Attributes attributes21 = document18.attributes();
        java.lang.String str22 = attributes21.html();
        attributes12.addAll(attributes21);
        org.jsoup.parser.Tag tag25 = org.jsoup.parser.Tag.valueOf("#document");
        boolean boolean26 = attributes12.equals((java.lang.Object) tag25);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator27 = attributes12.spliterator();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributeItor15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator27);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream6 = elements5.stream();
        org.jsoup.select.Elements elements8 = elements5.addClass("hi");
        org.jsoup.select.Elements elements9 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements8);
        org.jsoup.select.Elements elements12 = elements8.attr("head", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements14 = elements12.val("#text");
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node19 = document18.parentNode;
        java.lang.String str20 = document18.title();
        org.jsoup.nodes.Attributes attributes21 = document18.attributes();
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node25 = document24.parentNode;
        org.jsoup.select.Elements elements27 = document24.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element28 = document18.prependChild((org.jsoup.nodes.Node) document24);
        // The following exception was thrown during execution in test generation
        try {
            elements14.add((int) (byte) -1, element28);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Size: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elementStream6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element28);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.jsoup.nodes.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.nodes.Evaluator.IndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Document document4 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node5 = document4.parentNode;
        org.jsoup.select.Elements elements7 = document4.getElementsByIndexLessThan((int) 'a');
        boolean boolean8 = indexLessThan1.matches((org.jsoup.nodes.Element) document4);
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node12 = document11.parentNode;
        org.jsoup.select.Elements elements13 = document11.getAllElements();
        org.jsoup.select.Elements elements14 = org.jsoup.select.Collector.collect((org.jsoup.nodes.Evaluator) indexLessThan1, (org.jsoup.nodes.Element) document11);
        org.jsoup.nodes.Element element15 = document11.body();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi! <html> <head> </head> <body> hi! </body> </html>", "<html>\n<head>\n</head>\n<body>\n hi\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element13 = document2.removeClass("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>");
        java.lang.String str14 = document2.text();
        org.jsoup.select.Elements elements17 = document2.getElementsByAttributeValueStarting("[ , !]", " hi=\"\"");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! <html> <head> </head> <body> hi! </body> </html>" + "'", str14, "hi! <html> <head> </head> <body> hi! </body> </html>");
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document2.childNodes;
        org.jsoup.select.Elements elements15 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str19 = document18.outerHtml();
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node23 = document22.parentNode;
        java.lang.String str24 = document22.title();
        org.jsoup.nodes.Element element26 = document22.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element27 = document18.appendChild((org.jsoup.nodes.Node) document22);
        org.jsoup.nodes.Attributes attributes28 = document22.attributes();
        java.lang.String str29 = document22.title();
        int int30 = elements15.lastIndexOf((java.lang.Object) document22);
        int int31 = elements15.size();
        org.jsoup.select.Elements elements33 = elements15.val("hi=\"\"");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str19, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(elements33);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        org.jsoup.select.Elements elements6 = elements4.prepend("");
        org.jsoup.select.Elements elements8 = elements6.prepend("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = elements8.select("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.jsoup.nodes.Evaluator.Tag tag1 = new org.jsoup.nodes.Evaluator.Tag("hi!");
        org.jsoup.nodes.Document document4 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str5 = document4.outerHtml();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        java.lang.String str10 = document8.title();
        org.jsoup.nodes.Element element12 = document8.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = document4.appendChild((org.jsoup.nodes.Node) document8);
        boolean boolean14 = tag1.matches((org.jsoup.nodes.Element) document4);
        java.lang.String str15 = document4.toString();
        java.lang.String str16 = document4.tagName();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str5, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>" + "'", str15, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#root" + "'", str16, "#root");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element13 = document2.removeClass("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>");
        java.lang.String str14 = document2.text();
        org.jsoup.nodes.Element element16 = document2.addClass("#document");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = element16.childNodes;
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! <html> <head> </head> <body> hi! </body> </html>" + "'", str14, "hi! <html> <head> </head> <body> hi! </body> </html>");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(nodeList17);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements6 = document2.getElementsByAttributeValueNot("", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element12 = document6.nextElementSibling();
        org.jsoup.select.Elements elements13 = document6.siblingElements();
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream14 = elements13.stream();
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!", "#comment");
        boolean boolean18 = elements13.contains((java.lang.Object) "#comment");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNull(element12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elementStream14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element12 = document6.head();
        java.lang.String str13 = element12.id();
        java.lang.String str14 = element12.nodeName();
        org.jsoup.nodes.Element element15 = element12.lastElementSibling();
        org.jsoup.select.Elements elements17 = element12.select("#text");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "head" + "'", str14, "head");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document2.childNodes;
        org.jsoup.select.Elements elements15 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str19 = document18.outerHtml();
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node23 = document22.parentNode;
        java.lang.String str24 = document22.title();
        org.jsoup.nodes.Element element26 = document22.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element27 = document18.appendChild((org.jsoup.nodes.Node) document22);
        org.jsoup.nodes.Attributes attributes28 = document22.attributes();
        java.lang.String str29 = document22.title();
        int int30 = elements15.lastIndexOf((java.lang.Object) document22);
        org.jsoup.nodes.Element element32 = document22.appendText("<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!");
        org.jsoup.select.Elements elements34 = element32.getElementsByClass("\n<!---->");
        org.jsoup.nodes.Document document37 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str38 = document37.outerHtml();
        org.jsoup.nodes.Document document41 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node42 = document41.parentNode;
        java.lang.String str43 = document41.title();
        org.jsoup.nodes.Element element45 = document41.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element46 = document37.appendChild((org.jsoup.nodes.Node) document41);
        org.jsoup.nodes.Element element47 = document41.nextElementSibling();
        org.jsoup.select.Elements elements48 = document41.siblingElements();
        boolean boolean50 = elements48.hasClass("\n<!---->");
        int int51 = elements34.lastIndexOf((java.lang.Object) boolean50);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str19, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str38, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNull(element47);
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements6 = document2.getElementsByAttributeValueContaining("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>", " !");
        org.jsoup.select.Elements elements9 = document2.getElementsByAttributeValueNot("hi=\"\"", "#root");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements7 = elements5.val("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream8 = elements5.stream();
        org.jsoup.select.Elements elements10 = elements5.toggleClass("#document");
        java.util.Iterator<org.jsoup.nodes.Element> elementItor11 = elements5.iterator();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elementStream8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elementItor11);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.parser.Tag tag12 = element11.tag();
        boolean boolean13 = tag12.isInline();
        boolean boolean14 = tag12.isInline();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element13 = document2.removeClass("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>");
        java.lang.String str14 = element13.className();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements7 = elements5.val("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        java.lang.String str9 = elements5.attr(" hi=\"\"");
        java.lang.String str10 = elements5.val();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str10, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.jsoup.nodes.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.nodes.Evaluator.AttributeWithValueEnding("\n<!---->", "hi!");
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str6 = document5.outerHtml();
        document5.setBaseUri("hi");
        boolean boolean9 = attributeWithValueEnding2.matches((org.jsoup.nodes.Element) document5);
        org.jsoup.nodes.Element element10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = attributeWithValueEnding2.matches(element10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str6, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document2.childNodes;
        org.jsoup.select.Elements elements15 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements17 = elements15.removeAttr("hi");
        org.jsoup.select.Elements elements18 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements15);
        org.jsoup.select.Elements elements20 = elements15.val("[ , !]");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        int int6 = elements5.size();
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str10 = document9.outerHtml();
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node14 = document13.parentNode;
        java.lang.String str15 = document13.title();
        org.jsoup.nodes.Element element17 = document13.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element18 = document9.appendChild((org.jsoup.nodes.Node) document13);
        org.jsoup.nodes.Element element19 = document13.head();
        org.jsoup.nodes.Evaluator.IndexLessThan indexLessThan21 = new org.jsoup.nodes.Evaluator.IndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node25 = document24.parentNode;
        org.jsoup.select.Elements elements27 = document24.getElementsByIndexLessThan((int) 'a');
        boolean boolean28 = indexLessThan21.matches((org.jsoup.nodes.Element) document24);
        boolean boolean29 = element19.equals((java.lang.Object) boolean28);
        int int30 = elements5.lastIndexOf((java.lang.Object) boolean28);
        org.jsoup.nodes.Document document34 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node35 = document34.parentNode;
        org.jsoup.select.Elements elements37 = document34.getElementsByIndexLessThan((int) 'a');
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream38 = elements37.stream();
        int int39 = elements37.size();
        boolean boolean41 = elements37.hasAttr("<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean42 = elements5.addAll((int) (byte) 10, (java.util.Collection<org.jsoup.nodes.Element>) elements37);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str10, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(elementStream38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4 + "'", int39 == 4);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.select.Elements elements14 = document2.select("hi");
        org.jsoup.select.Elements elements15 = document2.children();
        java.lang.String str17 = elements15.attr("<#root>\n<html>\n <head>\n </head>\n <body> hi!\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.select.Elements elements3 = document2.getAllElements();
        org.jsoup.select.Elements elements5 = document2.getElementsByTag("<#root>\n<html>\n <head>\n </head>\n <body> hi!\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element12 = document6.head();
        boolean boolean14 = document6.hasAttr("head");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        java.lang.String str6 = document2.text();
        org.jsoup.nodes.Element element8 = document2.text("");
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str12 = document11.outerHtml();
        org.jsoup.select.Elements elements13 = document11.getAllElements();
        boolean boolean14 = element8.equals((java.lang.Object) elements13);
        java.lang.String str15 = elements13.html();
        org.jsoup.select.Selector.SelectorParseException selectorParseException17 = new org.jsoup.select.Selector.SelectorParseException("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>");
        org.jsoup.select.Selector.SelectorParseException selectorParseException19 = new org.jsoup.select.Selector.SelectorParseException("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>");
        selectorParseException17.addSuppressed((java.lang.Throwable) selectorParseException19);
        java.lang.Throwable[] throwableArray21 = selectorParseException17.getSuppressed();
        boolean boolean22 = elements13.remove((java.lang.Object) throwableArray21);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str12, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>\n<head>\n</head>\n<body> hi!\n</body>\n\nhi!" + "'", str15, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>\n<head>\n</head>\n<body> hi!\n</body>\n\nhi!");
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element13 = document2.removeClass("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>");
        java.lang.String str14 = document2.text();
        org.jsoup.nodes.Element element16 = document2.addClass("#document");
        java.lang.String str17 = element16.baseUri;
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! <html> <head> </head> <body> hi! </body> </html>" + "'", str14, "hi! <html> <head> </head> <body> hi! </body> </html>");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.jsoup.nodes.Document document3 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str4 = document3.outerHtml();
        org.jsoup.select.Elements elements5 = document3.getAllElements();
        org.jsoup.select.Elements elements7 = elements5.prepend("");
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str12 = document11.outerHtml();
        org.jsoup.nodes.Document document15 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node16 = document15.parentNode;
        java.lang.String str17 = document15.title();
        org.jsoup.nodes.Element element19 = document15.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element20 = document11.appendChild((org.jsoup.nodes.Node) document15);
        org.jsoup.nodes.Element element21 = document15.nextElementSibling();
        org.jsoup.select.Elements elements22 = document15.siblingElements();
        org.jsoup.nodes.Element element23 = elements5.set(1, (org.jsoup.nodes.Element) document15);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator24 = elements5.spliterator();
        org.jsoup.select.Elements elements25 = org.jsoup.select.Selector.select("[ , !]", (java.lang.Iterable<org.jsoup.nodes.Element>) elements5);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str4, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str12, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNull(element21);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elementSpliterator24);
        org.junit.Assert.assertNotNull(elements25);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element12 = document6.head();
        java.lang.String str13 = element12.id();
        java.util.List<org.jsoup.nodes.Element> elementList14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int15 = org.jsoup.nodes.Node.indexInList(element12, elementList14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.Jsoup.isValid("<!---->=\"\"", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.jsoup.nodes.Evaluator.Class class1 = new org.jsoup.nodes.Evaluator.Class("");
        org.jsoup.nodes.Document document4 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str5 = document4.outerHtml();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        java.lang.String str10 = document8.title();
        org.jsoup.nodes.Element element12 = document8.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = document4.appendChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element15 = document4.removeClass("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>");
        java.lang.String str16 = document4.text();
        org.jsoup.select.Elements elements18 = document4.getElementsByIndexLessThan((int) (byte) 1);
        document4.title(" !");
        boolean boolean21 = class1.matches((org.jsoup.nodes.Element) document4);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str5, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! <html> <head> </head> <body> hi! </body> </html>" + "'", str16, "hi! <html> <head> </head> <body> hi! </body> </html>");
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        int int2 = document1.nodeDepth();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.Jsoup.clean("[!]", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        boolean boolean6 = elements4.hasAttr("!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.jsoup.nodes.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.nodes.Evaluator.IndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Document document4 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node5 = document4.parentNode;
        org.jsoup.select.Elements elements7 = document4.getElementsByIndexLessThan((int) 'a');
        boolean boolean8 = indexLessThan1.matches((org.jsoup.nodes.Element) document4);
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node12 = document11.parentNode;
        org.jsoup.select.Elements elements13 = document11.getAllElements();
        org.jsoup.select.Elements elements14 = org.jsoup.select.Collector.collect((org.jsoup.nodes.Evaluator) indexLessThan1, (org.jsoup.nodes.Element) document11);
        org.jsoup.nodes.Element element15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = indexLessThan1.matches(element15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document2.childNodes;
        boolean boolean14 = document2.hasText();
        org.jsoup.nodes.Node node15 = document2.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList16 = node15.childNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element12 = document6.nextElementSibling();
        org.jsoup.select.Elements elements13 = document6.siblingElements();
        org.jsoup.nodes.Attributes attributes14 = document6.attributes;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = attributes14.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNull(element12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi", "");
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node6 = document5.parentNode;
        java.lang.String str7 = document5.title();
        boolean boolean8 = attribute2.equals((java.lang.Object) str7);
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node12 = document11.parentNode;
        org.jsoup.select.Elements elements14 = document11.getElementsByIndexLessThan((int) 'a');
        java.lang.String str15 = document11.text();
        org.jsoup.select.Elements elements18 = document11.getElementsByAttributeValueNot("hi=\"\"", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        boolean boolean19 = attribute2.equals((java.lang.Object) elements18);
        attribute2.setValue("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>\n<head>\n</head>\n<body> hi!\n</body>\n\nhi!");
        java.lang.String str22 = attribute2.getValue();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>\n<head>\n</head>\n<body> hi!\n</body>\n\nhi!" + "'", str22, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>\n<head>\n</head>\n<body> hi!\n</body>\n\nhi!");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        java.lang.String str6 = document2.text();
        org.jsoup.select.Elements elements9 = document2.getElementsByAttributeValueNot("hi=\"\"", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.select.Elements elements13 = document12.getAllElements();
        org.jsoup.select.Elements elements15 = document12.getElementsByIndexLessThan((int) (short) 10);
        boolean boolean16 = elements9.equals((java.lang.Object) elements15);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.jsoup.nodes.Document document3 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str4 = document3.outerHtml();
        org.jsoup.nodes.Document document7 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node8 = document7.parentNode;
        java.lang.String str9 = document7.title();
        org.jsoup.nodes.Element element11 = document7.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element12 = document3.appendChild((org.jsoup.nodes.Node) document7);
        org.jsoup.nodes.Element element13 = document7.nextElementSibling();
        org.jsoup.select.Elements elements14 = document7.siblingElements();
        boolean boolean16 = elements14.hasClass("\n<!---->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements17 = org.jsoup.select.Selector.select(" !", (java.lang.Iterable<org.jsoup.nodes.Element>) elements14);
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query !");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str4, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(element13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element13 = document2.removeClass("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>");
        java.lang.String str14 = document2.text();
        org.jsoup.select.Elements elements16 = document2.getElementsByIndexLessThan((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element18 = elements16.get((int) 'h');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 104, Size: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! <html> <head> </head> <body> hi! </body> </html>" + "'", str14, "hi! <html> <head> </head> <body> hi! </body> </html>");
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi", "");
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node6 = document5.parentNode;
        java.lang.String str7 = document5.title();
        boolean boolean8 = attribute2.equals((java.lang.Object) str7);
        boolean boolean10 = attribute2.equals((java.lang.Object) 100L);
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str14 = document13.outerHtml();
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node18 = document17.parentNode;
        java.lang.String str19 = document17.title();
        org.jsoup.nodes.Element element21 = document17.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element22 = document13.appendChild((org.jsoup.nodes.Node) document17);
        org.jsoup.nodes.Attributes attributes23 = document17.attributes();
        boolean boolean24 = attribute2.equals((java.lang.Object) attributes23);
        java.lang.String str25 = attribute2.html();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str14, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi=\"\"" + "'", str25, "hi=\"\"");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("\n<!---->", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>\n<head>\n</head>\n<body> hi!\n</body>\n\nhi!");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Node node8 = document2.attr("hi!", "hi!");
        org.jsoup.select.Elements elements9 = document2.getAllElements();
        org.jsoup.nodes.Element element11 = document2.appendElement("<html>\n<head>\n</head>\n<body>\n hi\n</body>\n</html>");
        java.lang.String str12 = document2.val();
        org.jsoup.nodes.Element element14 = document2.wrap("#comment");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document2.childNodes;
        org.jsoup.select.Elements elements15 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element17 = document2.addClass("<html>\n<head>\n</head>\n<body>\n hi\n</body>\n</html>");
        boolean boolean18 = element17.preserveWhitespace();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Attributes attributes12 = document6.attributes();
        boolean boolean14 = attributes12.hasKey("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor15 = attributes12.iterator();
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node19 = document18.parentNode;
        java.lang.String str20 = document18.title();
        org.jsoup.nodes.Attributes attributes21 = document18.attributes();
        java.lang.String str22 = attributes21.html();
        attributes12.addAll(attributes21);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor24 = attributes12.iterator();
        org.jsoup.nodes.Document document27 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str28 = document27.outerHtml();
        org.jsoup.nodes.Document document31 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node32 = document31.parentNode;
        java.lang.String str33 = document31.title();
        org.jsoup.nodes.Element element35 = document31.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element36 = document27.appendChild((org.jsoup.nodes.Node) document31);
        org.jsoup.nodes.Attributes attributes37 = document31.attributes();
        boolean boolean39 = attributes37.hasKey("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor40 = attributes37.iterator();
        org.jsoup.nodes.Document document43 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node44 = document43.parentNode;
        java.lang.String str45 = document43.title();
        org.jsoup.nodes.Attributes attributes46 = document43.attributes();
        java.lang.String str47 = attributes46.html();
        attributes37.addAll(attributes46);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor49 = attributes46.iterator();
        attributes12.addAll(attributes46);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator51 = attributes46.spliterator();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributeItor15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(attributeItor24);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str28, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(attributeItor40);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(attributes46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(attributeItor49);
        org.junit.Assert.assertNotNull(attributeSpliterator51);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        org.jsoup.select.Elements elements6 = elements4.prepend("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str11 = document10.outerHtml();
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node15 = document14.parentNode;
        java.lang.String str16 = document14.title();
        org.jsoup.nodes.Element element18 = document14.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element19 = document10.appendChild((org.jsoup.nodes.Node) document14);
        org.jsoup.nodes.Element element20 = document14.nextElementSibling();
        org.jsoup.select.Elements elements21 = document14.siblingElements();
        org.jsoup.nodes.Element element22 = elements4.set(1, (org.jsoup.nodes.Element) document14);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator23 = elements4.spliterator();
        org.jsoup.nodes.Document document26 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node27 = document26.parentNode;
        org.jsoup.select.Elements elements29 = document26.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements31 = elements29.val("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream32 = elements29.stream();
        org.jsoup.select.Elements elements34 = elements29.toggleClass("#document");
        java.util.Iterator<org.jsoup.nodes.Element> elementItor35 = elements34.iterator();
        org.jsoup.select.Elements elements37 = elements34.removeAttr("#comment");
        boolean boolean38 = elements4.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements34);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str11, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNull(element20);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elementSpliterator23);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(elementStream32);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(elementItor35);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Attributes attributes12 = document6.attributes();
        boolean boolean14 = attributes12.hasKey("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor15 = attributes12.iterator();
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node19 = document18.parentNode;
        java.lang.String str20 = document18.title();
        org.jsoup.nodes.Attributes attributes21 = document18.attributes();
        java.lang.String str22 = attributes21.html();
        attributes12.addAll(attributes21);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor24 = attributes12.iterator();
        org.jsoup.nodes.Document document27 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str28 = document27.outerHtml();
        org.jsoup.nodes.Document document31 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node32 = document31.parentNode;
        java.lang.String str33 = document31.title();
        org.jsoup.nodes.Element element35 = document31.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element36 = document27.appendChild((org.jsoup.nodes.Node) document31);
        org.jsoup.nodes.Attributes attributes37 = document31.attributes();
        boolean boolean39 = attributes37.hasKey("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor40 = attributes37.iterator();
        org.jsoup.nodes.Document document43 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node44 = document43.parentNode;
        java.lang.String str45 = document43.title();
        org.jsoup.nodes.Attributes attributes46 = document43.attributes();
        java.lang.String str47 = attributes46.html();
        attributes37.addAll(attributes46);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor49 = attributes46.iterator();
        attributes12.addAll(attributes46);
        java.lang.String str51 = attributes12.html();
        java.lang.String str52 = attributes12.html();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributeItor15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(attributeItor24);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str28, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(attributeItor40);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(attributes46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(attributeItor49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>\n<head>\n</head>\n<body> hi!\n</body>\n\nhi!", "<html>\n<head>\n</head>\n<body>\n [ , !]\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        java.lang.String str6 = document2.text();
        org.jsoup.nodes.Element element8 = document2.text("");
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str12 = document11.outerHtml();
        org.jsoup.select.Elements elements13 = document11.getAllElements();
        boolean boolean14 = element8.equals((java.lang.Object) elements13);
        boolean boolean16 = element8.hasClass("<html>\n<head>\n</head>\n<body>\n hi\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str12, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.baseUri();
        org.jsoup.select.Elements elements5 = document1.getElementsByTag("head");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str2, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document2.childNodes;
        org.jsoup.select.Elements elements15 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements17 = elements15.removeAttr("hi");
        org.jsoup.select.Elements elements18 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements15);
        boolean boolean20 = elements15.remove((java.lang.Object) 100L);
        java.util.function.UnaryOperator<org.jsoup.nodes.Element> elementUnaryOperator21 = null;
        // The following exception was thrown during execution in test generation
        try {
            elements15.replaceAll(elementUnaryOperator21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        org.jsoup.nodes.Element element6 = document2.createElement("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements7 = element6.getAllElements();
        org.jsoup.nodes.Node node9 = element6.removeAttr("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream6 = elements5.stream();
        org.jsoup.select.Elements elements8 = elements5.addClass("hi");
        org.jsoup.select.Elements elements9 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements8);
        org.jsoup.select.Elements elements12 = elements8.attr("head", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements14 = elements12.val("#text");
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node19 = document18.parentNode;
        java.lang.String str20 = document18.title();
        org.jsoup.nodes.Attributes attributes21 = document18.attributes();
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node25 = document24.parentNode;
        org.jsoup.select.Elements elements27 = document24.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element28 = document18.prependChild((org.jsoup.nodes.Node) document24);
        java.lang.String str29 = document24.baseUri();
        org.jsoup.nodes.Document document32 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str33 = document32.outerHtml();
        org.jsoup.nodes.Document document36 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node37 = document36.parentNode;
        java.lang.String str38 = document36.title();
        org.jsoup.nodes.Element element40 = document36.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element41 = document32.appendChild((org.jsoup.nodes.Node) document36);
        org.jsoup.nodes.Attributes attributes42 = document36.attributes();
        document24.addChild((org.jsoup.nodes.Node) document36);
        org.jsoup.nodes.Element element45 = document36.wrap("<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!");
        org.jsoup.nodes.Node node46 = element45.parentNode;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element47 = elements14.set((-1), element45);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elementStream6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str33, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(node46);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.select.Elements elements14 = document2.select("hi");
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str18 = document17.outerHtml();
        org.jsoup.select.Elements elements19 = document17.getAllElements();
        java.lang.String str20 = document17.data();
        org.jsoup.nodes.Element element22 = document17.text("");
        org.jsoup.nodes.Node node23 = document17.parentNode;
        org.jsoup.select.Elements elements25 = document17.getElementsByIndexGreaterThan((int) '4');
        boolean boolean26 = elements14.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements25);
        org.jsoup.select.Elements elements28 = elements25.select(" hi=\"\"");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str18, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(elements28);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag1, "!");
        boolean boolean4 = tag1.isData();
        org.jsoup.nodes.Document document7 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node8 = document7.parentNode;
        org.jsoup.select.Elements elements10 = document7.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements12 = elements10.val("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements14 = elements12.append("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        java.lang.String str16 = elements14.attr("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        boolean boolean17 = tag1.equals((java.lang.Object) "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        java.lang.String str18 = tag1.toString();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element(tag1, "[ , !]");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements7 = elements5.append("hi=\"\"");
        int int8 = elements5.size();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document2.childNodes;
        org.jsoup.select.Elements elements15 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str19 = document18.outerHtml();
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node23 = document22.parentNode;
        java.lang.String str24 = document22.title();
        org.jsoup.nodes.Element element26 = document22.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element27 = document18.appendChild((org.jsoup.nodes.Node) document22);
        org.jsoup.nodes.Attributes attributes28 = document22.attributes();
        java.lang.String str29 = document22.title();
        int int30 = elements15.lastIndexOf((java.lang.Object) document22);
        org.jsoup.select.Elements elements32 = elements15.eq((int) '#');
        java.lang.String str33 = elements15.html();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str19, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.select.Elements elements14 = document2.select("hi");
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str18 = document17.outerHtml();
        org.jsoup.select.Elements elements19 = document17.getAllElements();
        java.lang.String str20 = document17.data();
        org.jsoup.nodes.Element element22 = document17.text("");
        org.jsoup.nodes.Node node23 = document17.parentNode;
        org.jsoup.select.Elements elements25 = document17.getElementsByIndexGreaterThan((int) '4');
        boolean boolean26 = elements14.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements25);
        org.jsoup.select.Elements elements28 = elements14.removeClass("");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str18, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(elements28);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.Jsoup.clean("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>\n<head>\n</head>\n<body> hi!\n</body>\n\nhi!", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Element element6 = document2.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        java.lang.String str7 = document2.val();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.preserveWhitespace();
        java.lang.String str3 = tag1.toString();
        org.jsoup.nodes.Document document7 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node8 = document7.parentNode;
        java.lang.String str9 = document7.title();
        org.jsoup.nodes.Attributes attributes10 = document7.attributes();
        java.lang.String str11 = attributes10.html();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag1, "!", attributes10);
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.jsoup.nodes.Evaluator.Tag tag1 = new org.jsoup.nodes.Evaluator.Tag("#document");
        org.jsoup.nodes.Evaluator.IndexLessThan indexLessThan3 = new org.jsoup.nodes.Evaluator.IndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        org.jsoup.select.Elements elements9 = document6.getElementsByIndexLessThan((int) 'a');
        boolean boolean10 = indexLessThan3.matches((org.jsoup.nodes.Element) document6);
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node14 = document13.parentNode;
        org.jsoup.select.Elements elements15 = document13.getAllElements();
        org.jsoup.select.Elements elements16 = org.jsoup.select.Collector.collect((org.jsoup.nodes.Evaluator) indexLessThan3, (org.jsoup.nodes.Element) document13);
        boolean boolean17 = tag1.matches((org.jsoup.nodes.Element) document13);
        document13.baseUri = "hi=\"\"";
        org.jsoup.nodes.Element element21 = document13.appendText("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements24 = document13.getElementsByAttributeValueContaining("", "\n<!---->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream6 = elements5.stream();
        org.jsoup.select.Elements elements8 = elements5.addClass("hi");
        org.jsoup.select.Elements elements9 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements8);
        org.jsoup.select.Elements elements12 = elements8.attr("head", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements14 = elements12.val("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = elements12.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elementStream6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Attributes attributes12 = document6.attributes();
        boolean boolean14 = attributes12.hasKey("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor15 = attributes12.iterator();
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node19 = document18.parentNode;
        java.lang.String str20 = document18.title();
        org.jsoup.nodes.Attributes attributes21 = document18.attributes();
        java.lang.String str22 = attributes21.html();
        attributes12.addAll(attributes21);
        attributes12.remove(" hi=\"\"");
        org.jsoup.nodes.Document document28 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str29 = document28.outerHtml();
        org.jsoup.nodes.Document document32 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node33 = document32.parentNode;
        java.lang.String str34 = document32.title();
        org.jsoup.nodes.Element element36 = document32.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element37 = document28.appendChild((org.jsoup.nodes.Node) document32);
        org.jsoup.nodes.Attributes attributes38 = document32.attributes();
        boolean boolean40 = attributes38.hasKey("hi!");
        int int41 = attributes38.size();
        int int42 = attributes38.size();
        attributes12.addAll(attributes38);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributeItor15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str29, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements7 = elements5.val("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream8 = elements5.stream();
        org.jsoup.select.Elements elements10 = elements5.toggleClass("#document");
        org.jsoup.select.Elements elements12 = elements5.addClass("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Document document15 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str16 = document15.outerHtml();
        org.jsoup.select.Elements elements17 = document15.getAllElements();
        org.jsoup.select.Elements elements19 = elements17.append("#document");
        int int20 = elements5.indexOf((java.lang.Object) "#document");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elementStream8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str16, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Node node12 = document6.parentNode;
        org.jsoup.nodes.Element[] elementArray13 = new org.jsoup.nodes.Element[] { document6 };
        org.jsoup.select.Elements elements14 = new org.jsoup.select.Elements(elementArray13);
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node19 = document18.parentNode;
        java.lang.String str20 = document18.title();
        org.jsoup.nodes.Attributes attributes21 = document18.attributes();
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node25 = document24.parentNode;
        org.jsoup.select.Elements elements27 = document24.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element28 = document18.prependChild((org.jsoup.nodes.Node) document24);
        java.util.List<org.jsoup.nodes.Node> nodeList29 = document18.childNodes;
        org.jsoup.select.Elements elements31 = document18.getElementsByTag("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Document document34 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str35 = document34.outerHtml();
        org.jsoup.nodes.Document document38 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node39 = document38.parentNode;
        java.lang.String str40 = document38.title();
        org.jsoup.nodes.Element element42 = document38.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element43 = document34.appendChild((org.jsoup.nodes.Node) document38);
        org.jsoup.nodes.Attributes attributes44 = document38.attributes();
        java.lang.String str45 = document38.title();
        int int46 = elements31.lastIndexOf((java.lang.Object) document38);
        org.jsoup.select.Elements elements48 = elements31.eq((int) '#');
        boolean boolean49 = elements14.addAll(0, (java.util.Collection<org.jsoup.nodes.Element>) elements48);
        java.lang.Object[] objArray50 = elements14.toArray();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(elementArray13);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str35, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>]");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        java.lang.String str6 = attributes5.html();
        java.lang.String str7 = attributes5.toString();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor8 = attributes5.iterator();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(attributeItor8);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi", "hi");
        java.lang.String str3 = document2.baseUri();
        java.lang.String str4 = document2.html();
        org.jsoup.nodes.Document document5 = document2.normalise();
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        java.lang.String str8 = document7.baseUri();
        document5.addChild((org.jsoup.nodes.Node) document7);
        java.lang.String str11 = document5.attr("head");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi" + "'", str3, "hi");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html>\n<head>\n</head>\n<body>\n hi\n</body>\n</html>" + "'", str4, "<html>\n<head>\n</head>\n<body>\n hi\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str8, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Document document12 = document2.normalise();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(document12);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.jsoup.nodes.Evaluator.AllElements allElements0 = new org.jsoup.nodes.Evaluator.AllElements();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parseBodyFragment("hi", "hi");
        boolean boolean4 = allElements0.matches((org.jsoup.nodes.Element) document3);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream6 = elements5.stream();
        int int7 = elements5.size();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Element> elementList10 = elements5.subList((int) (short) 0, (int) 'h');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 104");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elementStream6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element12 = document6.head();
        org.jsoup.nodes.Evaluator.Tag tag14 = new org.jsoup.nodes.Evaluator.Tag("#document");
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str18 = document17.outerHtml();
        org.jsoup.nodes.Document document21 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node22 = document21.parentNode;
        java.lang.String str23 = document21.title();
        org.jsoup.nodes.Element element25 = document21.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element26 = document17.appendChild((org.jsoup.nodes.Node) document21);
        org.jsoup.nodes.Element element27 = document21.head();
        java.lang.String str28 = element27.id();
        boolean boolean29 = tag14.matches(element27);
        java.lang.String str30 = element27.baseUri();
        element12.parentNode = element27;
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str18, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        org.jsoup.nodes.Element element6 = document2.createElement("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements7 = element6.getAllElements();
        java.lang.String str8 = element6.html();
        boolean boolean9 = element6.preserveWhitespace();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#declaration", "\n&lt;!----&gt;");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.data();
        org.jsoup.nodes.Element element7 = document2.text("");
        org.jsoup.nodes.Node node8 = document2.parentNode;
        org.jsoup.select.Elements elements10 = document2.getElementsByIndexGreaterThan((int) '4');
        org.jsoup.nodes.Element element12 = document2.text("hi=\"\"");
        boolean boolean13 = document2.hasText();
        org.jsoup.nodes.Element element15 = document2.text("hi=\"\"");
        org.jsoup.nodes.Element element17 = element15.removeClass("#declaration");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element3 = document1.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>\n<head>\n</head>\n<body> hi!\n</body>\n\nhi!");
        java.lang.String str4 = element3.tagName();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#declaration", "");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Node node8 = document2.attr("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            node8.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi! <html> <head> </head> <body> hi! </body> </html>");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream6 = elements5.stream();
        boolean boolean8 = elements5.hasClass("");
        org.jsoup.nodes.Element element10 = elements5.remove(0);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elementStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueStarting("head", "#document");
        java.lang.Object[] objArray5 = elements4.toArray();
        org.jsoup.select.Elements elements8 = elements4.attr(" !", "#text");
        java.lang.String str9 = elements8.val();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.data();
        java.lang.String str6 = document2.baseUri();
        org.jsoup.nodes.Element element8 = document2.text("<#root>\n<html>\n <head>\n </head>\n <body> hi!\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element10 = element8.val("#declaration");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#text", "");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.data();
        org.jsoup.nodes.Element element7 = document2.text("");
        org.jsoup.nodes.Node node8 = document2.parentNode;
        org.jsoup.select.Elements elements10 = document2.getElementsByIndexGreaterThan((int) '4');
        org.jsoup.nodes.Element element12 = document2.text("hi=\"\"");
        boolean boolean13 = document2.hasText();
        org.jsoup.nodes.Element element15 = document2.createElement("<html>\n<head>\n</head>\n<body>\n [ , !]\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream6 = elements5.stream();
        org.jsoup.select.Elements elements8 = elements5.addClass("hi");
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node12 = document11.parentNode;
        org.jsoup.select.Elements elements14 = document11.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements16 = elements14.val("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        java.lang.String str18 = elements14.attr(" hi=\"\"");
        boolean boolean19 = elements8.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements14);
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node23 = document22.parentNode;
        org.jsoup.select.Elements elements25 = document22.getElementsByIndexLessThan((int) 'a');
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream26 = elements25.stream();
        int int27 = elements25.size();
        boolean boolean28 = elements8.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements25);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elementStream6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(elementStream26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str7 = document6.outerHtml();
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node11 = document10.parentNode;
        java.lang.String str12 = document10.title();
        org.jsoup.nodes.Element element14 = document10.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element15 = document6.appendChild((org.jsoup.nodes.Node) document10);
        // The following exception was thrown during execution in test generation
        try {
            document2.replaceWith((org.jsoup.nodes.Node) document6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str7, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.data();
        org.jsoup.nodes.Element element7 = document2.text("");
        org.jsoup.nodes.Node node8 = document2.parentNode;
        org.jsoup.select.Elements elements10 = document2.getElementsByIndexGreaterThan((int) '4');
        org.jsoup.nodes.Element element12 = document2.text("hi=\"\"");
        boolean boolean13 = document2.hasText();
        org.jsoup.nodes.Element element15 = document2.text("hi=\"\"");
        java.lang.String str16 = document2.id();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream6 = elements5.stream();
        org.jsoup.select.Elements elements8 = elements5.addClass("hi");
        java.lang.Object[] objArray9 = elements8.toArray();
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str13 = document12.outerHtml();
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node17 = document16.parentNode;
        java.lang.String str18 = document16.title();
        org.jsoup.nodes.Element element20 = document16.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element21 = document12.appendChild((org.jsoup.nodes.Node) document16);
        org.jsoup.nodes.Element element22 = document16.nextElementSibling();
        org.jsoup.select.Elements elements23 = document16.siblingElements();
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream24 = elements23.stream();
        org.jsoup.nodes.Document document27 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node28 = document27.parentNode;
        org.jsoup.select.Elements elements30 = document27.getElementsByIndexLessThan((int) 'a');
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream31 = elements30.stream();
        org.jsoup.select.Elements elements33 = elements30.addClass("hi");
        java.lang.String str34 = elements33.html();
        boolean boolean35 = elements23.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements33);
        boolean boolean36 = elements8.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements33);
        org.jsoup.nodes.Document document39 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node40 = document39.parentNode;
        org.jsoup.select.Elements elements42 = document39.getElementsByIndexLessThan((int) 'a');
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream43 = elements42.stream();
        org.jsoup.select.Elements elements45 = elements42.addClass("hi");
        org.jsoup.select.Elements elements46 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements45);
        org.jsoup.select.Elements elements49 = elements45.attr("head", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements51 = elements49.val("#text");
        org.jsoup.nodes.Document document54 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node55 = document54.parentNode;
        java.lang.String str56 = document54.title();
        org.jsoup.nodes.Attributes attributes57 = document54.attributes();
        org.jsoup.nodes.Document document60 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node61 = document60.parentNode;
        org.jsoup.select.Elements elements63 = document60.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element64 = document54.prependChild((org.jsoup.nodes.Node) document60);
        org.jsoup.select.Elements elements66 = document60.getElementsByClass("!");
        org.jsoup.nodes.Element element68 = document60.append("hi!");
        int int69 = elements49.lastIndexOf((java.lang.Object) document60);
        org.jsoup.select.Elements elements71 = elements49.prepend("\n&lt;!----&gt;");
        boolean boolean72 = elements8.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements71);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elementStream6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>, \n<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>, \n<head class=\" hi\">\n</head>, \n<body class=\" hi\"> hi!\n</body>]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>, \n<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>, \n<head class=\" hi\">\n</head>, \n<body class=\" hi\"> hi!\n</body>]");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str13, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNull(element22);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(elementStream24);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(elementStream31);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!" + "'", str34, "<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertNotNull(elementStream43);
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertNotNull(elements51);
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(attributes57);
        org.junit.Assert.assertNotNull(document60);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertNotNull(elements63);
        org.junit.Assert.assertNotNull(element64);
        org.junit.Assert.assertNotNull(elements66);
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(elements71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueStarting("head", "#document");
        java.lang.Object[] objArray5 = elements4.toArray();
        org.jsoup.nodes.Evaluator.IndexGreaterThan indexGreaterThan7 = new org.jsoup.nodes.Evaluator.IndexGreaterThan((int) ' ');
        org.jsoup.nodes.Evaluator.IndexGreaterThan indexGreaterThan9 = new org.jsoup.nodes.Evaluator.IndexGreaterThan((int) ' ');
        org.jsoup.nodes.Evaluator.IndexGreaterThan indexGreaterThan11 = new org.jsoup.nodes.Evaluator.IndexGreaterThan((int) ' ');
        org.jsoup.nodes.Evaluator.IndexGreaterThan indexGreaterThan13 = new org.jsoup.nodes.Evaluator.IndexGreaterThan((int) ' ');
        org.jsoup.nodes.Evaluator.IndexGreaterThan indexGreaterThan15 = new org.jsoup.nodes.Evaluator.IndexGreaterThan((int) ' ');
        org.jsoup.nodes.Evaluator.IndexGreaterThan indexGreaterThan17 = new org.jsoup.nodes.Evaluator.IndexGreaterThan((int) ' ');
        org.jsoup.nodes.Evaluator.IndexGreaterThan[] indexGreaterThanArray18 = new org.jsoup.nodes.Evaluator.IndexGreaterThan[] { indexGreaterThan7, indexGreaterThan9, indexGreaterThan11, indexGreaterThan13, indexGreaterThan15, indexGreaterThan17 };
        org.jsoup.nodes.Evaluator.IndexGreaterThan[] indexGreaterThanArray19 = elements4.toArray(indexGreaterThanArray18);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(indexGreaterThanArray18);
        org.junit.Assert.assertNotNull(indexGreaterThanArray19);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document(" hi=\"\"");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements7 = elements5.val("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements9 = elements7.append("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        java.lang.String str11 = elements9.attr("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node15 = document14.parentNode;
        java.lang.String str16 = document14.title();
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str20 = document19.outerHtml();
        org.jsoup.nodes.Document document23 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node24 = document23.parentNode;
        java.lang.String str25 = document23.title();
        org.jsoup.nodes.Element element27 = document23.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element28 = document19.appendChild((org.jsoup.nodes.Node) document23);
        org.jsoup.nodes.Node node29 = document23.parentNode;
        document14.setParentNode(node29);
        boolean boolean31 = elements9.remove((java.lang.Object) document14);
        boolean boolean33 = elements9.hasAttr("#document");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str20, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.data();
        org.jsoup.nodes.Element element7 = document2.text("");
        org.jsoup.nodes.Node node8 = document2.parentNode;
        org.jsoup.select.Elements elements10 = document2.getElementsByIndexGreaterThan((int) '4');
        org.jsoup.nodes.Element element12 = document2.text("hi=\"\"");
        boolean boolean13 = document2.hasText();
        org.jsoup.nodes.Element element15 = document2.text("hi=\"\"");
        org.jsoup.nodes.Element element17 = element15.addClass("hi=\"\"");
        org.jsoup.nodes.Document document19 = org.jsoup.nodes.Document.createShell(" !");
        // The following exception was thrown during execution in test generation
        try {
            element15.removeChild((org.jsoup.nodes.Node) document19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated expression is false");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(document19);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Attribute attribute8 = org.jsoup.nodes.Attribute.createFromEncoded("hi", "");
        java.lang.String str9 = attribute8.html();
        attributes5.put(attribute8);
        java.lang.String str12 = attributes5.get("\n<!---->");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi=\"\"" + "'", str9, "hi=\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        java.lang.String str13 = document8.baseUri();
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str17 = document16.outerHtml();
        org.jsoup.nodes.Document document20 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node21 = document20.parentNode;
        java.lang.String str22 = document20.title();
        org.jsoup.nodes.Element element24 = document20.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element25 = document16.appendChild((org.jsoup.nodes.Node) document20);
        org.jsoup.nodes.Attributes attributes26 = document20.attributes();
        document8.addChild((org.jsoup.nodes.Node) document20);
        org.jsoup.nodes.Document document29 = org.jsoup.Jsoup.parseBodyFragment("head");
        org.jsoup.nodes.Element element30 = document20.prependChild((org.jsoup.nodes.Node) document29);
        org.jsoup.select.Elements elements31 = document29.siblingElements();
        org.jsoup.nodes.Node node32 = document29.nextSibling();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str17, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(node32);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements7 = elements5.val("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements9 = elements7.append("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.Class<?> wildcardClass13 = document12.getClass();
        int int14 = elements7.lastIndexOf((java.lang.Object) document12);
        org.jsoup.select.Elements elements15 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements7);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document2.childNodes;
        org.jsoup.select.Elements elements15 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements17 = elements15.removeAttr("hi");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element19 = elements15.get(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.data();
        java.lang.String str6 = document2.baseUri();
        java.lang.String str7 = document2.title();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements7 = elements5.val("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream8 = elements5.stream();
        org.jsoup.select.Elements elements10 = elements5.toggleClass("#document");
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parseBodyFragment("hi", "hi");
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node17 = document16.parentNode;
        org.jsoup.select.Elements elements19 = document16.getElementsByIndexLessThan((int) 'a');
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream20 = elements19.stream();
        org.jsoup.select.Elements elements22 = elements19.addClass("hi");
        org.jsoup.select.Elements elements23 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements22);
        java.lang.Integer int24 = org.jsoup.nodes.Node.indexInList((org.jsoup.nodes.Element) document13, (java.util.List<org.jsoup.nodes.Element>) elements23);
        boolean boolean25 = elements5.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements23);
        org.jsoup.select.Elements elements27 = elements23.toggleClass("[ , !]");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elementStream8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elementStream20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNull(int24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(elements27);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element12 = document6.head();
        java.lang.String str13 = element12.id();
        java.lang.String str14 = element12.nodeName();
        org.jsoup.nodes.Element element15 = element12.lastElementSibling();
        org.jsoup.nodes.Element element17 = element15.append("!");
        java.lang.StringBuilder stringBuilder18 = null;
        // The following exception was thrown during execution in test generation
        try {
            element17.outerHtml(stringBuilder18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "head" + "'", str14, "head");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        java.lang.String str6 = document2.text();
        org.jsoup.select.Elements elements9 = document2.getElementsByAttributeValueNot("hi=\"\"", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        int int11 = elements9.lastIndexOf((java.lang.Object) 'a');
        org.jsoup.select.Elements elements13 = elements9.addClass("");
        org.jsoup.nodes.Evaluator.Tag tag15 = new org.jsoup.nodes.Evaluator.Tag("#document");
        org.jsoup.nodes.Evaluator.IndexLessThan indexLessThan17 = new org.jsoup.nodes.Evaluator.IndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Document document20 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node21 = document20.parentNode;
        org.jsoup.select.Elements elements23 = document20.getElementsByIndexLessThan((int) 'a');
        boolean boolean24 = indexLessThan17.matches((org.jsoup.nodes.Element) document20);
        org.jsoup.nodes.Document document27 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node28 = document27.parentNode;
        org.jsoup.select.Elements elements29 = document27.getAllElements();
        org.jsoup.select.Elements elements30 = org.jsoup.select.Collector.collect((org.jsoup.nodes.Evaluator) indexLessThan17, (org.jsoup.nodes.Element) document27);
        boolean boolean31 = tag15.matches((org.jsoup.nodes.Element) document27);
        document27.baseUri = "hi=\"\"";
        org.jsoup.nodes.Element element35 = document27.appendText("");
        boolean boolean36 = elements13.add(element35);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document2.childNodes;
        org.jsoup.select.Elements elements15 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str19 = document18.outerHtml();
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node23 = document22.parentNode;
        java.lang.String str24 = document22.title();
        org.jsoup.nodes.Element element26 = document22.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element27 = document18.appendChild((org.jsoup.nodes.Node) document22);
        org.jsoup.nodes.Attributes attributes28 = document22.attributes();
        java.lang.String str29 = document22.title();
        int int30 = elements15.lastIndexOf((java.lang.Object) document22);
        int int31 = elements15.size();
        org.jsoup.nodes.Element element32 = elements15.last();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str19, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(element32);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document2.childNodes;
        org.jsoup.select.Elements elements15 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements17 = elements15.removeAttr("hi");
        boolean boolean19 = elements15.is("[ , !]");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Element> elementList22 = elements15.subList((-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: fromIndex = -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.jsoup.nodes.DataNode dataNode2 = new org.jsoup.nodes.DataNode("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>", "");
        java.lang.String str3 = dataNode2.toString();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str7 = document6.outerHtml();
        org.jsoup.select.Elements elements8 = document6.getAllElements();
        java.lang.String str9 = document6.data();
        java.lang.String str10 = document6.baseUri();
        org.jsoup.nodes.Element element12 = document6.text("<#root>\n<html>\n <head>\n </head>\n <body> hi!\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            dataNode2.replaceWith((org.jsoup.nodes.Node) element12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str7, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element13 = document2.removeClass("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>");
        java.lang.String str14 = document2.text();
        org.jsoup.select.Elements elements16 = document2.getElementsByIndexLessThan((int) (byte) 1);
        org.jsoup.nodes.Document document20 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node21 = document20.parentNode;
        java.lang.String str22 = document20.title();
        org.jsoup.nodes.Attributes attributes23 = document20.attributes();
        org.jsoup.nodes.Document document26 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node27 = document26.parentNode;
        org.jsoup.select.Elements elements29 = document26.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element30 = document20.prependChild((org.jsoup.nodes.Node) document26);
        java.util.List<org.jsoup.nodes.Node> nodeList31 = document20.childNodes;
        java.lang.String str33 = document20.attr(" !");
        // The following exception was thrown during execution in test generation
        try {
            elements16.add((int) (byte) 100, (org.jsoup.nodes.Element) document20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! <html> <head> </head> <body> hi! </body> </html>" + "'", str14, "hi! <html> <head> </head> <body> hi! </body> </html>");
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element13 = document2.removeClass("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>");
        java.lang.String str14 = document2.text();
        org.jsoup.nodes.Element element16 = document2.addClass("#document");
        org.jsoup.nodes.Element element18 = document2.createElement("hi!");
        boolean boolean20 = element18.hasClass("#text");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! <html> <head> </head> <body> hi! </body> </html>" + "'", str14, "hi! <html> <head> </head> <body> hi! </body> </html>");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.jsoup.nodes.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.nodes.Evaluator.IndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Document document4 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node5 = document4.parentNode;
        org.jsoup.select.Elements elements7 = document4.getElementsByIndexLessThan((int) 'a');
        boolean boolean8 = indexLessThan1.matches((org.jsoup.nodes.Element) document4);
        org.jsoup.nodes.Element element10 = document4.prepend("<html>\n<head>\n</head>\n<body>\n [ , !]\n</body>\n</html>");
        org.jsoup.nodes.Element element12 = element10.appendElement("[!]");
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements7 = elements5.val("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream8 = elements5.stream();
        org.jsoup.select.Elements elements10 = elements5.toggleClass("#document");
        org.jsoup.select.Elements elements12 = elements5.addClass("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream13 = elements12.parallelStream();
        java.lang.Object[] objArray14 = elements12.toArray();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elementStream8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elementStream13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[<html value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" class=\" #document &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\">\n<head value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" class=\" #document &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\">\n</head>\n<body value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" class=\" #document &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\"> hi!\n</body>\n</html>, \n<html value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" class=\" #document &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\">\n<head value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" class=\" #document &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\">\n</head>\n<body value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" class=\" #document &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\"> hi!\n</body>\n</html>, \n<head value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" class=\" #document &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\">\n</head>, \n<body value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" class=\" #document &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\"> hi!\n</body>]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[<html value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" class=\" #document &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\">\n<head value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" class=\" #document &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\">\n</head>\n<body value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" class=\" #document &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\"> hi!\n</body>\n</html>, \n<html value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" class=\" #document &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\">\n<head value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" class=\" #document &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\">\n</head>\n<body value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" class=\" #document &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\"> hi!\n</body>\n</html>, \n<head value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" class=\" #document &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\">\n</head>, \n<body value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" class=\" #document &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\"> hi!\n</body>]");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        java.lang.String str6 = document2.text();
        org.jsoup.select.Elements elements9 = document2.getElementsByAttributeValueNot("hi=\"\"", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        java.lang.String str10 = document2.text();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.data();
        org.jsoup.nodes.Element element7 = document2.text("");
        boolean boolean9 = document2.hasClass("hi!");
        org.jsoup.select.Elements elements12 = document2.getElementsByAttributeValue(" hi=\"\"", "<html>\n<head>\n</head>\n<body>\n hi\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Attributes attributes12 = document6.attributes();
        boolean boolean14 = attributes12.hasKey("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor15 = attributes12.iterator();
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node19 = document18.parentNode;
        java.lang.String str20 = document18.title();
        org.jsoup.nodes.Attributes attributes21 = document18.attributes();
        java.lang.String str22 = attributes21.html();
        attributes12.addAll(attributes21);
        java.lang.String str24 = attributes12.toString();
        boolean boolean26 = attributes12.hasKey("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>\n<head>\n</head>\n<body> hi!\n</body>\n\nhi!");
        org.jsoup.nodes.Document document29 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node30 = document29.parentNode;
        java.lang.String str31 = document29.title();
        org.jsoup.nodes.Attributes attributes32 = document29.attributes();
        org.jsoup.nodes.Document document35 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node36 = document35.parentNode;
        org.jsoup.select.Elements elements38 = document35.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element39 = document29.prependChild((org.jsoup.nodes.Node) document35);
        java.util.List<org.jsoup.nodes.Node> nodeList40 = document29.childNodes;
        org.jsoup.select.Elements elements42 = document29.getElementsByTag("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Document document45 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str46 = document45.outerHtml();
        org.jsoup.nodes.Document document49 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node50 = document49.parentNode;
        java.lang.String str51 = document49.title();
        org.jsoup.nodes.Element element53 = document49.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element54 = document45.appendChild((org.jsoup.nodes.Node) document49);
        org.jsoup.nodes.Attributes attributes55 = document49.attributes();
        java.lang.String str56 = document49.title();
        int int57 = elements42.lastIndexOf((java.lang.Object) document49);
        org.jsoup.nodes.Element element59 = document49.appendText("<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!");
        org.jsoup.select.Elements elements61 = element59.getElementsByClass("\n<!---->");
        boolean boolean62 = attributes12.equals((java.lang.Object) element59);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributeItor15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str46, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document49);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertNotNull(attributes55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNotNull(elements61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream6 = elements5.stream();
        org.jsoup.select.Elements elements8 = elements5.addClass("hi");
        org.jsoup.select.Elements elements9 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements8);
        org.jsoup.select.Elements elements12 = elements8.attr("head", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements14 = elements12.val("#text");
        java.util.function.UnaryOperator<org.jsoup.nodes.Element> elementUnaryOperator15 = null;
        // The following exception was thrown during execution in test generation
        try {
            elements14.replaceAll(elementUnaryOperator15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elementStream6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        int int6 = elements5.size();
        org.jsoup.select.Elements elements8 = elements5.val("#root");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        java.lang.String str6 = document2.text();
        org.jsoup.nodes.Element element8 = document2.text("");
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str12 = document11.outerHtml();
        org.jsoup.select.Elements elements13 = document11.getAllElements();
        boolean boolean14 = element8.equals((java.lang.Object) elements13);
        org.jsoup.select.Elements elements15 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements13);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str12, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.jsoup.nodes.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.nodes.Evaluator.AttributeWithValueStarting("hi", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        attributeWithValueStarting2.value = "hi!";
        attributeWithValueStarting2.key = "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>";
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str10 = document9.outerHtml();
        document9.setBaseUri("hi");
        boolean boolean13 = attributeWithValueStarting2.matches((org.jsoup.nodes.Element) document9);
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str17 = document16.outerHtml();
        org.jsoup.nodes.Document document20 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node21 = document20.parentNode;
        java.lang.String str22 = document20.title();
        org.jsoup.nodes.Element element24 = document20.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element25 = document16.appendChild((org.jsoup.nodes.Node) document20);
        org.jsoup.nodes.Document document28 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node29 = document28.parentNode;
        java.lang.String str30 = document28.title();
        org.jsoup.nodes.Attributes attributes31 = document28.attributes();
        org.jsoup.nodes.Document document34 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node35 = document34.parentNode;
        org.jsoup.select.Elements elements37 = document34.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element38 = document28.prependChild((org.jsoup.nodes.Node) document34);
        org.jsoup.select.Elements elements40 = document28.select("hi");
        org.jsoup.nodes.Element element41 = document20.appendChild((org.jsoup.nodes.Node) document28);
        org.jsoup.nodes.Element element42 = document28.body();
        boolean boolean43 = attributeWithValueStarting2.matches((org.jsoup.nodes.Element) document28);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str10, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str17, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        java.lang.String str6 = document2.text();
        org.jsoup.select.Elements elements9 = document2.getElementsByAttributeValueNot("hi=\"\"", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Evaluator.AttributeWithValueContaining attributeWithValueContaining12 = new org.jsoup.nodes.Evaluator.AttributeWithValueContaining("<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!", "head");
        int int13 = elements9.indexOf((java.lang.Object) "head");
        org.jsoup.nodes.Element element15 = elements9.get(0);
        org.jsoup.parser.TokenQueue tokenQueue17 = new org.jsoup.parser.TokenQueue("hi!");
        boolean boolean19 = tokenQueue17.matchChomp("");
        java.lang.String str20 = tokenQueue17.consumeWord();
        tokenQueue17.addFirst((java.lang.Character) ' ');
        tokenQueue17.addFirst((java.lang.Character) 'a');
        boolean boolean25 = element15.equals((java.lang.Object) tokenQueue17);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi" + "'", str20, "hi");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Attributes attributes12 = document6.attributes();
        boolean boolean14 = attributes12.hasKey("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor15 = attributes12.iterator();
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node19 = document18.parentNode;
        java.lang.String str20 = document18.title();
        org.jsoup.nodes.Attributes attributes21 = document18.attributes();
        java.lang.String str22 = attributes21.html();
        attributes12.addAll(attributes21);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor24 = attributes12.iterator();
        org.jsoup.nodes.Document document27 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str28 = document27.outerHtml();
        org.jsoup.nodes.Document document31 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node32 = document31.parentNode;
        java.lang.String str33 = document31.title();
        org.jsoup.nodes.Element element35 = document31.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element36 = document27.appendChild((org.jsoup.nodes.Node) document31);
        org.jsoup.nodes.Attributes attributes37 = document31.attributes();
        boolean boolean39 = attributes37.hasKey("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor40 = attributes37.iterator();
        org.jsoup.nodes.Document document43 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node44 = document43.parentNode;
        java.lang.String str45 = document43.title();
        org.jsoup.nodes.Attributes attributes46 = document43.attributes();
        java.lang.String str47 = attributes46.html();
        attributes37.addAll(attributes46);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor49 = attributes46.iterator();
        attributes12.addAll(attributes46);
        java.util.List<org.jsoup.nodes.Attribute> attributeList51 = attributes46.asList();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator52 = attributeList51.spliterator();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributeItor15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(attributeItor24);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str28, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(attributeItor40);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(attributes46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(attributeItor49);
        org.junit.Assert.assertNotNull(attributeList51);
        org.junit.Assert.assertNotNull(attributeSpliterator52);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("[ , !]", "hi=\"\"");
        java.lang.String str3 = document2.html();
        java.lang.String str4 = document2.html();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n [ , !]\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n [ , !]\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html>\n<head>\n</head>\n<body>\n [ , !]\n</body>\n</html>" + "'", str4, "<html>\n<head>\n</head>\n<body>\n [ , !]\n</body>\n</html>");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.jsoup.nodes.Evaluator.Tag tag1 = new org.jsoup.nodes.Evaluator.Tag("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Document document4 = org.jsoup.parser.Parser.parse("", "hi!");
        boolean boolean5 = tag1.matches((org.jsoup.nodes.Element) document4);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.select.Elements elements13 = document2.children();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        java.lang.String str6 = document2.text();
        org.jsoup.nodes.Element element8 = document2.text("");
        org.jsoup.nodes.Element element11 = document2.attr("!", "#text");
        java.lang.String str12 = element11.nodeName();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Node node12 = document6.parentNode;
        org.jsoup.nodes.Element[] elementArray13 = new org.jsoup.nodes.Element[] { document6 };
        org.jsoup.select.Elements elements14 = new org.jsoup.select.Elements(elementArray13);
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node19 = document18.parentNode;
        java.lang.String str20 = document18.title();
        org.jsoup.nodes.Attributes attributes21 = document18.attributes();
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node25 = document24.parentNode;
        org.jsoup.select.Elements elements27 = document24.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element28 = document18.prependChild((org.jsoup.nodes.Node) document24);
        java.util.List<org.jsoup.nodes.Node> nodeList29 = document18.childNodes;
        org.jsoup.select.Elements elements31 = document18.getElementsByTag("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Document document34 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str35 = document34.outerHtml();
        org.jsoup.nodes.Document document38 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node39 = document38.parentNode;
        java.lang.String str40 = document38.title();
        org.jsoup.nodes.Element element42 = document38.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element43 = document34.appendChild((org.jsoup.nodes.Node) document38);
        org.jsoup.nodes.Attributes attributes44 = document38.attributes();
        java.lang.String str45 = document38.title();
        int int46 = elements31.lastIndexOf((java.lang.Object) document38);
        org.jsoup.select.Elements elements48 = elements31.eq((int) '#');
        boolean boolean49 = elements14.addAll(0, (java.util.Collection<org.jsoup.nodes.Element>) elements48);
        org.jsoup.select.Elements elements51 = elements14.select("[ , !]");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(elementArray13);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str35, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(elements51);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        java.lang.String str6 = document2.text();
        org.jsoup.nodes.Element element8 = document2.text("");
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str12 = document11.outerHtml();
        org.jsoup.select.Elements elements13 = document11.getAllElements();
        boolean boolean14 = element8.equals((java.lang.Object) elements13);
        java.lang.String str15 = elements13.html();
        org.jsoup.nodes.Evaluator.AttributeWithValueEnding attributeWithValueEnding18 = new org.jsoup.nodes.Evaluator.AttributeWithValueEnding("\n<!---->", "hi!");
        org.jsoup.nodes.Document document21 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str22 = document21.outerHtml();
        document21.setBaseUri("hi");
        boolean boolean25 = attributeWithValueEnding18.matches((org.jsoup.nodes.Element) document21);
        int int26 = elements13.lastIndexOf((java.lang.Object) boolean25);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str12, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>\n<head>\n</head>\n<body> hi!\n</body>\n\nhi!" + "'", str15, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>\n<head>\n</head>\n<body> hi!\n</body>\n\nhi!");
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str22, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.jsoup.nodes.Document document3 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node4 = document3.parentNode;
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) 'a');
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream7 = elements6.stream();
        org.jsoup.select.Elements elements9 = elements6.addClass("hi");
        java.lang.String str10 = elements9.html();
        java.lang.String str11 = elements9.val();
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream12 = elements9.stream();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = org.jsoup.select.Selector.select("<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!", (java.lang.Iterable<org.jsoup.nodes.Element>) elements9);
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <html class=\" hi\">?<head class=\" hi\">?</head>?<body class=\" hi\"> hi!?</body>?</html>?<head class=\" hi\">?</head>?<body class=\" hi\"> hi!?</body>??hi!");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elementStream7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!" + "'", str10, "<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elementStream12);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        java.lang.String str6 = document2.text();
        org.jsoup.select.Elements elements9 = document2.getElementsByAttributeValueNot("hi=\"\"", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        int int11 = elements9.lastIndexOf((java.lang.Object) 'a');
        org.jsoup.nodes.Document document15 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str16 = document15.outerHtml();
        org.jsoup.select.Elements elements17 = document15.getAllElements();
        java.lang.String str18 = document15.data();
        org.jsoup.nodes.Element element20 = document15.text("");
        org.jsoup.select.Elements elements22 = element20.getElementsByIndexLessThan((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = elements9.addAll((int) 'a', (java.util.Collection<org.jsoup.nodes.Element>) elements22);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str16, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        java.lang.String str13 = document8.baseUri();
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str17 = document16.outerHtml();
        org.jsoup.nodes.Document document20 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node21 = document20.parentNode;
        java.lang.String str22 = document20.title();
        org.jsoup.nodes.Element element24 = document20.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element25 = document16.appendChild((org.jsoup.nodes.Node) document20);
        org.jsoup.nodes.Attributes attributes26 = document20.attributes();
        document8.addChild((org.jsoup.nodes.Node) document20);
        org.jsoup.nodes.Document document29 = org.jsoup.Jsoup.parseBodyFragment("head");
        org.jsoup.nodes.Element element30 = document20.prependChild((org.jsoup.nodes.Node) document29);
        java.lang.StringBuilder stringBuilder31 = null;
        // The following exception was thrown during execution in test generation
        try {
            document29.indent(stringBuilder31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str17, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(element30);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element12 = document6.head();
        java.lang.String str13 = element12.id();
        org.jsoup.select.Elements elements16 = element12.getElementsByAttributeValueNot("\n<!---->", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        java.lang.String str17 = element12.data();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi", "");
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node6 = document5.parentNode;
        java.lang.String str7 = document5.title();
        boolean boolean8 = attribute2.equals((java.lang.Object) str7);
        boolean boolean10 = attribute2.equals((java.lang.Object) 100L);
        java.lang.String str11 = attribute2.html();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi=\"\"" + "'", str11, "hi=\"\"");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.jsoup.nodes.Evaluator.Tag tag1 = new org.jsoup.nodes.Evaluator.Tag("#document");
        org.jsoup.nodes.Document document4 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str5 = document4.outerHtml();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        java.lang.String str10 = document8.title();
        org.jsoup.nodes.Element element12 = document8.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = document4.appendChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element14 = document8.head();
        java.lang.String str15 = element14.id();
        boolean boolean16 = tag1.matches(element14);
        java.lang.String str17 = element14.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements20 = element14.getElementsByAttributeValueStarting("", "[!]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str5, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi", "hi");
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node6 = document5.parentNode;
        org.jsoup.select.Elements elements8 = document5.getElementsByIndexLessThan((int) 'a');
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream9 = elements8.stream();
        org.jsoup.select.Elements elements11 = elements8.addClass("hi");
        org.jsoup.select.Elements elements12 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements11);
        java.lang.Integer int13 = org.jsoup.nodes.Node.indexInList((org.jsoup.nodes.Element) document2, (java.util.List<org.jsoup.nodes.Element>) elements12);
        org.jsoup.select.Elements elements14 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements12);
        org.jsoup.select.Elements elements16 = elements14.select("#data");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elementStream9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("[!]", "[ , !]");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements7 = elements5.val("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream8 = elements5.stream();
        org.jsoup.select.Elements elements10 = elements5.prepend("hi");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elementStream8);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.jsoup.nodes.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.nodes.Evaluator.AttributeWithValueEnding("\n<!---->", "hi!");
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str6 = document5.outerHtml();
        document5.setBaseUri("hi");
        boolean boolean9 = attributeWithValueEnding2.matches((org.jsoup.nodes.Element) document5);
        attributeWithValueEnding2.value = "hi! <html> <head> </head> <body> hi! </body> </html>";
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str15 = document14.outerHtml();
        org.jsoup.select.Elements elements16 = document14.getAllElements();
        java.lang.String str17 = document14.data();
        org.jsoup.nodes.Element element19 = document14.text("");
        org.jsoup.nodes.Node node20 = document14.parentNode;
        org.jsoup.select.Elements elements22 = document14.getElementsByIndexGreaterThan((int) '4');
        java.lang.String str23 = document14.baseUri();
        boolean boolean24 = attributeWithValueEnding2.matches((org.jsoup.nodes.Element) document14);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str6, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str15, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.baseUri = "";
        org.jsoup.select.Elements elements5 = document1.getElementsByIndexEquals((int) (byte) -1);
        org.jsoup.nodes.Document document6 = document1.normalise();
        org.jsoup.nodes.Element element8 = document6.appendText("\n<!---->");
        org.jsoup.select.Elements elements11 = document6.getElementsByAttributeValueNot("#text", "<html>\n<head>\n</head>\n<body>\n hi\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.data();
        org.jsoup.nodes.Element element7 = document2.text("");
        org.jsoup.nodes.Node node8 = document2.parentNode;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = document2.getElementsByAttributeValueEnding(" hi=\"\"", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi", "hi");
        java.lang.String str3 = document2.baseUri();
        org.jsoup.nodes.Element element4 = document2.head();
        org.jsoup.nodes.Document document7 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node8 = document7.parentNode;
        java.lang.String str9 = document7.title();
        org.jsoup.nodes.Element element11 = document7.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        boolean boolean12 = document2.equals((java.lang.Object) element11);
        org.jsoup.nodes.Element element14 = document2.removeClass("hi=\"\"");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi" + "'", str3, "hi");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document2.childNodes;
        org.jsoup.select.Elements elements15 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str19 = document18.outerHtml();
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node23 = document22.parentNode;
        java.lang.String str24 = document22.title();
        org.jsoup.nodes.Element element26 = document22.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element27 = document18.appendChild((org.jsoup.nodes.Node) document22);
        org.jsoup.nodes.Attributes attributes28 = document22.attributes();
        java.lang.String str29 = document22.title();
        int int30 = elements15.lastIndexOf((java.lang.Object) document22);
        org.jsoup.nodes.Element element32 = document22.appendText("<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!");
        org.jsoup.nodes.Node node33 = element32.parent();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str19, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(node33);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream6 = elements5.stream();
        org.jsoup.select.Elements elements8 = elements5.addClass("hi");
        java.lang.String str9 = elements8.html();
        java.lang.String str10 = elements8.val();
        org.jsoup.select.Elements elements12 = elements8.val("hi");
        org.jsoup.nodes.Document document15 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str16 = document15.outerHtml();
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node20 = document19.parentNode;
        java.lang.String str21 = document19.title();
        org.jsoup.nodes.Element element23 = document19.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element24 = document15.appendChild((org.jsoup.nodes.Node) document19);
        org.jsoup.nodes.Document document27 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node28 = document27.parentNode;
        java.lang.String str29 = document27.title();
        org.jsoup.nodes.Attributes attributes30 = document27.attributes();
        org.jsoup.nodes.Document document33 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node34 = document33.parentNode;
        org.jsoup.select.Elements elements36 = document33.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element37 = document27.prependChild((org.jsoup.nodes.Node) document33);
        org.jsoup.select.Elements elements39 = document27.select("hi");
        org.jsoup.nodes.Element element40 = document19.appendChild((org.jsoup.nodes.Node) document27);
        org.jsoup.nodes.Element element42 = document27.addClass("#declaration");
        boolean boolean43 = elements8.add(element42);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elementStream6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!" + "'", str9, "<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str16, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "<html>\n<head>\n</head>\n<body>\n hi\n</body>\n</html>");
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str6 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node10 = document9.parentNode;
        java.lang.String str11 = document9.title();
        org.jsoup.nodes.Element element13 = document9.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element14 = document5.appendChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Element element16 = document5.removeClass("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>");
        java.lang.String str17 = document5.text();
        org.jsoup.nodes.Element element19 = document5.addClass("#document");
        boolean boolean20 = attribute2.equals((java.lang.Object) document5);
        org.jsoup.nodes.Document document23 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str24 = document23.nodeName();
        org.jsoup.select.Elements elements26 = document23.getElementsByAttribute("\n<!---->");
        boolean boolean27 = attribute2.equals((java.lang.Object) document23);
        org.jsoup.nodes.Document document30 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node31 = document30.parentNode;
        org.jsoup.select.Elements elements32 = document30.getAllElements();
        org.jsoup.nodes.Element element34 = document30.createElement("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements35 = element34.getAllElements();
        java.util.List<org.jsoup.nodes.Node> nodeList36 = element34.childNodes;
        org.jsoup.nodes.Document document39 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node40 = document39.parentNode;
        java.lang.String str41 = document39.title();
        org.jsoup.nodes.Attributes attributes42 = document39.attributes();
        org.jsoup.nodes.Document document45 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node46 = document45.parentNode;
        org.jsoup.select.Elements elements48 = document45.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element49 = document39.prependChild((org.jsoup.nodes.Node) document45);
        java.lang.String str50 = document45.baseUri();
        org.jsoup.nodes.Document document53 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str54 = document53.outerHtml();
        org.jsoup.nodes.Document document57 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node58 = document57.parentNode;
        java.lang.String str59 = document57.title();
        org.jsoup.nodes.Element element61 = document57.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element62 = document53.appendChild((org.jsoup.nodes.Node) document57);
        org.jsoup.nodes.Attributes attributes63 = document57.attributes();
        document45.addChild((org.jsoup.nodes.Node) document57);
        org.jsoup.nodes.Document document66 = org.jsoup.Jsoup.parseBodyFragment("head");
        org.jsoup.nodes.Element element67 = document57.prependChild((org.jsoup.nodes.Node) document66);
        element34.setParentNode((org.jsoup.nodes.Node) document66);
        element34.setBaseUri("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>");
        org.jsoup.nodes.Document document73 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str74 = document73.outerHtml();
        org.jsoup.nodes.Document document77 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node78 = document77.parentNode;
        java.lang.String str79 = document77.title();
        org.jsoup.nodes.Element element81 = document77.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element82 = document73.appendChild((org.jsoup.nodes.Node) document77);
        org.jsoup.nodes.Element element83 = document77.head();
        java.lang.String str84 = element83.id();
        java.lang.String str85 = element83.nodeName();
        org.jsoup.nodes.Element element86 = element83.lastElementSibling();
        org.jsoup.nodes.Element element88 = element86.append("!");
        // The following exception was thrown during execution in test generation
        try {
            document23.replaceChild((org.jsoup.nodes.Node) element34, (org.jsoup.nodes.Node) element86);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated expression is false");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str6, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! <html> <head> </head> <body> hi! </body> </html>" + "'", str17, "hi! <html> <head> </head> <body> hi! </body> </html>");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#document" + "'", str24, "#document");
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertNotNull(document53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str54, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document57);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertNotNull(element62);
        org.junit.Assert.assertNotNull(attributes63);
        org.junit.Assert.assertNotNull(document66);
        org.junit.Assert.assertNotNull(element67);
        org.junit.Assert.assertNotNull(document73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str74, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document77);
        org.junit.Assert.assertNull(node78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertNotNull(element81);
        org.junit.Assert.assertNotNull(element82);
        org.junit.Assert.assertNotNull(element83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "head" + "'", str85, "head");
        org.junit.Assert.assertNotNull(element86);
        org.junit.Assert.assertNotNull(element88);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.select.Elements elements14 = document2.select("hi");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = elements14.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.util.Iterator<org.jsoup.nodes.Element> elementItor5 = elements4.iterator();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elementItor5);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Evaluator.Tag tag14 = new org.jsoup.nodes.Evaluator.Tag("hi!");
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str18 = document17.outerHtml();
        org.jsoup.nodes.Document document21 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node22 = document21.parentNode;
        java.lang.String str23 = document21.title();
        org.jsoup.nodes.Element element25 = document21.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element26 = document17.appendChild((org.jsoup.nodes.Node) document21);
        boolean boolean27 = tag14.matches((org.jsoup.nodes.Element) document17);
        java.lang.String str28 = document17.toString();
        java.lang.String str30 = document17.attr("<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!");
        // The following exception was thrown during execution in test generation
        try {
            element12.removeChild((org.jsoup.nodes.Node) document17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated expression is false");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str18, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>" + "'", str28, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.jsoup.nodes.Evaluator.Tag tag1 = new org.jsoup.nodes.Evaluator.Tag("#document");
        org.jsoup.nodes.Evaluator.IndexLessThan indexLessThan3 = new org.jsoup.nodes.Evaluator.IndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        org.jsoup.select.Elements elements9 = document6.getElementsByIndexLessThan((int) 'a');
        boolean boolean10 = indexLessThan3.matches((org.jsoup.nodes.Element) document6);
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node14 = document13.parentNode;
        org.jsoup.select.Elements elements15 = document13.getAllElements();
        org.jsoup.select.Elements elements16 = org.jsoup.select.Collector.collect((org.jsoup.nodes.Evaluator) indexLessThan3, (org.jsoup.nodes.Element) document13);
        boolean boolean17 = tag1.matches((org.jsoup.nodes.Element) document13);
        document13.baseUri = "hi=\"\"";
        org.jsoup.nodes.Element element21 = document13.appendText("");
        org.jsoup.nodes.Element element23 = element21.prependText(" !");
        java.lang.String str24 = element21.data();
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Attribute attribute8 = org.jsoup.nodes.Attribute.createFromEncoded("hi", "");
        java.lang.String str9 = attribute8.html();
        attributes5.put(attribute8);
        java.lang.String str11 = attributes5.html();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator12 = attributes5.spliterator();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi=\"\"" + "'", str9, "hi=\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " hi=\"\"" + "'", str11, " hi=\"\"");
        org.junit.Assert.assertNotNull(attributeSpliterator12);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.data();
        org.jsoup.nodes.Element element7 = document2.getElementById("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements9 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.jsoup.nodes.Document document3 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str4 = document3.outerHtml();
        java.util.Set<java.lang.String> strSet5 = document3.classNames();
        java.lang.String str6 = document3.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements7 = org.jsoup.select.Selector.select("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>", (org.jsoup.nodes.Element) document3);
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <html>?<head>?</head>?<body> hi!?</body>?</html>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str4, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream6 = elements5.stream();
        org.jsoup.select.Elements elements8 = elements5.toggleClass("[ , !]");
        java.lang.String str10 = elements8.attr("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>\n<head>\n</head>\n<body> hi!\n</body>\n\nhi!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elementStream6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.data();
        org.jsoup.nodes.Element element7 = document2.text("");
        org.jsoup.nodes.Node node8 = document2.parentNode;
        org.jsoup.select.Elements elements10 = document2.getElementsByIndexGreaterThan((int) '4');
        org.jsoup.nodes.Element element12 = document2.text("hi=\"\"");
        boolean boolean13 = document2.hasText();
        org.jsoup.select.Elements elements14 = document2.getAllElements();
        boolean boolean15 = elements14.hasText();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        org.jsoup.nodes.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.nodes.Evaluator.AttributeWithValueEnding("\n<!---->", "hi!");
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str6 = document5.outerHtml();
        document5.setBaseUri("hi");
        boolean boolean9 = attributeWithValueEnding2.matches((org.jsoup.nodes.Element) document5);
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node13 = document12.parentNode;
        java.lang.String str14 = document12.title();
        org.jsoup.nodes.Attributes attributes15 = document12.attributes();
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node19 = document18.parentNode;
        org.jsoup.select.Elements elements21 = document18.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element22 = document12.prependChild((org.jsoup.nodes.Node) document18);
        java.lang.String str23 = document18.baseUri();
        org.jsoup.nodes.Document document26 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str27 = document26.outerHtml();
        org.jsoup.nodes.Document document30 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node31 = document30.parentNode;
        java.lang.String str32 = document30.title();
        org.jsoup.nodes.Element element34 = document30.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element35 = document26.appendChild((org.jsoup.nodes.Node) document30);
        org.jsoup.nodes.Attributes attributes36 = document30.attributes();
        document18.addChild((org.jsoup.nodes.Node) document30);
        org.jsoup.nodes.Document document39 = org.jsoup.Jsoup.parseBodyFragment("head");
        org.jsoup.nodes.Element element40 = document30.prependChild((org.jsoup.nodes.Node) document39);
        boolean boolean41 = attributeWithValueEnding2.matches((org.jsoup.nodes.Element) document30);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str6, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str27, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.data();
        org.jsoup.nodes.Element element7 = document2.text("");
        org.jsoup.nodes.Node node8 = document2.parentNode;
        org.jsoup.select.Elements elements10 = document2.getElementsByIndexGreaterThan((int) '4');
        org.jsoup.nodes.Element element12 = document2.text("hi=\"\"");
        org.jsoup.select.Elements elements13 = document2.children();
        org.jsoup.select.Elements elements15 = document2.getElementsByClass("[ , !]");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream6 = elements5.stream();
        org.jsoup.select.Elements elements8 = elements5.toggleClass("[ , !]");
        int int9 = elements8.size();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elementStream6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.jsoup.nodes.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.nodes.Evaluator.AttributeWithValueEnding("\n<!---->", "hi!");
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str6 = document5.outerHtml();
        document5.setBaseUri("hi");
        boolean boolean9 = attributeWithValueEnding2.matches((org.jsoup.nodes.Element) document5);
        attributeWithValueEnding2.value = "hi! <html> <head> </head> <body> hi! </body> </html>";
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str15 = document14.outerHtml();
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node19 = document18.parentNode;
        java.lang.String str20 = document18.title();
        org.jsoup.nodes.Element element22 = document18.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element23 = document14.appendChild((org.jsoup.nodes.Node) document18);
        java.lang.String str24 = element23.outerHtml();
        boolean boolean25 = attributeWithValueEnding2.matches(element23);
        attributeWithValueEnding2.key = "";
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str6, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str15, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>" + "'", str24, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        java.lang.String str6 = document2.text();
        org.jsoup.nodes.Element element8 = document2.text("");
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node12 = document11.parentNode;
        org.jsoup.select.Elements elements13 = document11.getAllElements();
        org.jsoup.nodes.Element element15 = document11.createElement("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements16 = element15.getAllElements();
        org.jsoup.nodes.Element element17 = document2.appendChild((org.jsoup.nodes.Node) element15);
        org.jsoup.select.Elements elements20 = document2.getElementsByAttributeValueNot("hi", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        java.lang.String str13 = document8.baseUri();
        java.lang.String str14 = document8.className();
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str18 = document17.outerHtml();
        org.jsoup.nodes.Document document21 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node22 = document21.parentNode;
        java.lang.String str23 = document21.title();
        org.jsoup.nodes.Element element25 = document21.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element26 = document17.appendChild((org.jsoup.nodes.Node) document21);
        org.jsoup.nodes.Element element28 = document17.removeClass("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>");
        java.lang.String str29 = document17.text();
        org.jsoup.nodes.Element element31 = document17.addClass("#document");
        org.jsoup.nodes.Element element33 = document17.createElement("hi!");
        org.jsoup.select.Elements elements36 = document17.getElementsByAttributeValueContaining("#comment", "#comment");
        java.lang.Integer int37 = org.jsoup.nodes.Node.indexInList((org.jsoup.nodes.Element) document8, (java.util.List<org.jsoup.nodes.Element>) elements36);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str18, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi! <html> <head> </head> <body> hi! </body> </html>" + "'", str29, "hi! <html> <head> </head> <body> hi! </body> </html>");
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNull(int37);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.jsoup.nodes.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.nodes.Evaluator.AttributeWithValueStarting("hi", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        attributeWithValueStarting2.value = "hi!";
        java.lang.String str5 = attributeWithValueStarting2.value;
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        java.lang.String str12 = document8.text();
        org.jsoup.nodes.Element element14 = document8.text("");
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str18 = document17.outerHtml();
        org.jsoup.select.Elements elements19 = document17.getAllElements();
        boolean boolean20 = element14.equals((java.lang.Object) elements19);
        boolean boolean21 = attributeWithValueStarting2.matches(element14);
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str25 = document24.outerHtml();
        org.jsoup.nodes.Document document28 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node29 = document28.parentNode;
        java.lang.String str30 = document28.title();
        org.jsoup.nodes.Element element32 = document28.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element33 = document24.appendChild((org.jsoup.nodes.Node) document28);
        org.jsoup.nodes.Element element34 = document28.head();
        boolean boolean35 = attributeWithValueStarting2.matches(element34);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str18, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str25, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        org.jsoup.nodes.Evaluator.IndexEquals indexEquals1 = new org.jsoup.nodes.Evaluator.IndexEquals(0);
        org.jsoup.nodes.Document document4 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str5 = document4.outerHtml();
        org.jsoup.select.Elements elements6 = document4.getAllElements();
        org.jsoup.select.Elements elements8 = elements6.prepend("");
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str13 = document12.outerHtml();
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node17 = document16.parentNode;
        java.lang.String str18 = document16.title();
        org.jsoup.nodes.Element element20 = document16.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element21 = document12.appendChild((org.jsoup.nodes.Node) document16);
        org.jsoup.nodes.Element element22 = document16.nextElementSibling();
        org.jsoup.select.Elements elements23 = document16.siblingElements();
        org.jsoup.nodes.Element element24 = elements6.set(1, (org.jsoup.nodes.Element) document16);
        boolean boolean25 = indexEquals1.matches(element24);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str5, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str13, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNull(element22);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Attributes attributes12 = document6.attributes();
        org.jsoup.select.Elements elements14 = document6.getElementsByTag("hi!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Attributes attributes12 = document6.attributes();
        boolean boolean14 = attributes12.hasKey("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor15 = attributes12.iterator();
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node19 = document18.parentNode;
        java.lang.String str20 = document18.title();
        org.jsoup.nodes.Attributes attributes21 = document18.attributes();
        java.lang.String str22 = attributes21.html();
        attributes12.addAll(attributes21);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor24 = attributes12.iterator();
        org.jsoup.nodes.Document document27 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str28 = document27.outerHtml();
        org.jsoup.nodes.Document document31 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node32 = document31.parentNode;
        java.lang.String str33 = document31.title();
        org.jsoup.nodes.Element element35 = document31.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element36 = document27.appendChild((org.jsoup.nodes.Node) document31);
        org.jsoup.nodes.Attributes attributes37 = document31.attributes();
        boolean boolean39 = attributes37.hasKey("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor40 = attributes37.iterator();
        org.jsoup.nodes.Document document43 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node44 = document43.parentNode;
        java.lang.String str45 = document43.title();
        org.jsoup.nodes.Attributes attributes46 = document43.attributes();
        java.lang.String str47 = attributes46.html();
        attributes37.addAll(attributes46);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor49 = attributes46.iterator();
        attributes12.addAll(attributes46);
        org.jsoup.nodes.Attributes attributes51 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes46.addAll(attributes51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributeItor15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(attributeItor24);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str28, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(attributeItor40);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(attributes46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(attributeItor49);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        java.lang.String str6 = attributes5.html();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator7 = attributes5.spliterator();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributeSpliterator7);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements7 = elements5.val("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        java.lang.String str8 = elements5.text();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! hi!  hi!" + "'", str8, "hi! hi!  hi!");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.jsoup.nodes.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.nodes.Evaluator.IndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Document document4 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node5 = document4.parentNode;
        org.jsoup.select.Elements elements7 = document4.getElementsByIndexLessThan((int) 'a');
        boolean boolean8 = indexLessThan1.matches((org.jsoup.nodes.Element) document4);
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node12 = document11.parentNode;
        java.lang.String str13 = document11.title();
        org.jsoup.nodes.Attributes attributes14 = document11.attributes();
        org.jsoup.nodes.Node node17 = document11.attr("hi!", "hi!");
        org.jsoup.select.Elements elements18 = document11.getAllElements();
        boolean boolean19 = indexLessThan1.matches((org.jsoup.nodes.Element) document11);
        org.jsoup.select.Elements elements20 = document11.getAllElements();
        org.jsoup.nodes.Document document23 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str24 = document23.nodeName();
        org.jsoup.select.Elements elements27 = document23.getElementsByAttributeValueContaining("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>", " !");
        boolean boolean28 = document11.equals((java.lang.Object) elements27);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#document" + "'", str24, "#document");
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream6 = elements5.stream();
        org.jsoup.select.Elements elements8 = elements5.addClass("hi");
        int int9 = elements8.size();
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str13 = document12.outerHtml();
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node17 = document16.parentNode;
        java.lang.String str18 = document16.title();
        org.jsoup.nodes.Element element20 = document16.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element21 = document12.appendChild((org.jsoup.nodes.Node) document16);
        org.jsoup.nodes.Node node22 = document16.parentNode;
        org.jsoup.nodes.Element[] elementArray23 = new org.jsoup.nodes.Element[] { document16 };
        org.jsoup.select.Elements elements24 = new org.jsoup.select.Elements(elementArray23);
        org.jsoup.nodes.Document document28 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node29 = document28.parentNode;
        java.lang.String str30 = document28.title();
        org.jsoup.nodes.Attributes attributes31 = document28.attributes();
        org.jsoup.nodes.Document document34 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node35 = document34.parentNode;
        org.jsoup.select.Elements elements37 = document34.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element38 = document28.prependChild((org.jsoup.nodes.Node) document34);
        java.util.List<org.jsoup.nodes.Node> nodeList39 = document28.childNodes;
        org.jsoup.select.Elements elements41 = document28.getElementsByTag("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Document document44 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str45 = document44.outerHtml();
        org.jsoup.nodes.Document document48 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node49 = document48.parentNode;
        java.lang.String str50 = document48.title();
        org.jsoup.nodes.Element element52 = document48.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element53 = document44.appendChild((org.jsoup.nodes.Node) document48);
        org.jsoup.nodes.Attributes attributes54 = document48.attributes();
        java.lang.String str55 = document48.title();
        int int56 = elements41.lastIndexOf((java.lang.Object) document48);
        org.jsoup.select.Elements elements58 = elements41.eq((int) '#');
        boolean boolean59 = elements24.addAll(0, (java.util.Collection<org.jsoup.nodes.Element>) elements58);
        boolean boolean60 = elements8.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements58);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elementStream6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str13, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(elementArray23);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str45, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(attributes54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(elements58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }
}


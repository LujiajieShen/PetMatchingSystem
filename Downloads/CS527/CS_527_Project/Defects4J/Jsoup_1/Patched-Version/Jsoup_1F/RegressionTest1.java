import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.parser.Tag tag6 = document1.tag();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element10 = document8.appendText("");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        java.lang.String str13 = document12.baseUri();
        java.lang.String str14 = document12.outerHtml();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        java.lang.String str17 = document16.baseUri();
        org.jsoup.nodes.Element element18 = document12.appendChild((org.jsoup.nodes.Node) document16);
        boolean boolean19 = element10.equals((java.lang.Object) document16);
        org.jsoup.select.Elements elements21 = document16.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element23 = document16.appendElement("hi!");
        org.jsoup.nodes.Element element25 = element23.prependElement("hi!");
        boolean boolean26 = document1.equals((java.lang.Object) element25);
        java.lang.String str28 = document1.absUrl("<#root>\n</#root>");
        org.jsoup.select.Elements elements30 = document1.getElementsByAttribute("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        boolean boolean32 = document1.hasAttr("#root");
        org.jsoup.select.Elements elements34 = document1.getElementsByIndexEquals((int) '#');
        org.jsoup.nodes.Element element35 = document1.body();
        java.lang.String str36 = document1.baseUri();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNull(element35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        java.lang.Object obj7 = null;
        boolean boolean8 = element6.equals(obj7);
        boolean boolean9 = element6.hasText();
        java.lang.String[] strArray13 = new java.lang.String[] { "#root", "#root", "#root" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.jsoup.nodes.Element element16 = element6.classNames((java.util.Set<java.lang.String>) strSet14);
        org.jsoup.select.Elements elements18 = element6.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element20 = element6.wrap("<#root>\n</#root>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element22 = element20.val("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNull(element20);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        org.jsoup.nodes.Document document8 = document1.normalise();
        org.jsoup.nodes.Element element10 = document8.wrap("#root");
        org.jsoup.nodes.Element element12 = document8.toggleClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element14 = document8.appendElement("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Element element16 = document8.appendText("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element19 = document8.attr("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;", "<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        boolean boolean21 = element19.hasClass("#document hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element6 = document1.body();
        org.jsoup.select.Elements elements8 = document1.getElementsByClass("<#root>\n</#root>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        java.lang.String str4 = document1.nodeName();
        java.lang.String str5 = document1.className();
        org.jsoup.nodes.Element element7 = document1.prependElement("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        java.lang.String str4 = document1.tagName();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        java.lang.String str7 = document6.baseUri();
        org.jsoup.select.Elements elements9 = document6.getElementsByAttribute("hi!");
        java.lang.String str10 = document6.html();
        java.lang.String str12 = document6.attr("");
        java.lang.String str13 = document6.id();
        org.jsoup.nodes.Element element14 = document1.prependChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Document document15 = document1.normalise();
        org.jsoup.nodes.Node node17 = document1.removeAttr("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        org.jsoup.nodes.Element element6 = document1.html("");
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.nodes.Element element9 = document1.prependElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = element9.addClass("hi! <html> <head> </head> <body> </body> </html>");
        java.lang.String str12 = element9.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\">\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>" + "'", str12, "\n<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\">\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        java.lang.Object obj7 = null;
        boolean boolean8 = element6.equals(obj7);
        boolean boolean9 = element6.hasText();
        java.lang.String[] strArray13 = new java.lang.String[] { "#root", "#root", "#root" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.jsoup.nodes.Element element16 = element6.classNames((java.util.Set<java.lang.String>) strSet14);
        org.jsoup.select.Elements elements18 = element6.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element20 = element6.wrap("<#root>\n</#root>");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = element20.hasAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNull(element20);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Node node8 = document1.removeAttr("#root");
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueStarting("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        java.lang.Object obj7 = null;
        boolean boolean8 = element6.equals(obj7);
        java.lang.String str9 = element6.baseUri();
        org.jsoup.select.Elements elements11 = element6.getElementsByAttribute("hi!");
        java.lang.String str12 = element6.className();
        org.jsoup.nodes.Element element14 = element6.prependElement("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Attributes attributes15 = element14.attributes();
        org.jsoup.nodes.Element element17 = element14.wrap("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str18 = element17.text();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document36 = document9.normalise();
        java.util.List<org.jsoup.nodes.Node> nodeList37 = document36.siblingNodes();
        boolean boolean38 = document36.hasText();
        org.jsoup.nodes.Element element40 = document36.addClass("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(element40);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        java.lang.String str6 = document1.outerHtml();
        boolean boolean7 = document1.hasText();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element14 = document9.val("");
        org.jsoup.nodes.Element element16 = element14.removeClass("");
        org.jsoup.nodes.Element element18 = element14.removeClass("#root");
        java.util.Set<java.lang.String> strSet19 = element14.classNames();
        org.jsoup.nodes.Element element20 = document1.classNames(strSet19);
        org.jsoup.nodes.Element element22 = document1.appendElement("#document");
        java.lang.String str23 = document1.id();
        org.jsoup.nodes.Document document25 = new org.jsoup.nodes.Document("");
        java.lang.String str26 = document25.baseUri();
        org.jsoup.select.Elements elements28 = document25.getElementsByAttribute("hi!");
        java.lang.String str29 = document25.html();
        org.jsoup.nodes.Element element31 = document25.val("");
        org.jsoup.nodes.Element element33 = document25.prependElement("#root");
        org.jsoup.nodes.Element element35 = element33.appendText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element37 = element35.html("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        element37.remove();
        org.jsoup.nodes.Element element40 = element37.removeClass("#root");
        boolean boolean41 = document1.equals((java.lang.Object) "#root");
        org.jsoup.nodes.Attributes attributes42 = document1.attributes();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(attributes42);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Node node15 = document9.previousSibling();
        org.jsoup.nodes.Element element17 = document9.prependElement("#root");
        org.jsoup.nodes.Element element19 = element17.prepend("hi!hi!");
        org.jsoup.select.Elements elements22 = element19.getElementsByAttributeValueNot("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>", "hi! #root hi!");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        org.jsoup.nodes.Element element6 = document1.html("");
        org.jsoup.select.Elements elements8 = document1.getElementsByIndexEquals((int) '#');
        boolean boolean10 = document1.hasAttr("#root");
        org.jsoup.select.Elements elements13 = document1.getElementsByAttributeValueNot("<html>\n <head>\n </head>\n <body>\n </body>\n</html>", "<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.jsoup.nodes.Attributes attributes14 = document1.attributes();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueStarting("hi!", "hi!");
        org.jsoup.nodes.Element element10 = document1.head();
        org.jsoup.nodes.Element element11 = document1.parent();
        org.jsoup.select.Elements elements14 = document1.getElementsByAttributeValueNot("#document", "hi!");
        java.lang.String str15 = document1.id();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        org.jsoup.nodes.Element element6 = document1.html("");
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.nodes.Element element9 = document7.text("");
        org.jsoup.nodes.Node node11 = element9.removeAttr("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements14 = element9.getElementsByAttributeValueEnding("<html>\n <head>\n </head>\n <body>\n </body>\n</html>", "<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.nodes.Element element14 = element3.wrap("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet15 = element14.classNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Node node15 = document9.previousSibling();
        org.jsoup.nodes.Element element17 = document9.prependElement("#root");
        org.jsoup.select.Elements elements19 = element17.getElementsByIndexGreaterThan((-1));
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        java.lang.String str4 = document1.nodeName();
        java.lang.String str5 = document1.className();
        java.lang.String str6 = document1.baseUri();
        org.jsoup.select.Elements elements7 = document1.getAllElements();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document36 = document9.normalise();
        org.jsoup.nodes.Element element37 = document36.lastElementSibling();
        java.lang.String str38 = document36.outerHtml();
        boolean boolean40 = document36.hasAttr("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<html>\n <head>\n </head>\n <body>\n </body>\n</html>" + "'", str38, "<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        java.lang.Object obj7 = null;
        boolean boolean8 = element6.equals(obj7);
        java.lang.String str9 = element6.baseUri();
        org.jsoup.select.Elements elements11 = element6.getElementsByAttribute("hi!");
        java.lang.String str12 = element6.className();
        org.jsoup.nodes.Element element14 = element6.toggleClass("#root");
        org.jsoup.nodes.Element element16 = element14.prependText("#document hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element17 = element14.lastElementSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Node node15 = document9.previousSibling();
        org.jsoup.nodes.Element element17 = document9.prependElement("#root");
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        boolean boolean21 = document19.hasClass("hi!");
        java.lang.String str22 = document19.className();
        org.jsoup.nodes.Element element24 = document19.html("");
        org.jsoup.nodes.Document document25 = document19.normalise();
        org.jsoup.nodes.Element element27 = document19.prependElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        document9.replaceWith((org.jsoup.nodes.Node) element27);
        java.lang.String str29 = element27.id();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        java.lang.Object obj7 = null;
        boolean boolean8 = element6.equals(obj7);
        boolean boolean9 = element6.hasText();
        java.lang.String[] strArray13 = new java.lang.String[] { "#root", "#root", "#root" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.jsoup.nodes.Element element16 = element6.classNames((java.util.Set<java.lang.String>) strSet14);
        org.jsoup.parser.Tag tag17 = element16.tag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element19 = element16.child((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(tag17);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.select.Elements elements9 = document5.getElementsByIndexGreaterThan(100);
        java.lang.String str10 = document5.tagName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = element3.text();
        org.jsoup.select.Elements elements6 = element3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements8 = element3.getElementsByIndexEquals(10);
        java.lang.String str9 = element3.text();
        org.jsoup.select.Elements elements11 = element3.getElementsByAttribute("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        org.jsoup.nodes.Document document8 = document1.normalise();
        org.jsoup.nodes.Element element10 = document8.wrap("#root");
        org.jsoup.nodes.Element element12 = document8.toggleClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element14 = document8.appendElement("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Element element16 = document8.appendText("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element18 = element16.html("<#root>\n</#root>");
        org.jsoup.nodes.Element element19 = element18.empty();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document36 = document9.normalise();
        org.jsoup.nodes.Element element37 = document36.lastElementSibling();
        org.jsoup.select.Elements elements39 = element37.getElementsByClass("#root");
        java.util.Set<java.lang.String> strSet40 = element37.classNames();
        org.jsoup.select.Elements elements43 = element37.getElementsByAttributeValueNot("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertNotNull(elements43);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.tagName();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element8 = document6.appendText("");
        org.jsoup.nodes.Element element9 = document1.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        java.lang.String str12 = document11.baseUri();
        java.lang.String str13 = document11.outerHtml();
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        java.lang.String str16 = document15.baseUri();
        org.jsoup.nodes.Element element17 = document11.appendChild((org.jsoup.nodes.Node) document15);
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        java.lang.String str20 = document19.baseUri();
        org.jsoup.select.Elements elements22 = document19.getElementsByAttribute("hi!");
        java.lang.String str23 = document19.html();
        org.jsoup.parser.Tag tag24 = document19.tag();
        org.jsoup.nodes.Document document26 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element28 = document26.appendText("");
        org.jsoup.nodes.Document document30 = new org.jsoup.nodes.Document("");
        java.lang.String str31 = document30.baseUri();
        java.lang.String str32 = document30.outerHtml();
        org.jsoup.nodes.Document document34 = new org.jsoup.nodes.Document("");
        java.lang.String str35 = document34.baseUri();
        org.jsoup.nodes.Element element36 = document30.appendChild((org.jsoup.nodes.Node) document34);
        boolean boolean37 = element28.equals((java.lang.Object) document34);
        org.jsoup.select.Elements elements39 = document34.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element41 = document34.appendElement("hi!");
        org.jsoup.nodes.Element element43 = element41.prependElement("hi!");
        boolean boolean44 = document19.equals((java.lang.Object) element43);
        org.jsoup.nodes.Element element45 = document11.prependChild((org.jsoup.nodes.Node) document19);
        org.jsoup.nodes.Document document46 = document19.normalise();
        org.jsoup.select.Elements elements48 = document46.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element50 = document46.val("");
        org.jsoup.nodes.Document document52 = new org.jsoup.nodes.Document("");
        java.lang.String str53 = document52.baseUri();
        org.jsoup.select.Elements elements55 = document52.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element57 = document52.val("");
        java.lang.Object obj58 = null;
        boolean boolean59 = element57.equals(obj58);
        boolean boolean60 = element57.hasText();
        java.lang.String[] strArray64 = new java.lang.String[] { "#root", "#root", "#root" };
        java.util.LinkedHashSet<java.lang.String> strSet65 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet65, strArray64);
        org.jsoup.nodes.Element element67 = element57.classNames((java.util.Set<java.lang.String>) strSet65);
        org.jsoup.nodes.Element element68 = document46.classNames((java.util.Set<java.lang.String>) strSet65);
        org.jsoup.nodes.Element element69 = document6.classNames((java.util.Set<java.lang.String>) strSet65);
        java.lang.String str70 = element69.html();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(document46);
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(elements55);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(element67);
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertNotNull(element69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document36 = document9.normalise();
        org.jsoup.nodes.Document document38 = new org.jsoup.nodes.Document("");
        java.lang.String str39 = document38.baseUri();
        org.jsoup.select.Elements elements41 = document38.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element43 = document38.val("");
        org.jsoup.nodes.Element element45 = element43.removeClass("");
        org.jsoup.nodes.Element element46 = document36.appendChild((org.jsoup.nodes.Node) element43);
        org.jsoup.nodes.Document document48 = new org.jsoup.nodes.Document("");
        java.lang.String str49 = document48.baseUri();
        java.lang.String str50 = document48.outerHtml();
        org.jsoup.parser.Tag tag51 = document48.tag();
        org.jsoup.select.Elements elements53 = document48.getElementsByAttribute("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        element43.replaceWith((org.jsoup.nodes.Node) document48);
        java.util.Set<java.lang.String> strSet55 = document48.classNames();
        org.jsoup.nodes.Document document57 = new org.jsoup.nodes.Document("");
        java.lang.String str58 = document57.baseUri();
        org.jsoup.select.Elements elements60 = document57.getElementsByAttribute("hi!");
        java.lang.String str61 = document57.html();
        org.jsoup.nodes.Element element63 = document57.prependText("hi!");
        java.lang.String str64 = document57.id();
        org.jsoup.select.Elements elements66 = document57.getElementsByClass("#document");
        org.jsoup.nodes.Element element67 = document48.appendChild((org.jsoup.nodes.Node) document57);
        org.jsoup.nodes.Attributes attributes68 = document48.attributes();
        org.jsoup.nodes.Document document69 = document48.normalise();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(tag51);
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertNotNull(strSet55);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(elements60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(elements66);
        org.junit.Assert.assertNotNull(element67);
        org.junit.Assert.assertNotNull(attributes68);
        org.junit.Assert.assertNotNull(document69);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Node node8 = document1.removeAttr("#root");
        java.lang.String str9 = document1.data();
        org.jsoup.nodes.Document document10 = document1.normalise();
        org.jsoup.nodes.Document document11 = document10.normalise();
        java.util.Set<java.lang.String> strSet12 = document10.classNames();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        org.jsoup.select.Elements elements7 = document1.getElementsByAttributeValueStarting("<#root>\n</#root>", "hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        org.jsoup.nodes.Element element5 = document1.removeClass("");
        org.jsoup.nodes.Element element7 = element5.toggleClass("#root");
        org.jsoup.select.Elements elements9 = element5.getElementsByTag("#root");
        java.lang.String str10 = element5.baseUri();
        java.lang.String str11 = element5.tagName();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements4 = document1.select("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <html>? <head>? </head>? <body>? </body>?</html>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        java.lang.String str10 = document1.text();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        java.lang.String str13 = document12.baseUri();
        org.jsoup.select.Elements elements15 = document12.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element17 = document12.val("");
        java.lang.Object obj18 = null;
        boolean boolean19 = element17.equals(obj18);
        boolean boolean20 = element17.hasText();
        org.jsoup.nodes.Element element21 = document1.prependChild((org.jsoup.nodes.Node) element17);
        java.util.List<org.jsoup.nodes.Node> nodeList22 = element17.siblingNodes();
        element17.remove();
        org.jsoup.select.Elements elements25 = element17.getElementsByIndexGreaterThan((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(elements25);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        java.lang.String str2 = document1.text();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        org.jsoup.select.Elements elements11 = element9.getElementsByIndexLessThan((int) '4');
        java.lang.String str12 = element9.baseUri();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element14 = document9.val("");
        org.jsoup.nodes.Node node16 = document9.removeAttr("#root");
        boolean boolean17 = document1.equals((java.lang.Object) node16);
        java.lang.String str18 = document1.data();
        org.jsoup.nodes.Attributes attributes19 = document1.attributes();
        java.lang.String str20 = document1.outerHtml();
        org.jsoup.select.Elements elements22 = document1.getElementsByIndexEquals(1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<#root>\n</#root>" + "'", str20, "<#root>\n</#root>");
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.nodes.Element element5 = document3.createElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = element5.prependText("#document");
        boolean boolean8 = element5.hasText();
        org.jsoup.nodes.Element element10 = element5.removeClass("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueStarting("hi!", "hi!");
        org.jsoup.nodes.Element element10 = document1.head();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        java.lang.String str13 = document12.baseUri();
        org.jsoup.select.Elements elements15 = document12.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element17 = document12.val("");
        org.jsoup.nodes.Element element19 = element17.removeClass("");
        org.jsoup.nodes.Element element21 = element17.removeClass("#root");
        java.util.Set<java.lang.String> strSet22 = element17.classNames();
        org.jsoup.nodes.Element element23 = document1.classNames(strSet22);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element25 = document1.child((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element10 = document8.appendText("");
        java.lang.String str11 = element10.text();
        org.jsoup.select.Elements elements13 = element10.getElementsByTag("hi!");
        java.util.Set<java.lang.String> strSet14 = element10.classNames();
        org.jsoup.nodes.Element element15 = element6.appendChild((org.jsoup.nodes.Node) element10);
        org.jsoup.select.Elements elements16 = element15.children();
        org.jsoup.nodes.Element element18 = element15.val("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.jsoup.nodes.Element element20 = element18.child((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.prependText("hi!");
        java.lang.String str4 = document1.nodeName();
        org.jsoup.select.Elements elements6 = document1.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        java.lang.String str9 = document8.baseUri();
        java.lang.String str10 = document8.outerHtml();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        java.lang.String str13 = document12.baseUri();
        org.jsoup.nodes.Element element14 = document8.appendChild((org.jsoup.nodes.Node) document12);
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        java.lang.String str17 = document16.baseUri();
        org.jsoup.select.Elements elements19 = document16.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element21 = document16.val("");
        org.jsoup.nodes.Node node23 = document16.removeAttr("#root");
        boolean boolean24 = document8.equals((java.lang.Object) node23);
        org.jsoup.nodes.Element element25 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element27 = document8.createElement("hi!");
        org.jsoup.select.Elements elements30 = document8.getElementsByAttributeValueContaining("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>", "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.parser.Tag tag31 = document8.tag();
        java.lang.String str32 = document8.id();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        java.util.Set<java.lang.String> strSet8 = element7.classNames();
        org.jsoup.nodes.Element element10 = element7.removeClass("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        java.util.Set<java.lang.String> strSet11 = element7.classNames();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.prependText("hi!");
        java.lang.String str4 = document1.nodeName();
        org.jsoup.select.Elements elements6 = document1.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        java.lang.String str9 = document8.baseUri();
        java.lang.String str10 = document8.outerHtml();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        java.lang.String str13 = document12.baseUri();
        org.jsoup.nodes.Element element14 = document8.appendChild((org.jsoup.nodes.Node) document12);
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        java.lang.String str17 = document16.baseUri();
        org.jsoup.select.Elements elements19 = document16.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element21 = document16.val("");
        org.jsoup.nodes.Node node23 = document16.removeAttr("#root");
        boolean boolean24 = document8.equals((java.lang.Object) node23);
        org.jsoup.nodes.Element element25 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Node node27 = document1.removeAttr("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(node27);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        boolean boolean4 = document1.hasClass("");
        java.lang.String str5 = document1.className();
        org.jsoup.select.Elements elements6 = document1.children();
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.nodes.Element element8 = document7.head();
        element8.remove();
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Attributes attributes8 = element7.attributes();
        org.jsoup.nodes.Element element9 = element7.parent();
        boolean boolean11 = element7.hasAttr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.parser.Tag tag12 = element7.tag();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag12);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document36 = document9.normalise();
        org.jsoup.nodes.Element element37 = document36.lastElementSibling();
        org.jsoup.select.Elements elements39 = element37.getElementsByClass("#root");
        org.jsoup.nodes.Element element41 = element37.prependText("\n <hi!>\n </hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(element41);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.prependText("hi!");
        java.lang.String str4 = document1.nodeName();
        org.jsoup.select.Elements elements6 = document1.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        java.lang.String str9 = document8.baseUri();
        java.lang.String str10 = document8.outerHtml();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        java.lang.String str13 = document12.baseUri();
        org.jsoup.nodes.Element element14 = document8.appendChild((org.jsoup.nodes.Node) document12);
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        java.lang.String str17 = document16.baseUri();
        org.jsoup.select.Elements elements19 = document16.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element21 = document16.val("");
        org.jsoup.nodes.Node node23 = document16.removeAttr("#root");
        boolean boolean24 = document8.equals((java.lang.Object) node23);
        org.jsoup.nodes.Element element25 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element26 = document8.body();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element28 = element26.removeClass("hi! <html> <head> </head> <body> </body> </html>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNull(element26);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.nodes.Node node14 = element3.removeAttr("hi!");
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.nodes.Element element29 = element18.wrap("hi!");
        org.jsoup.nodes.Attributes attributes30 = element18.attributes();
        boolean boolean31 = element3.equals((java.lang.Object) element18);
        org.jsoup.select.Elements elements34 = element18.getElementsByAttributeValueNot("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;", "hi! #root hi!");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(element29);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(elements34);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.prependText("hi!");
        java.lang.String str4 = document1.nodeName();
        org.jsoup.select.Elements elements6 = document1.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        java.lang.String str9 = document8.baseUri();
        java.lang.String str10 = document8.outerHtml();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        java.lang.String str13 = document12.baseUri();
        org.jsoup.nodes.Element element14 = document8.appendChild((org.jsoup.nodes.Node) document12);
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        java.lang.String str17 = document16.baseUri();
        org.jsoup.select.Elements elements19 = document16.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element21 = document16.val("");
        org.jsoup.nodes.Node node23 = document16.removeAttr("#root");
        boolean boolean24 = document8.equals((java.lang.Object) node23);
        org.jsoup.nodes.Element element25 = document1.prependChild((org.jsoup.nodes.Node) document8);
        boolean boolean26 = element25.hasText();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        java.lang.String str11 = document10.baseUri();
        org.jsoup.select.Elements elements13 = document10.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element15 = document10.val("");
        java.lang.Object obj16 = null;
        boolean boolean17 = element15.equals(obj16);
        boolean boolean18 = element15.hasText();
        java.lang.String[] strArray22 = new java.lang.String[] { "#root", "#root", "#root" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        org.jsoup.nodes.Element element25 = element15.classNames((java.util.Set<java.lang.String>) strSet23);
        org.jsoup.nodes.Element element26 = element8.classNames((java.util.Set<java.lang.String>) strSet23);
        org.jsoup.nodes.Element element28 = element8.val("hi! #root hi!");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        org.jsoup.nodes.Element element11 = element9.appendText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element11.html("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("<#root>\n</#root>");
        org.jsoup.nodes.Element element16 = element13.appendChild((org.jsoup.nodes.Node) document15);
        org.jsoup.nodes.Element element18 = document15.appendElement("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.getElementById("hi!");
        java.lang.String str7 = document1.outerHtml();
        java.lang.String str8 = document1.baseUri();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        boolean boolean12 = document10.hasClass("hi!");
        boolean boolean14 = document10.hasClass("hi!");
        java.lang.String str15 = document10.outerHtml();
        boolean boolean16 = document10.hasText();
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        java.lang.String str19 = document18.baseUri();
        org.jsoup.select.Elements elements21 = document18.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element23 = document18.val("");
        org.jsoup.nodes.Element element25 = element23.removeClass("");
        org.jsoup.nodes.Element element27 = element23.removeClass("#root");
        java.util.Set<java.lang.String> strSet28 = element23.classNames();
        org.jsoup.nodes.Element element29 = document10.classNames(strSet28);
        org.jsoup.nodes.Element element30 = document1.classNames(strSet28);
        org.jsoup.nodes.Element element31 = document1.parent();
        java.lang.String str32 = document1.title();
        org.jsoup.nodes.Element element34 = document1.prependElement("<#root>\n</#root>\n<html>\n<head>\n <title>&lt;#root&gt;\n&lt;/#root&gt;</title>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNull(element31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(element34);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        org.jsoup.nodes.Element element11 = element9.appendText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element11.html("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str14 = element11.html();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.nodes.Node node29 = element18.removeAttr("hi!");
        org.jsoup.nodes.Element element30 = element11.appendChild((org.jsoup.nodes.Node) element18);
        java.util.List<org.jsoup.nodes.Node> nodeList31 = element18.childNodes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<html> \n <head> \n </head> \n <body>  \n </body>\n</html>" + "'", str14, "<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(nodeList31);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str7 = document1.attr("");
        java.lang.String str8 = document1.id();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        java.lang.String str11 = document10.baseUri();
        org.jsoup.select.Elements elements13 = document10.getElementsByAttribute("hi!");
        java.lang.String str14 = document10.html();
        java.lang.String str15 = document10.outerHtml();
        org.jsoup.select.Elements elements17 = document10.getElementsByTag("#document");
        java.lang.String str18 = document10.title();
        org.jsoup.nodes.Element element19 = document10.parent();
        org.jsoup.nodes.Element element20 = document1.prependChild((org.jsoup.nodes.Node) document10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element22 = document10.child((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueStarting("hi!", "hi!");
        org.jsoup.nodes.Element element10 = document1.head();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        java.lang.String str13 = document12.baseUri();
        org.jsoup.select.Elements elements15 = document12.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element17 = document12.val("");
        org.jsoup.nodes.Element element19 = element17.removeClass("");
        org.jsoup.nodes.Element element21 = element17.removeClass("#root");
        java.util.Set<java.lang.String> strSet22 = element17.classNames();
        org.jsoup.nodes.Element element23 = document1.classNames(strSet22);
        java.lang.String str24 = document1.val();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        org.jsoup.nodes.Element element11 = element9.appendText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element11.html("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element16 = element11.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "");
        org.jsoup.nodes.Element element18 = element11.appendText("hi!");
        java.lang.String str20 = element18.attr("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.appendText("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        java.lang.String str4 = element3.tagName();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.getElementById("hi!");
        java.lang.String str7 = document1.outerHtml();
        org.jsoup.nodes.Element element9 = document1.prependElement("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        java.lang.String str11 = document1.absUrl("#document");
        java.lang.String str12 = document1.nodeName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        java.lang.String str36 = document9.val();
        org.jsoup.nodes.Document document38 = new org.jsoup.nodes.Document("");
        java.lang.String str39 = document38.baseUri();
        org.jsoup.select.Elements elements41 = document38.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element43 = document38.val("");
        java.lang.Object obj44 = null;
        boolean boolean45 = element43.equals(obj44);
        boolean boolean46 = element43.hasText();
        java.lang.String[] strArray50 = new java.lang.String[] { "#root", "#root", "#root" };
        java.util.LinkedHashSet<java.lang.String> strSet51 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet51, strArray50);
        org.jsoup.nodes.Element element53 = element43.classNames((java.util.Set<java.lang.String>) strSet51);
        org.jsoup.nodes.Element element54 = document9.classNames((java.util.Set<java.lang.String>) strSet51);
        org.jsoup.nodes.Element element55 = document9.nextElementSibling();
        org.jsoup.nodes.Element element56 = document9.empty();
        java.lang.String str57 = document9.html();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element7 = document1.addClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element9 = element7.appendText("");
        java.lang.String str11 = element7.attr("");
        org.jsoup.nodes.Element element13 = element7.append("");
        org.jsoup.nodes.Element element14 = element7.parent();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document36 = document9.normalise();
        org.jsoup.nodes.Document document38 = new org.jsoup.nodes.Document("");
        java.lang.String str39 = document38.baseUri();
        org.jsoup.select.Elements elements41 = document38.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element43 = document38.val("");
        org.jsoup.nodes.Element element45 = element43.removeClass("");
        org.jsoup.nodes.Element element46 = document36.appendChild((org.jsoup.nodes.Node) element43);
        org.jsoup.nodes.Document document48 = new org.jsoup.nodes.Document("");
        java.lang.String str49 = document48.baseUri();
        java.lang.String str50 = document48.outerHtml();
        org.jsoup.parser.Tag tag51 = document48.tag();
        org.jsoup.select.Elements elements53 = document48.getElementsByAttribute("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        element43.replaceWith((org.jsoup.nodes.Node) document48);
        org.jsoup.nodes.Element element56 = element43.val("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.select.Elements elements58 = element43.getElementsByIndexGreaterThan((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(tag51);
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(elements58);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        document1.setBaseUri("");
        java.lang.String str9 = document1.val();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = document1.childNodes();
        org.jsoup.select.Elements elements13 = document1.getElementsByAttributeValueEnding("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>", "#document");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!");
        java.lang.String str7 = document1.className();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = document1.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.parser.Tag tag6 = document1.tag();
        org.jsoup.nodes.Element element8 = document1.createElement("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element16 = document9.appendElement("hi!");
        org.jsoup.nodes.Element element18 = element16.prependElement("hi!");
        org.jsoup.select.Elements elements21 = element18.getElementsByAttributeValueEnding("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        org.jsoup.nodes.Element element23 = element18.prependText("");
        org.jsoup.nodes.Element element24 = element23.previousElementSibling();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNull(element24);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.nodes.Element element5 = document3.createElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = element5.prependText("#document");
        boolean boolean9 = element7.hasClass("#document");
        // The following exception was thrown during execution in test generation
        try {
            element7.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!");
        java.util.Set<java.lang.String> strSet7 = document1.classNames();
        java.util.Set<java.lang.String> strSet8 = document1.classNames();
        org.jsoup.nodes.Attributes attributes9 = document1.attributes();
        org.jsoup.select.Elements elements11 = document1.getElementsByAttribute("#root");
        org.jsoup.nodes.Element element12 = document1.head();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = element12.appendText("\n<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\">\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNull(element12);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.prependText("hi!");
        java.lang.String str4 = document1.nodeName();
        org.jsoup.select.Elements elements6 = document1.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        java.lang.String str9 = document8.baseUri();
        java.lang.String str10 = document8.outerHtml();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        java.lang.String str13 = document12.baseUri();
        org.jsoup.nodes.Element element14 = document8.appendChild((org.jsoup.nodes.Node) document12);
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        java.lang.String str17 = document16.baseUri();
        org.jsoup.select.Elements elements19 = document16.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element21 = document16.val("");
        org.jsoup.nodes.Node node23 = document16.removeAttr("#root");
        boolean boolean24 = document8.equals((java.lang.Object) node23);
        org.jsoup.nodes.Element element25 = document1.prependChild((org.jsoup.nodes.Node) document8);
        java.lang.String str27 = document1.attr("");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document2 = document1.normalise();
        java.lang.String str3 = document2.title();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        org.jsoup.nodes.Element element6 = document1.html("");
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueContaining("<#root>\n</#root>", "<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element11 = document1.head();
        org.jsoup.parser.Tag tag12 = element11.tag();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(tag12);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        java.util.Set<java.lang.String> strSet8 = element7.classNames();
        org.jsoup.nodes.Element element10 = element7.removeClass("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = element7.getElementsByAttributeValue("", "<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("#document");
        org.jsoup.nodes.Attributes attributes4 = document1.attributes();
        org.jsoup.nodes.Document document5 = document1.normalise();
        org.jsoup.nodes.Element element7 = document5.createElement("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document36 = document9.normalise();
        org.jsoup.select.Elements elements38 = document36.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element40 = document36.val("");
        org.jsoup.nodes.Element element42 = document36.prependText("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element42);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element14 = document9.val("");
        org.jsoup.nodes.Node node16 = document9.removeAttr("#root");
        boolean boolean17 = document1.equals((java.lang.Object) node16);
        java.lang.String str18 = document1.data();
        org.jsoup.select.Elements elements20 = document1.getElementsByIndexGreaterThan((int) (short) 10);
        org.jsoup.nodes.Element element22 = document1.append("#document hi!");
        java.lang.String str23 = document1.data();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.nodes.Element element5 = document3.createElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = element5.prependText("#document");
        boolean boolean9 = element7.hasClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = element7.addClass("#document");
        org.jsoup.select.Elements elements12 = element7.children();
        org.jsoup.select.Elements elements15 = element7.getElementsByAttributeValueContaining("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" #document\">\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>", "hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.select.Elements elements18 = element7.getElementsByAttributeValueStarting("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        org.jsoup.nodes.Element element11 = element9.appendText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element11.html("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element16 = element11.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "");
        org.jsoup.nodes.Element element18 = element11.appendText("hi!");
        org.jsoup.select.Elements elements20 = element18.getElementsByIndexLessThan((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        org.jsoup.select.Elements elements11 = document1.getElementsByIndexGreaterThan((int) (short) 1);
        boolean boolean13 = document1.hasClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element14 = document1.body();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements16 = element14.select("\n<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\">\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document36 = document9.normalise();
        org.jsoup.nodes.Element element37 = document36.lastElementSibling();
        org.jsoup.select.Elements elements39 = element37.getElementsByClass("#root");
        element37.setBaseUri("hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements39);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        org.jsoup.nodes.Element element11 = element9.appendText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str12 = element11.id();
        org.jsoup.nodes.Element element14 = element11.prependElement("#document");
        java.lang.String str16 = element11.absUrl("<#root>\n</#root>");
        java.lang.String str17 = element11.text();
        element11.remove();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! <html> <head> </head> <body> </body> </html>" + "'", str17, "hi! <html> <head> </head> <body> </body> </html>");
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Element element5 = document1.removeClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element5.childNodes();
        org.jsoup.nodes.Element element8 = element5.getElementById("#document");
        org.jsoup.select.Elements elements11 = element5.getElementsByAttributeValueContaining("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = element5.getElementsByClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(element8);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = element3.text();
        org.jsoup.select.Elements elements6 = element3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements8 = element3.getElementsByIndexEquals(10);
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        java.lang.String str11 = document10.baseUri();
        java.lang.String str12 = document10.outerHtml();
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        java.lang.String str15 = document14.baseUri();
        org.jsoup.nodes.Element element16 = document10.appendChild((org.jsoup.nodes.Node) document14);
        org.jsoup.nodes.Document document17 = document10.normalise();
        org.jsoup.nodes.Element element19 = document10.text("#document");
        document10.title("<#root>\n</#root>");
        java.lang.String str22 = document10.html();
        org.jsoup.nodes.Element element23 = element3.prependChild((org.jsoup.nodes.Node) document10);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<#root>\n</#root>\n<html>\n<head>\n <title>&lt;#root&gt;\n&lt;/#root&gt;</title>\n</head>\n<body>\n #document\n</body>\n</html>" + "'", str22, "<#root>\n</#root>\n<html>\n<head>\n <title>&lt;#root&gt;\n&lt;/#root&gt;</title>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.nodes.Element element6 = document1.append("");
        org.jsoup.nodes.Element element8 = element6.getElementById("#root");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = element8.baseUri();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNull(element8);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element6 = document1.head();
        java.lang.String str7 = document1.title();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = document1.childNode((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("#document");
        org.jsoup.nodes.Attributes attributes4 = document1.attributes();
        org.jsoup.nodes.Document document5 = document1.normalise();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueStarting("<#root>\n</#root>", "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document1.prependText("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.select.Elements elements12 = document1.getElementsByClass("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        org.jsoup.nodes.Element element6 = document1.html("");
        org.jsoup.select.Elements elements8 = document1.getElementsByIndexEquals((int) '#');
        java.lang.String str9 = document1.outerHtml();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = element3.text();
        org.jsoup.select.Elements elements6 = element3.getElementsByTag("hi!");
        java.util.Set<java.lang.String> strSet7 = element3.classNames();
        org.jsoup.nodes.Element element9 = element3.removeClass("hi!");
        org.jsoup.nodes.Element element11 = element3.append("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements13 = element3.getElementsByIndexLessThan((int) (byte) 10);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str2 = document1.id();
        org.jsoup.nodes.Element element4 = document1.createElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element6 = document1.prependText("#document hi!");
        org.jsoup.select.Elements elements7 = element6.getAllElements();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexLessThan((int) ' ');
        boolean boolean16 = document9.hasAttr("<#root>\n</#root>");
        org.jsoup.nodes.Element element18 = document9.val("#root");
        org.jsoup.nodes.Element element20 = element18.addClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element21 = element20.firstElementSibling();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNull(element21);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.prependText("hi!");
        java.lang.String str4 = document1.nodeName();
        org.jsoup.select.Elements elements6 = document1.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        java.lang.String str9 = document8.baseUri();
        java.lang.String str10 = document8.outerHtml();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        java.lang.String str13 = document12.baseUri();
        org.jsoup.nodes.Element element14 = document8.appendChild((org.jsoup.nodes.Node) document12);
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        java.lang.String str17 = document16.baseUri();
        org.jsoup.select.Elements elements19 = document16.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element21 = document16.val("");
        org.jsoup.nodes.Node node23 = document16.removeAttr("#root");
        boolean boolean24 = document8.equals((java.lang.Object) node23);
        org.jsoup.nodes.Element element25 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element27 = document8.createElement("hi!");
        org.jsoup.select.Elements elements30 = document8.getElementsByAttributeValueEnding("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;", "hi!hi!");
        java.lang.String str31 = document8.text();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.html();
        org.jsoup.nodes.Element element7 = document1.empty();
        org.jsoup.nodes.Element element9 = element7.appendText("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element7.select("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.prependText("hi!");
        java.lang.String str4 = document1.nodeName();
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.nodeName();
        org.jsoup.parser.Tag tag7 = document1.tag();
        org.jsoup.nodes.Element element9 = document1.prepend("hi!");
        org.jsoup.select.Elements elements11 = document1.getElementsByIndexGreaterThan(100);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str5, "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element7 = document1.addClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element8 = element7.empty();
        java.lang.String str9 = element7.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        org.jsoup.nodes.Element element11 = element9.appendText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = element9.childNodes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document36 = document9.normalise();
        org.jsoup.nodes.Document document38 = new org.jsoup.nodes.Document("");
        java.lang.String str39 = document38.baseUri();
        org.jsoup.select.Elements elements41 = document38.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element43 = document38.val("");
        org.jsoup.nodes.Element element45 = element43.removeClass("");
        org.jsoup.nodes.Element element46 = document36.appendChild((org.jsoup.nodes.Node) element43);
        org.jsoup.nodes.Document document48 = new org.jsoup.nodes.Document("");
        java.lang.String str49 = document48.baseUri();
        java.lang.String str50 = document48.outerHtml();
        org.jsoup.parser.Tag tag51 = document48.tag();
        org.jsoup.select.Elements elements53 = document48.getElementsByAttribute("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        element43.replaceWith((org.jsoup.nodes.Node) document48);
        java.util.Set<java.lang.String> strSet55 = document48.classNames();
        org.jsoup.nodes.Document document57 = new org.jsoup.nodes.Document("");
        java.lang.String str58 = document57.baseUri();
        org.jsoup.select.Elements elements60 = document57.getElementsByAttribute("hi!");
        java.lang.String str61 = document57.html();
        org.jsoup.nodes.Element element63 = document57.prependText("hi!");
        java.lang.String str64 = document57.id();
        org.jsoup.select.Elements elements66 = document57.getElementsByClass("#document");
        org.jsoup.nodes.Element element67 = document48.appendChild((org.jsoup.nodes.Node) document57);
        org.jsoup.nodes.Element element69 = document48.html("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.jsoup.nodes.Node node71 = element69.childNode(0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(tag51);
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertNotNull(strSet55);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(elements60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(elements66);
        org.junit.Assert.assertNotNull(element67);
        org.junit.Assert.assertNotNull(element69);
        org.junit.Assert.assertNotNull(node71);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        org.jsoup.nodes.Element element11 = element9.appendText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element11.html("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        element13.remove();
        org.jsoup.nodes.Element element16 = element13.removeClass("#root");
        java.lang.String str17 = element16.text();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        java.lang.String str4 = document1.tagName();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        java.lang.String str7 = document6.baseUri();
        org.jsoup.select.Elements elements9 = document6.getElementsByAttribute("hi!");
        java.lang.String str10 = document6.html();
        java.lang.String str12 = document6.attr("");
        java.lang.String str13 = document6.id();
        org.jsoup.nodes.Element element14 = document1.prependChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Document document15 = document1.normalise();
        java.lang.String str16 = document1.title();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("#root");
        org.jsoup.nodes.Element element5 = document1.parent();
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNull(element5);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element7 = document1.addClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element9 = element7.appendText("");
        java.lang.String str11 = element7.attr("");
        org.jsoup.nodes.Element element13 = element7.append("");
        org.jsoup.nodes.Attributes attributes14 = element7.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = element7.childNodes();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.nodes.Element element14 = element3.wrap("hi!");
        org.jsoup.nodes.Attributes attributes15 = element3.attributes();
        java.lang.String str17 = element3.absUrl("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.prependText("hi!");
        java.lang.String str4 = document1.nodeName();
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.nodeName();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element10 = document8.prependText("hi!");
        java.lang.String str11 = document8.nodeName();
        document8.title("#root");
        org.jsoup.nodes.Element element14 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element16 = document1.addClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str17 = element16.html();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str5, "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#document" + "'", str11, "#document");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<#root>\nhi!\n<html>\n <head>\n  <title>#root</title>\n </head>\n <body>\n </body>\n</html>\n</#root>hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str17, "<#root>\nhi!\n<html>\n <head>\n  <title>#root</title>\n </head>\n <body>\n </body>\n</html>\n</#root>hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!");
        java.lang.String str7 = document1.className();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element14 = document9.val("");
        org.jsoup.nodes.Element element16 = element14.removeClass("");
        boolean boolean17 = document1.equals((java.lang.Object) element14);
        org.jsoup.nodes.Element element19 = document1.appendText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements21 = document1.getElementsByAttribute("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str22 = document1.html();
        org.jsoup.nodes.Node node24 = document1.removeAttr("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;" + "'", str22, "hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        org.jsoup.select.Elements elements5 = element3.getElementsByIndexEquals((int) '#');
        org.jsoup.select.Elements elements6 = element3.children();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        org.jsoup.nodes.Element element10 = element6.removeClass("#root");
        java.lang.Class<?> wildcardClass11 = element6.getClass();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.parser.Tag tag4 = document1.tag();
        org.jsoup.select.Elements elements6 = document1.getElementsByAttribute("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.nodes.Document document8 = document7.normalise();
        org.jsoup.parser.Tag tag9 = document7.tag();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        org.jsoup.nodes.Document document8 = document1.normalise();
        org.jsoup.nodes.Element element10 = document8.wrap("#root");
        org.jsoup.nodes.Element element12 = document8.toggleClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element14 = document8.appendElement("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Element element16 = document8.appendText("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element19 = document8.attr("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;", "<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.jsoup.nodes.Element element20 = document8.body();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexLessThan((int) ' ');
        boolean boolean16 = document9.hasAttr("<#root>\n</#root>");
        org.jsoup.nodes.Element element18 = document9.val("#root");
        org.jsoup.nodes.Element element20 = element18.addClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element22 = element20.appendText("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element24 = element22.prepend("<#root>\nhi!\n<html>\n <head>\n  <title>#root</title>\n </head>\n <body>\n </body>\n</html>\n</#root>hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.nodes.Element element14 = element3.wrap("hi!");
        org.jsoup.select.Elements elements15 = element3.getAllElements();
        org.jsoup.nodes.Element element17 = element3.val("");
        java.lang.String str19 = element3.absUrl("\n <hi!>\n </hi!>");
        org.jsoup.nodes.Element element21 = element3.val("hi!hi!");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document36 = document9.normalise();
        org.jsoup.nodes.Element element37 = document36.lastElementSibling();
        org.jsoup.select.Elements elements39 = element37.getElementsByClass("#root");
        java.util.Set<java.lang.String> strSet40 = element37.classNames();
        org.jsoup.nodes.Element element41 = element37.lastElementSibling();
        org.jsoup.select.Elements elements42 = element41.getAllElements();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(elements42);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element14 = document9.val("");
        org.jsoup.nodes.Node node16 = document9.removeAttr("#root");
        boolean boolean17 = document1.equals((java.lang.Object) node16);
        java.util.Set<java.lang.String> strSet18 = document1.classNames();
        java.lang.String str19 = document1.title();
        org.jsoup.nodes.Element element20 = document1.body();
        org.jsoup.nodes.Element element21 = document1.body();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(element20);
        org.junit.Assert.assertNull(element21);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        org.jsoup.nodes.Element element6 = document1.html("");
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueContaining("<#root>\n</#root>", "<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements13 = document1.getElementsByAttributeValueContaining("hi!", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("#document");
        org.jsoup.nodes.Attributes attributes4 = document1.attributes();
        org.jsoup.nodes.Document document5 = document1.normalise();
        org.jsoup.nodes.Element element7 = document5.prependElement("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        java.lang.String[] strArray20 = new java.lang.String[] { "<html>\n<head>\n <title></title>\n</head>\n<body>\n</body>\n</html>", "#document hi!", "#document", "#document hi!", "hi! <html> <head> </head> <body> </body> </html>", "<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>", "hi!\n<html>\n<head>\n <title>#root</title>\n</head>\n<body>\n</body>\n</html>", "<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>", "hi!\n<html>\n<head>\n <title>#root</title>\n</head>\n<body>\n</body>\n</html>", "<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>", "<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" #document\">\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>", "\n<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\">\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        org.jsoup.nodes.Element element23 = element7.classNames((java.util.Set<java.lang.String>) strSet21);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document36 = document9.normalise();
        org.jsoup.select.Elements elements38 = document36.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element40 = document36.val("");
        org.jsoup.nodes.Document document42 = new org.jsoup.nodes.Document("");
        java.lang.String str43 = document42.baseUri();
        org.jsoup.select.Elements elements45 = document42.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element47 = document42.val("");
        java.lang.Object obj48 = null;
        boolean boolean49 = element47.equals(obj48);
        boolean boolean50 = element47.hasText();
        java.lang.String[] strArray54 = new java.lang.String[] { "#root", "#root", "#root" };
        java.util.LinkedHashSet<java.lang.String> strSet55 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet55, strArray54);
        org.jsoup.nodes.Element element57 = element47.classNames((java.util.Set<java.lang.String>) strSet55);
        org.jsoup.nodes.Element element58 = document36.classNames((java.util.Set<java.lang.String>) strSet55);
        org.jsoup.select.Elements elements59 = document36.getAllElements();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(elements59);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        boolean boolean4 = document1.hasClass("");
        java.lang.String str5 = document1.className();
        org.jsoup.select.Elements elements6 = document1.children();
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.nodes.Element element8 = document7.head();
        java.lang.String str9 = document7.title();
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#document");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexEquals((int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertNotNull(elements4);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.nodes.Element element5 = document3.createElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = element5.prependText("#document");
        org.jsoup.select.Elements elements9 = element7.getElementsByIndexLessThan(1);
        org.jsoup.nodes.Attributes attributes10 = element7.attributes();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document36 = document9.normalise();
        org.jsoup.select.Elements elements38 = document36.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element40 = document36.val("");
        org.jsoup.nodes.Document document42 = new org.jsoup.nodes.Document("");
        java.lang.String str43 = document42.baseUri();
        org.jsoup.select.Elements elements45 = document42.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element47 = document42.val("");
        java.lang.Object obj48 = null;
        boolean boolean49 = element47.equals(obj48);
        boolean boolean50 = element47.hasText();
        java.lang.String[] strArray54 = new java.lang.String[] { "#root", "#root", "#root" };
        java.util.LinkedHashSet<java.lang.String> strSet55 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet55, strArray54);
        org.jsoup.nodes.Element element57 = element47.classNames((java.util.Set<java.lang.String>) strSet55);
        org.jsoup.nodes.Element element58 = document36.classNames((java.util.Set<java.lang.String>) strSet55);
        org.jsoup.nodes.Element element60 = element58.prependText("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element62 = element60.val("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(element60);
        org.junit.Assert.assertNotNull(element62);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element2 = document1.head();
        org.jsoup.nodes.Node node3 = null;
        // The following exception was thrown during execution in test generation
        try {
            element2.replaceWith(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str2 = document1.id();
        org.jsoup.nodes.Element element4 = document1.createElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element6 = document1.prependText("#document hi!");
        org.jsoup.select.Elements elements7 = element6.children();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element14 = document9.val("");
        org.jsoup.nodes.Node node16 = document9.removeAttr("#root");
        boolean boolean17 = document1.equals((java.lang.Object) node16);
        org.jsoup.nodes.Element element18 = document1.body();
        // The following exception was thrown during execution in test generation
        try {
            element18.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(element18);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Node node15 = document9.previousSibling();
        java.lang.String str16 = document9.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements19 = document9.getElementsByAttributeValueContaining("", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#document" + "'", str16, "#document");
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.parser.Tag tag6 = document1.tag();
        org.jsoup.nodes.Element element7 = document1.empty();
        java.lang.String str8 = element7.className();
        java.lang.String str9 = element7.tagName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#root" + "'", str9, "#root");
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.getElementById("hi!");
        java.lang.String str7 = document1.outerHtml();
        java.lang.String str8 = document1.toString();
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueEnding("<#root>\n</#root>\n<html>\n<head>\n <title>&lt;#root&gt;\n&lt;/#root&gt;</title>\n</head>\n<body>\n #document\n</body>\n</html>", "hi!hi!");
        org.jsoup.nodes.Element element12 = document1.body();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNull(element12);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.nodes.Element element5 = document3.createElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = element5.prependText("#document");
        boolean boolean9 = element7.hasClass("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = element7.childNode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.nodes.Element element14 = element3.wrap("hi!");
        org.jsoup.nodes.Attributes attributes15 = element3.attributes();
        org.jsoup.nodes.Element element17 = element3.appendElement("#root");
        org.jsoup.nodes.Node node19 = element3.childNode(1);
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        java.lang.String str22 = document21.baseUri();
        org.jsoup.select.Elements elements24 = document21.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element26 = document21.getElementById("hi!");
        org.jsoup.nodes.Element element27 = element3.appendChild((org.jsoup.nodes.Node) document21);
        org.jsoup.nodes.Element element29 = document21.append("");
        org.jsoup.select.Elements elements30 = document21.siblingElements();
        org.jsoup.nodes.Element element31 = document21.body();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNull(element26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNull(element31);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.nodes.Element element14 = element3.wrap("hi!");
        org.jsoup.select.Elements elements15 = element3.getAllElements();
        org.jsoup.nodes.Element element17 = element3.val("");
        org.jsoup.select.Elements elements19 = element17.getElementsByAttribute("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        boolean boolean4 = document1.hasClass("");
        java.lang.String str5 = document1.className();
        org.jsoup.select.Elements elements6 = document1.children();
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.nodes.Element element8 = document7.head();
        org.jsoup.nodes.Element element10 = document7.appendElement("hi!");
        java.lang.String str11 = document7.val();
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document36 = document9.normalise();
        org.jsoup.select.Elements elements38 = document36.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element40 = document36.val("");
        org.jsoup.nodes.Document document42 = new org.jsoup.nodes.Document("");
        java.lang.String str43 = document42.baseUri();
        org.jsoup.select.Elements elements45 = document42.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element47 = document42.val("");
        java.lang.Object obj48 = null;
        boolean boolean49 = element47.equals(obj48);
        boolean boolean50 = element47.hasText();
        java.lang.String[] strArray54 = new java.lang.String[] { "#root", "#root", "#root" };
        java.util.LinkedHashSet<java.lang.String> strSet55 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet55, strArray54);
        org.jsoup.nodes.Element element57 = element47.classNames((java.util.Set<java.lang.String>) strSet55);
        org.jsoup.nodes.Element element58 = document36.classNames((java.util.Set<java.lang.String>) strSet55);
        org.jsoup.nodes.Element element60 = element58.prependText("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element62 = element58.appendText("<#root>\n</#root>\n<html>\n<head>\n <title>&lt;#root&gt;\n&lt;/#root&gt;</title>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(element60);
        org.junit.Assert.assertNotNull(element62);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.tagName();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element8 = document6.appendText("");
        org.jsoup.nodes.Element element9 = document1.appendChild((org.jsoup.nodes.Node) document6);
        document6.setBaseUri("\n <hi!>\n </hi!>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.select.Elements elements7 = document1.getAllElements();
        java.lang.String str8 = document1.tagName();
        org.jsoup.nodes.Element element10 = document1.toggleClass("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Element element12 = element10.prependText("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        java.lang.String str14 = element10.absUrl("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#root" + "'", str8, "#root");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.nodeName();
        java.lang.String str7 = document1.outerHtml();
        org.jsoup.select.Elements elements9 = document1.getElementsByAttribute("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        java.lang.String str11 = document10.baseUri();
        org.jsoup.select.Elements elements13 = document10.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element15 = document10.val("");
        java.lang.Object obj16 = null;
        boolean boolean17 = element15.equals(obj16);
        boolean boolean18 = element15.hasText();
        java.lang.String[] strArray22 = new java.lang.String[] { "#root", "#root", "#root" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        org.jsoup.nodes.Element element25 = element15.classNames((java.util.Set<java.lang.String>) strSet23);
        org.jsoup.nodes.Element element26 = element8.classNames((java.util.Set<java.lang.String>) strSet23);
        org.jsoup.nodes.Element element28 = element26.addClass("hi!hi!");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueStarting("hi!", "hi!");
        org.jsoup.nodes.Element element10 = document1.head();
        org.jsoup.nodes.Element element12 = document1.prependText("#document");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.nodes.Element element5 = document3.createElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = element5.prependText("#document");
        org.jsoup.select.Elements elements9 = element7.getElementsByIndexLessThan(1);
        org.jsoup.nodes.Element element11 = element7.val("");
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.html();
        org.jsoup.nodes.Element element7 = document1.empty();
        boolean boolean8 = document1.isBlock();
        document1.setBaseUri("#document");
        org.jsoup.nodes.Element element11 = document1.head();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(element11);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element16 = document9.appendElement("hi!");
        org.jsoup.nodes.Element element17 = document9.empty();
        org.jsoup.nodes.Element element19 = document9.html("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = element19.childNode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element16 = document9.appendElement("hi!");
        org.jsoup.nodes.Element element18 = element16.prependElement("hi!");
        org.jsoup.select.Elements elements21 = element18.getElementsByAttributeValueEnding("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        org.jsoup.nodes.Element element23 = element18.prependText("");
        org.jsoup.select.Elements elements26 = element23.getElementsByAttributeValueEnding("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>", "#root");
        org.jsoup.select.Elements elements27 = element23.siblingElements();
        boolean boolean29 = element23.hasAttr("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element30 = element23.empty();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(element30);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        org.jsoup.nodes.Element element5 = document1.removeClass("");
        java.lang.String str7 = element5.attr("#root");
        org.jsoup.select.Elements elements8 = element5.getAllElements();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        org.jsoup.nodes.Element element5 = element3.html("#root");
        org.jsoup.nodes.Node node7 = element5.removeAttr("#document hi!");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        java.lang.String str4 = document1.html();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Node node8 = document1.removeAttr("hi! #root hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document8 = document1.normalise();
        java.lang.String str9 = document1.title();
        org.jsoup.nodes.Element element11 = document1.val("hi!");
        org.jsoup.nodes.Element element14 = document1.attr("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>", "");
        org.jsoup.nodes.Document document15 = document1.normalise();
        org.jsoup.nodes.Element element17 = document15.toggleClass("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Element element5 = document1.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi! #root hi!");
        org.jsoup.nodes.Element element7 = element5.appendText("\n <hi!>\n </hi!>");
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        java.lang.String str13 = element3.id();
        org.jsoup.select.Elements elements16 = element3.getElementsByAttributeValue("<#root>\nhi!\n<html>\n <head>\n  <title>#root</title>\n </head>\n <body>\n </body>\n</html>\n</#root>hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "#document hi!");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element16 = document9.appendElement("hi!");
        boolean boolean18 = document9.hasClass("#document");
        java.lang.String str19 = document9.title();
        org.jsoup.select.Elements elements21 = document9.getElementsByAttribute("\n <hi!>\n </hi!>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        org.jsoup.nodes.Element element11 = element9.appendText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element11.html("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element16 = element11.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "");
        org.jsoup.nodes.Element element18 = element11.html("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Attributes attributes4 = element3.attributes();
        org.jsoup.select.Elements elements7 = element3.getElementsByAttributeValue("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" #document\">\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>", "<#root>\nhi!\n<html>\n <head>\n  <title>#root</title>\n </head>\n <body>\n </body>\n</html>\n</#root>hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document36 = document9.normalise();
        org.jsoup.select.Elements elements38 = document36.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element40 = document36.val("");
        org.jsoup.select.Elements elements42 = element40.getElementsByIndexEquals((int) (short) 100);
        org.jsoup.nodes.Node node43 = element40.previousSibling();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertNull(node43);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document36 = document9.normalise();
        org.jsoup.select.Elements elements38 = document36.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element40 = document36.val("");
        org.jsoup.nodes.Element element42 = document36.val("<#root>\n</#root>");
        org.jsoup.parser.Tag tag43 = element42.tag();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(tag43);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueStarting("hi!", "hi!");
        org.jsoup.nodes.Element element11 = document1.val("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        java.lang.String str12 = element11.val();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;" + "'", str12, "hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.getElementById("hi!");
        java.lang.String str7 = document1.outerHtml();
        java.lang.String str8 = document1.baseUri();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        boolean boolean12 = document10.hasClass("hi!");
        boolean boolean14 = document10.hasClass("hi!");
        java.lang.String str15 = document10.outerHtml();
        boolean boolean16 = document10.hasText();
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        java.lang.String str19 = document18.baseUri();
        org.jsoup.select.Elements elements21 = document18.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element23 = document18.val("");
        org.jsoup.nodes.Element element25 = element23.removeClass("");
        org.jsoup.nodes.Element element27 = element23.removeClass("#root");
        java.util.Set<java.lang.String> strSet28 = element23.classNames();
        org.jsoup.nodes.Element element29 = document10.classNames(strSet28);
        org.jsoup.nodes.Element element30 = document1.classNames(strSet28);
        org.jsoup.select.Elements elements33 = element30.getElementsByAttributeValueStarting("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>", "#root");
        boolean boolean34 = element30.isBlock();
        org.jsoup.nodes.Element element37 = element30.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        org.jsoup.nodes.Element element39 = element37.prependText("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Node node41 = element39.removeAttr("\n <hi!>\n </hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(node41);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.nodes.Element element5 = document3.createElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = element5.prependText("#document");
        boolean boolean9 = element7.hasClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = element7.addClass("#document");
        org.jsoup.nodes.Element element13 = element11.appendText("<#root>\n</#root>");
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        java.lang.String str16 = document15.baseUri();
        org.jsoup.select.Elements elements18 = document15.getElementsByAttribute("hi!");
        java.lang.String str19 = document15.html();
        java.lang.String str20 = document15.outerHtml();
        boolean boolean22 = document15.hasClass("#root");
        boolean boolean23 = element11.equals((java.lang.Object) "#root");
        org.jsoup.nodes.Element element24 = element11.empty();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Element element3 = document1.head();
        org.jsoup.select.Elements elements5 = document1.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element7 = document1.prepend("#document");
        org.jsoup.select.Elements elements9 = element7.getElementsByTag("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = element3.text();
        java.lang.String str5 = element3.data();
        org.jsoup.nodes.Element element6 = element3.parent();
        org.jsoup.nodes.Element element9 = element3.attr("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = element9.html("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" #document\">\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        boolean boolean12 = element9.isBlock();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        org.jsoup.nodes.Element element11 = element9.appendText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element11.html("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("<#root>\n</#root>");
        org.jsoup.nodes.Element element16 = element13.appendChild((org.jsoup.nodes.Node) document15);
        org.jsoup.nodes.Element element17 = element16.nextElementSibling();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNull(element17);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element7 = document1.addClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element9 = element7.appendText("");
        java.lang.String str11 = element7.attr("");
        org.jsoup.nodes.Element element13 = element7.append("");
        org.jsoup.nodes.Attributes attributes14 = element7.attributes();
        java.lang.String str15 = element7.baseUri();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Attributes attributes4 = element3.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = element3.siblingNodes();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(nodeList5);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.tagName();
        java.lang.String str5 = document1.text();
        java.lang.String str6 = document1.html();
        java.util.Set<java.lang.String> strSet7 = document1.classNames();
        java.lang.String str9 = document1.absUrl("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        java.lang.String str10 = document1.text();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element7 = document1.toggleClass("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexLessThan((int) ' ');
        boolean boolean16 = document9.hasAttr("<#root>\n</#root>");
        org.jsoup.nodes.Element element18 = document9.removeClass("#root");
        org.jsoup.select.Elements elements20 = element18.getElementsByIndexEquals((int) (byte) 100);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document36 = document9.normalise();
        org.jsoup.nodes.Element element37 = document36.lastElementSibling();
        org.jsoup.select.Elements elements39 = element37.getElementsByClass("#root");
        java.util.Set<java.lang.String> strSet40 = element37.classNames();
        org.jsoup.select.Elements elements43 = element37.getElementsByAttributeValueEnding("#root", "<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" #document\">\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertNotNull(elements43);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document8 = document1.normalise();
        java.lang.String str9 = document1.title();
        org.jsoup.nodes.Element element11 = document1.val("hi!");
        org.jsoup.nodes.Element element14 = document1.attr("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>", "");
        org.jsoup.nodes.Element element16 = document1.val("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element3 = document1.getElementById("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        boolean boolean8 = document6.hasClass("hi!");
        java.lang.String str9 = document6.className();
        boolean boolean10 = document6.hasText();
        org.jsoup.select.Elements elements12 = document6.getElementsByIndexEquals(0);
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element16 = document14.appendText("");
        java.lang.String str17 = document14.title();
        org.jsoup.nodes.Node node19 = document14.removeAttr("hi!");
        java.lang.String str20 = document14.className();
        org.jsoup.select.Elements elements22 = document14.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element23 = document6.appendChild((org.jsoup.nodes.Node) document14);
        org.jsoup.nodes.Document document24 = document6.normalise();
        boolean boolean25 = document1.equals((java.lang.Object) document24);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document36 = document9.normalise();
        org.jsoup.select.Elements elements38 = document36.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element40 = document36.val("");
        org.jsoup.nodes.Element element42 = document36.val("<#root>\n</#root>");
        org.jsoup.nodes.Element element44 = element42.prependElement("#document hi!");
        org.jsoup.select.Elements elements47 = element42.getElementsByAttributeValueNot("#document", "hi! <html> <head> </head> <body> </body> </html>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(elements47);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexLessThan((int) ' ');
        boolean boolean16 = document9.hasAttr("<#root>\n</#root>");
        org.jsoup.nodes.Element element18 = document9.val("#root");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = element18.childNodes();
        org.jsoup.nodes.Element element21 = element18.prependText("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Attributes attributes22 = element21.attributes();
        boolean boolean23 = element21.isBlock();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        boolean boolean3 = document1.isBlock();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        java.lang.String str8 = document5.html();
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        java.lang.Object obj7 = null;
        boolean boolean8 = element6.equals(obj7);
        boolean boolean9 = element6.hasText();
        java.lang.String[] strArray13 = new java.lang.String[] { "#root", "#root", "#root" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.jsoup.nodes.Element element16 = element6.classNames((java.util.Set<java.lang.String>) strSet14);
        org.jsoup.nodes.Element element18 = element16.appendText("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.select.Elements elements21 = element16.getElementsByAttributeValue("<html>\n<head>\n <title></title>\n</head>\n<body>\n</body>\n</html>", "<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.nodes.Node node14 = element3.removeAttr("hi!");
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.nodes.Element element29 = element18.wrap("hi!");
        org.jsoup.nodes.Attributes attributes30 = element18.attributes();
        boolean boolean31 = element3.equals((java.lang.Object) element18);
        org.jsoup.nodes.Element element33 = element3.appendElement("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element34 = element3.parent();
        org.jsoup.nodes.Document document36 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element38 = document36.appendText("");
        org.jsoup.nodes.Document document40 = new org.jsoup.nodes.Document("");
        java.lang.String str41 = document40.baseUri();
        java.lang.String str42 = document40.outerHtml();
        org.jsoup.nodes.Document document44 = new org.jsoup.nodes.Document("");
        java.lang.String str45 = document44.baseUri();
        org.jsoup.nodes.Element element46 = document40.appendChild((org.jsoup.nodes.Node) document44);
        boolean boolean47 = element38.equals((java.lang.Object) document44);
        org.jsoup.select.Elements elements49 = document44.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element51 = document44.appendElement("hi!");
        org.jsoup.nodes.Element element53 = element51.prependElement("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList54 = element53.siblingNodes();
        java.lang.String str55 = element53.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element56 = element3.prependChild((org.jsoup.nodes.Node) element53);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang.NotImplementedException; message: Cannot (yet) move nodes in tree");
        } catch (org.apache.commons.lang.NotImplementedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(element29);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNull(element34);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(nodeList54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\n <hi!>\n </hi!>" + "'", str55, "\n <hi!>\n </hi!>");
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.prependText("hi!");
        java.lang.String str4 = document1.nodeName();
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.nodeName();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element10 = document8.prependText("hi!");
        java.lang.String str11 = document8.nodeName();
        document8.title("#root");
        org.jsoup.nodes.Element element14 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element16 = document1.html("#document");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str5, "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#document" + "'", str11, "#document");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.html();
        org.jsoup.nodes.Element element7 = document1.empty();
        org.jsoup.nodes.Element element8 = element7.empty();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element8 = document1.html("hi!");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element9.siblingNodes();
        org.jsoup.nodes.Attributes attributes11 = element9.attributes();
        org.jsoup.select.Elements elements13 = element9.getElementsByTag("#document hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        org.jsoup.nodes.Element element6 = document1.html("");
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.nodes.Element element9 = document1.prependElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = element9.addClass("hi! <html> <head> </head> <body> </body> </html>");
        java.lang.String str12 = element9.val();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.parser.Tag tag6 = document1.tag();
        org.jsoup.nodes.Element element7 = document1.empty();
        java.lang.String str8 = element7.className();
        org.jsoup.nodes.Node node10 = element7.removeAttr("<#root>\nhi!\n<html>\n <head>\n  <title>#root</title>\n </head>\n <body>\n </body>\n</html>\n</#root>hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            node10.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        org.jsoup.nodes.Document document8 = document1.normalise();
        org.jsoup.nodes.Element element10 = document8.wrap("#root");
        org.jsoup.nodes.Element element12 = document8.toggleClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element14 = document8.appendElement("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Element element16 = document8.appendText("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element18 = element16.html("<#root>\n</#root>");
        java.lang.String str19 = element16.baseUri();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document36 = document9.normalise();
        org.jsoup.nodes.Document document38 = new org.jsoup.nodes.Document("");
        java.lang.String str39 = document38.baseUri();
        org.jsoup.select.Elements elements41 = document38.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element43 = document38.val("");
        org.jsoup.nodes.Element element45 = element43.removeClass("");
        org.jsoup.nodes.Element element46 = document36.appendChild((org.jsoup.nodes.Node) element43);
        org.jsoup.nodes.Document document48 = new org.jsoup.nodes.Document("");
        java.lang.String str49 = document48.baseUri();
        java.lang.String str50 = document48.outerHtml();
        org.jsoup.parser.Tag tag51 = document48.tag();
        org.jsoup.select.Elements elements53 = document48.getElementsByAttribute("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        element43.replaceWith((org.jsoup.nodes.Node) document48);
        java.util.Set<java.lang.String> strSet55 = document48.classNames();
        org.jsoup.select.Elements elements56 = document48.getAllElements();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements58 = document48.getElementsByTag("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(tag51);
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertNotNull(strSet55);
        org.junit.Assert.assertNotNull(elements56);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.prependText("hi!");
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValueContaining("#root", "<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Element element8 = document1.append("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str10 = document1.attr("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.select.Elements elements13 = document1.getElementsByAttributeValueContaining("<#root>\n</#root>", "hi! #root hi!");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.nodes.Element element14 = element3.wrap("hi!");
        org.jsoup.nodes.Attributes attributes15 = element3.attributes();
        org.jsoup.nodes.Element element17 = element3.appendElement("#root");
        org.jsoup.nodes.Node node19 = element3.childNode(1);
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        java.lang.String str22 = document21.baseUri();
        org.jsoup.select.Elements elements24 = document21.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element26 = document21.getElementById("hi!");
        org.jsoup.nodes.Element element27 = element3.appendChild((org.jsoup.nodes.Node) document21);
        org.jsoup.nodes.Element element29 = document21.prependElement("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element31 = element29.child((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNull(element26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        org.jsoup.nodes.Element element10 = element6.removeClass("#root");
        org.jsoup.select.Elements elements13 = element6.getElementsByAttributeValue("#document", "hi!");
        org.jsoup.select.Elements elements16 = element6.getElementsByAttributeValueNot("#document", "#document");
        org.jsoup.nodes.Element element18 = element6.getElementById("hi!\n<html>\n<head>\n <title>#root</title>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNull(element18);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Element element5 = document1.removeClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements7 = element5.getElementsByIndexEquals(1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document8 = document1.normalise();
        java.lang.String str9 = document1.title();
        org.jsoup.nodes.Element element11 = document1.val("hi!");
        org.jsoup.nodes.Element element14 = document1.attr("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>", "");
        org.jsoup.nodes.Document document15 = document1.normalise();
        org.jsoup.select.Elements elements17 = document1.getElementsByIndexLessThan((-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        org.jsoup.nodes.Element element11 = element9.appendText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str12 = element11.id();
        org.jsoup.nodes.Element element14 = element11.prependElement("#document");
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.util.Set<java.lang.String> strSet17 = document16.classNames();
        org.jsoup.nodes.Element element18 = element14.classNames(strSet17);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.nodes.Element element14 = element3.wrap("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = element14.isBlock();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!");
        java.lang.String str7 = document1.className();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element14 = document9.val("");
        org.jsoup.nodes.Element element16 = element14.removeClass("");
        boolean boolean17 = document1.equals((java.lang.Object) element14);
        org.jsoup.select.Elements elements19 = document1.getElementsByAttribute("#root");
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        java.lang.String str22 = document21.baseUri();
        org.jsoup.select.Elements elements24 = document21.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element26 = document21.val("");
        java.lang.Object obj27 = null;
        boolean boolean28 = element26.equals(obj27);
        boolean boolean29 = element26.hasText();
        org.jsoup.select.Elements elements32 = element26.getElementsByAttributeValueContaining("#root", "#document");
        boolean boolean33 = document1.equals((java.lang.Object) element26);
        org.jsoup.nodes.Document document35 = new org.jsoup.nodes.Document("");
        boolean boolean37 = document35.hasClass("hi!");
        java.lang.String str38 = document35.tagName();
        org.jsoup.nodes.Document document40 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element42 = document40.appendText("");
        org.jsoup.nodes.Element element43 = document35.appendChild((org.jsoup.nodes.Node) document40);
        // The following exception was thrown during execution in test generation
        try {
            document1.replaceWith((org.jsoup.nodes.Node) document40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "#root" + "'", str38, "#root");
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element43);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        java.lang.String str10 = document1.text();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        java.lang.String str13 = document12.baseUri();
        org.jsoup.select.Elements elements15 = document12.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element17 = document12.val("");
        java.lang.Object obj18 = null;
        boolean boolean19 = element17.equals(obj18);
        boolean boolean20 = element17.hasText();
        org.jsoup.nodes.Element element21 = document1.prependChild((org.jsoup.nodes.Node) element17);
        java.util.List<org.jsoup.nodes.Node> nodeList22 = element17.siblingNodes();
        org.jsoup.select.Elements elements24 = element17.getElementsByIndexEquals(0);
        org.jsoup.nodes.Element element26 = element17.prependElement("\n<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\">\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element26);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Element element9 = element7.appendText("hi!");
        java.lang.String str10 = element9.tagName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.outerHtml();
        org.jsoup.select.Elements elements8 = document1.getElementsByTag("#document");
        java.lang.String str9 = document1.title();
        org.jsoup.nodes.Element element10 = document1.parent();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        boolean boolean14 = document12.hasClass("hi!");
        java.lang.String str15 = document12.tagName();
        org.jsoup.nodes.Document document17 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element19 = document17.appendText("");
        org.jsoup.nodes.Element element20 = document12.appendChild((org.jsoup.nodes.Node) document17);
        java.util.List<org.jsoup.nodes.Node> nodeList21 = document17.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = document17.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            element10.replaceWith((org.jsoup.nodes.Node) document17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#root" + "'", str15, "#root");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(nodeList22);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.select.Elements elements7 = document1.getAllElements();
        java.lang.String str8 = document1.tagName();
        boolean boolean9 = document1.isBlock();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#root" + "'", str8, "#root");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        java.lang.String str7 = document6.baseUri();
        org.jsoup.select.Elements elements9 = document6.getElementsByAttribute("hi!");
        java.lang.String str10 = document6.html();
        org.jsoup.nodes.Element element12 = document6.prependText("hi!");
        java.util.Set<java.lang.String> strSet13 = element12.classNames();
        org.jsoup.nodes.Element element14 = document1.classNames(strSet13);
        org.jsoup.nodes.Element element16 = element14.removeClass("hi!");
        org.jsoup.parser.Tag tag17 = element14.tag();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(tag17);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.val();
        java.lang.String str3 = document1.tagName();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("#root");
        org.jsoup.select.Elements elements7 = document1.getElementsByAttributeValueEnding("#document", "#document");
        org.jsoup.nodes.Element element9 = document1.val("hi!");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document11.appendText("");
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        java.lang.String str16 = document15.baseUri();
        java.lang.String str17 = document15.outerHtml();
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        java.lang.String str20 = document19.baseUri();
        org.jsoup.nodes.Element element21 = document15.appendChild((org.jsoup.nodes.Node) document19);
        boolean boolean22 = element13.equals((java.lang.Object) document19);
        org.jsoup.select.Elements elements24 = document19.getElementsByIndexLessThan((int) ' ');
        boolean boolean25 = element9.equals((java.lang.Object) document19);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element27 = document19.child((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!");
        java.lang.String str7 = document1.className();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element14 = document9.val("");
        org.jsoup.nodes.Element element16 = element14.removeClass("");
        boolean boolean17 = document1.equals((java.lang.Object) element14);
        org.jsoup.select.Elements elements19 = document1.getElementsByAttribute("#root");
        org.jsoup.nodes.Document document21 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element23 = document21.prependText("hi!");
        java.lang.String str24 = document21.nodeName();
        org.jsoup.select.Elements elements26 = document21.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Document document28 = new org.jsoup.nodes.Document("");
        java.lang.String str29 = document28.baseUri();
        java.lang.String str30 = document28.outerHtml();
        org.jsoup.nodes.Document document32 = new org.jsoup.nodes.Document("");
        java.lang.String str33 = document32.baseUri();
        org.jsoup.nodes.Element element34 = document28.appendChild((org.jsoup.nodes.Node) document32);
        org.jsoup.nodes.Document document36 = new org.jsoup.nodes.Document("");
        java.lang.String str37 = document36.baseUri();
        org.jsoup.select.Elements elements39 = document36.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element41 = document36.val("");
        org.jsoup.nodes.Node node43 = document36.removeAttr("#root");
        boolean boolean44 = document28.equals((java.lang.Object) node43);
        org.jsoup.nodes.Element element45 = document21.prependChild((org.jsoup.nodes.Node) document28);
        org.jsoup.select.Elements elements46 = element45.getAllElements();
        boolean boolean47 = document1.equals((java.lang.Object) element45);
        org.jsoup.nodes.Node node49 = element45.removeAttr("hi!");
        org.jsoup.nodes.Element element51 = element45.prepend("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#document" + "'", str24, "#document");
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(element51);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        boolean boolean4 = document1.hasClass("");
        java.lang.String str5 = document1.className();
        org.jsoup.select.Elements elements6 = document1.children();
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag10 = document9.tag();
        org.jsoup.nodes.Document document11 = document9.normalise();
        org.jsoup.nodes.Element element13 = document11.createElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element15 = element13.prependText("#document");
        boolean boolean17 = element15.hasClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element19 = element15.addClass("#document");
        org.jsoup.select.Elements elements20 = element15.children();
        boolean boolean21 = document7.equals((java.lang.Object) elements20);
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        java.lang.Object obj7 = null;
        boolean boolean8 = element6.equals(obj7);
        boolean boolean9 = element6.hasText();
        java.lang.String[] strArray13 = new java.lang.String[] { "#root", "#root", "#root" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.jsoup.nodes.Element element16 = element6.classNames((java.util.Set<java.lang.String>) strSet14);
        org.jsoup.select.Elements elements18 = element6.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.Class<?> wildcardClass19 = element6.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.nodes.Node node14 = element3.removeAttr("hi!");
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.nodes.Element element29 = element18.wrap("hi!");
        org.jsoup.nodes.Attributes attributes30 = element18.attributes();
        boolean boolean31 = element3.equals((java.lang.Object) element18);
        org.jsoup.nodes.Element element33 = element3.appendElement("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.select.Elements elements35 = element3.getElementsByClass("<#root>\nhi!\n<html>\n <head>\n  <title>#root</title>\n </head>\n <body>\n </body>\n</html>\n</#root>hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(element29);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(elements35);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Element element8 = document1.prependText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValue("<#root>\n</#root>", "hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element13 = document1.removeClass("\n <hi!>\n </hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Node node36 = document9.previousSibling();
        org.jsoup.nodes.Element element37 = document9.nextElementSibling();
        java.lang.String str39 = document9.attr("#root");
        boolean boolean40 = document9.hasText();
        java.util.List<org.jsoup.nodes.Node> nodeList41 = document9.siblingNodes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(nodeList41);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        org.jsoup.select.Elements elements10 = element6.getElementsByTag("#document");
        org.jsoup.nodes.Element element11 = element6.empty();
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        java.lang.String str14 = document13.baseUri();
        org.jsoup.select.Elements elements16 = document13.getElementsByAttribute("hi!");
        java.lang.String str17 = document13.html();
        org.jsoup.nodes.Element element19 = document13.prependText("hi!");
        org.jsoup.nodes.Document document20 = document13.normalise();
        org.jsoup.nodes.Element element22 = document20.wrap("#root");
        org.jsoup.nodes.Element element23 = element6.appendChild((org.jsoup.nodes.Node) document20);
        org.jsoup.nodes.Element element25 = document20.append("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNull(element22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        org.jsoup.nodes.Document document8 = document1.normalise();
        org.jsoup.nodes.Element element10 = document8.wrap("#root");
        org.jsoup.nodes.Element element12 = document8.toggleClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element14 = document8.appendElement("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Element element16 = document8.appendText("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element19 = document8.attr("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;", "<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.jsoup.nodes.Element element20 = document8.empty();
        org.jsoup.select.Elements elements22 = element20.getElementsByIndexLessThan((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document36 = document9.normalise();
        org.jsoup.select.Elements elements38 = document36.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element40 = document36.val("");
        org.jsoup.nodes.Element element42 = document36.val("<#root>\n</#root>");
        org.jsoup.nodes.Element element44 = document36.html("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.select.Elements elements47 = element44.getElementsByAttributeValue("#document", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element49 = element44.removeClass("hi! <html> <head> </head> <body> </body> </html>");
        org.jsoup.nodes.Element element51 = element44.appendText("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(element51);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        java.lang.String str6 = document1.id();
        java.lang.String str8 = document1.attr("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" #document\">\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.select.Elements elements5 = document1.getAllElements();
        org.jsoup.select.Elements elements6 = document1.getAllElements();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element16 = document9.appendElement("hi!");
        org.jsoup.nodes.Element element17 = document9.body();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = element17.text();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNull(element17);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.prependText("hi!");
        java.lang.String str4 = document1.nodeName();
        org.jsoup.select.Elements elements6 = document1.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Attributes attributes7 = document1.attributes();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        java.lang.String str11 = document9.outerHtml();
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        java.lang.String str14 = document13.baseUri();
        org.jsoup.nodes.Element element15 = document9.appendChild((org.jsoup.nodes.Node) document13);
        org.jsoup.nodes.Document document17 = new org.jsoup.nodes.Document("");
        java.lang.String str18 = document17.baseUri();
        org.jsoup.select.Elements elements20 = document17.getElementsByAttribute("hi!");
        java.lang.String str21 = document17.html();
        org.jsoup.parser.Tag tag22 = document17.tag();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element26 = document24.appendText("");
        org.jsoup.nodes.Document document28 = new org.jsoup.nodes.Document("");
        java.lang.String str29 = document28.baseUri();
        java.lang.String str30 = document28.outerHtml();
        org.jsoup.nodes.Document document32 = new org.jsoup.nodes.Document("");
        java.lang.String str33 = document32.baseUri();
        org.jsoup.nodes.Element element34 = document28.appendChild((org.jsoup.nodes.Node) document32);
        boolean boolean35 = element26.equals((java.lang.Object) document32);
        org.jsoup.select.Elements elements37 = document32.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element39 = document32.appendElement("hi!");
        org.jsoup.nodes.Element element41 = element39.prependElement("hi!");
        boolean boolean42 = document17.equals((java.lang.Object) element41);
        org.jsoup.nodes.Element element43 = document9.prependChild((org.jsoup.nodes.Node) document17);
        org.jsoup.nodes.Document document44 = document17.normalise();
        org.jsoup.select.Elements elements46 = document44.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element48 = document44.val("");
        org.jsoup.parser.Tag tag49 = document44.tag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element50 = document1.prependChild((org.jsoup.nodes.Node) document44);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang.NotImplementedException; message: Cannot (yet) move nodes in tree");
        } catch (org.apache.commons.lang.NotImplementedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(tag49);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        // The following exception was thrown during execution in test generation
        try {
            document1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        java.lang.String str7 = element6.id();
        org.jsoup.select.Elements elements8 = element6.children();
        boolean boolean10 = element6.hasAttr("hi!");
        java.lang.String str12 = element6.attr("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.tagName();
        java.lang.String str6 = document1.attr("hi!");
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        boolean boolean10 = document8.hasClass("hi!");
        java.lang.String str11 = document8.className();
        org.jsoup.nodes.Element element13 = document8.html("");
        org.jsoup.select.Elements elements15 = document8.getElementsByIndexEquals((int) '#');
        java.lang.Class<?> wildcardClass16 = document8.getClass();
        boolean boolean17 = document1.equals((java.lang.Object) wildcardClass16);
        org.jsoup.nodes.Document document19 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.parser.Tag tag20 = document19.tag();
        org.jsoup.nodes.Element element21 = document1.prependChild((org.jsoup.nodes.Node) document19);
        org.jsoup.nodes.Element element23 = document1.removeClass("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element26 = element23.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "#document hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element26);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        org.jsoup.nodes.Element element5 = document1.removeClass("");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueNot("hi!", "<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Element element10 = document1.appendElement("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        java.lang.String str12 = document1.absUrl("<#root>\nhi!\n<html>\n <head>\n  <title>#root</title>\n </head>\n <body>\n </body>\n</html>\n</#root>hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.nodes.Node node14 = element3.removeAttr("hi!");
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.nodes.Element element29 = element18.wrap("hi!");
        org.jsoup.nodes.Attributes attributes30 = element18.attributes();
        boolean boolean31 = element3.equals((java.lang.Object) element18);
        java.lang.String str33 = element3.attr("#root");
        org.jsoup.nodes.Element element35 = element3.append("#root");
        org.jsoup.select.Elements elements36 = element35.getAllElements();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(element29);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(elements36);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        org.jsoup.nodes.Document document8 = document1.normalise();
        org.jsoup.nodes.Element element10 = document8.wrap("#root");
        org.jsoup.nodes.Element element12 = document8.toggleClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str13 = document8.data();
        org.jsoup.nodes.Attributes attributes14 = document8.attributes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.tagName();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element8 = document6.appendText("");
        org.jsoup.nodes.Element element9 = document1.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        java.lang.String str12 = document11.baseUri();
        java.lang.String str13 = document11.outerHtml();
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        java.lang.String str16 = document15.baseUri();
        org.jsoup.nodes.Element element17 = document11.appendChild((org.jsoup.nodes.Node) document15);
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        java.lang.String str20 = document19.baseUri();
        org.jsoup.select.Elements elements22 = document19.getElementsByAttribute("hi!");
        java.lang.String str23 = document19.html();
        org.jsoup.parser.Tag tag24 = document19.tag();
        org.jsoup.nodes.Document document26 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element28 = document26.appendText("");
        org.jsoup.nodes.Document document30 = new org.jsoup.nodes.Document("");
        java.lang.String str31 = document30.baseUri();
        java.lang.String str32 = document30.outerHtml();
        org.jsoup.nodes.Document document34 = new org.jsoup.nodes.Document("");
        java.lang.String str35 = document34.baseUri();
        org.jsoup.nodes.Element element36 = document30.appendChild((org.jsoup.nodes.Node) document34);
        boolean boolean37 = element28.equals((java.lang.Object) document34);
        org.jsoup.select.Elements elements39 = document34.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element41 = document34.appendElement("hi!");
        org.jsoup.nodes.Element element43 = element41.prependElement("hi!");
        boolean boolean44 = document19.equals((java.lang.Object) element43);
        org.jsoup.nodes.Element element45 = document11.prependChild((org.jsoup.nodes.Node) document19);
        org.jsoup.nodes.Document document46 = document19.normalise();
        org.jsoup.select.Elements elements48 = document46.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element50 = document46.val("");
        org.jsoup.nodes.Document document52 = new org.jsoup.nodes.Document("");
        java.lang.String str53 = document52.baseUri();
        org.jsoup.select.Elements elements55 = document52.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element57 = document52.val("");
        java.lang.Object obj58 = null;
        boolean boolean59 = element57.equals(obj58);
        boolean boolean60 = element57.hasText();
        java.lang.String[] strArray64 = new java.lang.String[] { "#root", "#root", "#root" };
        java.util.LinkedHashSet<java.lang.String> strSet65 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet65, strArray64);
        org.jsoup.nodes.Element element67 = element57.classNames((java.util.Set<java.lang.String>) strSet65);
        org.jsoup.nodes.Element element68 = document46.classNames((java.util.Set<java.lang.String>) strSet65);
        org.jsoup.nodes.Element element69 = document6.classNames((java.util.Set<java.lang.String>) strSet65);
        org.jsoup.nodes.Attributes attributes70 = document6.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList71 = document6.siblingNodes();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(document46);
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(elements55);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(element67);
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertNotNull(element69);
        org.junit.Assert.assertNotNull(attributes70);
        org.junit.Assert.assertNotNull(nodeList71);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document8 = document1.normalise();
        java.lang.String str9 = document1.title();
        org.jsoup.nodes.Element element11 = document1.val("hi!");
        org.jsoup.nodes.Element element14 = document1.attr("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>", "");
        org.jsoup.nodes.Document document15 = document1.normalise();
        org.jsoup.nodes.Document document17 = new org.jsoup.nodes.Document("");
        java.lang.String str18 = document17.baseUri();
        org.jsoup.select.Elements elements20 = document17.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element22 = document17.val("");
        org.jsoup.nodes.Node node24 = document17.removeAttr("#root");
        org.jsoup.nodes.Element element26 = document17.html("#root");
        org.jsoup.nodes.Element element27 = document1.prependChild((org.jsoup.nodes.Node) element26);
        java.lang.String str28 = element26.text();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#root" + "'", str28, "#root");
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        java.lang.String str10 = element6.absUrl("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element12 = element6.appendText("#document");
        org.jsoup.select.Elements elements15 = element12.getElementsByAttributeValue("<html>\n<head>\n <title></title>\n</head>\n<body>\n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.parser.Tag tag6 = document1.tag();
        org.jsoup.select.Elements elements8 = document1.getElementsByIndexGreaterThan(1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.html();
        org.jsoup.nodes.Element element7 = document1.empty();
        java.lang.String str8 = element7.tagName();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element12 = document10.appendText("");
        java.lang.String str13 = document10.title();
        org.jsoup.nodes.Node node15 = document10.removeAttr("hi!");
        java.lang.String str16 = document10.className();
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        java.lang.String str19 = document18.baseUri();
        org.jsoup.select.Elements elements21 = document18.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element23 = document18.val("");
        org.jsoup.nodes.Element element25 = element23.removeClass("");
        boolean boolean26 = document10.equals((java.lang.Object) element23);
        org.jsoup.nodes.Attributes attributes27 = element23.attributes();
        org.jsoup.nodes.Document document29 = new org.jsoup.nodes.Document("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.util.Set<java.lang.String> strSet30 = document29.classNames();
        org.jsoup.nodes.Element element31 = element23.classNames(strSet30);
        // The following exception was thrown during execution in test generation
        try {
            element7.replaceWith((org.jsoup.nodes.Node) element23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#root" + "'", str8, "#root");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(element31);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Element element4 = document1.body();
        java.lang.String str5 = document1.title();
        java.lang.String str6 = document1.nodeName();
        org.jsoup.nodes.Element element8 = document1.prependText("hi!");
        org.jsoup.select.Elements elements10 = document1.getElementsByIndexEquals(10);
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element14 = document12.appendText("");
        java.lang.String str15 = document12.title();
        org.jsoup.nodes.Element element17 = document12.removeClass("hi!");
        org.jsoup.nodes.Element element19 = element17.removeClass("");
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        java.lang.String str22 = document21.baseUri();
        org.jsoup.select.Elements elements24 = document21.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element26 = document21.val("");
        java.lang.Object obj27 = null;
        boolean boolean28 = element26.equals(obj27);
        boolean boolean29 = element26.hasText();
        java.lang.String[] strArray33 = new java.lang.String[] { "#root", "#root", "#root" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        org.jsoup.nodes.Element element36 = element26.classNames((java.util.Set<java.lang.String>) strSet34);
        org.jsoup.nodes.Element element37 = element19.classNames((java.util.Set<java.lang.String>) strSet34);
        org.jsoup.nodes.Element element38 = document1.classNames((java.util.Set<java.lang.String>) strSet34);
        boolean boolean40 = element38.hasAttr("#document hi!");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<#root>\n</#root>");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Document document4 = document1.normalise();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(document4);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element8 = document1.head();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNull(element8);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        org.jsoup.nodes.Element element11 = element9.appendText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str12 = element11.id();
        org.jsoup.nodes.Element element14 = element11.prependElement("#document");
        org.jsoup.nodes.Element element16 = element14.getElementById("<#root>\n</#root>");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = element16.baseUri();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNull(element16);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element6 = document1.head();
        java.lang.String str7 = document1.nodeName();
        org.jsoup.nodes.Element element9 = document1.append("#document");
        org.jsoup.nodes.Element element10 = document1.head();
        org.jsoup.nodes.Element element12 = document1.createElement("<#root>\nhi!\n<html>\n <head>\n  <title>#root</title>\n </head>\n <body>\n </body>\n</html>\n</#root>hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element3 = document1.getElementById("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str4 = document1.html();
        org.jsoup.select.Elements elements6 = document1.getElementsByIndexLessThan((int) (short) 0);
        org.jsoup.nodes.Element element8 = document1.prependElement("<#root>\n</#root>\n<html>\n<head>\n <title>&lt;#root&gt;\n&lt;/#root&gt;</title>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document1.text("#document");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str4, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Element element37 = document9.createElement("\n<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\">\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element37);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        org.jsoup.nodes.Element element5 = document1.removeClass("");
        org.jsoup.select.Elements elements7 = element5.getElementsByTag("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" #document\">\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        boolean boolean2 = document1.hasText();
        java.lang.String str4 = document1.absUrl("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        java.lang.String str7 = document6.baseUri();
        org.jsoup.select.Elements elements9 = document6.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element11 = document6.val("");
        org.jsoup.nodes.Element element13 = element11.removeClass("");
        org.jsoup.nodes.Element element15 = element11.removeClass("#root");
        org.jsoup.nodes.Element element16 = document1.appendChild((org.jsoup.nodes.Node) element15);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        boolean boolean2 = document1.hasText();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexLessThan(1);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueContaining("hi!", "<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.select.Elements elements11 = document1.getElementsByIndexEquals((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element16 = document9.appendElement("hi!");
        org.jsoup.nodes.Element element17 = document9.empty();
        org.jsoup.nodes.Element element19 = document9.html("#document");
        org.jsoup.nodes.Element element20 = document9.body();
        org.jsoup.nodes.Element element21 = document9.head();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element23 = element21.val("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNull(element20);
        org.junit.Assert.assertNull(element21);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Node node8 = document1.removeAttr("#root");
        java.lang.String str9 = document1.data();
        org.jsoup.nodes.Document document10 = document1.normalise();
        org.jsoup.nodes.Document document11 = document10.normalise();
        java.lang.String str12 = document11.outerHtml();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str12, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.prependText("hi!");
        boolean boolean5 = document1.hasAttr("hi!");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.prependText("hi!");
        java.lang.String str4 = document1.nodeName();
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.nodeName();
        org.jsoup.parser.Tag tag7 = document1.tag();
        org.jsoup.nodes.Element element9 = document1.prepend("hi!");
        java.lang.String str10 = document1.nodeName();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str5, "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#document" + "'", str10, "#document");
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str2 = document1.id();
        org.jsoup.nodes.Element element4 = document1.createElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str5 = document1.outerHtml();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document");
        document1.title("");
        org.jsoup.nodes.Element element5 = document1.prependElement("hi!hi!");
        org.jsoup.parser.Tag tag6 = element5.tag();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        org.jsoup.nodes.Element element11 = element9.appendText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element11.html("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        element13.remove();
        org.jsoup.nodes.Element element15 = element13.empty();
        org.jsoup.nodes.Element element16 = element13.empty();
        org.jsoup.select.Elements elements18 = element13.getElementsByIndexGreaterThan((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Element element2 = document1.body();
        org.jsoup.nodes.Element element4 = document1.appendElement("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" #document\">\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element3 = document1.getElementById("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str4 = document1.html();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueNot("<html>\n <head>\n </head>\n <body>\n </body>\n</html>", "hi! <html> <head> </head> <body> </body> </html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str4, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.html();
        org.jsoup.select.Elements elements8 = document1.getElementsByIndexEquals((int) (short) 10);
        org.jsoup.nodes.Element element10 = document1.prependElement("hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        org.jsoup.nodes.Element element4 = document1.val("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        boolean boolean8 = document6.hasClass("hi!");
        boolean boolean10 = document6.hasClass("hi!");
        org.jsoup.nodes.Element element11 = document6.head();
        boolean boolean12 = document1.equals((java.lang.Object) document6);
        org.jsoup.parser.Tag tag13 = document1.tag();
        java.lang.String str14 = document1.outerHtml();
        java.lang.String str16 = document1.absUrl("hi!\n<html>\n<head>\n <title>#root</title>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        java.lang.String str7 = element6.id();
        boolean boolean8 = element6.isBlock();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element6.child(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element10 = document8.appendText("");
        java.lang.String str11 = element10.text();
        org.jsoup.select.Elements elements13 = element10.getElementsByTag("hi!");
        java.util.Set<java.lang.String> strSet14 = element10.classNames();
        org.jsoup.nodes.Element element15 = element6.appendChild((org.jsoup.nodes.Node) element10);
        org.jsoup.select.Elements elements16 = element15.children();
        org.jsoup.nodes.Element element18 = element15.val("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        org.jsoup.select.Elements elements23 = document20.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element25 = document20.val("");
        document20.setBaseUri("");
        org.jsoup.select.Elements elements30 = document20.getElementsByAttributeValueNot("#root", "<#root>\n</#root>");
        java.lang.String str31 = document20.text();
        boolean boolean32 = element15.equals((java.lang.Object) str31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("#document");
        org.jsoup.nodes.Attributes attributes4 = document1.attributes();
        org.jsoup.nodes.Document document5 = document1.normalise();
        org.jsoup.parser.Tag tag6 = document1.tag();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        java.lang.String str4 = document1.tagName();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        java.lang.String str7 = document6.baseUri();
        org.jsoup.select.Elements elements9 = document6.getElementsByAttribute("hi!");
        java.lang.String str10 = document6.html();
        java.lang.String str12 = document6.attr("");
        java.lang.String str13 = document6.id();
        org.jsoup.nodes.Element element14 = document1.prependChild((org.jsoup.nodes.Node) document6);
        org.jsoup.select.Elements elements16 = element14.getElementsByIndexLessThan((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.val();
        org.jsoup.nodes.Element element3 = document1.body();
        org.jsoup.nodes.Element element4 = document1.parent();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNull(element4);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        org.jsoup.nodes.Element element10 = element9.firstElementSibling();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(element10);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Element element4 = document1.body();
        java.lang.String str5 = document1.title();
        java.lang.String str6 = document1.nodeName();
        org.jsoup.select.Elements elements8 = document1.getElementsByClass("#document");
        java.lang.String str9 = document1.title();
        org.jsoup.select.Elements elements11 = document1.getElementsByIndexGreaterThan(100);
        java.lang.String str12 = document1.title();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        org.jsoup.nodes.Element element10 = element6.addClass("#document");
        org.jsoup.nodes.Element element11 = element6.parent();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNull(element11);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.outerHtml();
        org.jsoup.select.Elements elements8 = document1.getElementsByTag("#document");
        java.lang.String str9 = document1.title();
        java.lang.String str10 = document1.val();
        org.jsoup.nodes.Element element12 = document1.removeClass("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element14 = document1.appendText("\n <hi!>\n </hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        java.lang.String str4 = document1.val();
        java.lang.String str6 = document1.absUrl("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        boolean boolean8 = document1.hasClass("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document2 = document1.normalise();
        org.jsoup.nodes.Document document4 = new org.jsoup.nodes.Document("");
        java.lang.String str5 = document4.baseUri();
        org.jsoup.select.Elements elements7 = document4.getElementsByAttribute("hi!");
        java.lang.String str8 = document4.html();
        org.jsoup.nodes.Element element10 = document4.val("");
        org.jsoup.nodes.Element element12 = document4.prependElement("#root");
        org.jsoup.select.Elements elements14 = document4.getElementsByIndexGreaterThan((int) (short) 1);
        boolean boolean16 = document4.hasClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element18 = document4.removeClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str19 = document4.text();
        // The following exception was thrown during execution in test generation
        try {
            document1.replaceWith((org.jsoup.nodes.Node) document4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document8 = document1.normalise();
        java.lang.String str9 = document1.title();
        org.jsoup.nodes.Element element11 = document1.val("hi!");
        org.jsoup.nodes.Element element13 = document1.val("hi!");
        document1.setBaseUri("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        java.lang.String str3 = document1.absUrl("<#root>\n</#root>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element16 = document9.appendElement("hi!");
        org.jsoup.nodes.Element element18 = element16.prependElement("hi!");
        java.lang.String str20 = element18.attr("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element23 = element18.attr("<#root>\n</#root>", "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element25 = element23.append("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element26 = element23.nextElementSibling();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNull(element26);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        org.jsoup.nodes.Document document8 = document1.normalise();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = document1.select("<#root>\n</#root>\n<html>\n<head>\n <title>&lt;#root&gt;\n&lt;/#root&gt;</title>\n</head>\n<body>\n #document\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <#root>?</#root>?<html>?<head>? <title>&lt;#root&gt;?&lt;/#root&gt;</title>?</head>?<body>? #document?</body>?</html>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document8);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        java.lang.String str36 = document9.val();
        java.lang.String str37 = document9.baseUri();
        org.jsoup.nodes.Element element39 = document9.removeClass("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        java.lang.String str40 = document9.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        org.jsoup.select.Elements elements5 = document1.getAllElements();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueStarting("<#root>\nhi!\n<html>\n <head>\n  <title>#root</title>\n </head>\n <body>\n </body>\n</html>\n</#root>hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "<#root>\n</#root><#root>\n</#root>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Node node36 = document9.previousSibling();
        org.jsoup.parser.Tag tag37 = document9.tag();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNotNull(tag37);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        java.lang.String str7 = document6.baseUri();
        org.jsoup.select.Elements elements9 = document6.getElementsByAttribute("hi!");
        java.lang.String str10 = document6.html();
        org.jsoup.nodes.Element element12 = document6.prependText("hi!");
        java.util.Set<java.lang.String> strSet13 = element12.classNames();
        org.jsoup.nodes.Element element14 = document1.classNames(strSet13);
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.nodes.Element element28 = element14.appendChild((org.jsoup.nodes.Node) element18);
        org.jsoup.nodes.Element element30 = element18.appendText("");
        org.jsoup.select.Elements elements33 = element18.getElementsByAttributeValue("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" #document\">\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>", "#document");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(elements33);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        org.jsoup.nodes.Element element4 = document1.val("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        boolean boolean8 = document6.hasClass("hi!");
        boolean boolean10 = document6.hasClass("hi!");
        org.jsoup.nodes.Element element11 = document6.head();
        boolean boolean12 = document1.equals((java.lang.Object) document6);
        org.jsoup.nodes.Element element13 = document6.empty();
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.prependText("hi!");
        java.lang.String str4 = document1.nodeName();
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.nodeName();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element10 = document8.prependText("hi!");
        java.lang.String str11 = document8.nodeName();
        document8.title("#root");
        org.jsoup.nodes.Element element14 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element16 = document1.addClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element17 = element16.parent();
        org.jsoup.nodes.Element element19 = element16.getElementById("#document");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList20 = element19.childNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str5, "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#document" + "'", str11, "#document");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNull(element17);
        org.junit.Assert.assertNull(element19);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.tagName();
        org.jsoup.nodes.Element element6 = document1.appendElement("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        document1.setBaseUri("#document");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Node node8 = document1.removeAttr("#root");
        java.lang.String str9 = document1.data();
        org.jsoup.nodes.Document document10 = document1.normalise();
        org.jsoup.nodes.Node node12 = document1.removeAttr("#root");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        java.lang.String str8 = document1.id();
        org.jsoup.nodes.Element element10 = document1.removeClass("<#root>\n</#root>");
        java.lang.String str12 = element10.absUrl("hi!");
        org.jsoup.nodes.Element element14 = element10.appendElement("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element16 = element10.html("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.tagName();
        org.jsoup.nodes.Element element6 = document1.appendElement("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        java.lang.String str7 = document1.text();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.nodes.Element element5 = document3.createElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = element5.prependText("#document");
        boolean boolean9 = element7.hasClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = element7.addClass("#document");
        org.jsoup.nodes.Element element13 = element7.prepend("<#root>\n</#root>\n<html>\n<head>\n <title>&lt;#root&gt;\n&lt;/#root&gt;</title>\n</head>\n<body>\n #document\n</body>\n</html>");
        element7.setBaseUri("hi! <html> <head> </head> <body> </body> </html>");
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element2 = document1.empty();
        org.jsoup.select.Elements elements5 = element2.getElementsByAttributeValueContaining("hi!hi!", "hi!");
        java.lang.String str6 = element2.html();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element14 = document9.val("");
        org.jsoup.nodes.Node node16 = document9.removeAttr("#root");
        boolean boolean17 = document1.equals((java.lang.Object) node16);
        java.lang.String str18 = document1.data();
        org.jsoup.select.Elements elements20 = document1.getElementsByIndexGreaterThan((int) (short) 10);
        org.jsoup.nodes.Element element22 = document1.prependText("#root");
        org.jsoup.nodes.Element element24 = element22.append("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" #document\">\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements26 = element22.getElementsByTag("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        java.lang.Object obj7 = null;
        boolean boolean8 = element6.equals(obj7);
        java.lang.String str9 = element6.baseUri();
        org.jsoup.select.Elements elements11 = element6.getElementsByAttribute("hi!");
        java.lang.String str12 = element6.className();
        org.jsoup.nodes.Element element14 = element6.prependElement("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str15 = element14.html();
        org.jsoup.nodes.Element element17 = element14.prependText("#document hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.tagName();
        java.lang.String str6 = document1.attr("hi!");
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        boolean boolean10 = document8.hasClass("hi!");
        java.lang.String str11 = document8.className();
        org.jsoup.nodes.Element element13 = document8.html("");
        org.jsoup.select.Elements elements15 = document8.getElementsByIndexEquals((int) '#');
        java.lang.Class<?> wildcardClass16 = document8.getClass();
        boolean boolean17 = document1.equals((java.lang.Object) wildcardClass16);
        org.jsoup.nodes.Document document19 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.parser.Tag tag20 = document19.tag();
        org.jsoup.nodes.Element element21 = document1.prependChild((org.jsoup.nodes.Node) document19);
        org.jsoup.nodes.Element element23 = document1.createElement("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        java.lang.String str24 = document1.nodeName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#document" + "'", str24, "#document");
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document8 = document1.normalise();
        java.lang.String str9 = document1.title();
        org.jsoup.nodes.Element element11 = document1.val("hi!");
        org.jsoup.nodes.Document document12 = document1.normalise();
        org.jsoup.select.Elements elements15 = document1.getElementsByAttributeValueContaining("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>", "hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document36 = document9.normalise();
        org.jsoup.nodes.Element element37 = document36.lastElementSibling();
        org.jsoup.select.Elements elements39 = element37.getElementsByClass("#root");
        element37.remove();
        org.jsoup.nodes.Element element42 = element37.val("#document hi!");
        org.jsoup.nodes.Element element44 = element42.html("<#root>\n</#root>\n<html>\n<head>\n <title>&lt;#root&gt;\n&lt;/#root&gt;</title>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element44);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.nodes.Node node14 = element3.removeAttr("hi!");
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.nodes.Element element29 = element18.wrap("hi!");
        org.jsoup.nodes.Attributes attributes30 = element18.attributes();
        boolean boolean31 = element3.equals((java.lang.Object) element18);
        java.lang.String str33 = element3.attr("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        java.util.Set<java.lang.String> strSet34 = element3.classNames();
        org.jsoup.select.Elements elements36 = element3.getElementsByClass("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(element29);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertNotNull(elements36);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        boolean boolean4 = document1.hasClass("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.select.Elements elements5 = document1.children();
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.nodes.Node node14 = element3.removeAttr("hi!");
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.nodes.Element element29 = element18.wrap("hi!");
        org.jsoup.nodes.Attributes attributes30 = element18.attributes();
        boolean boolean31 = element3.equals((java.lang.Object) element18);
        org.jsoup.nodes.Element element33 = element3.appendElement("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.select.Elements elements36 = element33.getElementsByAttributeValueNot("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>", "<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        element33.remove();
        org.jsoup.nodes.Element element38 = element33.parent();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(element29);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNull(element38);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Element element4 = document1.body();
        java.lang.String str5 = document1.title();
        java.lang.String str6 = document1.nodeName();
        org.jsoup.nodes.Element element8 = document1.prependText("hi!");
        org.jsoup.select.Elements elements10 = document1.getElementsByIndexEquals(10);
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element14 = document12.appendText("");
        java.lang.String str15 = document12.title();
        org.jsoup.nodes.Element element17 = document12.removeClass("hi!");
        org.jsoup.nodes.Element element19 = element17.removeClass("");
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        java.lang.String str22 = document21.baseUri();
        org.jsoup.select.Elements elements24 = document21.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element26 = document21.val("");
        java.lang.Object obj27 = null;
        boolean boolean28 = element26.equals(obj27);
        boolean boolean29 = element26.hasText();
        java.lang.String[] strArray33 = new java.lang.String[] { "#root", "#root", "#root" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        org.jsoup.nodes.Element element36 = element26.classNames((java.util.Set<java.lang.String>) strSet34);
        org.jsoup.nodes.Element element37 = element19.classNames((java.util.Set<java.lang.String>) strSet34);
        org.jsoup.nodes.Element element38 = document1.classNames((java.util.Set<java.lang.String>) strSet34);
        org.jsoup.nodes.Element element40 = element38.append("<#root>\n</#root><#root>\n</#root>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element40);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.outerHtml();
        boolean boolean8 = document1.hasClass("#root");
        org.jsoup.nodes.Element element10 = document1.createElement("<#root>\nhi!\n<html>\n <head>\n  <title>#root</title>\n </head>\n <body>\n </body>\n</html>\n</#root>hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element6 = document1.head();
        java.lang.String str7 = document1.baseUri();
        org.jsoup.select.Elements elements8 = document1.children();
        org.jsoup.nodes.Element element10 = document1.append("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!");
        java.lang.String str7 = document1.className();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element14 = document9.val("");
        org.jsoup.nodes.Element element16 = element14.removeClass("");
        boolean boolean17 = document1.equals((java.lang.Object) element14);
        org.jsoup.nodes.Element element19 = document1.appendText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element20 = element19.empty();
        org.jsoup.nodes.Element element22 = element20.prepend("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" #document\">\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        java.lang.String str4 = document1.tagName();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        java.lang.String str7 = document6.baseUri();
        org.jsoup.select.Elements elements9 = document6.getElementsByAttribute("hi!");
        java.lang.String str10 = document6.html();
        java.lang.String str12 = document6.attr("");
        java.lang.String str13 = document6.id();
        org.jsoup.nodes.Element element14 = document1.prependChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element16 = document1.prependElement("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element18 = element16.addClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str19 = element18.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>" + "'", str19, "\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.prependText("hi!");
        java.lang.String str4 = document1.nodeName();
        java.lang.String str5 = document1.html();
        document1.setBaseUri("#root");
        boolean boolean8 = document1.hasText();
        boolean boolean9 = document1.hasText();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str5, "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.tagName();
        java.lang.String str6 = document1.attr("hi!");
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        boolean boolean10 = document8.hasClass("hi!");
        java.lang.String str11 = document8.className();
        org.jsoup.nodes.Element element13 = document8.html("");
        org.jsoup.select.Elements elements15 = document8.getElementsByIndexEquals((int) '#');
        java.lang.Class<?> wildcardClass16 = document8.getClass();
        boolean boolean17 = document1.equals((java.lang.Object) wildcardClass16);
        org.jsoup.nodes.Document document19 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.parser.Tag tag20 = document19.tag();
        org.jsoup.nodes.Element element21 = document1.prependChild((org.jsoup.nodes.Node) document19);
        org.jsoup.nodes.Element element23 = document1.createElement("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.jsoup.select.Elements elements26 = element23.getElementsByAttributeValueEnding("\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>", "hi!\n<html>\n<head>\n <title>#root</title>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements26);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        org.jsoup.nodes.Element element11 = element9.appendText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element11.html("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element16 = element11.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "");
        org.jsoup.nodes.Element element17 = element16.empty();
        org.jsoup.nodes.Element element19 = element17.appendElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element21 = element17.html("<#root>\n</#root>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.html();
        org.jsoup.nodes.Element element8 = document1.wrap("hi! #root hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(element8);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        org.jsoup.nodes.Element element6 = document1.html("");
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.nodes.Element element9 = document1.prependElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = element9.addClass("hi! <html> <head> </head> <body> </body> </html>");
        org.jsoup.select.Elements elements13 = element11.getElementsByAttribute("\n<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\">\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Node node15 = document9.previousSibling();
        org.jsoup.nodes.Element element17 = document9.prependElement("#root");
        org.jsoup.parser.Tag tag18 = element17.tag();
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        java.lang.String str23 = document20.html();
        org.jsoup.nodes.Element element24 = element17.prependChild((org.jsoup.nodes.Node) document20);
        org.jsoup.nodes.Element element25 = element24.empty();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element25);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        org.jsoup.nodes.Document document8 = document1.normalise();
        org.jsoup.nodes.Element element10 = document8.wrap("#root");
        org.jsoup.nodes.Element element12 = document8.toggleClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element14 = document8.appendElement("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Element element16 = document8.appendText("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements18 = document8.getElementsByIndexGreaterThan((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Node node15 = document9.previousSibling();
        org.jsoup.nodes.Element element17 = document9.prependElement("#root");
        org.jsoup.parser.Tag tag18 = element17.tag();
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        java.lang.String str23 = document20.html();
        org.jsoup.nodes.Element element24 = element17.prependChild((org.jsoup.nodes.Node) document20);
        org.jsoup.select.Elements elements27 = document20.getElementsByAttributeValueContaining("<#root>\nhi!\n<html>\n <head>\n  <title>#root</title>\n </head>\n <body>\n </body>\n</html>\n</#root>hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "<#document hi!>\n</#document hi!>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements27);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        java.lang.String str8 = document1.id();
        org.jsoup.nodes.Element element10 = document1.removeClass("<#root>\n</#root>");
        java.lang.String str12 = element10.absUrl("hi!");
        org.jsoup.nodes.Element element14 = element10.appendElement("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements17 = element14.getElementsByAttributeValueNot("", "hi! #root hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.tagName();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element8 = document6.appendText("");
        org.jsoup.nodes.Element element9 = document1.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Document document10 = document1.normalise();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(document10);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element16 = document9.appendElement("hi!");
        org.jsoup.nodes.Element element18 = element16.prependElement("hi!");
        org.jsoup.nodes.Element element19 = element18.firstElementSibling();
        org.jsoup.nodes.Node node20 = element18.previousSibling();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.nodes.Element element5 = document3.createElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = element5.prependText("#document");
        boolean boolean9 = element7.hasClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = element7.addClass("#document");
        org.jsoup.nodes.Element element13 = element7.prepend("<#root>\n</#root>\n<html>\n<head>\n <title>&lt;#root&gt;\n&lt;/#root&gt;</title>\n</head>\n<body>\n #document\n</body>\n</html>");
        java.lang.String str14 = element13.className();
        java.lang.String str15 = element13.className();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " #document" + "'", str14, " #document");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " #document" + "'", str15, " #document");
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi! <html> <head> </head> <body> </body> </html>");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.html();
        org.jsoup.select.Elements elements8 = document1.getElementsByIndexEquals((int) (short) 10);
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueStarting("<#document hi!>\n</#document hi!>", "<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" #document\">\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        org.jsoup.select.Elements elements10 = element6.getElementsByTag("#document");
        org.jsoup.nodes.Element element11 = element6.empty();
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        java.lang.String str14 = document13.baseUri();
        org.jsoup.select.Elements elements16 = document13.getElementsByAttribute("hi!");
        java.lang.String str17 = document13.html();
        org.jsoup.nodes.Element element19 = document13.prependText("hi!");
        org.jsoup.nodes.Document document20 = document13.normalise();
        org.jsoup.nodes.Element element22 = document20.wrap("#root");
        org.jsoup.nodes.Element element23 = element6.appendChild((org.jsoup.nodes.Node) document20);
        org.jsoup.select.Elements elements26 = document20.getElementsByAttributeValueContaining("hi!", "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element28 = document20.wrap("hi! #root hi!");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNull(element22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNull(element28);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        org.jsoup.nodes.Element element6 = document1.html("");
        org.jsoup.select.Elements elements8 = document1.getElementsByIndexEquals((int) '#');
        boolean boolean10 = document1.hasAttr("#root");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        java.lang.String str13 = document12.baseUri();
        org.jsoup.select.Elements elements15 = document12.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element17 = document12.val("");
        org.jsoup.nodes.Element element19 = element17.removeClass("");
        element17.setBaseUri("hi!");
        java.util.Set<java.lang.String> strSet22 = element17.classNames();
        org.jsoup.nodes.Element element23 = document1.classNames(strSet22);
        boolean boolean24 = document1.isBlock();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Element element8 = element6.prependElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element8.siblingNodes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        java.lang.String str4 = document1.html();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueContaining("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "\n <hi!>\n </hi!>");
        java.lang.String str10 = document1.outerHtml();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.tagName();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element8 = document6.appendText("");
        org.jsoup.nodes.Element element9 = document1.appendChild((org.jsoup.nodes.Node) document6);
        java.lang.String str11 = element9.attr("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element9.appendElement("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        java.lang.String str16 = document15.baseUri();
        java.lang.String str17 = document15.outerHtml();
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        java.lang.String str20 = document19.baseUri();
        org.jsoup.nodes.Element element21 = document15.appendChild((org.jsoup.nodes.Node) document19);
        org.jsoup.nodes.Document document23 = new org.jsoup.nodes.Document("");
        java.lang.String str24 = document23.baseUri();
        org.jsoup.select.Elements elements26 = document23.getElementsByAttribute("hi!");
        java.lang.String str27 = document23.html();
        org.jsoup.parser.Tag tag28 = document23.tag();
        org.jsoup.nodes.Document document30 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element32 = document30.appendText("");
        org.jsoup.nodes.Document document34 = new org.jsoup.nodes.Document("");
        java.lang.String str35 = document34.baseUri();
        java.lang.String str36 = document34.outerHtml();
        org.jsoup.nodes.Document document38 = new org.jsoup.nodes.Document("");
        java.lang.String str39 = document38.baseUri();
        org.jsoup.nodes.Element element40 = document34.appendChild((org.jsoup.nodes.Node) document38);
        boolean boolean41 = element32.equals((java.lang.Object) document38);
        org.jsoup.select.Elements elements43 = document38.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element45 = document38.appendElement("hi!");
        org.jsoup.nodes.Element element47 = element45.prependElement("hi!");
        boolean boolean48 = document23.equals((java.lang.Object) element47);
        org.jsoup.nodes.Element element49 = document15.prependChild((org.jsoup.nodes.Node) document23);
        java.lang.String str50 = document23.val();
        org.jsoup.nodes.Document document52 = new org.jsoup.nodes.Document("");
        java.lang.String str53 = document52.baseUri();
        org.jsoup.select.Elements elements55 = document52.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element57 = document52.val("");
        java.lang.Object obj58 = null;
        boolean boolean59 = element57.equals(obj58);
        boolean boolean60 = element57.hasText();
        java.lang.String[] strArray64 = new java.lang.String[] { "#root", "#root", "#root" };
        java.util.LinkedHashSet<java.lang.String> strSet65 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet65, strArray64);
        org.jsoup.nodes.Element element67 = element57.classNames((java.util.Set<java.lang.String>) strSet65);
        org.jsoup.nodes.Element element68 = document23.classNames((java.util.Set<java.lang.String>) strSet65);
        org.jsoup.nodes.Element element69 = element9.classNames((java.util.Set<java.lang.String>) strSet65);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(elements55);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(element67);
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertNotNull(element69);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        java.lang.String str6 = document1.outerHtml();
        java.lang.String str7 = document1.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        java.lang.String str2 = document1.outerHtml();
        java.util.Set<java.lang.String> strSet3 = document1.classNames();
        org.jsoup.nodes.Element element5 = document1.appendText("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        java.lang.String str6 = document1.className();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.html();
        org.jsoup.nodes.Element element7 = document1.empty();
        org.jsoup.nodes.Element element9 = element7.appendText("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsByIndexGreaterThan(1);
        org.jsoup.select.Elements elements14 = element9.getElementsByAttributeValue("hi!", "hi!");
        org.jsoup.select.Elements elements15 = element9.getAllElements();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        java.lang.String str2 = document1.outerHtml();
        java.lang.String str4 = document1.attr("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element6 = document1.appendText("");
        boolean boolean7 = element6.hasText();
        org.jsoup.select.Elements elements10 = element6.getElementsByAttributeValueContaining("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;", "#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element6.select("<#root>\n</#root><#root>\n</#root>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <#root>?</#root><#root>?</#root>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element6 = document1.head();
        java.lang.String str7 = document1.title();
        java.lang.String str8 = document1.nodeName();
        java.lang.String str9 = document1.outerHtml();
        org.jsoup.nodes.Element element11 = document1.createElement("<#document hi!>\n</#document hi!>");
        org.jsoup.nodes.Element element13 = document1.prepend("\n <hi!>\n </hi!>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#document" + "'", str8, "#document");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element16 = document9.appendElement("hi!");
        org.jsoup.nodes.Element element18 = element16.prependElement("hi!");
        java.lang.String str20 = element18.attr("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Node node21 = element18.nextSibling();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        org.jsoup.nodes.Element element4 = document1.val("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.util.Set<java.lang.String> strSet5 = document1.classNames();
        org.jsoup.nodes.Element element7 = document1.val("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        boolean boolean9 = document1.hasAttr("");
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.val();
        org.jsoup.nodes.Element element4 = document1.prepend("hi!");
        boolean boolean5 = element4.hasText();
        org.jsoup.nodes.Element element7 = element4.prependElement("\n <hi!>\n </hi!>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Node node8 = document1.removeAttr("#root");
        java.lang.String str9 = document1.data();
        org.jsoup.nodes.Document document10 = document1.normalise();
        document10.title("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.util.Set<java.lang.String> strSet13 = document10.classNames();
        org.jsoup.nodes.Element element14 = document10.body();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document8 = document1.normalise();
        java.lang.String str9 = document1.title();
        org.jsoup.nodes.Element element11 = document1.val("hi!");
        org.jsoup.select.Elements elements13 = document1.getElementsByTag("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str14 = document1.outerHtml();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements17 = document16.children();
        boolean boolean19 = document16.hasClass("");
        java.lang.String str20 = document16.className();
        org.jsoup.select.Elements elements21 = document16.children();
        org.jsoup.nodes.Document document22 = document16.normalise();
        org.jsoup.nodes.Element element23 = document22.head();
        java.lang.String str24 = document22.toString();
        org.jsoup.nodes.Element element25 = document1.appendChild((org.jsoup.nodes.Node) document22);
        java.lang.String str26 = document1.title();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str14, "<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str24, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.nodes.Element element14 = element3.wrap("hi!");
        org.jsoup.nodes.Attributes attributes15 = element3.attributes();
        org.jsoup.nodes.Element element17 = element3.appendElement("#root");
        org.jsoup.nodes.Node node19 = element3.childNode(1);
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        java.lang.String str22 = document21.baseUri();
        org.jsoup.select.Elements elements24 = document21.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element26 = document21.getElementById("hi!");
        org.jsoup.nodes.Element element27 = element3.appendChild((org.jsoup.nodes.Node) document21);
        java.lang.String str28 = document21.title();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNull(element26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        java.lang.String str36 = document9.val();
        java.lang.String str37 = document9.baseUri();
        org.jsoup.nodes.Element element39 = document9.removeClass("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements41 = document9.select("<#root>\n</#root><#root>\n</#root>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <#root>?</#root><#root>?</#root>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(element39);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Element element5 = document1.removeClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element5.childNodes();
        org.jsoup.nodes.Element element8 = element5.getElementById("#document");
        org.jsoup.nodes.Node node10 = element5.removeAttr("hi! #root hi!");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(element8);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.getElementById("hi!");
        java.lang.String str7 = document1.outerHtml();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueEnding("#document", "hi!");
        org.jsoup.nodes.Element element11 = document1.parent();
        org.jsoup.nodes.Element element13 = document1.removeClass("<#root>\n</#root>\n<html>\n<head>\n <title>&lt;#root&gt;\n&lt;/#root&gt;</title>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        java.lang.String str6 = document1.outerHtml();
        boolean boolean8 = document1.hasAttr("<#document hi!>\n</#document hi!>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        java.lang.Object obj7 = null;
        boolean boolean8 = element6.equals(obj7);
        boolean boolean9 = element6.hasText();
        java.lang.String[] strArray13 = new java.lang.String[] { "#root", "#root", "#root" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.jsoup.nodes.Element element16 = element6.classNames((java.util.Set<java.lang.String>) strSet14);
        org.jsoup.nodes.Element element18 = element16.appendText("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements21 = element16.getElementsByAttributeValueStarting("", "<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Node node8 = document1.removeAttr("#root");
        java.lang.String str9 = document1.data();
        org.jsoup.nodes.Document document10 = document1.normalise();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element14 = document12.append("hi!");
        java.lang.String str15 = document12.html();
        org.jsoup.select.Elements elements17 = document12.getElementsByAttribute("hi!");
        java.lang.String str18 = document12.outerHtml();
        boolean boolean19 = document1.equals((java.lang.Object) str18);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        org.jsoup.nodes.Element element4 = document1.val("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str6 = element4.absUrl("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        boolean boolean10 = document8.hasClass("hi!");
        java.lang.String str11 = document8.className();
        org.jsoup.nodes.Element element13 = document8.html("");
        org.jsoup.nodes.Document document14 = document8.normalise();
        org.jsoup.nodes.Element element16 = document8.prependElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str17 = document8.val();
        boolean boolean18 = element4.equals((java.lang.Object) str17);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = element4.childNode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        java.lang.String str7 = document1.title();
        java.lang.String str8 = document1.tagName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#root" + "'", str8, "#root");
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.outerHtml();
        org.jsoup.select.Elements elements8 = document1.getElementsByTag("#document");
        java.lang.String str9 = document1.nodeName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#document" + "'", str9, "#document");
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.prependText("hi!");
        java.lang.String str4 = document1.nodeName();
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.nodeName();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element10 = document8.prependText("hi!");
        java.lang.String str11 = document8.nodeName();
        document8.title("#root");
        org.jsoup.nodes.Element element14 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element16 = document1.addClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element17 = element16.parent();
        org.jsoup.nodes.Element element19 = element16.prependText("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element21 = element19.prepend("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str5, "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#document" + "'", str11, "#document");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Node node15 = document9.previousSibling();
        java.lang.String str16 = document9.nodeName();
        org.jsoup.nodes.Element element18 = document9.prepend("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#document" + "'", str16, "#document");
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        java.lang.Object obj7 = null;
        boolean boolean8 = element6.equals(obj7);
        java.lang.String str9 = element6.baseUri();
        org.jsoup.nodes.Element element11 = element6.append("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = element6.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        org.jsoup.select.Elements elements10 = element6.getElementsByTag("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = element6.child((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document36 = document9.normalise();
        org.jsoup.nodes.Element element37 = document36.lastElementSibling();
        org.jsoup.select.Elements elements39 = element37.getElementsByClass("#root");
        java.util.Set<java.lang.String> strSet40 = element37.classNames();
        boolean boolean42 = element37.hasClass("hi! #root hi!");
        org.jsoup.nodes.Element element44 = element37.prepend("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(element44);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document36 = document9.normalise();
        org.jsoup.nodes.Document document38 = new org.jsoup.nodes.Document("");
        java.lang.String str39 = document38.baseUri();
        org.jsoup.select.Elements elements41 = document38.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element43 = document38.val("");
        org.jsoup.nodes.Element element45 = element43.removeClass("");
        org.jsoup.nodes.Element element46 = document36.appendChild((org.jsoup.nodes.Node) element43);
        org.jsoup.nodes.Element element49 = document36.attr("<#root>\n</#root>", "#root");
        org.jsoup.nodes.Node node51 = document36.removeAttr("\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(node51);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        element7.setBaseUri("hi!");
        java.lang.String str10 = element7.id();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = element7.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        java.lang.String str4 = document1.tagName();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        java.lang.String str7 = document6.baseUri();
        org.jsoup.select.Elements elements9 = document6.getElementsByAttribute("hi!");
        java.lang.String str10 = document6.html();
        java.lang.String str12 = document6.attr("");
        java.lang.String str13 = document6.id();
        org.jsoup.nodes.Element element14 = document1.prependChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element15 = document6.body();
        java.lang.String str17 = document6.attr("\n<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\">\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNull(element15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.getElementById("hi!");
        java.lang.String str7 = document1.outerHtml();
        java.lang.String str8 = document1.baseUri();
        org.jsoup.nodes.Element element10 = document1.html("");
        java.lang.String str11 = document1.outerHtml();
        java.lang.String str12 = document1.val();
        org.jsoup.nodes.Element element13 = document1.empty();
        org.jsoup.nodes.Document document14 = document1.normalise();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(document14);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        java.lang.String str4 = document1.html();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str7 = element6.text();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document36 = document9.normalise();
        org.jsoup.nodes.Document document38 = new org.jsoup.nodes.Document("");
        java.lang.String str39 = document38.baseUri();
        org.jsoup.select.Elements elements41 = document38.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element43 = document38.val("");
        org.jsoup.nodes.Element element45 = element43.removeClass("");
        org.jsoup.nodes.Element element46 = document36.appendChild((org.jsoup.nodes.Node) element43);
        org.jsoup.nodes.Document document48 = new org.jsoup.nodes.Document("");
        java.lang.String str49 = document48.baseUri();
        java.lang.String str50 = document48.outerHtml();
        org.jsoup.parser.Tag tag51 = document48.tag();
        org.jsoup.select.Elements elements53 = document48.getElementsByAttribute("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        element43.replaceWith((org.jsoup.nodes.Node) document48);
        java.lang.String str55 = document48.text();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(tag51);
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.nodes.Element element5 = document3.createElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = element5.prependText("#document");
        boolean boolean9 = element7.hasClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = element7.addClass("#document");
        java.lang.String str12 = element11.text();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        document1.setBaseUri("");
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueNot("#root", "<#root>\n</#root>");
        java.lang.String str12 = document1.text();
        org.jsoup.nodes.Element element14 = document1.prependText("<#root>\n</#root>\n<html>\n<head>\n <title>&lt;#root&gt;\n&lt;/#root&gt;</title>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.jsoup.nodes.Element element16 = document1.val("#document");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.nodes.Document document4 = document1.normalise();
        org.jsoup.select.Elements elements5 = document4.children();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Node node15 = document9.previousSibling();
        org.jsoup.nodes.Element element17 = document9.prependElement("#root");
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        boolean boolean21 = document19.hasClass("hi!");
        java.lang.String str22 = document19.className();
        org.jsoup.nodes.Element element24 = document19.html("");
        org.jsoup.nodes.Document document25 = document19.normalise();
        org.jsoup.nodes.Element element27 = document19.prependElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        document9.replaceWith((org.jsoup.nodes.Node) element27);
        java.util.List<org.jsoup.nodes.Node> nodeList29 = element27.siblingNodes();
        org.jsoup.nodes.Element element31 = element27.html("#document hi!");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNotNull(element31);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        java.lang.Object obj7 = null;
        boolean boolean8 = element6.equals(obj7);
        java.lang.String str9 = element6.baseUri();
        org.jsoup.select.Elements elements11 = element6.getElementsByAttribute("hi!");
        java.lang.String str12 = element6.className();
        org.jsoup.nodes.Element element14 = element6.prependElement("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements16 = element6.getElementsByIndexGreaterThan((-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        org.jsoup.nodes.Element element6 = document1.html("");
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.nodes.Element element9 = document1.prependElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str10 = document1.val();
        org.jsoup.nodes.Element element12 = document1.toggleClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Element element5 = document1.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi! #root hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueStarting("", "\n<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\">\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.prependText("hi!");
        java.lang.String str4 = document1.nodeName();
        org.jsoup.select.Elements elements6 = document1.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        java.lang.String str9 = document8.baseUri();
        java.lang.String str10 = document8.outerHtml();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        java.lang.String str13 = document12.baseUri();
        org.jsoup.nodes.Element element14 = document8.appendChild((org.jsoup.nodes.Node) document12);
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        java.lang.String str17 = document16.baseUri();
        org.jsoup.select.Elements elements19 = document16.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element21 = document16.val("");
        org.jsoup.nodes.Node node23 = document16.removeAttr("#root");
        boolean boolean24 = document8.equals((java.lang.Object) node23);
        org.jsoup.nodes.Element element25 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element27 = document1.prepend("hi!");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Element element8 = document1.prepend("#document");
        java.lang.String str9 = document1.title();
        org.jsoup.parser.Tag tag10 = document1.tag();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueStarting("hi!", "hi!");
        org.jsoup.nodes.Document document10 = document1.normalise();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = document10.childNodes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Element element5 = document1.removeClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element5.childNodes();
        org.jsoup.nodes.Element element9 = element5.attr("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements7 = document1.getElementsByIndexEquals(0);
        org.jsoup.nodes.Element element9 = document1.addClass("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Element element4 = document1.body();
        java.lang.String str5 = document1.title();
        java.lang.String str6 = document1.nodeName();
        org.jsoup.nodes.Element element8 = document1.prependText("hi!");
        org.jsoup.nodes.Element element9 = document1.head();
        boolean boolean11 = document1.equals((java.lang.Object) "hi!hi!");
        org.jsoup.nodes.Element element12 = document1.parent();
        java.lang.String str13 = document1.val();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        java.lang.String str6 = document1.outerHtml();
        boolean boolean7 = document1.hasText();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element14 = document9.val("");
        org.jsoup.nodes.Element element16 = element14.removeClass("");
        org.jsoup.nodes.Element element18 = element14.removeClass("#root");
        java.util.Set<java.lang.String> strSet19 = element14.classNames();
        org.jsoup.nodes.Element element20 = document1.classNames(strSet19);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = document1.childNode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.nodes.Element element5 = document3.createElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = element5.prependText("#document");
        boolean boolean9 = element7.hasClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = element7.addClass("#document");
        org.jsoup.select.Elements elements12 = element7.children();
        org.jsoup.select.Elements elements15 = element7.getElementsByAttributeValueContaining("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" #document\">\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>", "hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.select.Elements elements18 = element7.getElementsByAttributeValueNot("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>", "<html>\n<head>\n <title></title>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element14 = document9.val("");
        org.jsoup.nodes.Node node16 = document9.removeAttr("#root");
        boolean boolean17 = document1.equals((java.lang.Object) node16);
        org.jsoup.nodes.Element element19 = document1.appendText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str20 = element19.val();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        document1.setBaseUri("");
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueNot("#root", "<#root>\n</#root>");
        java.lang.String str12 = document1.text();
        org.jsoup.nodes.Node node14 = document1.removeAttr("<#root>\n</#root>");
        org.jsoup.nodes.Element element16 = document1.toggleClass("hi!hi!");
        org.jsoup.select.Elements elements19 = element16.getElementsByAttributeValue("<#document hi!>\n</#document hi!>", "<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.jsoup.parser.Tag tag20 = element16.tag();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(tag20);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        java.lang.String str4 = document1.tagName();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        java.lang.String str7 = document6.baseUri();
        org.jsoup.select.Elements elements9 = document6.getElementsByAttribute("hi!");
        java.lang.String str10 = document6.html();
        java.lang.String str12 = document6.attr("");
        java.lang.String str13 = document6.id();
        org.jsoup.nodes.Element element14 = document1.prependChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element16 = document1.prependElement("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element18 = element16.addClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element20 = element18.child(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        org.jsoup.nodes.Document document8 = document1.normalise();
        org.jsoup.nodes.Element element10 = document8.wrap("#root");
        org.jsoup.nodes.Element element12 = document8.toggleClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element14 = document8.appendElement("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Element element16 = document8.appendText("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element18 = element16.html("<#root>\n</#root>");
        java.lang.String str19 = element16.text();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<#root>" + "'", str19, "<#root>");
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        java.lang.String str4 = document1.html();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueContaining("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "\n <hi!>\n </hi!>");
        org.jsoup.nodes.Element element10 = document1.head();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNull(element10);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.html();
        org.jsoup.nodes.Element element7 = document1.empty();
        org.jsoup.nodes.Element element9 = element7.appendText("hi!");
        org.jsoup.nodes.Element element11 = element9.toggleClass("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        java.lang.String str14 = document13.baseUri();
        org.jsoup.select.Elements elements16 = document13.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element18 = document13.val("");
        org.jsoup.nodes.Node node20 = document13.removeAttr("#root");
        org.jsoup.nodes.Element element22 = document13.html("#root");
        boolean boolean23 = element9.equals((java.lang.Object) "#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element25 = element9.child((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.val();
        org.jsoup.nodes.Element element4 = document1.prepend("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = document1.childNode((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.nodes.Element element14 = element3.wrap("hi!");
        org.jsoup.nodes.Attributes attributes15 = element3.attributes();
        org.jsoup.nodes.Element element17 = element3.appendElement("#root");
        org.jsoup.nodes.Node node19 = element3.childNode(1);
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        java.lang.String str22 = document21.baseUri();
        org.jsoup.select.Elements elements24 = document21.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element26 = document21.getElementById("hi!");
        org.jsoup.nodes.Element element27 = element3.appendChild((org.jsoup.nodes.Node) document21);
        org.jsoup.nodes.Element element29 = element27.addClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNull(element26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document36 = document9.normalise();
        org.jsoup.nodes.Document document38 = new org.jsoup.nodes.Document("");
        java.lang.String str39 = document38.baseUri();
        org.jsoup.select.Elements elements41 = document38.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element43 = document38.val("");
        org.jsoup.nodes.Element element45 = element43.removeClass("");
        org.jsoup.nodes.Element element46 = document36.appendChild((org.jsoup.nodes.Node) element43);
        org.jsoup.nodes.Document document48 = new org.jsoup.nodes.Document("");
        java.lang.String str49 = document48.baseUri();
        java.lang.String str50 = document48.outerHtml();
        org.jsoup.parser.Tag tag51 = document48.tag();
        org.jsoup.select.Elements elements53 = document48.getElementsByAttribute("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        element43.replaceWith((org.jsoup.nodes.Node) document48);
        java.util.Set<java.lang.String> strSet55 = document48.classNames();
        org.jsoup.select.Elements elements56 = document48.getAllElements();
        org.jsoup.select.Elements elements57 = document48.children();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(tag51);
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertNotNull(strSet55);
        org.junit.Assert.assertNotNull(elements56);
        org.junit.Assert.assertNotNull(elements57);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = element3.text();
        org.jsoup.select.Elements elements6 = element3.getElementsByTag("hi!");
        java.util.Set<java.lang.String> strSet7 = element3.classNames();
        org.jsoup.nodes.Element element9 = element3.removeClass("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element3.select("hi! #root hi!");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query hi! #root hi!");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.parser.Tag tag6 = document1.tag();
        org.jsoup.nodes.Element element7 = document1.empty();
        org.jsoup.select.Elements elements8 = element7.children();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        org.jsoup.nodes.Element element5 = document1.removeClass("");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueNot("hi!", "<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Element element10 = document1.appendElement("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.select.Elements elements13 = element10.getElementsByAttributeValueContaining("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>", "#document");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        element7.setBaseUri("hi!");
        java.lang.String str10 = element7.id();
        java.lang.String str11 = element7.text();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        org.jsoup.nodes.Element element10 = element6.addClass("#document");
        java.lang.String str11 = element10.html();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        java.lang.String str10 = element6.absUrl("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element12 = element6.prependText("<#root>\n</#root>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.nodes.Element element14 = element3.wrap("hi!");
        org.jsoup.nodes.Attributes attributes15 = element3.attributes();
        org.jsoup.nodes.Element element17 = element3.appendElement("#root");
        org.jsoup.nodes.Node node19 = element3.childNode(1);
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        java.lang.String str22 = document21.baseUri();
        org.jsoup.select.Elements elements24 = document21.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element26 = document21.getElementById("hi!");
        org.jsoup.nodes.Element element27 = element3.appendChild((org.jsoup.nodes.Node) document21);
        org.jsoup.nodes.Element element29 = document21.append("");
        java.lang.String str30 = document21.id();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNull(element26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Node node8 = document1.removeAttr("#root");
        java.lang.String str9 = document1.data();
        org.jsoup.select.Elements elements11 = document1.getElementsByIndexLessThan((int) (byte) 100);
        java.lang.String str13 = document1.attr("#root");
        org.jsoup.nodes.Element element14 = document1.head();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = element14.getElementById("\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element7 = document1.addClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element14 = document9.val("");
        org.jsoup.select.Elements elements17 = document9.getElementsByAttributeValueStarting("hi!", "hi!");
        org.jsoup.nodes.Element element18 = document9.head();
        org.jsoup.nodes.Element element19 = document9.parent();
        org.jsoup.select.Elements elements22 = document9.getElementsByAttributeValueNot("#document", "hi!");
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("hi!");
        java.lang.String str25 = document24.outerHtml();
        java.util.Set<java.lang.String> strSet26 = document24.classNames();
        org.jsoup.nodes.Element element27 = document9.classNames(strSet26);
        org.jsoup.nodes.Element element28 = element7.appendChild((org.jsoup.nodes.Node) element27);
        element27.setBaseUri("<html>\n<head>\n <title></title>\n</head>\n<body>\n</body>\n</html>");
        java.util.List<org.jsoup.nodes.Node> nodeList31 = element27.siblingNodes();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNull(element18);
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(nodeList31);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        org.jsoup.nodes.Element element5 = document1.removeClass("");
        org.jsoup.nodes.Element element7 = element5.prependElement("<#root>\n</#root>");
        org.jsoup.select.Elements elements9 = element5.getElementsByTag("<#root>\n</#root>\n<html>\n<head>\n <title>&lt;#root&gt;\n&lt;/#root&gt;</title>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        org.jsoup.nodes.Document document8 = document1.normalise();
        org.jsoup.nodes.Element element10 = document8.wrap("#root");
        org.jsoup.nodes.Element element12 = document8.toggleClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element14 = document8.appendElement("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.select.Elements elements15 = element14.children();
        java.lang.String str16 = element14.tagName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<html> \n <head> \n </head> \n <body>  \n </body>\n</html>" + "'", str16, "<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Element element8 = document5.body();
        java.lang.String str9 = document5.text();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        java.lang.String str11 = document10.baseUri();
        org.jsoup.select.Elements elements13 = document10.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element15 = document10.val("");
        java.lang.Object obj16 = null;
        boolean boolean17 = element15.equals(obj16);
        boolean boolean18 = element15.hasText();
        java.lang.String[] strArray22 = new java.lang.String[] { "#root", "#root", "#root" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        org.jsoup.nodes.Element element25 = element15.classNames((java.util.Set<java.lang.String>) strSet23);
        org.jsoup.nodes.Element element26 = element8.classNames((java.util.Set<java.lang.String>) strSet23);
        boolean boolean27 = element26.hasText();
        org.jsoup.nodes.Element element29 = element26.appendElement("#root");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(element29);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.Class<?> wildcardClass3 = document1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        org.jsoup.nodes.Element element6 = document1.html("");
        org.jsoup.select.Elements elements8 = document1.getElementsByIndexEquals((int) '#');
        boolean boolean10 = document1.hasAttr("#root");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        java.lang.String str13 = document12.baseUri();
        org.jsoup.select.Elements elements15 = document12.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element17 = document12.val("");
        org.jsoup.nodes.Element element19 = element17.removeClass("");
        element17.setBaseUri("hi!");
        java.util.Set<java.lang.String> strSet22 = element17.classNames();
        org.jsoup.nodes.Element element23 = document1.classNames(strSet22);
        org.jsoup.nodes.Element element25 = document1.toggleClass("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element10 = document8.appendText("");
        java.lang.String str11 = element10.text();
        org.jsoup.select.Elements elements13 = element10.getElementsByTag("hi!");
        java.util.Set<java.lang.String> strSet14 = element10.classNames();
        org.jsoup.nodes.Element element15 = element6.appendChild((org.jsoup.nodes.Node) element10);
        org.jsoup.select.Elements elements16 = element15.children();
        org.jsoup.nodes.Element element18 = element15.val("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.jsoup.select.Elements elements20 = element18.getElementsByIndexGreaterThan((int) (byte) 100);
        org.jsoup.nodes.Attributes attributes21 = element18.attributes();
        org.jsoup.nodes.Element element23 = element18.prependElement("<#root>\n</#root>\n<html>\n<head>\n <title>&lt;#root&gt;\n&lt;/#root&gt;</title>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements5 = document1.getElementsByIndexGreaterThan((int) (byte) 0);
        java.util.Set<java.lang.String> strSet6 = document1.classNames();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        org.jsoup.nodes.Element element6 = document1.html("");
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueContaining("<#root>\n</#root>", "<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element11 = document1.head();
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        java.lang.String str14 = document13.baseUri();
        java.lang.String str15 = document13.outerHtml();
        org.jsoup.nodes.Document document17 = new org.jsoup.nodes.Document("");
        java.lang.String str18 = document17.baseUri();
        org.jsoup.nodes.Element element19 = document13.appendChild((org.jsoup.nodes.Node) document17);
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        java.lang.String str22 = document21.baseUri();
        org.jsoup.select.Elements elements24 = document21.getElementsByAttribute("hi!");
        java.lang.String str25 = document21.html();
        org.jsoup.parser.Tag tag26 = document21.tag();
        org.jsoup.nodes.Document document28 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element30 = document28.appendText("");
        org.jsoup.nodes.Document document32 = new org.jsoup.nodes.Document("");
        java.lang.String str33 = document32.baseUri();
        java.lang.String str34 = document32.outerHtml();
        org.jsoup.nodes.Document document36 = new org.jsoup.nodes.Document("");
        java.lang.String str37 = document36.baseUri();
        org.jsoup.nodes.Element element38 = document32.appendChild((org.jsoup.nodes.Node) document36);
        boolean boolean39 = element30.equals((java.lang.Object) document36);
        org.jsoup.select.Elements elements41 = document36.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element43 = document36.appendElement("hi!");
        org.jsoup.nodes.Element element45 = element43.prependElement("hi!");
        boolean boolean46 = document21.equals((java.lang.Object) element45);
        org.jsoup.nodes.Element element47 = document13.prependChild((org.jsoup.nodes.Node) document21);
        org.jsoup.nodes.Document document48 = document21.normalise();
        org.jsoup.nodes.Element element49 = document48.lastElementSibling();
        org.jsoup.select.Elements elements51 = element49.getElementsByClass("#root");
        java.util.Set<java.lang.String> strSet52 = element49.classNames();
        org.jsoup.nodes.Element element53 = element49.lastElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element54 = element11.prependChild((org.jsoup.nodes.Node) element53);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang.NotImplementedException; message: Cannot (yet) move nodes in tree");
        } catch (org.apache.commons.lang.NotImplementedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(elements51);
        org.junit.Assert.assertNotNull(strSet52);
        org.junit.Assert.assertNotNull(element53);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Element element3 = document1.head();
        org.jsoup.select.Elements elements5 = document1.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element7 = document1.prepend("#document");
        org.jsoup.select.Elements elements9 = element7.getElementsByIndexLessThan(100);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.toggleClass("#document");
        org.jsoup.select.Elements elements5 = document1.getElementsByAttribute("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str6 = document1.nodeName();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        java.lang.String str9 = document8.baseUri();
        org.jsoup.select.Elements elements11 = document8.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element13 = document8.val("");
        org.jsoup.nodes.Element element15 = element13.prependElement("#root");
        boolean boolean16 = document1.equals((java.lang.Object) element13);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Node node15 = document9.previousSibling();
        org.jsoup.nodes.Element element17 = document9.prependElement("#root");
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        boolean boolean21 = document19.hasClass("hi!");
        java.lang.String str22 = document19.className();
        org.jsoup.nodes.Element element24 = document19.html("");
        org.jsoup.nodes.Document document25 = document19.normalise();
        org.jsoup.nodes.Element element27 = document19.prependElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        document9.replaceWith((org.jsoup.nodes.Node) element27);
        org.jsoup.nodes.Element element29 = document9.head();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = element29.text();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNull(element29);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!");
        java.lang.String str7 = document1.className();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element14 = document9.val("");
        org.jsoup.nodes.Element element16 = element14.removeClass("");
        boolean boolean17 = document1.equals((java.lang.Object) element14);
        org.jsoup.select.Elements elements19 = document1.getElementsByAttribute("#root");
        org.jsoup.nodes.Document document21 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element23 = document21.prependText("hi!");
        java.lang.String str24 = document21.nodeName();
        org.jsoup.select.Elements elements26 = document21.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Document document28 = new org.jsoup.nodes.Document("");
        java.lang.String str29 = document28.baseUri();
        java.lang.String str30 = document28.outerHtml();
        org.jsoup.nodes.Document document32 = new org.jsoup.nodes.Document("");
        java.lang.String str33 = document32.baseUri();
        org.jsoup.nodes.Element element34 = document28.appendChild((org.jsoup.nodes.Node) document32);
        org.jsoup.nodes.Document document36 = new org.jsoup.nodes.Document("");
        java.lang.String str37 = document36.baseUri();
        org.jsoup.select.Elements elements39 = document36.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element41 = document36.val("");
        org.jsoup.nodes.Node node43 = document36.removeAttr("#root");
        boolean boolean44 = document28.equals((java.lang.Object) node43);
        org.jsoup.nodes.Element element45 = document21.prependChild((org.jsoup.nodes.Node) document28);
        org.jsoup.select.Elements elements46 = element45.getAllElements();
        boolean boolean47 = document1.equals((java.lang.Object) element45);
        org.jsoup.nodes.Node node49 = element45.removeAttr("hi!");
        org.jsoup.nodes.Document document51 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element53 = document51.appendText("");
        org.jsoup.nodes.Document document55 = new org.jsoup.nodes.Document("");
        java.lang.String str56 = document55.baseUri();
        java.lang.String str57 = document55.outerHtml();
        org.jsoup.nodes.Document document59 = new org.jsoup.nodes.Document("");
        java.lang.String str60 = document59.baseUri();
        org.jsoup.nodes.Element element61 = document55.appendChild((org.jsoup.nodes.Node) document59);
        boolean boolean62 = element53.equals((java.lang.Object) document59);
        org.jsoup.nodes.Element element64 = document59.wrap("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element65 = element45.appendChild((org.jsoup.nodes.Node) document59);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang.NotImplementedException; message: Cannot (yet) move nodes in tree");
        } catch (org.apache.commons.lang.NotImplementedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#document" + "'", str24, "#document");
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(element64);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.parser.Tag tag6 = document1.tag();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element10 = document8.appendText("");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        java.lang.String str13 = document12.baseUri();
        java.lang.String str14 = document12.outerHtml();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        java.lang.String str17 = document16.baseUri();
        org.jsoup.nodes.Element element18 = document12.appendChild((org.jsoup.nodes.Node) document16);
        boolean boolean19 = element10.equals((java.lang.Object) document16);
        org.jsoup.select.Elements elements21 = document16.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element23 = document16.appendElement("hi!");
        org.jsoup.nodes.Element element25 = element23.prependElement("hi!");
        boolean boolean26 = document1.equals((java.lang.Object) element25);
        java.lang.String str28 = document1.absUrl("<#root>\n</#root>");
        org.jsoup.select.Elements elements30 = document1.getElementsByAttribute("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Element element32 = document1.appendElement("#document");
        org.jsoup.nodes.Element element33 = element32.empty();
        java.lang.String str34 = element32.id();
        org.jsoup.select.Elements elements37 = element32.getElementsByAttributeValue("hi! #root hi!", "<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(elements37);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.tagName();
        java.lang.String str6 = document1.attr("hi!");
        java.lang.String str7 = document1.nodeName();
        org.jsoup.select.Elements elements8 = document1.children();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Node node15 = document9.previousSibling();
        org.jsoup.nodes.Element element17 = document9.prependElement("#root");
        org.jsoup.parser.Tag tag18 = element17.tag();
        org.jsoup.nodes.Element element20 = element17.addClass("#document hi!");
        org.jsoup.nodes.Element element21 = element20.previousElementSibling();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNull(element21);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document36 = document9.normalise();
        org.jsoup.nodes.Element element37 = document36.lastElementSibling();
        org.jsoup.select.Elements elements38 = element37.getAllElements();
        org.jsoup.nodes.Element element39 = element37.firstElementSibling();
        org.jsoup.nodes.Element element40 = element39.nextElementSibling();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element40);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.tagName();
        java.lang.String str6 = document1.attr("hi!");
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        boolean boolean10 = document8.hasClass("hi!");
        java.lang.String str11 = document8.className();
        org.jsoup.nodes.Element element13 = document8.html("");
        org.jsoup.select.Elements elements15 = document8.getElementsByIndexEquals((int) '#');
        java.lang.Class<?> wildcardClass16 = document8.getClass();
        boolean boolean17 = document1.equals((java.lang.Object) wildcardClass16);
        org.jsoup.nodes.Document document19 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.parser.Tag tag20 = document19.tag();
        org.jsoup.nodes.Element element21 = document1.prependChild((org.jsoup.nodes.Node) document19);
        org.jsoup.nodes.Element element22 = document19.firstElementSibling();
        org.jsoup.select.Elements elements24 = document19.getElementsByIndexLessThan((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNull(element22);
        org.junit.Assert.assertNotNull(elements24);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document36 = document9.normalise();
        org.jsoup.select.Elements elements38 = document36.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element40 = document36.val("");
        java.lang.String str41 = document36.text();
        document36.title("<#root>\n</#root>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.parser.Tag tag4 = document1.tag();
        org.jsoup.select.Elements elements6 = document1.getElementsByAttribute("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Element element8 = document1.append("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document1.removeClass("hi! #root hi!");
        org.jsoup.nodes.Element element12 = document1.text("#root");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        org.jsoup.nodes.Element element5 = document1.removeClass("");
        org.jsoup.nodes.Element element7 = element5.toggleClass("#root");
        org.jsoup.select.Elements elements9 = element5.getElementsByTag("#root");
        java.lang.String str10 = element5.baseUri();
        java.lang.String str11 = element5.baseUri();
        org.jsoup.nodes.Element element13 = element5.prepend("<#root>\n</#root>");
        java.lang.String str14 = element5.data();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Document document3 = document1.normalise();
        java.lang.String str4 = document3.toString();
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((-1));
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str4, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.select.Elements elements9 = element6.getElementsByAttributeValueEnding("<html>\n <head>\n </head>\n <body>\n </body>\n</html>", "hi!");
        org.jsoup.select.Elements elements11 = element6.getElementsByIndexGreaterThan((int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.parser.Tag tag6 = document1.tag();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element10 = document8.appendText("");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        java.lang.String str13 = document12.baseUri();
        java.lang.String str14 = document12.outerHtml();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        java.lang.String str17 = document16.baseUri();
        org.jsoup.nodes.Element element18 = document12.appendChild((org.jsoup.nodes.Node) document16);
        boolean boolean19 = element10.equals((java.lang.Object) document16);
        org.jsoup.select.Elements elements21 = document16.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element23 = document16.appendElement("hi!");
        org.jsoup.nodes.Element element25 = element23.prependElement("hi!");
        boolean boolean26 = document1.equals((java.lang.Object) element25);
        org.jsoup.nodes.Element element27 = element25.previousElementSibling();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(element27);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        java.lang.String str4 = document1.tagName();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        java.lang.String str7 = document6.baseUri();
        org.jsoup.select.Elements elements9 = document6.getElementsByAttribute("hi!");
        java.lang.String str10 = document6.html();
        java.lang.String str12 = document6.attr("");
        java.lang.String str13 = document6.id();
        org.jsoup.nodes.Element element14 = document1.prependChild((org.jsoup.nodes.Node) document6);
        boolean boolean15 = element14.hasText();
        org.jsoup.select.Elements elements17 = element14.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element18 = element14.empty();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element20 = element14.child(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("#root");
        org.jsoup.select.Elements elements7 = document1.getElementsByAttributeValueEnding("#document", "#document");
        org.jsoup.nodes.Element element9 = document1.val("hi!");
        org.jsoup.nodes.Element element11 = document1.prepend("#document");
        org.jsoup.nodes.Element element13 = document1.append("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements15 = document1.getElementsByIndexGreaterThan((int) (byte) 1);
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        org.jsoup.select.Elements elements10 = element6.getElementsByTag("#document");
        org.jsoup.nodes.Element element11 = element6.empty();
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        java.lang.String str14 = document13.baseUri();
        org.jsoup.select.Elements elements16 = document13.getElementsByAttribute("hi!");
        java.lang.String str17 = document13.html();
        org.jsoup.nodes.Element element19 = document13.prependText("hi!");
        org.jsoup.nodes.Document document20 = document13.normalise();
        org.jsoup.nodes.Element element22 = document20.wrap("#root");
        org.jsoup.nodes.Element element23 = element6.appendChild((org.jsoup.nodes.Node) document20);
        org.jsoup.nodes.Element element25 = document20.appendElement("#document hi!");
        java.lang.String str26 = element25.toString();
        org.jsoup.nodes.Node node27 = element25.previousSibling();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNull(element22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<#document hi!>\n</#document hi!>" + "'", str26, "<#document hi!>\n</#document hi!>");
        org.junit.Assert.assertNotNull(node27);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.select("#document");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.select.Elements elements8 = document5.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = document5.val("");
        org.jsoup.nodes.Node node12 = document5.removeAttr("#root");
        java.lang.String str13 = document5.data();
        org.jsoup.nodes.Document document14 = document5.normalise();
        document14.title("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.util.Set<java.lang.String> strSet17 = document14.classNames();
        org.jsoup.nodes.Element element18 = document1.classNames(strSet17);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.outerHtml();
        org.jsoup.select.Elements elements8 = document1.getElementsByTag("#document");
        java.lang.String str9 = document1.title();
        org.jsoup.nodes.Element element10 = document1.parent();
        java.lang.String str12 = document1.absUrl("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        java.lang.String str13 = document1.outerHtml();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.nodes.Node node14 = element3.removeAttr("hi!");
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.nodes.Element element29 = element18.wrap("hi!");
        org.jsoup.nodes.Attributes attributes30 = element18.attributes();
        boolean boolean31 = element3.equals((java.lang.Object) element18);
        org.jsoup.nodes.Element element33 = element3.appendElement("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.select.Elements elements36 = element33.getElementsByAttributeValueNot("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>", "<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        element33.remove();
        org.jsoup.select.Elements elements38 = element33.getAllElements();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(element29);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNotNull(elements38);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        org.jsoup.nodes.Element element11 = element9.appendText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element11.html("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element16 = element11.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "");
        org.jsoup.nodes.Element element18 = element11.appendText("hi!");
        org.jsoup.select.Elements elements19 = element18.getAllElements();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Node node8 = document1.removeAttr("#root");
        java.lang.String str9 = document1.data();
        org.jsoup.select.Elements elements11 = document1.getElementsByIndexLessThan((int) (byte) 100);
        java.lang.String str12 = document1.data();
        org.jsoup.select.Elements elements15 = document1.getElementsByAttributeValueNot("<html>\n <head>\n </head>\n <body>\n </body>\n</html>", "hi! #root hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Attributes attributes4 = element3.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = element3.child((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(attributes4);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.appendText("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        document1.title("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.text(" #document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = document1.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        org.jsoup.nodes.Element element10 = element6.addClass("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = element10.child(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        org.jsoup.nodes.Element element11 = element9.appendText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element11.html("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element16 = element11.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "");
        org.jsoup.nodes.Element element18 = element11.appendText("hi!");
        org.jsoup.select.Elements elements19 = element11.children();
        java.lang.String str20 = element11.data();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document36 = document9.normalise();
        java.util.List<org.jsoup.nodes.Node> nodeList37 = document36.siblingNodes();
        boolean boolean38 = document36.hasText();
        java.util.List<org.jsoup.nodes.Node> nodeList39 = document36.childNodes();
        org.jsoup.nodes.Document document41 = new org.jsoup.nodes.Document("");
        boolean boolean43 = document41.hasClass("hi!");
        java.lang.String str44 = document41.className();
        org.jsoup.nodes.Element element46 = document41.html("");
        org.jsoup.select.Elements elements48 = document41.getElementsByIndexEquals((int) '#');
        boolean boolean50 = document41.hasAttr("#root");
        org.jsoup.nodes.Document document52 = new org.jsoup.nodes.Document("");
        java.lang.String str53 = document52.baseUri();
        org.jsoup.select.Elements elements55 = document52.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element57 = document52.val("");
        org.jsoup.nodes.Element element59 = element57.removeClass("");
        element57.setBaseUri("hi!");
        java.util.Set<java.lang.String> strSet62 = element57.classNames();
        org.jsoup.nodes.Element element63 = document41.classNames(strSet62);
        org.jsoup.nodes.Element element64 = document36.classNames(strSet62);
        org.jsoup.select.Elements elements66 = element64.select(" #document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements68 = element64.select("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query hi!?<html>?<head>?</head>?<body>?</body>?</html>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(elements55);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNotNull(strSet62);
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertNotNull(element64);
        org.junit.Assert.assertNotNull(elements66);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element14 = document9.val("");
        org.jsoup.nodes.Node node16 = document9.removeAttr("#root");
        boolean boolean17 = document1.equals((java.lang.Object) node16);
        java.lang.String str18 = document1.data();
        org.jsoup.nodes.Attributes attributes19 = document1.attributes();
        java.lang.String str20 = document1.outerHtml();
        org.jsoup.nodes.Element element22 = document1.createElement("<#root>\n</#root>\n<html>\n<head>\n <title>&lt;#root&gt;\n&lt;/#root&gt;</title>\n</head>\n<body>\n #document\n</body>\n</html>");
        boolean boolean24 = document1.hasClass("hi! #root hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<#root>\n</#root>" + "'", str20, "<#root>\n</#root>");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Node node15 = document9.previousSibling();
        org.jsoup.nodes.Element element17 = document9.prependElement("#root");
        org.jsoup.parser.Tag tag18 = element17.tag();
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        java.lang.String str23 = document20.html();
        org.jsoup.nodes.Element element24 = element17.prependChild((org.jsoup.nodes.Node) document20);
        org.jsoup.nodes.Element element26 = element24.prepend("\n<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\">\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi! #root hi!");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.parser.Tag tag4 = document1.tag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = document1.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(tag4);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Node node15 = document9.previousSibling();
        org.jsoup.nodes.Element element17 = document9.prependElement("#root");
        java.lang.String str18 = document9.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = document9.childNode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<#root>\n</#root>" + "'", str18, "<#root>\n</#root>");
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        java.lang.String str7 = element6.id();
        java.lang.String str8 = element6.html();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        boolean boolean12 = document10.hasClass("hi!");
        boolean boolean14 = document10.hasClass("hi!");
        java.lang.String str15 = document10.outerHtml();
        boolean boolean16 = document10.hasText();
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        java.lang.String str19 = document18.baseUri();
        org.jsoup.select.Elements elements21 = document18.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element23 = document18.val("");
        org.jsoup.nodes.Element element25 = element23.removeClass("");
        org.jsoup.nodes.Element element27 = element23.removeClass("#root");
        java.util.Set<java.lang.String> strSet28 = element23.classNames();
        org.jsoup.nodes.Element element29 = document10.classNames(strSet28);
        org.jsoup.nodes.Element element30 = element6.classNames(strSet28);
        org.jsoup.select.Elements elements33 = element30.getElementsByAttributeValueContaining("hi! <html> <head> </head> <body> </body> </html>", "#root");
        org.jsoup.nodes.Element element36 = element30.attr("<#document hi!>\n</#document hi!>", "<#root>\nhi!\n<html>\n <head>\n  <title>#root</title>\n </head>\n <body>\n </body>\n</html>\n</#root>hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element38 = element36.child((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(element36);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Node node8 = document1.removeAttr("#root");
        java.lang.String str9 = document1.baseUri();
        org.jsoup.nodes.Element element11 = document1.val("<#document hi!>\n</#document hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.select.Elements elements7 = document1.getAllElements();
        java.lang.String str8 = document1.tagName();
        org.jsoup.nodes.Element element10 = document1.toggleClass("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = element10.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#root" + "'", str8, "#root");
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        java.lang.String str2 = document1.outerHtml();
        java.lang.String str4 = document1.attr("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element6 = document1.appendText("");
        java.lang.String str7 = document1.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        java.lang.String str11 = document9.outerHtml();
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        java.lang.String str14 = document13.baseUri();
        org.jsoup.nodes.Element element15 = document9.appendChild((org.jsoup.nodes.Node) document13);
        org.jsoup.nodes.Document document16 = document9.normalise();
        org.jsoup.nodes.Element element18 = document9.text("#document");
        java.lang.String str19 = document9.html();
        org.jsoup.nodes.Element element20 = document1.appendChild((org.jsoup.nodes.Node) document9);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = document1.childNode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>" + "'", str19, "<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.nodes.Node node14 = element3.removeAttr("hi!");
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.nodes.Element element29 = element18.wrap("hi!");
        org.jsoup.nodes.Attributes attributes30 = element18.attributes();
        boolean boolean31 = element3.equals((java.lang.Object) element18);
        org.jsoup.nodes.Element element32 = element3.parent();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(element29);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(element32);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element16 = document9.appendElement("hi!");
        org.jsoup.nodes.Element element18 = element16.prependElement("hi!");
        org.jsoup.select.Elements elements21 = element18.getElementsByAttributeValueEnding("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        java.lang.String str22 = element18.id();
        org.jsoup.select.Elements elements24 = element18.getElementsByClass("<#root>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(elements24);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("#document");
        org.jsoup.nodes.Attributes attributes4 = document1.attributes();
        org.jsoup.nodes.Document document5 = document1.normalise();
        org.jsoup.nodes.Element element7 = document5.prependElement("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element9 = document5.addClass("hi!");
        org.jsoup.nodes.Element element11 = document5.toggleClass("hi! #root hi!");
        java.lang.String str12 = document5.outerHtml();
        org.jsoup.select.Elements elements13 = document5.getAllElements();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;>\n</hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str12, "<hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;>\n</hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        java.lang.String str4 = document1.tagName();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        java.lang.String str7 = document6.baseUri();
        org.jsoup.select.Elements elements9 = document6.getElementsByAttribute("hi!");
        java.lang.String str10 = document6.html();
        java.lang.String str12 = document6.attr("");
        java.lang.String str13 = document6.id();
        org.jsoup.nodes.Element element14 = document1.prependChild((org.jsoup.nodes.Node) document6);
        boolean boolean15 = element14.hasText();
        java.lang.String str16 = element14.val();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!");
        java.lang.String str7 = document1.className();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element14 = document9.val("");
        org.jsoup.nodes.Element element16 = element14.removeClass("");
        boolean boolean17 = document1.equals((java.lang.Object) element14);
        org.jsoup.nodes.Element element19 = document1.appendText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements21 = document1.getElementsByAttribute("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str22 = document1.html();
        java.lang.String str23 = document1.nodeName();
        java.lang.String str24 = document1.text();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;" + "'", str22, "hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#document" + "'", str23, "#document");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi! <html> <head> </head> <body> </body> </html>" + "'", str24, "hi! <html> <head> </head> <body> </body> </html>");
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("#document");
        org.jsoup.nodes.Attributes attributes4 = document1.attributes();
        org.jsoup.nodes.Document document5 = document1.normalise();
        org.jsoup.nodes.Element element7 = document5.prependElement("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element9 = document5.addClass("hi!");
        org.jsoup.nodes.Element element11 = document5.toggleClass("hi! #root hi!");
        org.jsoup.select.Elements elements13 = document5.getElementsByClass("<#root>\nhi!\n<html>\n <head>\n  <title>#root</title>\n </head>\n <body>\n </body>\n</html>\n</#root>hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        java.lang.String str2 = document1.id();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element6 = document1.head();
        java.lang.String str7 = document1.nodeName();
        org.jsoup.nodes.Element element9 = document1.append("#document");
        org.jsoup.select.Elements elements11 = document1.getElementsByTag("hi! #root hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        java.lang.String str9 = element6.html();
        org.jsoup.nodes.Element element11 = element6.appendText("<#root>\n</#root>\n<html>\n<head>\n <title>&lt;#root&gt;\n&lt;/#root&gt;</title>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.jsoup.select.Elements elements13 = element6.getElementsByTag("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.nodes.Node node14 = element3.removeAttr("hi!");
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.nodes.Element element29 = element18.wrap("hi!");
        org.jsoup.nodes.Attributes attributes30 = element18.attributes();
        boolean boolean31 = element3.equals((java.lang.Object) element18);
        org.jsoup.nodes.Element element33 = element18.html("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element35 = element18.addClass("hi!hi!");
        org.jsoup.nodes.Node node37 = element18.removeAttr("#document hi!");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(element29);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(node37);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!hi!");
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Element element4 = document1.body();
        java.lang.String str5 = document1.title();
        java.lang.String str6 = document1.nodeName();
        org.jsoup.nodes.Element element8 = document1.prependText("hi!");
        org.jsoup.nodes.Element element9 = document1.head();
        org.jsoup.nodes.Element element10 = document1.head();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertNull(element10);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Node node8 = document1.removeAttr("#root");
        java.lang.String str9 = document1.data();
        org.jsoup.nodes.Document document10 = document1.normalise();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = document10.getElementsByAttributeValueNot("hi! #root hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(document10);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        java.lang.Object obj7 = null;
        boolean boolean8 = element6.equals(obj7);
        boolean boolean9 = element6.hasText();
        java.lang.String[] strArray13 = new java.lang.String[] { "#root", "#root", "#root" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.jsoup.nodes.Element element16 = element6.classNames((java.util.Set<java.lang.String>) strSet14);
        org.jsoup.nodes.Element element18 = element16.appendText("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element20 = element16.html("");
        java.lang.String str21 = element20.html();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.nodes.Node node14 = element3.removeAttr("hi!");
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.nodes.Element element29 = element18.wrap("hi!");
        org.jsoup.nodes.Attributes attributes30 = element18.attributes();
        boolean boolean31 = element3.equals((java.lang.Object) element18);
        java.lang.String str33 = element3.attr("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        java.lang.Class<?> wildcardClass34 = element3.getClass();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(element29);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.tagName();
        org.jsoup.nodes.Element element6 = document1.appendElement("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element8 = document1.addClass("\n <hi!>\n </hi!>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        org.jsoup.nodes.Element element11 = element9.appendText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element11.html("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        element13.remove();
        org.jsoup.nodes.Element element16 = element13.removeClass("#root");
        java.lang.String str17 = element13.html();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<html> \n<head> \n</head> \n<body>  \n</body>\n</html>" + "'", str17, "<html> \n<head> \n</head> \n<body>  \n</body>\n</html>");
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        boolean boolean4 = document1.hasAttr("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        boolean boolean5 = document1.isBlock();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document36 = document9.normalise();
        org.jsoup.select.Elements elements38 = document36.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element40 = document36.val("");
        org.jsoup.nodes.Document document42 = new org.jsoup.nodes.Document("");
        java.lang.String str43 = document42.baseUri();
        org.jsoup.select.Elements elements45 = document42.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element47 = document42.val("");
        java.lang.Object obj48 = null;
        boolean boolean49 = element47.equals(obj48);
        boolean boolean50 = element47.hasText();
        java.lang.String[] strArray54 = new java.lang.String[] { "#root", "#root", "#root" };
        java.util.LinkedHashSet<java.lang.String> strSet55 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet55, strArray54);
        org.jsoup.nodes.Element element57 = element47.classNames((java.util.Set<java.lang.String>) strSet55);
        org.jsoup.nodes.Element element58 = document36.classNames((java.util.Set<java.lang.String>) strSet55);
        org.jsoup.nodes.Element element60 = element58.prependText("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element62 = element58.prepend("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" #document\">\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(element60);
        org.junit.Assert.assertNotNull(element62);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element16 = document9.appendElement("hi!");
        org.jsoup.nodes.Element element18 = element16.prependElement("hi!");
        org.jsoup.nodes.Element element19 = element18.firstElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = element19.nextSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNull(element19);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        org.jsoup.select.Elements elements10 = element6.getElementsByTag("#document");
        org.jsoup.select.Elements elements12 = element6.getElementsByAttribute("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element14 = element6.addClass("#root");
        org.jsoup.select.Elements elements15 = element14.children();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element6 = document1.head();
        java.lang.String str7 = document1.title();
        java.lang.String str8 = document1.nodeName();
        org.jsoup.select.Elements elements9 = document1.getAllElements();
        org.jsoup.nodes.Element element11 = document1.append("<hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;>\n</hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = document1.text("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#document" + "'", str8, "#document");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document2 = document1.normalise();
        org.jsoup.nodes.Element element4 = document2.text("<html>\n<head>\n <title></title>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        org.jsoup.nodes.Element element11 = element9.appendText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str12 = element11.id();
        org.jsoup.nodes.Element element14 = element11.prependElement("#document");
        org.jsoup.nodes.Element element16 = element14.getElementById("<#root>\n</#root>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements18 = element16.getElementsByAttribute("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNull(element16);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document36 = document9.normalise();
        org.jsoup.nodes.Document document38 = new org.jsoup.nodes.Document("");
        java.lang.String str39 = document38.baseUri();
        org.jsoup.select.Elements elements41 = document38.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element43 = document38.val("");
        org.jsoup.nodes.Element element45 = element43.removeClass("");
        org.jsoup.nodes.Element element46 = document36.appendChild((org.jsoup.nodes.Node) element43);
        org.jsoup.nodes.Document document48 = new org.jsoup.nodes.Document("");
        java.lang.String str49 = document48.baseUri();
        java.lang.String str50 = document48.outerHtml();
        org.jsoup.parser.Tag tag51 = document48.tag();
        org.jsoup.select.Elements elements53 = document48.getElementsByAttribute("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        element43.replaceWith((org.jsoup.nodes.Node) document48);
        java.util.Set<java.lang.String> strSet55 = document48.classNames();
        org.jsoup.nodes.Document document57 = new org.jsoup.nodes.Document("");
        java.lang.String str58 = document57.baseUri();
        org.jsoup.select.Elements elements60 = document57.getElementsByAttribute("hi!");
        java.lang.String str61 = document57.html();
        org.jsoup.nodes.Element element63 = document57.prependText("hi!");
        java.lang.String str64 = document57.id();
        org.jsoup.select.Elements elements66 = document57.getElementsByClass("#document");
        org.jsoup.nodes.Element element67 = document48.appendChild((org.jsoup.nodes.Node) document57);
        org.jsoup.nodes.Element element69 = document48.html("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.jsoup.nodes.Attributes attributes70 = document48.attributes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(tag51);
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertNotNull(strSet55);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(elements60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(elements66);
        org.junit.Assert.assertNotNull(element67);
        org.junit.Assert.assertNotNull(element69);
        org.junit.Assert.assertNotNull(attributes70);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        org.jsoup.nodes.Element element5 = element3.html("#root");
        org.jsoup.select.Elements elements8 = element3.getElementsByAttributeValueContaining("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "#document");
        org.jsoup.nodes.Element element10 = element3.appendElement("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements13 = element10.getElementsByAttributeValueStarting("<hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;>\n</hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "<html> \n<head> \n</head> \n<body>  \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexLessThan((int) ' ');
        org.jsoup.select.Elements elements16 = document9.getElementsByTag("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document17 = document9.normalise();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(document17);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        org.jsoup.nodes.Element element11 = element9.appendText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str12 = element11.id();
        org.jsoup.nodes.Element element14 = element11.prependElement("#document");
        java.lang.String str16 = element11.absUrl("<#root>\n</#root>");
        org.jsoup.nodes.Element element18 = element11.prepend("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueContaining("hi!", "<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Element element11 = document1.appendElement("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.parser.Tag tag12 = element11.tag();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(tag12);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        org.jsoup.nodes.Element element11 = element9.appendText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element11.html("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        element13.remove();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        java.lang.String str17 = document16.baseUri();
        java.lang.String str18 = document16.outerHtml();
        java.lang.String str19 = document16.tagName();
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        java.lang.String str22 = document21.baseUri();
        org.jsoup.select.Elements elements24 = document21.getElementsByAttribute("hi!");
        java.lang.String str25 = document21.html();
        java.lang.String str27 = document21.attr("");
        java.lang.String str28 = document21.id();
        org.jsoup.nodes.Element element29 = document16.prependChild((org.jsoup.nodes.Node) document21);
        org.jsoup.nodes.Element element31 = document16.prependElement("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements33 = document16.getElementsByIndexEquals((int) ' ');
        org.jsoup.nodes.Element element34 = element13.appendChild((org.jsoup.nodes.Node) document16);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#root" + "'", str19, "#root");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(element34);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        java.lang.String str2 = document1.outerHtml();
        java.lang.String str4 = document1.attr("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element6 = document1.append("hi!");
        java.lang.String str7 = document1.val();
        org.jsoup.select.Elements elements9 = document1.getElementsByIndexEquals((int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element16 = document9.appendElement("hi!");
        org.jsoup.nodes.Element element17 = document9.empty();
        java.lang.String str18 = document9.baseUri();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        org.jsoup.nodes.Element element6 = document1.html("");
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.nodes.Element element9 = document1.prependElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean10 = document1.hasText();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        java.lang.String str11 = document10.baseUri();
        org.jsoup.select.Elements elements13 = document10.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element15 = document10.val("");
        java.lang.Object obj16 = null;
        boolean boolean17 = element15.equals(obj16);
        boolean boolean18 = element15.hasText();
        java.lang.String[] strArray22 = new java.lang.String[] { "#root", "#root", "#root" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        org.jsoup.nodes.Element element25 = element15.classNames((java.util.Set<java.lang.String>) strSet23);
        org.jsoup.nodes.Element element26 = element8.classNames((java.util.Set<java.lang.String>) strSet23);
        org.jsoup.nodes.Element element28 = element8.html("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements29 = element8.children();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(elements29);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document8 = document1.normalise();
        java.lang.String str9 = document1.title();
        org.jsoup.nodes.Element element11 = document1.val("hi!");
        org.jsoup.nodes.Document document12 = document1.normalise();
        org.jsoup.nodes.Element element14 = document12.createElement("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.jsoup.nodes.Element element16 = document12.append("<#root>\n</#root>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element16 = document9.appendElement("hi!");
        org.jsoup.nodes.Element element17 = document9.empty();
        org.jsoup.nodes.Element element19 = document9.html("#document");
        org.jsoup.nodes.Node node20 = element19.nextSibling();
        org.jsoup.select.Elements elements22 = element19.getElementsByAttribute("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element23 = element19.empty();
        org.jsoup.nodes.Document document25 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element27 = document25.appendText("");
        java.lang.String str28 = document25.title();
        org.jsoup.nodes.Node node30 = document25.removeAttr("hi!");
        java.lang.String str31 = document25.className();
        org.jsoup.nodes.Document document33 = new org.jsoup.nodes.Document("");
        java.lang.String str34 = document33.baseUri();
        org.jsoup.select.Elements elements36 = document33.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element38 = document33.val("");
        org.jsoup.nodes.Element element40 = element38.removeClass("");
        boolean boolean41 = document25.equals((java.lang.Object) element38);
        org.jsoup.nodes.Attributes attributes42 = element38.attributes();
        org.jsoup.nodes.Document document44 = new org.jsoup.nodes.Document("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.util.Set<java.lang.String> strSet45 = document44.classNames();
        org.jsoup.nodes.Element element46 = element38.classNames(strSet45);
        org.jsoup.nodes.Element element47 = element23.classNames(strSet45);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(element47);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.nodes.Element element14 = element3.wrap("hi!");
        org.jsoup.nodes.Attributes attributes15 = element3.attributes();
        org.jsoup.nodes.Element element17 = element3.appendElement("#root");
        org.jsoup.nodes.Node node19 = element3.childNode(1);
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        java.lang.String str22 = document21.baseUri();
        org.jsoup.select.Elements elements24 = document21.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element26 = document21.getElementById("hi!");
        org.jsoup.nodes.Element element27 = element3.appendChild((org.jsoup.nodes.Node) document21);
        org.jsoup.nodes.Element element29 = document21.append("");
        org.jsoup.select.Elements elements30 = document21.siblingElements();
        org.jsoup.nodes.Element element32 = document21.createElement("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNull(element26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(element32);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.val();
        org.jsoup.select.Elements elements4 = document1.getElementsByTag("#document");
        java.lang.String str6 = document1.absUrl("hi! <html> <head> </head> <body> </body> </html>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        java.lang.String str4 = document1.tagName();
        org.jsoup.nodes.Element element5 = document1.head();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements9 = document7.getElementsByAttribute("#document");
        org.jsoup.nodes.Attributes attributes10 = document7.attributes();
        org.jsoup.nodes.Document document11 = document7.normalise();
        org.jsoup.select.Elements elements14 = document7.getElementsByAttributeValueStarting("<#root>\n</#root>", "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = element5.prependChild((org.jsoup.nodes.Node) document7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertNull(element5);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        java.lang.String str11 = document10.baseUri();
        org.jsoup.select.Elements elements13 = document10.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element15 = document10.val("");
        java.lang.Object obj16 = null;
        boolean boolean17 = element15.equals(obj16);
        boolean boolean18 = element15.hasText();
        java.lang.String[] strArray22 = new java.lang.String[] { "#root", "#root", "#root" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        org.jsoup.nodes.Element element25 = element15.classNames((java.util.Set<java.lang.String>) strSet23);
        org.jsoup.nodes.Element element26 = element8.classNames((java.util.Set<java.lang.String>) strSet23);
        org.jsoup.nodes.Element element28 = element8.val("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        java.lang.String str10 = document1.text();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        java.lang.String str13 = document12.baseUri();
        org.jsoup.select.Elements elements15 = document12.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element17 = document12.val("");
        java.lang.Object obj18 = null;
        boolean boolean19 = element17.equals(obj18);
        boolean boolean20 = element17.hasText();
        org.jsoup.nodes.Element element21 = document1.prependChild((org.jsoup.nodes.Node) element17);
        org.jsoup.nodes.Element element22 = document1.head();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNull(element22);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document36 = document9.normalise();
        org.jsoup.nodes.Document document38 = new org.jsoup.nodes.Document("");
        java.lang.String str39 = document38.baseUri();
        org.jsoup.select.Elements elements41 = document38.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element43 = document38.val("");
        org.jsoup.nodes.Element element45 = element43.removeClass("");
        org.jsoup.nodes.Element element46 = document36.appendChild((org.jsoup.nodes.Node) element43);
        java.lang.String str47 = element43.text();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("#root");
        org.jsoup.select.Elements elements7 = document1.getElementsByAttributeValueEnding("#document", "#document");
        org.jsoup.nodes.Element element9 = document1.val("hi!");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document11.appendText("");
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        java.lang.String str16 = document15.baseUri();
        java.lang.String str17 = document15.outerHtml();
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        java.lang.String str20 = document19.baseUri();
        org.jsoup.nodes.Element element21 = document15.appendChild((org.jsoup.nodes.Node) document19);
        boolean boolean22 = element13.equals((java.lang.Object) document19);
        org.jsoup.select.Elements elements24 = document19.getElementsByIndexLessThan((int) ' ');
        boolean boolean25 = element9.equals((java.lang.Object) document19);
        org.jsoup.nodes.Document document27 = new org.jsoup.nodes.Document("");
        java.lang.String str28 = document27.baseUri();
        org.jsoup.select.Elements elements30 = document27.getElementsByAttribute("hi!");
        java.lang.String str31 = document27.html();
        org.jsoup.nodes.Element element33 = document27.val("");
        org.jsoup.nodes.Element element35 = document27.prependElement("#root");
        org.jsoup.select.Elements elements37 = element35.getElementsByIndexLessThan((int) '4');
        java.lang.String str38 = element35.tagName();
        org.jsoup.nodes.Document document40 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element42 = document40.appendText("");
        org.jsoup.nodes.Element element43 = document40.body();
        java.lang.String str44 = document40.title();
        java.lang.String str45 = document40.nodeName();
        org.jsoup.nodes.Element element47 = document40.prependText("hi!");
        org.jsoup.nodes.Element element48 = document40.head();
        boolean boolean50 = document40.equals((java.lang.Object) "hi!hi!");
        org.jsoup.nodes.Element element51 = document40.parent();
        boolean boolean52 = element35.equals((java.lang.Object) document40);
        document19.replaceWith((org.jsoup.nodes.Node) element35);
        org.jsoup.select.Elements elements55 = element35.getElementsByIndexLessThan((int) (short) 1);
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "#root" + "'", str38, "#root");
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNull(element43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "#document" + "'", str45, "#document");
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNull(element48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(element51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(elements55);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.toggleClass("#document");
        org.jsoup.select.Elements elements5 = document1.getElementsByAttribute("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements8 = document7.children();
        org.jsoup.select.Elements elements10 = document7.getElementsByAttribute("#root");
        org.jsoup.select.Elements elements13 = document7.getElementsByAttributeValueEnding("#document", "#document");
        org.jsoup.nodes.Element element15 = document7.val("hi!");
        org.jsoup.nodes.Element element17 = document7.prepend("#document");
        // The following exception was thrown during execution in test generation
        try {
            document1.replaceWith((org.jsoup.nodes.Node) document7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        java.lang.String str7 = element6.id();
        java.lang.String str8 = element6.html();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        boolean boolean12 = document10.hasClass("hi!");
        boolean boolean14 = document10.hasClass("hi!");
        java.lang.String str15 = document10.outerHtml();
        boolean boolean16 = document10.hasText();
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        java.lang.String str19 = document18.baseUri();
        org.jsoup.select.Elements elements21 = document18.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element23 = document18.val("");
        org.jsoup.nodes.Element element25 = element23.removeClass("");
        org.jsoup.nodes.Element element27 = element23.removeClass("#root");
        java.util.Set<java.lang.String> strSet28 = element23.classNames();
        org.jsoup.nodes.Element element29 = document10.classNames(strSet28);
        org.jsoup.nodes.Element element30 = element6.classNames(strSet28);
        org.jsoup.select.Elements elements33 = element30.getElementsByAttributeValueContaining("hi! <html> <head> </head> <body> </body> </html>", "#root");
        boolean boolean34 = element30.isBlock();
        java.lang.String str35 = element30.id();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element16 = document9.appendElement("hi!");
        org.jsoup.nodes.Element element17 = document9.empty();
        org.jsoup.nodes.Element element19 = document9.html("#document");
        org.jsoup.nodes.Element element21 = document9.removeClass(" #document");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element6 = document1.head();
        java.lang.String str7 = document1.title();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValue("<#root>\n</#root>", "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element12 = document1.createElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element14 = document1.prependText("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        java.lang.String str15 = element14.val();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Element element8 = document1.prepend("#document");
        org.jsoup.nodes.Element element10 = document1.appendElement(" #document");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.nodes.Element element5 = document3.createElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = element5.prependText("#document");
        boolean boolean9 = element7.hasClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = element7.addClass("#document");
        org.jsoup.nodes.Element element13 = element11.appendText("<#root>\n</#root>");
        org.jsoup.select.Elements elements16 = element11.getElementsByAttributeValueContaining("#document", "<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Node node15 = document9.previousSibling();
        org.jsoup.nodes.Element element17 = document9.prependElement("#root");
        java.lang.String str18 = document9.toString();
        java.lang.String str19 = document9.baseUri();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<#root>\n</#root>" + "'", str18, "<#root>\n</#root>");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        org.jsoup.nodes.Element element6 = document1.html("");
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.nodes.Element element9 = document1.prependElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = element9.addClass("hi! <html> <head> </head> <body> </body> </html>");
        org.jsoup.nodes.Node node12 = element9.nextSibling();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.html();
        org.jsoup.nodes.Element element4 = document1.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = document1.createElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(element4);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        org.jsoup.nodes.Document document8 = document1.normalise();
        org.jsoup.select.Elements elements11 = document8.getElementsByAttributeValueNot("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>", "<html>\n<head>\n <title></title>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = element3.text();
        java.lang.String str5 = element3.data();
        org.jsoup.nodes.Element element7 = element3.wrap("<#root>\n</#root>");
        org.jsoup.select.Elements elements10 = element3.getElementsByAttributeValueStarting("hi! #root hi!", "hi! <html> <head> </head> <body> </body> </html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements7 = document1.getElementsByIndexEquals(0);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element11 = document9.appendText("");
        java.lang.String str12 = document9.title();
        org.jsoup.nodes.Node node14 = document9.removeAttr("hi!");
        java.lang.String str15 = document9.className();
        org.jsoup.select.Elements elements17 = document9.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element18 = document1.appendChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document19 = document1.normalise();
        java.lang.String str20 = document19.tagName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#root" + "'", str20, "#root");
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Node node36 = document9.previousSibling();
        org.jsoup.nodes.Element element37 = document9.nextElementSibling();
        org.jsoup.nodes.Element element39 = element37.prependElement("#document");
        org.jsoup.nodes.Element element41 = element37.removeClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Node node42 = element37.nextSibling();
        org.jsoup.select.Elements elements44 = element37.getElementsByIndexLessThan((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(elements44);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        java.lang.Object obj7 = null;
        boolean boolean8 = element6.equals(obj7);
        java.lang.String str9 = element6.baseUri();
        org.jsoup.select.Elements elements11 = element6.getElementsByAttribute("hi!");
        java.lang.String str12 = element6.className();
        org.jsoup.nodes.Element element14 = element6.toggleClass("#root");
        org.jsoup.nodes.Element element16 = element14.prependText("#document hi!");
        org.jsoup.select.Elements elements19 = element16.getElementsByAttributeValueEnding("hi! #root hi!", "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element21 = element16.prependElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.tagName();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element8 = document6.appendText("");
        org.jsoup.nodes.Element element9 = document1.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        java.lang.String str12 = document11.baseUri();
        java.lang.String str13 = document11.outerHtml();
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        java.lang.String str16 = document15.baseUri();
        org.jsoup.nodes.Element element17 = document11.appendChild((org.jsoup.nodes.Node) document15);
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        java.lang.String str20 = document19.baseUri();
        org.jsoup.select.Elements elements22 = document19.getElementsByAttribute("hi!");
        java.lang.String str23 = document19.html();
        org.jsoup.parser.Tag tag24 = document19.tag();
        org.jsoup.nodes.Document document26 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element28 = document26.appendText("");
        org.jsoup.nodes.Document document30 = new org.jsoup.nodes.Document("");
        java.lang.String str31 = document30.baseUri();
        java.lang.String str32 = document30.outerHtml();
        org.jsoup.nodes.Document document34 = new org.jsoup.nodes.Document("");
        java.lang.String str35 = document34.baseUri();
        org.jsoup.nodes.Element element36 = document30.appendChild((org.jsoup.nodes.Node) document34);
        boolean boolean37 = element28.equals((java.lang.Object) document34);
        org.jsoup.select.Elements elements39 = document34.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element41 = document34.appendElement("hi!");
        org.jsoup.nodes.Element element43 = element41.prependElement("hi!");
        boolean boolean44 = document19.equals((java.lang.Object) element43);
        org.jsoup.nodes.Element element45 = document11.prependChild((org.jsoup.nodes.Node) document19);
        org.jsoup.nodes.Document document46 = document19.normalise();
        org.jsoup.select.Elements elements48 = document46.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element50 = document46.val("");
        org.jsoup.nodes.Document document52 = new org.jsoup.nodes.Document("");
        java.lang.String str53 = document52.baseUri();
        org.jsoup.select.Elements elements55 = document52.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element57 = document52.val("");
        java.lang.Object obj58 = null;
        boolean boolean59 = element57.equals(obj58);
        boolean boolean60 = element57.hasText();
        java.lang.String[] strArray64 = new java.lang.String[] { "#root", "#root", "#root" };
        java.util.LinkedHashSet<java.lang.String> strSet65 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet65, strArray64);
        org.jsoup.nodes.Element element67 = element57.classNames((java.util.Set<java.lang.String>) strSet65);
        org.jsoup.nodes.Element element68 = document46.classNames((java.util.Set<java.lang.String>) strSet65);
        org.jsoup.nodes.Element element69 = document6.classNames((java.util.Set<java.lang.String>) strSet65);
        org.jsoup.nodes.Attributes attributes70 = document6.attributes();
        org.jsoup.select.Elements elements71 = document6.siblingElements();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(document46);
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(elements55);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(element67);
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertNotNull(element69);
        org.junit.Assert.assertNotNull(attributes70);
        org.junit.Assert.assertNotNull(elements71);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element7 = document1.addClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element9 = element7.appendText("");
        org.jsoup.nodes.Element element12 = element9.attr("#document", "#document");
        org.jsoup.select.Elements elements14 = element9.getElementsByIndexGreaterThan((int) (byte) 10);
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        java.lang.String str17 = document16.baseUri();
        org.jsoup.select.Elements elements19 = document16.getElementsByAttribute("hi!");
        java.lang.String str20 = document16.html();
        java.lang.String str21 = document16.html();
        org.jsoup.nodes.Element element22 = document16.empty();
        org.jsoup.nodes.Document document23 = document16.normalise();
        org.jsoup.nodes.Document document25 = new org.jsoup.nodes.Document("");
        boolean boolean27 = document25.hasClass("hi!");
        boolean boolean29 = document25.hasClass("hi!");
        java.lang.String str30 = document25.outerHtml();
        boolean boolean31 = document25.hasText();
        org.jsoup.nodes.Document document33 = new org.jsoup.nodes.Document("");
        java.lang.String str34 = document33.baseUri();
        org.jsoup.select.Elements elements36 = document33.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element38 = document33.val("");
        org.jsoup.nodes.Element element40 = element38.removeClass("");
        org.jsoup.nodes.Element element42 = element38.removeClass("#root");
        java.util.Set<java.lang.String> strSet43 = element38.classNames();
        org.jsoup.nodes.Element element44 = document25.classNames(strSet43);
        org.jsoup.nodes.Element element45 = document23.classNames(strSet43);
        org.jsoup.nodes.Element element46 = element9.prependChild((org.jsoup.nodes.Node) element45);
        java.lang.String str47 = element46.text();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(strSet43);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Attributes attributes4 = element3.attributes();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        java.lang.String str7 = document6.baseUri();
        java.lang.String str8 = document6.outerHtml();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        java.lang.String str11 = document10.baseUri();
        org.jsoup.nodes.Element element12 = document6.appendChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        java.lang.String str15 = document14.baseUri();
        org.jsoup.select.Elements elements17 = document14.getElementsByAttribute("hi!");
        java.lang.String str18 = document14.html();
        org.jsoup.parser.Tag tag19 = document14.tag();
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element23 = document21.appendText("");
        org.jsoup.nodes.Document document25 = new org.jsoup.nodes.Document("");
        java.lang.String str26 = document25.baseUri();
        java.lang.String str27 = document25.outerHtml();
        org.jsoup.nodes.Document document29 = new org.jsoup.nodes.Document("");
        java.lang.String str30 = document29.baseUri();
        org.jsoup.nodes.Element element31 = document25.appendChild((org.jsoup.nodes.Node) document29);
        boolean boolean32 = element23.equals((java.lang.Object) document29);
        org.jsoup.select.Elements elements34 = document29.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element36 = document29.appendElement("hi!");
        org.jsoup.nodes.Element element38 = element36.prependElement("hi!");
        boolean boolean39 = document14.equals((java.lang.Object) element38);
        org.jsoup.nodes.Element element40 = document6.prependChild((org.jsoup.nodes.Node) document14);
        org.jsoup.nodes.Node node41 = document14.previousSibling();
        org.jsoup.nodes.Element element42 = document14.nextElementSibling();
        java.lang.String str44 = document14.attr("#root");
        boolean boolean45 = document14.hasText();
        java.util.List<org.jsoup.nodes.Node> nodeList46 = document14.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element47 = element3.appendChild((org.jsoup.nodes.Node) document14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang.NotImplementedException; message: Cannot (yet) move nodes in tree");
        } catch (org.apache.commons.lang.NotImplementedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(nodeList46);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        java.lang.String str7 = document6.baseUri();
        org.jsoup.select.Elements elements9 = document6.getElementsByAttribute("hi!");
        java.lang.String str10 = document6.html();
        org.jsoup.nodes.Element element12 = document6.prependText("hi!");
        java.util.Set<java.lang.String> strSet13 = element12.classNames();
        org.jsoup.nodes.Element element14 = document1.classNames(strSet13);
        org.jsoup.select.Elements elements16 = element14.getElementsByTag("\n <hi!>\n </hi!>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!");
        java.util.Set<java.lang.String> strSet7 = document1.classNames();
        java.util.Set<java.lang.String> strSet8 = document1.classNames();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttribute("hi! #root hi!");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element10 = document8.appendText("");
        java.lang.String str11 = element10.text();
        org.jsoup.select.Elements elements13 = element10.getElementsByTag("hi!");
        java.util.Set<java.lang.String> strSet14 = element10.classNames();
        org.jsoup.nodes.Element element15 = element6.appendChild((org.jsoup.nodes.Node) element10);
        org.jsoup.select.Elements elements16 = element15.children();
        org.jsoup.nodes.Element element18 = element15.val("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.jsoup.select.Elements elements20 = element18.getElementsByIndexGreaterThan((int) (byte) 100);
        org.jsoup.nodes.Attributes attributes21 = element18.attributes();
        org.jsoup.nodes.Element element23 = element18.append("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Node node8 = document1.removeAttr("#root");
        org.jsoup.nodes.Element element10 = document1.html("#root");
        org.jsoup.nodes.Element element12 = element10.prepend("<#root>\n</#root>");
        java.lang.String str13 = element12.text();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<#root> #root" + "'", str13, "<#root> #root");
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        org.jsoup.select.Elements elements10 = element6.getElementsByTag("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.jsoup.nodes.Element element12 = element6.toggleClass("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element14 = document9.val("");
        org.jsoup.nodes.Node node16 = document9.removeAttr("#root");
        boolean boolean17 = document1.equals((java.lang.Object) node16);
        java.lang.String str18 = document1.data();
        org.jsoup.nodes.Attributes attributes19 = document1.attributes();
        org.jsoup.select.Elements elements21 = document1.getElementsByIndexLessThan((int) (short) 100);
        java.lang.String str22 = document1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<#root>\n</#root>" + "'", str22, "<#root>\n</#root>");
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("\n <hi!>\n </hi!>");
        org.junit.Assert.assertNotNull(elements3);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        java.lang.String str2 = document1.outerHtml();
        java.lang.String str4 = document1.attr("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element6 = document1.appendText("");
        java.lang.String str7 = document1.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        java.lang.String str11 = document9.outerHtml();
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        java.lang.String str14 = document13.baseUri();
        org.jsoup.nodes.Element element15 = document9.appendChild((org.jsoup.nodes.Node) document13);
        org.jsoup.nodes.Document document16 = document9.normalise();
        org.jsoup.nodes.Element element18 = document9.text("#document");
        java.lang.String str19 = document9.html();
        org.jsoup.nodes.Element element20 = document1.appendChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Element element21 = document1.head();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>" + "'", str19, "<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document8 = document1.normalise();
        java.lang.String str9 = document1.title();
        org.jsoup.nodes.Element element11 = document1.val("hi!");
        org.jsoup.nodes.Document document12 = document1.normalise();
        java.lang.String str13 = document1.className();
        org.jsoup.select.Elements elements14 = document1.children();
        // The following exception was thrown during execution in test generation
        try {
            document1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document36 = document9.normalise();
        org.jsoup.nodes.Element element37 = document36.lastElementSibling();
        org.jsoup.select.Elements elements39 = element37.getElementsByClass("#root");
        org.jsoup.parser.Tag tag40 = element37.tag();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(tag40);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str7 = document1.attr("");
        java.lang.String str8 = document1.id();
        org.jsoup.nodes.Node node10 = document1.removeAttr("#document");
        java.lang.String str11 = document1.title();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element3 = document1.val("");
        org.jsoup.nodes.Element element4 = element3.empty();
        org.jsoup.select.Elements elements5 = element4.getAllElements();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.prependText("hi!");
        org.jsoup.parser.Tag tag4 = element3.tag();
        org.jsoup.nodes.Element element6 = element3.appendText("\n <hi!>\n </hi!>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element6 = document1.head();
        java.lang.String str7 = document1.title();
        java.lang.String str8 = document1.nodeName();
        java.lang.String str9 = document1.outerHtml();
        org.jsoup.select.Elements elements10 = document1.getAllElements();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#document" + "'", str8, "#document");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        org.jsoup.nodes.Element element5 = document1.removeClass("");
        org.jsoup.nodes.Element element7 = element5.toggleClass("#root");
        org.jsoup.select.Elements elements9 = element5.getElementsByTag("#root");
        java.lang.String str10 = element5.baseUri();
        element5.setBaseUri("#document hi!");
        org.jsoup.select.Elements elements14 = element5.getElementsByClass("hi!\n<html>\n<head>\n <title>#root</title>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        java.lang.String str9 = element6.html();
        org.jsoup.nodes.Element element11 = element6.appendText("<#root>\n</#root>\n<html>\n<head>\n <title>&lt;#root&gt;\n&lt;/#root&gt;</title>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element11.appendElement("<#root>\n</#root>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element14 = document9.val("");
        org.jsoup.nodes.Node node16 = document9.removeAttr("#root");
        boolean boolean17 = document1.equals((java.lang.Object) node16);
        java.lang.String str18 = document1.data();
        org.jsoup.nodes.Attributes attributes19 = document1.attributes();
        java.lang.String str20 = document1.outerHtml();
        java.lang.String str21 = document1.outerHtml();
        org.jsoup.nodes.Element element22 = document1.empty();
        org.jsoup.nodes.Element element24 = document1.appendText("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        java.lang.String str25 = document1.tagName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<#root>\n</#root>" + "'", str20, "<#root>\n</#root>");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<#root>\n</#root>" + "'", str21, "<#root>\n</#root>");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#root" + "'", str25, "#root");
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueContaining("hi!", "<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        java.lang.Class<?> wildcardClass10 = document1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.tagName();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element8 = document6.appendText("");
        org.jsoup.nodes.Element element9 = document1.appendChild((org.jsoup.nodes.Node) document6);
        java.lang.String str10 = element9.className();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        org.jsoup.nodes.Element element11 = element9.appendText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element11.html("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("<#root>\n</#root>");
        org.jsoup.nodes.Element element16 = element13.appendChild((org.jsoup.nodes.Node) document15);
        org.jsoup.select.Elements elements19 = element16.getElementsByAttributeValueStarting("hi!", "<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexLessThan((int) ' ');
        boolean boolean16 = document9.hasAttr("<#root>\n</#root>");
        org.jsoup.nodes.Document document17 = document9.normalise();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(document17);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        org.jsoup.nodes.Element element6 = document1.html("");
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        java.lang.String str14 = document9.html();
        org.jsoup.nodes.Element element15 = document9.empty();
        org.jsoup.nodes.Element element17 = element15.appendText("hi!");
        java.util.Set<java.lang.String> strSet18 = element15.classNames();
        boolean boolean19 = document7.equals((java.lang.Object) strSet18);
        org.jsoup.nodes.Element element21 = document7.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str22 = document7.nodeName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#document" + "'", str22, "#document");
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document8 = document1.normalise();
        org.jsoup.nodes.Element element10 = document1.text("#document");
        document1.title("<#root>\n</#root>");
        org.jsoup.nodes.Node node14 = document1.removeAttr("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Element element15 = document1.body();
        org.jsoup.select.Elements elements16 = element15.children();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Node node8 = document1.removeAttr("#root");
        java.lang.String str9 = document1.data();
        org.jsoup.nodes.Document document10 = document1.normalise();
        java.lang.String str11 = document10.className();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.nodeName();
        java.lang.String str7 = document1.outerHtml();
        org.jsoup.nodes.Element element9 = document1.appendElement("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.select.Elements elements11 = element9.getElementsByTag("<#root>\n</#root>");
        org.jsoup.nodes.Attributes attributes12 = element9.attributes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        org.jsoup.nodes.Element element4 = document1.val("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        boolean boolean8 = document6.hasClass("hi!");
        boolean boolean10 = document6.hasClass("hi!");
        org.jsoup.nodes.Element element11 = document6.head();
        boolean boolean12 = document1.equals((java.lang.Object) document6);
        java.util.Set<java.lang.String> strSet13 = document1.classNames();
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.nodes.Node node14 = element3.removeAttr("hi!");
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.nodes.Element element29 = element18.wrap("hi!");
        org.jsoup.nodes.Attributes attributes30 = element18.attributes();
        boolean boolean31 = element3.equals((java.lang.Object) element18);
        org.jsoup.nodes.Element element33 = element3.appendElement("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element34 = element3.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element36 = element34.addClass("#root");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(element29);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNull(element34);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element6 = document1.head();
        java.lang.String str7 = document1.title();
        java.lang.String str8 = document1.nodeName();
        org.jsoup.select.Elements elements9 = document1.getAllElements();
        org.jsoup.nodes.Element element11 = document1.append("<hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;>\n</hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element12 = document1.body();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#document" + "'", str8, "#document");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document36 = document9.normalise();
        org.jsoup.nodes.Element element37 = document36.lastElementSibling();
        org.jsoup.select.Elements elements39 = element37.getElementsByClass("#root");
        java.util.Set<java.lang.String> strSet40 = element37.classNames();
        org.jsoup.nodes.Element element41 = element37.lastElementSibling();
        java.lang.String str42 = element41.tagName();
        org.jsoup.nodes.Element element44 = element41.wrap("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "#root" + "'", str42, "#root");
        org.junit.Assert.assertNotNull(element44);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag(" #document");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document36 = document9.normalise();
        org.jsoup.nodes.Document document38 = new org.jsoup.nodes.Document("");
        java.lang.String str39 = document38.baseUri();
        org.jsoup.select.Elements elements41 = document38.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element43 = document38.val("");
        org.jsoup.nodes.Element element45 = element43.removeClass("");
        org.jsoup.nodes.Element element46 = document36.appendChild((org.jsoup.nodes.Node) element43);
        org.jsoup.nodes.Document document48 = new org.jsoup.nodes.Document("");
        java.lang.String str49 = document48.baseUri();
        java.lang.String str50 = document48.outerHtml();
        org.jsoup.parser.Tag tag51 = document48.tag();
        org.jsoup.select.Elements elements53 = document48.getElementsByAttribute("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        element43.replaceWith((org.jsoup.nodes.Node) document48);
        java.util.Set<java.lang.String> strSet55 = document48.classNames();
        org.jsoup.select.Elements elements56 = document48.getAllElements();
        java.lang.String str57 = document48.title();
        org.jsoup.nodes.Element element59 = document48.html("<html>\n<head>\n <title></title>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(tag51);
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertNotNull(strSet55);
        org.junit.Assert.assertNotNull(elements56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(element59);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        org.jsoup.nodes.Element element11 = element9.appendText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element11.html("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element16 = element11.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "");
        org.jsoup.select.Elements elements18 = element16.getElementsByAttribute("<#root>\n</#root>");
        org.jsoup.nodes.Element element19 = element16.previousElementSibling();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNull(element19);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        org.jsoup.nodes.Element element9 = document1.html("#document");
        java.lang.String str10 = element9.className();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }
}

